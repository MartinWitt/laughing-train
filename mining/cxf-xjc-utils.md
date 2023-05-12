# cxf-xjc-utils 
 
# Bad smells
I found 54 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 10 | false |
| JavadocLinkAsPlainText | 10 | false |
| DuplicateExpressions | 7 | false |
| DataFlowIssue | 6 | false |
| IgnoreResultOfCall | 5 | false |
| ConstantValue | 4 | false |
| DuplicatedCode | 3 | false |
| JavadocDeclaration | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| JavaReflectionInvocation | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| StringBufferReplaceableByString | 1 | false |
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param classOutline` tag description is missing
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/MethodHelper.java`
#### Snippet
```java
     * Find method in given class with given method name
     * 
     * @param classOutline
     * @param methodName
     * @return method in given class with given method name
```

### JavadocDeclaration
`@param methodName` tag description is missing
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/MethodHelper.java`
#### Snippet
```java
     * 
     * @param classOutline
     * @param methodName
     * @return method in given class with given method name
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `classOutline` may be 'final'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
    private Options options;

    private ClassOutline classOutline;

    private FieldOutline fieldOutline;
```

### FieldMayBeFinal
Field `codeModel` may be 'final'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
public class PropertyJavadoc {

    private JCodeModel codeModel;

    private Options options;
```

