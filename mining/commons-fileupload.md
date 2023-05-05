# commons-fileupload 
 
# Bad smells
I found 21 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicateThrows | 6 | false |
| FinalStaticMethod | 4 | false |
| JavadocDeclaration | 2 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| AutoCloseableResource | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
| FieldCanBeLocal | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
            for (int i = 0; i < fileName.length(); i++) {
                final char c = fileName.charAt(i);
                switch (c) {
                case 0:
                    sb.append("\\0");
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ItemInputStream' used without 'try'-with-resources statement
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/impl/FileItemStreamImpl.java`
#### Snippet
```java
        }
        // OK to construct stream now
        final ItemInputStream itemInputStream = fileItemIteratorImpl.getMultiPartStream().newInputStream();
        InputStream istream = itemInputStream;
        if (fileSizeMax != -1) {
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/FileItemIterator.java`
#### Snippet
```java
public interface FileItemIterator {

    List<FileItem> getFileItems() throws FileUploadException, IOException;

    /**
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java

    @Override
    public List<FileItem> getFileItems() throws FileUploadException, IOException {
        final List<FileItem> items = new ArrayList<>();
        while (hasNext()) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java
    }

    protected void init(final AbstractFileUpload fileUploadBase, final RequestContext requestContext) throws FileUploadException, IOException {
        final String contentType = ctx.getContentType();
        if (null == contentType || !contentType.toLowerCase(Locale.ENGLISH).startsWith(AbstractFileUpload.MULTIPART)) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java
     * @throws IOException An I/O error occurred.
     */
    private boolean findNextItem() throws FileUploadException, IOException {
        if (eof) {
            return false;
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java
    }

    public MultipartStream getMultiPartStream() throws FileUploadException, IOException {
        if (multiPartStream == null) {
            init(fileUploadBase, ctx);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
     */
    @Override
    public String getString(final String charset) throws UnsupportedEncodingException, IOException {
        return new String(get(), charset);
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
        final File outputFile = getStoreLocation();
        if (outputFile != null && !isInMemory() && outputFile.exists() && !outputFile.delete()) {
            final String desc = "Cannot delete " + outputFile.toString();
            throw new UncheckedIOException(desc, new IOException(desc));
        }
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/MultipartStream.java`
#### Snippet
```java
            pos = MultipartStream.this.findSeparator();
            if (pos == -1) {
                if (tail - head > keepRegion) {
                    pad = keepRegion;
                } else {
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `commons-fileupload2-javax/src/main/java/org/apache/commons/fileupload2/javax/ServletFileUpload.java`
#### Snippet
```java
     * @return {@code true} if the request is multipart; {@code false} otherwise.
     */
    public static final boolean isMultipartContent(final HttpServletRequest request) {
        return POST_METHOD.equalsIgnoreCase(request.getMethod()) && AbstractFileUpload.isMultipartContent(new ServletRequestContext(request));
    }
```

### FinalStaticMethod
'static' method declared `final`
in `commons-fileupload2-portlet/src/main/java/org/apache/commons/fileupload2/portlet/PortletFileUpload.java`
#### Snippet
```java
     * @return {@code true} if the request is multipart; {@code false} otherwise.
     */
    public static final boolean isMultipartContent(final ActionRequest request) {
        return AbstractFileUpload.isMultipartContent(new PortletRequestContext(request));
    }
```

### FinalStaticMethod
'static' method declared `final`
in `commons-fileupload2-jakarta/src/main/java/org/apache/commons/fileupload2/jakarta/JakartaServletFileUpload.java`
#### Snippet
```java
     * @return {@code true} if the request is multipart; {@code false} otherwise.
     */
    public static final boolean isMultipartContent(final HttpServletRequest request) {
        return POST_METHOD.equalsIgnoreCase(request.getMethod()) && AbstractFileUpload.isMultipartContent(new JakartaServletRequestContext(request));
    }
```

### FinalStaticMethod
'static' method declared `final`
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/AbstractFileUpload.java`
#### Snippet
```java
     * @return {@code true} if the request is multipart; {@code false} otherwise.
     */
    public static final boolean isMultipartContent(final RequestContext ctx) {
        final String contentType = ctx.getContentType();
        if (contentType == null) {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/util/mime/MimeUtility.java`
#### Snippet
```java
            // get the decoded byte data and convert into a string.
            final byte[] decodedData = out.toByteArray();
            return new String(decodedData, javaCharset(charset));
        } catch (final IOException e) {
            throw new UnsupportedEncodingException("Invalid RFC 2047 encoding");
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/FileItemIterator.java`
#### Snippet
```java
     * Sets the maximum size of a single file. An {@link FileUploadByteCountLimitException} will be thrown, if there is an uploaded file, which is exceeding
     * this value. By default, this value will be copied from the {@link AbstractFileUpload#getFileSizeMax() FileUploadBase} object, however, the user may
     * replace the default value with a request specific value by invoking {@link #setFileSizeMax(long)} on this object, so there is no need to configure it
     * here.
     * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/FileItemIterator.java`
#### Snippet
```java
     * Sets the maximum size of the complete HTTP request. A {@link SizeLimitExceededException} will be thrown, if the HTTP request will exceed this value. By
     * default, this value will be copied from the {@link AbstractFileUpload#getSizeMax() FileUploadBase} object, however, the user may replace the default
     * value with a request specific value by invoking {@link #setSizeMax(long)} on this object.
     * <p>
     * <em>Note:</em> Setting the maximum size on this object will work only, if the iterator is not yet initialized. In other words: If the methods
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `sizeThreshold` initializer `DEFAULT_SIZE_THRESHOLD` is redundant
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/disk/DiskFileItemFactory.java`
#### Snippet
```java
     * The threshold above which uploads will be stored on disk.
     */
    private int sizeThreshold = DEFAULT_SIZE_THRESHOLD;

    /**
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `RequestContext.class.isAssignableFrom(ctx.getClass())` is always `true`
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java
        final long contentLengthInt = ctx.getContentLength();
        // @formatter:off
        final long requestSize = RequestContext.class.isAssignableFrom(ctx.getClass())
                                 // Inline conditional is OK here CHECKSTYLE:OFF
                                 ? ctx.getContentLength()
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/impl/FileItemStreamImpl.java`
#### Snippet
```java
     * @see FileItemIteratorImpl
     */
    private final FileItemIteratorImpl fileItemIteratorImpl;

    /**
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ItemInputStream.skip()` is ignored
in `commons-fileupload2-core/src/main/java/org/apache/commons/fileupload2/MultipartStream.java`
#### Snippet
```java
                        }
                    }
                    skip(av);
                }
            }
```

