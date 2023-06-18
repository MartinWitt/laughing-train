# team-explorer-everywhere 
 
# Bad smells
I found 20 bad smells with 20 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 20 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.clc/src/com/microsoft/tfs/client/clc/prompt/Prompt.java`
#### Snippet
```java
response.getVerificationUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.common.ui.teambuild/src/com/microsoft/tfs/client/common/ui/teambuild/teamexplorer/favorites/BuildFavoriteItem.java`
#### Snippet
```java
definition.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.common.ui.teambuild/src/com/microsoft/tfs/client/common/ui/teambuild/teamexplorer/sections/TeamExplorerBuildsFavoritesSection.java`
#### Snippet
```java
definition.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.common.ui/src/com/microsoft/tfs/client/common/ui/dialogs/connect/OAuth2DeviceFlowCallbackDialog.java`
#### Snippet
```java
this.response.getVerificationUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.common.ui/src/com/microsoft/tfs/client/common/ui/framework/compare/CustomResourceNode.java`
#### Snippet
```java
getResource().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.common.ui/src/com/microsoft/tfs/client/common/ui/framework/compare/CustomResourceNode.java`
#### Snippet
```java
getResource().getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.common.ui/src/com/microsoft/tfs/client/common/ui/wit/results/QueryResultsEditor.java`
#### Snippet
```java
getEditorInput().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse.ui.egit/src/com/microsoft/tfs/client/eclipse/ui/egit/protocolhandler/ProtocolHandlerHelpers.java`
#### Snippet
```java
project.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse.ui.egit/src/com/microsoft/tfs/client/eclipse/ui/egit/protocolhandler/ProtocolHandlerHelpers.java`
#### Snippet
```java
repository.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse.ui/src/com/microsoft/tfs/client/eclipse/ui/dialogs/vc/TPIgnorePatternsResolutionDialog.java`
#### Snippet
```java
o1.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse.ui/src/com/microsoft/tfs/client/eclipse/ui/dialogs/vc/TPIgnorePatternsResolutionDialog.java`
#### Snippet
```java
o2.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse.ui/src/com/microsoft/tfs/client/eclipse/ui/filemodification/TFSFileModificationUIStatusReporter.java`
#### Snippet
```java
statusData[i].getFile().getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse.ui/src/com/microsoft/tfs/client/eclipse/ui/sync/SynchronizeParticipant.java`
#### Snippet
```java
resources[0].getFullPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse/src/com/microsoft/tfs/client/eclipse/resourcedata/ApplyQueuedUpdatesJob.java`
#### Snippet
```java
resources[j].getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse/src/com/microsoft/tfs/client/eclipse/resourcedata/ResourceDataManager.java`
#### Snippet
```java
resource.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse/src/com/microsoft/tfs/client/eclipse/sync/syncinfo/BaseResourceVariant.java`
#### Snippet
```java
resource.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse/src/com/microsoft/tfs/client/eclipse/sync/syncinfo/BaseResourceVariant.java`
#### Snippet
```java
resource.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse/src/com/microsoft/tfs/client/eclipse/sync/syncinfo/LatestResourceVariant.java`
#### Snippet
```java
resource.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse/src/com/microsoft/tfs/client/eclipse/sync/syncinfo/LatestResourceVariant.java`
#### Snippet
```java
resource.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-team-explorer-everywhere-881792191964610249310830415251314481844/source/com.microsoft.tfs.client.eclipse/src/com/microsoft/tfs/client/eclipse/tpignore/TPIgnoreCache.java`
#### Snippet
```java
resource.getProjectRelativePath().toString()
```

