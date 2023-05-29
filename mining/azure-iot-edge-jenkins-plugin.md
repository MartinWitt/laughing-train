# azure-iot-edge-jenkins-plugin 
 
# Bad smells
I found 30 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 7 | false |
| UnusedAssignment | 7 | false |
| CharsetObjectCanBeUsed | 5 | false |
| TrivialStringConcatenation | 3 | false |
| RedundantMethodOverride | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IOStreamConstructor | 1 | false |
| JavadocReference | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| FieldMayBeFinal | 1 | false |
## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
            String line = "";
            exitCode = p.join();
            output = new String(baos.toByteArray(), Constants.CHARSET_UTF_8);
            if (listener != null && printCommand) listener.getLogger().println(output);
        } catch (IOException e) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            SecretKeySpec secret_key = new SecretKeySpec(secret, "HmacSHA256");
            sha256_HMAC.init(secret_key);
            bytes = sha256_HMAC.doFinal(message.getBytes(Constants.CHARSET_UTF_8));
        } catch (Exception e) {
            System.out.println("Error HmacSHA256 ===========" + e.getMessage());
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java

            connection.setRequestProperty("Content-Length",
                    Integer.toString(urlParameters.getBytes(Constants.CHARSET_UTF_8).length));

            connection.setUseCaches(false);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Constants.CHARSET_UTF_8));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
            // Modify deployment.json structure
            InputStream stream = new FileInputStream(deploymentJsonPath);
            JSONObject deploymentJson = new JSONObject(IOUtils.toString(stream, Constants.CHARSET_UTF_8));
            stream.close();

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isApplicable()` is identical to its super method
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }
```

### RedundantMethodOverride
Method `isApplicable()` is identical to its super method
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
expiresInMins \* 60: integer multiplication implicitly cast to long
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            resourceUri = URLEncoder.encode(resourceUri, Constants.CHARSET_UTF_8);
            // Set expiration in seconds
            long expires = (System.currentTimeMillis() / 1000) + expiresInMins * 60;

            String toSign = resourceUri + "\n" + expires;
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java

            // Modify deployment.json structure
            InputStream stream = new FileInputStream(deploymentJsonPath);
            JSONObject deploymentJson = new JSONObject(IOUtils.toString(stream, Constants.CHARSET_UTF_8));
            stream.close();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Item`
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java
         * Leave for backward compatibility in azure-function plugin.
         *
         * @deprecated see {@link #listResourceGroupItems(Item, String)}.
         */
        @Deprecated
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            Map<String, String> envVars = new HashMap<>();
            envVars.putAll(System.getenv());
            if(run != null) envVars.putAll(run.getEnvVars());
            envVars.putAll(envs);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.microsoft.azure.management.containerregistry.implementation.ContainerRegistryManager;`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
import com.microsoft.azure.management.containerregistry.Registry;
import com.microsoft.azure.management.containerregistry.RegistryCredentials;
import com.microsoft.azure.management.containerregistry.implementation.ContainerRegistryManager;
import com.microsoft.jenkins.iotedge.model.AzureCloudException;
import com.microsoft.jenkins.iotedge.model.DockerCredential;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.jenkins.iotedge.util.Env;`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
import com.microsoft.jenkins.iotedge.util.AzureUtils;
import com.microsoft.jenkins.iotedge.util.Constants;
import com.microsoft.jenkins.iotedge.util.Env;
import hudson.AbortException;
import hudson.Extension;
```

### UNUSED_IMPORT
Unused import `import javax.servlet.ServletException;`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
import org.kohsuke.stapler.QueryParameter;

import javax.servlet.ServletException;
import javax.ws.rs.POST;
import java.io.*;
```

### UNUSED_IMPORT
Unused import `import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;`
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
import hudson.model.Run;
import hudson.model.TaskListener;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
```

### UNUSED_IMPORT
Unused import `import java.nio.charset.StandardCharsets;`
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
```

### UNUSED_IMPORT
Unused import `import java.security.MessageDigest;`
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import java.security.NoSuchAlgorithmException;`
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
        String output = null;
        if (File.pathSeparatorChar == ':') {
            command = "" + command;
        } else {
            command = "cmd /c " + command;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
                azExecuter.login(credentialCache);

                String scriptToDelete = "az iot edge deployment delete --hub-name " + iothubName + " --config-id " + deploymentId + "";
                azExecuter.executeAZ(scriptToDelete, false);
            } catch (AzureCloudException e) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
            }

            String scriptToDeploy = "az iot edge deployment create --config-id " + deploymentId + " --hub-name " + iothubName + " --content " + deploymentJsonPath + " --target-condition \"" + condition + "\" --priority " + priority + "";
            executer.executeAZ(scriptToDeploy, true);

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
            String line = "";
            exitCode = p.join();
            output = new String(baos.toByteArray(), Constants.CHARSET_UTF_8);
            if (listener != null && printCommand) listener.getLogger().println(output);
        } catch (IOException e) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `output` initializer `null` is redundant
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java
            if (StringUtils.isNotBlank(azureCredentialsId)) {
                AzureCredentials.ServicePrincipal servicePrincipal = AzureCredentials.getServicePrincipal(azureCredentialsId);
                String output = null;

                output = Util.executePost(String.format(Constants.REST_GET_TOKEN_URL, servicePrincipal.getTenant()),
```

### UnusedAssignment
Variable `rootPath` initializer `DescriptorImpl.defaultRootPath` is redundant
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java
    private String azureCredentialsId;
    private String resourceGroup;
    private String rootPath = DescriptorImpl.defaultRootPath;

    protected BaseBuilder(String azureCredentialsId, String resourceGroup, String rootPath) {
```

### UnusedAssignment
Variable `writer` initializer `null` is redundant
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java

    protected void writeEnvFile(String path, String url, String bypassModules) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path, Constants.CHARSET_UTF_8);
```

### UnusedAssignment
Variable `credentialId` initializer `null` is redundant
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
        try {
            boolean isAcr = dockerRegistryType.equals(Constants.DOCKER_REGISTRY_TYPE_ACR);
            String credentialId = null;
            String url = "", username = "", password = "";

```

### UnusedAssignment
Variable `url` initializer `""` is redundant
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
            boolean isAcr = dockerRegistryType.equals(Constants.DOCKER_REGISTRY_TYPE_ACR);
            String credentialId = null;
            String url = "", username = "", password = "";

            if (isAcr) {
```

### UnusedAssignment
Variable `moduleContents` initializer `null` is redundant
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
            boolean result = credentialFile.delete();
            if (credentialMap.size() != 0) {
                JSONObject moduleContents = null;
                if (deploymentJson.has("modulesContent")) {
                    moduleContents = deploymentJson.getJSONObject("modulesContent");
```

### UnusedAssignment
Variable `condition` initializer `""` is redundant
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java

            // deploy using azure cli
            String condition = "";
            if (deploymentType.equals("multiple")) {
                condition = targetCondition;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `mavenProperties` may be 'final'
in `src/main/java/com/microsoft/jenkins/iotedge/AzureIoTEdgePlugin.java`
#### Snippet
```java

public class AzureIoTEdgePlugin extends Plugin {
    private static Properties mavenProperties;
    static {
        mavenProperties = new Properties();
```

