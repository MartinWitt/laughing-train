# h3-java 
 
# Bad smells
I found 16 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 3 | false |
| UnnecessaryLocalVariable | 2 | true |
| ZeroLengthArrayInitialization | 2 | false |
| FinalStaticMethod | 2 | false |
| BoundedWildcard | 2 | false |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| NonFinalFieldOfException | 1 | false |
| NestedAssignment | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java
  static final String ARCH_ARM64 = "arm64";

  private static volatile File libraryFile = null;

  /** Read all bytes from <code>in</code> and write them to <code>out</code>. */
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-07-07-03-22.010.html`
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
`loop.size() > 0` can be replaced with '!loop.isEmpty()'
in `src/main/java/com/uber/h3core/H3Core.java`
#### Snippet
```java
        }

        if (geoJson && loop.size() > 0) {
          // geoJson requires closing the loop
          loop.add(loop.get(0));
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/com/uber/h3core/H3Core.java`
#### Snippet
```java
    checkResolution(childRes);

    long result = h3Api.cellToCenterChild(h3, childRes);

    return result;
```

### UnnecessaryLocalVariable
Local variable `out` is redundant
in `src/main/java/com/uber/h3core/H3Core.java`
#### Snippet
```java
    double[] coords = new double[2];
    h3Api.cellToLatLng(h3, coords);
    LatLng out = new LatLng(toDegrees(coords[0]), toDegrees(coords[1]));
    return out;
  }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/h3core/H3Core.java`
#### Snippet
```java
    double[] verts = new double[points.size() * 2];
    packGeofenceVertices(verts, points, 0);
    int[] holeSizes = new int[0];
    double[] holeVerts = new double[0];
    if (holes != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/h3core/H3Core.java`
#### Snippet
```java
    packGeofenceVertices(verts, points, 0);
    int[] holeSizes = new int[0];
    double[] holeVerts = new double[0];
    if (holes != null) {
      holeSizes = new int[holes.size()];
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `code` of exception class
in `src/main/java/com/uber/h3core/exceptions/H3Exception.java`
#### Snippet
```java
 */
public class H3Exception extends RuntimeException {
  private int code;

  public H3Exception(int code) {
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java
   * @param osName Value of system property "os.name"
   */
  static final OperatingSystem detectOs(String javaVendor, String osName) {
    // Detecting Android using the properties from:
    // https://developer.android.com/reference/java/lang/System.html
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java
   * @param osArch Value of system property "os.arch"
   */
  static final String detectArch(String osArch) {
    if (osArch.equals("amd64") || osArch.equals("x86_64")) {
      return ARCH_X64;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java

    int read;
    while ((read = in.read(buf)) != -1) {
      out.write(buf, 0, read);
    }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/com/uber/h3core/H3Core.java`
#### Snippet
```java
   * @throws IllegalArgumentException Invalid resolution
   */
  public List<Long> polygonToCells(List<LatLng> points, List<List<LatLng>> holes, int res) {
    checkResolution(res);

```

### BoundedWildcard
Can generalize to `? extends LatLng`
in `src/main/java/com/uber/h3core/H3Core.java`
#### Snippet
```java
   * @return Next offset to begin filling from
   */
  private static int packGeofenceVertices(double[] arr, List<LatLng> original, int offset) {
    assert arr.length >= (original.size() * 2) + offset;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java
  static void copyResource(String resourcePath, File newH3LibFile) throws IOException {
    // Set the permissions
    newH3LibFile.setReadable(true);
    newH3LibFile.setWritable(true, true);
    newH3LibFile.setExecutable(true, true);
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java
    // Set the permissions
    newH3LibFile.setReadable(true);
    newH3LibFile.setWritable(true, true);
    newH3LibFile.setExecutable(true, true);

```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java
    newH3LibFile.setReadable(true);
    newH3LibFile.setWritable(true, true);
    newH3LibFile.setExecutable(true, true);

    // Shove the resource into the file and close it
```

