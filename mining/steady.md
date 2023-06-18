# steady 
 
# Bad smells
I found 68 bad smells with 68 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 68 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/it/java/StubServerSetup.java`
#### Snippet
```java
ConnectType.READ_WRITE.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java-reach-soot/src/main/java/org/eclipse/steady/cg/soot/CustomEntryPointCreator.java`
#### Snippet
```java
methodToImplement.getReturnType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java-reach-wala/src/main/java/org/eclipse/steady/cg/wala/WalaCallgraphConstructor.java`
#### Snippet
```java
_t.getName().getClassName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java-reach-wala/src/main/java/org/eclipse/steady/cg/wala/WalaCallgraphConstructor.java`
#### Snippet
```java
_t.getName().getClassName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTConstructBodySignature.java`
#### Snippet
```java
n.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTConstructBodySignature.java`
#### Snippet
```java
node.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignature.java`
#### Snippet
```java
fRoot.print(new StringBuilder()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignatureChange.java`
#### Snippet
```java
change.getChangedEntity().getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignatureComparator.java`
#### Snippet
```java
astRoot.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignatureComparator.java`
#### Snippet
```java
_s.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignatureComparator.java`
#### Snippet
```java
astRoot.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignatureComparator.java`
#### Snippet
```java
astRoot.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignatureComparator.java`
#### Snippet
```java
node.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignatureComparator.java`
#### Snippet
```java
astRoot.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/ASTSignatureComparator.java`
#### Snippet
```java
node.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/gson/ASTConstructBodySignatureSerializer.java`
#### Snippet
```java
n.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/gson/ASTConstructBodySignatureSerializer.java`
#### Snippet
```java
n.getEntity().getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/gson/ASTSignatureChangeSerializer.java`
#### Snippet
```java
_entity.getUniqueName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/gson/ASTSignatureChangeSerializer.java`
#### Snippet
```java
_entity.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/gson/ASTSignatureChangeSerializer.java`
#### Snippet
```java
value.getStructureEntity().getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/main/java/org/eclipse/steady/java/sign/gson/ASTSignatureChangeSerializer.java`
#### Snippet
```java
change.getChangeType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-gradle/src/main/java/org/eclipse/steady/java/gradle/AbstractVulasTask.java`
#### Snippet
```java
jc.getDestinationDir().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-gradle/src/main/java/org/eclipse/steady/java/gradle/GradleProjectUtilities.java`
#### Snippet
```java
project.getProperties().get(propertyName).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getDirectory(), "vulas", "tmp").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getDirectory(), "vulas", "upload").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getDirectory()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getDirectory(), "vulas", "target").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getDirectory(), "vulas", "include").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getDirectory(), "vulas", "lib").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getDirectory(), "vulas", "report").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getOutputDirectory()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
Paths.get(_prj.getBuild().getSourceDirectory()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasMojo.java`
#### Snippet
```java
a.getFile().toPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getDirectory(), "vulas", "tmp").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getDirectory(), "vulas", "upload").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getDirectory()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getDirectory(), "vulas", "target").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getDirectory(), "vulas", "include").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getDirectory(), "vulas", "lib").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getDirectory(), "vulas", "report").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getOutputDirectory()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/plugin-maven/src/main/java/org/eclipse/steady/java/mvn/AbstractVulasSpaceMojo.java`
#### Snippet
```java
Paths.get(this.project.getBuild().getSourceDirectory()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-python/src/main/java/org/eclipse/steady/python/Python335FileAnalyzer.java`
#### Snippet
```java
ctx.NAME().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-python/src/main/java/org/eclipse/steady/python/Python335FileAnalyzer.java`
#### Snippet
```java
ctx.arglist().getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-python/src/main/java/org/eclipse/steady/python/Python335FileAnalyzer.java`
#### Snippet
```java
ctx.NAME().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-python/src/main/java/org/eclipse/steady/python/Python3FileAnalyzer.java`
#### Snippet
```java
ctx.NAME().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-python/src/main/java/org/eclipse/steady/python/Python3FileAnalyzer.java`
#### Snippet
```java
ctx.arglist().getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-python/src/main/java/org/eclipse/steady/python/Python3FileAnalyzer.java`
#### Snippet
```java
ctx.NAME().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/rest-backend/src/main/java/org/eclipse/steady/backend/cve/CveReader2.java`
#### Snippet
```java
descriptions.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/rest-backend/src/test/java/org/eclipse/steady/backend/util/ConnectionUtilTest.java`
#### Snippet
```java
g.getProxy().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/repo-client/src/main/java/org/eclipse/steady/svn/SvnClient.java`
#### Snippet
```java
entry.getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/repo-client/src/main/java/org/eclipse/steady/svn/SvnClient.java`
#### Snippet
```java
entry.getRepositoryRoot().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/repo-client/src/main/java/org/eclipse/steady/svn/SvnClient.java`
#### Snippet
```java
this.rootRepo.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/shared/src/main/java/org/eclipse/steady/shared/util/VulasConfiguration.java`
#### Snippet
```java
subset.getProperty(key).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/shared/src/main/java/org/eclipse/steady/shared/util/VulasConfiguration.java`
#### Snippet
```java
config.getProperty(key).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/test/resources/ws_security_1438423/src/main/java/org/apache/cxf/ws/security/policy/interceptors/KerberosTokenInterceptorProvider.java`
#### Snippet
```java
info.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/test/resources/ws_security_1438423/src/main/java/org/apache/cxf/ws/security/policy/interceptors/NegotiationUtils.java`
#### Snippet
```java
info.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/policy/interceptors/SecureConversationOutInterceptor.java`
#### Snippet
```java
message.getContextualProperty(Message.ENDPOINT_ADDRESS).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/patch-analyzer/src/test/resources/ws_security_1438423/src/main/java/org/apache/cxf/ws/security/policy/interceptors/SecureConversationTokenInterceptorProvider.java`
#### Snippet
```java
message.getContextualProperty(Message.ENDPOINT_ADDRESS).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/patch-analyzer/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/policy/interceptors/IssuedTokenInterceptorProvider.java`
#### Snippet
```java
info.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/patch-analyzer/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/policy/interceptors/IssuedTokenInterceptorProvider.java`
#### Snippet
```java
message.getContextualProperty(Message.ENDPOINT_ADDRESS).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/patch-analyzer/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/policy/interceptors/SpnegoTokenInterceptorProvider.java`
#### Snippet
```java
message.getContextualProperty(Message.ENDPOINT_ADDRESS).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/patch-analyzer/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceProvider.java`
#### Snippet
```java
((JAXBElement<?>) (o)).getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/trust/STSUtils.java`
#### Snippet
```java
ep.getEndpointInfo().getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/trust/STSUtils.java`
#### Snippet
```java
ep.getEndpointInfo().getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/patch-analyzer/src/test/resources/ws_security_1438423/src/main/java/org/apache/cxf/ws/security/trust/STSTokenValidator.java`
#### Snippet
```java
info.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/patch-analyzer/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JUtils.java`
#### Snippet
```java
info.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-steady77744700652721249991458295423152781776/lang-java/src/test/resources/ws_security_1438424/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java`
#### Snippet
```java
info.getName().toString()
```

