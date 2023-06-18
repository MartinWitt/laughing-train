# mwe 
 
# Bad smells
I found 11 bad smells with 11 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 11 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.core/src/org/eclipse/emf/mwe/internal/core/MWEPlugin.java`
#### Snippet
```java
uri.trimFragment().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.ui/src/org/eclipse/emf/mwe/internal/ui/debug/launching/ui/MWELaunchConfigMainTab.java`
#### Snippet
```java
file.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.ui/src/org/eclipse/emf/mwe/internal/ui/debug/model/ui/JarEntryEditorInput.java`
#### Snippet
```java
fJarEntryFile.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.ui/src/org/eclipse/emf/mwe/internal/ui/debug/model/ui/JarEntryEditorInput.java`
#### Snippet
```java
fJarEntryFile.getFullPath().makeRelative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.ui/src/org/eclipse/emf/mwe/internal/ui/eclipse/launch/MWELaunchDelegate.java`
#### Snippet
```java
file.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.ui/src/org/eclipse/emf/mwe/internal/ui/eclipse/launch/MWELaunchShortcut.java`
#### Snippet
```java
file.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.ui/src/org/eclipse/emf/mwe/internal/ui/workflow/debug/MWEPluginAdapter.java`
#### Snippet
```java
resource.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.ui/src/org/eclipse/emf/mwe/internal/ui/workflow/debug/MWEPluginAdapter.java`
#### Snippet
```java
file.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe.ui/src/org/eclipse/emf/mwe/ui/debug/model/MWEBreakpoint.java`
#### Snippet
```java
resource.getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe2.launch.ui/src/org/eclipse/emf/mwe2/launch/ui/shortcut/Mwe2LaunchShortcut.java`
#### Snippet
```java
file.getProjectRelativePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mwe-286239795427950955013892107890431635024/plugins/org.eclipse.emf.mwe2.launch/src/org/eclipse/emf/mwe2/launch/runtime/Mwe2Runner.java`
#### Snippet
```java
module.eResource().getErrors().toString()
```

