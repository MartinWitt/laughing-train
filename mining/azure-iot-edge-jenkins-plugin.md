# azure-iot-edge-jenkins-plugin 
 
# Bad smells
I found 73 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 14 | false |
| UNUSED_IMPORT | 8 | false |
| ThrowablePrintStackTrace | 8 | false |
| UnusedAssignment | 7 | false |
| DynamicRegexReplaceableByCompiledPattern | 6 | false |
| CharsetObjectCanBeUsed | 5 | false |
| ReturnNull | 5 | false |
| AssignmentToMethodParameter | 3 | false |
| TrivialStringConcatenation | 3 | false |
| ClassNameSameAsAncestorName | 2 | false |
| RedundantMethodOverride | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| UnnecessaryFullyQualifiedName | 2 | false |
| SystemOutErr | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| NestedAssignment | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| SamePackageImport | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
## RuleId[id=CharsetObjectCanBeUsed]
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
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
            // Modify deployment.json structure
            InputStream stream = new FileInputStream(deploymentJsonPath);
            JSONObject deploymentJson = new JSONObject(IOUtils.toString(stream, Constants.CHARSET_UTF_8));
            stream.close();

```

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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            bytes = sha256_HMAC.doFinal(message.getBytes(Constants.CHARSET_UTF_8));
        } catch (Exception e) {
            System.out.println("Error HmacSHA256 ===========" + e.getMessage());
        }
        return bytes;
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `DescriptorImpl` is the same as one of its superclass' names
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
    @Extension
    @Symbol("azureIoTEdgePush")
    public static final class DescriptorImpl extends BaseBuilder.DescriptorImpl {

        public DockerRegistryEndpoint.DescriptorImpl getDockerRegistryEndpointDescriptor() {
```

