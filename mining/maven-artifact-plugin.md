# maven-artifact-plugin 
 
# Bad smells
I found 36 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 10 | false |
| ConstantValue | 7 | false |
| DefaultAnnotationParam | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| DataFlowIssue | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| IgnoreResultOfCall | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryBoxing | 1 | false |
## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CheckBuildPlanMojo.java`
#### Snippet
```java
 * @since 3.3.0
 */
@Mojo(name = "check-buildplan", threadSafe = true, requiresProject = true)
public class CheckBuildPlanMojo extends AbstractMojo {
    @Parameter(defaultValue = "${reactorProjects}", required = true, readonly = true)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
     * Artifacts to ignore, specified as <code>extension</code> or <code>classifier.extension</code>.
     */
    @Parameter(property = "buildinfo.ignore", defaultValue = "")
    private Set<String> ignore;

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PluginUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/PluginUtil.java`
#### Snippet
```java
 * Plugin utility to detect if install or deploy is skipped in a build.
 */
class PluginUtil {
    static boolean isSkip(MavenProject project) {
        return isSkip(project, "install") || isSkip(project, "deploy");
```

### UtilityClassWithoutPrivateConstructor
Class `JdkToolchainUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/JdkToolchainUtil.java`
#### Snippet
```java
 * A helper to get JDK version from a JDK toolchain.
 */
class JdkToolchainUtil {
    static String getJavaVersion(Toolchain toolchain) {
        String version = "unknown";
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
        // save .compare file
        File buildcompare = new File(
                buildinfoFile.getParentFile(), buildinfoFile.getName().replaceFirst(".buildinfo$", ".buildcompare"));
        try (PrintWriter p = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(buildcompare), StandardCharsets.UTF_8)))) {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.resolution` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java

            return destFile;
        } catch (org.eclipse.aether.resolution.ArtifactResolutionException are) {
            if (are.getResult().isMissing()) {
                throw new ArtifactNotFoundException("Artifact not found " + artifact, artifact);
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `last` might be null
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
            MavenProject last = getLastProject();
            if (project != last) {
                skip(last);
                return;
            }
```

### DataFlowIssue
Dereference of `currentEnv` may produce `NullPointerException`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java

                            ReproducibleEnv currentEnv = extractEnv(artifact.getFile(), artifact);
                            currentJavaVersion = currentEnv.javaVersion;
                            currentOsName = currentEnv.osName;
                        }
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`prefix = prefix + i` could be simplified to 'prefix += i'
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/BuildInfoWriter.java`
#### Snippet
```java

    private void printArtifact(String prefix, int i, Artifact artifact) throws MojoExecutionException {
        prefix = prefix + i;
        File artifactFile = artifact.getFile();
        if (artifactFile.isDirectory()) {
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CheckBuildPlanMojo.java`
#### Snippet
```java
public class CheckBuildPlanMojo extends AbstractMojo {
    @Parameter(defaultValue = "${reactorProjects}", required = true, readonly = true)
    private List<MavenProject> reactorProjects;

    @Parameter(defaultValue = "${project}", readonly = true)
```

### MismatchedCollectionQueryUpdate
Contents of collection `remoteRepos` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${project.remoteProjectRepositories}", readonly = true)
    private List<RemoteRepository> remoteRepos;

    @Component
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
        value = attr.getValue("Build-Jdk");
        if (value != null) {
            return String.valueOf(value) + " (from MANIFEST.MF Build-Jdk)";
        }

```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CheckBuildPlanMojo.java`
#### Snippet
```java
                    plugin = "org.apache.maven.plugins:" + plugin;
                }
                result.put(plugin, entry.getValue());
            }
            return result;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/BuildInfoWriter.java`
#### Snippet
```java

    private void printArtifact(String prefix, int i, Artifact artifact) throws MojoExecutionException {
        prefix = prefix + i;
        File artifactFile = artifact.getFile();
        if (artifactFile.isDirectory()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `javaVersion`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/BuildInfoWriter.java`
#### Snippet
```java
    private static String extractJavaMajorVersion(String javaVersion) {
        if (javaVersion.startsWith("1.")) {
            javaVersion = javaVersion.substring(2);
        }
        int index = javaVersion.indexOf('.'); // for example 8.0_202
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/PluginUtil.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
        @Override
        public WorkspaceReader getWorkspaceReader() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
            log.warn("unable to open jar file " + file, e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
        ZipEntry zipEntry = jar.getEntry(entryName);
        if (zipEntry == null) {
            return null;
        }
        try (InputStream in = jar.getInputStream(zipEntry)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
            log.warn("Unable to read " + entryName + " from " + jar, e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`artifactHandler.getExtension().length() > 0` can be replaced with '!artifactHandler.getExtension().isEmpty()'
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/BuildInfoWriter.java`
#### Snippet
```java

        if (artifactHandler.getExtension() != null
                && artifactHandler.getExtension().length() > 0) {
            path.append('.').append(artifactHandler.getExtension());
        }
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `version == null` is always `false`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/JdkToolchainUtil.java`
#### Snippet
```java
                CommandLineUtils.executeCommandLine(cl, out, err);
                version = StringUtils.join(err.getLines().iterator(), ":");
                if (version == null) {
                    version = "unable to detect...";
                }
```

### ConstantValue
Condition `referenceBuildinfo == null` is always `true`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
        }

        if (referenceBuildinfo == null) {
            // download reference artifacts and guess Java version and OS
            String javaVersion = null;
```

### ConstantValue
Condition `osName != null` is always `false` when reached
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
                BuildInfoWriter bi = new BuildInfoWriter(log, p, mono, artifactHandlerManager, rtInformation);

                if (javaVersion != null || osName != null) {
                    p.println("# effective build environment information");
                    if (javaVersion != null) {
```

### ConstantValue
Condition `javaVersion != null` is always `true`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
                if (javaVersion != null || osName != null) {
                    p.println("# effective build environment information");
                    if (javaVersion != null) {
                        p.println("java.version=" + javaVersion);
                        log.info("Reference build java.version: " + javaVersion);
```

### ConstantValue
Condition `reference == null` is always `false` when reached
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
        // reference file name is taken from repository format
        File reference = new File(referenceDir, getRepositoryFilename(a));
        if ((actual == null) || (reference == null)) {
            return "missing file for " + a.getId() + " reference = "
                    + (reference == null ? "null" : relative(reference)) + " actual = "
```

### ConstantValue
Condition `reference == null` is always `false`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
        if ((actual == null) || (reference == null)) {
            return "missing file for " + a.getId() + " reference = "
                    + (reference == null ? "null" : relative(reference)) + " actual = "
                    + (actual == null ? "null" : relative(actual));
        }
```

### ConstantValue
Condition `actual == null` is always `true`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
            return "missing file for " + a.getId() + " reference = "
                    + (reference == null ? "null" : relative(reference)) + " actual = "
                    + (actual == null ? "null" : relative(actual));
        }
        return "diffoscope " + relative(reference) + " " + relative(actual);
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
        MavenProject root = mono ? project : getExecutionRoot();

        buildinfoFile.getParentFile().mkdirs();

        try (PrintWriter p = new PrintWriter(new BufferedWriter(
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
        MavenProject root = mono ? project : getExecutionRoot();
        File referenceDir = new File(root.getBuild().getDirectory(), "reference");
        referenceDir.mkdirs();

        // download or create reference buildinfo
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/PluginUtil.java`
#### Snippet
```java
            skip = project.getProperties().getProperty("maven." + id + ".skip");
        }
        return Boolean.valueOf(skip);
    }

```

