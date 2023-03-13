# cxf-xjc-utils 
 
# Bad smells
I found 113 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 27 | false |
| SystemOutErr | 22 | false |
| ZeroLengthArrayInitialization | 8 | false |
| DuplicateExpressions | 7 | false |
| DataFlowIssue | 6 | false |
| IgnoreResultOfCall | 5 | false |
| ThrowablePrintStackTrace | 5 | false |
| PublicFieldAccessedInSynchronizedContext | 4 | false |
| AssignmentToMethodParameter | 4 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UnnecessaryToStringCall | 2 | true |
| StringEqualsEmptyString | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| ConstantValue | 2 | false |
| WhileCanBeForeach | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| BoundedWildcard | 1 | false |
| RedundantSuppression | 1 | false |
| UnnecessaryBoxing | 1 | false |
| Convert2Lambda | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `javadoc` may produce `NullPointerException`
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
        String getterMethod = getGetterMethod();
        JMethod getter = MethodHelper.findMethod(classOutline, getterMethod);
        JDocComment javadoc = getter.javadoc();
        if (javadoc.size() != 0) {
            documentation = "\n<p>\n" + documentation;
```

### DataFlowIssue
Method invocation `fullName` may produce `NullPointerException`
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
                List<JAnnotationUse> toRemove = new ArrayList<JAnnotationUse>();
                for (JAnnotationUse j : annotations) {
                    if (XmlSchemaType.class.getName().equals(getAnnotationClass(j).fullName())) {
                        JAnnotationValue st = getAnnotationMember(j, "name");
                        StringWriter sw = new StringWriter();
```

### DataFlowIssue
Method invocation `generate` may produce `NullPointerException`
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
                        JAnnotationValue st = getAnnotationMember(j, "name");
                        StringWriter sw = new StringWriter();
                        st.generate(new JFormatter(sw));
                        if ("\"anySimpleType\"".equals(sw.toString())) {
                            if (field.type().fullName().startsWith("java.util.List")) {
```

### DataFlowIssue
Method invocation `toExternalForm` may produce `NullPointerException`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                        if (resolved.startsWith("classpath:")) {
                            url = loader.getResource(resolved.substring("classpath:".length()));
                            iSource.setSystemId(url.toExternalForm());
                        } else {
                            url = new URL(resolved);
```

### DataFlowIssue
Variable is already assigned to this value
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
                .arg(qn.getPrefix());
        } else if ("javax.xml.datatype.Duration".equals(typeName)) {
            dv = null;
        } else if (type instanceof JDefinedClass) {
            JDefinedClass cls = (JDefinedClass)type;
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File file : files) {
                deleteDir(file);
            }
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `boolean/src/main/java/org/apache/cxf/xjc/bgi/BooleanGetAndIsPlugin.java`
#### Snippet
```java
        
        Iterator<Entry<String, JType>> todo = methodsToAdd.entrySet().iterator();
        while (todo.hasNext()) {
            Entry<String, JType> entry = todo.next();
            String newName = "get" + entry.getKey().substring(2);
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelLoaderClass` from instance context
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                    }
                }
                modelLoaderClass = cc.toClass();
            } catch (Throwable t) {
                try {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelLoaderClass` from instance context
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
            } catch (Throwable t) {
                try {
                    modelLoaderClass = Class.forName("com.sun.tools.xjc.ModelLoader");
                } catch (ClassNotFoundException e) {
                    //ignore
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `line.substring(line.indexOf(' ')).trim()`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                    || line.startsWith("ERROR: ")
                    || line.startsWith("WARNING: ")) {
                    file = new File(line.substring(line.indexOf(' ')).trim());
                    String type = line.substring(0, line.indexOf(':'));
                    if (type.contains("ERROR")) {
```

### DuplicateExpressions
Multiple occurrences of `Integer.parseInt(line.substring(line.indexOf(' ')).trim())`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                    message.setLength(0);
                } else if (line.startsWith("Col: ")) {
                    column = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else if (line.startsWith("Line: ")) {
                    linenum = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
```

### DuplicateExpressions
Multiple occurrences of `line.substring(line.indexOf(' ')).trim()`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                    message.setLength(0);
                } else if (line.startsWith("Col: ")) {
                    column = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else if (line.startsWith("Line: ")) {
                    linenum = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
```

### DuplicateExpressions
Multiple occurrences of `Integer.parseInt(line.substring(line.indexOf(' ')).trim())`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                    column = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else if (line.startsWith("Line: ")) {
                    linenum = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else if (line.startsWith("Severity: ")) {
                    severity = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
```

### DuplicateExpressions
Multiple occurrences of `line.substring(line.indexOf(' ')).trim()`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                    column = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else if (line.startsWith("Line: ")) {
                    linenum = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else if (line.startsWith("Severity: ")) {
                    severity = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
```

### DuplicateExpressions
Multiple occurrences of `Integer.parseInt(line.substring(line.indexOf(' ')).trim())`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                    linenum = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else if (line.startsWith("Severity: ")) {
                    severity = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else {
                    message.append(line).append('\n');
```

### DuplicateExpressions
Multiple occurrences of `line.substring(line.indexOf(' ')).trim()`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                    linenum = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else if (line.startsWith("Severity: ")) {
                    severity = Integer.parseInt(line.substring(line.indexOf(' ')).trim());
                } else {
                    message.append(line).append('\n');
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`javadoc.size() != 0` can be replaced with '!javadoc.isEmpty()'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
        JMethod getter = MethodHelper.findMethod(classOutline, getterMethod);
        JDocComment javadoc = getter.javadoc();
        if (javadoc.size() != 0) {
            documentation = "\n<p>\n" + documentation;
        }
```

### SizeReplaceableByIsEmpty
`propertyInfo.javadoc.length() > 0` can be replaced with '!propertyInfo.javadoc.isEmpty()'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
            return;
        }
        if (propertyInfo.javadoc.length() > 0) {
            return; // JAXB binding customization overwrites xsd:documentation
        }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuffer msg` can be replaced with 'String'
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java

        if (exitCode != 0) {
            StringBuffer msg = new StringBuffer("\nExit code: ");
            msg.append(exitCode);
            msg.append('\n');
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                            if (bangIdx > 0) {
                                ref = lsi.substring(0, bangIdx + 1)
                                        + new URI(lsi.substring(bangIdx + 1)).resolve(new URI(relativeRef)).toString();
                            } else {
                                ref = relativeRef;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                URI uri = mapLocation(cp);
                if (uri != null) {
                    b.append(uri.toString()).append(' ');
                }
            }
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `x`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                    urls.add(file.getAbsoluteFile().toURI().toURL());
                }
                x++;
            }
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends JMethod`
in `boolean/src/main/java/org/apache/cxf/xjc/bgi/BooleanGetAndIsPlugin.java`
#### Snippet
```java
    }
    
    private boolean requiresGetter(Collection<JMethod> methods, JMethod method) {
        String newName = "get" + method.name().substring(2);
        // Check if already exists.
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/JavadocInserter.java`
#### Snippet
```java
        XSComponent schemaComponent = enumOutline.target.getSchemaComponent();
        String documentation = XSComponentHelper.getDocumentation(schemaComponent);
        if (documentation == null || "".equals(documentation)) {
            return;
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java

        String documentation = XSComponentHelper.getDocumentation(component);
        if (documentation == null || "".equals(documentation.trim())) {
            return;
        }
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `modelLoaderClass` accessed in synchronized context
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java

    private synchronized Class<?> getModelLoaderClass() {
        if (modelLoaderClass == null) {
            try {
                ClassPool pool = ClassPool.getDefault();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `modelLoaderClass` accessed in synchronized context
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                    }
                }
                modelLoaderClass = cc.toClass();
            } catch (Throwable t) {
                try {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `modelLoaderClass` accessed in synchronized context
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
            } catch (Throwable t) {
                try {
                    modelLoaderClass = Class.forName("com.sun.tools.xjc.ModelLoader");
                } catch (ClassNotFoundException e) {
                    //ignore
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `modelLoaderClass` accessed in synchronized context
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
            }
        }
        return modelLoaderClass;
    }
    
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        return false;
    }
    public boolean hasDelta(@SuppressWarnings("rawtypes") List relpaths) {
        return false;
    }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
        
        File outputDirFile = new File(outputDir);
        outputDirFile.mkdirs();
        markerDirectory.mkdirs();

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
        File outputDirFile = new File(outputDir);
        outputDirFile.mkdirs();
        markerDirectory.mkdirs();

        boolean result = true;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                            int i = run(xsdOptions[x], xsdFile, outputDir);
                            if (i == 0) {
                                doneFile.delete();
                                doneFile.createNewFile();
                            }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                            if (i == 0) {
                                doneFile.delete();
                                doneFile.createNewFile();
                            }
                            File[] dirs = xsdOptions[x].getDeleteDirs();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
        }

        file.delete();
        return 0;
    }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        
        if ("java.lang.Boolean".equals(typeName) && isElement) {
            dv = JExpr.direct(Boolean.valueOf(defaultValue) ? "Boolean.TRUE" : "Boolean.FALSE");
        } else if ("java.lang.Byte".equals(typeName) && isElement) {
            dv = JExpr._new(type)
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    }
    public void addWarning(File file, int line, int column, String message, Throwable cause) {
        System.out.println("WARNING: " + file.getAbsolutePath());
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    public void addWarning(File file, int line, int column, String message, Throwable cause) {
        System.out.println("WARNING: " + file.getAbsolutePath());
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
        System.out.println(message);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.out.println("WARNING: " + file.getAbsolutePath());
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
        System.out.println(message);
        if (cause != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
        System.out.println(message);
        if (cause != null) {
            cause.printStackTrace(System.out);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.out.println(message);
        if (cause != null) {
            cause.printStackTrace(System.out);
        }
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
            cause.printStackTrace(System.out);
        }
        System.out.println();
        System.out.println("DONE");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        }
        System.out.println();
        System.out.println("DONE");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    @Override
    public void addError(File file, int line, int column, String message, Throwable cause) {
        System.err.println("ERROR: " + file.getAbsolutePath());
        System.err.println("Line: " + line);
        System.err.println("Col: " + column);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    public void addError(File file, int line, int column, String message, Throwable cause) {
        System.err.println("ERROR: " + file.getAbsolutePath());
        System.err.println("Line: " + line);
        System.err.println("Col: " + column);
        System.err.println(message);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.err.println("ERROR: " + file.getAbsolutePath());
        System.err.println("Line: " + line);
        System.err.println("Col: " + column);
        System.err.println(message);
        if (cause != null) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.err.println("Line: " + line);
        System.err.println("Col: " + column);
        System.err.println(message);
        if (cause != null) {
            cause.printStackTrace(System.err);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.err.println(message);
        if (cause != null) {
            cause.printStackTrace(System.err);
        }
        System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
            cause.printStackTrace(System.err);
        }
        System.err.println();
        System.err.println("DONE");
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        }
        System.err.println();
        System.err.println("DONE");
    }
    public void addMessage(File file, int line, int column, String message, int severity, Throwable cause) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    }
    public void addMessage(File file, int line, int column, String message, int severity, Throwable cause) {
        System.out.println("MSG: " + file.getAbsolutePath());
        System.out.println("Severity: " + severity);
        System.out.println("Line: " + line);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    public void addMessage(File file, int line, int column, String message, int severity, Throwable cause) {
        System.out.println("MSG: " + file.getAbsolutePath());
        System.out.println("Severity: " + severity);
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.out.println("MSG: " + file.getAbsolutePath());
        System.out.println("Severity: " + severity);
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
        System.out.println(message);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.out.println("Severity: " + severity);
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
        System.out.println(message);
        if (cause != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
        System.out.println(message);
        if (cause != null) {
            cause.printStackTrace(System.out);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.out.println(message);
        if (cause != null) {
            cause.printStackTrace(System.out);
        }
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
            cause.printStackTrace(System.out);
        }
        System.out.println();
        System.out.println("DONE");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        }
        System.out.println();
        System.out.println("DONE");
    }
    public void removeMessages(File file) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.sun.tools.xjc` is unnecessary, and can be replaced with an import
in `ts/src/main/java/org/apache/cxf/xjc/ts/ToStringPlugin.java`
#### Snippet
```java
    }

    public int parseArgument(Options opt, String[] args, int index, com.sun.tools.xjc.Plugin plugin) 
        throws BadCommandLineException, IOException {
        int ret = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.tools.xjc` is unnecessary, and can be replaced with an import
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
    }

    public int parseArgument(Options opt, String[] args, int index, com.sun.tools.xjc.Plugin plugin) 
        throws BadCommandLineException, IOException {
        int ret = 0;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `property-listener/src/main/java/org/apache/cxf/xjc/property_listener/PropertyListenerPlugin.java`
#### Snippet
```java
                        } catch (Throwable t) {
                            //ignore
                            t.printStackTrace();
                        }
                    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
        } catch (Throwable t) {
            //ignore for now
            t.printStackTrace();
        }
        return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
        } catch (Throwable t) {
            //ignore for now
            t.printStackTrace();
        }
        return Collections.emptyList();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
        } catch (Throwable t) {
            //ignore for now
            t.printStackTrace();
        }
        return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
            listener.error("Failed to create model", e);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `pluginArtifacts` are queried, but never updated
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "plugin.artifacts", readonly = true, required = true)
    private List<Artifact> pluginArtifacts;    

    abstract String getOutputDir();
```

### MismatchedCollectionQueryUpdate
Contents of collection `extensions` are queried, but never updated
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> extensions;
    
       
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                throw new MojoExecutionException("Error, xsdDir \"" + xsdDir + "\" does not exist.");
            }  
            String[] fileList = dir.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `s`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCErrorListener.java`
#### Snippet
```java
        if (s != null && s.startsWith("file:")) {
            if (s.contains("#")) {
                s = s.substring(0, s.indexOf('#'));
            }
            try {
```

### AssignmentToMethodParameter
Assignment to method parameter `object`
in `runtime/src/main/java/org/apache/cxf/xjc/runtime/JAXBToStringBuilder.java`
#### Snippet
```java
        }
        if (object instanceof Collection) {
            object = ((Collection<?>) object).toArray();
        }
        return ToStringBuilder.reflectionToString(object, style);        
```

### AssignmentToMethodParameter
Assignment to method parameter `documentation`
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
        JDocComment javadoc = getter.javadoc();
        if (javadoc.size() != 0) {
            documentation = "\n<p>\n" + documentation;
        }
        javadoc.add(javadoc.size(), documentation); // add comment as last
```

### AssignmentToMethodParameter
Assignment to method parameter `xsType`
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        } else if ("byte[]".equals(type.fullName()) && xsType.isSimpleType() && isElement) {
            while (!"anySimpleType".equals(xsType.getBaseType().getName())) {
                xsType = xsType.getBaseType();
            }
            if ("base64Binary".equals(xsType.getName())) {
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-13-06-04-49.227.html`
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
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/MethodHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XsdOption.java`
#### Snippet
```java
            return bindingFiles.get(0);
        }
        return null;
    }
    public void setBindingFile(String bf) {
```

### ReturnNull
Return of `null`
in `runtime/src/main/java/org/apache/cxf/xjc/runtime/DataTypeAdapter.java`
#### Snippet
```java
    public static String printTime(Date dt) {
        if (dt == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
```

### ReturnNull
Return of `null`
in `runtime/src/main/java/org/apache/cxf/xjc/runtime/DataTypeAdapter.java`
#### Snippet
```java
    public static Date parseDate(String s) {
        if (s == null) {
            return null;
        }
        return DatatypeConverter.parseDate(s).getTime();
```

### ReturnNull
Return of `null`
in `runtime/src/main/java/org/apache/cxf/xjc/runtime/DataTypeAdapter.java`
#### Snippet
```java
    public static String printDateTime(Date dt) {
        if (dt == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
```

### ReturnNull
Return of `null`
in `runtime/src/main/java/org/apache/cxf/xjc/runtime/DataTypeAdapter.java`
#### Snippet
```java
    public static Date parseTime(String s) {
        if (s == null) {
            return null;
        }
        return DatatypeConverter.parseTime(s).getTime();
```

### ReturnNull
Return of `null`
in `runtime/src/main/java/org/apache/cxf/xjc/runtime/DataTypeAdapter.java`
#### Snippet
```java
    public static Date parseDateTime(String s) {
        if (s == null) {
            return null;
        }
        return DatatypeConverter.parseDateTime(s).getTime();
```

### ReturnNull
Return of `null`
in `runtime/src/main/java/org/apache/cxf/xjc/runtime/DataTypeAdapter.java`
#### Snippet
```java
    public static String printDate(Date dt) {
        if (dt == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
```

### ReturnNull
Return of `null`
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
            return ((XSAttributeUse)schemaComponent).getDecl();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/XSComponentHelper.java`
#### Snippet
```java
    public static String getDocumentation(XSComponent schemaComponent) {
        if (schemaComponent == null) {
            return null;
        }
        XSAnnotation xsAnnotation = schemaComponent.getAnnotation();
```

### ReturnNull
Return of `null`
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/XSComponentHelper.java`
#### Snippet
```java
        XSAnnotation xsAnnotation = schemaComponent.getAnnotation();
        if (xsAnnotation == null) {
            return null;
        }
        BindInfo annotation = (BindInfo)xsAnnotation.getAnnotation();
```

### ReturnNull
Return of `null`
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/XSComponentHelper.java`
#### Snippet
```java
        BindInfo annotation = (BindInfo)xsAnnotation.getAnnotation();
        if (annotation == null) {
            return null;
        }
        return annotation.getDocumentation();
```

### ReturnNull
Return of `null`
in `property-listener/src/main/java/org/apache/cxf/xjc/property_listener/PropertyListenerPlugin.java`
#### Snippet
```java
            //ignore
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
            Map<String, JAnnotationValue> memberValues = (Map<String, JAnnotationValue>)f.get(ju);
            if (memberValues == null) {
                return null;
            }
            return memberValues.get(name);
```

### ReturnNull
Return of `null`
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
            t.printStackTrace();
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
            t.printStackTrace();
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    }
    public Scanner newScanner(File basedir) {
        return null;
    }
    public Scanner newDeleteScanner(File basedir) {
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    }
    public Scanner newDeleteScanner(File basedir) {
        return null;
    }
    public Scanner newScanner(File basedir, boolean ignoreDelta) {
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    }
    public Object getValue(String key) {
        return null;
    }
    public void addWarning(File file, int line, int column, String message, Throwable cause) {
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java

    public OutputStream newFileOutputStream(File file) throws IOException {
        return null;
    }
    public Scanner newScanner(File basedir) {
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
    }
    public Scanner newScanner(File basedir, boolean ignoreDelta) {
        return null;
    }
    public boolean isIncremental() {
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                    final String resolved = getResolvedEntity(publicId, systemId);
                    if (resolved == null) {
                        return null;
                    }
                    InputSource iSource = new InputSource((systemId != null) ? systemId : resolved);
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                    } catch (Exception e) {
                        listener.warning(xsdFile, e);
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                l.debug("Could not find a file for " + s);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
                    return atts.getValue("schemaLocation");
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        String defaultValue = xmlDefaultValue == null ? null : xmlDefaultValue.value;
        if (defaultValue == null) {
            return null;
        }

```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer msg` may be declared as 'StringBuilder'
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java

        if (exitCode != 0) {
            StringBuffer msg = new StringBuffer("\nExit code: ");
            msg.append(exitCode);
            msg.append('\n');
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
        }

        try (URLClassLoader loader = new URLClassLoader(urls.toArray(new URL[0]),
                                                      this.getClass().getClassLoader())) {
            final CatalogManager cm = new CatalogManager();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
                            + fo.getPropertyInfo().getName(true);

        JMethod method = dc.getMethod(getterName, new JType[0]);
        JDocComment doc = method.javadoc();
        int mods = method.mods().getValue();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        String getterName = "get" + fo.getPropertyInfo().getName(true);

        JMethod method = dc.getMethod(getterName, new JType[0]);
        JDocComment doc = method.javadoc();
        int mods = method.mods().getValue();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        String getterName = ("java.lang.Boolean".equals(typeName) ? "is" : "get")
                            + fo.getPropertyInfo().getName(true);
        JMethod method = dc.getMethod(getterName, new JType[0]);
        JType mtype = method.type();
        String setterName = "set" + fo.getPropertyInfo().getName(true);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        method.body().assign(fr, var);
        
        JMethod oldMethod = dc.getMethod("unset" + fo.getPropertyInfo().getName(true), new JType[0]);
        if (oldMethod != null) {
            dc.methods().remove(oldMethod);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        method.body().assign(fr, JExpr._null());
        
        method = dc.getMethod("isSet" + fo.getPropertyInfo().getName(true), new JType[0]);
        if (method != null) {
            //move to end
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
        if (!newCp.isEmpty()) {
            Thread.currentThread()
                .setContextClassLoader(new URLClassLoader(newCp.toArray(new URL[0]),
                                                          Thread.currentThread().getContextClassLoader()));
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
        }

        return list.toArray(new String[0]);
        
    }
```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`args[index].indexOf(":optional") != -1` can be replaced with 'args\[index\].contains(":optional")'
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        if (args[index].startsWith("-Xdv")) {
            ret = 1;                    
            if (args[index].indexOf(":optional") != -1) {
                complexTypes = true;
            }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `file != null` is always `true`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCErrorListener.java`
#### Snippet
```java
        final String sysId = exception.getSystemId();
        File file = mapFile(sysId);
        if (file != null && !errorfiles.contains(file)) {
            buildContext.removeMessages(file);
            errorfiles.add(file);
```

### ConstantValue
Condition `file != null` is always `true`
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCErrorListener.java`
#### Snippet
```java
    public void warning(SAXParseException exception) {
        File file = mapFile(exception.getSystemId());
        if (file != null && !errorfiles.contains(file)) {
            buildContext.removeMessages(file);
            errorfiles.add(file);
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java

            for (URL url : urls) {
                opt.classpaths.add(url);
            }
            if (checkXmlElementRef()) {
```