### ClassNameSameAsAncestorName
Class name `DescriptorImpl` is the same as one of its superclass' names
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
    @Extension
    @Symbol("azureIoTEdgeDeploy")
    public static final class DescriptorImpl extends BaseBuilder.DescriptorImpl {
        public static final String defaultPriority = "10";

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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Env` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/jenkins/iotedge/util/Env.java`
#### Snippet
```java
 * Created by zhqqi on 7/12/2018.
 */
public final class Env {
    public static final String EnvString = "# HOST\n" +
            "#\n" +
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
 * Created by zhqqi on 7/27/2018.
 */
public class Util {
    public static final Pattern targetConditionPattern = Pattern.compile("^(deviceId|tags\\..+|properties\\.reported\\..+).*=.+$");
    public static final Pattern deploymentIdPattern = Pattern.compile("^[a-z0-9-:+%_#*?!(),=@;']+$");
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
        try {
            String encode = URLEncoder.encode(str, Constants.CHARSET_UTF_8);
            encode = encode.replace("+", "%20")
                    .replace("%7E", "~")
                    .replace("%27", "'")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            String encode = URLEncoder.encode(str, Constants.CHARSET_UTF_8);
            encode = encode.replace("+", "%20")
                    .replace("%7E", "~")
                    .replace("%27", "'")
                    .replace("%28", "(")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            encode = encode.replace("+", "%20")
                    .replace("%7E", "~")
                    .replace("%27", "'")
                    .replace("%28", "(")
                    .replace("%29", ")")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
                    .replace("%7E", "~")
                    .replace("%27", "'")
                    .replace("%28", "(")
                    .replace("%29", ")")
                    .replace("%21", "!");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
                    .replace("%27", "'")
                    .replace("%28", "(")
                    .replace("%29", ")")
                    .replace("%21", "!");
            return encode;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
                    .replace("%28", "(")
                    .replace("%29", ")")
                    .replace("%21", "!");
            return encode;
        } catch (UnsupportedEncodingException e) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
        public ListBoxModel doFillResourceGroupItems(@AncestorInPath Item owner,
                                                     @QueryParameter String azureCredentialsId) {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            return listResourceGroupItems(owner, azureCredentialsId);
        }
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
                                               @QueryParameter String resourceGroup) {
            if (StringUtils.isNotBlank(azureCredentialsId) && StringUtils.isNotBlank(resourceGroup)) {
                Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
                return listAcrNameItems(owner, azureCredentialsId, resourceGroup);
            } else {
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
        @POST
        public ListBoxModel doFillAzureCredentialsIdItems(@AncestorInPath final Item owner) {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            return listAzureCredentialsIdItems(owner);
        }
```

### DataFlowIssue
Argument `credentialId` might be null
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
                url = dockerRegistryEndpoint.getUrl();
                credentialId = dockerRegistryEndpoint.getCredentialsId();
                StandardUsernamePasswordCredentials credential = CredentialsProvider.findCredentialById(credentialId, StandardUsernamePasswordCredentials.class, run);
                if (credential != null) {
                    username = credential.getUsername();
```

### DataFlowIssue
Argument `output` might be null
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java
                        null, null);

                String accessToken = new JSONObject(output).getString("access_token");

                output = Util.executePost(String.format(Constants.REST_GET_IOT_KEY_URL, servicePrincipal.getSubscriptionId(), Util.encodeURIComponent(resourceGroup), Util.encodeURIComponent(iothubName)),
```

### DataFlowIssue
Argument `output` might be null
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java
                        "Bearer " + accessToken, "application/json");
                String key = "";
                JSONArray keys = new JSONObject(output).getJSONArray("value");
                for (int i = 0; i < keys.length(); i++) {
                    JSONObject obj = keys.getJSONObject(i);
```

### DataFlowIssue
Argument `output` might be null
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java
                        "application/json");

                JSONArray deviceArr = new JSONArray(output);
                for (int i = 0; i < deviceArr.length(); i++) {
                    model.add(deviceArr.getJSONObject(i).getString("deviceId"));
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
        public FormValidation doCheckPriority(@QueryParameter String value)
                throws IOException, ServletException {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            if (Util.isValidPriority(value)) {
                return FormValidation.ok();
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
        @POST
        public ListBoxModel doFillAzureCredentialsIdItems(@AncestorInPath final Item owner) {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            return listAzureCredentialsIdItems(owner);
        }
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
        public FormValidation doCheckDeploymentId(@QueryParameter String value)
                throws IOException, ServletException {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            if (Util.isValidDeploymentId(value)) {
                return FormValidation.ok();
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
        public ListBoxModel doFillResourceGroupItems(@AncestorInPath Item owner,
                                                     @QueryParameter String azureCredentialsId) {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            return listResourceGroupItems(owner, azureCredentialsId);
        }
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
        public FormValidation doCheckTargetCondition(@QueryParameter String value)
                throws IOException, ServletException {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            if (Util.isValidTargetCondition(value)) {
                return FormValidation.ok();
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
                                                @QueryParameter String resourceGroup,
                                                @QueryParameter String iothubName) {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            if (StringUtils.isNotBlank(azureCredentialsId) && StringUtils.isNotBlank(resourceGroup)&& StringUtils.isNotBlank(iothubName)) {
                return listDeviceIdItems(owner, azureCredentialsId, resourceGroup, iothubName);
```

### DataFlowIssue
Method invocation `checkPermission` may produce `NullPointerException`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
                                                  @QueryParameter String azureCredentialsId,
                                                  @QueryParameter String resourceGroup) {
            Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
            if (StringUtils.isNotBlank(azureCredentialsId) && StringUtils.isNotBlank(resourceGroup)) {
                return listIothubNameItems(owner, azureCredentialsId, resourceGroup);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `edu.umd.cs.findbugs.annotations` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/jenkins/iotedge/util/Constants.java`
#### Snippet
```java
import java.util.TreeMap;

@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(
        value="MS_MUTABLE_COLLECTION_PKGPROTECT",
        justification="Need to initialize iotedgedevEnvMap")
```

### UnnecessaryFullyQualifiedName
Qualifier `edu.umd.cs.findbugs.annotations` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java

    @Override
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(
            value="DLS_DEAD_LOCAL_STORE",
            justification="Don't need use the result from delete file")
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
Unused import `import hudson.util.FormValidation;`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.util.FormValidation;
import hudson.util.ListBoxModel;
import jenkins.model.Jenkins;
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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/AzureIoTEdgePlugin.java`
#### Snippet
```java
            mavenProperties.load(AzureIoTEdgePlugin.class.getClassLoader().getResourceAsStream("project.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/BaseBuilder.java`
#### Snippet
```java
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            return token;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            return encode;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
            if (listener != null && printCommand) listener.getLogger().println(output);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import com.microsoft.jenkins.iotedge.util.Constants;`
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java

import com.microsoft.applicationinsights.core.dependencies.apachecommons.codec.binary.Base64;
import com.microsoft.jenkins.iotedge.util.Constants;

import javax.crypto.Mac;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `resourceUri`
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
    public static String getSharedAccessToken(String resourceUri, String signingKey, String policyName, int expiresInMins) {
        try {
            resourceUri = URLEncoder.encode(resourceUri, Constants.CHARSET_UTF_8);
            // Set expiration in seconds
            long expires = (System.currentTimeMillis() / 1000) + expiresInMins * 60;
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
        String output = null;
        if (File.pathSeparatorChar == ':') {
            command = "" + command;
        } else {
            command = "cmd /c " + command;
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `src/main/java/com/microsoft/jenkins/iotedge/ShellExecuter.java`
#### Snippet
```java
            command = "" + command;
        } else {
            command = "cmd /c " + command;
        }
        try {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgePushBuilder.java`
#### Snippet
```java
                        jenkins.getDescriptor(DockerRegistryEndpoint.class);
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/jenkins/iotedge/util/Util.java`
#### Snippet
```java
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
                        jenkins.getDescriptor(DockerRegistryEndpoint.class);
            } else {
                return null;
            }
        }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`credentialMap.size() != 0` can be replaced with '!credentialMap.isEmpty()'
in `src/main/java/com/microsoft/jenkins/iotedge/EdgeDeployBuilder.java`
#### Snippet
```java
            }
            boolean result = credentialFile.delete();
            if (credentialMap.size() != 0) {
                JSONObject moduleContents = null;
                if (deploymentJson.has("modulesContent")) {
```

## RuleId[id=TrivialStringConcatenation]
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

## RuleId[id=UnusedAssignment]
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

