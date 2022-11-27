# kbar 
 
# Bad smells
I found 785 bad smells with 103 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 89 | false |
| ReturnNull | 74 | false |
| CommentedOutCode | 67 | false |
| UnusedAssignment | 48 | false |
| BoundedWildcard | 44 | false |
| RedundantFieldInitialization | 33 | false |
| ThrowablePrintStackTrace | 31 | false |
| DynamicRegexReplaceableByCompiledPattern | 30 | false |
| AssignmentToMethodParameter | 29 | false |
| UnnecessaryToStringCall | 26 | true |
| IgnoreResultOfCall | 25 | false |
| SizeReplaceableByIsEmpty | 21 | true |
| DataFlowIssue | 19 | false |
| EmptyStatementBody | 18 | false |
| ConstantValue | 18 | false |
| UtilityClassWithoutPrivateConstructor | 17 | true |
| UnnecessaryModifier | 15 | true |
| NestedAssignment | 15 | false |
| ReplaceAssignmentWithOperatorAssignment | 14 | false |
| UnnecessaryBoxing | 13 | false |
| UNUSED_IMPORT | 11 | false |
| AssignmentToStaticFieldFromInstanceMethod | 8 | false |
| DuplicateCondition | 8 | false |
| UnnecessaryLocalVariable | 8 | true |
| CatchMayIgnoreException | 7 | false |
| InnerClassMayBeStatic | 7 | true |
| StringEqualsEmptyString | 7 | false |
| ConditionalBreakInInfiniteLoop | 6 | false |
| RedundantMethodOverride | 6 | false |
| UnnecessarySemicolon | 5 | false |
| AbstractClassNeverImplemented | 4 | false |
| UnnecessaryUnboxing | 4 | false |
| StringOperationCanBeSimplified | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| CStyleArrayDeclaration | 3 | false |
| UnnecessaryReturn | 3 | true |
| NonShortCircuitBoolean | 3 | false |
| EqualsAndHashcode | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| StringConcatenationInsideStringBufferAppend | 3 | false |
| PublicFieldAccessedInSynchronizedContext | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| EqualsWithItself | 2 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| IOResource | 2 | false |
| RedundantOperationOnEmptyContainer | 2 | false |
| RedundantLengthCheck | 2 | false |
| SwitchStatementWithConfusingDeclaration | 2 | false |
| UnnecessaryContinue | 2 | false |
| EmptyMethod | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| SamePackageImport | 1 | false |
| RedundantFileCreation | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=EqualsWithItself]
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

## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[ruleID=WrapperTypeMayBePrimitive]
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

## RuleId[ruleID=UnnecessaryModifier]
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
in `src/main/java/edu/lu/uni/serval/jdt/tree/hash/HashGenerator.java`
#### Snippet
```java
public interface HashGenerator {

    public void hash(ITree t);

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
public interface IFixTemplate {
	
	public void setSuspiciousCodeStr(String suspiciousCodeStr);
	
	public String getSuspiciousCodeStr();
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
	public ITree getSuspiciousCodeTree();
	
	public void generatePatches();
	
	public List<Patch> getPatches();
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

## RuleId[ruleID=ConditionalBreakInInfiniteLoop]
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
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			}
		} else {
			while (true) {
				int parentTreeType = codeAst.getType();
				if (Checker.isStatement(parentTreeType)) {// variable
```

## RuleId[ruleID=EmptyStatementBody]
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

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Configuration.lastFixPattern` from instance context
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		int indexSort=tpString.indexOf('@');
		String addtoMap=tpString.substring(0,indexSort);
		Configuration.lastFixPattern=addtoMap;
		System.out.println("FixTemplate: "+addtoMap);

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Configuration.generatePatchTime` from instance context
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		ft.generatePatches();
		long generatePatchEndTime = System.nanoTime() - generatePatchstartTime; //measure
		Configuration.generatePatchTime+=generatePatchEndTime;

		List<Patch> patchCandidates = ft.getPatches();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Configuration.validatePatchTime` from instance context
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		testGeneratedPatches(patchCandidates, scn);		
		long validatePatchEndTime = System.nanoTime() - validatePatchstartTime; //measure
		Configuration.validatePatchTime+=validatePatchEndTime;

	
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Configuration.dicttime` from instance context
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java

			long totalEndTimedict = System.nanoTime() - totalstartTimeDic;
			Configuration.dicttime=totalEndTimedict;

			//MEASUREMENTS
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Configuration.dictionarysize` from instance context
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				//System.out.println("value: "+value); //SKRIV INTE UT
				System.out.println("value size: "+value.size()); */
				Configuration.dictionarysize+=value.size();

				/*for (int i = 0; i < value.size(); i++) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Configuration.dictionarysize` from instance context
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				//System.out.println("value size: "+value.size()); 

				Configuration.dictionarysize+=value.size();

				/*for (int i = 0; i < value.size(); i++) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Configuration.dictionarysize` from instance context
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				System.out.println("value size: "+value.size()); */

				Configuration.dictionarysize+=value.size();


```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Configuration.dictionarysize` from instance context
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
			}
			//System.out.println("superClass value size: "+sizeSuperclass); 
			Configuration.dictionarysize+=sizeSuperclass;
			//System.exit(0);
			
```

## RuleId[ruleID=CStyleArrayDeclaration]
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

## RuleId[ruleID=CommentedOutCode]
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
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java
		path.append(System.getProperty("path.separator"));

		/*for (String addclasspath : Configuration.additionalClasspathsFromCmdLine) {
			path.append(addclasspath);
			path.append(System.getProperty("path.separator"));
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`stack.size() > 0` can be replaced with '!stack.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
            @Override
            public boolean hasNext() {
                return stack.size() > 0;
            }

```

