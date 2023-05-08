# tsunami-security-scanner-plugins 
 
# Bad smells
I found 2 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `s` initializer `null` is redundant
in `community/detectors/wso2_arbitrary_file_upload_cve_2022_29464/src/main/resources/com/google/tsunami/plugins/detectors/rce/cve202229464/requestBody.jsp`
#### Snippet
```java
    String output = "";
    if(cmd != null) {
        String s = null;
        try {
            Process p = Runtime.getRuntime().exec(cmd,null,null);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `cmd != null` is always `true`
in `community/detectors/wso2_arbitrary_file_upload_cve_2022_29464/src/main/resources/com/google/tsunami/plugins/detectors/rce/cve202229464/requestBody.jsp`
#### Snippet
```java
    String cmd = "{{CMD}}";
    String output = "";
    if(cmd != null) {
        String s = null;
        try {
```

