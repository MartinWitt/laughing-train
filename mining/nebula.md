# nebula 
 
# Bad smells
I found 11 bad smells with 11 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 11 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/examples/org.eclipse.nebula.examples/src/org/eclipse/nebula/examples/AbstractExampleTab.java`
#### Snippet
```java
typedEvent.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/examples/org.eclipse.nebula.snippets/src/org/eclipse/nebula/snippets/grid/viewer/GridViewerSnippet5.java`
#### Snippet
```java
cell.getElement().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/examples/org.eclipse.nebula.snippets/src/org/eclipse/nebula/snippets/grid/viewer/GridViewerSnippet6.java`
#### Snippet
```java
cell.getElement().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/examples/org.eclipse.nebula.snippets/src/org/eclipse/nebula/snippets/grid/viewer/GridViewerSnippet6.java`
#### Snippet
```java
cell.getElement().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/examples/org.eclipse.nebula.snippets/src/org/eclipse/nebula/snippets/pshelf/PShelfViewerSnippet1.java`
#### Snippet
```java
((TreeNode) (element)).getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/widgets/opal/duallist/org.eclipse.nebula.widgets.opal.duallist.snippets/src/org/eclipse/nebula/widgets/opal/duallist/snippets/DualListSnippet.java`
#### Snippet
```java
sb.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/widgets/opal/multichoice/org.eclipse.nebula.widgets.opal.multichoice.snippets/src/org/eclipse/nebula/widgets/opal/multichoice/snippets/MultiChoiceSnippet.java`
#### Snippet
```java
it.next().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/widgets/opal/multichoice/org.eclipse.nebula.widgets.opal.multichoice.snippets/src/org/eclipse/nebula/widgets/opal/multichoice/snippets/MultiChoiceSnippet.java`
#### Snippet
```java
sb.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/widgets/opal/multichoice/org.eclipse.nebula.widgets.opal.multichoice.snippets/src/org/eclipse/nebula/widgets/opal/multichoice/snippets/MultiChoiceSnippet.java`
#### Snippet
```java
sb.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/widgets/xviewer/org.eclipse.nebula.widgets.xviewer/src/org/eclipse/nebula/widgets/xviewer/XViewer.java`
#### Snippet
```java
custData.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nebula453774726283679242911602916521525969784/widgets/pshelf/org.eclipse.nebula.widgets.pshelf/src/org/eclipse/nebula/jface/pshelfviewer/PShelfViewer.java`
#### Snippet
```java
getLabelProvider().getClass().toString()
```

