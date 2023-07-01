# h3-java 
 
# Bad smells
I found 11 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 3 | false |
| FinalMethodInFinalClass | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| FinalStaticMethod | 2 | false |
| DuplicatedCode | 1 | false |
| FieldMayBeFinal | 1 | false |
## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java
   * @param osName Value of system property "os.name"
   */
  static final OperatingSystem detectOs(String javaVendor, String osName) {
    // Detecting Android using the properties from:
    // https://developer.android.com/reference/java/lang/System.html
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/uber/h3core/H3CoreLoader.java`
#### Snippet
```java
   * @param osArch Value of system property "os.arch"
   */
  static final String detectArch(String osArch) {
    if (osArch.equals("amd64") || osArch.equals("x86_64")) {
      return ARCH_X64;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/h3core/H3Core.java`
#### Snippet
```java
    List<LatLng> out = new ArrayList<>(numVerts);
    for (int i = 0; i < numVerts; i++) {
      LatLng coord = new LatLng(toDegrees(verts[i * 2]), toDegrees(verts[(i * 2) + 1]));
      out.add(coord);
    }
    return out;
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `code` may be 'final'
in `src/main/java/com/uber/h3core/exceptions/H3Exception.java`
#### Snippet
```java
 */
public class H3Exception extends RuntimeException {
  private int code;

  public H3Exception(int code) {
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

