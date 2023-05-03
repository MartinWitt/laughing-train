# xtext 
 
# Bad smells
I found 4 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 3 | false |
| ReassignedToPlainText | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `org.eclipse.xtend.doc/contents/book.css`
#### Snippet
```java
H6.CaptionFigColumn {
	display: block;
	text-align: left;
	text-indent: 0.000000pt;
	margin-top: 3.000000pt;
	margin-bottom: 11.000000pt;
	margin-right: 0.000000pt;
	margin-left: 0.000000pt;
	font-size: 9.000000pt;
	font-weight: medium;
	font-style: Italic;
	color: #000000;
	text-decoration: none;
	vertical-align: baseline;
	text-transform: none;
	font-family: "Arial";
}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.xtend.doc/contents/book.css`
#### Snippet
```java
P.Note {
	display: block;
	text-align: left;
	text-indent: 0pt;
	margin-top: 19.500000pt;
	margin-bottom: 19.500000pt;
	margin-right: 0.000000pt;
	margin-left: 30pt;
	font-size: 11.000000pt;
	font-weight: medium;
	font-style: Italic;
	color: #000000;
	text-decoration: none;
	vertical-align: baseline;
	text-transform: none;
	font-family: "Arial";
}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.xtend.doc/contents/code.css`
#### Snippet
```java
P.Code {
	display: block;
	text-align: left;
	text-indent: 0.00pt;
	margin-top: 0.000000pt;
	margin-bottom: 0.000000pt;
	margin-right: 0.000000pt;
	margin-left: 15pt;
	font-size: 9.000000pt;
	font-weight: normal; 
	font-style: Regular;
	color: #000000 !important;
	text-decoration: none;
	vertical-align: baseline;
	text-transform: none;
	font-family: "Lucida Console", Monaco, monospace;
}
```

## RuleId[id=ReassignedToPlainText]
### ReassignedToPlainText
This file was explicitly re-assigned to plain text
in `org.eclipse.xtext.xtext.ui.examples/projects/fowlerdsl/org.eclipse.xtext.example.fowlerdsl/README.TXT`
#### Snippet
```java
Start a new Eclipse Application and create an empty Java project.
Add new source folder called "src-gen/" and put the following statemachine into a file in the "src/" folder.

// MrsGrantsSecretCompartments.statemachine

```

