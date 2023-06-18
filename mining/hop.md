# hop 
 
# Bad smells
I found 185 bad smells with 185 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 185 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/core/src/main/java/org/apache/hop/core/ResultFile.java`
#### Snippet
```java
file.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/core/src/main/java/org/apache/hop/core/plugins/BasePluginType.java`
#### Snippet
```java
classInfo.name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/core/src/main/java/org/apache/hop/core/plugins/BasePluginType.java`
#### Snippet
```java
classInfo.name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/core/src/test/java/org/apache/hop/core/row/value/ValueMetaTimestampTest.java`
#### Snippet
```java
ts.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/core/util/FileUtil.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/core/util/FileUtil.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/core/util/FileUtil.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/core/util/FileUtil.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/core/util/FileUtil.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/core/src/main/java/org/apache/hop/core/variables/VariableRegistry.java`
#### Snippet
```java
fieldInfo.declaringClass().name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/server/HopServer.java`
#### Snippet
```java
method.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/server/HopServer.java`
#### Snippet
```java
method.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/engines/beam/src/main/java/org/apache/hop/beam/core/transform/BeamKafkaOutputTransform.java`
#### Snippet
```java
value.getSchema().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/engines/beam/src/main/java/org/apache/hop/beam/pipeline/HopPipelineMetaToBeamPipelineConverter.java`
#### Snippet
```java
classInfo.name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/engines/beam/src/main/java/org/apache/hop/beam/transforms/bq/BeamBQInput.java`
#### Snippet
```java
data.queryJob.getStatus().getError().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/pipeline/PipelineMeta.java`
#### Snippet
```java
fileObject.getParent().getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/pipeline/PipelineMeta.java`
#### Snippet
```java
fileObject.getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/pipeline/engines/remote/RemotePipelineEngine.java`
#### Snippet
```java
tempFile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/azure/src/main/java/org/apache/hop/pipeline/transforms/eventhubs/listen/AzureListener.java`
#### Snippet
```java
e.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/azure/src/main/java/org/apache/hop/pipeline/transforms/eventhubs/listen/AzureListener.java`
#### Snippet
```java
e.getCause().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/azure/src/main/java/org/apache/hop/pipeline/transforms/eventhubs/listen/AzureListener.java`
#### Snippet
```java
e.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/azure/src/main/java/org/apache/hop/pipeline/transforms/eventhubs/listen/AzureListener.java`
#### Snippet
```java
e.getCause().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/azure/src/main/java/org/apache/hop/pipeline/transforms/eventhubs/listen/AzureListenerErrorNotificationHandler.java`
#### Snippet
```java
t.getException().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/changefileencoding/src/main/java/org/apache/hop/pipeline/transforms/changefileencoding/ChangeFileEncoding.java`
#### Snippet
```java
data.sourceFile.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/dorisbulkloader/src/main/java/org/apache/hop/pipeline/transforms/dorisbulkloader/DorisStreamLoad.java`
#### Snippet
```java
response.getStatusLine().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/drools/src/main/java/org/apache/hop/pipeline/transforms/drools/RuleValidationException.java`
#### Snippet
```java
item.getLevel().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/excel/src/main/java/org/apache/hop/pipeline/transforms/excelwriter/ExcelWriterTransform.java`
#### Snippet
```java
file.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/excel/src/main/java/org/apache/hop/pipeline/transforms/excelwriter/ExcelWriterTransform.java`
#### Snippet
```java
file.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/excel/src/main/java/org/apache/hop/pipeline/transforms/excelwriter/ExcelWriterTransform.java`
#### Snippet
```java
file.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/excel/src/main/java/org/apache/hop/pipeline/transforms/excelwriter/ExcelWriterTransform.java`
#### Snippet
```java
file.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/excel/src/main/java/org/apache/hop/pipeline/transforms/excelwriter/ExcelWriterTransform.java`
#### Snippet
```java
file.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/excel/src/main/java/org/apache/hop/pipeline/transforms/excelwriter/ExcelWriterTransform.java`
#### Snippet
```java
file.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/fileexists/src/main/java/org/apache/hop/pipeline/transforms/fileexists/FileExists.java`
#### Snippet
```java
data.file.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/getfilenames/src/main/java/org/apache/hop/pipeline/transforms/getfilenames/GetFileNames.java`
#### Snippet
```java
data.file.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/getfilenames/src/main/java/org/apache/hop/pipeline/transforms/getfilenames/GetFileNamesDialog.java`
#### Snippet
```java
FileInputList.FileTypeFilter.getByOrdinal(wFilterFileType.getSelectionIndex()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/getfilenames/src/main/java/org/apache/hop/pipeline/transforms/getfilenames/GetFileNamesDialog.java`
#### Snippet
```java
FileInputList.FileTypeFilter.getByOrdinal(wFilterFileType.getSelectionIndex()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/javascript/src/main/java/org/apache/hop/pipeline/transforms/javascript/ScriptValuesAddedFunctions.java`
#### Snippet
```java
actualObject.get(strToLoad, actualObject).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/javascript/src/main/java/org/apache/hop/pipeline/transforms/javascript/ScriptValuesAddedFunctions.java`
#### Snippet
```java
file.getName().getBaseName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/javascript/src/main/java/org/apache/hop/pipeline/transforms/javascript/ScriptValuesAddedFunctions.java`
#### Snippet
```java
file.getName().getExtension().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/loadfileinput/src/test/java/org/apache/hop/pipeline/transforms/loadfileinput/LoadFileInputTest.java`
#### Snippet
```java
getFile("UTF-8.txt").getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/mail/src/main/java/org/apache/hop/pipeline/transforms/mail/Mail.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/mail/src/main/java/org/apache/hop/pipeline/transforms/mail/Mail.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/multimerge/src/main/java/org/apache/hop/pipeline/transforms/multimerge/MultiMergeJoinDialog.java`
#### Snippet
```java
sb.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/pipelineexecutor/src/main/java/org/apache/hop/pipeline/transforms/pipelineexecutor/PipelineExecutor.java`
#### Snippet
```java
resultFile.getFile().getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/pipelineexecutor/src/main/java/org/apache/hop/pipeline/transforms/pipelineexecutor/PipelineExecutorDialog.java`
#### Snippet
```java
HopVfs.getFileObject(variables.resolve(pipelineMeta.getFilename())).getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/propertyoutput/src/main/java/org/apache/hop/pipeline/transforms/propertyoutput/PropertyOutput.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/propertyoutput/src/main/java/org/apache/hop/pipeline/transforms/propertyoutput/PropertyOutput.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/propertyoutput/src/main/java/org/apache/hop/pipeline/transforms/propertyoutput/PropertyOutput.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/propertyoutput/src/main/java/org/apache/hop/pipeline/transforms/propertyoutput/PropertyOutput.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/rest/src/test/java/org/apache/hop/pipeline/transforms/rest/RestTest.java`
#### Snippet
```java
map.getFirst("param1").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/rest/src/test/java/org/apache/hop/pipeline/transforms/rest/RestTest.java`
#### Snippet
```java
doReturn("true").when(response).getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/salesforce/src/main/java/org/apache/hop/pipeline/transforms/salesforceinput/SalesforceInputDialog.java`
#### Snippet
```java
field.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/salesforce/src/main/java/org/apache/hop/pipeline/transforms/salesforceinput/SalesforceInputDialog.java`
#### Snippet
```java
field.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/salesforce/src/main/java/org/apache/hop/pipeline/transforms/salesforceupsert/SalesforceUpsert.java`
#### Snippet
```java
f.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/webservices/src/main/java/org/apache/hop/pipeline/transforms/webservices/WebServiceDialog.java`
#### Snippet
```java
wsdlOperation.getParameters().getOperation().getInput().getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/workflowexecutor/src/main/java/org/apache/hop/pipeline/transforms/workflowexecutor/WorkflowExecutor.java`
#### Snippet
```java
resultFile.getFile().getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/workflowexecutor/src/main/java/org/apache/hop/pipeline/transforms/workflowexecutor/WorkflowExecutorDialog.java`
#### Snippet
```java
HopVfs.getFileObject(variables.resolve(pipelineMeta.getFilename())).getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/xml/src/test/java/org/apache/hop/pipeline/transforms/xml/xsdvalidator/XsdValidatorIntTest.java`
#### Snippet
```java
getDataRamFile().getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/xml/src/test/java/org/apache/hop/pipeline/transforms/xml/xsdvalidator/XsdValidatorIntTest.java`
#### Snippet
```java
getSchemaRamFile().getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/xml/src/test/java/org/apache/hop/pipeline/transforms/xml/xsdvalidator/XsdValidatorIntTest.java`
#### Snippet
```java
getDataRamFile().getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/xml/src/test/java/org/apache/hop/pipeline/transforms/xml/xsdvalidator/XsdValidatorIntTest.java`
#### Snippet
```java
getSchemaRamFile().getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/resource/ResourceUtil.java`
#### Snippet
```java
fileObject.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/resource/SimpleResourceNaming.java`
#### Snippet
```java
fileObject.getParent().getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/resource/SimpleResourceNaming.java`
#### Snippet
```java
fileObject.getURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/addresultfilenames/src/main/java/org/apache/hop/workflow/actions/addresultfilenames/ActionAddResultFilenames.java`
#### Snippet
```java
list[i].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/addresultfilenames/src/main/java/org/apache/hop/workflow/actions/addresultfilenames/ActionAddResultFilenames.java`
#### Snippet
```java
list[i].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/addresultfilenames/src/main/java/org/apache/hop/workflow/actions/addresultfilenames/ActionAddResultFilenames.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/addresultfilenames/src/main/java/org/apache/hop/workflow/actions/addresultfilenames/ActionAddResultFilenames.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/checkfilelocked/src/main/java/org/apache/hop/workflow/actions/checkfilelocked/ActionCheckFilesLocked.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/checkfilelocked/src/main/java/org/apache/hop/workflow/actions/checkfilelocked/ActionCheckFilesLocked.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/checkfilelocked/src/main/java/org/apache/hop/workflow/actions/checkfilelocked/ActionCheckFilesLocked.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/checkfilelocked/src/main/java/org/apache/hop/workflow/actions/checkfilelocked/ActionCheckFilesLocked.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/copyfiles/src/main/java/org/apache/hop/workflow/actions/copyfiles/ActionCopyFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/copyfiles/src/main/java/org/apache/hop/workflow/actions/copyfiles/ActionCopyFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/copyfiles/src/main/java/org/apache/hop/workflow/actions/copyfiles/ActionCopyFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/copyfiles/src/main/java/org/apache/hop/workflow/actions/copyfiles/ActionCopyFiles.java`
#### Snippet
```java
info.getBaseFolder().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/copyfiles/src/main/java/org/apache/hop/workflow/actions/copyfiles/ActionCopyFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/copyfiles/src/main/java/org/apache/hop/workflow/actions/copyfiles/ActionCopyFiles.java`
#### Snippet
```java
info.getFile().getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/copyfiles/src/main/java/org/apache/hop/workflow/actions/copyfiles/ActionCopyFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/deletefiles/src/main/java/org/apache/hop/workflow/actions/deletefiles/ActionDeleteFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/deletefiles/src/main/java/org/apache/hop/workflow/actions/deletefiles/ActionDeleteFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/deletefiles/src/main/java/org/apache/hop/workflow/actions/deletefiles/ActionDeleteFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/deletefiles/src/main/java/org/apache/hop/workflow/actions/deletefiles/ActionDeleteFiles.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/dostounix/src/main/java/org/apache/hop/workflow/actions/dostounix/ActionDosToUnix.java`
#### Snippet
```java
currentFile.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/evalfilesmetrics/src/main/java/org/apache/hop/workflow/actions/evalfilesmetrics/ActionEvalFilesMetrics.java`
#### Snippet
```java
currentFile.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/folderisempty/src/main/java/org/apache/hop/workflow/actions/folderisempty/ActionFolderIsEmpty.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/folderisempty/src/main/java/org/apache/hop/workflow/actions/folderisempty/ActionFolderIsEmpty.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/folderisempty/src/main/java/org/apache/hop/workflow/actions/folderisempty/ActionFolderIsEmpty.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/folderisempty/src/main/java/org/apache/hop/workflow/actions/folderisempty/ActionFolderIsEmpty.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/folderscompare/src/main/java/org/apache/hop/workflow/actions/folderscompare/ActionFoldersCompare.java`
#### Snippet
```java
list1[i].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/folderscompare/src/main/java/org/apache/hop/workflow/actions/folderscompare/ActionFoldersCompare.java`
#### Snippet
```java
list2[i].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/folderscompare/src/main/java/org/apache/hop/workflow/actions/folderscompare/ActionFoldersCompare.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/folderscompare/src/main/java/org/apache/hop/workflow/actions/folderscompare/ActionFoldersCompare.java`
#### Snippet
```java
info.getFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/getpop/src/main/java/org/apache/hop/workflow/actions/getpop/ActionGetPOP.java`
#### Snippet
```java
mailConn.getMessage().getFrom()[0].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/getpop/src/main/java/org/apache/hop/workflow/actions/getpop/MailConnection.java`
#### Snippet
```java
this.folder.getURLName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfilename.getName().getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfilename.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
currentfile.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/movefiles/src/main/java/org/apache/hop/workflow/actions/movefiles/ActionMoveFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfilefolder.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfilename.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
currentfile.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpdecryptfiles/ActionPGPDecryptFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfilefolder.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfilename.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
sourcefilename.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
destinationfile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
currentfile.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/pgpfiles/src/main/java/org/apache/hop/workflow/actions/pgpencryptfiles/ActionPGPEncryptFiles.java`
#### Snippet
```java
folder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/workflow/src/main/java/org/apache/hop/workflow/actions/workflow/ActionWorkflow.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/workflow/src/main/java/org/apache/hop/workflow/actions/workflow/ActionWorkflow.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/workflow/src/main/java/org/apache/hop/workflow/actions/workflow/ActionWorkflow.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/workflow/src/main/java/org/apache/hop/workflow/actions/workflow/ActionWorkflow.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/workflow/src/main/java/org/apache/hop/workflow/actions/workflow/ActionWorkflow.java`
#### Snippet
```java
parentfolder.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/writetofile/src/main/java/org/apache/hop/workflow/actions/writetofile/ActionWriteToFile.java`
#### Snippet
```java
parent.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/writetofile/src/main/java/org/apache/hop/workflow/actions/writetofile/ActionWriteToFile.java`
#### Snippet
```java
parent.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/writetofile/src/main/java/org/apache/hop/workflow/actions/writetofile/ActionWriteToFile.java`
#### Snippet
```java
parent.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/actions/xml/src/main/java/org/apache/hop/workflow/actions/xml/xmlwellformed/XmlWellFormed.java`
#### Snippet
```java
currentFile.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/workflow/engines/remote/RemoteWorkflowEngine.java`
#### Snippet
```java
tempFile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/www/AddExportServlet.java`
#### Snippet
```java
tempFile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/engine/src/main/java/org/apache/hop/www/RegisterPackageServlet.java`
#### Snippet
```java
tempFile.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/ui/src/main/java/org/apache/hop/ui/core/dialog/ErrorDialog.java`
#### Snippet
```java
details.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/ui/src/main/java/org/apache/hop/ui/util/EnvironmentUtils.java`
#### Snippet
```java
browser.evaluate("return window.navigator.userAgent;").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/misc/git/src/main/java/org/apache/hop/git/model/UIGit.java`
#### Snippet
```java
remoteConfig.getURIs().iterator().next().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/misc/git/src/main/java/org/apache/hop/git/model/UIGit.java`
#### Snippet
```java
result.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/misc/git/src/main/java/org/apache/hop/git/model/UIGit.java`
#### Snippet
```java
update.getStatus().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/misc/git/src/main/java/org/apache/hop/git/model/UIGit.java`
#### Snippet
```java
sb.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/misc/git/src/main/java/org/apache/hop/git/model/UIGit.java`
#### Snippet
```java
result.getMergeStatus().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/misc/git/src/test/java/org/apache/hop/git/model/UIGitTest.java`
#### Snippet
```java
db2.getDirectory().toURI().toURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/PipelineLoggingExtensionPoint.java`
#### Snippet
```java
transCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/PipelineLoggingExtensionPoint.java`
#### Snippet
```java
transformCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/PipelineLoggingExtensionPoint.java`
#### Snippet
```java
HopLogStore.getAppender().getBuffer(transLogChannelId, false).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/PipelineLoggingExtensionPoint.java`
#### Snippet
```java
HopLogStore.getAppender().getBuffer(transformLogChannelId, false).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/WorkflowLoggingExtensionPoint.java`
#### Snippet
```java
workflowCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/WorkflowLoggingExtensionPoint.java`
#### Snippet
```java
actionCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/WorkflowLoggingExtensionPoint.java`
#### Snippet
```java
hopCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/WorkflowLoggingExtensionPoint.java`
#### Snippet
```java
workflowCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/WorkflowLoggingExtensionPoint.java`
#### Snippet
```java
HopLogStore.getAppender().getBuffer(workflowLogChannelId, true).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/logging/xp/WorkflowLoggingExtensionPoint.java`
#### Snippet
```java
HopLogStore.getAppender().getBuffer(actionLogChannelId, true).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/perspective/HopNeo4jPerspective.java`
#### Snippet
```java
loggingCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/perspective/HopNeo4jPerspective.java`
#### Snippet
```java
errorPathCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/perspective/HopNeo4jPerspective.java`
#### Snippet
```java
resultsCypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/perspective/HopNeo4jPerspective.java`
#### Snippet
```java
cypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/perspective/HopNeo4jPerspective.java`
#### Snippet
```java
cypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/tech/neo4j/src/main/java/org/apache/hop/neo4j/perspective/HopNeo4jPerspective.java`
#### Snippet
```java
cypher.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/mongodb/src/main/java/org/apache/hop/mongo/NamedReadPreference.java`
#### Snippet
```java
tagsDocument.get(key).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/mongodb/src/main/java/org/apache/hop/mongo/wrapper/NoAuthMongoClientWrapper.java`
#### Snippet
```java
tags.get(tagName).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-hop-4077412674232631907756273929911534715/plugins/transforms/mongodb/src/main/java/org/apache/hop/mongo/wrapper/NoAuthMongoClientWrapper.java`
#### Snippet
```java
toMatch.get(tagName).toString()
```

