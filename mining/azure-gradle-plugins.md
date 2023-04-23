# azure-gradle-plugins 
 
# Bad smells
I found 96 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| GroovyUnusedAssignment | 33 | false |
| NullableProblems | 24 | false |
| ReturnNull | 8 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| BoundedWildcard | 5 | false |
| IgnoreResultOfCall | 5 | false |
| UtilityClassWithoutPrivateConstructor | 4 | true |
| SizeReplaceableByIsEmpty | 4 | true |
| ConditionCoveredByFurtherCondition | 1 | false |
| DataFlowIssue | 1 | false |
| Convert2MethodRef | 1 | false |
| NotNullFieldNotInitialized | 1 | false |
| SynchronizeOnThis | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition '!firstRunValue.isEmpty()' covered by subsequent condition 'firstRunValue.equalsIgnoreCase(...)'
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
#### Snippet
```java
                    prop.load(input);
                    final String firstRunValue = prop.getProperty(FIRST_RUN_KEY);
                    if (firstRunValue != null && !firstRunValue.isEmpty() && firstRunValue.equalsIgnoreCase("false")) {
                        return false;
                    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FunctionUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/util/FunctionUtils.java`
#### Snippet
```java
import java.io.File;

public class FunctionUtils {
    private static final String STAGE_DIR_FOUND = "Azure Function App's staging directory found at: ";
    private static final String STAGE_DIR_NOT_FOUND =
```

### UtilityClassWithoutPrivateConstructor
Class `TelemetryConstants` has only 'static' members, and lacks a 'private' constructor
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryConstants.java`
#### Snippet
```java
package com.microsoft.azure.gradle.temeletry;

