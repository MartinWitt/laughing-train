# conjure-python 
 
# Bad smells
I found 39 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 15 | false |
| CodeBlock2Expr | 8 | true |
| OptionalGetWithoutIsPresent | 6 | false |
| AbstractClassNeverImplemented | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| SystemOutErr | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| BoundedWildcard | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'docs'
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/EnumSnippet.java`
#### Snippet
```java
        Optional<Documentation> docs();

        static PythonEnumValue of(String name, Optional<Documentation> docs) {
            return ImmutablePythonEnumValue.builder().name(name).docs(docs).build();
        }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `conjure-python/src/main/java/com/palantir/conjure/python/cli/ConjurePythonCli.java`
#### Snippet
```java
    @Override
    public void run() {
        CommandLine.usage(this, System.out);
    }

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `conjure-python-core/src/main/java/com/palantir/conjure/python/DefaultPythonFileWriter.java`
#### Snippet
```java
            Files.createDirectories(filePath.getParent());
            try (OutputStream os = Files.newOutputStream(filePath);
                    PrintStream ps = new PrintStream(os, false, StandardCharsets.UTF_8.toString())) {
                PythonPoetWriter writer = new PythonPoetWriter(ps);
                writer.emit(file);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`imports.size() > 0` can be replaced with '!imports.isEmpty()'
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonFile.java`
#### Snippet
```java
                    .build()
                    .emit(poetWriter));
            if (imports.size() > 0) {
                poetWriter.writeLine();
            }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonEndpointDefinition.java`
#### Snippet
```java

            HttpPath fullPath = httpPath();
            String fixedPath = fullPath.toString().replaceAll("\\{(.*):[^}]*}", "{$1}");
            poetWriter.writeIndentedLine("_path = '%s'", fixedPath);
            poetWriter.writeIndentedLine("_path = _path.format(**_path_params)");
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonFileWriter.java`
#### Snippet
```java
        checkState(!components.isEmpty());
        Path packageDir = Paths.get(
                components.get(0), components.subList(1, components.size()).toArray(new String[0]));
        return packageDir.resolve(file.fileName());
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `conjure-python/src/main/java/com/palantir/conjure/python/cli/ConjurePythonCli.java`
#### Snippet
```java
                generator.write(conjureDefinition, new DefaultPythonFileWriter(Paths.get(output)));
            } catch (IOException e) {
                throw new RuntimeException(String.format("Error parsing definition: %s", e.toString()));
            }
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends PackageNameProcessor`
in `conjure-python-core/src/main/java/com/palantir/conjure/python/processors/packagename/CompoundPackageNameProcessor.java`
#### Snippet
```java
    private final List<PackageNameProcessor> processors;

    public CompoundPackageNameProcessor(List<PackageNameProcessor> processors) {
        this.processors = processors;
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `CliConfiguration` has no concrete subclass
in `conjure-python/src/main/java/com/palantir/conjure/python/cli/CliConfiguration.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class CliConfiguration {
    abstract File input();

```

### AbstractClassNeverImplemented
Abstract class `BuildConfiguration` has no concrete subclass
in `conjure-python/src/main/java/com/palantir/conjure/python/cli/BuildConfiguration.java`
#### Snippet
```java
@ImmutablesStyle
@JsonDeserialize(as = ImmutableBuildConfiguration.class)
public abstract class BuildConfiguration {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper(new YAMLFactory());
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonMetaYaml.java`
#### Snippet
```java
            poetWriter.writeIndentedLine("- python");
            poetWriter.writeIndentedLine("- setuptools");
            installDependencies().forEach(dependency -> {
                poetWriter.writeIndentedLine("- %s", dependency);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonMetaYaml.java`
#### Snippet
```java
            poetWriter.increaseIndent();
            poetWriter.writeIndentedLine("- python");
            installDependencies().forEach(dependency -> {
                poetWriter.writeIndentedLine("- %s", dependency);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonEndpointDefinition.java`
#### Snippet
```java
            paramsWithHeader.stream()
                    .filter(param -> param.paramType().accept(ParameterTypeVisitor.IS_HEADER))
                    .forEach(param -> {
                        poetWriter.writeIndentedLine(
                                "'%s': %s,",
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonEndpointDefinition.java`
#### Snippet
```java
            paramsWithHeader.stream()
                    .filter(param -> param.paramType().accept(ParameterTypeVisitor.IS_QUERY))
                    .forEach(param -> {
                        poetWriter.writeIndentedLine(
                                "'%s': %s,",
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonEndpointDefinition.java`
#### Snippet
```java
            paramsWithHeader.stream()
                    .filter(param -> param.paramType().accept(ParameterTypeVisitor.IS_PATH))
                    .forEach(param -> {
                        poetWriter.writeIndentedLine("'%s': %s,", param.paramName(), param.pythonParamName());
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonSetup.java`
#### Snippet
```java
            poetWriter.increaseIndent();

            options().forEach((key, value) -> {
                poetWriter.writeIndentedLine("%s='%s',", key, value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonSetup.java`
#### Snippet
```java
                poetWriter.writeIndentedLine("%s='%s',", key, value);
            });
            rawOptions().forEach((key, value) -> {
                poetWriter.writeIndentedLine("%s=%s,", key, value);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-python-core/src/main/java/com/palantir/conjure/python/poet/PythonSetup.java`
#### Snippet
```java
            poetWriter.writeIndentedLine("install_requires=[");
            poetWriter.increaseIndent();
            installDependencies().forEach(dependency -> {
                poetWriter.writeIndentedLine("'%s',", dependency);
            });
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-python-core/src/main/java/com/palantir/conjure/python/ConjurePythonGenerator.java`
#### Snippet
```java
                .addContents(PythonMetaYaml.builder()
                        .pythonPackage(rootPackage)
                        .condaPackageName(config.packageName().get())
                        .packageVersion(config.packageVersion().get())
                        .addInstallDependencies("requests")
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-python-core/src/main/java/com/palantir/conjure/python/ConjurePythonGenerator.java`
#### Snippet
```java
                        .pythonPackage(rootPackage)
                        .condaPackageName(config.packageName().get())
                        .packageVersion(config.packageVersion().get())
                        .addInstallDependencies("requests")
                        .addInstallDependencies(String.format(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-python-core/src/main/java/com/palantir/conjure/python/ConjurePythonGenerator.java`
#### Snippet
```java
    private PythonFile buildPyTypedFile() {
        return PythonFile.builder()
                .pythonPackage(PythonPackage.of(config.pythonicPackageName().get()))
                .fileName("py.typed")
                .build();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-python-core/src/main/java/com/palantir/conjure/python/ConjurePythonGenerator.java`
#### Snippet
```java
                        .pythonPackage(rootPackage)
                        .text(String.format(
                                "__version__ = \"%s\"", config.packageVersion().get()))
                        .build()));
        return builder.build();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-python-core/src/main/java/com/palantir/conjure/python/ConjurePythonGenerator.java`
#### Snippet
```java
        PythonSetup.Builder builder = PythonSetup.builder()
                .pythonPackage(rootPackage)
                .putOptions("name", config.packageName().get())
                .putOptions("version", config.packageVersion().get())
                .putOptions("python_requires", ">=3.8")
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-python-core/src/main/java/com/palantir/conjure/python/ConjurePythonGenerator.java`
#### Snippet
```java
                .pythonPackage(rootPackage)
                .putOptions("name", config.packageName().get())
                .putOptions("version", config.packageVersion().get())
                .putOptions("python_requires", ">=3.8")
                .putRawOptions("package_data", "{\"\": [\"py.typed\"]}")
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.graph.MutableGraph' is marked unstable with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
    public static List<AliasSnippet> getSortedSnippets(List<AliasSnippet> snippets) {
        AliasEdgeVisitor aliasEdgeVisitor = new AliasEdgeVisitor(snippets);
        MutableGraph<AliasSnippet> mutableGraph =
                GraphBuilder.directed().nodeOrder(ElementOrder.insertion()).build();

```

### UnstableApiUsage
'com.google.common.graph.GraphBuilder' is marked unstable with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        AliasEdgeVisitor aliasEdgeVisitor = new AliasEdgeVisitor(snippets);
        MutableGraph<AliasSnippet> mutableGraph =
                GraphBuilder.directed().nodeOrder(ElementOrder.insertion()).build();

        snippets.forEach(mutableGraph::addNode);
```

### UnstableApiUsage
'directed()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        AliasEdgeVisitor aliasEdgeVisitor = new AliasEdgeVisitor(snippets);
        MutableGraph<AliasSnippet> mutableGraph =
                GraphBuilder.directed().nodeOrder(ElementOrder.insertion()).build();

        snippets.forEach(mutableGraph::addNode);
```

### UnstableApiUsage
'nodeOrder(com.google.common.graph.ElementOrder)' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        AliasEdgeVisitor aliasEdgeVisitor = new AliasEdgeVisitor(snippets);
        MutableGraph<AliasSnippet> mutableGraph =
                GraphBuilder.directed().nodeOrder(ElementOrder.insertion()).build();

        snippets.forEach(mutableGraph::addNode);
```

### UnstableApiUsage
'com.google.common.graph.ElementOrder' is marked unstable with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        AliasEdgeVisitor aliasEdgeVisitor = new AliasEdgeVisitor(snippets);
        MutableGraph<AliasSnippet> mutableGraph =
                GraphBuilder.directed().nodeOrder(ElementOrder.insertion()).build();

        snippets.forEach(mutableGraph::addNode);
```

### UnstableApiUsage
'insertion()' is declared in unstable class 'com.google.common.graph.ElementOrder' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        AliasEdgeVisitor aliasEdgeVisitor = new AliasEdgeVisitor(snippets);
        MutableGraph<AliasSnippet> mutableGraph =
                GraphBuilder.directed().nodeOrder(ElementOrder.insertion()).build();

        snippets.forEach(mutableGraph::addNode);
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        AliasEdgeVisitor aliasEdgeVisitor = new AliasEdgeVisitor(snippets);
        MutableGraph<AliasSnippet> mutableGraph =
                GraphBuilder.directed().nodeOrder(ElementOrder.insertion()).build();

        snippets.forEach(mutableGraph::addNode);
```

### UnstableApiUsage
'addNode(N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
                GraphBuilder.directed().nodeOrder(ElementOrder.insertion()).build();

        snippets.forEach(mutableGraph::addNode);
        snippets.forEach(snippet -> snippet.aliasType().getAlias().accept(aliasEdgeVisitor).stream()
                .filter(dependant -> !dependant.equals(snippet))
```

### UnstableApiUsage
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        snippets.forEach(snippet -> snippet.aliasType().getAlias().accept(aliasEdgeVisitor).stream()
                .filter(dependant -> !dependant.equals(snippet))
                .forEach(dependant -> mutableGraph.putEdge(dependant, snippet)));

        ImmutableList.Builder<AliasSnippet> outputBuilder = ImmutableList.builder();
```

### UnstableApiUsage
'nodes()' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java

        ImmutableList.Builder<AliasSnippet> outputBuilder = ImmutableList.builder();
        Set<AliasSnippet> roots = mutableGraph.nodes().stream()
                .filter(node -> mutableGraph.inDegree(node) == 0)
                .collect(Collectors.toSet());
```

### UnstableApiUsage
'inDegree(N)' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        ImmutableList.Builder<AliasSnippet> outputBuilder = ImmutableList.builder();
        Set<AliasSnippet> roots = mutableGraph.nodes().stream()
                .filter(node -> mutableGraph.inDegree(node) == 0)
                .collect(Collectors.toSet());
        Map<AliasSnippet, Integer> nonRootsToInDegree = mutableGraph.nodes().stream()
```

### UnstableApiUsage
'nodes()' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
                .filter(node -> mutableGraph.inDegree(node) == 0)
                .collect(Collectors.toSet());
        Map<AliasSnippet, Integer> nonRootsToInDegree = mutableGraph.nodes().stream()
                .filter(node -> mutableGraph.inDegree(node) > 0)
                .collect(Collectors.toMap(node -> node, mutableGraph::inDegree, (a, _b) -> a));
```

### UnstableApiUsage
'inDegree(N)' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
                .collect(Collectors.toSet());
        Map<AliasSnippet, Integer> nonRootsToInDegree = mutableGraph.nodes().stream()
                .filter(node -> mutableGraph.inDegree(node) > 0)
                .collect(Collectors.toMap(node -> node, mutableGraph::inDegree, (a, _b) -> a));

```

### UnstableApiUsage
'inDegree(N)' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
        Map<AliasSnippet, Integer> nonRootsToInDegree = mutableGraph.nodes().stream()
                .filter(node -> mutableGraph.inDegree(node) > 0)
                .collect(Collectors.toMap(node -> node, mutableGraph::inDegree, (a, _b) -> a));

        // Kahn's Algorithm https://en.wikipedia.org/wiki/Topological_sorting#Kahn's_algorithm
```

### UnstableApiUsage
'successors(N)' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `conjure-python-core/src/main/java/com/palantir/conjure/python/PythonAliasTopologicalSorter.java`
#### Snippet
```java
            roots.remove(currentNode);
            outputBuilder.add(currentNode);
            for (AliasSnippet successor : mutableGraph.successors(currentNode)) {
                int inDegree = nonRootsToInDegree.get(successor) - 1;
                nonRootsToInDegree.put(successor, inDegree);
```

