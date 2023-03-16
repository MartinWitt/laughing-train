# sling-org-apache-sling-servlets-get 
 
# Bad smells
I found 40 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 8 | false |
| ReturnNull | 5 | false |
| StringOperationCanBeSimplified | 3 | false |
| UNUSED_IMPORT | 2 | false |
| WhileCanBeForeach | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| ConstantValue | 2 | false |
| UnnecessaryUnboxing | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| NestedAssignment | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| Java8MapApi | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| CopyConstructorMissesField | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| BoundedWildcard | 1 | false |
| UnusedAssignment | 1 | false |
| MissortedModifiers | 1 | false |
## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/sling/servlets/get/impl/RedirectServlet.java`
#### Snippet
```java
            final Integer statusInt = valueMap.get(STATUS_PROP, Integer.class);
            if (statusInt != null) {
                int status = statusInt.intValue();
                if (status >= 100 && status <= 999) {
                    return status;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sling.servlets.get.impl` is unnecessary and can be removed
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
 * The <code>StreamRendererServlet</code> streams the current resource to the
 * client on behalf of the
 * {@link org.apache.sling.servlets.get.impl.DefaultGetServlet}. If the current
 * resource cannot be streamed it is rendered using the
 * {@link PlainTextRenderer}.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `r.adaptTo(String[].class)` might be null
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/HtmlRenderer.java`
#### Snippet
```java
            printProlog(pw, isIncluded);
            printResourceInfo(pw, r);
            render(pw, r, r.adaptTo(String[].class));
            printEpilog(pw, isIncluded);
        } else {
```

### DataFlowIssue
Method invocation `getWorkspace` may produce `NullPointerException`
in `src/main/java/org/apache/sling/servlets/get/impl/VersionInfoServlet.java`
#### Snippet
```java
        
        try {
        	VersionManager vm = req.getResourceResolver().adaptTo(Session.class).getWorkspace().getVersionManager();
            resp.getWriter().write(renderer.prettyPrint(getJsonObject(req.getResource(), vm), opt));
        } catch (Exception e) {
```

### DataFlowIssue
Method invocation `getJSONObject` may produce `NullPointerException`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/JsonRenderer.java`
#### Snippet
```java
                            .withIndent(tidy ? INDENT_SPACES : 0)
                            .withArraysForChildren(harray);
                    resp.getWriter().write(renderer.prettyPrint(traversor.getJSONObject(), opt));
                } else {
                    // If no rendering options, use the plain toString() method, for
```

### DataFlowIssue
Method invocation `getJSONObject` may produce `NullPointerException`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/JsonRenderer.java`
#### Snippet
```java
                    StringWriter writer = new StringWriter();
                    try (JsonGenerator json = Json.createGenerator(writer)){
                        json.write(traversor.getJSONObject());
                    }
                    resp.getWriter().write(writer.toString());
```

### DataFlowIssue
Method invocation `include` may produce `NullPointerException`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java

                try {
					dispatcher.include(request, response);
				} catch (ServletException e) {
					throw new IOException(e);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
        if (resource.getResourceType().equals(JcrConstants.NT_LINKEDFILE)) {
            final ValueMap vm = resource.adaptTo(ValueMap.class);
            final String actualResourcePath = vm.get(JcrConstants.JCR_CONTENT, String.class);
            resource = request.getResourceResolver().getResource(actualResourcePath);
            if (resource == null) {
```

### DataFlowIssue
Argument `actualResourcePath` might be null
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
            final ValueMap vm = resource.adaptTo(ValueMap.class);
            final String actualResourcePath = vm.get(JcrConstants.JCR_CONTENT, String.class);
            resource = request.getResourceResolver().getResource(actualResourcePath);
            if (resource == null) {
                log.warn("Path {} does not exist",actualResourcePath);
```

### DataFlowIssue
Argument `resourceInputStream` might be null
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
            InputStream resourceInputStream = resource.adaptTo(InputStream.class);

            try (InputStream istream = new BufferedInputStream(resourceInputStream,
                    IO_BUFFER_SIZE)) {
                Range currentRange = ranges.next();
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import javax.json.JsonException;`
in `src/main/java/org/apache/sling/servlets/get/impl/SlingInfoServlet.java`
#### Snippet
```java

import javax.json.Json;
import javax.json.JsonException;
import javax.json.stream.JsonGenerator;
import javax.servlet.Servlet;
```

### UNUSED_IMPORT
Unused import `import java.io.Closeable;`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
            byte[] buf = new byte[IO_BUFFER_SIZE];
            int rd;
            while ((rd = stream.read(buf)) >= 0) {
                out.write(buf, 0, rd);
            }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/org/apache/sling/servlets/get/impl/util/JsonObjectCreator.java`
#### Snippet
```java
            final String value = resource.adaptTo(String.class);
            if (value != null) {
                obj.add(resource.getName(), value.toString());
            } else {
                final String[] values = resource.adaptTo(String[].class);
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/org/apache/sling/servlets/get/impl/util/JsonToText.java`
#### Snippet
```java
                }
                indent(sb, newindent);
                sb.append(quote(o.toString()));
                sb.append(": ");
                sb.append(valueToString(v,
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
                    if (dashPos < rangeDefinition.length() - 1)
                        currentRange.end = Long.parseLong(rangeDefinition.substring(
                            dashPos + 1, rangeDefinition.length()));
                    else
                        currentRange.end = fileLength - 1;
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/PlainTextRenderer.java`
#### Snippet
```java
        pw.println("\n** Resource properties **");
        final Iterator<Map.Entry<String,Object>> pi = map.entrySet().iterator();
        while ( pi.hasNext() ) {
            final Map.Entry<String,Object> p = pi.next();
            printPropertyValue(pw, p.getKey(), p.getValue(), true);
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `src/main/java/org/apache/sling/servlets/get/impl/util/JsonObjectCreator.java`
#### Snippet
```java
        final Iterator<Map.Entry<String, Object>> props = valueMap.entrySet().iterator();

        while (props.hasNext()) {
            final Map.Entry<String, Object> prop = props.next();
            createProperty(obj, prop.getKey(), prop.getValue());
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `buffer`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
            OutputStream ostream, long start, long end) throws IOException {
        long position = 0;
        byte buffer[] = new byte[IO_BUFFER_SIZE];

        while (position < start) {
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/sling/servlets/get/impl/util/ResourceTraversor.java`
#### Snippet
```java
            final Iterator<Resource> children = resource.listChildren();
            List<Resource> childTree = tree.get(resource);
            if (childTree == null)
            {
                childTree = new ArrayList<>();
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `currentLevel`
in `src/main/java/org/apache/sling/servlets/get/impl/util/ResourceTraversor.java`
#### Snippet
```java
        while (!currentQueue.isEmpty() || !nextQueue.isEmpty()) {
            if (currentQueue.isEmpty()) {
                currentLevel++;
                currentQueue = nextQueue;
                nextQueue = new LinkedList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `response`
in `src/main/java/org/apache/sling/servlets/get/impl/DefaultGetServlet.java`
#### Snippet
```java
            IOException {

        response = new HeadServletResponse(response);
        doGet(request, response);
    }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'renderer' in a Serializable class
in `src/main/java/org/apache/sling/servlets/get/impl/VersionInfoServlet.java`
#### Snippet
```java
    public static final int INDENT_SPACES = 2;
    
    private final JsonToText renderer = new JsonToText();
    
    @Activate
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
        if (!rangeHeader.startsWith("bytes")) {
            failParseRange(response, fileLength, rangeHeader);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
            if (dashPos == -1) {
                failParseRange(response, fileLength, rangeHeader);
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
                } catch (NumberFormatException e) {
                    failParseRange(response, fileLength, rangeHeader);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
                } catch (NumberFormatException e) {
                    failParseRange(response, fileLength, rangeHeader);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
            if (!currentRange.validate()) {
                failParseRange(response, fileLength, rangeHeader);
                return null;
            }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-16-00-59-53.012.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `src/main/java/org/apache/sling/servlets/get/impl/util/JsonToText.java`
#### Snippet
```java
    /** Quote the supplied string for JSON */
    private String quote(String string) {
        if (string == null || string.length() == 0) {
            return "\"\"";
        }
```

### SizeReplaceableByIsEmpty
`childrenArray.size() > 0` can be replaced with '!childrenArray.isEmpty()'
in `src/main/java/org/apache/sling/servlets/get/impl/util/JsonToText.java`
#### Snippet
```java
        /** Render children if any were skipped (in "children in arrays" mode) */
        JsonArray childrenArray = children.build();
        if(childrenArray.size() > 0) {
            if (sb.length() > 1) {
                sb.append(",\n");
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/servlets/get/impl/DefaultGetServlet.java`
#### Snippet
```java
        this.indexFiles = cfg.index_files();
        if ( this.indexFiles == null ) {
            this.indexFiles = new String[0];
        }

```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'childrenKey' and 'childNameKey'
in `src/main/java/org/apache/sling/servlets/get/impl/util/JsonToText.java`
#### Snippet
```java
        }

        Options(Options opt) {
            this.indent = opt.indent;
            this.indentIsPositive = opt.indentIsPositive;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/PlainTextRenderer.java`
#### Snippet
```java
            pw.print(']');
        } else {
            pw.print(value.toString());
        }
    }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Range` may be 'static'
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
    // --------- Range Inner Class

    protected class Range {

        public long start;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Range`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
     */
    private void copy(Resource resource, ServletOutputStream ostream,
            Iterator<Range> ranges) throws IOException {

        String contentType = resource.getResourceMetadata().getContentType();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `maxRecursionLevels` initializer `0` is redundant
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/JsonRenderer.java`
#### Snippet
```java
        }

        int maxRecursionLevels = 0;
        try {
            maxRecursionLevels = getMaxRecursionLevel(req);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/org/apache/sling/servlets/get/impl/util/JsonToText.java`
#### Snippet
```java
{
    /** Rendering options */
    static public class Options {
        int indent;
        private boolean indentIsPositive;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `targetPath` is always 'null'
in `src/main/java/org/apache/sling/servlets/get/impl/RedirectServlet.java`
#### Snippet
```java
        // no way of finding the target, just fail
        response.sendError(HttpServletResponse.SC_NOT_FOUND,
            "Cannot redirect to target resource " + targetPath);
    }

```

### ConstantValue
Condition `selectors != null` is always `true`
in `src/main/java/org/apache/sling/servlets/get/impl/helpers/JsonRenderer.java`
#### Snippet
```java
        int maxRecursionLevels = 0;
        final String[] selectors = req.getRequestPathInfo().getSelectors();
        if (selectors != null && selectors.length > 0) {
            final String level = selectors[selectors.length - 1];
            if(!TIDY.equals(level) && !HARRAY.equals(level)) {
```