### SizeReplaceableByIsEmpty
`currents.size() > 0` can be replaced with '!currents.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
        List<ITree> currents = new ArrayList<>();
        currents.add(tree);
        while (currents.size() > 0) {
            ITree c = currents.remove(0);
            trees.add(c);
```

### SizeReplaceableByIsEmpty
`stack.size() > 0` can be replaced with '!stack.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
            @Override
            public boolean hasNext() {
                return stack.size() > 0;
            }

```

### SizeReplaceableByIsEmpty
`getChildren().size() == 0` can be replaced with 'getChildren().isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/tree/AbstractTree.java`
#### Snippet
```java
    @Override
    public boolean isLeaf() {
        return getChildren().size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/ListSorter.java`
#### Snippet
```java

	public List<T> sortDescending() {
		if (list != null && list.size() > 0) {
			Collections.sort(this.list, Collections.reverseOrder());
		}
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/ListSorter.java`
#### Snippet
```java
	public List<T> sortAscending() {
		try {
			if (list != null && list.size() > 0) {
				Collections.sort(this.list, new Comparator<T>() {

```

### SizeReplaceableByIsEmpty
`modifiers.size() > 0` can be replaced with '!modifiers.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	int length = node.getLength();
    	List<?> modifiers = node.modifiers();
    	if (modifiers.size() > 0) {
    		label += modifiers.toString();
    		startPosition = ((ASTNode)  modifiers.get(0)).getStartPosition();
```

### SizeReplaceableByIsEmpty
`interfaceTypes.size() > 0` can be replaced with '!interfaceTypes.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	
    	List<?> interfaceTypes = node.superInterfaceTypes(); // type
    	if (interfaceTypes.size() > 0) {
    		label += interfaceTypes.toString();
    	}
```

### SizeReplaceableByIsEmpty
`arguments.size() == 0` can be replaced with 'arguments.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
		SimpleName methodName = node.getName();
		List<?> arguments = node.arguments();
		if (exp == null && arguments.size() == 0) {
			pushNode(node, "MethodName:" + methodName.getFullyQualifiedName() + ":" + arguments.toString());
		} else {
```

### SizeReplaceableByIsEmpty
`typeParameters.size() > 0` can be replaced with '!typeParameters.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
		}
		methodLabel += "@@" + returnTypeStr + ", ";
		if (typeParameters != null && typeParameters.size() > 0) {
			methodLabel += "@@tp:";
			for (Object obj : typeParameters) {
```

### SizeReplaceableByIsEmpty
`parameters.size() == 0` can be replaced with 'parameters.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
			startPosition = methodName.getStartPosition();
		}
		if (parameters == null || parameters.size() == 0) {
			methodLabel += "@@Argus:null";
		} else {
```

### SizeReplaceableByIsEmpty
`exceptionTypes.size() > 0` can be replaced with '!exceptionTypes.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
			}
		}
		if (exceptionTypes != null && exceptionTypes.size() > 0) {
			methodLabel += "@@Exp:";
			for (Object obj : exceptionTypes) {
```

### SizeReplaceableByIsEmpty
`modifiers.size() > 0` can be replaced with '!modifiers.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	int length = node.getLength();
    	List<?> modifiers = node.modifiers();
    	if (modifiers.size() > 0) {
    		label += modifiers.toString();
    		startPosition = ((ASTNode)  modifiers.get(0)).getStartPosition();
```

### SizeReplaceableByIsEmpty
`interfaceTypes.size() > 0` can be replaced with '!interfaceTypes.isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/ExpJdtVisitor.java`
#### Snippet
```java
    	}
    	List<?> interfaceTypes = node.superInterfaceTypes(); // type
    	if (interfaceTypes.size() > 0) {
    		label += "@@Interface:" + interfaceTypes.toString();
    	}
```

### SizeReplaceableByIsEmpty
`s.length()!=0` can be replaced with '!s.isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            in = new BufferedInputStream(process.getInputStream());
            br = new BufferedReader(new InputStreamReader(in));
            while ((s = br.readLine()) != null && s.length()!=0) {
                if (sb.length() < 1000000){
                    if (Thread.interrupted()){
```

### SizeReplaceableByIsEmpty
`s.length()!=0` can be replaced with '!s.isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            in = new BufferedInputStream(process.getErrorStream());
            br = new BufferedReader(new InputStreamReader(in));
            while ((s = br.readLine()) != null && s.length()!=0) {
                if (Thread.interrupted()){
                    return sb.toString();
```

### SizeReplaceableByIsEmpty
`unit.types().size() == 0` can be replaced with 'unit.types().isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/CodeUtils.java`
#### Snippet
```java
	private static List<MethodDeclaration> getAllMethod(String code, boolean getInnerClassMethod,
			CompilationUnit unit) {
		if (unit.types().size() == 0) {
			return new ArrayList<>();
		}
```

### SizeReplaceableByIsEmpty
`method.getBody().statements().size() == 0` can be replaced with 'method.getBody().statements().isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/CodeUtils.java`
#### Snippet
```java
		List<MethodDeclaration> methodDec = getMethod(code, methodName, unit);
		for (MethodDeclaration method : methodDec) {
			if (method.getBody() == null || method.getBody().statements().size() == 0) {
				continue;
			}
```

### SizeReplaceableByIsEmpty
`fl.size() > 0` can be replaced with '!fl.isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			} else {
				List<File> fl = listAllFiles(f, type);
				if (fl != null && fl.size() > 0) {
					fileList.addAll(fl);
				}
```

### SizeReplaceableByIsEmpty
`tmpFailedTestsAfterFix.size() > 0` can be replaced with '!tmpFailedTestsAfterFix.isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				tmpFailedTestsAfterFix.addAll(failedTestsAfterFix);
				tmpFailedTestsAfterFix.removeAll(this.failedTestStrList);
				if (tmpFailedTestsAfterFix.size() > 0) { // Generate new bugs.
					log.debug(buggyProject + " ---Generated new bugs: " + tmpFailedTestsAfterFix.size());
					continue;
```

### SizeReplaceableByIsEmpty
`posList.size() > 0` can be replaced with '!posList.isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
	    			List<Integer> posList = new ArrayList<>();
    				identifySameTypes(stmt, dataType, variables, (index == size - 1 ? null : peerStmts.subList(index + 1, size)), posList);
        			if (posList.size() > 0) {
        				lastStmt = stmt;
        				positionsList1.addAll(posList);
```

## RuleId[ruleID=UnnecessaryReturn]
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

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= destination.add(element)`
in `src/main/java/edu/lu/uni/serval/tbar/utils/JavaLibrary.java`
#### Snippet
```java
		boolean changed = false;
		for (T element : elements) {
			changed |= destination.add(element);
		}
		return changed;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `"char".equals(returnType) | "Character".equals(returnType)`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("char".equals(returnType) | "Character".equals(returnType)) {
			vars = allVarNamesMap.get("char");
			List<String> vars2 = allVarNamesMap.get("Character");
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `"char".equals(returnType) | "Character".equals(returnType)`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
			if (vars == null) vars = vars2;
			else if (vars2 != null) vars.addAll(vars2);
		} else if ("char".equals(returnType) | "Character".equals(returnType)) {
			vars = allVarNamesMap.get("char");
			List<String> vars2 = allVarNamesMap.get("Character");
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super ITree`
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
    }

    private static void preOrder(ITree tree, List<ITree> trees) {
        trees.add(tree);
        if (!tree.isLeaf())
```

### BoundedWildcard
Can generalize to `? extends ITree`
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
    }

    public static void numbering(Iterable<ITree> iterable) {
        int i = 0;
        for (ITree t: iterable)
```

### BoundedWildcard
Can generalize to `? super ITree`
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
    }

    private static void postOrder(ITree tree, List<ITree> trees) {
        if (!tree.isLeaf())
            for (ITree c: tree.getChildren())
```

### BoundedWildcard
Can generalize to `? extends ITree`
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
            }

            ITree selectNextChild(Iterator<ITree> it) {
                if (!it.hasNext())
                    return stack.pop().getFirst();
```

### BoundedWildcard
Can generalize to `? extends ITree`
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeUtils.java`
#### Snippet
```java
    }

    public static Iterator<ITree> leafIterator(final Iterator<ITree> it) {
        return new Iterator<ITree>() {
            ITree current = it.hasNext() ? it.next() : null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/edu/lu/uni/serval/tbar/utils/ListSorter.java`
#### Snippet
```java
	private List<T> list;

	public ListSorter(List<T> list) {
		this.list = new ArrayList<>();
		this.list.addAll(list);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/utils/SetUtils.java`
#### Snippet
```java
public class SetUtils {

	public static <T> void addToMap(Map<String, List<T>> dictionary, String key, T t) {
		List<T> objects = dictionary.get(key);
		if (objects == null) {
```

### BoundedWildcard
Can generalize to `? extends ASTNode`
in `src/main/java/edu/lu/uni/serval/jdt/visitor/JdtVisitor.java`
#### Snippet
```java
    }

    private int endPosition(List<ASTNode> list) {
        if (list.isEmpty())
            return 0;
```

### BoundedWildcard
Can generalize to `? extends ASTNode`
in `src/main/java/edu/lu/uni/serval/jdt/visitor/JdtVisitor.java`
#### Snippet
```java
    }

    private void visitList(List<ASTNode> list) {
        for (ASTNode node : list) {
            (node).accept(this);
```

### BoundedWildcard
Can generalize to `? extends ASTNode`
in `src/main/java/edu/lu/uni/serval/jdt/visitor/JdtVisitor.java`
#### Snippet
```java
    }

    private int startPosition(List<ASTNode> list) {
        if (list.isEmpty())
            return -1;
```

### BoundedWildcard
Can generalize to `? extends Patch`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	protected List<Patch> triedPatchCandidates = new ArrayList<>();
	
	protected void testGeneratedPatches(List<Patch> patchCandidates, SuspCodeNode scn) {
		// Testing generated patches.
		int counter=0;
```

### BoundedWildcard
Can generalize to `? extends ITree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementMover.java`
#### Snippet
```java
	}

	private void exchangeStatementSequence(List<ITree> peerStmts, int buggyStmtIndex) {
		for (int index = 0, size = peerStmts.size(); index < size; index ++) {
			if (index < buggyStmtIndex) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	}

	public void setMethods(Map<String, List<Method>> methods) {
		this.methods.putAll(methods);
	}
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	}

	public void setImportedDependencies(Map<String, List<String>> importedDependencies) {
		this.importedDependencies.putAll(importedDependencies);
	}
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	}

	public void setAllFields(Map<String, List<Field>> allFields) {
		this.allFields.putAll(allFields);
	}
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
    

public static int getFailTestNumInProjectBears2(String projectName, List<String> failedTests){
/*
Test output example in the following format (do not read Results):
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java

    //Normal Bears
	public static int getFailTestNumInProject(String projectName, List<String> failedTests){

        /* 
```

### BoundedWildcard
Can generalize to `? extends ITree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/DataTypeReplacer.java`
#### Snippet
```java
	}
	
	private boolean isCorelatedStmt(ITree stmt, List<String> variables, int stmtType, List<ITree> peerStmts, List<Integer> posList, String oldType) {
		List<ITree> children = stmt.getChildren();
		boolean isCorelatedStmt = false;
```

### BoundedWildcard
Can generalize to `? super ITree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ReturnStatementMutator.java`
#### Snippet
```java
	
	private List<String> condExpStrList = new ArrayList<>();
	private void searchForExpressions(ITree tree, List<ITree> expList) {
		int treeType = tree.getType();
		ITree exp = null;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
	}
	
	private void identifySuspiciousVariables(ITree suspCodeAst, List<String> allSuspVariables, List<SuspNullExpStr> suspNullExpStrs) {
		List<ITree> children = suspCodeAst.getChildren();
		for (ITree child : children) {
```

### BoundedWildcard
Can generalize to `? super SuspNullExpStr`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
	}
	
	private void identifySuspiciousVariables(ITree suspCodeAst, List<String> allSuspVariables, List<SuspNullExpStr> suspNullExpStrs) {
		List<ITree> children = suspCodeAst.getChildren();
		for (ITree child : children) {
```

### BoundedWildcard
Can generalize to `? extends ITree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	}

	private Map<ITree, Integer> readSubPredicateExpressions(List<ITree> subExps) {
		Map<ITree, Integer> predicateExps = new HashMap<>();
		ITree operator = subExps.get(1);
```

### BoundedWildcard
Can generalize to `? super ITree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	}

	private void identifySinglePredicateExpressions(ITree expAst, int distance, Map<ITree, Integer> predicateExps, List<String> varNames) {
		if (Checker.isInfixExpression(expAst.getType())) { // InfixExpression
			String operator = expAst.getChild(1).getLabel();
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	}

	private void identifySinglePredicateExpressions(ITree expAst, int distance, Map<ITree, Integer> predicateExps, List<String> varNames) {
		if (Checker.isInfixExpression(expAst.getType())) { // InfixExpression
			String operator = expAst.getChild(1).getLabel();
```

### BoundedWildcard
Can generalize to `? super ITree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	}

	private void identifyPredicateExpressionsInParentTree(ITree tree, int distance, Map<ITree, Integer> predicateExps) {
		int treeType = tree.getType();
		if (Checker.isTypeDeclaration(treeType)) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
	}

	private void identifyPredicateExpressionsInParentTree(ITree tree, int distance, Map<ITree, Integer> predicateExps) {
		int treeType = tree.getType();
		if (Checker.isTypeDeclaration(treeType)) {
```

### BoundedWildcard
Can generalize to `? extends ITree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	 * 		   other - parameter types.
	 */
	private List<String> readMethodParameterTypes(List<ITree> parameters) {
		List<String> paraTypeStrs = new ArrayList<>();
		if (parameters == null || parameters.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Field`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}
	
	private static void addFieldsToVars(List<Field> fields, Map<String, List<String>> allVarNamesMap,
			Map<String, String> varTypesMap, List<String> allVarNamesList, String className, boolean privateNeeded) {
		if (fields == null) return;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	
	private static void addFieldsToVars(List<Field> fields, Map<String, List<String>> allVarNamesMap,
			Map<String, String> varTypesMap, List<String> allVarNamesList, String className, boolean privateNeeded) {
		if (fields == null) return;
		
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	
	private static void addFieldsToVars(List<Field> fields, Map<String, List<String>> allVarNamesMap,
			Map<String, String> varTypesMap, List<String> allVarNamesList, String className, boolean privateNeeded) {
		if (fields == null) return;
		
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	
	private static void addFieldsToVars(List<Field> fields, Map<String, List<String>> allVarNamesMap,
			Map<String, String> varTypesMap, List<String> allVarNamesList, String className, boolean privateNeeded) {
		if (fields == null) return;
		
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java

	private static void addStaticFieldsFromDependencies(Map<String, List<String>> allVarNamesMap,
			Map<String, String> varTypesMap, List<String> allVarNamesList, String classNameAndPath, Dictionary dic, String codePath) {
		List<String> dependencies = dic.findImportedDependencies(classNameAndPath);
		if (dependencies == null) return;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java

	private static void addStaticFieldsFromDependencies(Map<String, List<String>> allVarNamesMap,
			Map<String, String> varTypesMap, List<String> allVarNamesList, String classNameAndPath, Dictionary dic, String codePath) {
		List<String> dependencies = dic.findImportedDependencies(classNameAndPath);
		if (dependencies == null) return;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java

	private static void addStaticFieldsFromDependencies(Map<String, List<String>> allVarNamesMap,
			Map<String, String> varTypesMap, List<String> allVarNamesList, String classNameAndPath, Dictionary dic, String codePath) {
		List<String> dependencies = dic.findImportedDependencies(classNameAndPath);
		if (dependencies == null) return;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}

	private static void addVarialbeToSet(String varName, String varType, Map<String, List<String>> allVarNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
		List<String> varNames = allVarNamesMap.get(varType);
		if (varNames == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}

	private static void addVarialbeToSet(String varName, String varType, Map<String, List<String>> allVarNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
		List<String> varNames = allVarNamesMap.get(varType);
		if (varNames == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}

	private static void addVarialbeToSet(String varName, String varType, Map<String, List<String>> allVarNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
		List<String> varNames = allVarNamesMap.get(varType);
		if (varNames == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}

	private static void addVarialbeToSet(String varName, String varType, Map<String, List<String>> allVarNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
		List<String> varNames = allVarNamesMap.get(varType);
		if (varNames == null) {
```

### BoundedWildcard
Can generalize to `? super ITree`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}

	public static void identifySuspiciousVariables(ITree suspCodeAst, List<ITree> varTrees, List<String> allSuspVariables) {
		List<ITree> children = suspCodeAst.getChildren();
		for (ITree child : children) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}

	public static void identifySuspiciousVariables(ITree suspCodeAst, List<ITree> varTrees, List<String> allSuspVariables) {
		List<ITree> children = suspCodeAst.getChildren();
		for (ITree child : children) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}
	
	private static void readSingleVariableDeclaration(ITree codeTree, int treeType, Map<String, List<String>> varNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
		if (Checker.isSingleVariableDeclaration(treeType)) {
			List<ITree> children = codeTree.getChildren();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}
	
	private static void readSingleVariableDeclaration(ITree codeTree, int treeType, Map<String, List<String>> varNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
		if (Checker.isSingleVariableDeclaration(treeType)) {
			List<ITree> children = codeTree.getChildren();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}
	
	private static void readSingleVariableDeclaration(ITree codeTree, int treeType, Map<String, List<String>> varNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
		if (Checker.isSingleVariableDeclaration(treeType)) {
			List<ITree> children = codeTree.getChildren();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
	}
	
	private static void readSingleVariableDeclaration(ITree codeTree, int treeType, Map<String, List<String>> varNamesMap, Map<String, String> varTypesMap, List<String> allVarNamesList) {
		if (Checker.isSingleVariableDeclaration(treeType)) {
			List<ITree> children = codeTree.getChildren();
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractRawTokenJdtVisitor` has no concrete subclass
in `src/main/java/edu/lu/uni/serval/jdt/visitor/AbstractRawTokenJdtVisitor.java`
#### Snippet
```java
 *
 */
public abstract class AbstractRawTokenJdtVisitor extends AbstractJdtVisitor {

    public AbstractRawTokenJdtVisitor() {
```

### AbstractClassNeverImplemented
Abstract class `AbstractRawTokenJdtTreeGenerator` has no concrete subclass
in `src/main/java/edu/lu/uni/serval/jdt/generator/AbstractRawTokenJdtTreeGenerator.java`
#### Snippet
```java
import java.util.Map;

public abstract class AbstractRawTokenJdtTreeGenerator extends TreeGenerator {

    private static char[] readerToCharArray(Reader r) throws IOException {
```

### AbstractClassNeverImplemented
Abstract class `Registry` has no concrete subclass
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
import java.util.TreeSet;

public abstract class Registry<K, C, A> {

    Set<Entry> entries = new TreeSet<>(
```

### AbstractClassNeverImplemented
Abstract class `Entry` has no concrete subclass
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
    }

    public abstract class Entry {
        public final String id;
        public final int priority;
```

## RuleId[ruleID=DuplicateCondition]
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

## RuleId[ruleID=IgnoreResultOfCall]
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
			deleteDirectory(filePath);
		}
		file.mkdirs();
	}
	
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
Result of `String.replace()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ClassCastChecker.java`
#### Snippet
```java
				fixedCodeStr1 = "Object _tempVar = " + castedExpStr + ";\n\t" +
								"if (_temVar != null && _temVar instanceof " + castTypeStr + ") {\n\t";
				 this.getSuspiciousCodeStr().replace(castedExpStr, "_temVar");
			}
			
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
Result of `File.delete()` is ignored
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        System.out.println("xx - sizeoferrortest:"+errorTestCmdLine.size());
        System.out.println("xx - sizeoffailtest:"+failedTestCmdLine.size());
        fileTestOutput.delete();

        int errorNum=0;
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
			if (parentContext == null) return;
			
			boolean isLoopStmt = parentContext.getSecond().booleanValue();
			
			buggyExps = new ListSorter<ExpStr>(buggyExps).sortAscending();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
			if (parent == null) return null;
			int type = parent.getType();
			if (!isLoopStmt.booleanValue() && 
					(Checker.isForStatement(type) || Checker.isEnhancedForStatement(type)
					|| Checker.isWhileStatement(type) || Checker.isDoStatement(type))) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
				 * +   …v…
				 */
				boolean isLoopStmt = parentContext.getSecond().booleanValue();
				
				String fixedCodeStr1 = "";
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
				if (parent == null) return null;
				int type = parent.getType();
				if (!isLoopStmt.booleanValue() && 
						(Checker.isForStatement(type) || Checker.isEnhancedForStatement(type)
						|| Checker.isWhileStatement(type) || Checker.isDoStatement(type))) {
```

## RuleId[ruleID=RedundantMethodOverride]
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
    public void endVisit(VariableDeclarationExpression node) {
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

## RuleId[ruleID=IfStatementWithIdenticalBranches]
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

## RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeContext.java`
#### Snippet
```java
    public Object getMetadata(ITree node, String key) {
        Object metadata;
        if (node == null || (metadata = node.getMetadata(key)) == null)
            return getMetadata(key);
        return metadata;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/jdt/generator/AbstractJdtTreeGenerator.java`
#### Snippet
```java
            char[] buf = new char[10];
            int numRead = 0;
            while ((numRead = br.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/jdt/generator/AbstractRawTokenJdtTreeGenerator.java`
#### Snippet
```java
            char[] buf = new char[10];
            int numRead = 0;
            while ((numRead = br.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
				FileReader fileReader = new FileReader(javaFile);
				br = new BufferedReader(fileReader);
				while ((numRead = br.read(buf)) != -1) {
					String readData = String.valueOf(buf, 0, numRead);
					fileData.append(readData);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
			try (BufferedReader br = new BufferedReader(new FileReader(additionclasspaths))) {
				String line;
				while ((line = br.readLine()) != null) {
				   Configuration.additionalClasspathsFromCmdLine=line;
				}
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
    
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
                if(Configuration.ShellVerbose)
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            in = new BufferedInputStream(process.getInputStream());
            br = new BufferedReader(new InputStreamReader(in));
            while ((s = br.readLine()) != null && s.length()!=0) {
                if (sb.length() < 1000000){
                    if (Thread.interrupted()){
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            in = new BufferedInputStream(process.getErrorStream());
            br = new BufferedReader(new InputStreamReader(in));
            while ((s = br.readLine()) != null && s.length()!=0) {
                if (Thread.interrupted()){
                    return sb.toString();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	String[] elements = line.split("@");
            	SuspiciousPosition sp = new SuspiciousPosition();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	String[] elements = line.split("@");
            	if (!buggyFileList.contains(elements[0])) continue;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	String[] elements = line.split("@");
            	SuspiciousPosition sp = new SuspiciousPosition();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			BufferedReader reader = new BufferedReader(new FileReader(suspiciousFile.getPath() + "/" + this.buggyProject + "/target/sfl/txt/tests.csv"));
			String line = reader.readLine();
			while ((line = reader.readLine()) != null) {
				String testCase = line.substring(0, line.indexOf(","));
				allTestCases.add(testCase);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			reader = new BufferedReader(new FileReader(suspiciousFile.getPath() + "/" + this.buggyProject + "/target/sfl/txt/ochiai.ranking.csv"));
			line = reader.readLine();
			while ((line = reader.readLine()) != null) {
				int dollarIndex = line.indexOf("$");
				int sharpIndex = line.indexOf("#");
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
    int lineCount = 0;

    while ((st = br.readLine()) != null)
    {
        lineCount++;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        int lineCount = 0;

        while ((st = br.readLine()) != null)
        {
            lineCount++;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`size = size - c.getSize() * 2` could be simplified to 'size -= c.getSize() \* 2'
in `src/main/java/edu/lu/uni/serval/jdt/tree/hash/RollingHashGenerator.java`
#### Snippet
```java

        for (ITree c: t.getChildren()) {
            size = size - c.getSize() * 2;
            hash += c.getHash() * fpow(BASE, size);
        }
```

### ReplaceAssignmentWithOperatorAssignment
`index = index + 2` could be simplified to 'index += 2'
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
			}
			String[] argusArray = argus.split("\\+");
			for (int index = 0, length = argusArray.length; index < length; index = index + 2) {
				String arguType = ContextReader.readType(argusArray[index]);
				parameterTypes.add(arguType);
```

### ReplaceAssignmentWithOperatorAssignment
`line = line + assertStartLine` could be simplified to 'line += assertStartLine'
in `src/main/java/edu/lu/uni/serval/tbar/utils/CodeUtils.java`
#### Snippet
```java
				if (bracket == 0) {
					if (line.contains("fail(")) {
						line = line + assertStartLine;
					}
					result.put(line, assertStartLine);
```

### ReplaceAssignmentWithOperatorAssignment
`line = line + methodStartLine` could be simplified to 'line += methodStartLine'
in `src/main/java/edu/lu/uni/serval/tbar/utils/CodeUtils.java`
#### Snippet
```java
				if (bracket == 0) {
					if (line.contains("fail(")) {
						line = line + methodStartLine;
					}
					result.put(line, methodStartLine);
```

### ReplaceAssignmentWithOperatorAssignment
`minErrorTest_ = minErrorTest_ - (minErrorTest - errorTestAfterFix)` could be simplified to 'minErrorTest_ -= (minErrorTest - errorTestAfterFix)'
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
						minErrorTestAfterFix = errorTestAfterFix;
						fixedStatus = 2;
						minErrorTest_ = minErrorTest_ - (minErrorTest - errorTestAfterFix);
						if (minErrorTest_ <= 0) {
							fixedStatus = 1;
```

### ReplaceAssignmentWithOperatorAssignment
`index = index - fromIndex` could be simplified to 'index -= fromIndex'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementMover.java`
#### Snippet
```java
		
		if (toIndex == -1 || fromIndex == -1) return;
		index = index - fromIndex;
		List<ITree> peerStmts = children.subList(fromIndex, toIndex);
		exchangeStatementSequence(peerStmts, index);
```

### ReplaceAssignmentWithOperatorAssignment
`errorNum=errorNum+failedTestCmdLine.size()` could be simplified to 'errorNum += failedTestCmdLine.size()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java

    failedTests.addAll(failedTestCmdLine);
    errorNum=errorNum+failedTestCmdLine.size();

    return errorNum;
```

### ReplaceAssignmentWithOperatorAssignment
`errorNum=errorNum+failedTestCmdLine.size()` could be simplified to 'errorNum += failedTestCmdLine.size()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        
        failedTests.addAll(failedTestCmdLine);
        errorNum=errorNum+failedTestCmdLine.size();

        return errorNum;
```

### ReplaceAssignmentWithOperatorAssignment
`paraStartPos = paraStartPos + para.getLength()` could be simplified to 'paraStartPos += para.getLength()'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/MethodInvocationMutator.java`
#### Snippet
```java
					
					if (i == parametersSize) {
						paraStartPos = paraStartPos + para.getLength();
						codePart1 = this.getSubSuspiciouCodeStr(suspCodeStartPos, paraStartPos);
						codePart2 = this.getSubSuspiciouCodeStr(paraStartPos, suspCodeEndPos);
```

### ReplaceAssignmentWithOperatorAssignment
`size = size - 1` could be simplified to 'size -= 1'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/MethodInvocationMutator.java`
#### Snippet
```java
					this.generatePatch(fixedCodeStr1);
				} else {
					size = size - 1;
					for (int index = 0; index < size; index ++) {
						startPos = paraAsts.get(index).getPos(); 
```

### ReplaceAssignmentWithOperatorAssignment
`index = index - 2` could be simplified to 'index -= 2'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
					index = label.indexOf("@@Interface:");
					if (index > 0) {
						index = index - 2;
					} else index = label.length() - 2;
					String superClassName = ContextReader.readSimpleNameOfDataType(label.substring(0, index));
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
					mi.getPossibleReturnTypes().add(elements[0]);
					paraTypeStrs = new ArrayList<>();
					for (int i = 1, length = elements.length; i < length; i = i + 2) {
						paraTypeStrs.add(elements[i]);
					}
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
							mi.getPossibleReturnTypes().add(elements[0]);
							paraTypeStrs = new ArrayList<>();
							for (int i = 1, length = elements.length; i < length; i = i + 2) {
								paraTypeStrs.add(elements[i]);
							}
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		List<String> parameterTypes = new ArrayList<>();
		String[] paraArray = paraStr.split(splitStr);
		for (int i = 0, length = paraArray.length; i < length; i = i + 2) {
			parameterTypes.add(ContextReader.readType(paraArray[i]));
		}
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/edu/lu/uni/serval/jdt/tree/TreeContext.java`
#### Snippet
```java
        public static final Pattern valid_id = Pattern.compile("[a-zA-Z0-9_]*");

        public void addAll(Marshallers<E> other) {
//            addAll(other.serializers);
        }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/jdt/tree/AssociationMap.java`
#### Snippet
```java
    public Iterator<Entry<String, Object>> iterator() {
        return new Iterator<Entry<String, Object>>() {
            int currentPos = 0;
            @Override
            public boolean hasNext() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/info/Patch.java`
#### Snippet
```java
	private String buggyCodeStr = "";
	private String fixedCodeStr1 = "";
	private String fixedCodeStr2 = null;
	private int buggyCodeStartPos = -1;
	/*
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java

	private File javaFile;
	private CompilationUnit unit = null;
	private List<Pair<ITree, String>> suspiciousCode = new ArrayList<>();
	
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
	
	private List<String> classNamesInSamePackage = new ArrayList<>();
	private String packageName = null;
	private Map<ITree, String> classNames = new HashMap<>();
	public List<String> importDeclarations = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java
	public static String lastFixPattern = "";
	public static long generatePatchTime = 0;
	public static long validatePatchTime = 0;
	public static String bugId = "";

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java
	public static String outputPath = "OUTPUT/";
	public static boolean NO_GIT = false;
	public static boolean ShellVerbose = false;
	public static boolean testVerbose = false;
	public static String testOutputAdapter_for="bears";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java
	public static String faultLocalizationMetric = "Ochiai";
	public static String outputPath = "OUTPUT/";
	public static boolean NO_GIT = false;
	public static boolean ShellVerbose = false;
	public static boolean testVerbose = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java
	public static String testOutputAdapter_for="bears";
	public static String bugDataSet = "bears"; // d4j or bears
	public static boolean run_tests_locally = false;

	public static List<String> additionalDepsFromCmdLine = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java
	public static long dicttime = 0;
	public static String lastFixPattern = "";
	public static long generatePatchTime = 0;
	public static long validatePatchTime = 0;
	public static String bugId = "";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java
	public static final long TEST_SHELL_RUN_TIMEOUT = 600L;

	public static int dictionarysize = 0;
	public static Map<String, Integer> freq = new HashMap<String, Integer>();
	public static long dicttime = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java
	public static boolean NO_GIT = false;
	public static boolean ShellVerbose = false;
	public static boolean testVerbose = false;
	public static String testOutputAdapter_for="bears";
	public static String bugDataSet = "bears"; // d4j or bears
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java
	public static int dictionarysize = 0;
	public static Map<String, Integer> freq = new HashMap<String, Integer>();
	public static long dicttime = 0;
	public static String lastFixPattern = "";
	public static long generatePatchTime = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/context/Field.java`
#### Snippet
```java
	private String dataType;
	private String varName;
	private boolean isStatic = false;
	
	public Field(String className, ModifierType modifier, String dataType, String varName,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	
	// 0: failed to fix the bug, 1: succeeded to fix the bug. 2: partially succeeded to fix the bug.
	public int fixedStatus = 0;
	public String dataType = "";
	protected int patchId = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	public int fixedStatus = 0;
	public String dataType = "";
	protected int patchId = 0;
	protected int comparablePatches = 0;
//	private TimeLine timeLine;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	protected String fullBuggyProjectPath;  // The full path of the local buggy project.
	public String outputPath = "";          // Output path for the generated patches.
	public File suspCodePosFile = null;     // The file containing suspicious code positions localized by FL tools.
	protected DataPreparer dp;              // The needed data of buggy program for compiling and testing.
	
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	public String dataType = "";
	protected int patchId = 0;
	protected int comparablePatches = 0;
//	private TimeLine timeLine;
	protected Dictionary dic = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	protected Dictionary dic = null;
	
	public boolean isTestFixPatterns = false;
	
	public AbstractFixer(String path, String bugIdStr, ArrayList<String> pathsFromCmdLine) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	public int minErrorTest;                // Number of failed test cases before fixing.
	public int minErrorTest_;
	protected int minErrorTestAfterFix = 0; // Number of failed test cases after fixing
	protected String fullBuggyProjectPath;  // The full path of the local buggy project.
	public String outputPath = "";          // Output path for the generated patches.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	protected int comparablePatches = 0;
//	private TimeLine timeLine;
	protected Dictionary dic = null;
	
	public boolean isTestFixPatterns = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
	 */
	
	private boolean isArrayAccess = false;
	
	public RangeChecker(boolean isArrayAccess) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ConditionalExpressionMutator.java`
#### Snippet
```java
	 */
	
	private int type = 0;
	public ConditionalExpressionMutator(int type) {
		this.type = type;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	 * 8: DLSDeadLocalStoreInReturn
	 */
	private int operatorType = 0;
	
	public OperatorMutator(int operatorType) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
		 * a || b -> a && b;
		 */
		private boolean isConditionalOperator = false;
		private List<ITree> triedInfixExps = new ArrayList<>();
		
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ChangeCondition.java`
#### Snippet
```java
public abstract class ChangeCondition extends FixTemplate {

	private boolean ignoreOtherMethods = false; // FIXME do not ignore other methods.
	
	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		private List<ITree> differentParaMethods = null;  // add or delete parameter(s);
		private List<Method> canBeReplacedMethods = null; // replace method name;
		private List<Method> diffParameterMethods = null; // add or delete parameter(s);

		public String getCodePath() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	}
	
	private Map<String, List<String>> couldBeReplacedMethods = null; // replace method name.
	private List<ITree> differentParaMethods = null;   // add or delete parameter(s);
	
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		private ITree codeAst;
		private Map<String, List<String>> couldBeReplacedMethods = null; // replace method name.
		private List<ITree> differentParaMethods = null;  // add or delete parameter(s);
		private List<Method> canBeReplacedMethods = null; // replace method name;
		private List<Method> diffParameterMethods = null; // add or delete parameter(s);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		private List<List<String>> parameterTypes = new ArrayList<>();
		private ITree codeAst;
		private Map<String, List<String>> couldBeReplacedMethods = null; // replace method name.
		private List<ITree> differentParaMethods = null;  // add or delete parameter(s);
		private List<Method> canBeReplacedMethods = null; // replace method name;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		private Map<String, List<String>> couldBeReplacedMethods = null; // replace method name.
		private List<ITree> differentParaMethods = null;  // add or delete parameter(s);
		private List<Method> canBeReplacedMethods = null; // replace method name;
		private List<Method> diffParameterMethods = null; // add or delete parameter(s);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	ITree classDeclarationAst = null;
	String packageName = "";
	String className = null;
	
	protected List<MethodInvocationExpression> identifySuspiciousMethodInvocations() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	
	private Map<String, List<String>> couldBeReplacedMethods = null; // replace method name.
	private List<ITree> differentParaMethods = null;   // add or delete parameter(s);
	
	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	
	protected Map<ITree, Integer> suspMethodInvocations = new HashMap<>();
	ITree classDeclarationAst = null;
	String packageName = "";
	String className = null;
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/edu/lu/uni/serval/tbar/info/Patch.java`
#### Snippet
```java
 *
 */
public class Patch {
	
	private String buggyCodeStr = "";
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	}
	
	public class SuspCodeNode {

		public File javaBackup;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
	}
	
	class SuspNullExpStr implements Comparable<SuspNullExpStr> {
		public String expStr;
		public Integer startPos;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `ITree`
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java
import java.util.Map.Entry;

public class Tree extends AbstractTree implements ITree {

    private int type;     // int value of its AST node type.
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-27-23-12-11.081.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer b` may be declared as 'StringBuilder'
in `src/main/java/edu/lu/uni/serval/jdt/tree/AbstractTree.java`
#### Snippet
```java
   	public String getChildrenLabels() {
       	// Rewritten by kui.
       	StringBuffer b = new StringBuffer();
       	for (ITree child: getChildren())
       		if (!"".equals(child.getLabel()))
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
			if (fileData.length() > 0)
				return fileData.toString().toCharArray();
			else return new char[0];
		}
	}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/ClassloaderFinder.java`
#### Snippet
```java
				classes.addAll(new SourceFolderFinder().getClassesLoc(new File(url.getPath()), null));
		}
		return classes.toArray(new String[0]);
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/SourceFolderFinder.java`
#### Snippet
```java
	@Override
	public String[] getClasses() {
		return getClassesLoc(new File(srcFolder), null).toArray(new String[0]);
	}

```

## RuleId[ruleID=UnusedAssignment]
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
Variable `operatorType` initializer `0` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
	 * 8: DLSDeadLocalStoreInReturn
	 */
	private int operatorType = 0;
	
	public OperatorMutator(int operatorType) {
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

## RuleId[ruleID=ConstantValue]
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
Value `isBuggyProject` is always 'false'
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
Value `isBuggyProject` is always 'false'
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
Condition `paraTypeStrs == null` is always `false`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			// Read parameter data types.
			List<String> paraTypeStrs = readMethodParameterTypes(parameters);
			if (paraTypeStrs == null) continue; // Generate ERROR when reading its parameter types.
			
			// Identify possible return types of the method invocations.
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

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
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

## RuleId[ruleID=IOResource]
### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java

    Reader inputString = new StringReader(testResult);
    BufferedReader br = new BufferedReader(inputString);


```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java

        Reader inputString = new StringReader(testResult);
        BufferedReader br = new BufferedReader(inputString);


```

## RuleId[ruleID=RedundantOperationOnEmptyContainer]
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

## RuleId[ruleID=RedundantLengthCheck]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Priority` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
    );

    public class Priority {
        public static final int MAXIMUM = 0;
        public static final int HIGH = 25;
```

### UtilityClassWithoutPrivateConstructor
Class `AssertUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/AssertUtils.java`
#### Snippet
```java
package edu.lu.uni.serval.tbar.utils;

public class AssertUtils {

	public static boolean isAssertLine(String lineString, String code){
```

### UtilityClassWithoutPrivateConstructor
Class `SetUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/SetUtils.java`
#### Snippet
```java
import java.util.Map;

public class SetUtils {

	public static <T> void addToMap(Map<String, List<T>> dictionary, String key, T t) {
```

### UtilityClassWithoutPrivateConstructor
Class `LineUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/LineUtils.java`
#### Snippet
```java
package edu.lu.uni.serval.tbar.utils;

public class LineUtils {

	public static boolean isLineInFailBlock(String code, int lineNum){
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
 */

public class Main {

	public static long totalstartTime;
```

### UtilityClassWithoutPrivateConstructor
Class `JavaLibrary` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/JavaLibrary.java`
#### Snippet
```java
import java.util.List;

public class JavaLibrary {

	public static URL[] classPathFrom(String classpath) {
```

### UtilityClassWithoutPrivateConstructor
Class `Checker` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/Checker.java`
#### Snippet
```java
package edu.lu.uni.serval.tbar.utils;

public class Checker {
	
	public static boolean withBlockStatement(String statementType) {
```

### UtilityClassWithoutPrivateConstructor
Class `ASTNodeMap` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/ASTNodeMap.java`
#### Snippet
```java
import java.util.Map;

public class ASTNodeMap {
	
	public static Map<Integer, String> map;
```

### UtilityClassWithoutPrivateConstructor
Class `JunitRunner` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/JunitRunner.java`
#### Snippet
```java
import org.junit.runner.notification.Failure;

public class JunitRunner {

    public static void main(String... args) throws ClassNotFoundException {
```

### UtilityClassWithoutPrivateConstructor
Class `PathUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/PathUtils.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;

public class PathUtils {

	public static ArrayList<String> getSrcPath(String bugProject) {
```

### UtilityClassWithoutPrivateConstructor
Class `ShellUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
import edu.lu.uni.serval.tbar.config.Configuration;

public class ShellUtils {

	public static String shellRun(List<String> asList, String buggyProject, int type) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `Configuration` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/config/Configuration.java`
#### Snippet
```java


public class Configuration {


```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
import edu.lu.uni.serval.tbar.config.Configuration;

public class FileUtils {

	public static String getMD5(String s) {
```

### UtilityClassWithoutPrivateConstructor
Class `CodeUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/CodeUtils.java`
#### Snippet
```java
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class CodeUtils {

	public static String getPackageName(String code) {
```

### UtilityClassWithoutPrivateConstructor
Class `FileHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
import java.util.List;

public class FileHelper {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `TestUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java


public class TestUtils {

/*
```

### UtilityClassWithoutPrivateConstructor
Class `ContextReader` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
import edu.lu.uni.serval.tbar.utils.SetUtils;

public class ContextReader {
	
	/**
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
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

## RuleId[ruleID=UnnecessarySemicolon]
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
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
		private List<ITree> triedInfixExps = new ArrayList<>();
		
		public ConditionalExpressionOperatorMutator() {};
		@SuppressWarnings("unused")
		public ConditionalExpressionOperatorMutator(boolean isConditionalOperator) {
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
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
						for (ITree subChild : subChildren) {
							if (readVar) {
								String varName_ = subChild.getChild(0).getLabel();;
								if (varName.equals(varName_)) return varType;
							} else if (!Checker.isModifier(subChild.getType())) {
```

## RuleId[ruleID=DataFlowIssue]
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
		File[] files = file.listFiles();
		
		for (File f : files) {
			if (f.isFile()) {
				if (f.toString().endsWith(type)) {
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

## RuleId[ruleID=StringOperationCanBeSimplified]
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

## RuleId[ruleID=CatchMayIgnoreException]
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

## RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=InnerClassMayBeStatic]
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
Inner class `LongestCommonSubsequence` may be 'static'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
	private Map<String, ITree> sameValueSuspVarTrees = new HashMap<>();
	
	private class LongestCommonSubsequence {

		public Double similarity(String str1, String str2) {
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
Inner class `MethodInvocationExpression` may be 'static'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
	}
	
	public class MethodInvocationExpression {
		
		/*
```

## RuleId[ruleID=SwitchStatementWithConfusingDeclaration]
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

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `process` accessed in synchronized context
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        try {
            String s;
            in = new BufferedInputStream(process.getInputStream());
            br = new BufferedReader(new InputStreamReader(in));
            while ((s = br.readLine()) != null && s.length()!=0) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `process` accessed in synchronized context
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
                }
            }
            in = new BufferedInputStream(process.getErrorStream());
            br = new BufferedReader(new InputStreamReader(in));
            while ((s = br.readLine()) != null && s.length()!=0) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `process` accessed in synchronized context
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
                }
            }
            process.destroy();
        }
        FileHelper.outputToFile("logs/compile_log.log", sb, true);
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/JdtVisitor.java`
#### Snippet
```java
        result = result.replace('*', ' ').trim();

        return !result.equals("");
    }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
	public static String getTestFunctionCodeFromCode(String code, String targetFunctionName, String testSrcPath) {
		String result = getTestFunctionCodeFromCode(code, targetFunctionName);
		if (result.equals("")) {
			if (code.contains(" extends ")) {
				String extendsClass = code.split(" extends ")[1].substring(0, code.split(" extends ")[1].indexOf("{"));
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
				String extendsClass = code.split(" extends ")[1].substring(0, code.split(" extends ")[1].indexOf("{"));
				String className = CodeUtils.getClassNameOfImportClass(code, extendsClass);
				if (className.equals("")) {
					className = CodeUtils.getPackageName(code) + "." + extendsClass;
				}
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
				}
				String extendsCode = FileUtils.getCodeFromFile(testSrcPath, className.trim());
				if (!extendsCode.equals("")) {
					return getTestFunctionCodeFromCode(extendsCode, targetFunctionName, testSrcPath);
				}
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
			return methodString;
		}
		while (methodString.split("\n")[0].trim().equals("") || methodString.split("\n")[0].trim().startsWith("//")) {
			methodString = methodString.substring(methodString.indexOf("\n") + 1);
		}
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ClassCastChecker.java`
#### Snippet
```java
			
			int endPosition = this.suspCodeEndPos;
			if (!"".equals(varName)) { // statements related to variable.
				endPosition = ContextReader.identifyRelatedStatements(suspStmtTree, varName, this.suspCodeEndPos);
			}
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		while (true) {
			if (Checker.isTypeDeclaration(parent.getType())) {
				className = "".equals(className) ? ContextReader.readClassName(parent) : ContextReader.readClassName(parent) + "." + className;
				break;
			}
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
            	SuspiciousPosition sp = new SuspiciousPosition();
            	sp.classPath = elements[0];
            	sp.lineNumber = Integer.valueOf(elements[1]);
            	suspiciousCodeList.add(sp);
            }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	    				if (lineStr.contains("-")) {
	    					String[] subPos = lineStr.split("-");
	    					for (int line = Integer.valueOf(subPos[0]), endLine = Integer.valueOf(subPos[1]); line <= endLine; line ++) {
	    						SuspiciousPosition sp = new SuspiciousPosition();
	    		            	sp.classPath = classPath;
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	    				if (lineStr.contains("-")) {
	    					String[] subPos = lineStr.split("-");
	    					for (int line = Integer.valueOf(subPos[0]), endLine = Integer.valueOf(subPos[1]); line <= endLine; line ++) {
	    						SuspiciousPosition sp = new SuspiciousPosition();
	    		            	sp.classPath = classPath;
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	    					SuspiciousPosition sp = new SuspiciousPosition();
	    	            	sp.classPath = classPath;
	    	            	sp.lineNumber = Integer.valueOf(lineStr);
	    	            	suspiciousCodeList.add(sp);
	    				}
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
            	SuspiciousPosition sp = new SuspiciousPosition();
            	sp.classPath = elements[0];
            	sp.lineNumber = Integer.valueOf(elements[1]);
            	suspiciousCodeList.add(sp);
            }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
            	SuspiciousPosition sp = new SuspiciousPosition();
            	sp.classPath = elements[0];
            	sp.lineNumber = Integer.valueOf(elements[1]);
            	suspiciousCodeList.add(sp);
            }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ICASTIdivCastToDouble.java`
#### Snippet
```java
							if (!leftHandExpLabel.endsWith("f") && !leftHandExpLabel.endsWith("d") && !leftHandExpLabel.endsWith("l")) {
								if (!child.getChild(2).getLabel().startsWith("(double)") && !child.getChild(2).getLabel().startsWith("(float)")) {
									buggyExps.add(new Pair<ITree, Integer>(child, Integer.valueOf(2)));
								}
							}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ICASTIdivCastToDouble.java`
#### Snippet
```java
							if (!rightHandExpLabel.endsWith("f") && !rightHandExpLabel.endsWith("d") && !rightHandExpLabel.endsWith("l")) {
								if (!child.getLabel().startsWith("(double)") && !child.getLabel().startsWith("(float)")) {
									buggyExps.add(new Pair<ITree, Integer>(child, Integer.valueOf(1)));
								}
							}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/ICASTIdivCastToDouble.java`
#### Snippet
```java
							if (!child.getLabel().startsWith("(double)") && !child.getLabel().startsWith("(float)") &&
									!child.getChild(2).getLabel().startsWith("(double)") && !child.getChild(2).getLabel().startsWith("(float)")) {
								buggyExps.add(new Pair<ITree, Integer>(child, Integer.valueOf(3)));
							}
						}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
	private Pair<String, Boolean> identifyParentContext(ITree suspCodeTree) {
		ITree parent = suspCodeTree.getParent();
		Boolean isLoopStmt = Boolean.valueOf(false);
		while (true) {
			if (parent == null) return null;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
					(Checker.isForStatement(type) || Checker.isEnhancedForStatement(type)
					|| Checker.isWhileStatement(type) || Checker.isDoStatement(type))) {
				isLoopStmt = Boolean.valueOf(true);
			} else if (Checker.isMethodDeclaration(type)) break;
			parent = parent.getParent();
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
		private Pair<String, Boolean> identifyParentContext(ITree suspCodeTree) {
			ITree parent = suspCodeTree.getParent();
			Boolean isLoopStmt = Boolean.valueOf(false);
			while (true) {
				if (parent == null) return null;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
						(Checker.isForStatement(type) || Checker.isEnhancedForStatement(type)
						|| Checker.isWhileStatement(type) || Checker.isDoStatement(type))) {
					isLoopStmt = Boolean.valueOf(true);
				} else if (Checker.isMethodDeclaration(type)) break;
				parent = parent.getParent();
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
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

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
			};
        } catch (NoSuchMethodException e) {
            System.out.println(Arrays.toString(clazz.getConstructors()));
            throw new RuntimeException(String.format("This is a static bug. Constructor %s(%s) not found",
                    clazz.getName(), Arrays.toString(signature)), e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java

		if (args.length < 3) {
			System.out.println("Arguments: \n" 
					+ "\t<Bug_Data_Path>: the directory of checking out Defects4J bugs. \n"
					+ "\t<Bug_ID>: bug id of each Defects4J bug, such as Chart_1. \n"
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
			catch(Exception e)
			{
				System.out.println("Could not find additional classpath file:"+additionclasspaths);
				System.exit(0);
			}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
			if(Configuration.testVerbose)
			{ 
			System.out.println("Failed to defects4j compile bug " + bugIdStr);
			}
			return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("FixPattern: "+key+" PatchCandidates: "+value); //key: org.apache.commons.lang3.ClassUtils
			totalPatchCandidates+=value;
			
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
			
		}
		System.out.println("Last fixpattern: "+Configuration.lastFixPattern);
		System.out.println("Total patch candidates: "+totalPatchCandidates);
		System.out.println("Dictionary size: "+Configuration.dictionarysize);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		}
		System.out.println("Last fixpattern: "+Configuration.lastFixPattern);
		System.out.println("Total patch candidates: "+totalPatchCandidates);
		System.out.println("Dictionary size: "+Configuration.dictionarysize);
		System.out.println("Dictionary time: "+((double) Configuration.dicttime / 1_000_000_000));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		System.out.println("Last fixpattern: "+Configuration.lastFixPattern);
		System.out.println("Total patch candidates: "+totalPatchCandidates);
		System.out.println("Dictionary size: "+Configuration.dictionarysize);
		System.out.println("Dictionary time: "+((double) Configuration.dicttime / 1_000_000_000));
		long totalEndTime = System.nanoTime() - totalstartTime;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		System.out.println("Total patch candidates: "+totalPatchCandidates);
		System.out.println("Dictionary size: "+Configuration.dictionarysize);
		System.out.println("Dictionary time: "+((double) Configuration.dicttime / 1_000_000_000));
		long totalEndTime = System.nanoTime() - totalstartTime;
		System.out.println("Total time: "+((double) totalEndTime / 1_000_000_000)); 
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		System.out.println("Dictionary time: "+((double) Configuration.dicttime / 1_000_000_000));
		long totalEndTime = System.nanoTime() - totalstartTime;
		System.out.println("Total time: "+((double) totalEndTime / 1_000_000_000)); 
		System.out.println("generatePatchTime time: "+((double) Configuration.generatePatchTime / 1_000_000_000)); 
		System.out.println("validatePatchTime time: "+((double) Configuration.validatePatchTime / 1_000_000_000)); 
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		long totalEndTime = System.nanoTime() - totalstartTime;
		System.out.println("Total time: "+((double) totalEndTime / 1_000_000_000)); 
		System.out.println("generatePatchTime time: "+((double) Configuration.generatePatchTime / 1_000_000_000)); 
		System.out.println("validatePatchTime time: "+((double) Configuration.validatePatchTime / 1_000_000_000)); 
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		System.out.println("Total time: "+((double) totalEndTime / 1_000_000_000)); 
		System.out.println("generatePatchTime time: "+((double) Configuration.generatePatchTime / 1_000_000_000)); 
		System.out.println("validatePatchTime time: "+((double) Configuration.validatePatchTime / 1_000_000_000)); 
		}
			
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
		switch (fixedStatus) {
		case 0:
			System.out.println("Failed to fix bug " + bugIdStr);
			break;
		case 1:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
			break;
		case 1:
			System.out.println("Succeeded to fix bug " + bugIdStr);
			break;
		case 2:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/main/Main.java`
#### Snippet
```java
			break;
		case 2:
			System.out.println("Partial succeeded to fix bug " + bugIdStr);
			break;
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/JunitRunner.java`
#### Snippet
```java
        Result result = new JUnitCore().run(request);
        if (result.getFailureCount()>0){
            System.out.println("E");
        }
        System.out.println("<<");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/JunitRunner.java`
#### Snippet
```java
            System.out.println("E");
        }
        System.out.println("<<");
        List<Failure> failures = result.getFailures();
        for (Failure failure: failures){
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/JunitRunner.java`
#### Snippet
```java
        List<Failure> failures = result.getFailures();
        for (Failure failure: failures){
            System.out.println(failure.getMessage());
            System.out.println(failure.getDescription().toString());
            System.out.println(failure.getTrace());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/JunitRunner.java`
#### Snippet
```java
        for (Failure failure: failures){
            System.out.println(failure.getMessage());
            System.out.println(failure.getDescription().toString());
            System.out.println(failure.getTrace());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/JunitRunner.java`
#### Snippet
```java
            System.out.println(failure.getMessage());
            System.out.println(failure.getDescription().toString());
            System.out.println(failure.getTrace());
        }
        System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
                if(Configuration.ShellVerbose)
                {
                System.out.println(line);
                }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("ShellUtils.java - getShellOut() - Success excecuting shell process!");
                returnString=output.toString();
                //System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        Future<String> future = service.submit(new ReadShellProcess(process));
        String returnString = "";
        System.out.println("getShellOut1");
        try {

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        try {

            System.out.println("getShellOut2");


```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            }
                
                System.out.println("getShellOut3");

        } catch (InterruptedException e){
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        }
        finally {
            System.out.println("getShellOutFinally");

            shutdownProcess(service, process);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            shutdownProcess(service, process);
        }
        System.out.println("I SHELL OUT:"+returnString);
        return returnString;
	}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        if(Configuration.ShellVerbose)
        {
        System.out.println("Shell: Before fileOutputStream 1");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            if(Configuration.ShellVerbose)
            {    
            System.out.println("Shell: Before fileOutputStream 2");
            }
            outputStream = new FileOutputStream(batFile);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
                if(Configuration.ShellVerbose)
                {        
                System.out.println("arguments: "+arg);
                }
                outputStream.write(arg.getBytes());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        {

        System.out.println("Command to bash:");
        System.out.println(cmd);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java

        System.out.println("Command to bash:");
        System.out.println(cmd);
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (input != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
			return new String(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		} finally {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		for (Patch patch : patchCandidates) {

			System.out.println("***************************** TEST PATCH NO: "+counter+" OF: "+patchCandidates.size());
			counter++;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
					if(Configuration.testVerbose)
					{
					System.out.println(result);
					}
				}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
				{

				System.out.println("Results from tests:");
				System.out.println(results);
				}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java

				System.out.println("Results from tests:");
				System.out.println(results);
				}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
					log.info("Succeeded to fix the bug " + buggyProject + "====================");
					String patchStr = TestUtils.readPatch(this.fullBuggyProjectPath);
					System.out.println(patchStr);
					if (patchStr == null || !patchStr.startsWith("diff")) {
						FileHelper.outputToFile(Configuration.outputPath + this.dataType + "/FixedBugs/" + buggyProject + "/Patch_" + patchId + "_" + comparablePatches + ".txt",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		if (!new File(filePath).exists())
		{ 
			System.out.println("suspiciousJavaFile FILEPATH DO NOT EXIST");
			return null;
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
					if(Configuration.testVerbose)
					{
					System.out.println(testResult);
					}
					continue;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/" + this.metric + ".txt");
		if (!suspiciousFile.exists()) {
			System.out.println("Cannot find the suspicious code position file." + suspiciousFile.getPath());
			suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/" + this.metric.toLowerCase() + ".txt");
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		}
		if (!suspiciousFile.exists()) {
			System.out.println("Cannot find the suspicious code position file." + suspiciousFile.getPath());
			suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/All.txt");
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
	private boolean checkProjectDirectories() {
		if (!new File(classPath).exists()) {
			System.out.println("Class path: " + classPath + " does not exist!");
			System.exit(0);
			return false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
		}
		if (!new File(srcPath).exists()) {
			System.out.println("Source code path: " + srcPath + " does not exist!");
			System.exit(0);
			return false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
		}
		if (!new File(testClassPath).exists()) {
			System.out.println("Test class path: " + testClassPath + " does not exist!");
			System.exit(0);
			return false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
		}
		if (!new File(testSrcPath).exists()) {
			System.out.println("Test source path: " + testSrcPath + " does not exist!");
			System.exit(0);
			return false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			catch(Exception e)
			{
				System.out.println("Failed to excecute GZoltar");
				System.exit(1);
			}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			{
			long totalEndTimeGzoltar = System.nanoTime() - totalstartTimeGzoltar;
			System.out.println("Project: "+Configuration.bugId+" Total time GZoltar: "+((double) totalEndTimeGzoltar / 1_000_000_000)); 
			System.out.println("Stop execution, only measure GZoltar");
			System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			long totalEndTimeGzoltar = System.nanoTime() - totalstartTimeGzoltar;
			System.out.println("Project: "+Configuration.bugId+" Total time GZoltar: "+((double) totalEndTimeGzoltar / 1_000_000_000)); 
			System.out.println("Stop execution, only measure GZoltar");
			System.exit(0);
			}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java

			if (scns == null) continue;
			System.out.println("Number of suspicious code nodes: "+scns.size());

			for (SuspCodeNode scn : scns) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
				triedSuspNode.add(scn);

				System.out.println("suspiciousCode:");
				System.out.println(scn.suspCodeStr);
				
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java

				System.out.println("suspiciousCode:");
				System.out.println(scn.suspCodeStr);
				
				// Parse context information of the suspicious code.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/" + this.metric + ".txt");
		if (!suspiciousFile.exists()) {
			System.out.println("Cannot find the suspicious code position file." + suspiciousFile.getPath());
			suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/" + this.metric.toLowerCase() + ".txt");
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		}
		if (!suspiciousFile.exists()) {
			System.out.println("Cannot find the suspicious code position file." + suspiciousFile.getPath());
			suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/All.txt");
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		String addtoMap=tpString.substring(0,indexSort);
		Configuration.lastFixPattern=addtoMap;
		System.out.println("FixTemplate: "+addtoMap);

		ft.setSuspiciousCodeStr(scn.suspCodeStr);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		{

		System.out.println("patchandidates"+patchCandidates.size());
		
		//Measure number of patches per pattern
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if(Configuration.ShellVerbose)
            {
                System.out.println("XX javac output:");
                System.out.println(result);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {
                System.out.println("XX javac output:");
                System.out.println(result);
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        if(Configuration.testVerbose)
        {
            System.out.println(st); 
        }
        
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if(Configuration.testVerbose)
            {
            System.out.println(testClass);
            System.out.println(testIndividual);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {
            System.out.println(testClass);
            System.out.println(testIndividual);
            }
    
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if(Configuration.testVerbose)
            {
            System.out.println("XXXXXX Read failures");
            }
            readFailedtests=true;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if(Configuration.testVerbose)
            {
                System.out.println(testIndividualE);
                System.out.println(testClassE);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {
                System.out.println(testIndividualE);
                System.out.println(testClassE);
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if(Configuration.testVerbose)
            {
                System.out.println(testIndividualE);
                System.out.println(testClassE);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {
                System.out.println(testIndividualE);
                System.out.println(testClassE);
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if(Configuration.testVerbose)
            {
            System.out.println(testClass);
            System.out.println(testIndividual);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {
            System.out.println(testClass);
            System.out.println(testIndividual);
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {
    
            System.out.println("BUILD SUCESS - XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {

            System.out.println("BUILD FAILURE - XXXXXXXXXXXXXXXXXXXXXXXXXX");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
    {

    System.out.println("xx - sizeoferrortest: "+errorTestCmdLine.size());
    System.out.println("xx - sizeoffailtest: "+failedTestCmdLine.size());
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java

    System.out.println("xx - sizeoferrortest: "+errorTestCmdLine.size());
    System.out.println("xx - sizeoffailtest: "+failedTestCmdLine.size());
    }
    fileTestOutput.delete();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
    }
    catch(IOException e){
        System.out.println("xx - Fail to create file");
        return Integer.MAX_VALUE;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if(Configuration.testVerbose)
            {
                System.out.println(st); 
            }
    
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                if(Configuration.testVerbose)
                {
                    System.out.println(splittedStrings[0]);
                    System.out.println(splittedStrings[1]);
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                {
                    System.out.println(splittedStrings[0]);
                    System.out.println(splittedStrings[1]);
                }
    
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                if(Configuration.testVerbose)
                {
                    System.out.println("XX - FAILED TEST GET SUBJECT");
                }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                    if(Configuration.testVerbose)
                    {
                    System.out.println(testClass+"::"+testIndividual);
                    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                if(Configuration.testVerbose)
                {
                    System.out.println(splittedStringsE[0]);
                    System.out.println(splittedStringsE[1]);
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                {
                    System.out.println(splittedStringsE[0]);
                    System.out.println(splittedStringsE[1]);
                }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                if(Configuration.testVerbose)
                {
                    System.out.println(testIndividualE);
                    System.out.println(testClassE);
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                {
                    System.out.println(testIndividualE);
                    System.out.println(testClassE);
                }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                if(Configuration.testVerbose)
                {
                System.out.println(testIndividualE+"::"+testClassE);
                }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {
                buildSuccess=true;
                System.out.println("BUILD SUCESS - XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            }
            if(st.contains("BUILD FAILURE"))
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            if(st.contains("BUILD FAILURE"))
            {
                System.out.println("BUILD FAILURE - XXXXXXXXXXXXXXXXXXXXXXXXXX");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        }

        System.out.println("xx - sizeoferrortest:"+errorTestCmdLine.size());
        System.out.println("xx - sizeoffailtest:"+failedTestCmdLine.size());
        fileTestOutput.delete();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java

        System.out.println("xx - sizeoferrortest:"+errorTestCmdLine.size());
        System.out.println("xx - sizeoffailtest:"+failedTestCmdLine.size());
        fileTestOutput.delete();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
        }
        catch(IOException e){
            System.out.println("FAILFILECREATION");
            return Integer.MAX_VALUE;
        }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/jdt/visitor/JdtVisitor.java`
#### Snippet
```java

    private boolean checkEmptyJavaDoc(String doc) {
        String[] splittedDoc = doc.split("/\\*+\\s*");
        String result = "";
        for (String s : splittedDoc) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/jdt/visitor/JdtVisitor.java`
#### Snippet
```java
        }
        try {
            result = result.split("\\s*\\*/")[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            result = result.replace('/', ' ');
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/code/analyser/JavaCodeFileParser.java`
#### Snippet
```java
			return parameterTypes;
		} else {
			String argus = methodDeclarationLabel.substring(methodDeclarationLabel.indexOf("@@Argus:") + 8, methodDeclarationLabel.length() - 1).replace(" ", "");
			int expIndex = argus.indexOf("@@Exp:");
			if (expIndex > 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
		if (result.equals("")) {
			if (code.contains(" extends ")) {
				String extendsClass = code.split(" extends ")[1].substring(0, code.split(" extends ")[1].indexOf("{"));
				String className = CodeUtils.getClassNameOfImportClass(code, extendsClass);
				if (className.equals("")) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
		if (result.equals("")) {
			if (code.contains(" extends ")) {
				String extendsClass = code.split(" extends ")[1].substring(0, code.split(" extends ")[1].indexOf("{"));
				String className = CodeUtils.getClassNameOfImportClass(code, extendsClass);
				if (className.equals("")) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
	private static String getTestFunctionCodeFromCode(String code, String targetFunctionName) {
		if (code.contains("@Test")) {
			String[] tests = code.split("@Test");
			for (String test : tests) {
				if (test.contains("public void " + targetFunctionName + "()")) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
				if (test.contains("public void " + targetFunctionName + "()")) {
					if (test.contains("private void ")) {
						test = test.split("private void ")[0];
					}
					return test;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
	private static List<String> divideTestFunction(String code) {
		List<String> result = new ArrayList<String>();
		code = code.replaceAll("private void", "public void");
		String[] items = code.split("public void");
		for (int j = 1; j < items.length; j++) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
		List<String> result = new ArrayList<String>();
		code = code.replaceAll("private void", "public void");
		String[] items = code.split("public void");
		for (int j = 1; j < items.length; j++) {
			String item = items[j];
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			suspiciousClassName = suspiciousClassName.substring(0, suspiciousClassName.indexOf("$"));
		}
		String suspiciousJavaFile = suspiciousClassName.replace(".", "/") + ".java";
		
		suspiciousClassName = suspiciousJavaFile.substring(0, suspiciousJavaFile.length() - 5).replace("/", ".");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		String suspiciousJavaFile = suspiciousClassName.replace(".", "/") + ".java";
		
		suspiciousClassName = suspiciousJavaFile.substring(0, suspiciousJavaFile.length() - 5).replace("/", ".");
		
		String filePath = dp.srcPath + suspiciousJavaFile;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
	            	String classPath = elements[1];
	            	String shortSrcPath = dp.srcPath.substring(dp.srcPath.indexOf(this.buggyProject) + this.buggyProject.length() + 1);
	            	classPath = classPath.substring(shortSrcPath.length(), classPath.length() - 5).replace("/", ".");

	            	if (!buggyFileList.contains(classPath)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
                {

                    st = st.replace("Failed tests:","");


```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            {

                st = st.replace("Tests in error:","");

                String[] splittedStringsE = st.trim().split("\\(");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
				}
				if (classPath == null) continue;
				File fileName = new File(this.sourceCodePath + classPath.replace(".", "/") + ".java");
				if (!fileName.exists()) continue;
				Map<String, String> publicStaticFields = ContextReader.readPublicStaticFields(fileName);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixtemplate/FixTemplate.java`
#### Snippet
```java
				classPath = classPath.substring(0, classPath.lastIndexOf(sourceCodeFileName + ".")) + sourceCodeFileName;
			}
			File javaCodeFile = new File(this.sourceCodePath + classPath.replace(".", "/") + ".java");
			JavaCodeFileParser jcfp = new JavaCodeFileParser(javaCodeFile);
			dic.setAllFields(jcfp.fields);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
								|| "float".equals(varType) || "double".equals(varType) || "char".equals(varType) || "boolean".equals(varType)) continue;
					}
					if (this.getSuspiciousCodeStr().replace(" ", "").contains(var + "!=null") 
							|| this.getSuspiciousCodeStr().replace(" ", "").contains(var + "==null")) continue;
					// FindBugs NP_NULL_ON_SOME_PATH Patch 1. // NPEFix : S3
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
					}
					if (this.getSuspiciousCodeStr().replace(" ", "").contains(var + "!=null") 
							|| this.getSuspiciousCodeStr().replace(" ", "").contains(var + "==null")) continue;
					// FindBugs NP_NULL_ON_SOME_PATH Patch 1. // NPEFix : S3
					String fixedCodeStr1 = "if (" + var + " != null) {\n\t";
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
						ITree parentTree = suspCodeTree.getParent();
						if (Checker.isIfStatement(parentTree.getType())) {
							String parentLabel = parentTree.getLabel().replaceAll(" ", "");
							if (parentLabel.contains(varExp.replace(" ", "") + "!=null")) varExp = null;
						}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
						if (Checker.isIfStatement(parentTree.getType())) {
							String parentLabel = parentTree.getLabel().replaceAll(" ", "");
							if (parentLabel.contains(varExp.replace(" ", "") + "!=null")) varExp = null;
						}
						if (varExp != null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		}
		if ("this".equals(varType)) {
			path = this.sourceCodePath + this.packageName.replace(".", "/") + "/" + this.className + ".java";
		} else {
			path = identifyJavaFilePath(classDeclarationAst, varType);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			String childLabel = child.getLabel();
			if (Checker.isPackageDeclaration(childType)) { // package name.
				packageName = child.getLabel().replace(".", "/");
				path = this.sourceCodePath + packageName + "/" + varType + ".java";
				if (new File(path).exists()) break;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
				else {
					path = null;
					paths.add(this.sourceCodePath + child.getLabel().replace(".", "/") + "/");
				}
			} else if (Checker.isImportDeclaration(childType)) { // import declarations.
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			} else if (Checker.isImportDeclaration(childType)) { // import declarations.
				if (childLabel.endsWith("." + varType)) {
					path = this.sourceCodePath + child.getLabel().replace(".", "/") + ".java";
					if (!new File(path).exists()) path = null;
					break;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
					break;
				} else {
					paths.add(this.sourceCodePath + child.getLabel().replace(".", "/") + "/");
				}
			} else if (Checker.isTypeDeclaration(childType)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
									boolean isExisted = false;
									while (true) {
										if (new File(this.sourceCodePath + packageName.replace(".", "/") + ".java").exists()) {
											isExisted = true;
											break;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
									if (packageName.endsWith(fieldName)) {
										// defined static method.
										rootTree = new ASTGenerator().generateTreeForJavaFile(this.sourceCodePath + packageName.replace(".", "/") + ".java", TokenType.EXP_JDT);
										// TODO
									} else {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
									} else {
										// defined field.
										rootTree = new ASTGenerator().generateTreeForJavaFile(this.sourceCodePath + packageName.replace(".", "/") + ".java", TokenType.EXP_JDT);
										rootTree = findClassTree(rootTree, dataType);
										if (rootTree == null) continue;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		String packageName = null;
		if (Checker.isPackageDeclaration(importDeclarations.get(0).getType())) {
			packageName = importDeclarations.get(0).getLabel().trim().replace(".", "/");
		}
		if (packageName != null && new File(srcCodePath + packageName + "/" + className + ".java").exists()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
					String importLabel = importDec.getLabel().trim();
					if (importLabel.endsWith("." + className)) {
						superClassPath = srcCodePath + importLabel.replace(".", "/") + ".java";
						break;
					}
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return asTree;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return asTree;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return asTree;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/AST/ASTGenerator.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return asTree;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/jdt/tree/hash/HashUtils.java`
#### Snippet
```java
            return byteArrayToInt(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return ITree.NO_VALUE;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
    
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        } catch (InterruptedException e){
            future.cancel(true);
            e.printStackTrace();
            shutdownProcess(service, process);
            return "";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        } catch (TimeoutException e){
            future.cancel(true);
            e.printStackTrace();
            shutdownProcess(service, process);
            return "";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
        } catch (ExecutionException e){
            future.cancel(true);
            e.printStackTrace();
            shutdownProcess(service, process);
            return "";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/ShellUtils.java`
#### Snippet
```java
	        process.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        process.destroy();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(bw);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(bis);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(bw);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			Files.copy(scn.classBackup.toPath(), scn.targetClassFile.toPath());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		} catch (StringIndexOutOfBoundsException e) {
			log.debug(exactBuggyCodeStartPos + " ==> " + exactBuggyCodeEndPos + " : " + javaCode.length());
			e.printStackTrace();
			buggyCode = "===StringIndexOutOfBoundsException===";
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			Files.copy(targetClassFile.toPath(), classBackup.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
        
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
            fileReader.close();
        }catch (Exception e){
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/TestFinder.java`
#### Snippet
```java
						}
					} catch (ClassNotFoundException cnfExp2) {
						cnfExp2.printStackTrace();
					} catch (NoClassDefFoundError ncefErr) {
					}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
            fileReader.close();
        }catch (Exception e){
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
            fileReader.close();
        }catch (Exception e){
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			reader.close();
        }catch (Exception e){
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            return result.trim();
        } catch (IOException e){
        	e.printStackTrace();
            return "";
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            return result.trim();
        } catch (IOException e){
        	e.printStackTrace();
            return "";
        }
```

## RuleId[ruleID=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import edu.lu.uni.serval.jdt.tree.hash.HashUtils;`
in `src/main/java/edu/lu/uni/serval/jdt/tree/hash/RollingHashGenerator.java`
#### Snippet
```java

import edu.lu.uni.serval.jdt.tree.ITree;
import edu.lu.uni.serval.jdt.tree.hash.HashUtils;

public abstract class RollingHashGenerator implements HashGenerator {
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractRawTokenJdtVisitor()` of an abstract class should not be declared 'public'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/AbstractRawTokenJdtVisitor.java`
#### Snippet
```java
public abstract class AbstractRawTokenJdtVisitor extends AbstractJdtVisitor {

    public AbstractRawTokenJdtVisitor() {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdtVisitor()` of an abstract class should not be declared 'public'
in `src/main/java/edu/lu/uni/serval/jdt/visitor/AbstractJdtVisitor.java`
#### Snippet
```java
    private Deque<ITree> trees = new ArrayDeque<>();

    public AbstractJdtVisitor() {
        super(true);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFixer()` of an abstract class should not be declared 'public'
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
	public boolean isTestFixPatterns = false;
	
	public AbstractFixer(String path, String bugIdStr, ArrayList<String> pathsFromCmdLine) {
		this.path = path;
		//this.buggyProject = projectName + "_" + bugId;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `b`
in `src/main/java/edu/lu/uni/serval/jdt/tree/hash/HashUtils.java`
#### Snippet
```java
            if ((b & 1) != 0)
                result *= a;
            b >>= 1;
            a *= a;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `src/main/java/edu/lu/uni/serval/jdt/tree/hash/HashUtils.java`
#### Snippet
```java
                result *= a;
            b >>= 1;
            a *= a;
        }
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `lineString`
in `src/main/java/edu/lu/uni/serval/tbar/utils/AssertUtils.java`
#### Snippet
```java

	public static boolean isAssertLine(String lineString, String code){
        lineString = lineString.trim();
        // Comments
        if (lineString.startsWith("//")){
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
	public static String getFileAddressOfClass(String classPath, String className) {
		if (className.contains("<") && className.contains(">")) {
			className = className.substring(0, className.indexOf("<"));
		}
		return classPath.trim() + System.getProperty("file.separator")
```

### AssignmentToMethodParameter
Assignment to method parameter `code`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
	private static List<String> divideTestFunction(String code) {
		List<String> result = new ArrayList<String>();
		code = code.replaceAll("private void", "public void");
		String[] items = code.split("public void");
		for (int j = 1; j < items.length; j++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
	public static String getFileAddressOfJava(String srcPath, String className) {
		if (className.contains("<") && className.contains(">")) {
			className = className.substring(0, className.indexOf("<"));
		}
		return srcPath.trim() + System.getProperty("file.separator")
```

### AssignmentToMethodParameter
Assignment to method parameter `methodName`
in `src/main/java/edu/lu/uni/serval/tbar/utils/CodeUtils.java`
#### Snippet
```java

	private static List<MethodDeclaration> getMethod(String code, String methodName, CompilationUnit unit) {
		methodName = methodName.trim();
		List<MethodDeclaration> result = new ArrayList<>();
		List<MethodDeclaration> allMethods = getAllMethod(code, true, unit);
```

### AssignmentToMethodParameter
Assignment to method parameter `methodStartLine`
in `src/main/java/edu/lu/uni/serval/tbar/utils/CodeUtils.java`
#### Snippet
```java
		int assertStartLine = 0;
		for (String lineString : methodCode.split("\n")) {
			methodStartLine++;
			if (bracket != 0) {
				bracket += countChar(lineString, '(');
```

### AssignmentToMethodParameter
Assignment to method parameter `writer`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (writer != null) {
				writer.close();
				writer = null;
			}
		} catch (IOException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `bis`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (bis != null) {
				bis.close();
				bis = null;
			}
		} catch (IOException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `bw`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			if (bw != null) {
				bw.close();
				bw = null;
			}
		} catch (IOException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/edu/lu/uni/serval/tbar/dataprepare/DataPreparer.java`
#### Snippet
```java
    public DataPreparer(String path){
        if (!path.endsWith("/")){
            path += "/";
        }
        buggyProjectParentPath = path;
```

### AssignmentToMethodParameter
Assignment to method parameter `needsPrivateMethods`
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
			methods = new ArrayList<>();
		}
		if (!needsProtectedMethods) needsPrivateMethods = false;
		
		for (int index = methods.size() - 1; index >= 0; index --) {
```

### AssignmentToMethodParameter
Assignment to method parameter `suspVarName`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/VariableReplacer.java`
#### Snippet
```java
		List<Pair<String, Double>> similarVarPairs = new ArrayList<>();
		int index = suspVarName.lastIndexOf(".");
		if (index >= 0) suspVarName = suspVarName.substring(index + 1);
		for (String var1 : sameTypeVars) {
			String var = var1;
```

### AssignmentToMethodParameter
Assignment to method parameter `suspCodeTree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
			if (Checker.isMethodDeclaration(parent.getType())) break;
			if (Checker.isTypeDeclaration(parent.getType())) break;
			suspCodeTree = parent;
			parent = parent.getParent();
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `suspExpTree`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/OperatorMutator.java`
#### Snippet
```java
				if (startPos1 > startPos2) {
					ITree _suspExpTree = suspExpTree;
					suspExpTree = anotherSuspExpTree;
					anotherSuspExpTree = _suspExpTree;
					int _startPos = startPos1;
```

### AssignmentToMethodParameter
Assignment to method parameter `varType`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		if (constructorIndex > 0) {
			isConstructor = true;
			varType = varType.substring(0, constructorIndex);
		}
		int superIndex = varType.indexOf("+Super");
```

### AssignmentToMethodParameter
Assignment to method parameter `varType`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		int superIndex = varType.indexOf("+Super");
		if (superIndex > 0) {
			varType = varType.substring(0, superIndex);
			isSuperClass = true;
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `classDeclarationAst`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			}
			if (!new File(path).exists()) return null;
			classDeclarationAst = new ASTGenerator().generateTreeForJavaFile(path, TokenType.EXP_JDT);
			List<ITree> children = classDeclarationAst.getChildren();
			classDeclarationAst = children.get(children.size() - 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `classDeclarationAst`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			classDeclarationAst = new ASTGenerator().generateTreeForJavaFile(path, TokenType.EXP_JDT);
			List<ITree> children = classDeclarationAst.getChildren();
			classDeclarationAst = children.get(children.size() - 1);
		}
		
```

### AssignmentToMethodParameter
Assignment to method parameter `classDeclarationAst`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			if (classDeclarationAst == null) break;
			if (!Checker.isCompilationUnit(classDeclarationAst.getType())) {
				classDeclarationAst = classDeclarationAst.getParent();
			} else break;
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `codeAst`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
				}
				
				codeAst = codeAst.getParent();
				if (codeAst == null) break;
			}
```

### AssignmentToMethodParameter
Assignment to method parameter `codeAst`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
				}
				
				codeAst = codeAst.getParent();
				if (codeAst == null) break;
			}
```

### AssignmentToMethodParameter
Assignment to method parameter `codeAst`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			}
			
			codeAst = codeAst.getParent();
			if (codeAst == null) break;
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			if (index == 0) {
				while (index == 0) {
					className = className.substring(className.indexOf(">") + 1).trim();
					index = className.indexOf(">");
				}
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
				if (index == -1) index = className.length();
			}
			className = className.substring(0, index);
		}
		index = className.lastIndexOf(".");
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		index = className.lastIndexOf(".");
		if (index != -1) { // && returnType.startsWith("java.")) {
			className = className.substring(index + 1);
		}

```

### AssignmentToMethodParameter
Assignment to method parameter `endPosition`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
				boolean isRelatedStmt = containsVar(peerStmt, varNames);
				if (isRelatedStmt) {
					endPosition = peerStmt.getPos() + peerStmt.getLength();
					int peerStmtType = peerStmt.getType();
					if (Checker.isVariableDeclarationStatement(peerStmtType) ||
```

### AssignmentToMethodParameter
Assignment to method parameter `codeAst`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			}
			
			codeAst = parentTree;
			parentTree = parentTree.getParent();
			if (parentTree == null) break;
```

## RuleId[ruleID=UnnecessaryContinue]
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

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/tree/AssociationMap.java`
#### Snippet
```java
        int idx = keys.indexOf(key);
        if (idx == -1)
            return null;
        return values.get(idx);
    }
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/tree/AssociationMap.java`
#### Snippet
```java
            keys.add(key);
            values.add(value);
            return null;
        }
        return values.set(idx, value);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/tree/AssociationMap.java`
#### Snippet
```java
        int idx = keys.indexOf(key);
        if (idx == -1)
            return null;
        if (idx == keys.size() - 1) {
            keys.remove(idx);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java
        if (value == null) {
            if (metadata == null)
                return null;
            else
                return metadata.remove(key);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/tree/Tree.java`
#### Snippet
```java
    public Object getMetadata(String key) {
        if (metadata == null)
            return null;
        return metadata.get(key);
    }
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
            if (e.handle(key))
                return e;
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
                return factory.newInstance(args);
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
            if (e.id.equals(id))
                return e;
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
        if (entry != null)
            return entry.factory;
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
        Entry entry = findEntry(key);
        if (entry == null)
            return null;
        return entry;
    }
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
						return ctor.newInstance(args);
					} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						return null;
					}
				}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
            if (e.clazz.equals(aClass))
                return e;
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/generator/Registry.java`
#### Snippet
```java
        if (factory != null)
            return factory.instantiate(args);
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/tree/AbstractTree.java`
#### Snippet
```java
        @Override
        public Object setMetadata(String key, Object value) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/jdt/tree/AbstractTree.java`
#### Snippet
```java
        @Override
        public Object getMetadata(String key) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/SuspiciousCodeParser.java`
#### Snippet
```java
	private ITree traverseParentNode(ITree tree) {
		ITree parent = tree.getParent();
		if (parent == null) return null;
		if (!isRequiredAstNode(parent)) {
			parent = traverseParentNode(parent);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/ListSorter.java`
#### Snippet
```java
			}
		} catch (Exception e) {
			return null;
		}
		return this.list;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileUtils.java`
#### Snippet
```java
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			return file.getName();
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		
		if (!file.exists()) {
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
		
		if (!directory.exists()) {
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/FileHelper.java`
#### Snippet
```java
			return fileName;
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		{ 
			System.out.println("suspiciousJavaFile FILEPATH DO NOT EXIST");
			return null;
		}
		File suspCodeFile = new File(filePath);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		File suspCodeFile = new File(filePath);

		if (!suspCodeFile.exists()) return null;
		SuspiciousCodeParser scp = new SuspiciousCodeParser();
		scp.parseSuspiciousCode(new File(filePath), buggyLine);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
		if (suspiciousCodePairs.isEmpty()) {
			log.debug("Failed to identify the buggy statement in: " + suspiciousClassName + " --- " + buggyLine);
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
        File classBackup = new File(FileUtils.tempClassPath(suspiciousClassName, this.dataType + "/" + this.buggyProject));
        try {
        	if (!targetClassFile.exists()) return null;
        	if (javaBackup.exists()) javaBackup.delete();
        	if (classBackup.exists()) classBackup.delete();
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
			suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/All.txt");
		}
		if (!suspiciousFile.exists()) return null;
		List<SuspiciousPosition> suspiciousCodeList = new ArrayList<>();
		try {
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
        }
		if (suspiciousCodeList.isEmpty()) return null;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/AbstractFixer.java`
#### Snippet
```java
            return null;
        }
		if (suspiciousCodeList.isEmpty()) return null;
		return suspiciousCodeList;
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/context/Dictionary.java`
#### Snippet
```java
	public String findDependencyByClassName(String currentClassPath, String className) {
		List<String> importedDependencies = this.findImportedDependencies(currentClassPath);
		if (importedDependencies == null) return null;
		
		String className_ = "." + className;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
			suspiciousFile = new File(suspiciousFilePath + "/" + this.buggyProject + "/All.txt");
		}
		if (!suspiciousFile.exists()) return null;
		List<SuspiciousPosition> suspiciousCodeList = new ArrayList<>();
		try {
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
        }
		if (suspiciousCodeList.isEmpty()) return null;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
            return null;
        }
		if (suspiciousCodeList.isEmpty()) return null;
		return suspiciousCodeList;
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
		suspiciousFile = this.suspCodePosFile;
		
		if (!suspiciousFile.exists()) return null;
		List<SuspiciousPosition> suspiciousCodeList = new ArrayList<>();
		try {
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
        }
		if (suspiciousCodeList.isEmpty()) return null;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
            return null;
        }
		if (suspiciousCodeList.isEmpty()) return null;
		return suspiciousCodeList;
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
        	e.printStackTrace();
        	log.debug("Reloading Localization Result...");
            return null;
        }
		
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/TBarFixer.java`
#### Snippet
```java
        }
		
		if (suspiciousCodeList.isEmpty()) return null;
		return suspiciousCodeList;
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NPEqualsShouldHandleNullArgument.java`
#### Snippet
```java
		ITree parent = suspCodeTree.getParent();
		while (true) {
			if (parent == null) return null;
			if (Checker.isTypeDeclaration(parent.getType())) {
				break;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/CNIdiomNoSuperCall.java`
#### Snippet
```java
		ITree parent = suspCodeTree.getParent();
		while (true) {
			if (parent == null) return null;
			if (Checker.isMethodDeclaration(parent.getType())) {
				break;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/CNIdiomNoSuperCall.java`
#### Snippet
```java
				break;
			} else if (Checker.isTypeDeclaration(parent.getType())) {
				return null;
			}
			parent = parent.getParent();
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/CNIdiomNoSuperCall.java`
#### Snippet
```java
		int index = methodLabel.indexOf("MethodName:");
		String returnType = methodLabel.substring(0, index - 2);
		if ("boolean".equals(returnType) || "void".equals(returnType)) return null;
		methodLabel = methodLabel.substring(index + 11);
		if (!methodLabel.startsWith("clone, ")) return null;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/CNIdiomNoSuperCall.java`
#### Snippet
```java
		if ("boolean".equals(returnType) || "void".equals(returnType)) return null;
		methodLabel = methodLabel.substring(index + 11);
		if (!methodLabel.startsWith("clone, ")) return null;
		
		if (methodLabel.endsWith("@@Argus:null") || methodLabel.contains("@@Argus:null@@Exp:")) {
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
		private String identifyVarName(ITree suspStmtTree) {
			List<ITree> children = suspStmtTree.getChildren();
			if (children == null || children.isEmpty()) return null;
			
			int suspStmtType = suspStmtTree.getType();
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/RangeChecker.java`
#### Snippet
```java
				}
			}
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/CNIdiomNoSuperCall.java`
#### Snippet
```java
			return parent;
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java

        } catch (IOException e){
            return null;
        }
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            }
            else{
                return null;
            }
        } catch (IOException e){
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/utils/TestUtils.java`
#### Snippet
```java
            }
        } catch (IOException e){
            return null;
        }
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
		Boolean isLoopStmt = Boolean.valueOf(false);
		while (true) {
			if (parent == null) return null;
			int type = parent.getType();
			if (!isLoopStmt.booleanValue() && 
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
		methodLabel = methodLabel.substring(methodLabel.indexOf("@@") + 2);
		int index = methodLabel.indexOf("MethodName:");
		if (index == -1) return null;
		String returnType = methodLabel.substring(0, index - 2);
		if ("byte".equals(returnType) || "char".equals(returnType) || "short".equals(returnType) || 
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
		if ("byte".equals(returnType) || "char".equals(returnType) || "short".equals(returnType) || 
				"int".equals(returnType) || "long".equals(returnType) || "double".equals(returnType) || "float".equals(returnType))
			return null;
		
		return new Pair<String, Boolean>(returnType, isLoopStmt);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
	private String readReturnType(ITree suspCodeTree) {
		String returnType = ContextReader.readMethodReturnType(suspCodeTree);
		if (returnType == null) return null;
		if ("=CONSTRUCTOR=".equals(returnType)) return null;
		return returnType;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
		String returnType = ContextReader.readMethodReturnType(suspCodeTree);
		if (returnType == null) return null;
		if ("=CONSTRUCTOR=".equals(returnType)) return null;
		return returnType;
	}
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
			Boolean isLoopStmt = Boolean.valueOf(false);
			while (true) {
				if (parent == null) return null;
				int type = parent.getType();
				if (!isLoopStmt.booleanValue() && 
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
			methodLabel = methodLabel.substring(methodLabel.indexOf("@@") + 2);
			int index = methodLabel.indexOf("MethodName:");
			if (index == -1) return null;
			String returnType = methodLabel.substring(0, index - 2);
			if ("byte".equals(returnType) || "char".equals(returnType) || "short".equals(returnType) || 
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
			if ("byte".equals(returnType) || "char".equals(returnType) || "short".equals(returnType) || 
					"int".equals(returnType) || "long".equals(returnType) || "double".equals(returnType) || "float".equals(returnType))
				return null;
			
			return new Pair<String, Boolean>(returnType, isLoopStmt);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/NullPointerChecker.java`
#### Snippet
```java
		
		while (true) {
			if (parent == null) return null;
			int index = parent.getChildPosition(suspCodeTree);
			for (int i = 0; i <= index; i ++) {
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
		ITree parent = suspCodeTree.getParent();
		while (true) {
			if (parent == null) return null;
			if (Checker.isMethodDeclaration(parent.getType())) {
				break;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
				break;
			} else if (Checker.isTypeDeclaration(parent.getType())) {
				return null;
			}
			parent = parent.getParent();
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
		int index = methodLabel.indexOf("MethodName:");
		String returnType = methodLabel.substring(0, index - 2);
		if (!"boolean".equals(returnType)) return null;
		methodLabel = methodLabel.substring(index + 11);
		if (!methodLabel.startsWith("equals, ")) return null;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
		if (!"boolean".equals(returnType)) return null;
		methodLabel = methodLabel.substring(index + 11);
		if (!methodLabel.startsWith("equals, ")) return null;
		methodLabel = methodLabel.substring(methodLabel.indexOf("@@Argus:") + 8);
		String[] parameters = methodLabel.split("\\+");
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/StatementInserter.java`
#### Snippet
```java
		methodLabel = methodLabel.substring(methodLabel.indexOf("@@Argus:") + 8);
		String[] parameters = methodLabel.split("\\+");
		if (parameters.length != 2 || !"Object".equals(parameters[0])) return null;
		Pair<String, ITree> equalsMethod = new Pair<>(parameters[1], parent);
		return equalsMethod;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		} else {
			path = identifyJavaFilePath(classDeclarationAst, varType);
			if (path == null) return null;
			if (path.endsWith("INNER-CLASS")) {
				path = path.substring(0, path.length() - 11);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
				
			}
			if (!new File(path).exists()) return null;
			classDeclarationAst = new ASTGenerator().generateTreeForJavaFile(path, TokenType.EXP_JDT);
			List<ITree> children = classDeclarationAst.getChildren();
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			} else break;
		}
		if (classDeclarationAst == null) return null;
		
		List<ITree> rootTreeChildren = classDeclarationAst.getChildren();
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			if (parent == null) break;
		}
		if (parent == null) return null;
		List<ITree> children = parent.getParent().getChildren();
		for (ITree child : children) {
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		}
		
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		ITree parent = suspCodeTree.getParent();
		while (true) {
			if (parent == null) return null;
			if (Checker.isMethodDeclaration(parent.getType())) {
				break;
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		}
		
		if (superClassName == null) return null;
		
		return readSimpleNameOfDataType(superClassName);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
			if (parentTree == null) break;
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
		String label = simpleNameAst.getLabel();
		if (label.startsWith("MethodName:") || label.startsWith("ClassName:")) {
			return null;
		} else if (label.startsWith("Name:")) {
			label = label.substring(5);
```

### ReturnNull
Return of `null`
in `src/main/java/edu/lu/uni/serval/tbar/context/ContextReader.java`
#### Snippet
```java
				char firstChar = label.charAt(0);
				if (Character.isUpperCase(firstChar)) {
					return null;
				}
			}
```

## RuleId[ruleID=UnnecessaryLocalVariable]
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
Local variable `methodNameNode` is redundant
in `src/main/java/edu/lu/uni/serval/tbar/fixpatterns/AlterMethodInvocation.java`
#### Snippet
```java
		for (Map.Entry<ITree, Integer> entry : this.suspMethodInvocations.entrySet()) {
			ITree suspMethodInv = entry.getKey();
			ITree methodNameNode = suspMethodInv;
			int type = suspMethodInv.getType();
			
```

## RuleId[ruleID=RedundantFileCreation]
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

## RuleId[ruleID=UseBulkOperation]
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