### FieldMayBeFinal
Field `fieldOutline` may be 'final'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
    private ClassOutline classOutline;

    private FieldOutline fieldOutline;

    public PropertyJavadoc(JCodeModel codeModel, Options options, ClassOutline classOutline,
```

### FieldMayBeFinal
Field `options` may be 'final'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
    private JCodeModel codeModel;

    private Options options;

    private ClassOutline classOutline;
```

### FieldMayBeFinal
Field `plugin` may be 'final'
in `bug671/src/main/java/org/apache/cxf/xjc/bug671/Bug671Plugin.java`
#### Snippet
```java
 */
public class Bug671Plugin {
    private Plugin plugin;

    public Bug671Plugin(Plugin p) {
```

### FieldMayBeFinal
Field `impl` may be 'final'
in `javadoc/src/main/java/com/sun/tools/xjc/addon/dpytel/javadoc/JavadocPlugin.java`
#### Snippet
```java
public class JavadocPlugin extends Plugin {

    private org.apache.cxf.xjc.javadoc.JavadocPlugin impl = new org.apache.cxf.xjc.javadoc.JavadocPlugin();

    /*
```

### FieldMayBeFinal
Field `options` may be 'final'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/JavadocInserter.java`
#### Snippet
```java

    private Outline outline;
    private Options options;

    public JavadocInserter(Outline outline, Options opt, ErrorHandler errorHandler) {
```

### FieldMayBeFinal
Field `outline` may be 'final'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/JavadocInserter.java`
#### Snippet
```java
public class JavadocInserter {

    private Outline outline;
    private Options options;

```

### FieldMayBeFinal
Field `message` may be 'final'
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
            int linenum;
            int column;
            StringBuilder message = new StringBuilder();
            
            public void consumeLine(String line) {
```

### FieldMayBeFinal
Field `buildContext` may be 'final'
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCErrorListener.java`
#### Snippet
```java

public class XJCErrorListener extends ErrorReceiver {
    private BuildContext buildContext;
    private final List<File> errorfiles = new ArrayList<File>();
    private Exception firstError;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `extensions` are queried, but never updated
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> extensions;
    
       
```

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

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'ErrorReceiver'
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
            return (Model)getModelLoaderClass()
                .getMethod("load", Options.class, JCodeModel.class, ErrorReceiver.class)
                .invoke(null, opt, new JCodeModel(), listener);
        } catch (Exception e) {
            listener.error("Failed to create model", e);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XJCBuildContext.java`
#### Snippet
```java
        System.out.println("Line: " + line);
        System.out.println("Col: " + column);
        System.out.println(message);
        if (cause != null) {
            cause.printStackTrace(System.out);
        }
        System.out.println();
        System.out.println("DONE");
```

### DuplicatedCode
Duplicated code
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        if (LOG.isLoggable(Level.FINE)) {
            LOG.fine("Updating getter: " + getterName);
        }
        // remove existing method and define new one

        dc.methods().remove(method);

        method = dc.method(mods, mtype, getterName);
        method.javadoc().append(doc);

        JFieldRef fr = JExpr.ref(fieldName);
```

### DuplicatedCode
Duplicated code
in `dv/src/main/java/org/apache/cxf/xjc/dv/DefaultValuePlugin.java`
#### Snippet
```java
        String fieldName = fo.getPropertyInfo().getName(false);
        JType type = fo.getRawType();
        String typeName = type.fullName();

        String getterName = ("java.lang.Boolean".equals(typeName) ? "is" : "get")
                            + fo.getPropertyInfo().getName(true);

        JMethod method = dc.getMethod(getterName, new JType[0]);
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/XSDToJavaRunner.java`
#### Snippet
```java
            }
            
            protected String findExternalResource(String nsURI, String localName, Attributes atts) {
                if ("http://www.w3.org/2001/XMLSchema".equals(nsURI)
                    && ("import".equals(localName) || "include".equals(localName))) {
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
in `cxf-xjc-plugin/src/main/java/org/apache/cxf/maven_plugin/AbstractXSDToJavaMojo.java`
#### Snippet
```java
                URI uri = mapLocation(cp);
                if (uri != null) {
                    b.append(uri.toString()).append(' ');
                }
            }
```

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

## RuleId[id=ConstantValue]
### ConstantValue
Value `schemaComponent` is always 'null'
in `javadoc/src/main/java/org/apache/cxf/xjc/javadoc/PropertyJavadoc.java`
#### Snippet
```java
        if (schemaComponent instanceof XSParticle) {
            return ((XSParticle)schemaComponent).getTerm();
        } else if (schemaComponent instanceof XSAttributeUse) {
            return ((XSAttributeUse)schemaComponent).getDecl();
        } else {
```

### ConstantValue
Condition `target != null` is always `false`
in `property-listener/src/main/java/org/apache/cxf/xjc/property_listener/PropertyListenerPlugin.java`
#### Snippet
```java
                        }
                    }
                    if (target != null) {
                        try {
                            String targetName = getName(target);
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `bug671/src/main/java/org/apache/cxf/xjc/bug671/Bug671Plugin.java`
#### Snippet
```java
/**
 * Modifies the JAXB code model to handle package naming that run into:
 * https://jaxb.dev.java.net/issues/show_bug.cgi?id=671
 */
public class Bug671Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `boolean/src/main/java/com/sun/tools/xjc/addon/apache_cxf/bgi/BooleanGetAndIsPlugin.java`
#### Snippet
```java
/**
 * Thin wrapper around the BooleanGetAndIsPlugin. This must be in the com.sun.tools.xjc.addon package for it to
 * work with Java 6. See https://issues.apache.org/jira/browse/CXF-1880.
 */
public class BooleanGetAndIsPlugin extends Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `boolean/src/main/java/com/sun/tools/xjc/addon/apache_cxf/bg/BooleanGetterPlugin.java`
#### Snippet
```java
/**
 * Thin wrapper around the BooleanGetterPlugin. This must be in the com.sun.tools.xjc.addon package for it to
 * work with Java 6. See https://issues.apache.org/jira/browse/CXF-1880.
 */
public class BooleanGetterPlugin extends Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `javadoc/src/main/java/com/sun/tools/xjc/addon/dpytel/javadoc/JavadocPlugin.java`
#### Snippet
```java
/**
 * Thin wrapper around the DefaultValuePlugin. This must be in the com.sun.tools.xjc.addon package for it to
 * work with Java 6. See https://issues.apache.org/jira/browse/CXF-1880.
 */
public class JavadocPlugin extends Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `bug671/src/main/java/com/sun/tools/xjc/addon/apache_cxf/bug671/Bug671Plugin.java`
#### Snippet
```java
/**
 * Thin wrapper around the Bug671Plugin. This must be in the com.sun.tools.xjc.addon package
 * for it to work with Java 6. See https://issues.apache.org/jira/browse/CXF-1880.
 */
public class Bug671Plugin extends Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `dv/src/main/java/com/sun/tools/xjc/addon/apache_cxf/dv/DefaultValuePlugin.java`
#### Snippet
```java
/**
 * Thin wrapper around the DefaultValuePlugin. This must be in the com.sun.tools.xjc.addon package
 * for it to work with Java 6. See https://issues.apache.org/jira/browse/CXF-1880.
 */
public class DefaultValuePlugin extends Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `bug986/src/main/java/com/sun/tools/xjc/addon/apache_cxf/bug986/Bug986Plugin.java`
#### Snippet
```java
/**
 * Thin wrapper around the Bug986Plugin. This must be in the com.sun.tools.xjc.addon package
 * for it to work with Java 6. See https://issues.apache.org/jira/browse/CXF-1880.
 */
public class Bug986Plugin extends Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `ts/src/main/java/com/sun/tools/xjc/addon/apache_cxf/ts/ToStringPlugin.java`
#### Snippet
```java
/**
 * Thin wrapper around the ToStringPlugin. This must be in the com.sun.tools.xjc.addon package
 * for it to work with Java 6. See https://issues.apache.org/jira/browse/CXF-1880.
 */
public class ToStringPlugin extends Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `property-listener/src/main/java/com/sun/tools/xjc/addon/apache_cxf/property_listener/PropertyListenerPlugin.java`
#### Snippet
```java
/**
 * Thin wrapper around the DefaultValuePlugin. This must be in the com.sun.tools.xjc.addon package
 * for it to work with Java 6. See https://issues.apache.org/jira/browse/CXF-1880.
 */
public class PropertyListenerPlugin extends Plugin {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `bug986/src/main/java/org/apache/cxf/xjc/bug986/Bug986Plugin.java`
#### Snippet
```java
/**
 * Modifies the JAXB code model to handle package naming that run into:
 * https://jaxb.dev.java.net/issues/show_bug.cgi?id=671
 */
public class Bug986Plugin {
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

