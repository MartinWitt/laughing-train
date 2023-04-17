# commons-fileupload 
 
# Bad smells
I found 71 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 34 | false |
| RedundantFieldInitialization | 6 | false |
| DuplicateThrows | 6 | false |
| ReturnNull | 5 | false |
| FinalStaticMethod | 4 | false |
| UnnecessarySuperQualifier | 3 | false |
| RedundantMethodOverride | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| NonFinalFieldOfException | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| BoundedWildcard | 1 | false |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `close()` only delegates to its super method
in `src/main/java/org/apache/commons/fileupload2/util/LimitedInputStream.java`
#### Snippet
```java
     */
    @Override
    public void close() throws IOException {
        super.close();
    }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/fileupload2/portlet/PortletFileUpload.java`
#### Snippet
```java
    public FileItemIterator getItemIterator(final ActionRequest request)
            throws FileUploadException, IOException {
        return super.getItemIterator(new PortletRequestContext(request));
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/fileupload2/jaksrvlt/JakSrvltFileUpload.java`
#### Snippet
```java
    public FileItemIterator getItemIterator(final HttpServletRequest request)
    throws FileUploadException, IOException {
        return super.getItemIterator(new JakSrvltRequestContext(request));
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/fileupload2/servlet/ServletFileUpload.java`
#### Snippet
```java
     */
    public FileItemIterator getItemIterator(final HttpServletRequest request) throws FileUploadException, IOException {
        return super.getItemIterator(new ServletRequestContext(request));
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItemFactory.java`
#### Snippet
```java

/**
 * The default {@link org.apache.commons.fileupload2.FileItemFactory}
 * implementation.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItemFactory.java`
