# poosl 
 
# Bad smells
I found 43 bad smells with 43 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 43 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/tooling/CheckSize/src/CheckSize.java`
#### Snippet
```java
x.getClass().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.model.editor/src-gen/org/eclipse/poosl/presentation/PooslEditor.java`
#### Snippet
```java
delta.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.model.editor/src-gen/org/eclipse/poosl/presentation/PooslEditor.java`
#### Snippet
```java
file.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.model.editor/src-gen/org/eclipse/poosl/presentation/PooslModelWizard.java`
#### Snippet
```java
modelFile.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.model.editor/src-gen/org/eclipse/poosl/presentation/PooslModelWizard.java`
#### Snippet
```java
modelFile.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/debug/PooslBreakpointManager.java`
#### Snippet
```java
breakpoint.getMarker().getResource().getLocationURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/debug/PooslDebugTarget.java`
#### Snippet
```java
resource.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/launch/ExecutableResourceVerification.java`
#### Snippet
```java
fileEditorInput.getStorage().getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/launch/LaunchConfigurationPooslTab.java`
#### Snippet
```java
ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/launch/LaunchShortcut.java`
#### Snippet
```java
file.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/launch/LaunchShortcut.java`
#### Snippet
```java
file.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/logging/PooslLogger.java`
#### Snippet
```java
event.getNewValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/preferences/DebugPreferencePage.java`
#### Snippet
```java
getLevel(scale.getSelection()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/preferences/DebugPreferencePage.java`
#### Snippet
```java
getLevel(scale.getSelection()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/runner/UIBundleInfoRegistry.java`
#### Snippet
```java
FileLocator.resolve(bundle.getEntry("/")).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/views/PooslPETView.java`
#### Snippet
```java
executionTreeElement.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/views/PooslSequenceDiagramView.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/views/PooslSequenceDiagramView.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/views/PooslSequenceDiagramView.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.rotalumisclient/src/org/eclipse/poosl/rotalumisclient/views/PooslSequenceDiagramView.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.sirius/src/org/eclipse/poosl/sirius/helpers/ConvertHelper.java`
#### Snippet
```java
file.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.sirius/src/org/eclipse/poosl/sirius/helpers/CreationHelper.java`
#### Snippet
```java
resource.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.sirius/src/org/eclipse/poosl/sirius/helpers/GraphicalEditorHelper.java`
#### Snippet
```java
project.getFullPath().append(ModelingProject.DEFAULT_REPRESENTATIONS_FILE_NAME).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.sirius/src/org/eclipse/poosl/sirius/helpers/GraphicalEditorHelper.java`
#### Snippet
```java
resource.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.sirius/src/org/eclipse/poosl/sirius/helpers/GraphicalEditorHelper.java`
#### Snippet
```java
activeProject.getFullPath().append(ModelingProject.DEFAULT_REPRESENTATIONS_FILE_NAME).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/contentassist/PooslProposalProviderLabel.java`
#### Snippet
```java
candidate.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/contentassist/PooslProposalProviderLabel.java`
#### Snippet
```java
candidate.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/contentassist/PooslProposalProviderLabel.java`
#### Snippet
```java
candidate.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/labeling/PooslLabelProvider.java`
#### Snippet
```java
poosl.eResource().getURI().trimFragment().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/preferences/IncludePropertyPage.java`
#### Snippet
```java
ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/quickfix/PooslQuickfixProviderUnresolved.java`
#### Snippet
```java
issue.getUriToProblem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/quickfix/PooslQuickfixProviderUnresolved.java`
#### Snippet
```java
outputBuilder.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/quickfix/PooslQuickfixProviderUnresolved.java`
#### Snippet
```java
decl.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/quickfix/PooslQuickfixProviderUnresolved.java`
#### Snippet
```java
decl.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext.ui/src/org/eclipse/poosl/xtext/ui/quickfix/PooslQuickfixProviderUnresolved.java`
#### Snippet
```java
dec.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext/src/org/eclipse/poosl/xtext/validation/PooslJavaValidatorMisc.java`
#### Snippet
```java
sourceFileOfImportLib.trimFragment().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext/src/org/eclipse/poosl/xtext/validation/PooslJavaValidatorMisc.java`
#### Snippet
```java
sourceFileOfImportLib.trimFragment().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext/src/org/eclipse/poosl/xtext/validation/PooslJavaValidatorUniqueIdentifiers.java`
#### Snippet
```java
rootPath.append(platformString).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext/src/org/eclipse/poosl/xtext/custom/PooslCacheEntry.java`
#### Snippet
```java
pooslDescr.getEObjectURI().trimFragment().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext/src/org/eclipse/poosl/xtext/helpers/HelperFunctions.java`
#### Snippet
```java
resource.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext/src/org/eclipse/poosl/xtext/helpers/HelperFunctions.java`
#### Snippet
```java
iterator.next().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext/src/org/eclipse/poosl/xtext/importing/PooslResourceDescriptionManager.java`
#### Snippet
```java
candidate.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-poosl-114139923442385299312269729838861058388/plugins/org.eclipse.poosl.xtext/src/org/eclipse/poosl/xtext/importing/PooslResourceDescriptionManager.java`
#### Snippet
```java
candidate.getURI().toString()
```

