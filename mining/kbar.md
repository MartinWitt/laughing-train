# kbar 
 
# Bad smells
I found 576 bad smells with 62 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 84 | false |
| CommentedOutCode | 67 | false |
| FieldMayBeFinal | 48 | false |
| UnusedAssignment | 48 | false |
| DuplicatedCode | 42 | false |
| EmptyStatementBody | 36 | false |
| UnnecessaryToStringCall | 26 | true |
| IgnoreResultOfCall | 25 | false |
| DataFlowIssue | 19 | false |
| TrivialIf | 16 | false |
| StringConcatenationInLoops | 16 | false |
| ConstantValue | 16 | false |
| UnnecessaryModifier | 15 | true |
| UNUSED_IMPORT | 11 | false |
| DuplicateCondition | 8 | false |
| UnnecessaryLocalVariable | 8 | true |
| ArraysAsListWithZeroOrOneArgument | 8 | false |
| CatchMayIgnoreException | 7 | false |
| InnerClassMayBeStatic | 7 | true |
| ConditionalBreakInInfiniteLoop | 6 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 6 | false |
| RedundantMethodOverride | 6 | false |
| UnnecessarySemicolon | 5 | false |
| StringOperationCanBeSimplified | 4 | false |
| SwitchStatementWithTooFewBranches | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| CStyleArrayDeclaration | 3 | false |
| UnnecessaryReturn | 3 | true |
| StringConcatenationInsideStringBufferAppend | 3 | false |
| EqualsWithItself | 2 | false |
| RedundantOperationOnEmptyContainer | 2 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| RedundantLengthCheck | 2 | false |
| SwitchStatementWithConfusingDeclaration | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| UnnecessaryContinue | 2 | false |
| JavadocReference | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UnnecessaryLabelOnContinueStatement | 1 | false |
| DanglingJavadoc | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| FieldCanBeLocal | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| RedundantFileCreation | 1 | false |
| UseBulkOperation | 1 | false |
| SuspiciousIndentAfterControlStatement | 1 | false |
## RuleId[id=EqualsWithItself]
### EqualsWithItself
`equals()` called on itself
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			"rm -f "+list_of_tests_to_run_file_temp + "\n", 
			"java -cp "+classpathGzoltar+GZOLTAR_CLI_JAR+" com.gzoltar.cli.Main listTestMethods "+dp.testClassPath+" --outputFile "+list_of_tests_to_run_file+" --includes \""+testsToGzoltar+"\""+"\n" 
			), buggyProject, "test".equals("test") ? 2 : 1);


```

### EqualsWithItself
`equals()` called on itself
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
				"java -javaagent:"+GZOLTAR_AGENT_JAR+"=destfile="+ser_file+",buildlocation="+dp.classPath+",inclnolocationclasses=false,output=\"FILE\" -cp "+classpathGzoltar+GZOLTAR_CLI_JAR+" com.gzoltar.cli.Main runTestMethods --initTestClass --testMethods \""+list_of_tests_to_run_file+"\" --collectCoverage"+"\n", 
				"java -cp "+classpathGzoltar+GZOLTAR_CLI_JAR+" com.gzoltar.cli.Main faultLocalizationReport --buildLocation "+dp.classPath+" --granularity \"line\" --inclPublicMethods --inclStaticConstructors --inclDeprecatedMethods --dataFile "+ser_file+" --outputDirectory \"gzoltarOutput/"+this.buggyProject+"/target\" --family \"sfl\" --formula \"ochiai\" --metric \"entropy\" --formatter \"txt\""+ "\n"
				), buggyProject, "test".equals("test") ? 2 : 1);
	
			}
```

## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[extended.size()\]'
in `src/main/java/edu/lu/uni/serval/tbar/utils/JavaLibrary.java`
#### Snippet
```java
		List<URL> extended = newLinkedList(destination);
		extended.addAll(asList(classPathFrom(classpath)));
		return extended.toArray(new URL[extended.size()]);
	}

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[tests.size()\]'
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/TestClassesFinder.java`
#### Snippet
```java
			}
		}
		return tests.toArray(new String[tests.size()]);
	}
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[classes.size()\]'
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/TestFinder.java`
#### Snippet
```java
			}
		});
		return classes.toArray(new Class[classes.size()]);
	}

```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `failedTestsAfterFix` is always empty
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	

			failedTestsAfterFix.removeAll(this.fakeFailedTestCasesList);
			
			if (errorTestAfterFix < minErrorTest) {
```

### RedundantOperationOnEmptyContainer
Collection `tmpFailedTestsAfterFix` is always empty
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				List<String> tmpFailedTestsAfterFix = new ArrayList<>();
				tmpFailedTestsAfterFix.addAll(failedTestsAfterFix);
				tmpFailedTestsAfterFix.removeAll(this.failedTestStrList);
				if (tmpFailedTestsAfterFix.size() > 0) { // Generate new bugs.
					log.debug(buggyProject + " ---Generated new bugs: " + tmpFailedTestsAfterFix.size());
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
				String methodName = line.substring(sharpIndex + 1);
				methodName = methodName.substring(0, methodName.indexOf("("));
				Integer buggyLine = Integer.parseInt(line.substring(colonIndex + 1, semicolonIndex));
				Double suspiciousness = Double.parseDouble(line.substring(semicolonIndex + 1));
				if (Double.compare(suspiciousness, 0.0d) == 0) break;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
				methodName = methodName.substring(0, methodName.indexOf("("));
				Integer buggyLine = Integer.parseInt(line.substring(colonIndex + 1, semicolonIndex));
				Double suspiciousness = Double.parseDouble(line.substring(semicolonIndex + 1));
				if (Double.compare(suspiciousness, 0.0d) == 0) break;
				if (allTestCases.contains(className + "#" + methodName)) continue;// Test case.
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/jdt/tree/hash/HashGenerator.java`
#### Snippet
```java
public interface HashGenerator {

    public void hash(ITree t);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/jdt/tree/ITree.java`
#### Snippet
```java
    Iterator<Entry<String, Object>> getMetadata();
    
    public abstract String getChildrenLabels();

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/edu/lu/uni/serval/jdt/tree/ITree.java`
#### Snippet
```java
    Iterator<Entry<String, Object>> getMetadata();
    
    public abstract String getChildrenLabels();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/IFixer.java`
#### Snippet
```java
	public List<SuspiciousPosition> readSuspiciousCodeFromFile();
	
	public List<SuspCodeNode> parseSuspiciousCode(SuspiciousPosition suspiciousCode);

	public void fixProcess();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/IFixer.java`
#### Snippet
```java
	public List<SuspCodeNode> parseSuspiciousCode(SuspiciousPosition suspiciousCode);

	public void fixProcess();
	
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/IFixer.java`
#### Snippet
```java
public interface IFixer {

	public List<SuspiciousPosition> readSuspiciousCodeFromFile();
	
	public List<SuspCodeNode> parseSuspiciousCode(SuspiciousPosition suspiciousCode);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/IFixTemplate.java`
#### Snippet
```java
	public void setSuspiciousCodeTree(ITree suspiciousCodeTree);
	
	public ITree getSuspiciousCodeTree();
	
	public void generatePatches();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/IFixTemplate.java`
#### Snippet
```java
	public List<Patch> getPatches();
	
	public String getSubSuspiciouCodeStr(int startPos, int endPos);
	
	public void setDictionary(Dictionary dic);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/IFixTemplate.java`
#### Snippet
```java
	public String getSuspiciousCodeStr();
	
	public void setSuspiciousCodeTree(ITree suspiciousCodeTree);
	
	public ITree getSuspiciousCodeTree();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/IFixTemplate.java`
#### Snippet
```java
	public String getSubSuspiciouCodeStr(int startPos, int endPos);
	
	public void setDictionary(Dictionary dic);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/IFixTemplate.java`
#### Snippet
```java
	public void generatePatches();
	
	public List<Patch> getPatches();
	
	public String getSubSuspiciouCodeStr(int startPos, int endPos);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/IFixTemplate.java`
#### Snippet
```java
public interface IFixTemplate {
	
	public void setSuspiciousCodeStr(String suspiciousCodeStr);
	
	public String getSuspiciousCodeStr();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/IFixTemplate.java`
#### Snippet
```java
	public ITree getSuspiciousCodeTree();
	
	public void generatePatches();
	
	public List<Patch> getPatches();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/IFixTemplate.java`
#### Snippet
```java
	public void setSuspiciousCodeStr(String suspiciousCodeStr);
	
	public String getSuspiciousCodeStr();
	
	public void setSuspiciousCodeTree(ITree suspiciousCodeTree);
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/edu/lu/uni/serval/entity/EntityType.java`
#### Snippet
```java
    private final boolean fIsValidChange;

    private EntityType(boolean isValidChange) {
        fIsValidChange = isValidChange;
    }
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files.length > 0) {
					for (File f : files) {
						if (f.isFile()) {
```

### RedundantLengthCheck
Redundant array length check
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files.length > 0) {
					for (File f : files) {
						if (f.isFile()) {
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			}
		} else {
			while (true) {
				int parentTreeType = codeAst.getType();
				if (Checker.isStatement(parentTreeType)) {// variable
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
		// Insert a method invocation as a complete statement.
		ITree parent = suspCodeTree.getParent();
		while (true) {
			if (Checker.isTypeDeclaration(parent.getType())) break;
			parent = parent.getParent();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
	public void setDictionary(Dictionary dictionary) {
		ITree classNodeTree = this.suspiciousCodeTree;
		while (true) {
			if (Checker.isTypeDeclaration(classNodeTree.getType())) break;
			classNodeTree = classNodeTree.getParent();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
							// ArrayAccess: arrray[].method()
							ITree arrayVarTree = prePeerCodeAst.getChild(0);
							while (true) {
								if (!Checker.isArrayAccess(arrayVarTree.getType())) break;
								arrayVarTree = arrayVarTree.getChild(0);
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	private void readClassDeclaration(ITree suspCodeTree) {
		ITree parent = suspCodeTree.getParent();
		while (true) {
			if (Checker.isTypeDeclaration(parent.getType())) {
				this.classDeclarationAst = parent;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		ITree exp = para.getChild(0);
		int i = 1;
		while (true) {
			if (!Checker.isArrayAccess(exp.getType())) break;
			exp = exp.getChild(0);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `edu.lu.uni.serval.jdt.tree.hash.github.gumtreediff.tree.hash.HashGenerator`
in `src/main/java/edu/lu/uni/serval/jdt/tree/ITree.java`
#### Snippet
```java
    /**
     * Refresh hash, size, depth and height of the tree.
     * @see edu.lu.uni.serval.jdt.tree.hash.github.gumtreediff.tree.hash.HashGenerator
     * @see TreeUtils#computeDepth(ITree)
     * @see TreeUtils#computeHeight(ITree)
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java

		String[] arrSplit = incomingDeps.split(",");
		for (int i=0; i < arrSplit.length; i++)
		{
			Configuration.additionalDepsFromCmdLine.add(arrSplit[i]);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementMover.java`
#### Snippet
```java
			} else if (index > buggyStmtIndex){
				// move the buggy statement after this statement.
				int endPos = peerStmts.get(index).getPos() + peerStmts.get(index).getLength();;
				String code = this.suspJavaFileCode.substring(suspCodeEndPos, endPos);
				String fixedCodeStr1 = code  + "\n\t" + this.getSuspiciousCodeStr() + "\n";
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/LiteralExpressionMutator.java`
#### Snippet
```java
		
		for (ITree suspCon : suspCons) {
			List<String> varCandidates = new ArrayList<>();;
			int suspConType = suspCon.getType();
			if (Checker.isStringLiteral(suspConType)) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
						for (ITree subChild : subChildren) {
							if (readVar) {
								String varName_ = subChild.getChild(0).getLabel();;
								if (varName.equals(varName_)) return varType;
							} else if (!Checker.isModifier(subChild.getType())) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		String superClassName = readSuperClassName(codeAst);
		if (superClassName != null) {
			String superClassPath = findJavaFilePath(codeAst, srcCodePath, superClassName);;
			if (superClassPath != null && new File(superClassPath).exists()) {
				ITree superClassTree = new ASTGenerator().generateTreeForJavaFile(superClassPath, TokenType.EXP_JDT);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
		private List<ITree> triedInfixExps = new ArrayList<>();
		
		public ConditionalExpressionOperatorMutator() {};
		@SuppressWarnings("unused")
		public ConditionalExpressionOperatorMutator(boolean isConditionalOperator) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java
        this.hash = NO_VALUE;
        this.height = NO_VALUE;
        this.depth = NO_VALUE;
        this.size = NO_VALUE;
        this.pos = NO_VALUE;
```

### DataFlowIssue
Method invocation `newInstance` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
        public C instantiate(Object[] args) {
            try {
                return factory.newInstance(args);
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                return null;
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
	public JavaCodeFileParser(File javaFile) {
		File[] files = javaFile.getParentFile().listFiles();
		for (File file : files) {
			String fileName = file.getName();
			if (file.isDirectory()) continue;
```

### DataFlowIssue
Argument `parameters` might be null
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
		pushNode(methodName, "MethodName:" + methodName.getFullyQualifiedName());
		popNode();
		visitList(parameters);
//		visitList(exceptionTypes);

```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		File[] files = directory.listFiles();
		
		for (File file : files) {
			if (file.isFile()) {
				if (file.toString().endsWith(type)) {
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files.length > 0) {
					for (File f : files) {
						if (f.isFile()) {
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files.length > 0) {
					for (File f : files) {
						if (f.isFile()) {
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		File[] files = file.listFiles();
		
		for (File f : files) {
			if (f.isDirectory()) {
				fileList.add(f);
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		if (file.exists()) {
			File[] files = file.listFiles();
			for (File f : files) {
				if (f.isDirectory()) {
					subDirectories.add(f);
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		File[] files = file.listFiles();
		
		for (File f : files) {
			if (f.isFile()) {
				if (f.toString().endsWith(type)) {
```

### DataFlowIssue
Dereference of `testSrcFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/SourceFolderFinder.java`
#### Snippet
```java
	public List<String> getClassesLoc(File testSrcFolder, String pack) {
		List<String> classes = new ArrayList<>();
		for (File file : testSrcFolder.listFiles()) {
			if (file.isDirectory())
				classes.addAll(getClassesLoc(file, pack == null ? file.getName() : pack + '.' + file.getName()));
```

### DataFlowIssue
Method invocation `trim` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            }
            
            return result.trim();
        } catch (IOException e){
        	e.printStackTrace();
```

### DataFlowIssue
Method invocation `trim` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            }

            return result.trim();
        } catch (IOException e){
        	e.printStackTrace();
```

### DataFlowIssue
Method invocation `getLabel` may produce `NullPointerException`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
				break;
			}
			String dataType = ContextReader.readType(type.getLabel());
			
			// we only focus on the primitive types.
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
							
							// n * m * l: a set of variable groups used to synthesis patches by replacing the original variables in 'donorCode'.
							maps = ContextReader.arrangeVariableGroups(maps, donorVarName, exchangableVars);
						}
						if (isFailed) continue;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
					// PAR Patch 2.
					if (returnType != null && !returnType.isEmpty()) {
						fixedCodeStr1 = fixedCodeStr1.append(") return");
						if ("void".equals(returnType)) {
							fixedCodeStr1.append(";\n");
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
					
					// n * m * l: a set of variable groups used to synthesis patches with this method.
					maps = ContextReader.arrangeVariableGroups(maps, parameterType, vars);
				}
				if (!isMatched) continue;
```

### DataFlowIssue
Argument `rootTree` might be null
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
											rootTree = new ASTGenerator().generateTreeForJavaFile(dataTypeFile, TokenType.EXP_JDT);
										}
										varType = readFieldType(rootTree, dataType, fieldName);
									}
								} else {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
						if (superClassPath != null) {
							path = identifyJavaFilePath(new ASTGenerator().generateTreeForJavaFile(superClassPath, TokenType.EXP_JDT), varType);
						} else path = null;
					}
				}
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
				}
				identifyInfo(child, child);
			} else {
			}
 		}
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
                returnString=output.toString();
                //System.exit(0);
            } else {
                //abnormal...
            }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		boolean needBuggyCode = false;
		if (exactBuggyCodeEndPos > exactBuggyCodeStartPos) {
			if ("MOVE-BUGGY-STATEMENT".equals(fixedCodeStr2)) {
				// move statement position.
			} else if (exactBuggyCodeStartPos != -1 && exactBuggyCodeStartPos < scn.startPos) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			if ("MOVE-BUGGY-STATEMENT".equals(fixedCodeStr2)) {
				// move statement position.
			} else if (exactBuggyCodeStartPos != -1 && exactBuggyCodeStartPos < scn.startPos) {
				// Remove the buggy method declaration.
			} else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
					exactBuggyCodeStartPos = scn.startPos;
					exactBuggyCodeEndPos = scn.endPos;
				} else {
					// Insert a block-held statement to surround the buggy code
				}
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ClassCastChecker.java`
#### Snippet
```java
			ITree exp = children.get(0);
			int expType = exp.getType();
			if (Checker.isReturnStatement(expType)) { // Empty return statement, i.e., "return;".
			} else {
				if (Checker.isCastExpression(expType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ClassCastChecker.java`
#### Snippet
```java
				castExps.putAll(identifyCastExpressions(exp));
			}
		} else if (Checker.isFieldDeclaration(astNodeType)) {
			// FIXME: we ignore this situation in the current version.
		} else if(Checker.isComplexExpression(astNodeType) || Checker.isSimpleName(astNodeType)) { // expressions
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
					this.generatePatch(fixedCodeStr1);
				}
			} else {
				// TODO: other data types.
			}
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/LiteralExpressionMutator.java`
#### Snippet
```java
			List<String> varCandidates = new ArrayList<>();;
			int suspConType = suspCon.getType();
			if (Checker.isStringLiteral(suspConType)) {
				// TODO: How to select other string literals?
//				List<String> vars = allVarNamesMap.get("String");
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/LiteralExpressionMutator.java`
#### Snippet
```java
//				vars = allVarNamesMap.get("Boolean");
//				if (vars != null) varCandidates.addAll(vars);
			} else {
				// TODO: How to select other character literals?
//				List<String> vars = allVarNamesMap.get("char");
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
						// FindBugs NP_NULL_ON_SOME_PATH Patch 2.
						fixedCodeStr1 = "if (" + var + " == null) {\n\t    return";
						if ("void".equals(returnType)) {
							// NPEFix S4a
						} else if ("float".equals(returnType) || "double".equals(returnType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	private void identifyPredicateExpressionsInParentTree(ITree tree, int distance, Map<ITree, Integer> predicateExps) {
		int treeType = tree.getType();
		if (Checker.isTypeDeclaration(treeType)) {
		} else if (Checker.isMethodDeclaration(treeType) && !ignoreOtherMethods) {
			ITree parent = tree.getParent();
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
		
		Pair<String, ITree> equalsMethod = findEqualsMethodDeclaration(suspCodeTree);
		if (equalsMethod != null) {
			/*
			 * public boolean equals(Object o) {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			if (path.endsWith("INNER-CLASS")) {
				path = path.substring(0, path.length() - 11);
			} else {
				
			}
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	private List<String> readMethodParameterTypes(List<ITree> parameters) {
		List<String> paraTypeStrs = new ArrayList<>();
		if (parameters == null || parameters.isEmpty()) {
			// no parameter.
		} else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	
	protected boolean matchParameterType(String paraType, String targetType) {
		if (paraType.equals("Object")) {
			// fuzzy matching.
		} else if (paraType.equals(targetType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		if (paraType.equals("Object")) {
			// fuzzy matching.
		} else if (paraType.equals(targetType)) {
		} else if ((paraType.equals("char") || paraType.equals("Character"))
				&& targetType.equals("char") || targetType.equals("Character")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			// fuzzy matching.
		} else if (paraType.equals(targetType)) {
		} else if ((paraType.equals("char") || paraType.equals("Character"))
				&& targetType.equals("char") || targetType.equals("Character")) {
		} else if ((paraType.equals("int") || paraType.equals("Integer"))
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else if ((paraType.equals("char") || paraType.equals("Character"))
				&& targetType.equals("char") || targetType.equals("Character")) {
		} else if ((paraType.equals("int") || paraType.equals("Integer"))
				&& targetType.equals("int") || targetType.equals("Integer")) {
		} else if (paraType.equalsIgnoreCase("boolean") && targetType.equalsIgnoreCase("boolean")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else if ((paraType.equals("int") || paraType.equals("Integer"))
				&& targetType.equals("int") || targetType.equals("Integer")) {
		} else if (paraType.equalsIgnoreCase("boolean") && targetType.equalsIgnoreCase("boolean")) {
		} else if (paraType.equalsIgnoreCase("byte") && targetType.equalsIgnoreCase("byte")) {
		} else if (paraType.equalsIgnoreCase("short") && targetType.equalsIgnoreCase("short")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
				&& targetType.equals("int") || targetType.equals("Integer")) {
		} else if (paraType.equalsIgnoreCase("boolean") && targetType.equalsIgnoreCase("boolean")) {
		} else if (paraType.equalsIgnoreCase("byte") && targetType.equalsIgnoreCase("byte")) {
		} else if (paraType.equalsIgnoreCase("short") && targetType.equalsIgnoreCase("short")) {
		} else if (paraType.equalsIgnoreCase("long") && targetType.equalsIgnoreCase("long")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else if (paraType.equalsIgnoreCase("boolean") && targetType.equalsIgnoreCase("boolean")) {
		} else if (paraType.equalsIgnoreCase("byte") && targetType.equalsIgnoreCase("byte")) {
		} else if (paraType.equalsIgnoreCase("short") && targetType.equalsIgnoreCase("short")) {
		} else if (paraType.equalsIgnoreCase("long") && targetType.equalsIgnoreCase("long")) {
		} else if (paraType.equalsIgnoreCase("float") && targetType.equalsIgnoreCase("float")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else if (paraType.equalsIgnoreCase("byte") && targetType.equalsIgnoreCase("byte")) {
		} else if (paraType.equalsIgnoreCase("short") && targetType.equalsIgnoreCase("short")) {
		} else if (paraType.equalsIgnoreCase("long") && targetType.equalsIgnoreCase("long")) {
		} else if (paraType.equalsIgnoreCase("float") && targetType.equalsIgnoreCase("float")) {
		} else if (paraType.equalsIgnoreCase("double") && targetType.equalsIgnoreCase("double")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else if (paraType.equalsIgnoreCase("short") && targetType.equalsIgnoreCase("short")) {
		} else if (paraType.equalsIgnoreCase("long") && targetType.equalsIgnoreCase("long")) {
		} else if (paraType.equalsIgnoreCase("float") && targetType.equalsIgnoreCase("float")) {
		} else if (paraType.equalsIgnoreCase("double") && targetType.equalsIgnoreCase("double")) {
		} else if (!paraType.contains("-" + targetType + "-")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else if (paraType.equalsIgnoreCase("long") && targetType.equalsIgnoreCase("long")) {
		} else if (paraType.equalsIgnoreCase("float") && targetType.equalsIgnoreCase("float")) {
		} else if (paraType.equalsIgnoreCase("double") && targetType.equalsIgnoreCase("double")) {
		} else if (!paraType.contains("-" + targetType + "-")) {
		} else if (paraType.contains("," + targetType + ",")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else if (paraType.equalsIgnoreCase("float") && targetType.equalsIgnoreCase("float")) {
		} else if (paraType.equalsIgnoreCase("double") && targetType.equalsIgnoreCase("double")) {
		} else if (!paraType.contains("-" + targetType + "-")) {
		} else if (paraType.contains("," + targetType + ",")) {
		} else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else if (paraType.equalsIgnoreCase("double") && targetType.equalsIgnoreCase("double")) {
		} else if (!paraType.contains("-" + targetType + "-")) {
		} else if (paraType.contains("," + targetType + ",")) {
		} else {
			return false;
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
				methodName = methodName.substring(0, methodName.indexOf(":"));
				
				if (Checker.isSuperMethodInvocation(methodNameNode.getParent().getType())) {
//					varType = "this+Super";
//					rootTree = this.classDeclarationAst;
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
								// TODO: method1().var.method2()
								continue;
							} else {
//								rootTree = this.classDeclarationAst;
							}
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
								if (varType == null) continue; // It seems impossible as well.
//								rootTree = this.classDeclarationAst;
							} else if (Checker.isQualifiedName(arrayVarType)) {
							} else if (Checker.isFieldAccess(arrayVarType)) {
							} else if (Checker.isSuperFieldAccess(arrayVarType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
//								rootTree = this.classDeclarationAst;
							} else if (Checker.isQualifiedName(arrayVarType)) {
							} else if (Checker.isFieldAccess(arrayVarType)) {
							} else if (Checker.isSuperFieldAccess(arrayVarType)) {
							} else {// MethodInvocation or SuperMethodInvocation
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
							} else if (Checker.isQualifiedName(arrayVarType)) {
							} else if (Checker.isFieldAccess(arrayVarType)) {
							} else if (Checker.isSuperFieldAccess(arrayVarType)) {
							} else {// MethodInvocation or SuperMethodInvocation
								// ParenthesizedExpression --> (CastExpression)
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
								// TODO
							}
						} else if (Checker.isClassInstanceCreation(prePeerCodeAstType)) {
							// ClassInstanceCreation: new A().method().
						} else if (Checker.isSuperMethodInvocation(prePeerCodeAstType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
						} else if (Checker.isClassInstanceCreation(prePeerCodeAstType)) {
							// ClassInstanceCreation: new A().method().
						} else if (Checker.isSuperMethodInvocation(prePeerCodeAstType)) {
							// SuperMethodInvocation
						} else { // StringLiteral, 
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
		if (operatorType == 2) {
			new AssignmentOperatorMuataor().generatePatches(suspCodeTree);
		} else if (operatorType == 5) {
//			new InstanceofMutator().generatePatches(suspCodeTree);
		} else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
					if ("2".equals(arithmeticOpExp.getChild(2).getLabel())) {
						ITree parentTree = arithmeticOpExp.getParent();
						if (Checker.isInfixExpression(parentTree.getType())) {
						} else if (Checker.isParameterizedType(parentTree.getType())) {
							parentTree = parentTree.getParent();
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/SourceFolderFinder.java`
#### Snippet
```java
			else if (file.getName().endsWith(".java")) {
				String className = pack == null ? file.getName() : pack + '.' + file.getName();
				className = className.substring(0, className.length());
				classes.add(className);
			} else if (file.getName().endsWith(".class")) {
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/SourceFolderFinder.java`
#### Snippet
```java
			} else if (file.getName().endsWith(".class")) {
				String className = pack == null ? file.getName() : pack + '.' + file.getName();
				className = className.substring(0, className.length());
				classes.add(className);
			}
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
							for (ITree donorVarTree : donorVarTrees) {
								int pos = donorVarTree.getPos() - donorStartPos;
								fixedCodeStr1.append(donorCode.substring(startPos2, pos));
								startPos2 = pos + donorVarTree.getLength();
								
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
//			return "Object"; // TODO
		} else if (Checker.isNumberLiteral(paraAstType)){ // NumberLiteral
			String lastChar = paraLabel.substring(paraLabel.length() - 1, paraLabel.length());
			if ("l".equalsIgnoreCase(lastChar)) {
				return "long";
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `hexDigits`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java

	public static String getMD5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] btInput = s.getBytes("utf-8");
```

### CStyleArrayDeclaration
C-style array declaration of local variable `str`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
			byte[] md = mdInst.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `gzoltarargs`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			long totalstartTimeGzoltar = System.nanoTime();	

			String gzoltarargs[] = argumentsIn.split(":"); 
			String arg1 = gzoltarargs[0]; //gzoltar
			String modeAll = gzoltarargs[1]; //all or fail
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeContext.java`
#### Snippet
```java
        }

//        public void addAll(Map<String, E> serializers) {
//            serializers.forEach((k, s) -> add(k, s));
//        }
```

### CommentedOutCode
Commented out code (13 lines)
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeContext.java`
#### Snippet
```java
     * Get serializers for this tree context
     */
//    public MetadataSerializers getSerializers() {
//        return serializers;
//    }
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeContext.java`
#### Snippet
```java

    public TreeContext export(String... name) {
//        for (String n : name)
//            serializers.add(n, x -> x.toString());
        return this;
```

### CommentedOutCode
Commented out code (27 lines)
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeContext.java`
#### Snippet
```java
    }

//    public static class MetadataSerializers extends Marshallers<MetadataSerializer> {
//
//        public void serialize(TreeFormatter formatter, String key, Object value) throws Exception {
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		Configuration.bugId=bugIdStr;
		
		//String[] elements = bugIdStr.split("_");
		//String projectName = elements[0];
		//int bugId;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java
	public static ArrayList<String> getSrcPath(String bugProject) {
		ArrayList<String> path = new ArrayList<String>();
		//String[] words = bugProject.split("_");
		//String projectName = words[0];
		//int bugId = Integer.parseInt(words[1]);
```

### CommentedOutCode
Commented out code (70 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java
		//String projectName = words[0];
		//int bugId = Integer.parseInt(words[1]);
		/*if (projectName.equals("Math")) {
			if (bugId < 85) {
				path.add("/target/classes/");
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java
		path.append(System.getProperty("path.separator"));

		/*for (String addclasspath : Configuration.additionalClasspathsFromCmdLine) {
			path.append(addclasspath);
			path.append(System.getProperty("path.separator"));
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java
		path.append(System.getProperty("path.separator"));

		/*for (String addclasspath : Configuration.additionalClasspathsFromCmdLine) {
			path.append(addclasspath);
			path.append(System.getProperty("path.separator"));
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
				popNode();
			}
//			for (Object obj : typeArguments) {
//				Type typeArgu = (Type) obj; // TypeArugment: Collections.<T>emptyList()
//				pushNode(typeArgu, "TypeArgument:" + typeArgu.getClass().getSimpleName() + ":" + typeArgu.toString());
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
	@Override
	public boolean visit(ExpressionMethodReference node) {
//		pushNode(node, node.getName().getFullyQualifiedName());
//		Expression exp = node.getExpression();
//		exp.accept(this);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
		Block methodBody = node.getBody();
		if (methodBody != null) {
//			push(8, "Block", "MethodBody", methodBody.getStartPosition(), methodBody.getLength());
//			methodBody.accept(this);
			List<?> stmts = methodBody.statements();
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
	public boolean visit(NumberLiteral node) {
		String num = node.getToken();
//		if (num.endsWith("L") || num.endsWith("l")) {
//			num = "longNumber";
//		}
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
	@Override
	public boolean visit(CreationReference node) {
//		pushNode(node, node.toString());
//		Type type = node.getType();
//		type.accept(this);
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
			label = exp.toString();
		}
//		List<?> typeArguments = node.typeArguments();
//		for (Object obj : typeArguments) {
//			Type typeArgu = (Type) obj;// TypeArugment: Collections.<T>emptyList()
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        exp.accept(this);
//        int startPosition = exp.getStartPosition();
//        int length1 = exp.getLength();
//        int length2 = node.getLength();
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			counter++;

			/*if(counter<50)
			{
				continue;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				}

				//fullBuggyProjectPath
				//result = ShellUtils.shellRun(Arrays.asList("cd " + projectName + "\n", "mvn -Dmaven.test.skip clean install"), buggyProject, cmdType.equals("test") ? 2 : 1);//"defects4j " + cmdType + "\n"));//
			}
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java

				if (results.isEmpty()) {
//					System.out.println(scn.suspiciousJavaFile + "@" + scn.buggyLine);
//					System.out.println("Bug: " + buggyCode);
//					System.out.println("Patch: " + patchCode);
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		this.buggyProject = bugIdStr;
		fullBuggyProjectPath = path + buggyProject;
		//this.defects4jPath = defects4jPath;
//		int compileResult = TestUtils.compileProjectWithDefects4j(fullBuggyProjectPath, this.defects4jPath);
//      if (compileResult == 1) {
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		
		TestUtils.checkout(this.fullBuggyProjectPath);
//		if (FileHelper.getAllFiles(fullBuggyProjectPath + PathUtils.getSrcPath(buggyProject).get(0), ".class").isEmpty()) {
			//TestUtils.compileProjectWithDefects4j(fullBuggyProjectPath, defects4jPath);
//		}
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java


		/*if (minErrorTest == Integer.MAX_VALUE) {
			TestUtils.getFailTestNumInProject(fullBuggyProjectPath, defects4jPath, failedTestStrList);
			minErrorTest = TestUtils.getFailTestNumInProject(fullBuggyProjectPath, defects4jPath, failedTestStrList);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			//System.out.println("ForLoop:"+failedTestCase);
			failed.add(failedTestCase);
			//failedTestCase = failedTestCase.substring(failedTestCase.indexOf("-") + 1).trim();
			//failedTestCasesStrList.add(failedTestCase);
			int colonIndex = failedTestCase.indexOf("::");
```

### CommentedOutCode
Commented out code (17 lines)
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
		testCases = new TestClassesFinder().findIn(JavaLibrary.classPathFrom(testClassPath + ":" + classPath), false);

//		List<File> testCasesFiles = FileHelper.getAllFiles(testClassPath, ".class");
////		testCasesFiles.addAll(FileHelper.getAllFiles(testClassPath, "Tests.class"));
//		StringBuilder b = new StringBuilder();
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
    
    public void prepareData(String buggyProject,ArrayList<String> pathsFromCmdLine){
//		libPath.add(FromString.class.getProtectionDomain().getCodeSource().getLocation().getFile());
//		libPath.add(EasyMock.class.getProtectionDomain().getCodeSource().getLocation().getFile());
//		libPath.add(IOUtils.class.getProtectionDomain().getCodeSource().getLocation().getFile());
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
		classPaths = JavaLibrary.classPathFrom(testClassPath);
		classPaths = JavaLibrary.extendClassPathWith(classPath, classPaths);
		//classPaths = JavaLibrary.extendClassPathWith(additionaltest, classPaths); // nytt
		//classPaths = JavaLibrary.extendClassPathWith(additionalnotest, classPaths); // nytt
		if (libPaths != null) {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
		List<String> paths = pathsFromCmdLine;

		/*
				path.add("/target/classes/");
				path.add("/target/test-classes/");
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
		testSrcPath = projectDir + buggyProject + paths.get(3);

		//System.out.println("testClassPath: "+testClassPath);
		//System.exit(0);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
			libPaths.add(libPackage.getAbsolutePath());
		}
		//System.out.println("Slutar");
		//System.exit(0);
	}
```

### CommentedOutCode
Commented out code (15 lines)
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/TestClassesFinder.java`
#### Snippet
```java
		}

//		if (this.logger.isDebugEnabled()) {
//			this.logger.debug("Test clases:");
//			for (String testClass : testClasses) {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
		String compileResults = getProjectResultCompile(projectName,"compile");
		String[] lines = compileResults.split("\n");
		/*if (lines.length != 2) return 1;
        for (String lineString: lines){
        	if (!lineString.endsWith("OK")) return 1;
```

### CommentedOutCode
Commented out code (36 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
	}
	
//	public static int getFailTestNumInProject(String buggyProject, List<String> failedTests, String classPath,
//			String testClassPath, String[] testCasesArray){
//		StringBuilder builder = new StringBuilder();
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
//	}
	
	/*public static int compileProjectWithDefects4j(String projectName, String defects4jPath) {
		String compileResults = getDefects4jResult(projectName, defects4jPath, "compile");
		String[] lines = compileResults.split("\n");
```

### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
	}

	/*private static String getDefects4jResult(String projectName, String defects4jPath, String cmdType) {
		try {
			String buggyProject = projectName.substring(projectName.lastIndexOf("/") + 1);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        }

        /*if(readBoth && st.trim().isEmpty()){ //3. Stop reading Results || Running
            readBoth=false;
        }*/
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
					}
				} else if (Checker.isClassInstanceCreation(contextInfo)) {
//					ft = new CNIdiomNoSuperCall();
//					if (isTestFixPatterns) dataType = readDirectory() + "/CNIdiomNoSuperCall";
					if (!methodChanged) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
//					if (isTestFixPatterns) dataType = readDirectory() + "/CNIdiomNoSuperCall";
					if (!methodChanged) {
//						generateAndValidatePatches(ft, scn);
//						if (!isTestFixPatterns && this.minErrorTest == 0) return;
						methodChanged = true;
```

### CommentedOutCode
Commented out code (14 lines)
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		File suspiciousFile = null;
		String suspiciousFilePath = "";
		/*if (this.suspCodePosFile == null) {
			suspiciousFilePath = Configuration.suspPositionsFilePath;
		} else {
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	}
	
	/*public TBarFixer(String path, String metric, String projectName, int bugId, String defects4jPath) {
		super(path, metric, projectName, bugId, defects4jPath);
	}*/
```

### CommentedOutCode
Commented out code (36 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
		// PAR Caster Mutator
		// TODO How to select the data type, or what kinds of buggy types are targeted?
//		ITree suspStmtTree = this.getSuspiciousCodeTree();
//		Map<ITree, String> castExps = new ClassCastChecker().identifyCastExpressions(suspStmtTree);
//		if (castExps.isEmpty())
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/LiteralExpressionMutator.java`
#### Snippet
```java
			if (Checker.isStringLiteral(suspConType)) {
				// TODO: How to select other string literals?
//				List<String> vars = allVarNamesMap.get("String");
//				if (vars != null) varCandidates.addAll(vars);
			} else if (Checker.isNumberLiteral(suspConType)) {
```

### CommentedOutCode
Commented out code (20 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/LiteralExpressionMutator.java`
#### Snippet
```java
					}
				}
//				List<String> vars = allVarNamesMap.get("int");
//				if (vars != null) varCandidates.addAll(vars);
//				vars = allVarNamesMap.get("Integer");
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/LiteralExpressionMutator.java`
#### Snippet
```java
				if ("true".equals(suspCon.getLabel())) varCandidates.add("false");
				else varCandidates.add("true");
//				List<String> vars = allVarNamesMap.get("boolean");
//				if (vars != null) varCandidates.addAll(vars);
//				vars = allVarNamesMap.get("Boolean");
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/LiteralExpressionMutator.java`
#### Snippet
```java
			} else {
				// TODO: How to select other character literals?
//				List<String> vars = allVarNamesMap.get("char");
//				if (vars != null) varCandidates.addAll(vars);
//				vars = allVarNamesMap.get("Character");
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			List<Field> fields = dic.findFieldsByClassPath(dependency);
			if (fields == null) {
//				File javaFile = new File(codePath + dependency.replace(".", "/") + ".java");
//				if (!javaFile.exists()) {
//					String classPath = dependency.substring(0, dependency.lastIndexOf("."));
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
			ContextReader.readAllVariablesAndFields(suspCodeTree, allVarNamesMap, varTypesMap, allVarNamesList, sourceCodePath, dic);
			ITree returnExp = suspCodeTree.getChild(0);
//			if (Checker.isBooleanLiteral(returnExp.getType())) {
//				if ("true".equals(returnExp.getLabel())) this.generatePatch("return false;\n");
//				else this.generatePatch("return true;\n");
```

### CommentedOutCode
Commented out code (12 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
			 * 
			 */
//			ITree method = equalsMethod.getSecond();
//			String parameterName = equalsMethod.getFirst();
//			ITree classTree = method.getParent();
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
			
			if (Checker.isSwitchStatement(parentNodeType)) {
//				if (!Checker.isSwitchCase(suspCodeTree.getType())) {
//				} else {
//				}
```

### CommentedOutCode
Commented out code (13 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
		 * Insert a new if statement.
		 */
//		for (String var : varStrList) {
//			String varType = varTypesMap.get(var);
//			if (varType == null) continue;
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
				} else sameTypeVars = new ArrayList<>();
				
//				List<String> variables = new ArrayList<>();
//				variables.addAll(allVarNamesList);
//				variables.removeAll(sameTypeVars);
```

### CommentedOutCode
Commented out code (21 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
	}

//	private List<Pair<String, Double>> identifySimilarVariableNames(String suspVarName, List<String> vars) {
//		List<Pair<String, Double>> similarVars = new ArrayList<>();
//		int index = suspVarName.lastIndexOf(".");
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				List<Field> value = entry.getValue();

				/*System.out.println("key: "+key); //key: org.apache.commons.lang3.ClassUtils
				//System.out.println("value: "+value); //SKRIV INTE UT
				System.out.println("value size: "+value.size()); */
```

### CommentedOutCode
Commented out code (10 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				Configuration.dictionarysize+=value.size();

				/*for (int i = 0; i < value.size(); i++) {
					System.out.println(value.get(i).getVarName()); //ClassUtils.PACKAGE_SEPARATOR_CHAR
					System.out.println(value.get(i).getPackageName()); //null
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				List<String> value = entry.getValue();

				//System.out.println("key: "+key); //key: org.apache.commons.lang3.ClassUtils
				//System.out.println("value: "+value);  
				//System.out.println("value size: "+value.size()); 
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				Configuration.dictionarysize+=value.size();

				/*for (int i = 0; i < value.size(); i++) {
					System.out.println(value.get(i)); //ClassUtils.PACKAGE_SEPARATOR_CHAR
					System.out.println("");
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				List<Method> value = entry.getValue();

				/*System.out.println("key: "+key); //key: org.apache.commons.lang3.ClassUtils
				System.out.println("value: "+value); 
				System.out.println("value size: "+value.size()); */
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java


				/*for (int i = 0; i < value.size(); i++) {
					System.out.println(value.get(i).getMethodName()); //ClassUtils.PACKAGE_SEPARATOR_CHAR
					System.out.println("");
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				String value = entry.getValue();
				
				//System.out.println("key: "+key); //key: org.apache.commons.lang3.ClassUtils
				//System.out.println("value: "+value); 
				sizeSuperclass++;
```

### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
			//System.out.println("superClass value size: "+sizeSuperclass); 
			Configuration.dictionarysize+=sizeSuperclass;
			//System.exit(0);
			
//			List<String> importedClasses = jcfp.importDeclarations;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/MethodInvocationMutator.java`
#### Snippet
```java
						if (remainParaNum <= 0) continue;
						if (remainParaNum != 1) continue;// FIXME: other conditions.
//						int lcsValue = paraListSize + paraNum - 2 * lcs(paraList, buggyParaList);
//						if (lcsValue != remainParaNum) continue;
						for (int i = 0; i < paraListSize; i ++) {
```

### CommentedOutCode
Commented out code (67 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/MethodInvocationMutator.java`
#### Snippet
```java
						}
						
//						// some default values. FIXME: it could be removed.
//						for (int i = 0; i < paraListSize; i++) {
//							List<String> subParaList = new ArrayList<>();
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
				rootTree = this.classDeclarationAst;
			} else {
//				int methodType = entry.getValue();
//				if (methodType == 2) {
//					List<ITree> children = suspMethodInv.getChildren();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
				
				if (Checker.isSuperMethodInvocation(methodNameNode.getParent().getType())) {
//					varType = "this+Super";
//					rootTree = this.classDeclarationAst;
				} else {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
							}
						} else if (Checker.isThisExpression(prePeerCodeAstType)) {
							// this.method();
//							rootTree = this.classDeclarationAst;
							varType = "this";
```

### CommentedOutCode
Commented out code (12 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			} else if (Checker.isSimpleName(childType)) {
				if (child.getLabel().startsWith("MethodName:")) {
//					boolean contained = false;
//					for (Map.Entry<ITree, Integer> entry : suspMethodInvocations.entrySet()) {
//						int size = entry.getKey().getChildren().size();
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			if(dataType!= null) return dataType;
			else {
//				ITree exp = para.getChild(0);
//				String type = readParameterType(exp);
//				if ("Object".equals(type)) {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
				String codePart1 = getSubSuspiciouCodeStr(suspCodeStartPos, pos1);
				String codePart2 = getSubSuspiciouCodeStr(pos2, suspCodeEndPos);
//				for (String operator : arithmeticOperators) {
//					if (operator.equals(op)) continue;
//					generatePatch(codePart1 + operator + codePart2);
```

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `MyFor` on continue statement
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
							if (suspV.getLabel().equals(var.getFirst())) continue MyFor;
						}
						if (!isQualifiedName && Character.isUpperCase(var.getFirst().charAt(0))) continue MyFor; //var.getFirst().contains(".") ||
						this.generatePatch(codePart1 + var.getFirst() + codePart2);
					}
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
		try {
			TreeContext tc = null;
			switch (type) {
			case EXP_JDT:
				tc = new ExpJdtTreeGenerator().generateFromFile(javaFile);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
		try {
			TreeContext tc = null;
			switch (type) {
			case EXP_JDT:
				tc = new ExpJdtTreeGenerator().generateFromFile(javaFile);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
		try {
			TreeContext tc = null;
			switch (type) {
			case EXP_JDT:
				tc = new ExpJdtTreeGenerator().generateFromCodeString(codeBlock);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
		try {
			TreeContext tc = null;
			switch (type) {
			case EXP_JDT:
				tc = new ExpJdtTreeGenerator().generateFromCodeFragment(codeBlock, ASTParser.K_STATEMENTS);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
		ITree asTree = null;
		try {
			TreeContext tc = null;
			switch (type) {
			case EXP_JDT:
				tc = new ExpJdtTreeGenerator().generateFromFile(javaFile);
				break;
			default:
				break;
			}
			
			if (tc != null){
				asTree = tc.getRoot();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return asTree;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/jdt/generator/AbstractJdtTreeGenerator.java`
#### Snippet
```java
        StringBuilder fileData = new StringBuilder();
        try (BufferedReader br = new BufferedReader(r)) {
            char[] buf = new char[10];
            int numRead = 0;
            while ((numRead = br.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
                buf = new char[1024];
            }
        }
        return  fileData.toString().toCharArray();
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/jdt/generator/AbstractJdtTreeGenerator.java`
#### Snippet
```java
        ASTParser parser = ASTParser.newParser(AST.JLS8);
        parser.setKind(astParserType);
        Map<String, String> pOptions = JavaCore.getOptions();
        pOptions.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_1_8);
        pOptions.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_1_8);
        pOptions.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_8);
        pOptions.put(JavaCore.COMPILER_DOC_COMMENT_SUPPORT, JavaCore.ENABLED);
        parser.setCompilerOptions(pOptions);
        parser.setSource(readerToCharArray(r));
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
		String label = "";
    	int startPosition = 0;
    	int nodeStartPosition = node.getStartPosition();
    	int length = node.getLength();
    	List<?> modifiers = node.modifiers();
    	if (modifiers.size() > 0) {
    		label += modifiers.toString();
    		startPosition = ((ASTNode)  modifiers.get(0)).getStartPosition();
    	}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
        pushNode(node, node.toString());
        List<?> modifiers = node.modifiers();
        for (Object obj : modifiers) {
        	IExtendedModifier modifier = (IExtendedModifier) obj;
        	if (modifier.isModifier()) {
        		((Modifier)modifier).accept(this);
        	}
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
        for (Object obj : modifiers) {
        	IExtendedModifier modifier = (IExtendedModifier) obj;
        	if (modifier.isModifier()) {
        		nodeStr += modifier.toString() + ", ";
        		realModifiers.add((Modifier)modifier);
        		if (startPosition == 0) {
        			startPosition = ((Modifier) modifier).getStartPosition();
        		}
        	}
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
        List<?> modifiers = node.modifiers();
        for (Object obj : modifiers) {
        	IExtendedModifier modifier = (IExtendedModifier) obj;
        	if (modifier.isModifier()) {
        		((Modifier)modifier).accept(this);
        	}
        }
        
    	Type type = node.getType();
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	Expression exp = node.getExpression();
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        exp.accept(this);
        Statement body = node.getBody();
        if (body != null) {
//        	push(8, "Block", "SyncBody", body.getStartPosition(), body.getLength());
        	visitBody(body);
//        	popNode();
        }
//        visitBody(node.getBody());
        return false;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		File suspiciousFile = null;
		String suspiciousFilePath = "";
		if (this.suspCodePosFile == null) {
			suspiciousFilePath = Configuration.suspPositionsFilePath;
		} else {
			suspiciousFilePath = this.suspCodePosFile.getPath();
		}
		suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/" + this.metric + ".txt");
		if (!suspiciousFile.exists()) {
			System.out.println("Cannot find the suspicious code position file." + suspiciousFile.getPath());
			suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/" + this.metric.toLowerCase() + ".txt");
		}
		if (!suspiciousFile.exists()) {
			System.out.println("Cannot find the suspicious code position file." + suspiciousFile.getPath());
			suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/All.txt");
		}
		if (!suspiciousFile.exists()) return null;
		List<SuspiciousPosition> suspiciousCodeList = new ArrayList<>();
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		if (!suspiciousFile.exists()) return null;
		List<SuspiciousPosition> suspiciousCodeList = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(suspiciousFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	String[] elements = line.split("@");
            	SuspiciousPosition sp = new SuspiciousPosition();
            	sp.classPath = elements[0];
            	sp.lineNumber = Integer.valueOf(elements[1]);
            	suspiciousCodeList.add(sp);
            }
            reader.close();
            fileReader.close();
        }catch (Exception e){
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
        }
		if (suspiciousCodeList.isEmpty()) return null;
		return suspiciousCodeList;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		try {
			FileReader fileReader = new FileReader(suspiciousFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	String[] elements = line.split("@");
            	SuspiciousPosition sp = new SuspiciousPosition();
            	sp.classPath = elements[0];
            	sp.lineNumber = Integer.valueOf(elements[1]);
            	suspiciousCodeList.add(sp);
            }
            reader.close();
            fileReader.close();
        }catch (Exception e){
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
        }
		if (suspiciousCodeList.isEmpty()) return null;
		return suspiciousCodeList;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
						operator = true;
						ft = new OperatorMutator(0);
						if (isTestFixPatterns) dataType = readDirectory() + "/OperatorMutator";
						generateAndValidatePatches(ft, scn);
						if (!isTestFixPatterns && this.minErrorTest == 0) return;
						if (this.fixedStatus == 2) {
							fixedStatus = 0;
							return;
						}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			ft = new StatementRemover();
			if (isTestFixPatterns) dataType = readDirectory() + "/StatementRemover";
			generateAndValidatePatches(ft, scn);
			if (!isTestFixPatterns && this.minErrorTest == 0) return;
			if (this.fixedStatus == 2) {
				fixedStatus = 0;
				return;
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
					readVariableDeclaration(codeAst, parentTreeType, allVarNamesMap, varTypesMap, allVarNamesList);
					parentTreeType = codeAst.getParent().getType();
					if (Checker.isStatement2(parentTreeType) || Checker.isMethodDeclaration(parentTreeType)) {
						List<ITree> children = codeAst.getParent().getChildren();
						int index = children.indexOf(codeAst) - 1;
						for (; index >= 0; index --) {
							ITree child = children.get(index);
							int childType = child.getType();
							if (!Checker.isStatement(childType)) break;
							readVariableDeclaration(child, childType, allVarNamesMap, varTypesMap, allVarNamesList);
						}
					}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
					List<ITree> children = codeAst.getParent().getChildren();
					int index = children.indexOf(codeAst) - 1;
					for (; index >= 0; index --) {
						ITree child = children.get(index);
						int childType = child.getType();
						if (!Checker.isStatement(childType)) break;
						readVariableDeclaration(child, childType, allVarNamesMap, varTypesMap, allVarNamesList);
					}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		String label = methodDeclarationTree.getLabel();
		int indexOfMethodName = label.indexOf("MethodName:");

		// Read return type.
		String returnType = label.substring(label.indexOf("@@") + 2, indexOfMethodName - 2);
		int index = returnType.indexOf("@@tp:");
		if (index > 0) returnType = returnType.substring(0, index - 2);
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
					String varName = child.getChild(0).getLabel();
					List<String> varNames = varNamesMap.get(varType);
					if (varNames == null) {
						varNames = new ArrayList<>();
					}
					varNames.add(varName);
					varNamesMap.put(varType, varNames);
					varTypesMap.put(varName, varType);
					allVarNamesList.add(varName);
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
					List<String> varNames = varNamesMap.get(varType);
					if (varNames == null) {
						varNames = new ArrayList<>();
					}
					varNames.add(varName);
					varNamesMap.put(varType, varNames);
					varTypesMap.put(varName, varType);
					allVarNamesList.add(varName);
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
						List<ITree> children = peerStmt.getChildren();
						int size = children.size();
						String varType = readType(children.get(size - 2).getLabel());
						String varName_ = children.get(size - 1).getLabel();
						if (varName.equals(varName_)) return varType;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
				for (String possibleReturnType : possibleReturnTypes) {
					String[] elements = possibleReturnType.split("\\+");
					mi.getPossibleReturnTypes().add(elements[0]);
					paraTypeStrs = new ArrayList<>();
					for (int i = 1, length = elements.length; i < length; i = i + 2) {
						paraTypeStrs.add(elements[i]);
					}
					mi.getParameterTypes().add(paraTypeStrs);
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/CNIdiomNoSuperCall.java`
#### Snippet
```java
		ITree parent = suspCodeTree.getParent();
		while (true) {
			if (parent == null) return null;
			if (Checker.isMethodDeclaration(parent.getType())) {
				break;
			} else if (Checker.isTypeDeclaration(parent.getType())) {
				return null;
			}
			parent = parent.getParent();
		}
		String methodLabel = parent.getLabel();
		methodLabel = methodLabel.substring(methodLabel.indexOf("@@") + 2);
		int index = methodLabel.indexOf("MethodName:");
		String returnType = methodLabel.substring(0, index - 2);
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
        List<Map.Entry<K, V>> list =
                new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1,
                               Map.Entry<K, V> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<K, V> sortedMap = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ConditionalExpressionMutator.java`
#### Snippet
```java
			ITree suspStmtAst = getSuspiciousCodeTree();
			ITree suspPredicateExp = null;
			if (Checker.isDoStatement(suspStmtAst.getType())) {
				List<ITree> children = suspStmtAst.getChildren();
				suspPredicateExp = children.get(children.size() - 1);
			} else {// If, while statement.
				suspPredicateExp = suspStmtAst.getChild(0);
			}
			int suspPredicateExpStartPos = suspPredicateExp.getPos();
			int suspPredicateExpEndPos = suspPredicateExpStartPos + suspPredicateExp.getLength();
			String suspPredicateExpStr = getSubSuspiciouCodeStr(suspPredicateExpStartPos, suspPredicateExpEndPos);
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ConditionalExpressionMutator.java`
#### Snippet
```java
			if ("byte".equals(varType) || "Byte".equals(varType)
					|| "short".equals(varType) || "Short".equals(varType)
					|| "int".equals(varType) || "Integer".equals(varType)
					|| "long".equals(varType) || "Long".equals(varType)
					|| "double".equals(varType) || "Double".equals(varType)
					|| "float".equals(varType) || "Float".equals(varType)) {
				return new String[]{" != ", " == ", " < ", " <= ", " > ", " >= "};
			}
			return new String[]{" != ", " == "};
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/MethodInvocationMutator.java`
#### Snippet
```java
				List<ITree> parameters = new ArrayList<>();
				List<String> paraStrList = new ArrayList<>();
				if (Checker.isClassInstanceCreation(methodNameNode.getType())) {
					boolean isParameter = false;
					for (ITree paraAst : paraAsts) {
						if (isParameter) {
							parameters.add(paraAst);
							paraStrList.add(paraAst.getLabel());
						} else if (Checker.isSimpleType(paraAst.getType())) {
							isParameter = true;
						}
					}
				} else {
					for (ITree paraAst : paraAsts) {
						parameters.add(paraAst);
						paraStrList.add(paraAst.getLabel());
					}
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/MethodInvocationMutator.java`
#### Snippet
```java
				List<String> vars1 = paraVars.get(index1);
				if (vars1 == null) continue;
				ITree paraTree1 = paraList.get(index1);
				vars1.remove(paraTree1.getLabel());
				if (vars1.isEmpty()) continue;
				
				int paraStartPos1 = paraTree1.getPos();
				int paraEndPos1 = paraStartPos1 + paraTree1.getLength();
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
					String varType = varTypesMap.get(var);
					if (varType == null) {
						varType = varTypesMap.get("this." + var);
					}
					if (varType != null) {
						if ("int".equals(varType) || "long".equals(varType) || "short".equals(varType) || "byte".equals(varType)
								|| "float".equals(varType) || "double".equals(varType) || "char".equals(varType) || "boolean".equals(varType)) continue;
					}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
		ITree parent = suspCodeTree.getParent();
		Boolean isLoopStmt = Boolean.valueOf(false);
		while (true) {
			if (parent == null) return null;
			int type = parent.getType();
			if (!isLoopStmt.booleanValue() && 
					(Checker.isForStatement(type) || Checker.isEnhancedForStatement(type)
					|| Checker.isWhileStatement(type) || Checker.isDoStatement(type))) {
				isLoopStmt = Boolean.valueOf(true);
			} else if (Checker.isMethodDeclaration(type)) break;
			parent = parent.getParent();
		}
		
		String methodLabel = parent.getLabel();
		methodLabel = methodLabel.substring(methodLabel.indexOf("@@") + 2);
		int index = methodLabel.indexOf("MethodName:");
		if (index == -1) return null;
		String returnType = methodLabel.substring(0, index - 2);
		if ("byte".equals(returnType) || "char".equals(returnType) || "short".equals(returnType) || 
				"int".equals(returnType) || "long".equals(returnType) || "double".equals(returnType) || "float".equals(returnType))
			return null;
		
		return new Pair<String, Boolean>(returnType, isLoopStmt);
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
					ITree suspExpTree = relationalOperatorPair.getFirst();
					int startPos = suspExpTree.getChild(0).getPos() + suspExpTree.getChild(0).getLength();
					int endPos = suspExpTree.getChild(2).getPos();
					String codePart1 = getSubSuspiciouCodeStr(suspCodeStartPos, startPos);
					String codePart2 = getSubSuspiciouCodeStr(endPos, suspCodeEndPos);
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
				if ("*".equals(op)) {
					generatePatch(codePart1 + " / " + codePart2);
				} else if ("/".equals(op)) {
					generatePatch(codePart1 + " * " + codePart2);
					generatePatch(codePart1 + " % " + codePart2);
				} else if ("+".equals(op)) {
					generatePatch(codePart1 + " - " + codePart2);
				} else if ("-".equals(op)) {
					generatePatch(codePart1 + " + " + codePart2);
				} else if ("%".equals(op)) {
					generatePatch(codePart1 + " / " + codePart2);
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
				if (returnType != null && !returnType.isEmpty()) {
					if ("void".equals(returnType)) {
						fixedCodeStr1 += ";\n";
					} else if ("float".equals(returnType) || "double".equals(returnType)) {
						fixedCodeStr1 += " 0.0;\n";
					} else if ("int".equals(returnType) || "long".equals(returnType)) {
						fixedCodeStr1 += " 0;\n";
					} else if ("boolean".equalsIgnoreCase(returnType)) {
						fixedCodeStr1 += " false;\n";
					} else {
						fixedCodeStr1 += " null;\n";
					}
					generatePatch(suspCodeStartPos, fixedCodeStr1);
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
List<String> vars;
		if ("boolean".equalsIgnoreCase(returnType)) {
			vars = allVarNamesMap.get("boolean");
			List<String> vars2 = allVarNamesMap.get("Boolean");
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("char".equals(returnType) | "Character".equals(returnType)) {
			vars = allVarNamesMap.get("char");
			List<String> vars2 = allVarNamesMap.get("Character");
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("byte".equalsIgnoreCase(returnType)) {
			vars = allVarNamesMap.get("byte");
			List<String> vars2 = allVarNamesMap.get("Byte");
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("short".equalsIgnoreCase(returnType)) {
			vars = allVarNamesMap.get("short");
			List<String> vars2 = allVarNamesMap.get("Short");
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("int".equals(returnType) || "Integer".equals(returnType)) {
			vars = allVarNamesMap.get("int");
			List<String> vars2 = allVarNamesMap.get("Integer");
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("long".equalsIgnoreCase(returnType)) {
			vars = allVarNamesMap.get("long");
			List<String> vars2 = allVarNamesMap.get("Long");
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("float".equalsIgnoreCase(returnType)) {
			vars = allVarNamesMap.get("float");
			List<String> vars2 = allVarNamesMap.get("Float");
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("double".equalsIgnoreCase(returnType)) {
			vars = allVarNamesMap.get("double");
			List<String> vars2 = allVarNamesMap.get("Double");
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else {
			vars = allVarNamesMap.get(returnType);
		}
		return vars;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementRemover.java`
#### Snippet
```java
				List<ITree> subChildren = lastChild.getChildren();
				if (!subChildren.isEmpty()) {
					endPos1 = subChildren.get(0).getPos();
					ITree lastStmt = subChildren.get(subChildren.size() - 1);
					int endPos2 = lastStmt.getPos() + lastStmt.getLength();
					
					String fixedCodeStr1 = this.getSubSuspiciouCodeStr(endPos1, endPos2);
					this.generatePatch(fixedCodeStr1);
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/MapSorter.java`
#### Snippet
```java
        List<Map.Entry<K, V>> list =
                new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1,
                               Map.Entry<K, V> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<K, V> sortedMap = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java
		String path = "\"";
		path += classPath;
		path += System.getProperty("path.separator");
		path += testClassPath;
		path += System.getProperty("path.separator");
		path += JunitRunner.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		path += System.getProperty("path.separator");
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java
		StringBuilder path = new StringBuilder("\"");
		path.append(classPath);
		path.append(System.getProperty("path.separator"));

		/*for (String addclasspath : Configuration.additionalClasspathsFromCmdLine) {
			path.append(addclasspath);
			path.append(System.getProperty("path.separator"));
		}*/

		path.append(Configuration.additionalClasspathsFromCmdLine);
		path.append(System.getProperty("path.separator"));



		path.append(testClassPath);
		path.append(System.getProperty("path.separator"));
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
    File fileTestOutput = new File(Configuration.GLOBAL_TEMP_FILES_PATH+"testOutPut.txt"); 

    //BufferedReader br = new BufferedReader(new FileReader(fileTestOutput)); //innan med bears

    Reader inputString = new StringReader(testResult);
    BufferedReader br = new BufferedReader(inputString);


    String st; 
    List<String> failedTestCmdLine = new ArrayList<>();
    List<String> errorTestCmdLine = new ArrayList<>();
    boolean readFailedtests = false;
    boolean readErrortests = false;
    boolean readBoth = false;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        if(readFailedtests && !st.trim().isEmpty() && !st.contains("- in") && st.contains("FAILURE!")) 
        {
            String[] splittedStrings = st.trim().split("\\(");
            String[] splittedStringsClass = splittedStrings[1].trim().split("\\)");

            
            String testIndividual = splittedStrings[0];
            String testClass = splittedStringsClass[0].trim();

            if(Configuration.testVerbose)
            {
            System.out.println(testClass);
            System.out.println(testIndividual);
            }
    
            failedTestCmdLine.add(testClass+"::"+testIndividual);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        if(readFailedtests && st.trim().isEmpty()){ 
            readFailedtests=false;
        }

        //*************************** Tests in error ***********************************************************************/

        //2. Read the lines
        if(readErrortests && !st.trim().isEmpty() && !st.contains("- in") && st.contains("ERROR!")) 
        {

            String[] splittedStringsE = st.trim().split("\\(");
            String[] splittedStringsClassE = splittedStringsE[1].trim().split("\\)");
            String testIndividualE = splittedStringsE[0];
            String testClassE = splittedStringsClassE[0].trim();

            if(Configuration.testVerbose)
            {
                System.out.println(testIndividualE);
                System.out.println(testClassE);
            }

            errorTestCmdLine.add(testClassE+"::"+testIndividualE);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
    fileTestOutput.delete();

    int errorNum=0;

    if (lineCount<2){//error occurs in run
        return Integer.MAX_VALUE;
    }
    if(buildSuccess)
    {
        return 0;
    }

    failedTests.addAll(errorTestCmdLine);
    errorNum=errorTestCmdLine.size();

    failedTests.addAll(failedTestCmdLine);
    errorNum=errorNum+failedTestCmdLine.size();

    return errorNum;
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                String[] splittedStrings = st.trim().split("\\(");

                if(Configuration.testVerbose)
                {
                    System.out.println(splittedStrings[0]);
                    System.out.println(splittedStrings[1]);
                }
    
                String[] splittedStringsClass = splittedStrings[1].trim().split("\\)");

                
                String testIndividual = splittedStrings[0];
                String testClass = splittedStringsClass[0].trim();
```

### DuplicatedCode
Duplicated code
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                    String[] splittedStrings = st.trim().split("\\(");

        
                    String[] splittedStringsClass = splittedStrings[1].trim().split("\\)");
    
                    
                    String testIndividual = splittedStrings[0];
                    String testClass = splittedStringsClass[0].trim();
                    if(Configuration.testVerbose)
                    {
                    System.out.println(testClass+"::"+testIndividual);
                    }

    
                    failedTestCmdLine.add(testClass+"::"+testIndividual);   
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
                try {
                    br.close();
                } catch (IOException e){
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
                try {
                    in.close();
                } catch (IOException e){
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
				try {
					input.close();
				} catch (IOException e) {
				}
			}
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
				try {
					output.close();
				} catch (IOException e) {
				}
			}
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
				try {
					stream.close();
				} catch (IOException e) {
				}
			}
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/TestFinder.java`
#### Snippet
```java
					} catch (ClassNotFoundException cnfExp2) {
						cnfExp2.printStackTrace();
					} catch (NoClassDefFoundError ncefErr) {
					}
				} catch (NoClassDefFoundError ncefErr) {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/TestFinder.java`
#### Snippet
```java
					} catch (NoClassDefFoundError ncefErr) {
					}
				} catch (NoClassDefFoundError ncefErr) {
				}
			}
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/edu/lu/uni/serval/tbar/utils/CodeUtils.java`
#### Snippet
```java
		TypeDeclaration declaration = (TypeDeclaration) unit.types().get(0);
		List<MethodDeclaration> methodDeclarations = new ArrayList<>();
		methodDeclarations.addAll(Arrays.asList(declaration.getMethods()));
		if (getInnerClassMethod) {
			TypeDeclaration[] typeDelcarations = declaration.getTypes();
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			if (errorTestAfterFix < minErrorTest) {
				List<String> tmpFailedTestsAfterFix = new ArrayList<>();
				tmpFailedTestsAfterFix.addAll(failedTestsAfterFix);
				tmpFailedTestsAfterFix.removeAll(this.failedTestStrList);
				if (tmpFailedTestsAfterFix.size() > 0) { // Generate new bugs.
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		
		List<String> tempFailed = new ArrayList<>();
		tempFailed.addAll(this.failedTestStrList);
		tempFailed.removeAll(failed);
		// FIXME: Using defects4j command in Java code may generate some new failed-passing test cases.
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		} else {
			List<Map<String, String>> maps2 = new ArrayList<>();
			maps2.addAll(maps);
			maps.clear();
			for (String var : vars) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			for (String var : vars) {
				List<Map<String, String>> maps3 = new ArrayList<>();
				maps3.addAll(maps2);
				for (Map<String, String> mm : maps3) {
					Map<String, String> m = new HashMap<>();
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
				List<ITree> donorExpList = searchForExpressions(suspCodeTree);
				Map<String, List<String>> buggyVariablesMap = new HashMap<>();
				buggyVariablesMap.putAll(allVarNamesMap);
				List<String> fixedCodeStrList = new ArrayList<>();
				for (ITree donorExp : donorExpList) {
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			if (this.fixedStatus == 2) {
				fixedStatus = 0;
				return;
			}
		} else {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			if (this.fixedStatus == 2) {
				fixedStatus = 0;
				return;
			}
		}
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
			}
			
			return;
		}
		
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	SingleVariableDeclaration parameter = node.getParameter();
    	Expression exp = node.getExpression();
        pushNode(node, parameter.toString() + ", " + exp.getClass().getSimpleName() + COLON + exp.toString());
        parameter.accept(this);
        exp.accept(this);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    public boolean visit(WhileStatement node) {
    	Expression exp = node.getExpression();
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        exp.accept(this);
        
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
			IExtendedModifier modifier = (IExtendedModifier) obj;
			if (modifier.isModifier()) {
				methodLabel += obj.toString() + ", ";
				realModifiers.add((Modifier) modifier);
				if (startPosition == 0) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
        value += init.toString() + ";";
		if (exp != null) {
			value += exp.toString() + ";";
		}
		value += update.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    public boolean visit(ExpressionStatement node) {
    	Expression exp = node.getExpression();
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        exp.accept(this);
        return false;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    public boolean visit(DoStatement node) {
    	Expression exp = node.getExpression();
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        Statement body = node.getBody();
        if (body != null) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    public boolean visit(SwitchStatement node) {
    	Expression exp = node.getExpression();
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        exp.accept(this);
//        int startPosition = exp.getStartPosition();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
        	IExtendedModifier modifier = (IExtendedModifier) obj;
        	if (modifier.isModifier()) {
        		nodeStr += modifier.toString() + ", ";
        		realModifiers.add((Modifier)modifier);
        		if (startPosition == 0) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    public boolean visit(SynchronizedStatement node) {
    	Expression exp = node.getExpression();
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        exp.accept(this);
        Statement body = node.getBody();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    public boolean visit(IfStatement node) {
        Expression exp = node.getExpression();
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        exp.accept(this);
        Statement stmt = node.getThenStatement();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
		List<?> arguments = node.arguments();
		if (exp == null && arguments.size() == 0) {
			pushNode(node, "MethodName:" + methodName.getFullyQualifiedName() + ":" + arguments.toString());
		} else {
			pushNode(node, node.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
				} else {
					if (exp instanceof Name) {
						pushNode(exp, "Name:" + exp.toString());
						popNode();
					} else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    public boolean visit(ThrowStatement node) {
    	Expression exp = node.getExpression();
        pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
        exp.accept(this);
        return false;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	Expression exp = node.getExpression();
    	if (exp != null) {
    		pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
    		exp.accept(this);
    	} else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	Expression exp = node.getExpression();
    	if (exp != null) {
    		pushNode(node, exp.getClass().getSimpleName() + COLON + exp.toString());
    		exp.accept(this);
    	} else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	Expression exp = node.getExpression();
    	Expression msg = node.getMessage();
        String value = exp.getClass().getSimpleName() + COLON + exp.toString();
        if (msg != null) {
            value += ", Msg-" + msg.getClass().getSimpleName() + COLON + msg.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
        String value = exp.getClass().getSimpleName() + COLON + exp.toString();
        if (msg != null) {
            value += ", Msg-" + msg.getClass().getSimpleName() + COLON + msg.toString();
            pushNode(node, value);
            exp.accept(this);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	Type superClass = node.getSuperclassType();
    	if (superClass != null) {
    		label += "@@SuperClass:" + superClass.toString() + ", ";
    	}
    	List<?> interfaceTypes = node.superInterfaceTypes(); // type
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	List<?> interfaceTypes = node.superInterfaceTypes(); // type
    	if (interfaceTypes.size() > 0) {
    		label += "@@Interface:" + interfaceTypes.toString();
    	}
    	
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (input != null) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
			if (conditionalExp.length() == 0) return;
			if (Checker.isReturnStatement(suspCodeTree.getType())) {
				String fixedCodeStr1 = "if (!(" + conditionalExp.toString() + ")) return ";
				String returnType = ContextReader.readMethodReturnType(suspCodeTree);
				if (returnType != null && !returnType.isEmpty()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
				}
				
				String fixedCodeStr1 = "if (" + conditionalExp.toString() + ") {\n\t";
				String fixedCodeStr2 = "\n}\n";
				
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
							fixedCodeStr1.append(donorCode.substring(startPos2));
							if (!fixedCodeStrList.contains(fixedCodeStr1.toString())) {
								generatePatch("return " + fixedCodeStr1.toString() + ";\n");
								fixedCodeStrList.add(fixedCodeStr1.toString());
							}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
						} else if ("boolean".equalsIgnoreCase(returnType)) {
							fixedCodeStr1.append(" false;\n");
							this.generatePatch(suspCodeStartPos, "if (!" + fixedCodeStr1.toString());
							fixedCodeStr1.replace(fixedCodeStr1.length() - 9, fixedCodeStr1.length(), " true;\n");
						} else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
							fixedCodeStr1.append(" null;\n\t");
						}
						this.generatePatch(suspCodeStartPos, "if (!" + fixedCodeStr1.toString());
					}
				} else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
					fixedCodeStr1.append(" {\n\t");
					String fixedCodeStr2 = "\n\t}\n";
					this.generatePatch(suspCodeStartPos, suspCodeEndPos, "if " + fixedCodeStr1.toString(), fixedCodeStr2);
				}
			}
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            }

            /********************** Read error tests ************************************/

            //2. Read the lines:
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Priority` may be 'static'
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
    );

    public class Priority {
        public static final int MAXIMUM = 0;
        public static final int HIGH = 25;
```

### InnerClassMayBeStatic
Inner class `MyUnit` may be 'static'
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
	}

	private class MyUnit {
		
		public CompilationUnit createCompilationUnit(File javaFile) {
```

### InnerClassMayBeStatic
Inner class `SuspCodeNode` may be 'static'
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	}
	
	public class SuspCodeNode {

		public File javaBackup;
```

### InnerClassMayBeStatic
Inner class `NPNullOnSomePathFromReturnValue` may be 'static'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
	 *
	 */
	public class NPNullOnSomePathFromReturnValue extends FixTemplate {
		
		/*
```

### InnerClassMayBeStatic
Inner class `SuspNullExpStr` may be 'static'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
	}
	
	class SuspNullExpStr implements Comparable<SuspNullExpStr> {
		public String expStr;
		public Integer startPos;
```

### InnerClassMayBeStatic
Inner class `LongestCommonSubsequence` may be 'static'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
	private Map<String, ITree> sameValueSuspVarTrees = new HashMap<>();
	
	private class LongestCommonSubsequence {

		public Double similarity(String str1, String str2) {
```

### InnerClassMayBeStatic
Inner class `MethodInvocationExpression` may be 'static'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	}
	
	public class MethodInvocationExpression {
		
		/*
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `code` declared in one 'switch' branch and used in another
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ICASTIdivCastToDouble.java`
#### Snippet
```java
			case 1:
				//FP1
				String code = this.getSubSuspiciouCodeStr(startPos, endPos);
				this.generatePatch(codePart1 + code + "d" + codePart2);
				this.generatePatch(codePart1 + code + "f" + codePart2);
```

### SwitchStatementWithConfusingDeclaration
Local variable `numberLiteral` declared in one 'switch' branch and used in another
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ICASTIdivCastToDouble.java`
#### Snippet
```java
				//FP5
				endPos = buggyExpTree.getChild(0).getPos() + buggyExpTree.getChild(0).getLength();
				String numberLiteral = buggyExpTree.getChild(2).getLabel();
				code = "(1.0 / " + numberLiteral + ") * " + this.getSubSuspiciouCodeStr(startPos, endPos);
				this.generatePatch(codePart1 + code + codePart2);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementMover.java`
#### Snippet
```java

/**
 * https://sites.google.com/site/autofixhkust/home/fix-templates#TOC-Sequence-Exchanger
 * 
 * @author kui.liu
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
public abstract class ChangeCondition extends FixTemplate {

	private boolean ignoreOtherMethods = false; // FIXME do not ignore other methods.
	
	/**
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `isBuggyProject`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		Boolean isBuggyProject = null;
		for (String pos : posArray) {
			if (isBuggyProject == null || isBuggyProject) {
				if (pos.startsWith(this.buggyProject + "@")) {
					isBuggyProject = true;
```

### DuplicateCondition
Duplicate condition `isBuggyProject`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	    			}
				} else if (isBuggyProject!= null && isBuggyProject) isBuggyProject = false;
			} else if (!isBuggyProject) break;
		}
		return suspiciousCodeList;
```

### DuplicateCondition
Duplicate condition `isBuggyProject`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		Boolean isBuggyProject = null;
		for (String pos : posArray) {
			if (isBuggyProject == null || isBuggyProject) {
				if (pos.startsWith(this.buggyProject + "@")) {
					isBuggyProject = true;
```

### DuplicateCondition
Duplicate condition `isBuggyProject`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	            	}
				} else if (isBuggyProject!= null && isBuggyProject) isBuggyProject = false;
			} else if (!isBuggyProject) break;
		}
		return buggyFileList;
```

### DuplicateCondition
Duplicate condition `Checker.isFieldAccess(childType)`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
						&& !Checker.isVariableDeclarationFragment(suspCodeAst.getType())) suspNullExpStrs.add(snes);
				identifySuspiciousVariables(child, allSuspVariables, suspNullExpStrs);
			} else if (Checker.isQualifiedName(childType) || Checker.isFieldAccess(childType) || Checker.isSuperFieldAccess(childType)) {
				int parentType = suspCodeAst.getType();
				if ((Checker.isAssignment(parentType) || Checker.isVariableDeclarationFragment(parentType))
```

### DuplicateCondition
Duplicate condition `Checker.isSuperFieldAccess(childType)`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
						&& !Checker.isVariableDeclarationFragment(suspCodeAst.getType())) suspNullExpStrs.add(snes);
				identifySuspiciousVariables(child, allSuspVariables, suspNullExpStrs);
			} else if (Checker.isQualifiedName(childType) || Checker.isFieldAccess(childType) || Checker.isSuperFieldAccess(childType)) {
				int parentType = suspCodeAst.getType();
				if ((Checker.isAssignment(parentType) || Checker.isVariableDeclarationFragment(parentType))
```

### DuplicateCondition
Duplicate condition `Checker.isFieldAccess(childType)`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
				int index2 = suspExpStr.lastIndexOf(".");
				if (index1 != index2) identifySuspiciousVariables(child, allSuspVariables, suspNullExpStrs);
			} else if (Checker.isFieldAccess(childType) || Checker.isSuperFieldAccess(childType)) {
				int parentType = suspCodeAst.getType();
				if ((Checker.isAssignment(parentType) || Checker.isVariableDeclarationFragment(parentType))
```

### DuplicateCondition
Duplicate condition `Checker.isSuperFieldAccess(childType)`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
				int index2 = suspExpStr.lastIndexOf(".");
				if (index1 != index2) identifySuspiciousVariables(child, allSuspVariables, suspNullExpStrs);
			} else if (Checker.isFieldAccess(childType) || Checker.isSuperFieldAccess(childType)) {
				int parentType = suspCodeAst.getType();
				if ((Checker.isAssignment(parentType) || Checker.isVariableDeclarationFragment(parentType))
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
    protected Entry find(K key) {
        Entry entry = findEntry(key);
        if (entry == null)
            return null;
        return entry;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/info/Patch.java`
#### Snippet
```java
			if (!fixedCodeStr1.equals(p.fixedCodeStr1)) return false;
			if (fixedCodeStr2 == null) {
				if (p.fixedCodeStr2 != null) return false;
			} else if (!fixedCodeStr2.equals(p.fixedCodeStr2)) return false;
			return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/info/Patch.java`
#### Snippet
```java
			if (fixedCodeStr2 == null) {
				if (p.fixedCodeStr2 != null) return false;
			} else if (!fixedCodeStr2.equals(p.fixedCodeStr2)) return false;
			return true;
		} else return false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
	private boolean isRequiredAstNode(ITree tree) {
		int astNodeType = tree.getType();
		if (Checker.isStatement(astNodeType) 
				|| Checker.isFieldDeclaration(astNodeType)
				|| Checker.isMethodDeclaration(astNodeType)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/utils/AssertUtils.java`
#### Snippet
```java
        else if (lineString.contains("(") && lineString.contains(")") && !lineString.contains("=")){
            String callMethod = lineString.substring(0, lineString.indexOf("(")).trim();
            if (code.contains("void "+callMethod+"(")){
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/jdt/tree/AbstractTree.java`
#### Snippet
```java
        if (!hasSameType(t))
            return false;
        else if (!getLabel().equals(t.getLabel()))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/utils/Checker.java`
#### Snippet
```java
	
	public static boolean withBlockStatement(String statementType) {
		if ("EnhancedForStatement".equals(statementType) || "ForStatement".equals(statementType) 
				|| "DoStatement".equals(statementType) || "WhileStatement".equals(statementType)
				|| "LabeledStatement".equals(statementType) || "SynchronizedStatement".equals(statementType)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/utils/Checker.java`
#### Snippet
```java
		if (type == 54) return true; // TryStatement
		if (type == 61) return true; // WhileStatement
		if (type == 70) return true; // EnhancedForStatement
		return false;
	}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/utils/Checker.java`
#### Snippet
```java
		if (type == 59) return true; // VariableDeclarationFragment FIXME: this node is not an expression node.
		if (type == 62) return true; // InstanceofExpression
		if (type == 86) return true; // LambdaExpression
		return false;
	}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/utils/Checker.java`
#### Snippet
```java
		if (type == 90) return true; // ExpressionMethodReference
		if (type == 91) return true; // SuperMethodReference
		if (type == 92) return true; // TypeMethodReference
		return false;
	}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/utils/Checker.java`
#### Snippet
```java

	public static boolean isExpressionType(String astNode) {
		if (astNode.equals("ArrayAccess") || astNode.equals("ArrayCreation") ||
				astNode.equals("ArrayInitializer") || astNode.equals("Assignment") || astNode.equals("CastExpression") ||
				astNode.equals("ClassInstanceCreation") || astNode.equals("ConditionalExpression") || astNode.equals("CreationReference") ||
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				if (startPos != suspN.startPos) return false;
				if (endPos != suspN.endPos) return false;
				if (suspiciousJavaFile.equals(suspN.suspiciousJavaFile)) return true;
			}
			return false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		File file = new File(path);
		
		if (file.exists()) {
			return true;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
			int size = children.size();
			String varName = children.get(size - 1).getLabel();
			if (suspVarName.equals(varName)) return true;
		}
		
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/MethodInvocationMutator.java`
#### Snippet
```java
		if ("double".equalsIgnoreCase(dataType)) return true;
		if ("short".equalsIgnoreCase(dataType)) return true;
		if ("byte".equalsIgnoreCase(dataType)) return true;
		return false;
	}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
		if (("+".equals(op1) || "-".equals(op1)) && ("+".equals(op2) || "-".equals(op2))) return false;
		if (("&&".equals(op1) || "||".equals(op1)) && ("&&".equals(op2) || "||".equals(op2))) return true;
		if (("+".equals(op1) || "-".equals(op1) || "*".equals(op1) || "/".equals(op1) || "%".equals(op1) || ">>".equals(op1) || "<<".equals(op1))
				&& ("+".equals(op2) || "-".equals(op2) || "*".equals(op2) || "/".equals(op2) || "%".equals(op2) || ">>".equals(op2) || "<<".equals(op2))) return true;
		return false;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        }
        File batFile = new File(fileName);
        batFile.setReadable(true, false);
        batFile.setExecutable(true, false);
        batFile.setWritable(true, false);
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        File batFile = new File(fileName);
        batFile.setReadable(true, false);
        batFile.setExecutable(true, false);
        batFile.setWritable(true, false);

```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        batFile.setReadable(true, false);
        batFile.setExecutable(true, false);
        batFile.setWritable(true, false);

        if (!batFile.exists()){
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        if (!batFile.exists()){
        	if (!batFile.getParentFile().exists()) {
        		batFile.getParentFile().mkdirs();
        	}
            boolean result = batFile.createNewFile();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        String results = ShellUtils.getShellOut(cmd, type);

        batFile.delete();
        return results;
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java

	public static String tempClassPath(String classname, String identifier) {
		new File(Configuration.TEMP_FILES_PATH + identifier).mkdirs();
		return Configuration.TEMP_FILES_PATH + identifier + "/" + classname.substring(classname.lastIndexOf(".") + 1) + ".class";
	}
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java

	public static String tempJavaPath(String classname, String identifier) {
		new File(Configuration.TEMP_FILES_PATH + identifier).mkdirs();
		return Configuration.TEMP_FILES_PATH + identifier + "/" + classname.substring(classname.lastIndexOf(".") + 1) + ".java";
	}
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			if ("===StringIndexOutOfBoundsException===".equals(buggyCode)) continue;
			String patchCode = patch.getFixedCodeStr1();
			scn.targetClassFile.delete();

			log.debug("Compiling");
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		
		try {
			scn.targetJavaFile.delete();
			scn.targetClassFile.delete();
			Files.copy(scn.javaBackup.toPath(), scn.targetJavaFile.toPath());
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		try {
			scn.targetJavaFile.delete();
			scn.targetClassFile.delete();
			Files.copy(scn.javaBackup.toPath(), scn.targetJavaFile.toPath());
			Files.copy(scn.classBackup.toPath(), scn.targetClassFile.toPath());
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	        String patchedJavaFile = javaCode.substring(0, exactBuggyCodeStartPos) + patchCode + javaCode.substring(exactBuggyCodeEndPos);
	        FileHelper.outputToFile(newFile, patchedJavaFile, false);
	        newFile.renameTo(scn.targetJavaFile);
		} catch (StringIndexOutOfBoundsException e) {
			log.debug(exactBuggyCodeStartPos + " ==> " + exactBuggyCodeEndPos + " : " + javaCode.length());
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
        try {
        	if (!targetClassFile.exists()) return null;
        	if (javaBackup.exists()) javaBackup.delete();
        	if (classBackup.exists()) classBackup.delete();
			Files.copy(targetJavaFile.toPath(), javaBackup.toPath());
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
        	if (!targetClassFile.exists()) return null;
        	if (javaBackup.exists()) javaBackup.delete();
        	if (classBackup.exists()) classBackup.delete();
			Files.copy(targetJavaFile.toPath(), javaBackup.toPath());
			Files.copy(targetClassFile.toPath(), classBackup.toPath());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		try {
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			if (!file.exists()) file.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
				file.getParentFile().mkdirs();
			}
			if (!file.exists()) file.createNewFile();
			writer = new FileWriter(file);
			bw = new BufferedWriter(writer);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			deleteDirectory(filePath);
		}
		file.mkdirs();
	}
	
```

### IgnoreResultOfCall
Result of `FilterInputStream.read()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			bis = new BufferedInputStream(new FileInputStream(file));
			input = new byte[bis.available()];
			bis.read(input);
			
		} catch (FileNotFoundException e) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
					}
				}
				file.delete();
			} else {
				deleteFile(dir);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		if (file.exists()) {
			if (file.isFile()) {
				file.delete();
			} else {
				deleteDirectory(fileName);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		File file = new File(fileName).getParentFile();
		if (!file.exists()) {
			file.mkdirs();
		}
	}
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		try {
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			if (!file.exists()) {
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			}
			if (!file.exists()) {
				file.createNewFile();
			}
			writer = new FileWriter(file, append);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        System.out.println("xx - sizeoferrortest:"+errorTestCmdLine.size());
        System.out.println("xx - sizeoffailtest:"+failedTestCmdLine.size());
        fileTestOutput.delete();

        int errorNum=0;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
    System.out.println("xx - sizeoffailtest: "+failedTestCmdLine.size());
    }
    fileTestOutput.delete();

    int errorNum=0;
```

### IgnoreResultOfCall
Result of `String.replace()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ClassCastChecker.java`
#### Snippet
```java
				fixedCodeStr1 = "Object _tempVar = " + castedExpStr + ";\n\t" +
								"if (_temVar != null && _temVar instanceof " + castTypeStr + ") {\n\t";
				 this.getSuspiciousCodeStr().replace(castedExpStr, "_temVar");
			}
			
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] btInput = s.getBytes("utf-8");
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			mdInst.update(btInput);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getParent()` is identical to its super method
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java

    @Override
    public ITree getParent() {
        return parent;
    }
```

### RedundantMethodOverride
Method `setParent()` is identical to its super method
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java

    @Override
    public void setParent(ITree parent) {
        this.parent = parent;
    }
```

### RedundantMethodOverride
Method `endVisit()` is identical to its super method
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java

    @Override
    public void endVisit(TypeLiteral node) {
        popNode();
    }
```

### RedundantMethodOverride
Method `endVisit()` is identical to its super method
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java

    @Override
    public void endVisit(CatchClause node) {
        popNode();
    }
```

### RedundantMethodOverride
Method `endVisit()` is identical to its super method
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    
    @Override
    public void endVisit(WildcardType node) {
    	popNode();
    }
```

### RedundantMethodOverride
Method `endVisit()` is identical to its super method
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java

    @Override
    public void endVisit(VariableDeclarationExpression node) {
        popNode();
    }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
	private List<String> readParameterTypes(String methodDeclarationLabel) {
		List<String> parameterTypes = new ArrayList<>();
		if (methodDeclarationLabel.endsWith("@@Argus:null")) {
			return parameterTypes;
		} else {
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/MethodInvocationMutator.java`
#### Snippet
```java
			else {//if (methodInvType == 2)
				int suspCodeNodeType = this.getSuspiciousCodeTree().getType();
				if (Checker.isConstructorInvocation(suspCodeNodeType) || Checker.isSuperConstructorInvocation(suspCodeNodeType)) {
					paraList = methodInvocationNode.getChildren();
				} else {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.BufferedReader;`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
package edu.lu.uni.serval.tbar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.io.FileReader;`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
import java.util.List;
import java.util.Arrays;
import java.util.Map;


```

### UNUSED_IMPORT
Unused import `import edu.lu.uni.serval.tbar.fixpatterns.CNIdiomNoSuperCall;`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
import edu.lu.uni.serval.tbar.config.Configuration;
import edu.lu.uni.serval.tbar.context.ContextReader;
import edu.lu.uni.serval.tbar.fixpatterns.CNIdiomNoSuperCall;
import edu.lu.uni.serval.tbar.fixpatterns.ClassCastChecker;
import edu.lu.uni.serval.tbar.fixpatterns.ConditionalExpressionMutator;
```

### UNUSED_IMPORT
Unused import `import edu.lu.uni.serval.tbar.utils.PathUtils;`
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
import edu.lu.uni.serval.tbar.utils.FileHelper;
import edu.lu.uni.serval.tbar.utils.JavaLibrary;
import edu.lu.uni.serval.tbar.utils.PathUtils;

/**
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
package edu.lu.uni.serval.tbar.main;

import java.io.File;

import edu.lu.uni.serval.tbar.AbstractFixer;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
package edu.lu.uni.serval.tbar.utils;

import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java

import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.util.Arrays;
```

### UNUSED_IMPORT
Unused import `import java.io.BufferedReader;`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList; 
```

### UNUSED_IMPORT
Unused import `import java.io.FileReader;`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
import java.util.ArrayList; 
import java.util.List;
import java.io.FileReader;
import edu.lu.uni.serval.tbar.config.Configuration;
import java.io.*;  
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param javaFile` tag description is missing
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
	 * Generate AST for Java code file.
	 * 
	 * @param javaFile
	 * @param type
	 * @return
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
	 * 
	 * @param javaFile
	 * @param type
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
	 * @param javaFile
	 * @param type
	 * @return
	 */
	public ITree generateTreeForJavaFile(File javaFile, TokenType type) {
```

### JavadocDeclaration
`@param parent` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java
    /**
     * Reset its parent and insert it to the specific position in the new parent.
     * @param parent
     * @param position
     */
```

### JavadocDeclaration
`@param position` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java
     * Reset its parent and insert it to the specific position in the new parent.
     * @param parent
     * @param position
     */
    public void setParentAndUpdateChildren(ITree parent, int position) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param fileName of the Java code file name with complete and correct path.
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromFile(String fileName, int astParserType) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * Generate ASTs for Java code from the Java code string.
     * @param codeString of the Java code string.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param codeString of the Java code string.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromCodeString(String codeString) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * Generate ASTs for Java code from InputStream of Java code.
     * @param stream of the InputStream of Java code.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param stream of the InputStream of Java code.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromStream(InputStream stream) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * Generate ASTs for Java code from the Java code file.
     * @param file of the Java code file object.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param file of the Java code file object.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromFile(File file) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param stream of the InputStream of Java code.
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromStream(InputStream stream, int astParserType) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * Generate ASTs for Java code from the Java code file.
     * @param fileName of the Java code file with complete and correct path.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param fileName of the Java code file with complete and correct path.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromFile(String fileName) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param codeFragment of Java code fragment.
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromCodeFragment(String codeFragment, int astParserType) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param r of the IOReader of Java code.
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromReader(Reader r, int astParserType) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * Generate ASTs for Java code from the IOReader of Java code.
     * @param r of the IOReader of Java code.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param r of the IOReader of Java code.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromReader(Reader r) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param file of the Java code file object.
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/edu/lu/uni/serval/jdt/generator/TreeGenerator.java`
#### Snippet
```java
     * @param astParserType of the specific ASTParser. e.g., ASTParser.K_STATEMENTS.
     * @return
     * @throws IOException
     */
    public TreeContext generateFromFile(File file, int astParserType) throws IOException {
```

### JavadocDeclaration
`@param filePath` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	/**
	 * 
	 * @param filePath
	 */
	public static void createDirectory(String filePath) {
```

### JavadocDeclaration
`@param file` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * Read the content of a file.
	 * 
	 * @param file
	 * @return String, the content of a file.
	 */
```

### JavadocDeclaration
`@param fileName` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * Read the content of a file.
	 * 
	 * @param fileName
	 * @return String, the content of a file.
	 */
```

### JavadocDeclaration
`@param file` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * Recursively list all directories in file.
	 * 
	 * @param file
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * 
	 * @param file
	 * @return
	 */
	private static List<File> listAllDirectories(File file) {
```

### JavadocDeclaration
`@param filePath` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * List all files in the directory.
	 * 
	 * @param filePath
	 * @param type
	 * @return
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * 
	 * @param filePath
	 * @param type
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * @param filePath
	 * @param type
	 * @return
	 */
	public static List<File> getAllFiles(String filePath, String type) {
```

### JavadocDeclaration
`@param file` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * Recursively list all files in file.
	 * 
	 * @param file
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	 * 
	 * @param file
	 * @return
	 */
	private static List<File> listAllFiles(File file, String type) {
```

### JavadocDeclaration
`@param currentClassPath` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * Find the class name and path of the data type of a field in the current class or its super classes.
	 * 
	 * @param currentClassPath
	 * @param varName
	 * @return
```

### JavadocDeclaration
`@param varName` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * 
	 * @param currentClassPath
	 * @param varName
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * @param currentClassPath
	 * @param varName
	 * @return
	 */
	public String findDataTypeClassPathOfField(String currentClassPath, String varName) {
```

### JavadocDeclaration
`@param currentClassPath` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * Find all constructors of the current class.
	 * 
	 * @param currentClassPath
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * 
	 * @param currentClassPath
	 * @return
	 */
	public List<Method> findConstructors(String currentClassPath) {
```

### JavadocDeclaration
`@param currentClassPath` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * Find the class path of an imported class with its name.
	 * 
	 * @param currentClassPath
	 * @param className
	 * @return
```

### JavadocDeclaration
`@param className` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * 
	 * @param currentClassPath
	 * @param className
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * @param currentClassPath
	 * @param className
	 * @return
	 */
	public String findDependencyByClassName(String currentClassPath, String className) {
```

### JavadocDeclaration
`@param currentClassPath` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * Find all methods that can be accessed by the current class, including the protected methods and public ones of its super class.
	 * 
	 * @param currentClassPath
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * 
	 * @param currentClassPath
	 * @return
	 */
	public List<Method> findAllAvailableMethodsOfThisClass(String currentClassPath, boolean needsPrivateMethods, boolean needsProtectedMethods) {
```

### JavadocDeclaration
`@param currentClassPath` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * Find all constructors of which class instance is created in the current class.
	 * 
	 * @param currentClassPath
	 * @param constructorName
	 * @return
```

### JavadocDeclaration
`@param constructorName` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * 
	 * @param currentClassPath
	 * @param constructorName
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * @param currentClassPath
	 * @param constructorName
	 * @return
	 */
	public List<Method> findOtherConstructors(String currentClassPath, String constructorName) {
```

### JavadocDeclaration
`@param currentClassPath` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * Find all super constructors of the super class of the current one.
	 * 
	 * @param currentClassPath
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	 * 
	 * @param currentClassPath
	 * @return
	 */
	public List<Method> findSuperConstructors(String currentClassPath) {
```

### JavadocDeclaration
`@param stmtTree` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	/**
	 * Read the information of a variable in the variable declaration nodes.
	 * @param stmtTree
	 * @param stmtType
	 * @param varNamesMap
```

### JavadocDeclaration
`@param stmtType` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * Read the information of a variable in the variable declaration nodes.
	 * @param stmtTree
	 * @param stmtType
	 * @param varNamesMap
	 * @param varTypesMap
```

### JavadocDeclaration
`@param varNamesMap` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * @param stmtTree
	 * @param stmtType
	 * @param varNamesMap
	 * @param varTypesMap
	 * @param allVarNamesList
```

### JavadocDeclaration
`@param varTypesMap` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * @param stmtType
	 * @param varNamesMap
	 * @param varTypesMap
	 * @param allVarNamesList
	 */
```

### JavadocDeclaration
`@param allVarNamesList` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * @param varNamesMap
	 * @param varTypesMap
	 * @param allVarNamesList
	 */
	private static void readVariableDeclaration(ITree stmtTree, int stmtType, Map<String, List<String>> varNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
```

### JavadocDeclaration
`@param paraStr` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * Parse the parameter data types of a method declaration.
	 * 
	 * @param paraStr
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * 
	 * @param paraStr
	 * @return
	 */
	public static List<String> parseMethodParameterTypes(String paraStr, String splitStr) {
```

### JavadocDeclaration
`@param returnType` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * e.g., List<T> --> List.
	 * 
	 * @param returnType
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * 
	 * @param returnType
	 * @return
	 */
	public static String readType(String returnType) {
```

### JavadocDeclaration
`@param className` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * e.g., List<T> --> List.
	 * 
	 * @param className
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * 
	 * @param className
	 * @return
	 */
	public static String readSimpleNameOfDataType(String className) {
```

### JavadocDeclaration
`@param codeAst` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * Read the all variables by traversing the ancestral tree of the suspicious code AST.
	 * 
	 * @param codeAst
	 * @param allVarNamesMap
	 * @param varTypesMap
```

### JavadocDeclaration
`@param allVarNamesMap` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * 
	 * @param codeAst
	 * @param allVarNamesMap
	 * @param varTypesMap
	 * @param allVarNamesList
```

### JavadocDeclaration
`@param varTypesMap` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * @param codeAst
	 * @param allVarNamesMap
	 * @param varTypesMap
	 * @param allVarNamesList
	 */
```

### JavadocDeclaration
`@param allVarNamesList` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	 * @param allVarNamesMap
	 * @param varTypesMap
	 * @param allVarNamesList
	 */
	public static void readAllVariablesAndFields(ITree codeAst, Map<String, List<String>> allVarNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList, String srcCodePath, Dictionary dic) {
```

### JavadocDeclaration
`@param suspStmtAst` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	/**
	 * Map<ITree, Integer>: ITree - predicate exp ast, Integer - start or end pos of the key value.
	 * @param suspStmtAst
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	 * Map<ITree, Integer>: ITree - predicate exp ast, Integer - start or end pos of the key value.
	 * @param suspStmtAst
	 * @return
	 */
	protected Map<ITree, Integer> readAllSuspiciousPredicateExpressions(ITree suspStmtAst) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	/**
	 * Map<ITree, Integer>: ITree - Predicate Exp AST, Integer - distance to suspicious stmt.
	 * @return
	 */
	protected Map<ITree, Integer> identifyPredicateExpressions() {
```

### JavadocDeclaration
`@param classDeclarationAst` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	/**
	 * 
	 * @param classDeclarationAst
	 * @param methodName
	 * @param paraTypeStrs
```

### JavadocDeclaration
`@param methodName` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * 
	 * @param classDeclarationAst
	 * @param methodName
	 * @param paraTypeStrs
	 * @return
```

### JavadocDeclaration
`@param paraTypeStrs` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * @param classDeclarationAst
	 * @param methodName
	 * @param paraTypeStrs
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * @param methodName
	 * @param paraTypeStrs
	 * @return
	 */
	private Map<List<String>, String> identifyPossibleReturnTypes(ITree classDeclarationAst, String methodName, List<String> paraTypeStrs, 
```

### JavadocDeclaration
`@param classDeclarationAst` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	/**
	 * 
	 * @param classDeclarationAst
	 * @param varType
	 * @param methodName
```

### JavadocDeclaration
`@param varType` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * 
	 * @param classDeclarationAst
	 * @param varType
	 * @param methodName
	 * @param paraTypeStrs
```

### JavadocDeclaration
`@param methodName` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * @param classDeclarationAst
	 * @param varType
	 * @param methodName
	 * @param paraTypeStrs
	 * @return
```

### JavadocDeclaration
`@param paraTypeStrs` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * @param varType
	 * @param methodName
	 * @param paraTypeStrs
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * @param methodName
	 * @param paraTypeStrs
	 * @return
	 */
	private Map<List<String>, String> identifyPossibleReturnTypes(ITree classDeclarationAst, String varType, String methodName, List<String> paraTypeStrs) {
```

### JavadocDeclaration
`@param parameters` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * Read the parameter types of the suspicious method invocation expression.
	 * 
	 * @param parameters
	 * @return Empty_ArrayList - zero parameter.
	 * 		   other - parameter types.
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	/**
	 * Read the information of suspicious method invocations.
	 * @return
	 */
	protected List<MethodInvocationExpression> identifySuspiciousMethodInvocations2() {
```

### JavadocDeclaration
`@param suspCodeTree` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * Read the class declaration AST of the suspicious code.
	 * 
	 * @param suspCodeTree
	 */
	private void readClassDeclaration(ITree suspCodeTree) {
```

### JavadocDeclaration
`@param classDeclarationAst` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * Identify the java file path of a data type.
	 * 
	 * @param classDeclarationAst
	 * @param varType
	 * @return
```

### JavadocDeclaration
`@param varType` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * 
	 * @param classDeclarationAst
	 * @param varType
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * @param classDeclarationAst
	 * @param varType
	 * @return
	 */
	private String identifyJavaFilePath(ITree classDeclarationAst, String varType) {
```

### JavadocDeclaration
`@param suspCodeTree` tag description is missing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	/**
	 * Read the class name of the suspicious code.
	 * @param suspCodeTree
	 */
	private void readClassName(ITree suspCodeTree) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `trees` may be 'final'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/AbstractJdtVisitor.java`
#### Snippet
```java
    protected TreeContext context = new TreeContext();

    private Deque<ITree> trees = new ArrayDeque<>();

    public AbstractJdtVisitor() {
```

### FieldMayBeFinal
Field `stack` may be 'final'
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
    public static Iterator<ITree> preOrderIterator(final ITree tree) {
        return new Iterator<ITree>() {
            Deque<Iterator<ITree>> stack = new ArrayDeque<>();
            {
                push(new AbstractTree.FakeTree(tree));
```

### FieldMayBeFinal
Field `stack` may be 'final'
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
    public static Iterator<ITree> postOrderIterator(final ITree tree) {
        return new Iterator<ITree>() {
            Deque<Pair<ITree, Iterator<ITree>>> stack = new ArrayDeque<>();
            {
                push(tree);
```

### FieldMayBeFinal
Field `fifo` may be 'final'
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
    public static Iterator<ITree> breadthFirstIterator(final ITree tree) {
        return new Iterator<ITree>() {
            Deque<Iterator<ITree>> fifo = new ArrayDeque<>();

            {
```

### FieldMayBeFinal
Field `suspiciousCode` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
	private File javaFile;
	private CompilationUnit unit = null;
	private List<Pair<ITree, String>> suspiciousCode = new ArrayList<>();
	
	public void parseSuspiciousCode(File javaFile, int suspLineNum) {
```

### FieldMayBeFinal
Field `classNamesInSamePackage` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
public class JavaCodeFileParser {
	
	private List<String> classNamesInSamePackage = new ArrayList<>();
	private String packageName = null;
	private Map<ITree, String> classNames = new HashMap<>();
```

### FieldMayBeFinal
Field `classNames` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
	private List<String> classNamesInSamePackage = new ArrayList<>();
	private String packageName = null;
	private Map<ITree, String> classNames = new HashMap<>();
	public List<String> importDeclarations = new ArrayList<>();
	
```

### FieldMayBeFinal
Field `list` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/utils/ListSorter.java`
#### Snippet
```java
public class ListSorter<T extends Comparable<? super T>> {

	private List<T> list;

	public ListSorter(List<T> list) {
```

### FieldMayBeFinal
Field `varName` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Field.java`
#### Snippet
```java
	private ModifierType modifier;
	private String dataType;
	private String varName;
	private boolean isStatic = false;
	
```

### FieldMayBeFinal
Field `className` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Field.java`
#### Snippet
```java
	
	private String packageName;
	private String className;
	private ModifierType modifier;
	private String dataType;
```

### FieldMayBeFinal
Field `modifier` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Field.java`
#### Snippet
```java
	private String packageName;
	private String className;
	private ModifierType modifier;
	private String dataType;
	private String varName;
```

### FieldMayBeFinal
Field `dataType` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Field.java`
#### Snippet
```java
	private String className;
	private ModifierType modifier;
	private String dataType;
	private String varName;
	private boolean isStatic = false;
```

### FieldMayBeFinal
Field `parameterTypes` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Method.java`
#### Snippet
```java
	private String returnType;
	private String methodName;
	private List<String> parameterTypes;
	private boolean isConstructor;
	
```

### FieldMayBeFinal
Field `className` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Method.java`
#### Snippet
```java

	private String packageName;
	private String className;
	private ModifierType modifier;
	private String returnType;
```

### FieldMayBeFinal
Field `returnType` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Method.java`
#### Snippet
```java
	private String className;
	private ModifierType modifier;
	private String returnType;
	private String methodName;
	private List<String> parameterTypes;
```

### FieldMayBeFinal
Field `methodName` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Method.java`
#### Snippet
```java
	private ModifierType modifier;
	private String returnType;
	private String methodName;
	private List<String> parameterTypes;
	private boolean isConstructor;
```

### FieldMayBeFinal
Field `modifier` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Method.java`
#### Snippet
```java
	private String packageName;
	private String className;
	private ModifierType modifier;
	private String returnType;
	private String methodName;
```

### FieldMayBeFinal
Field `isConstructor` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Method.java`
#### Snippet
```java
	private String methodName;
	private List<String> parameterTypes;
	private boolean isConstructor;
	
	public Method(String className, ModifierType modifier, String returnType, String methodName,
```

### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
public abstract class AbstractFixer implements IFixer {
	
	private static Logger log = LoggerFactory.getLogger(AbstractFixer.class);
	
	public String metric = "Ochiai";          // Fault localization metric.
```

### FieldMayBeFinal
Field `fakeFailedTestCasesList` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	protected List<String> failedTestCasesStrList = new ArrayList<>();
	// The failed test cases after running defects4j command in Java code but not in terminal.
	private List<String> fakeFailedTestCasesList = new ArrayList<>();
	
	// 0: failed to fix the bug, 1: succeeded to fix the bug. 2: partially succeeded to fix the bug.
```

### FieldMayBeFinal
Field `buggyProjectParentPath` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
public class DataPreparer {

    private String buggyProjectParentPath;
    
    public String classPath;
```

### FieldMayBeFinal
Field `urlClassloader` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/ClassloaderFinder.java`
#### Snippet
```java
public class ClassloaderFinder implements ClassFinder {

	private URLClassLoader urlClassloader;

	public ClassloaderFinder(URLClassLoader urlClassloader) {
```

### FieldMayBeFinal
Field `allFields` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
public class Dictionary {
	
	private Map<String, List<Field>> allFields = new HashMap<>();
	private Map<String, String> superClasses = new HashMap<>();
	private Map<String, List<String>> importedDependencies = new HashMap<>();
```

### FieldMayBeFinal
Field `methods` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	private Map<String, String> superClasses = new HashMap<>();
	private Map<String, List<String>> importedDependencies = new HashMap<>();
	private Map<String, List<Method>> methods = new HashMap<>();
	
	public Map<String, List<Field>> getAllFields() {
```

### FieldMayBeFinal
Field `customClassLoader` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/CustomClassLoaderThreadFactory.java`
#### Snippet
```java
	}

	private ClassLoader customClassLoader;

}
```

### FieldMayBeFinal
Field `importedDependencies` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	private Map<String, List<Field>> allFields = new HashMap<>();
	private Map<String, String> superClasses = new HashMap<>();
	private Map<String, List<String>> importedDependencies = new HashMap<>();
	private Map<String, List<Method>> methods = new HashMap<>();
	
```

### FieldMayBeFinal
Field `superClasses` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	
	private Map<String, List<Field>> allFields = new HashMap<>();
	private Map<String, String> superClasses = new HashMap<>();
	private Map<String, List<String>> importedDependencies = new HashMap<>();
	private Map<String, List<Method>> methods = new HashMap<>();
```

### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	}
	
	private static Logger log = LoggerFactory.getLogger(TBarFixer.class);
	
	public TBarFixer(String path, String bugIdStr, ArrayList<String> pathsFromCmdLine) {
```

### FieldMayBeFinal
Field `buggyExps1` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NPEqualsShouldHandleNullArgument.java`
#### Snippet
```java
	 */
	
	private List<Pair<ITree, String>> buggyExps1 = new ArrayList<>();
	private List<Pair<ITree, String>> buggyExps2 = new ArrayList<>();

```

### FieldMayBeFinal
Field `buggyExps2` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NPEqualsShouldHandleNullArgument.java`
#### Snippet
```java
	
	private List<Pair<ITree, String>> buggyExps1 = new ArrayList<>();
	private List<Pair<ITree, String>> buggyExps2 = new ArrayList<>();

	@Override
```

### FieldMayBeFinal
Field `suspCons` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/LiteralExpressionMutator.java`
#### Snippet
```java
	 *  
	 */
	private List<ITree> suspCons = new ArrayList<>();
	
	public void generatePatches() {
```

### FieldMayBeFinal
Field `returnType` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
	 * ELIXIR     T2_ReturnStmt
	 */
	private String returnType;
	
	public ReturnStatementMutator(String returnType) {
```

### FieldMayBeFinal
Field `condExpStrList` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
	}
	
	private List<String> condExpStrList = new ArrayList<>();
	private void searchForExpressions(ITree tree, List<ITree> expList) {
		int treeType = tree.getType();
```

### FieldMayBeFinal
Field `ignoreOtherMethods` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
public abstract class ChangeCondition extends FixTemplate {

	private boolean ignoreOtherMethods = false; // FIXME do not ignore other methods.
	
	/**
```

### FieldMayBeFinal
Field `sameValueSuspVarTrees` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
//	}

	private Map<String, ITree> sameValueSuspVarTrees = new HashMap<>();
	
	private class LongestCommonSubsequence {
```

### FieldMayBeFinal
Field `patchesList` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
	private ITree suspiciousCodeTree;
	protected int suspCodeStartPos, suspCodeEndPos;
	private List<Patch> patchesList = new ArrayList<>();
	
	protected Map<String, String> varTypesMap = new HashMap<>();
```

### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
public abstract class FixTemplate implements IFixTemplate {
	
	private static Logger log = LoggerFactory.getLogger(FixTemplate.class);
	
	protected String sourceCodePath;
```

### FieldMayBeFinal
Field `parameterTypes` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		private String methodName;
		private List<String> possibleParameterTypes;
		private List<List<String>> parameterTypes = new ArrayList<>();
		private ITree codeAst;
		private Map<String, List<String>> couldBeReplacedMethods = null; // replace method name.
```

### FieldMayBeFinal
Field `relationalOperators` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	
	private static List<String> arithmeticOperators = new ArrayList<>();
	private static List<String> relationalOperators = new ArrayList<>();
	private static List<String> conditionalOperators = new ArrayList<>();
	
```

### FieldMayBeFinal
Field `relationalOpExps` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	 */
	private List<Pair<ITree, String>> arithmeticOpExps = new ArrayList<>();
	private List<Pair<ITree, String>> relationalOpExps = new ArrayList<>();
	private List<Pair<ITree, String>> conditionalOpExps = new ArrayList<>();
	private List<Pair<ITree, Integer>> arithmeticInfixExps = new ArrayList<>();
```

### FieldMayBeFinal
Field `arithmeticOperators` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	private List<Pair<ITree, String>> bitAssignExps = new ArrayList<>();
	
	private static List<String> arithmeticOperators = new ArrayList<>();
	private static List<String> relationalOperators = new ArrayList<>();
	private static List<String> conditionalOperators = new ArrayList<>();
```

### FieldMayBeFinal
Field `arithmeticInfixExps` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	private List<Pair<ITree, String>> relationalOpExps = new ArrayList<>();
	private List<Pair<ITree, String>> conditionalOpExps = new ArrayList<>();
	private List<Pair<ITree, Integer>> arithmeticInfixExps = new ArrayList<>();
	private List<Pair<ITree, String>> bitIorExps = new ArrayList<>();
	private List<Pair<ITree, String>> bitAssignExps = new ArrayList<>();
```

### FieldMayBeFinal
Field `conditionalOperators` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	private static List<String> arithmeticOperators = new ArrayList<>();
	private static List<String> relationalOperators = new ArrayList<>();
	private static List<String> conditionalOperators = new ArrayList<>();
	
	static {
```

### FieldMayBeFinal
Field `bitIorExps` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	private List<Pair<ITree, String>> conditionalOpExps = new ArrayList<>();
	private List<Pair<ITree, Integer>> arithmeticInfixExps = new ArrayList<>();
	private List<Pair<ITree, String>> bitIorExps = new ArrayList<>();
	private List<Pair<ITree, String>> bitAssignExps = new ArrayList<>();
	
```

### FieldMayBeFinal
Field `bitAssignExps` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	private List<Pair<ITree, Integer>> arithmeticInfixExps = new ArrayList<>();
	private List<Pair<ITree, String>> bitIorExps = new ArrayList<>();
	private List<Pair<ITree, String>> bitAssignExps = new ArrayList<>();
	
	private static List<String> arithmeticOperators = new ArrayList<>();
```

### FieldMayBeFinal
Field `triedInfixExps` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
		 */
		private boolean isConditionalOperator = false;
		private List<ITree> triedInfixExps = new ArrayList<>();
		
		public ConditionalExpressionOperatorMutator() {};
```

### FieldMayBeFinal
Field `conditionalOpExps` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	private List<Pair<ITree, String>> arithmeticOpExps = new ArrayList<>();
	private List<Pair<ITree, String>> relationalOpExps = new ArrayList<>();
	private List<Pair<ITree, String>> conditionalOpExps = new ArrayList<>();
	private List<Pair<ITree, Integer>> arithmeticInfixExps = new ArrayList<>();
	private List<Pair<ITree, String>> bitIorExps = new ArrayList<>();
```

### FieldMayBeFinal
Field `arithmeticOpExps` may be 'final'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	 * 
	 */
	private List<Pair<ITree, String>> arithmeticOpExps = new ArrayList<>();
	private List<Pair<ITree, String>> relationalOpExps = new ArrayList<>();
	private List<Pair<ITree, String>> conditionalOpExps = new ArrayList<>();
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `exchangedVarMap` are queried, but never updated
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
							int startPos2 = 0;
							StringBuilder fixedCodeStr1 = new StringBuilder();
							Map<String, String> exchangedVarMap = new HashMap<>();
							for (ITree donorVarTree : donorVarTrees) {
								int pos = donorVarTree.getPos() - donorStartPos;
```

### MismatchedCollectionQueryUpdate
Contents of collection `usedVars` are queried, but never updated
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
				for (Map<String, String> map : maps) {
					String fixedCodeStr1 = method.getMethodName() + "(";
					Map<String, String> usedVars = new HashMap<>();
					boolean isFailed = false;
					for (String parameterType : parameterTypes) {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
					if (Checker.isBlock(child.getType())) {
						identifySuspiciousCodeAst(child, suspLineNum);
						continue;
					} else {
						if (!isRequiredAstNode(child)) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
					if (parameterTypes.isEmpty()) {
						generatePatch(codePart1 + method.getMethodName() + "()" + codePart2);
						continue;
					}
//					List<Map<String, String>> maps = new ArrayList<>();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `unit` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
			ASTParser parser = createASTParser(javaCode);
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
			CompilationUnit unit = (CompilationUnit) parser.createAST(null);
			
			return unit;
```

### UnnecessaryLocalVariable
Local variable `path` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java

	public static ArrayList<String> getSrcPath(String bugProject) {
		ArrayList<String> path = new ArrayList<String>();
		//String[] words = bugProject.split("_");
		//String projectName = words[0];
```

### UnnecessaryLocalVariable
Local variable `paths` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
	private void loadPaths(String buggyProject,ArrayList<String> pathsFromCmdLine) {
		String projectDir = buggyProjectParentPath;
		List<String> paths = pathsFromCmdLine;

		/*
```

### UnnecessaryLocalVariable
Local variable `extension` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
	public static String getFileExtension(File file) {
		String fileName = file.getName();
		String extension = fileName.substring(fileName.lastIndexOf("."));
		return extension;
	}
```

### UnnecessaryLocalVariable
Local variable `equalsMethod` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
		String[] parameters = methodLabel.split("\\+");
		if (parameters.length != 2 || !"Object".equals(parameters[0])) return null;
		Pair<String, ITree> equalsMethod = new Pair<>(parameters[1], parent);
		return equalsMethod;
	}
```

### UnnecessaryLocalVariable
Local variable `totalEndTimedict` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
			dic.setSuperClasses(jcfp.superClassNames);

			long totalEndTimedict = System.nanoTime() - totalstartTimeDic;
			Configuration.dicttime=totalEndTimedict;

```

### UnnecessaryLocalVariable
Local variable `superClass_` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
			while (superClass != null) {
				addToDictionary(dictionary, superClass);
				String superClass_ = dictionary.findSuperClassName(superClass);
				superClass = superClass_;
			}
```

### UnnecessaryLocalVariable
Local variable `methodNameNode` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		for (Map.Entry<ITree, Integer> entry : this.suspMethodInvocations.entrySet()) {
			ITree suspMethodInv = entry.getKey();
			ITree methodNameNode = suspMethodInv;
			int type = suspMethodInv.getType();
			
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				if(Configuration.bugDataSet.equals("d4j"))
				{
				ShellUtils.shellRun(Arrays.asList("javac -Xlint:unchecked -source 1.7 -target 1.7 -cp "
						+ PathUtils.buildCompileClassPath(Arrays.asList(PathUtils.getJunitPath()), dp.classPath, dp.testClassPath)
						+ " -d " + dp.classPath + " " + scn.targetJavaFile.getAbsolutePath()), buggyProject, 1);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				{
				ShellUtils.shellRun(Arrays.asList("javac -Xlint:unchecked -source 1.7 -target 1.7 -cp "
						+ PathUtils.buildCompileClassPath(Arrays.asList(PathUtils.getJunitPath()), dp.classPath, dp.testClassPath)
						+ " -d " + dp.classPath + " " + scn.targetJavaFile.getAbsolutePath()), buggyProject, 1);
				}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				}
				else{//@ from https://github.com/aprorg/TBar
					String result = ShellUtils.shellRun(Arrays.asList("javac -Xlint:unchecked -source 1.8 -target 1.8 -cp "
					+ PathUtils.buildCompileClassPath(Arrays.asList(PathUtils.getJunitPath()), dp.classPath, dp.testClassPath, dp.libPaths)
					+ " -d " + dp.classPath + " " + scn.targetJavaFile.getAbsolutePath()), buggyProject,1);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				else{//@ from https://github.com/aprorg/TBar
					String result = ShellUtils.shellRun(Arrays.asList("javac -Xlint:unchecked -source 1.8 -target 1.8 -cp "
					+ PathUtils.buildCompileClassPath(Arrays.asList(PathUtils.getJunitPath()), dp.classPath, dp.testClassPath, dp.libPaths)
					+ " -d " + dp.classPath + " " + scn.targetJavaFile.getAbsolutePath()), buggyProject,1);
					if(Configuration.testVerbose)
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				{

				results = ShellUtils.shellRun(Arrays.asList("java -cp "
						+ PathUtils.buildTestClassPath(dp.classPath, dp.testClassPath)
						+ " org.junit.runner.JUnitCore " + this.failedTestCaseClasses), buggyProject, 2);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				}
				else{
						results = ShellUtils.shellRun(Arrays.asList("java -cp "
						+ PathUtils.buildTestClassPath(dp.classPath, dp.testClassPath, dp.libPaths)
						+ " org.junit.runner.JUnitCore " + this.failedTestCaseClasses), buggyProject,2);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if (Configuration.NO_GIT)
            {
                return ShellUtils.shellRun(Arrays.asList("cd " + projectName), buggyProject, 1).trim();

            }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			String GZOLTAR_AGENT_JAR="lib/com.gzoltar.agent.rt-1.7.3-SNAPSHOT-all.jar";

			String classpathGzoltar = PathUtils.buildCompileClassPath(Arrays.asList(PathUtils.getJunitPath()), dp.classPath, dp.testClassPath, dp.libPaths);
			String list_of_tests_to_run_file="gzoltarOutput/"+this.buggyProject+"/tests_to_run.txt";
			String list_of_tests_to_run_file_temp="gzoltarOutput/"+this.buggyProject+"/tests_to_runtempfile.txt";
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(new File(fileaddress));
			byte[] b = new byte[stream.available()];
			int len = stream.read(b);
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/jdt/visitor/JdtVisitor.java`
#### Snippet
```java
        String result = "";
        for (String s : splittedDoc) {
            result += s;
        }
        try {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
        	IExtendedModifier modifier = (IExtendedModifier) obj;
        	if (modifier.isModifier()) {
        		nodeStr += modifier.toString() + ", ";
        		realModifiers.add((Modifier)modifier);
        		if (startPosition == 0) {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
			IExtendedModifier modifier = (IExtendedModifier) obj;
			if (modifier.isModifier()) {
				methodLabel += obj.toString() + ", ";
				realModifiers.add((Modifier) modifier);
				if (startPosition == 0) {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
			methodLabel += "@@tp:";
			for (Object obj : typeParameters) {
				methodLabel += obj.toString() + ", ";
			}
		}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
				String arguType = svd.getType().toString();
				String arguName = svd.getName().getFullyQualifiedName();
				methodLabel += arguType + "+" + arguName + "+";
			}
		}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
			methodLabel += "@@Exp:";
			for (Object obj : exceptionTypes) {
				methodLabel += obj.toString() + "+";
			}
		}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			}
			if (!failedTestCasesList.contains(failedTestCase)) {
				this.failedTestCaseClasses += failedTestCase + " ";
				failedTestCasesList.add(failedTestCase);
			}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
				if (counterG>0)
				{
					testsToGzoltar+=":"; 
				}
				
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
				

				testsToGzoltar+=testlocal; 

				counterG++;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
		    				int prevPos = i == 0 ? endPos : (positionsList.get(i - 1) + dataType.length());
		    				int currPos = positionsList.get(i);
		    				patch += this.suspJavaFileCode.substring(prevPos, currPos) + primitiveType;
						}
		    			int prevPos = positionsList.get(s - 1) + dataType.length();
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			if (Checker.isCompilationUnit(parentTree.getType())) break;
			if (Checker.isTypeDeclaration(parentTree.getType())) {
				className = readClassName(parentTree) + "." + className;
			}
			parentTree = parentTree.getParent();
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
					}
					
					fixedCodeStr1 += "if (" + expStr + " == null)";
					fixedCodeStr1 += isLoopStmt ? " continue;\n\t" : " return null;\n\t";
				}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
				buggyExp = buggyExps.get(index);
				expStr = buggyExp.expStr;
				fixedCodeStr1 += "if (" + expStr + " == null)";
				fixedCodeStr1 += isLoopStmt ? " continue;\n" : " return null;\n";
			}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
						}
						if (!fixedCodeStr1.endsWith("(")) {
							fixedCodeStr1 += ",";
						}
						fixedCodeStr1 += var;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
							fixedCodeStr1 += ",";
						}
						fixedCodeStr1 += var;
					}

```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		int index = dataType.indexOf("[");
		if (index > 0) dataType = dataType.substring(0, index);
		for (int a = 0; a < i; a ++) dataType += "[]";
		return dataType;
	}
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `numRead` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/jdt/generator/AbstractJdtTreeGenerator.java`
#### Snippet
```java
        try (BufferedReader br = new BufferedReader(r)) {
            char[] buf = new char[10];
            int numRead = 0;
            while ((numRead = br.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
```

### UnusedAssignment
Variable `numRead` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/jdt/generator/AbstractRawTokenJdtTreeGenerator.java`
#### Snippet
```java
        try (BufferedReader br = new BufferedReader(r)) {
            char[] buf = new char[10];
            int numRead = 0;
            while ((numRead = br.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
```

### UnusedAssignment
The value `NO_VALUE` assigned to `this.depth` is never used
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java
        this.label = (label == null) ? NO_LABEL : label.intern();
        this.id = NO_ID;
        this.depth = NO_VALUE;
        this.hash = NO_VALUE;
        this.height = NO_VALUE;
```

### UnusedAssignment
Variable `numRead` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
			
			char[] buf = new char[10];
			int numRead = 0;
			try {
				FileReader fileReader = new FileReader(javaFile);
```

### UnusedAssignment
The value `null` assigned to `br` is never used
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
					if (br != null) {
						br.close();
						br = null;
					}
				} catch (IOException e) {
```

### UnusedAssignment
Variable `returnTypeStr` initializer `""` is redundant
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java

    	int startPosition = 0;
    	String returnTypeStr = "";
    	Type returnType = null;
    	if (node.isConstructor()) {
```

### UnusedAssignment
The value `methodName.getStartPosition()` assigned to `startPosition` is never used
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
		methodLabel += "MethodName:" + methodName + ", ";
		if (startPosition == 0) {
			startPosition = methodName.getStartPosition();
		}
		if (parameters == null || parameters.size() == 0) {
```

### UnusedAssignment
The value `nodeStr.substring(0, nodeStr.length() - 1)` assigned to `nodeStr` is never used
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    public boolean visit(SuperConstructorInvocation node) {
    	String nodeStr = node.toString();
    	nodeStr = nodeStr.substring(0, nodeStr.length() - 1);
        pushNode(node, node.toString());
        visitList(node.arguments());
```

### UnusedAssignment
Variable `returnString` initializer `""` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
		ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(new ReadShellProcess(process));
        String returnString = "";
        System.out.println("getShellOut1");
        try {
```

### UnusedAssignment
Variable `isStatic` initializer `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/context/Field.java`
#### Snippet
```java
	private String dataType;
	private String varName;
	private boolean isStatic = false;
	
	public Field(String className, ModifierType modifier, String dataType, String varName,
```

### UnusedAssignment
Variable `results` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			log.debug("Test previously failed test cases.");
			try {
				String results=null;

				if(Configuration.bugDataSet.equals("d4j"))
```

### UnusedAssignment
Variable `errorTestAfterFix` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			//int errorTestAfterFix = TestUtils.getFailTestNumInProjectBears2(fullBuggyProjectPath,failedTestsAfterFix);

			int errorTestAfterFix = 0;

			if(Configuration.testOutputAdapter_for.equals("bears2"))
```

### UnusedAssignment
Variable `path` initializer `""` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	
	public String metric = "Ochiai";          // Fault localization metric.
	protected String path = "";
	protected String buggyProject = "";     // The buggy project name.
	protected String defects4jPath;         // The path of local installed defects4j.
```

### UnusedAssignment
Variable `buggyProject` initializer `""` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	public String metric = "Ochiai";          // Fault localization metric.
	protected String path = "";
	protected String buggyProject = "";     // The buggy project name.
	protected String defects4jPath;         // The path of local installed defects4j.
	public int minErrorTest;                // Number of failed test cases before fixing.
```

### UnusedAssignment
Variable `suspiciousFile` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java

	public List<SuspiciousPosition> readSuspiciousCodeFromFile() {
		File suspiciousFile = null;
		String suspiciousFilePath = "";
		if (this.suspCodePosFile == null) {
```

### UnusedAssignment
Variable `suspiciousFilePath` initializer `""` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	public List<SuspiciousPosition> readSuspiciousCodeFromFile() {
		File suspiciousFile = null;
		String suspiciousFilePath = "";
		if (this.suspCodePosFile == null) {
			suspiciousFilePath = Configuration.suspPositionsFilePath;
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			FileReader fileReader = new FileReader(suspiciousFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	String[] elements = line.split("@");
```

### UnusedAssignment
The value `null` assigned to `bis` is never used
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (bis != null) {
				bis.close();
				bis = null;
			}
		} catch (IOException e) {
```

### UnusedAssignment
The value `null` assigned to `bw` is never used
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (bw != null) {
				bw.close();
				bw = null;
			}
		} catch (IOException e) {
```

### UnusedAssignment
The value `null` assigned to `writer` is never used
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (writer != null) {
				writer.close();
				writer = null;
			}
		} catch (IOException e) {
```

### UnusedAssignment
Variable `errorNum` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        fileTestOutput.delete();

        int errorNum=0;

        if (lineCount<2){//error occurs in run
```

### UnusedAssignment
Variable `errorNum` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
    fileTestOutput.delete();

    int errorNum=0;

    if (lineCount<2){//error occurs in run
```

### UnusedAssignment
The value `true` assigned to `nullChecked` is never used
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			
			if (!nullChecked) {
				nullChecked = true;
				ft = new NullPointerChecker();
				if (isTestFixPatterns) dataType = readDirectory() + "/NullPointerChecker";
```

### UnusedAssignment
Variable `suspiciousFile` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	//read from Gzoltar output
	public List<SuspiciousPosition> readSuspiciousCodeFromFileGZoltar() {
		File suspiciousFile = null;
		//if (this.suspCodePosFile == null) {
			suspiciousFile = new File(Configuration.suspPositionsFilePathGZoltar);
```

### UnusedAssignment
Variable `line` initializer `reader.readLine()` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			List<String> allTestCases = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader(suspiciousFile.getPath() + "/" + this.buggyProject + "/target/sfl/txt/tests.csv"));
			String line = reader.readLine();
			while ((line = reader.readLine()) != null) {
				String testCase = line.substring(0, line.indexOf(","));
```

### UnusedAssignment
The value `reader.readLine()` assigned to `line` is never used
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			//org.traccar.protocol$GoSafeProtocolDecoder#GoSafeProtocolDecoder(org.traccar.protocol.GoSafeProtocol):39;1.0
			reader = new BufferedReader(new FileReader(suspiciousFile.getPath() + "/" + this.buggyProject + "/target/sfl/txt/ochiai.ranking.csv"));
			line = reader.readLine();
			while ((line = reader.readLine()) != null) {
				int dollarIndex = line.indexOf("$");
```

### UnusedAssignment
Variable `suspiciousFile` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	//normal
	public List<SuspiciousPosition> readSuspiciousCodeFromFile() {
		File suspiciousFile = null;
		String suspiciousFilePath = "";
		/*if (this.suspCodePosFile == null) {
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			FileReader fileReader = new FileReader(suspiciousFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	String[] elements = line.split("@");
```

### UnusedAssignment
Variable `suspiciousFile` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	
	public List<SuspiciousPosition> readSuspiciousCodeFromFile(List<String> buggyFileList) {
		File suspiciousFile = null;
		String suspiciousFilePath = "";
		if (this.suspCodePosFile == null) {
```

### UnusedAssignment
Variable `suspiciousFilePath` initializer `""` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	public List<SuspiciousPosition> readSuspiciousCodeFromFile(List<String> buggyFileList) {
		File suspiciousFile = null;
		String suspiciousFilePath = "";
		if (this.suspCodePosFile == null) {
			suspiciousFilePath = Configuration.suspPositionsFilePath;
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			FileReader fileReader = new FileReader(suspiciousFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	String[] elements = line.split("@");
```

### UnusedAssignment
Variable `suspiciousCodeList` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		
		// Read suspicious positions.
		List<SuspiciousPosition> suspiciousCodeList = null;
		if (granularity == Granularity.Line) {
			// It assumes that the line-level bug positions are known.
```

### UnusedAssignment
Variable `suspPredicateExp` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ConditionalExpressionMutator.java`
#### Snippet
```java
			ITree suspStmtAst = getSuspiciousCodeTree();
			
			ITree suspPredicateExp = null;
			if (Checker.isDoStatement(suspStmtAst.getType())) {
				List<ITree> children = suspStmtAst.getChildren();
```

### UnusedAssignment
Variable `type` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ConditionalExpressionMutator.java`
#### Snippet
```java
	 */
	
	private int type = 0;
	public ConditionalExpressionMutator(int type) {
		this.type = type;
```

### UnusedAssignment
Variable `suspPredicateExp` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ConditionalExpressionMutator.java`
#### Snippet
```java
			//TODO: this expression adder is just simply adding expression candidates. To be improved.
			ITree suspStmtAst = getSuspiciousCodeTree();
			ITree suspPredicateExp = null;
			if (Checker.isDoStatement(suspStmtAst.getType())) {
				List<ITree> children = suspStmtAst.getChildren();
```

### UnusedAssignment
Variable `varName` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
			List<Pair<ITree, ITree>> methodInvocations = identifyMethodInvocations(suspStmtTree);
			if (methodInvocations.isEmpty()) return;
			String varName = null;
			String returnType = null;
			int codeEndPos = suspCodeEndPos;
```

### UnusedAssignment
Variable `isArrayAccess` initializer `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
	 */
	
	private boolean isArrayAccess = false;
	
	public RangeChecker(boolean isArrayAccess) {
```

### UnusedAssignment
Variable `varName` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
					boolean isStatic = false;
					String varType = null;
					String varName = null;
					for (ITree subChild : subChildren) {
						if (readVar) {
```

### UnusedAssignment
Variable `suspCodeEndPos` initializer `this.suspCodeEndPos` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
					String fixedCodeStr1 = "if (" + var + " != null) {\n\t";
					String fixedCodeStr2 = "\n\t}\n";
					int suspCodeEndPos = this.suspCodeEndPos;
					suspCodeEndPos = ContextReader.identifyRelatedStatements(suspCodeTree, var, this.suspCodeEndPos);
					this.generatePatch(suspCodeStartPos, suspCodeEndPos, fixedCodeStr1, fixedCodeStr2);
```

### UnusedAssignment
Variable `lastPeerStmt` initializer `peerStmts.get(peerStmts.size() - 1)` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
			int parentNodeType = parentTree.getType();
			List<ITree> peerStmts = suspCodeTree.getParent().getChildren();
			ITree lastPeerStmt = peerStmts.get(peerStmts.size() - 1);
			
			if (Checker.isSwitchStatement(parentNodeType)) {
```

### UnusedAssignment
The value `new ArrayList<>()` assigned to `sameTypeVars` is never used
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
						this.generatePatch(codePart1 + var.getFirst() + codePart2);
					}
				} else sameTypeVars = new ArrayList<>();
				
//				List<String> variables = new ArrayList<>();
```

### UnusedAssignment
Variable `path` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 */
	private Map<List<String>, String> identifyPossibleReturnTypes(ITree classDeclarationAst, String varType, String methodName, List<String> paraTypeStrs) {
		String path = null;
		int constructorIndex = varType.indexOf("=CONSTRUCTOR=");
		boolean isConstructor = false;
```

### UnusedAssignment
Variable `methodName` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			String varType = null;
			List<ITree> parameters = methodNameNode.getChildren();
			String methodName = null;
			if (Checker.isConstructorInvocation(type)) {
				methodName = "this=CONSTRUCTOR=";
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
				int size = parameters.size();
				if (Checker.isAnonymousClassDeclaration(parameters.get(size - 1).getType())) continue;
				int i = 0;
				if (Checker.isNewKeyword(parameters.get(0).getType())) {
					methodName = parameters.get(1).getLabel(); 
```

### UnusedAssignment
Variable `anotherSuspExpTree` initializer `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
			triedInfixExps.add(parentTree);
			
			ITree anotherSuspExpTree = null;
			if (index == 1) {
				anotherSuspExpTree = parentTree.getChild(0);
```

### UnusedAssignment
The value `startPos2` assigned to `startPos1` is never used
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
					anotherSuspExpTree = _suspExpTree;
					int _startPos = startPos1;
					startPos1 = startPos2;
					startPos2 = _startPos;
				}
```

### UnusedAssignment
The value `_startPos` assigned to `startPos2` is never used
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
					int _startPos = startPos1;
					startPos1 = startPos2;
					startPos2 = _startPos;
				}
				int pos1 = suspExpTree.getChild(0).getPos() + suspExpTree.getChild(0).getLength();
```

### UnusedAssignment
Variable `operatorType` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	 * 8: DLSDeadLocalStoreInReturn
	 */
	private int operatorType = 0;
	
	public OperatorMutator(int operatorType) {
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		for (int i=0; i < arrSplit.length; i++)
		{
			Configuration.additionalDepsFromCmdLine.add(arrSplit[i]);
		}

```

## RuleId[id=ConstantValue]
### ConstantValue
Value `isStatic` is always 'true'
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
					}
					if (mt != ModifierType.PRIVATE) {
						Field field = new Field(classPathAndName, mt, varType, varName, isStatic);
						SetUtils.addToMap(this.fields, classPathAndName, field);
						varName = className + "." + varName;
```

### ConstantValue
Condition `results == 1` is always `true`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				//int results = (this.buggyProject.startsWith("Mockito") || this.buggyProject.startsWith("Closure") || this.buggyProject.startsWith("Time")) ? TestUtils.compileProjectWithDefects4j(fullBuggyProjectPath, defects4jPath) : 1;
				int results = 1;
				if (results == 1) {
					log.debug(buggyProject + " ---Fixer: fix fail because of failed compiling! ");
					continue;
```

### ConstantValue
Condition `tmpFailedTestsAfterFix.size() > 0` is always `false`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				tmpFailedTestsAfterFix.addAll(failedTestsAfterFix);
				tmpFailedTestsAfterFix.removeAll(this.failedTestStrList);
				if (tmpFailedTestsAfterFix.size() > 0) { // Generate new bugs.
					log.debug(buggyProject + " ---Generated new bugs: " + tmpFailedTestsAfterFix.size());
					continue;
```

### ConstantValue
Result of `tmpFailedTestsAfterFix.size()` is always '0'
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				tmpFailedTestsAfterFix.addAll(failedTestsAfterFix);
				tmpFailedTestsAfterFix.removeAll(this.failedTestStrList);
				if (tmpFailedTestsAfterFix.size() > 0) { // Generate new bugs.
					log.debug(buggyProject + " ---Generated new bugs: " + tmpFailedTestsAfterFix.size());
					continue;
```

### ConstantValue
Condition `errorTestAfterFix == 0 || failedTestsAfterFix.isEmpty()` is always `true`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				
				// Output the generated patch.
				if (errorTestAfterFix == 0 || failedTestsAfterFix.isEmpty()) {
					fixedStatus = 1;
					log.info("Succeeded to fix the bug " + buggyProject + "====================");
```

### ConstantValue
Condition `failedTestsAfterFix.isEmpty()` is always `true` when reached
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				
				// Output the generated patch.
				if (errorTestAfterFix == 0 || failedTestsAfterFix.isEmpty()) {
					fixedStatus = 1;
					log.info("Succeeded to fix the bug " + buggyProject + "====================");
```

### ConstantValue
Condition `isBuggyProject` is always `true` when reached
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	    				}
	    			}
				} else if (isBuggyProject!= null && isBuggyProject) isBuggyProject = false;
			} else if (!isBuggyProject) break;
		}
```

### ConstantValue
Condition `!isBuggyProject` is always `true`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	    			}
				} else if (isBuggyProject!= null && isBuggyProject) isBuggyProject = false;
			} else if (!isBuggyProject) break;
		}
		return suspiciousCodeList;
```

### ConstantValue
Condition `isBuggyProject` is always `true` when reached
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	            		buggyFileList.add(classPath);
	            	}
				} else if (isBuggyProject!= null && isBuggyProject) isBuggyProject = false;
			} else if (!isBuggyProject) break;
		}
```

### ConstantValue
Condition `!isBuggyProject` is always `true`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	            	}
				} else if (isBuggyProject!= null && isBuggyProject) isBuggyProject = false;
			} else if (!isBuggyProject) break;
		}
		return buggyFileList;
```

### ConstantValue
Condition `predicateExpCandidateStr.equals(suspPredicateExpStr)` is always `false` when reached
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ConditionalExpressionMutator.java`
#### Snippet
```java
				
				String predicateExpCandidateStr = getPredicateExpCandidate(predicateExpStartPos, predicateExpEndPos);
				if (suspPredicateExpStr.contains(predicateExpCandidateStr) || predicateExpCandidateStr.equals(suspPredicateExpStr)) continue;
				if (predicateExpCandidateStr.contains("==null") || predicateExpCandidateStr.contains("== null")
						|| predicateExpCandidateStr.contains("!=null") || predicateExpCandidateStr.contains("!= null")) continue;
```

### ConstantValue
Value `isCorelatedStmt` is always 'true'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
			} else if (Checker.isComplexExpression(type)) {
				isCorelatedStmt = isCorelatedStmt(child, variables, stmtType, null, posList, oldType);
				if (isCorelatedStmt) return isCorelatedStmt;
			} else if (Checker.isStatement(type)) {
				identifySameTypes(child, oldType, variables, (index == size - 1 ? null : children.subList(index + 1, size)), posList);
```

### ConstantValue
Value `isCorelatedStmt` is always 'true'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
			for (ITree peerStmt : peerStmts) {
				isCorelatedStmt = isCorelatedStmt(peerStmt, variables, stmtType, null, posList, oldType);
				if (isCorelatedStmt) return isCorelatedStmt;
			}
		}
```

### ConstantValue
Condition `returnType != null` is always `true`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
				if (returnType != null) {
					String fixedCodeStr1 = "if (" + parameterExpStr + " >= " + collectionExpStr + ".size()) return ";
					if (returnType != null && !returnType.isEmpty()) {
						if ("void".equals(returnType)) {
							fixedCodeStr1 += ";\n";
```

### ConstantValue
Condition `"".equals(className)` is always `true`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		while (true) {
			if (Checker.isTypeDeclaration(parent.getType())) {
				className = "".equals(className) ? ContextReader.readClassName(parent) : ContextReader.readClassName(parent) + "." + className;
				break;
			}
```

### ConstantValue
Condition `paraTypeStrs == null` is always `false`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			// Read parameter data types.
			List<String> paraTypeStrs = readMethodParameterTypes(parameters);
			if (paraTypeStrs == null) continue; // Generate ERROR when reading its parameter types.
			
			// Identify possible return types of the method invocations.
```

## RuleId[id=SuspiciousIndentAfterControlStatement]
### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
//				} else 
//				if (varDataType.equals(method.getReturnType())) {
					List<String> parameterTypes = method.getParameterTypes();
					if (parameterTypes.isEmpty()) {
						generatePatch(codePart1 + method.getMethodName() + "()" + codePart2);
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/edu/lu/uni/serval/jdt/tree/AbstractTree.java`
#### Snippet
```java
        StringBuilder b = new StringBuilder();
        for (ITree t : TreeUtils.preOrder(this))
            b.append(indent(t) + t.toShortString() + "\n");
        return b.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `src/main/java/edu/lu/uni/serval/jdt/tree/AbstractTree.java`
#### Snippet
```java
       	for (ITree child: getChildren())
       		if (!"".equals(child.getLabel()))
       			b.append(child.getLabel() + " ");
       	return b.toString().trim();
   	}
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
                if(Configuration.ShellVerbose)
                {
```

