# closure-compiler 
 
# Bad smells
I found 25 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 25 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/debugging/sourcemap/FilePosition.java`
#### Snippet
```java
toStringHelper(this).add("line", line).add("column", column).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/debugging/sourcemap/SourceMapObjectParser.java`
#### Snippet
```java
section.get("map").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/ClosureRewriteModule.java`
#### Snippet
```java
MoreObjects.toStringHelper(this).add("exportName", exportName).add("rhs", rhs).add("nameDecl", nameDecl).omitNullValues().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/CommandLineRunner.java`
#### Snippet
```java
original.normalize().toAbsolutePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/CommandLineRunner.java`
#### Snippet
```java
p.normalize().toAbsolutePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/CompilerOptions.java`
#### Snippet
```java
MoreObjects.toStringHelper(this).omitNullValues().add("aliasStringsMode", getAliasStringsMode()).add("aliasHandler", getAliasTransformationHandler()).add("ambiguateProperties", ambiguateProperties).add("angularPass", angularPass).add("assumeClosuresOnlyCaptureReferences", assumeClosuresOnlyCaptureReferences).add("assumeGettersArePure", assumeGettersArePure).add("assumeStrictThis", assumeStrictThis()).add("browserResolverPrefixReplacements", browserResolverPrefixReplacements).add("checkDeterminism", getCheckDeterminism()).add("checksOnly", checksOnly).add("checkSuspiciousCode", checkSuspiciousCode).add("checkSymbols", checkSymbols).add("checkTypes", checkTypes).add("closurePass", closurePass).add("coalesceVariableNames", coalesceVariableNames).add("codingConvention", getCodingConvention()).add("collapseAnonymousFunctions", collapseAnonymousFunctions).add("collapseObjectLiterals", collapseObjectLiterals).add("collapseProperties", collapsePropertiesLevel).add("collapseVariableDeclarations", collapseVariableDeclarations).add("colorizeErrorOutput", shouldColorizeErrorOutput()).add("computeFunctionSideEffects", computeFunctionSideEffects).add("conformanceConfigs", getConformanceConfigs()).add("conformanceRemoveRegexFromPath", conformanceRemoveRegexFromPath).add("continueAfterErrors", canContinueAfterErrors()).add("convertToDottedProperties", convertToDottedProperties).add("crossChunkCodeMotion", crossChunkCodeMotion).add("crossChunkCodeMotionNoStubMethods", crossChunkCodeMotionNoStubMethods).add("crossChunkMethodMotion", crossChunkMethodMotion).add("cssRenamingMap", cssRenamingMap).add("cssRenamingSkiplist", cssRenamingSkiplist).add("customPasses", customPasses).add("deadAssignmentElimination", deadAssignmentElimination).add("debugLogDirectory", debugLogDirectory).add("defineReplacements", getDefineReplacements()).add("dependencyOptions", getDependencyOptions()).add("devirtualizeMethods", devirtualizeMethods).add("devMode", devMode).add("disambiguateProperties", disambiguateProperties).add("enableModuleRewriting", enableModuleRewriting).add("environment", getEnvironment()).add("errorFormat", errorFormat).add("errorHandler", errorHandler).add("es6ModuleTranspilation", es6ModuleTranspilation).add("exportLocalPropertyDefinitions", exportLocalPropertyDefinitions).add("exportTestFunctions", exportTestFunctions).add("externExportsPath", externExportsPath).add("extraAnnotationNames", extraAnnotationNames).add("extractPrototypeMemberDeclarations", extractPrototypeMemberDeclarations).add("filesToPrintAfterEachPassRegexList", filesToPrintAfterEachPassRegexList).add("flowSensitiveInlineVariables", flowSensitiveInlineVariables).add("foldConstants", foldConstants).add("forceLibraryInjection", forceLibraryInjection).add("gatherCssNames", gatherCssNames).add("generateExports", generateExports).add("generatePseudoNames", generatePseudoNames).add("generateTypedExterns", shouldGenerateTypedExterns()).add("idGenerators", idGenerators).add("idGeneratorsMapSerialized", idGeneratorsMapSerialized).add("incrementalCheckMode", incrementalCheckMode).add("inferConsts", inferConsts).add("inferTypes", inferTypes).add("inlineConstantVars", inlineConstantVars).add("inlineFunctionsLevel", inlineFunctionsLevel).add("inlineGetters", inlineGetters).add("inlineLocalVariables", inlineLocalVariables).add("inlineProperties", inlineProperties).add("inlineVariables", inlineVariables).add("inputDelimiter", inputDelimiter).add("inputPropertyMap", inputPropertyMap).add("inputSourceMaps", inputSourceMaps).add("inputVariableMap", inputVariableMap).add("instrumentForCoverageOnly", instrumentForCoverageOnly).add("instrumentForCoverageOption", instrumentForCoverageOption.toString()).add("productionInstrumentationArrayName", productionInstrumentationArrayName).add("isolatePolyfills", isolatePolyfills).add("j2clMinifierEnabled", j2clMinifierEnabled).add("j2clMinifierPruningManifest", j2clMinifierPruningManifest).add("j2clPassMode", j2clPassMode).add("labelRenaming", labelRenaming).add("languageIn", getLanguageIn()).add("languageOutIsDefaultStrict", languageOutIsDefaultStrict).add("lineBreak", lineBreak).add("lineLengthThreshold", lineLengthThreshold).add("locale", locale).add("markAsCompiled", markAsCompiled).add("maxFunctionSizeAfterInlining", maxFunctionSizeAfterInlining).add("messageBundle", messageBundle).add("moduleRoots", moduleRoots).add("chunksToPrintAfterEachPassRegexList", chunksToPrintAfterEachPassRegexList).add("qnameUsesToPrintAfterEachPassRegexList", qnameUsesToPrintAfterEachPassList).add("rewriteGlobalDeclarationsForTryCatchWrapping", rewriteGlobalDeclarationsForTryCatchWrapping).add("nameGenerator", nameGenerator).add("optimizeArgumentsArray", optimizeArgumentsArray).add("optimizeCalls", optimizeCalls).add("optimizeESClassConstructors", optimizeESClassConstructors).add("outputCharset", outputCharset).add("outputFeatureSet", outputFeatureSet).add("outputJs", outputJs).add("outputJsStringUsage", outputJsStringUsage).add("parentChunkCanSeeSymbolsDeclaredInChildren", parentChunkCanSeeSymbolsDeclaredInChildren).add("parseJsDocDocumentation", isParseJsDocDocumentation()).add("pathEscaper", pathEscaper).add("polymerVersion", polymerVersion).add("polymerExportPolicy", polymerExportPolicy).add("preferSingleQuotes", preferSingleQuotes).add("preferStableNames", preferStableNames).add("preserveDetailedSourceInfo", preservesDetailedSourceInfo()).add("preserveNonJSDocComments", getPreserveNonJSDocComments()).add("preserveGoogProvidesAndRequires", preserveClosurePrimitives).add("preserveTypeAnnotations", preserveTypeAnnotations).add("prettyPrint", prettyPrint).add("preventLibraryInjection", preventLibraryInjection).add("printConfig", printConfig).add("printInputDelimiter", printInputDelimiter).add("printSourceAfterEachPass", printSourceAfterEachPass).add("processCommonJSModules", processCommonJSModules).add("propertiesThatMustDisambiguate", propertiesThatMustDisambiguate).add("propertyRenaming", propertyRenaming).add("propertyRenamingOnlyCompilationMode", propertyRenamingOnlyCompilationMode).add("protectHiddenSideEffects", protectHiddenSideEffects).add("quoteKeywordProperties", quoteKeywordProperties).add("removeAbstractMethods", removeAbstractMethods).add("removeClosureAsserts", removeClosureAsserts).add("removeJ2clAsserts", removeJ2clAsserts).add("removeDeadCode", removeDeadCode).add("removeUnusedClassProperties", removeUnusedClassProperties).add("removeUnusedConstructorProperties", removeUnusedConstructorProperties).add("removeUnusedLocalVars", removeUnusedLocalVars).add("removeUnusedPrototypeProperties", removeUnusedPrototypeProperties).add("removeUnusedVars", removeUnusedVars).add("renamePrefixNamespaceAssumeCrossChunkNames", renamePrefixNamespaceAssumeCrossChunkNames).add("renamePrefixNamespace", renamePrefixNamespace).add("renamePrefix", renamePrefix).add("replaceIdGenerators", replaceIdGenerators).add("replaceMessagesWithChromeI18n", replaceMessagesWithChromeI18n).add("replaceStringsFunctionDescriptions", replaceStringsFunctionDescriptions).add("replaceStringsPlaceholderToken", replaceStringsPlaceholderToken).add("reserveRawExports", reserveRawExports).add("rewriteFunctionExpressions", rewriteFunctionExpressions).add("rewritePolyfills", rewritePolyfills).add("rewriteModulesBeforeTypechecking", rewriteModulesBeforeTypechecking).add("skipNonTranspilationPasses", skipNonTranspilationPasses).add("smartNameRemoval", smartNameRemoval).add("sourceMapDetailLevel", sourceMapDetailLevel).add("sourceMapFormat", sourceMapFormat).add("sourceMapLocationMappings", sourceMapLocationMappings).add("sourceMapOutputPath", sourceMapOutputPath).add("strictMessageReplacement", strictMessageReplacement).add("stripNamePrefixes", stripNamePrefixes).add("stripNameSuffixes", stripNameSuffixes).add("stripTypes", stripTypes).add("summaryDetailLevel", summaryDetailLevel).add("syntheticBlockEndMarker", syntheticBlockEndMarker).add("syntheticBlockStartMarker", syntheticBlockStartMarker).add("tcProjectId", tcProjectId).add("tracer", tracer).add("trustedStrings", trustedStrings).add("tweakProcessing", getTweakProcessing()).add("emitUseStrict", emitUseStrict).add("useTypesForLocalOptimization", useTypesForLocalOptimization).add("unusedImportsToRemove", unusedImportsToRemove).add("variableRenaming", variableRenaming).add("warningsGuard", getWarningsGuard()).add("wrapGoogModulesForWhitespaceOnly", wrapGoogModulesForWhitespaceOnly).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/ExpressionDecomposer.java`
#### Snippet
```java
toStringHelper(this).add("sideEffects", sideEffects).add("extractBeforeStatement", extractBeforeStatement).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/GlobalNamespace.java`
#### Snippet
```java
MoreObjects.toStringHelper(this).omitNullValues().add("name", name).add("type", type).add("node", node).add("scope", scope).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/MakeDeclaredNamesUnique.java`
#### Snippet
```java
toStringHelper(this).add("scopeRoot", scopeRoot).add("nameUsage", nameUsage).add("declarations", declarations).add("global", global).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/PolymerClassDefinition.java`
#### Snippet
```java
toStringHelper(this).add("defType", defType).add("definition", definition).add("target", target).add("nativeBaseElement", nativeBaseElement).omitNullValues().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/PolymerPass.java`
#### Snippet
```java
toStringHelper(this).add("name", name).add("value", value).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/PureFunctionIdentifier.java`
#### Snippet
```java
// Passing `graphNode` directly causes recursion as its `toString` calls `toString` on the
// summary it contains.
MoreObjects.toStringHelper(getClass()).add("name", name).add("graphNode", graphNode.hashCode()).add("sideEffects", sideEffectsToString()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/ReferenceCollection.java`
#### Snippet
```java
toStringHelper(this).add("initRef", getInitializingReference()).add("references", references).add("wellDefined", isWellDefined()).add("assignedOnce", isAssignedOnceInLifetime()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/TypeValidator.java`
#### Snippet
```java
classType.getInstanceType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/test/com/google/javascript/jscomp/JSChunkGraphTest.java`
#### Snippet
```java
m.get("dependencies").getAsJsonArray().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/test/com/google/javascript/jscomp/JSChunkGraphTest.java`
#### Snippet
```java
m.get("inputs").getAsJsonArray().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/test/com/google/javascript/jscomp/SourceFileTest.java`
#### Snippet
```java
jsZipFile.toAbsolutePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/test/com/google/javascript/jscomp/SourceFileTest.java`
#### Snippet
```java
jsZipPath.toAbsolutePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/test/com/google/javascript/jscomp/SourceFileTest.java`
#### Snippet
```java
jsZipPath.toAbsolutePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/deps/ModuleLoader.java`
#### Snippet
```java
Paths.get(path).toAbsolutePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/disambiguate/ColorGraphNode.java`
#### Snippet
```java
MoreObjects.toStringHelper(this).add("index", this.index).add("color", this.color).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/disambiguate/PropertyClustering.java`
#### Snippet
```java
MoreObjects.toStringHelper(this).add("name", this.name).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/rhino/JSDocInfo.java`
#### Snippet
```java
helper.omitNullValues().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/test/com/google/javascript/rhino/jstype/JSTypeTest.java`
#### Snippet
```java
FunctionType.builder(registry).withParameters(registry.createParameters(NUMBER_TYPE)).withReturnType(NUMBER_STRING_BOOLEAN).withTypeOfThis(DATE_TYPE).build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-closure-compiler41182206076047343411641239222161360819/src/com/google/javascript/jscomp/j2clbuild/super/java/util/regex/Matcher.java`
#### Snippet
```java
new JsString(input).replace(new JsRegExp(regExp.source, "g"), replacement).toString()
```