#### Snippet
```java
 * <p>
 * This implementation creates
 * {@link org.apache.commons.fileupload2.FileItem} instances which keep their
 * content either in memory, for smaller items, or in a temporary file on disk,
 * for larger items. The size threshold, above which content will be stored on
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItemFactory.java`
#### Snippet
```java
 * then you must consider the following: Temporary files are automatically
 * deleted as soon as they are no longer needed. (More precisely, when the
 * corresponding instance of {@link java.io.File} is garbage collected.)
 * This is done by the so-called reaper thread, which is started and stopped
 * automatically by the {@link FileCleaningTracker} when there are files to be
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2.disk` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItemFactory.java`
#### Snippet
```java

    /**
     * Creates a new {@link org.apache.commons.fileupload2.disk.DiskFileItem}
     * instance from the supplied parameters and the local factory
     * configuration.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItemFactory.java`
#### Snippet
```java
     *
     * @return The directory in which temporary files will be located.
     * @see #setRepository(java.io.File)
     */
    public File getRepository() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/portlet/PortletFileUpload.java`
#### Snippet
```java
 * {@link org.apache.commons.fileupload2.servlet.ServletFileUpload
 * #parseRequest(javax.servlet.http.HttpServletRequest)} to acquire a list
 * of {@link org.apache.commons.fileupload2.FileItem FileItems} associated
 * with a given HTML widget.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/util/LimitedInputStream.java`
#### Snippet
```java
     *
     * @throws  IOException  if an I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/util/LimitedInputStream.java`
#### Snippet
```java
     * {@code b.length - off}
     * @throws  IOException  if an I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/util/LimitedInputStream.java`
#### Snippet
```java
     *             stream is reached.
     * @throws  IOException  if an I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/FileItem.java`
#### Snippet
```java

    /**
     * Gets an {@link java.io.OutputStream OutputStream} that can be used for storing the contents of the file.
     *
     * @return An {@link java.io.OutputStream OutputStream} that can be used for storing the contents of the file.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/FileItem.java`
#### Snippet
```java
     * Gets an {@link java.io.OutputStream OutputStream} that can be used for storing the contents of the file.
     *
     * @return An {@link java.io.OutputStream OutputStream} that can be used for storing the contents of the file.
     *
     * @throws IOException if an error occurs.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/FileItem.java`
#### Snippet
```java

    /**
     * Gets an {@link java.io.InputStream InputStream} that can be used to retrieve the contents of the file.
     *
     * @return An {@link java.io.InputStream InputStream} that can be used to retrieve the contents of the file.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/FileItem.java`
#### Snippet
```java
     * Gets an {@link java.io.InputStream InputStream} that can be used to retrieve the contents of the file.
     *
     * @return An {@link java.io.InputStream InputStream} that can be used to retrieve the contents of the file.
     *
     * @throws IOException if an error occurs.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/FileItem.java`
#### Snippet
```java
 * </p>
 * <p>
 * After retrieving an instance of this class from a {@link org.apache.commons.fileupload2.FileUpload FileUpload} instance (see
 * {@link org.apache.commons.fileupload2.servlet.ServletFileUpload #parseRequest(javax.servlet.http.HttpServletRequest)}), you may either request all contents
 * of the file at once using {@link #get()} or request an {@link java.io.InputStream InputStream} with {@link #getInputStream()} and process the file without
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/FileItem.java`
#### Snippet
```java
 * After retrieving an instance of this class from a {@link org.apache.commons.fileupload2.FileUpload FileUpload} instance (see
 * {@link org.apache.commons.fileupload2.servlet.ServletFileUpload #parseRequest(javax.servlet.http.HttpServletRequest)}), you may either request all contents
 * of the file at once using {@link #get()} or request an {@link java.io.InputStream InputStream} with {@link #getInputStream()} and process the file without
 * attempting to load it into memory, which may come handy with large files.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/jaksrvlt/JakSrvltFileUpload.java`
#### Snippet
```java
 * <a href="http://www.ietf.org/rfc/rfc1867.txt">RFC 1867</a>.  Use {@link
 * #parseRequest(HttpServletRequest)} to acquire a list of {@link
 * org.apache.commons.fileupload2.FileItem}s associated with a given HTML
 * widget.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/FileUpload.java`
#### Snippet
```java
 * <a href="http://www.ietf.org/rfc/rfc1867.txt">RFC 1867</a>.  Use {@link
 * #parseRequest(RequestContext)} to acquire a list
 * of {@link org.apache.commons.fileupload2.FileItem FileItems} associated
 * with a given HTML widget.</p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java
     * Returns the next available {@link FileItemStream}.
     *
     * @throws java.util.NoSuchElementException No more items are available. Use {@link #hasNext()} to prevent this exception.
     * @throws FileUploadException              Parsing or processing the file item failed.
     * @throws IOException                      Reading the file item failed.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/servlet/ServletFileUpload.java`
#### Snippet
```java
 * <a href="http://www.ietf.org/rfc/rfc1867.txt">RFC 1867</a>.  Use {@link
 * #parseRequest(HttpServletRequest)} to acquire a list of {@link
 * org.apache.commons.fileupload2.FileItem}s associated with a given HTML
 * widget.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/AbstractFileUpload.java`
#### Snippet
```java
 * <a href="http://www.ietf.org/rfc/rfc1867.txt">RFC 1867</a>.  Use {@link
 * #parseRequest(RequestContext)} to acquire a list of {@link
 * org.apache.commons.fileupload2.FileItem}s associated with a given HTML
 * widget.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
     *
     * @return The original file name in the client's file system.
     * @throws org.apache.commons.fileupload2.InvalidFileNameException The file name contains a NUL character,
     *   which might be an indicator of a security attack. If you intend to
     *   use the file name anyways, catch the exception and use
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
     *   which might be an indicator of a security attack. If you intend to
     *   use the file name anyways, catch the exception and use
     *   {@link org.apache.commons.fileupload2.InvalidFileNameException#getName()}.
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java

    /**
     * Gets an {@link java.io.InputStream InputStream} that can be
     * used to retrieve the contents of the file.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
     * used to retrieve the contents of the file.
     *
     * @return An {@link java.io.InputStream InputStream} that can be
     *         used to retrieve the contents of the file.
     * @throws IOException if an error occurs.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java

    /**
     * Gets the {@link java.io.File} object for the {@code FileItem}'s
     * data's temporary location on the disk. Note that for
     * {@code FileItem}s that have their data stored in memory,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
     * {@code FileItem}s that have their data stored in memory,
     * this method will return {@code null}. When handling large
     * files, you can use {@link java.io.File#renameTo(java.io.File)} to
     * move the file to new location without copying the data, if the
     * source and destination locations reside within the same logical
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
     * {@code FileItem}s that have their data stored in memory,
     * this method will return {@code null}. When handling large
     * files, you can use {@link java.io.File#renameTo(java.io.File)} to
     * move the file to new location without copying the data, if the
     * source and destination locations reside within the same logical
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java

    /**
     * Creates and returns a {@link java.io.File File} representing a uniquely
     * named temporary file in the configured repository path. The lifetime of
     * the file is tied to the lifetime of the {@code FileItem} instance;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
     * same File each time.</b>
     * </p>
     * @return The {@link java.io.File File} to be used for temporary storage.
     */
    protected File getTempFile() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java

    /**
     * Gets an {@link java.io.OutputStream OutputStream} that can
     * be used for storing the contents of the file.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
     * be used for storing the contents of the file.
     *
     * @return An {@link java.io.OutputStream OutputStream} that can be used
     *         for storing the contents of the file.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.fileupload2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
/**
 * The default implementation of the
 * {@link org.apache.commons.fileupload2.FileItem FileItem} interface.
 *
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
 * #parseRequest(javax.servlet.http.HttpServletRequest)}), you may
 * either request all contents of file at once using {@link #get()} or
 * request an {@link java.io.InputStream InputStream} with
 * {@link #getInputStream()} and process the file without attempting to load
 * it into memory, which may come handy with large files.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
 * then you must consider the following: Temporary files are automatically
 * deleted as soon as they are no longer needed. (More precisely, when the
 * corresponding instance of {@link java.io.File} is garbage collected.)
 * This is done by the so-called reaper thread, which is started and stopped
 * automatically by the {@link org.apache.commons.io.FileCleaningTracker} when
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `src/main/java/org/apache/commons/fileupload2/util/mime/MimeUtility.java`
#### Snippet
```java
            // get the decoded byte data and convert into a string.
            final byte[] decodedData = out.toByteArray();
            return new String(decodedData, javaCharset(charset));
        } catch (final IOException e) {
            throw new UnsupportedEncodingException("Invalid RFC 2047 encoding");
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `LimitedInputStream()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/fileupload2/util/LimitedInputStream.java`
#### Snippet
```java
     *   shall be returned by the source stream.
     */
    public LimitedInputStream(final InputStream inputStream, final long sizeMax) {
        super(inputStream);
        this.sizeMax = sizeMax;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `src/main/java/org/apache/commons/fileupload2/util/LimitedInputStream.java`
#### Snippet
```java
     */
    @Override
    public void close() throws IOException {
        super.close();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/fileupload2/ParameterParser.java`
#### Snippet
```java
     * String to be parsed.
     */
    private char[] chars = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/fileupload2/ParameterParser.java`
#### Snippet
```java
     * Maximum position in the string.
     */
    private int len = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/fileupload2/ParameterParser.java`
#### Snippet
```java
     * Current position in the string.
     */
    private int pos = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/fileupload2/ParameterParser.java`
#### Snippet
```java
     * Start of a token.
     */
    private int i1 = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/fileupload2/ParameterParser.java`
#### Snippet
```java
     * End of a token.
     */
    private int i2 = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/fileupload2/ParameterParser.java`
#### Snippet
```java
     * Whether names stored in the map should be converted to lower case.
     */
    private boolean lowerCaseNames = false;

    /**
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/fileupload2/util/FileItemHeadersImpl.java`
#### Snippet
```java
        final List<String> headerValueList = getList(name);
        if (null == headerValueList) {
            return null;
        }
        return headerValueList.get(0);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/fileupload2/AbstractFileUpload.java`
#### Snippet
```java

        if (boundaryStr == null) {
            return null;
        }
        final byte[] boundary;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
    public File getStoreLocation() {
        if (dfos == null) {
            return null;
        }
        if (isInMemory()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
        }
        if (isInMemory()) {
            return null;
        }
        return dfos.getFile();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/fileupload2/util/mime/MimeUtility.java`
#### Snippet
```java
        // nothing in, nothing out.
        if (charset == null) {
            return null;
        }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-17-17-29-02.409.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
                cachedContent = dfos.getData();
            }
            return cachedContent != null ? cachedContent.clone() : new byte[0];
        }

```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `contentType` of exception class
in `src/main/java/org/apache/commons/fileupload2/pub/FileUploadContentTypeException.java`
#### Snippet
```java
     * The guilty content type.
     */
    private String contentType;

    /**
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/fileupload2/FileItemIterator.java`
#### Snippet
```java
public interface FileItemIterator {

    List<FileItem> getFileItems() throws FileUploadException, IOException;

    /**
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
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
in `src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java
    }

    protected void init(final AbstractFileUpload fileUploadBase, final RequestContext requestContext) throws FileUploadException, IOException {
        final String contentType = ctx.getContentType();
        if ((null == contentType) || (!contentType.toLowerCase(Locale.ENGLISH).startsWith(AbstractFileUpload.MULTIPART))) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java
    }

    public MultipartStream getMultiPartStream() throws FileUploadException, IOException {
        if (multiPartStream == null) {
            init(fileUploadBase, ctx);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java

    @Override
    public List<FileItem> getFileItems() throws FileUploadException, IOException {
        final List<FileItem> items = new ArrayList<>();
        while (hasNext()) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
    @Override
    public String getString(final String charset)
        throws UnsupportedEncodingException, IOException {
        return new String(get(), charset);
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItem.java`
#### Snippet
```java
        if (outputFile != null && !isInMemory() && outputFile.exists()) {
            if (!outputFile.delete()) {
                final String desc = "Cannot delete " + outputFile.toString();
                throw new UncheckedIOException(desc, new IOException(desc));
            }
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/commons/fileupload2/MultipartStream.java`
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
in `src/main/java/org/apache/commons/fileupload2/portlet/PortletFileUpload.java`
#### Snippet
```java
     *         {@code false} otherwise.
     */
    public static final boolean isMultipartContent(final ActionRequest request) {
        return AbstractFileUpload.isMultipartContent(
                new PortletRequestContext(request));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/fileupload2/jaksrvlt/JakSrvltFileUpload.java`
#### Snippet
```java
     *         {@code false} otherwise.
     */
    public static final boolean isMultipartContent(final HttpServletRequest request) {
        return POST_METHOD.equalsIgnoreCase(request.getMethod()) && AbstractFileUpload.isMultipartContent(new JakSrvltRequestContext(request));
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/fileupload2/servlet/ServletFileUpload.java`
#### Snippet
```java
     *         {@code false} otherwise.
     */
    public static final boolean isMultipartContent(final HttpServletRequest request) {
        return POST_METHOD.equalsIgnoreCase(request.getMethod()) && AbstractFileUpload.isMultipartContent(new ServletRequestContext(request));
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/fileupload2/AbstractFileUpload.java`
#### Snippet
```java
     *         {@code false} otherwise.
     */
    public static final boolean isMultipartContent(final RequestContext ctx) {
        final String contentType = ctx.getContentType();
        if (contentType == null) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/fileupload2/AbstractRequestContext.java`
#### Snippet
```java
     * @param contentLengthDefault How to get the content length default.
     */
    protected AbstractRequestContext(final Function<String, String> contentLengthString, final LongSupplier contentLengthDefault) {
        super();
        this.contentLengthString = contentLengthString;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `sizeThreshold` initializer `DEFAULT_SIZE_THRESHOLD` is redundant
in `src/main/java/org/apache/commons/fileupload2/disk/DiskFileItemFactory.java`
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
in `src/main/java/org/apache/commons/fileupload2/impl/FileItemIteratorImpl.java`
#### Snippet
```java
        final long contentLengthInt = ctx.getContentLength();
        // @formatter:off
        final long requestSize = RequestContext.class.isAssignableFrom(ctx.getClass())
                                 // Inline conditional is OK here CHECKSTYLE:OFF
                                 ? ctx.getContentLength()
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ItemInputStream.skip()` is ignored
in `src/main/java/org/apache/commons/fileupload2/MultipartStream.java`
#### Snippet
```java
                        }
                    }
                    skip(av);
                }
            }
```