public class TelemetryConstants {
    public static final String TELEMETRY_NOT_ALLOWED = "TelemetryNotAllowed";
    public static final String PLUGIN_NAME_KEY = "pluginName";
```

### UtilityClassWithoutPrivateConstructor
Class `GradleAuthHelper` has only 'static' members, and lacks a 'private' constructor
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/auth/GradleAuthHelper.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class GradleAuthHelper {
    protected static final String SUBSCRIPTION_TEMPLATE = "Subscription: %s(%s)";
    private static final String USING_AZURE_ENVIRONMENT = "Using Azure environment: %s.";
```

### UtilityClassWithoutPrivateConstructor
Class `GradleProjectUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/util/GradleProjectUtils.java`
#### Snippet
```java
 * Convert a Gradle project to a common project
 */
public class GradleProjectUtils {
    private static final String MAIN_SOURCE_SET_NAME = "main";
    private static final String DEPENDENCY_WARNING = "The following dependencies could not be found, " +
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
            throw new AzureToolkitRuntimeException(EMPTY_APP_NAME);
        }
        if (appName.startsWith("-") || !appName.matches(APP_NAME_PATTERN)) {
            throw new AzureToolkitRuntimeException(INVALID_APP_NAME);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
            throw new AzureToolkitRuntimeException(EMPTY_RESOURCE_GROUP);
        }
        if (resourceGroup.endsWith(".") || !resourceGroup.matches(RESOURCE_GROUP_PATTERN)) {
            throw new AzureToolkitRuntimeException(INVALID_RESOURCE_GROUP_NAME);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
        final String appServicePlanName = ctx.getAppServicePlanName();
        // asp name & resource group
        if (StringUtils.isNotEmpty(appServicePlanName) && !appServicePlanName.matches(APP_SERVICE_PLAN_NAME_PATTERN)) {
            throw new AzureToolkitRuntimeException(String.format(INVALID_SERVICE_PLAN_NAME, APP_SERVICE_PLAN_NAME_PATTERN));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
        final String appServicePlanResourceGroup = ctx.getAppServicePlanResourceGroup();
        if (StringUtils.isNotEmpty(appServicePlanResourceGroup) &&
            (appServicePlanResourceGroup.endsWith(".") || !appServicePlanResourceGroup.matches(RESOURCE_GROUP_PATTERN))) {
            throw new AzureToolkitRuntimeException(INVALID_SERVICE_PLAN_RESOURCE_GROUP_NAME);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/GradleFunctionContext.java`
#### Snippet
```java
            synchronized (this) {
                if (stagingDirectory == null) {
                    final String outputFolder = AzureFunctionsPlugin.GRADLE_PLUGIN_NAME.replaceAll(GRADLE_PLUGIN_POSTFIX, "");

                    final String stagingDirectoryPath = Paths.get(this.javaProject.getBuildDirectory().toString(),
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getExitValue` may produce `NullPointerException`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/task/LocalRunTask.java`
#### Snippet
```java
            this.setIgnoreExitValue(true);
            super.exec();
            final int code = this.getExecResult().getExitValue();
            for (final Long validCode : CommandUtils.getValidReturnCodes()) {
                if (validCode != null && validCode.intValue() == code) {
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
#### Snippet
```java
        final HashMap<String, String> failureReason = new HashMap<>();
        final String errorMessage = Optional.ofNullable(exception.getMessage())
                .filter(StringUtils::isNotEmpty).orElseGet(() -> exception.toString());
        failureReason.put(ERROR_MESSAGE, errorMessage);
        failureReason.put(ERROR_STACK, ExceptionUtils.getStackTrace(exception));
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# MIT License
#
# Copyright (c) Microsoft Corporation. All rights reserved.
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all
# copies or substantial portions of the Software.
#
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.

```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.

```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.

```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.

```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.

```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.

```

### GroovyUnusedAssignment
Variable is not used
in `azure-webapp-gradle-plugin/settings.gradle`
#### Snippet
```java
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.

```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/AzureWebappPluginExtension.java`
#### Snippet
```java
    private Boolean disableAppInsights;

    @Nonnull
    private Project project;

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/AzureWebappPlugin.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/AzureWebappPlugin.java`
#### Snippet
```java
            return project.getTasks().named(WarPlugin.WAR_TASK_NAME);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/AzureWebappPlugin.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java

    private JavaVersion javaVersion() {
        return Objects.isNull(ctx.getRuntime()) ? null : JavaVersion.fromString(ctx.getRuntime().javaVersion());
    }

```

### ReturnNull
Return of `null`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
        final GradleRuntimeConfig runtime = ctx.getRuntime();
        if (runtime == null) {
            return null;
        }
        final OperatingSystem os = Optional.ofNullable(runtime.os()).map(OperatingSystem::fromString).orElse(null);
```

### ReturnNull
Return of `null`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
        String pricingTier = ctx.getPricingTier();
        if (StringUtils.isEmpty(pricingTier)) {
            return null;
        }
        return Optional.ofNullable(PricingTier.fromString(pricingTier))
```

### ReturnNull
Return of `null`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/GradleFunctionContext.java`
#### Snippet
```java
    public String getDeploymentType() {
        if (this.functionsExtension.getDeployment() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
            return JsonParser.parseString(jsonRaw).getAsJsonObject();
        } catch (IOException e) {
            return null;
        }
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`configMap.size() == 0` can be replaced with 'configMap.isEmpty()'
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
    private void validateFunctionConfigurations(final Map<String, FunctionConfiguration> configMap) {
        AzureMessager.getMessager().info(LINE_FEED + VALIDATE_CONFIG);
        if (configMap.size() == 0) {
            AzureMessager.getMessager().info(VALIDATE_SKIP);
        } else {
```

### SizeReplaceableByIsEmpty
`methods.size() == 0` can be replaced with 'methods.isEmpty()'
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
        final Set<Method> methods = findAnnotatedMethods(annotationHandler);

        if (methods.size() == 0) {
            throw new AzureExecutionException(NO_FUNCTIONS);
        }
```

### SizeReplaceableByIsEmpty
`configMap.size() == 0` can be replaced with 'configMap.isEmpty()'
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
        AzureMessager.getMessager().info(LINE_FEED + GENERATE_CONFIG);
        final Map<String, FunctionConfiguration> configMap = handler.generateConfigurations(methods);
        if (configMap.size() == 0) {
            AzureMessager.getMessager().info(GENERATE_SKIP);
        } else {
```

### SizeReplaceableByIsEmpty
`configMap.size() == 0` can be replaced with 'configMap.isEmpty()'
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
                                        final Map<String, FunctionConfiguration> configMap) throws IOException {
        AzureMessager.getMessager().info(LINE_FEED + SAVE_FUNCTION_JSONS);
        if (configMap.size() == 0) {
            AzureMessager.getMessager().info(SAVE_SKIP);
        } else {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/GradleFunctionContext.java`
#### Snippet
```java
    public String getDeploymentStagingDirectoryPath() {
        if (stagingDirectory == null) {
            synchronized (this) {
                if (stagingDirectory == null) {
                    final String outputFolder = AzureFunctionsPlugin.GRADLE_PLUGIN_NAME.replaceAll(GRADLE_PLUGIN_POSTFIX, "");
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java

    private Set<BindingEnum> getFunctionBindingEnums(Map<String, FunctionConfiguration> configMap) {
        final Set<BindingEnum> result = new HashSet<>();
        configMap.values().forEach(
            configuration -> configuration.getBindings().forEach(binding -> result.add(binding.getBindingEnum())));
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Subscription`
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/auth/GradleAuthHelper.java`
#### Snippet
```java

    private static String getTargetSubscriptionId(String defaultSubscriptionId,
                                                  List<Subscription> subscriptions,
                                                  List<Subscription> selectedSubscriptions) {
        String targetSubscriptionId = defaultSubscriptionId;
```

### BoundedWildcard
Can generalize to `? extends Subscription`
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/auth/GradleAuthHelper.java`
#### Snippet
```java
    private static String getTargetSubscriptionId(String defaultSubscriptionId,
                                                  List<Subscription> subscriptions,
                                                  List<Subscription> selectedSubscriptions) {
        String targetSubscriptionId = defaultSubscriptionId;
        if (StringUtils.isBlank(targetSubscriptionId) && !selectedSubscriptions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super ValidationMessage`
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/DeployTask.java`
#### Snippet
```java
    }

    protected void validateConfiguration(Consumer<ValidationMessage> validationMessageConsumer, Object rawConfig) {
        final List<ValidationMessage> validate = SchemaValidator.getInstance().validate("GradleWebAppConfiguration",
            rawConfig, "azurewebapp");
```

### BoundedWildcard
Can generalize to `? extends FunctionConfiguration`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
    }

    private void trackFunctionProperties(Map<String, FunctionConfiguration> configMap) {
        final List<String> bindingTypeSet = configMap.values().stream().flatMap(configuration -> configuration.getBindings().stream())
                .map(Binding::getType)
```

### BoundedWildcard
Can generalize to `? extends FunctionConfiguration`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
    }

    private Set<BindingEnum> getFunctionBindingEnums(Map<String, FunctionConfiguration> configMap) {
        final Set<BindingEnum> result = new HashSet<>();
        configMap.values().forEach(
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `RunnableWithException` ends with 'Exception'
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
    }

    private interface RunnableWithException {
        void run() throws Exception;
    }
```

## RuleId[id=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsPlugin.java`
#### Snippet
```java
    }

    @Nullable
    private static void mergeCommandLineParameters(final AzureFunctionsExtension config) {
        final JavaPropsMapper mapper = new JavaPropsMapper();
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getAppServicePlanResourceGroup() {
        return appServicePlanResourceGroup;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public GradleDeploymentSlotConfig getDeploymentSlot() {
        return deploymentSlot;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public GradleRuntimeConfig getRuntime() {
        return runtime;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getAppInsightsInstance() {
        return appInsightsInstance;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setAppServicePlanName(String appServicePlanName) {
        this.appServicePlanName = appServicePlanName;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getAppServicePlanName() {
        return appServicePlanName;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setRegion(String region) {
        this.region = region;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public GradleAuthConfig getAuth() {
        return auth;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setAppServicePlanResourceGroup(String appServicePlanResourceGroup) {
        this.appServicePlanResourceGroup = appServicePlanResourceGroup;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setPricingTier(String pricingTier) {
        this.pricingTier = pricingTier;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getLocalDebug() {
        return this.localDebug;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public Boolean getAllowTelemetry() {
        return allowTelemetry;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getAppInsightsKey() {
        return appInsightsKey;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getSubscription() {
        return subscription;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getRegion() {
        return region;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getPricingTier() {
        return pricingTier;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public Deployment getDeployment() {
        return deployment;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setAllowTelemetry(Boolean allowTelemetry) {
        this.allowTelemetry = allowTelemetry;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setLocalDebug(String localDebug) {
        this.localDebug = localDebug;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getResourceGroup() {
        return resourceGroup;
    }
```

### NullableProblems
Primitive type members cannot be annotated
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/AzureWebappPlugin.java`
#### Snippet
```java
    }

    @Nullable
    private static void mergeCommandLineParameters(final AzureWebappPluginExtension config) {
        final JavaPropsMapper mapper = new JavaPropsMapper();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `Region.fromName(config.region()) != null` is always `true` when reached
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/DeployTask.java`
#### Snippet
```java

    private void normalizeConfigValue(GradleWebAppConfig config) {
        if (StringUtils.isNotBlank(config.region()) && Region.fromName(config.region()) != null) {
            config.region(Region.fromName(config.region()).getName());
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/task/PackageTask.java`
#### Snippet
```java
                FileUtils.cleanDirectory(stagingFolder);
            } else {
                stagingFolder.mkdirs();
            }
            final PackageHandler packageHandler = new PackageHandler(ctx.getProject(), ctx.getDeploymentStagingDirectoryPath());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
#### Snippet
```java
                }
            } else {
                configurationFile.getParentFile().mkdirs();
                configurationFile.createNewFile();
            }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
#### Snippet
```java
            } else {
                configurationFile.getParentFile().mkdirs();
                configurationFile.createNewFile();
            }
        } catch (Exception e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/GradleFunctionContext.java`
#### Snippet
```java
                    // If staging directory doesn't exist, create one and delete it on exit
                    if (!stagingDirectory.exists()) {
                        stagingDirectory.mkdirs();
                    }
                }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
            throw new AzureToolkitRuntimeException("Cannot create folder: " + targetFile.getParentFile().getAbsolutePath());
        }
        targetFile.createNewFile();
        objectWriter.writeValue(targetFile, object);
    }
```

