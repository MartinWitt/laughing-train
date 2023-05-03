# coming 
 
# Bad smells
I found 1198 bad smells with 84 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 158 | false |
| StringOperationCanBeSimplified | 133 | false |
| UNCHECKED_WARNING | 100 | false |
| FieldMayBeFinal | 95 | false |
| DuplicatedCode | 88 | false |
| DataFlowIssue | 79 | false |
| CommentedOutCode | 78 | false |
| UnusedAssignment | 60 | false |
| UNUSED_IMPORT | 52 | false |
| UnnecessaryCallToStringValueOf | 40 | false |
| UnnecessaryLocalVariable | 36 | true |
| UnnecessaryModifier | 33 | true |
| TrivialIf | 27 | false |
| ConstantValue | 21 | false |
| Deprecation | 17 | false |
| RedundantCast | 16 | false |
| StringConcatenationInLoops | 14 | false |
| IgnoreResultOfCall | 9 | false |
| JavadocReference | 9 | false |
| EmptyStatementBody | 8 | false |
| UnnecessarySemicolon | 8 | false |
| ArraysAsListWithZeroOrOneArgument | 8 | false |
| UnstableApiUsage | 8 | false |
| WrapperTypeMayBePrimitive | 6 | false |
| UnnecessaryStringEscape | 6 | true |
| DanglingJavadoc | 6 | false |
| UseBulkOperation | 6 | false |
| IfStatementWithIdenticalBranches | 5 | false |
| DuplicateThrows | 5 | false |
| CatchMayIgnoreException | 5 | false |
| EqualsBetweenInconvertibleTypes | 4 | false |
| RedundantOperationOnEmptyContainer | 4 | false |
| IOStreamConstructor | 4 | false |
| SuspiciousMethodCalls | 4 | false |
| TrivialStringConcatenation | 3 | false |
| FieldCanBeLocal | 3 | false |
| ManualArrayToCollectionCopy | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| CStyleArrayDeclaration | 2 | false |
| NonFinalFieldInEnum | 2 | false |
| DuplicateCondition | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| ParameterCanBeLocal | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| PointlessBooleanExpression | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| StringEquality | 1 | false |
| ClassGetClass | 1 | false |
| RegExpRedundantEscape | 1 | false |
| UnnecessaryReturn | 1 | true |
| JavadocLinkAsPlainText | 1 | false |
| SlowAbstractSetRemoveAll | 1 | false |
| ConfusingMainMethod | 1 | false |
| RedundantCollectionOperation | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| UnnecessaryTemporaryOnConversionToString | 1 | false |
| ThrowableNotThrown | 1 | false |
| RedundantFileCreation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[ar.size()\]'
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SLineComparator.java`
#### Snippet
```java
        }
        // It is the responsibility of the caller to close the stream
        fLines = (String[]) ar.toArray(new String[ar.size()]);
    }
    
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
				continue;
			
			if(targetFile!="") {
				if (!fileModif.getPath().contains(targetFile)) {
					continue;
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
        int max_time_for_a_git_repo = ComingProperties.getPropertyInteger("max_time_for_a_git_repo");

        Long startTime = System.currentTimeMillis();
        for (Iterator<R> iterator = it; iterator.hasNext(); ) {

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
            log.info("\n***********\nAnalyzing " + i + "/" + size + " " + oneRevision.getName());

            Long spentMillis = System.currentTimeMillis() - startTime;
            if (i > size - max_nb_commit_analyze && (max_time_for_a_git_repo == -1
                    || max_time_for_a_git_repo > spentMillis / 1000)) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
	                	OriginalFeatureCross ofc = (OriginalFeatureCross) featureCross;
	                	for(Feature f: simpleP4JFeatures) {
	                		Boolean positive = ofc.containFeature(f);
	                		if(numericalIndixator) {
		                		jsonfile.addProperty("P4J_"+ofc.getCrossType()+"_"+f, positive?"1":"0");
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
		public boolean compareLiteralAndConstantType(String literaltype, CtVariable var) {
			
			Boolean typecompatiable=false;
			if(var.getType().toString().toLowerCase().endsWith("string")) {
				if(literaltype.equals("string"))
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	  public boolean compareVarAccessAndLiteralType(String literaltype, CtVariableAccess varaccess) {
			
			Boolean typecompatiable=false;
			
			if(varaccess.getType()!=null) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
                }
            } else if (deleteOperation != null && DEL != null && insertOperation == null ) {
            		Boolean pureDelete = true;
            		for(Operation op :operations) {
            			if(!"DEL".equals(op.getAction().getName())) {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/engine/Analyzer.java`
#### Snippet
```java
	 * @return
	 */
	public default String key() {
		return this.getClass().getSimpleName();
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/engine/Analyzer.java`
#### Snippet
```java
	 * @return result of the analysis
	 */
	public AnalysisResult analyze(T input, RevisionResult previousResults);

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/engine/callback/IntermediateResultProcessorCallback.java`
#### Snippet
```java
public interface IntermediateResultProcessorCallback {

	public void handleResult(RevisionResult result);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IOutput.java`
#### Snippet
```java
	 * @param finalResult
	 */
	public void generateFinalOutput(FinalResult finalResult);

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IOutput.java`
#### Snippet
```java
	 * @param finalResult
	 */
	public void generateRevisionOutput(RevisionResult resultAllAnalyzed);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
	public void setNextVersion(T content);

	public void setNextName(String name);

	public void setPreviousName(String previousName);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
	public void setPreviousVersion(T previousContent);

	public void setNextVersion(T content);

	public void setNextName(String name);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
	public T getPreviousVersion();

	public T getNextVersion();

	public String getNextName();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
	public T getNextVersion();

	public String getNextName();

	public String getPreviousName();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
	public String getNextName();

	public String getPreviousName();

	public void setPreviousVersion(T previousContent);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
	public String getPreviousName();

	public void setPreviousVersion(T previousContent);

	public void setNextVersion(T content);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
public interface IRevisionPair<T> {

	public T getPreviousVersion();

	public T getNextVersion();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
	public void setNextName(String name);

	public void setPreviousName(String previousName);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/RevisionOrder.java`
#### Snippet
```java
public interface RevisionOrder<T> extends ComingExtensionPoint {

	public Iterator<T> orderOfNavigation(RevisionDataset<T> data);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public List<String> getBranches();

	public PersonIdent getAuthorInfo();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	 * @return list of pFileCommit
	 */
	public List<FileCommit> getFileCommits();

	public List<FileCommit> getJavaFileCommits();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	 * @return the commint name (SHA-1 code)
	 */
	public String getName();

	public boolean containsJavaFile();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public String getRevDate();

	public List<String> getParents();

	public List<String> getBranches();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public List<FileCommit> getFileCommits();

	public List<FileCommit> getJavaFileCommits();

	public List<FileCommit> getFileCommits(String extension);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public String getFullMessage();

	public int getRevCommitTime();

	public String getRevDate();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public boolean containsJavaFile();

	public String getShortMessage();

	public String getFullMessage();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public List<String> getParents();

	public List<String> getBranches();

	public PersonIdent getAuthorInfo();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public List<FileCommit> getJavaFileCommits();

	public List<FileCommit> getFileCommits(String extension);

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public int getRevCommitTime();

	public String getRevDate();

	public List<String> getParents();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public String getShortMessage();

	public String getFullMessage();

	public int getRevCommitTime();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/Commit.java`
#### Snippet
```java
	public String getName();

	public boolean containsJavaFile();

	public String getShortMessage();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/RepositoryP.java`
#### Snippet
```java
	 * @return the list of the commit of the repo
	 */
	public List<Commit> history();

	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/entities/interfaces/RepositoryP.java`
#### Snippet
```java
	 * @return the JGit repository
	 */
	public Repository getRepository();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/core/extensionpoints/changepattern/PatternFileParser.java`
#### Snippet
```java
 */
public interface PatternFileParser {
	public ChangePatternSpecification parse(File patternFile);
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/fr/inria/coming/changeminer/entity/ChangeDistillerEntityType.java`
#### Snippet
```java
    private final boolean fIsValidChange;

    private ChangeDistillerEntityType(boolean isValidChange) {
        fIsValidChange = isValidChange;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/changeminer/entity/IRevision.java`
#### Snippet
```java
	public String getName();
	
	public String getFolder();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/changeminer/entity/IRevision.java`
#### Snippet
```java
public interface IRevision {

	public List<IRevisionPair> getChildren();

	public String getName();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/coming/changeminer/entity/IRevision.java`
#### Snippet
```java
	public List<IRevisionPair> getChildren();

	public String getName();
	
	public String getFolder();
```

## RuleId[id=ClassGetClass]
### ClassGetClass
'getClass()' is called on Class instance
in `src/main/java/fr/inria/coming/core/extensionpoints/PlugInLoader.java`
#### Snippet
```java
			return object;
		else
			throw new Exception("The strategy " + className + " does not extend from " + type.getClass().getName());

	}
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
			// call = git.init().setDirectory(new File("")).call();

			for (Ref ref : call) {
				// System.out.println("Branch: " + ref + " " + ref.getName() +
				// " " + ref.getObjectId().getName());
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java

			List<Ref> call2 = new Git(repository).tagList().call();
			for (Ref ref : call2) {

				// System.out.println("Tag: " + ref + " " + ref.getName() + " "
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
			}

			for (; changedStartInd > 0
					&& isVariableNameChar(thenStatementStr.charAt(changedStartInd - 1)); changedStartInd--)
				;
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
					&& isVariableNameChar(thenStatementStr.charAt(changedStartInd - 1)); changedStartInd--)
				;
			for (; changedEndInd > 0
					&& isVariableNameChar(thenStatementStr.charAt(thenLen - changedEndInd)); changedEndInd--)
				;
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
 			CtElement other = argumentsother.get(index);
 			
 			if(original.equals(other) || original.toString().equals(other.toString())) {
 				// same
 			} else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
 					else if(other instanceof CtInvocation || other instanceof CtConstructorCall)
 						numberdiffmethodreplacebymethod+=1;
 					else {
 						// do nothing
 					}
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				CtElement other = argumentsother.get(index);
				
				if(original.equals(other) || original.toString().equals(other.toString())) {
					// same
				} else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
						else if(other instanceof CtInvocation || other instanceof CtConstructorCall)
							numberdiffvarreplacebymethod+=1;
						else {
							// do nothing
						}
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
	static {
		options.addOption(
				Option.builder("location").argName("path").hasArg().desc("analyse the content in \'path\'").build());

		options.addOption(Option.builder("mode").argName("mineinstance | diff | features").hasArg()
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
	static {
		options.addOption(
				Option.builder("location").argName("path").hasArg().desc("analyse the content in \'path\'").build());

		options.addOption(Option.builder("mode").argName("mineinstance | diff | features").hasArg()
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		// Pattern mining
		options.addOption(Option.builder("pattern").argName("path").hasArg()
				.desc("path of the pattern file to be used when the -mode is \'mineinstance\'").build());

		options.addOption(Option.builder("patternparser").argName("classname").hasArg()
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		// Pattern mining
		options.addOption(Option.builder("pattern").argName("path").hasArg()
				.desc("path of the pattern file to be used when the -mode is \'mineinstance\'").build());

		options.addOption(Option.builder("patternparser").argName("classname").hasArg()
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		// In case of git
		options.addOption(Option.builder("branch").argName("branch name").hasArg()
				.desc("In case of -input=\'git\', use this branch name. Default is master.").build());
		options.addOption("message", true, "comming message");
		options.addOption("parameters", true, "Parameters, divided by " + File.pathSeparator);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		// In case of git
		options.addOption(Option.builder("branch").argName("branch name").hasArg()
				.desc("In case of -input=\'git\', use this branch name. Default is master.").build());
		options.addOption("message", true, "comming message");
		options.addOption("parameters", true, "Parameters, divided by " + File.pathSeparator);
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `diffarray`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			}

			int diffarray[]=new int[3];
			diffarray[0]=numberdiffargument;
			diffarray[1]=numberdiffvarreplacebyvar;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `diffarray`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
 		}

 		int diffarray[]=new int[3];
 		diffarray[0]=numberdiffargument;
 		diffarray[1]=numberdiffmethodreplacebyvar;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/Main.java`
#### Snippet
```java
	
	
//	@Test
//	public void main() throws Exception {
//		FragmentableComparator comp = new LineComparator();
```

### CommentedOutCode
Commented out code (24 lines)
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/Main.java`
#### Snippet
```java
}

//	public static void main(String[] argv) {
//		
//		FragmentableComparator comp = new LineComparator();
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/FragmentableComparator.java`
#### Snippet
```java
	    for (RangeDifference diff : results) {
	      if (diff.kind() != RangeDifference.NOCHANGE) {
//	        System.err.println("####change " + diff.toString());

//	        for (int i = diff.leftStart(); i < diff.leftEnd(); i++) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/coming/core/filter/files/CommitSizeFilter.java`
#### Snippet
```java

			if (countJava > ComingProperties.getPropertyInteger("max_files_per_commit")) {
				// System.out.println("Commit not accepted, many files in the commit");
				// log.info("-----");
				return false;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java

			for (Ref ref : call) {
				// System.out.println("Branch: " + ref + " " + ref.getName() +
				// " " + ref.getObjectId().getName());
			}
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
			for (Ref ref : call2) {

				// System.out.println("Tag: " + ref + " " + ref.getName() + " "
				// + ref.getObjectId().getName());
			}
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java

		log.debug("JSON output");
		// JsonObject root = new JsonObject();
		// JsonArray instances = new JsonArray();
		for (Object commit : finalResult.getAllResults().keySet()) {
```

### CommentedOutCode
Commented out code (15 lines)
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
			}

//			System.out.println("Diff of the revision");
//			for (DiffRow row : rows) {
//				switch (row.getTag()) {
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/coming/utils/MapCounter.java`
#### Snippet
```java

		for (K k : this.keySet()) {
			// JsonObject element = new JsonObject();
			// element.addProperty("k", k.toString());
			// elemeRnt.addProperty("v", this.get(k));
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java

				log.info("\n--------\ncommit with instance:\n " + revisionIdentifier);
//              System.out.println("\n--------\ncommit with instance:\n " + revisionIdentifier);
//              log.info(pi.getInstances());
//              System.out.println(pi.getInstances());
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
					repair.addProperty("Unified_Diff_of-files:", "Starts Below...");

//                  System.out.println("result.getRow_list()");
//                  System.out.println(result.getRow_list());
					for (DiffRow row : result.getRow_list()) {
```

### CommentedOutCode
Commented out code (16 lines)
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	}

//	 private void analyzeS17_HasExceptionImport ( Cntx<Object> context,  CtClass parentClass,
//			   List<CtInvocation> invocationstostudy) {
//				
```

### CommentedOutCode
Commented out code (31 lines)
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	}

//	private void analyzeS1_AffectedAssigned(List<CtVariableAccess> varsAffected, CtElement element,
//			Cntx<Object> context) {
//		
```

### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	}

//	private void analyzeS4_AffectedFielfs(List<CtVariableAccess> varsAffected, CtElement element, Cntx<Object> context,
//			CtClass parentClass) {
//
```

### CommentedOutCode
Commented out code (34 lines)
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	}

// 	private void analyzeS7S8_AffectedObjectLastAppear(List<CtVariableAccess> varsAffected, CtElement element,
// 			Cntx<Object> context, List<CtStatement> statements) {
//
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	public void analyze() {

//		analyzeS1_AffectedAssigned(elementinfo.varsAffected, elementinfo.element, elementinfo.context);
//		analyzeS1_AffectedVariablesUsed(elementinfo.varsAffected, elementinfo.element, 
//				elementinfo.context, elementinfo.statements);
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
//				elementinfo.context, elementinfo.parentClass, elementinfo.statements);
		analyzeS3_TypeOfFaulty(elementinfo.element, elementinfo.context);
//		analyzeS4_AffectedFielfs(elementinfo.varsAffected, elementinfo.element, elementinfo.context,
//				elementinfo.parentClass);
//		analyzeS4_AffectedFieldAssigned(elementinfo.varsAffected, elementinfo.element, elementinfo.context, 
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
//				elementinfo.parentClass);
		analyzeS6S11_Method_Method_Features(elementinfo.element, elementinfo.context);
//		analyzeS7S8_AffectedObjectLastAppear(elementinfo.varsAffected, elementinfo.element, elementinfo.context, 
//				elementinfo.statements);
//		analyzeS9S10S12_SamerMethodWithGuardOrTrywrap(elementinfo.element, elementinfo.context, elementinfo.parentClass,
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java
            Option option = new Option();
            runDemo(option);
//            runODS1(option);
//            runODS2(option);
        } catch (Exception e) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java
        option.featureOption = FeatureOption.ORIGINAL;
        run(option);
//        option.featureOption = FeatureOption.EXTENDED;
//        run(option);
    }
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java
    private static void run(Option option) {
        try {
//            new Demo(option).extract();
//            new Demo(option).learn();
            new Demo(option).evaluate();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
            if (lastCommit != null) {
                // why runDiff() for some commits returns "java.lang.RuntimeException: invalid diff"? (tested on the very first one case)
//                runDiff(repository, lastCommit.getName(), commit.getName(), "README.md");
//                listDiff(repository, git, lastCommit.getName(), commit.getName());
                CommitDiffer commitDiffer = filterDiff(repository, git, lastCommit.getName(), commit.getName(), option);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java

    private DiffEntry diffFile(Repository repo, String oldCommit, String newCommit, String path) throws IOException, GitAPIException {
//        Config config = new Config();
//        config.setBoolean("diff", null, "renames", true);
//        DiffConfig diffConfig = config.get(DiffConfig.KEY);
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeature.java`
#### Snippet
```java
    // dstAF * dstVF
    int FEATURE_SIZE = FEATURE_BASE_7 + AF_SIZE * VF_SIZE;
//    int FEATURE_BASE_0 = 0;
//    int FEATURE_BASE_1 = FEATURE_BASE_0 + POS_SIZE * AF_SIZE; // for src
//    int FEATURE_BASE_2 = FEATURE_BASE_1 + POS_SIZE * AF_SIZE; // for dst
```

### CommentedOutCode
Commented out code (19 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureCross.java`
#### Snippet
```java
            this.features.add(RepairFeature.values()[ordinal0]);
        }
//        if (id >= FEATURE_BASE_2) {
//            int tmp = id - FEATURE_BASE_2;
//            int ordinal0 = tmp / SF_SIZE;
```

### CommentedOutCode
Commented out code (24 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureCross.java`
#### Snippet
```java
                this.id = FEATURE_BASE_7 + ordinal0 * VF_SIZE + ordinal1;
                break;
//            case POS_AF_CT4SRC:
//                assert features.size() == 2;
//                assert features.get(0) instanceof Position;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
            S4RORepairAnalyzer.AtomReplaceVisitor V = repairAnalyzer.newAtomReplaceVisitor();
            V.TraverseStmt(it);
//            if (!repairAnalyzer.isValidStmt(it))
//                continue;

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java

            for (CtElement it2 : V.getResult()) {
//                boolean valid_after_replace = repairAnalyzer.isValidStmt(it2);
//                if (!valid_after_replace) continue;
                Repair repair = new Repair();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        Set<CtElement> stmts = repairAnalyzer.getGlobalCandidateIfStmts(n);
        for (CtElement it : stmts) {
//            boolean valid = repairAnalyzer.isValidStmt(it);
//            if (!valid) continue;
            Repair repair = new Repair();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        if (curFD != null) {
            CtStatement lastStatement = curFD.getBody().getLastStatement();
//            CtReturn ctReturn = curFD.getBody().getLastStatement();
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
        public void TraverseStmt(CtElement element) {
            // PR spoon to support getting belonged CtEnum with one CtEnumValue
//            List<CtEnumValue> enumValues = element.getElements(new TypeFilter<>(CtEnumValue.class));
//            for (CtEnumValue enumValue : enumValues) {
//                List<CtElement> exprs = L->getCandidateEnumConstant(enumValue);
```

### CommentedOutCode
Commented out code (28 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
    private Map<String, Set<AtomicFeature>> getFeatureResult() {
        // meaningless todo check
//        if (res.map.containsKey("@")) {
//            Set<AtomicFeature> tmp = res.map.get("@");
//            if (tmp.contains(AtomicFeature.STMT_LOOP_AF)) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
            public <T> void visitCtField(CtField<T> f) {
                super.visitCtField(f);
//                if (f instanceof CtArrayAccess)
//                    putValueFeature(f, AtomicFeature.DEREF_AF);
                putValueFeature(f, AtomicFeature.MEMBER_ACCESS_AF);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
            public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
                super.visitCtFieldReference(reference);
//                if (reference instanceof CtArrayAccess)
//                    putValueFeature(reference, AtomicFeature.DEREF_AF);
                putValueFeature(reference, AtomicFeature.MEMBER_ACCESS_AF);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
//            }
            // CtInvocation or CtExecutable todo check
//            if (v.getElements(new TypeFilter<>(CtInvocation.class)).size() > 0 && !isAbstractStub(v)) {
//                return;
//            }
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeature.java`
#### Snippet
```java
    int FEATURE_BASE_3 = FEATURE_BASE_2 + POS_SIZE * AF_SIZE * AF_SIZE;
    int FEATURE_SIZE = FEATURE_BASE_3 + AF_SIZE * VF_SIZE;
//    int FEATURE_BASE_0 = 0;
//    int FEATURE_BASE_1 = FEATURE_BASE_0 + POS_SIZE * AF_SIZE; // for src
//    int FEATURE_BASE_2 = FEATURE_BASE_1 + POS_SIZE * AF_SIZE; // for dst
```

### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
            valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
        }
//        if (E instanceof CtVariable) {
//            if (E instanceof CtLocalVariable)
//                valueFeatures.add(SchemaFeature.LOCAL_VARIABLE_VF);
```

### CommentedOutCode
Commented out code (19 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureCross.java`
#### Snippet
```java
            this.features.add(RepairFeature.values()[ordinal0]);
        }
//        if (id >= FEATURE_BASE_2) {
//            int tmp = id - FEATURE_BASE_2;
//            int ordinal0 = tmp / SF_SIZE;
```

### CommentedOutCode
Commented out code (24 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureCross.java`
#### Snippet
```java
                this.id = FEATURE_BASE_3 + ordinal0 * VF_SIZE + ordinal1;
                break;
//            case POS_AF_CT4SRC:
//                assert features.size() == 2;
//                assert features.get(0) instanceof Position;
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedRepairAnalyzer.java`
#### Snippet
```java
        public void TraverseStmt(CtElement element) {
            // PR spoon to support getting belonged CtEnum with one CtEnumValue
//            List<CtEnumValue> enumValues = element.getElements(new TypeFilter<>(CtEnumValue.class));
//            for (CtEnumValue enumValue : enumValues) {
//                List<CtElement> exprs = L->getCandidateEnumConstant(enumValue);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
            EnhancedRepairAnalyzer.AtomReplaceVisitor V = repairAnalyzer.newAtomReplaceVisitor();
            V.TraverseStmt(it);
//            if (!repairAnalyzer.isValidStmt(it))
//                continue;

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java

            for (CtElement it2 : V.getResult()) {
//                boolean valid_after_replace = repairAnalyzer.isValidStmt(it2);
//                if (!valid_after_replace) continue;
                Repair repair = new Repair();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
        Set<CtElement> stmts = repairAnalyzer.getGlobalCandidateIfStmts(n);
        for (CtElement it : stmts) {
//            boolean valid = repairAnalyzer.isValidStmt(it);
//            if (!valid) continue;
            Repair repair = new Repair();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
        if (curFD != null) {
            CtStatement lastStatement = curFD.getBody().getLastStatement();
//            CtReturn ctReturn = curFD.getBody().getLastStatement();
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
```

### CommentedOutCode
Commented out code (28 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
    private Map<String, Set<AtomicFeature>> getFeatureResult() {
        // meaningless todo check
//        if (res.map.containsKey("@")) {
//            Set<AtomicFeature> tmp = res.map.get("@");
//            if (tmp.contains(AtomicFeature.STMT_LOOP_AF)) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
            public <T> void visitCtField(CtField<T> f) {
                super.visitCtField(f);
//                if (f instanceof CtArrayAccess)
//                    putValueFeature(f, AtomicFeature.DEREF_AF);
                putValueFeature(f, AtomicFeature.MEMBER_ACCESS_AF);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
            public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
                super.visitCtFieldReference(reference);
//                if (reference instanceof CtArrayAccess)
//                    putValueFeature(reference, AtomicFeature.DEREF_AF);
                putValueFeature(reference, AtomicFeature.MEMBER_ACCESS_AF);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
//            }
            // CtInvocation or CtExecutable todo check
//            if (v.getElements(new TypeFilter<>(CtInvocation.class)).size() > 0 && !isAbstractStub(v)) {
//                return;
//            }
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedRepairAnalyzer.java`
#### Snippet
```java
        public void TraverseStmt(CtElement element) {
            // PR spoon to support getting belonged CtEnum with one CtEnumValue
//            List<CtEnumValue> enumValues = element.getElements(new TypeFilter<>(CtEnumValue.class));
//            for (CtEnumValue enumValue : enumValues) {
//                List<CtElement> exprs = L->getCandidateEnumConstant(enumValue);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
            public <T> void visitCtField(CtField<T> f) {
                super.visitCtField(f);
//                if (f instanceof CtArrayAccess)
//                    putValueFeature(f, AtomicFeature.DEREF_AF);
                putValueFeature(f, AtomicFeature.MEMBER_ACCESS_AF);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
//            }
            // CtInvocation or CtExecutable todo check
//            if (v.getElements(new TypeFilter<>(CtInvocation.class)).size() > 0 && !isAbstractStub(v)) {
//                return;
//            }
```

### CommentedOutCode
Commented out code (28 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
    private Map<String, Set<AtomicFeature>> getFeatureResult() {
        // meaningless todo check
//        if (res.map.containsKey("@")) {
//            Set<AtomicFeature> tmp = res.map.get("@");
//            if (tmp.contains(AtomicFeature.STMT_LOOP_AF)) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
            public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
                super.visitCtFieldReference(reference);
//                if (reference instanceof CtArrayAccess)
//                    putValueFeature(reference, AtomicFeature.DEREF_AF);
                putValueFeature(reference, AtomicFeature.MEMBER_ACCESS_AF);
```

### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
            valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
        }
//        if (E instanceof CtVariable) {
//            if (E instanceof CtLocalVariable)
//                valueFeatures.add(SchemaFeature.LOCAL_VARIABLE_VF);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
            ExtendedRepairAnalyzer.AtomReplaceVisitor V = repairAnalyzer.newAtomReplaceVisitor();
            V.TraverseStmt(it);
//            if (!repairAnalyzer.isValidStmt(it))
//                continue;

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java

            for (CtElement it2 : V.getResult()) {
//                boolean valid_after_replace = repairAnalyzer.isValidStmt(it2);
//                if (!valid_after_replace) continue;
                Repair repair = new Repair();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
        Set<CtElement> stmts = repairAnalyzer.getGlobalCandidateIfStmts(n);
        for (CtElement it : stmts) {
//            boolean valid = repairAnalyzer.isValidStmt(it);
//            if (!valid) continue;
            Repair repair = new Repair();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
        if (curFD != null) {
            CtStatement lastStatement = curFD.getBody().getLastStatement();
//            CtReturn ctReturn = curFD.getBody().getLastStatement();
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
```

### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
            valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
        }
//        if (E instanceof CtVariable) {
//            if (E instanceof CtLocalVariable)
//                valueFeatures.add(SchemaFeature.LOCAL_VARIABLE_VF);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
            public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
                super.visitCtFieldReference(reference);
//                if (reference instanceof CtArrayAccess)
//                    putValueFeature(reference, AtomicFeature.DEREF_AF);
                putValueFeature(reference, AtomicFeature.MEMBER_ACCESS_AF);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
            public <T> void visitCtField(CtField<T> f) {
                super.visitCtField(f);
//                if (f instanceof CtArrayAccess)
//                    putValueFeature(f, AtomicFeature.DEREF_AF);
                putValueFeature(f, AtomicFeature.MEMBER_ACCESS_AF);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
//            }
            // CtInvocation or CtExecutable todo check
//            if (v.getElements(new TypeFilter<>(CtInvocation.class)).size() > 0 && !isAbstractStub(v)) {
//                return;
//            }
```

### CommentedOutCode
Commented out code (28 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
    private Map<String, Set<AtomicFeature>> getFeatureResult() {
        // meaningless todo check
//        if (res.map.containsKey("@")) {
//            Set<AtomicFeature> tmp = res.map.get("@");
//            if (tmp.contains(AtomicFeature.STMT_LOOP_AF)) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
        Option option = new Option();
        Tool tool = new Tool(option);
//        option.dataOption = DataOption.BUG_DOT_JAR;
//        option.patchOption = PatchOption.BUG_DOT_JAR;
        option.dataOption = DataOption.BUG_DOT_JAR_MINUS_MATH;
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
        tool.genVectorsCSV(RankingOption.P_INCORRECT);

//        option.featureOption = FeatureOption.ORIGINAL;
//        tool.genWeightsCSV();
//        tool.genVectorsCSV(RankingOption.D_CORRECT);
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalRepairAnalyzer.java`
#### Snippet
```java
        public void TraverseStmt(CtElement element) {
            // PR spoon to support getting belonged CtEnum with one CtEnumValue
//            List<CtEnumValue> enumValues = element.getElements(new TypeFilter<>(CtEnumValue.class));
//            for (CtEnumValue enumValue : enumValues) {
//                List<CtElement> exprs = L->getCandidateEnumConstant(enumValue);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
        if (curFD != null) {
            CtStatement lastStatement = curFD.getBody().getLastStatement();
//            CtReturn ctReturn = curFD.getBody().getLastStatement();
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
            OriginalRepairAnalyzer.AtomReplaceVisitor V = repairAnalyzer.newAtomReplaceVisitor();
            V.TraverseStmt(it);
//            if (!repairAnalyzer.isValidStmt(it))
//                continue;

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java

            for (CtElement it2 : V.getResult()) {
//                boolean valid_after_replace = repairAnalyzer.isValidStmt(it2);
//                if (!valid_after_replace) continue;
                Repair repair = new Repair();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
        Set<CtElement> stmts = repairAnalyzer.getGlobalCandidateIfStmts(n);
        for (CtElement it : stmts) {
//            boolean valid = repairAnalyzer.isValidStmt(it);
//            if (!valid) continue;
            Repair repair = new Repair();
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/fr/inria/prophet4j/learner/FeatureLearner.java`
#### Snippet
```java
    }

//    private double getLogSumExp(double[] array) {
//        assert array.length > 0;
//        double max = Arrays.stream(array).max().getAsDouble();
```

### CommentedOutCode
Commented out code (13 lines)
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                ObjectInputStream ois = new ObjectInputStream(fis);
                featureMatrices = (List<FeatureMatrix>) ois.readObject();
                /*
                // if we need to try on merged feature-vector
                // however it usually not performances better
```

### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
            valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
        }
//        if (E instanceof CtVariable) {
//            if (E instanceof CtLocalVariable)
//                valueFeatures.add(SchemaFeature.LOCAL_VARIABLE_VF);
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
                patchedFile = childFiles.get(0);
                // sometimes filename might get changed
//                for (File tmpFile : Lists.newArrayList(Files.fileTraverser().depthFirstPreOrder(scopeFile))) {
//                    if (tmpFile.getName().equals(buggyFileName)) {
//                        patchedFile = tmpFile;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java

    public void run() {
//        run(RankingOption.D_CORRECT, RankingOption.D_INCORRECT);
//        run(RankingOption.D_HUMAN, RankingOption.D_CORRECT);
        run(RankingOption.D_HUMAN, RankingOption.D_INCORRECT);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
                // based on L61-79 at FeaturesOnD4jTest.java
                JsonElement elAST = file.get("features");
//        			assertNotNull(elAST);
//		        	assertTrue(elAST instanceof JsonArray);
                JsonArray featuresOperationList = (JsonArray) elAST;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
                // based on L61-79 at FeaturesOnD4jTest.java
                JsonElement elAST = file.get("features");
//        			assertNotNull(elAST);
//		        	assertTrue(elAST instanceof JsonArray);
                JsonArray featuresOperationList = (JsonArray) elAST;
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
                                featureMatrices.add(new FeatureMatrix(false, fileKey, featureVectors));
                            }
//                            List<FeatureVector> featureVectors = new ArrayList<>();
//                            FeatureVector featureVector = new FeatureVector();
//                            for (CtElement atom : repair.getCandidateAtoms()) {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/LineComparator.java`
#### Snippet
```java
  @Override
  public Fragmentable createFragmentable(String data)  {
		String dataParsed = data.replaceAll(" |\\t|\\{|\\}", "");

		return new SLineComparator(dataParsed);
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `_class` in enum 'ExtensionPoints'
in `src/main/java/fr/inria/coming/core/extensionpoints/ExtensionPoints.java`
#### Snippet
```java
	;
	public String identifier;
	public Class<?> _class;

	ExtensionPoints(String id, Class<?> _class) {
```

### NonFinalFieldInEnum
Non-final field `identifier` in enum 'ExtensionPoints'
in `src/main/java/fr/inria/coming/core/extensionpoints/ExtensionPoints.java`
#### Snippet
```java
	NAVIGATION_ENGINE("customengine", RevisionNavigationExperiment.class), //
	;
	public String identifier;
	public Class<?> _class;

```

## RuleId[id=Deprecation]
### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
					Diff singleDiff = (Diff) value;
					for (Operation operation : singleDiff.getRootOperations()) {
						counter.add(operation.getNode().getClass().getSimpleName());
						counterParent.add(
								operation.getAction().getName() + "_" + operation.getNode().getClass().getSimpleName()
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
						counter.add(operation.getNode().getClass().getSimpleName());
						counterParent.add(
								operation.getAction().getName() + "_" + operation.getNode().getClass().getSimpleName()
										+ "_" + operation.getNode().getParent().getClass().getSimpleName());

```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
						counterParent.add(
								operation.getAction().getName() + "_" + operation.getNode().getClass().getSimpleName()
										+ "_" + operation.getNode().getParent().getClass().getSimpleName());

					}
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
						opjson.add("concrete_change", getJSONFromOperator(op));

						if (op.getNode().getPosition() != null) {
							opjson.addProperty("file", op.getNode().getPosition().getFile().getAbsolutePath());
							opjson.addProperty("line", op.getNode().getPosition().getLine());
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java

						if (op.getNode().getPosition() != null) {
							opjson.addProperty("file", op.getNode().getPosition().getFile().getAbsolutePath());
							opjson.addProperty("line", op.getNode().getPosition().getLine());
						}
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
						if (op.getNode().getPosition() != null) {
							opjson.addProperty("file", op.getNode().getPosition().getFile().getAbsolutePath());
							opjson.addProperty("line", op.getNode().getPosition().getLine());
						}
						ops.add(opjson);
```

### Deprecation
'org.apache.commons.cli.BasicParser' is deprecated
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
	static Options options = new Options();

	CommandLineParser parser = new BasicParser();

	static {
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
        } else {
            matchnewvalue = true;
            currentNodeFromAction = affectedOperation.getNode();
        }

```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
		for (Operation op : diff.getAllOperations()) {

			if (op.getNode() == comment && op instanceof InsertOperation)
				existInsert = true;

```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
				existInsert = true;

			if (op instanceof DeleteOperation && op.getNode() instanceof CtComment
					&& (op.getNode() == comment || op.getSrcNode().toString().equals(comment.toString())))
				existDetete = true;
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java

			if (op instanceof DeleteOperation && op.getNode() instanceof CtComment
					&& (op.getNode() == comment || op.getSrcNode().toString().equals(comment.toString())))
				existDetete = true;

```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
		for (Operation op : diff.getAllOperations()) {

			if (op.getNode() == comment) {
				return op.getAction().getName();

```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
						opjson.add("concrete_change", getJSONFromOperator(op));

						if (op.getNode().getPosition() != null && op.getNode().getPosition().isValidPosition()) {
							try {
								opjson.addProperty("line", op.getNode().getPosition().getLine());
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
						opjson.add("concrete_change", getJSONFromOperator(op));

						if (op.getNode().getPosition() != null && op.getNode().getPosition().isValidPosition()) {
							try {
								opjson.addProperty("line", op.getNode().getPosition().getLine());
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
						if (op.getNode().getPosition() != null && op.getNode().getPosition().isValidPosition()) {
							try {
								opjson.addProperty("line", op.getNode().getPosition().getLine());
							} catch (UnsupportedOperationException e) {
								e.printStackTrace();
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
								opjson.addProperty("line", -1);
							}
							if (op.getNode().getPosition().getFile() != null) {
								opjson.addProperty("file", op.getNode().getPosition().getFile().getAbsolutePath());
							}
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
							}
							if (op.getNode().getPosition().getFile() != null) {
								opjson.addProperty("file", op.getNode().getPosition().getFile().getAbsolutePath());
							}
						}
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
               sort(en.getValue());
           }
           return;
       }
   }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java

	public String getFolder() {
		return diffFolder + "";
	}

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/coming/core/entities/HunkPair.java`
#### Snippet
```java
	@Override
	public String toString() {
		return "left: " + "" + left + "\nright: " + right;
	}

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/coming/changeminer/entity/FinalResult.java`
#### Snippet
```java
		for (R revision : this.keySet()) {

			r += "\n" + ("" + revision.toString());
			RevisionResult rv = this.get(revision);

```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'CtExpression' and 'boolean'
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
			CtElement dst = upd.getDstNode();

			return ((CtBinaryOperator) dst.getParent()).getRightHandOperand().equals(true)
					|| ((CtBinaryOperator) dst.getParent()).getRightHandOperand().equals(false);
		}
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'CtExpression' and 'boolean'
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java

			return ((CtBinaryOperator) dst.getParent()).getRightHandOperand().equals(true)
					|| ((CtBinaryOperator) dst.getParent()).getRightHandOperand().equals(false);
		}

```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'CtExpression' and 'boolean'
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
			CtElement dst = upd.getDstNode();

			return ((CtBinaryOperator) dst.getParent()).getLeftHandOperand().equals(true)
					|| ((CtBinaryOperator) dst.getParent()).getLeftHandOperand().equals(false);
		}
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'CtExpression' and 'boolean'
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java

			return ((CtBinaryOperator) dst.getParent()).getLeftHandOperand().equals(true)
					|| ((CtBinaryOperator) dst.getParent()).getLeftHandOperand().equals(false);
		}

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
 * statement or the invocation exists in the source code with compatible types.
 * (Read more about this on
 * https://ieeexplore.ieee.org/stamp/stamp.jsp?arnumber=8485732)
 */

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
    private final String SIVA_UNPACKED_DIR = PROPHET4J_DIR + "siva_unpacked/";
    private final String SIVA_COMMITS_DIR = PROPHET4J_DIR + "siva_commits/";
    private final String SIVA_VECTORS_DIR = PROPHET4J_DIR + "siva_vectors/";
    private final String SIVA_PARAMETERS_DIR = PROPHET4J_DIR + "siva_parameters/";
    private static final Logger logger = LogManager.getLogger(PGA.class.getName());
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
     */
    private final String PROPHET4J_DIR = "src/main/resources/prophet4j/";
    private final String SIVA_FILES_DIR = PROPHET4J_DIR + "siva_files/";
    private final String SIVA_UNPACKED_DIR = PROPHET4J_DIR + "siva_unpacked/";
    private final String SIVA_COMMITS_DIR = PROPHET4J_DIR + "siva_commits/";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
    private Double degree;
    private List<Feature> features;
    private List<Feature> simpleP4Jfeatures;
    private CrossType crossType;

```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `PREDEFINED_METHODS_AND_LITERALS.contains(exp)`
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java

	public boolean canNPEfixGenerateExpression(String exp) {
		if (PREDEFINED_METHODS_AND_LITERALS.contains(exp)
				|| PREDEFINED_METHODS_AND_LITERALS.contains(exp)
				|| exp.startsWith("null"))
```

### DuplicateCondition
Duplicate condition `PREDEFINED_METHODS_AND_LITERALS.contains(exp)`
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
	public boolean canNPEfixGenerateExpression(String exp) {
		if (PREDEFINED_METHODS_AND_LITERALS.contains(exp)
				|| PREDEFINED_METHODS_AND_LITERALS.contains(exp)
				|| exp.startsWith("null"))
			return true;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
			// Create the output dir
			File fout = new File(ComingProperties.getProperty("output"));
			fout.mkdirs();
			String fileName = fout.getAbsolutePath() + File.separator +"features_" + result.getAnalyzed().getName()
					+ ".json";
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
	public void saveToJsonFile(JsonObject root, String filename) {
		File fout = new File(ComingProperties.getProperty("output"));
		fout.mkdirs();
		try {
			FileWriter fw = new FileWriter(fout.getAbsolutePath() + File.separator + filename + ".json");
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java

				changesArray.add(new Gson().fromJson(analyze.toJson().toString(), JsonObject.class));
				tempFile.delete();
				
				//add more features
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
		float[][] predicts = booster.predict(dtest);
		float probability = predicts[0][0];
		tempFile.delete();

		// Return label
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
				}
			}
			tempFile.delete();

			// To use XGBoost4J, we convert csv format features obtain above to libsvm
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
            InputStream inputStream = this.getClass().getResourceAsStream(rootInputFile);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/fr/inria/prophet4j/utility/Support.java`
#### Snippet
```java
            File file = new File(filePath);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
            }
            FileOutputStream fos = new FileOutputStream(filePath);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                File file = new File(filePath);
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fos = new FileOutputStream(filePath);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                File file = new File(jsonPath);
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                }
                Files.write(Paths.get(jsonPath), json.getBytes());
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        CtElement srcElem = repair.srcElem;
        if (!repair.isReplace) {
            ret.add(srcElem);
            return ret;
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
						CtMethod methodParentAssign = assignment.getParent(CtMethod.class);

						if (methodParentAssign != null && methodParentAssign.equals(methodParent)) {

							if (!isElementBeforeVariable(variableAffected, assignment))
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        CtElement srcElem = repair.srcElem;
        if (!repair.isReplace) {
            ret.add(srcElem);
            return ret;
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        CtElement srcElem = repair.srcElem;
        if (!repair.isReplace) {
            ret.add(srcElem);
            return ret;
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        CtElement srcElem = repair.srcElem;
        if (!repair.isReplace) {
            ret.add(srcElem);
            return ret;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/HunkDifftAnalyzer.java`
#### Snippet
```java
package fr.inria.coming.changeminer.analyzer.commitAnalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import com.github.difflib.text.DiffRow;`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
import java.util.List;

import com.github.difflib.text.DiffRow;
import fr.inria.coming.changeminer.analyzer.commitAnalyzer.FineGrainDifftAnalyzer;

```

### UNUSED_IMPORT
Unused import `import fr.inria.coming.changeminer.analyzer.commitAnalyzer.FineGrainDifftAnalyzer;`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java

import com.github.difflib.text.DiffRow;
import fr.inria.coming.changeminer.analyzer.commitAnalyzer.FineGrainDifftAnalyzer;

import fr.inria.coming.changeminer.entity.IRevision;
```

### UNUSED_IMPORT
Unused import `import java.util.Set;`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/ResultMapping.java`
#### Snippet
```java

import java.util.List;
import java.util.Set;

import fr.inria.coming.changeminer.analyzer.patternspecification.PatternAction;
```

### UNUSED_IMPORT
Unused import `import com.github.difflib.text.DiffRow;`
in `src/main/java/fr/inria/coming/codefeatures/FeaturesResult.java`
#### Snippet
```java
package fr.inria.coming.codefeatures;

import com.github.difflib.text.DiffRow;
import com.google.gson.JsonElement;

```

### UNUSED_IMPORT
Unused import `import org.apache.commons.csv.CSVFormat;`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.log4j.Logger;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.csv.CSVPrinter;`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
```

### UNUSED_IMPORT
Unused import `import org.json.simple.JSONObject;`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
import org.apache.commons.csv.CSVPrinter;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

import com.google.gson.JsonArray;
```

### UNUSED_IMPORT
Unused import `import com.google.gson.JsonArray;`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
import org.json.simple.JSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import fr.inria.coming.changeminer.analyzer.commitAnalyzer.FineGrainDifftAnalyzer;
```

### UNUSED_IMPORT
Unused import `import fr.inria.prophet4j.feature.extended.ExtendedFeatureCross;`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
import fr.inria.prophet4j.feature.Feature;
import fr.inria.prophet4j.feature.FeatureCross;
import fr.inria.prophet4j.feature.extended.ExtendedFeatureCross;
import fr.inria.prophet4j.feature.original.OriginalFeatureCross;
import fr.inria.prophet4j.learner.RepairEvaluator;
```

### UNUSED_IMPORT
Unused import `import fr.inria.prophet4j.learner.RepairEvaluator;`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
import fr.inria.prophet4j.feature.extended.ExtendedFeatureCross;
import fr.inria.prophet4j.feature.original.OriginalFeatureCross;
import fr.inria.prophet4j.learner.RepairEvaluator;
import fr.inria.prophet4j.utility.CodeDiffer;
import fr.inria.prophet4j.utility.Option;
```

### UNUSED_IMPORT
Unused import `import fr.inria.prophet4j.utility.Support;`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
import fr.inria.prophet4j.utility.CodeDiffer;
import fr.inria.prophet4j.utility.Option;
import fr.inria.prophet4j.utility.Support;
import fr.inria.prophet4j.utility.Option.FeatureOption;
import fr.inria.prophet4j.utility.Option.RankingOption;
```

### UNUSED_IMPORT
Unused import `import fr.inria.prophet4j.utility.Option.RankingOption;`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
import fr.inria.prophet4j.utility.Support;
import fr.inria.prophet4j.utility.Option.FeatureOption;
import fr.inria.prophet4j.utility.Option.RankingOption;
import fr.inria.prophet4j.utility.Structure.FeatureMatrix;
import fr.inria.prophet4j.utility.Structure.FeatureVector;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Scanner;`
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.lang3.StringUtils;`
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import com.github.difflib.DiffUtils;
```

### UNUSED_IMPORT
Unused import `import com.google.gson.JsonArray;`
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
import com.github.difflib.patch.Chunk;
import com.github.difflib.patch.Patch;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

```

### UNUSED_IMPORT
Unused import `import spoon.reflect.code.CtTypeAccess;`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
import fr.inria.coming.codefeatures.CodeFeatures;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtClass;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.code.CtLiteral;`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.code.CtTypeAccess;`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
import spoon.reflect.code.CtLoop;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.code.CtWhile;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/fr/inria/coming/core/entities/AnalysisResult.java`
#### Snippet
```java
package fr.inria.coming.core.entities;

import java.util.List;

/**
```

### UNUSED_IMPORT
Unused import `import org.json.simple.JSONObject;`
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
```

### UNUSED_IMPORT
Unused import `import com.google.gson.JsonObject;`
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

```

### UNUSED_IMPORT
Unused import `import fr.inria.coming.codefeatures.P4JFeatureAnalyzer;`
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
import fr.inria.coming.codefeatures.FeatureAnalyzer;
import fr.inria.coming.codefeatures.FeaturesResult;
import fr.inria.coming.codefeatures.P4JFeatureAnalyzer;
import fr.inria.coming.core.entities.AnalysisResult;
import fr.inria.coming.core.entities.RevisionResult;
```

### UNUSED_IMPORT
Unused import `import fr.inria.coming.core.entities.AnalysisResult;`
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
import fr.inria.coming.codefeatures.FeaturesResult;
import fr.inria.coming.codefeatures.P4JFeatureAnalyzer;
import fr.inria.coming.core.entities.AnalysisResult;
import fr.inria.coming.core.entities.RevisionResult;
import fr.inria.coming.core.entities.interfaces.IOutput;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
```

### UNUSED_IMPORT
Unused import `import org.json.simple.JSONObject;`
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
import fr.inria.coming.repairability.models.InstanceStats;
import gumtree.spoon.diff.operations.Operation;
import org.json.simple.JSONObject;

public class JSonPatternInstanceOutput implements IOutput {
```

### UNUSED_IMPORT
Unused import `import org.apache.log4j.Logger;`
in `src/main/java/fr/inria/coming/core/entities/output/StdOutput.java`
#### Snippet
```java
package fr.inria.coming.core.entities.output;

import org.apache.log4j.Logger;

import fr.inria.coming.changeminer.analyzer.commitAnalyzer.FineGrainDifftAnalyzer;
```

### UNUSED_IMPORT
Unused import `import fr.inria.coming.changeminer.analyzer.commitAnalyzer.FineGrainDifftAnalyzer;`
in `src/main/java/fr/inria/coming/core/entities/output/StdOutput.java`
#### Snippet
```java
import org.apache.log4j.Logger;

import fr.inria.coming.changeminer.analyzer.commitAnalyzer.FineGrainDifftAnalyzer;
import fr.inria.coming.changeminer.entity.FinalResult;
import fr.inria.coming.core.entities.RevisionResult;
```

### UNUSED_IMPORT
Unused import `import fr.inria.coming.codefeatures.P4JFeatureAnalyzer;`
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
import fr.inria.coming.changeminer.util.PatternXMLParser;
import fr.inria.coming.codefeatures.FeatureAnalyzer;
import fr.inria.coming.codefeatures.P4JFeatureAnalyzer;
import fr.inria.coming.core.engine.Analyzer;
import fr.inria.coming.core.engine.RevisionNavigationExperiment;
```

### UNUSED_IMPORT
Unused import `import fr.inria.coming.changeminer.analyzer.instancedetector.PatternInstanceAnalyzer;`
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
import fr.inria.coming.changeminer.analyzer.commitAnalyzer.FineGrainDifftAnalyzer;
import fr.inria.coming.changeminer.analyzer.instancedetector.ChangePatternInstance;
import fr.inria.coming.changeminer.analyzer.instancedetector.PatternInstanceAnalyzer;
import fr.inria.coming.changeminer.analyzer.instancedetector.PatternInstancesFromDiff;
import fr.inria.coming.changeminer.analyzer.instancedetector.PatternInstancesFromRevision;
```

### UNUSED_IMPORT
Unused import `import fr.inria.coming.main.ComingProperties;`
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
import fr.inria.coming.core.entities.RevisionResult;
import fr.inria.coming.core.entities.output.JSonPatternInstanceOutput;
import fr.inria.coming.main.ComingProperties;
import fr.inria.coming.repairability.models.InstanceStats;
import gumtree.spoon.diff.Diff;
```

### UNUSED_IMPORT
Unused import `import spoon.Launcher;`
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
import gumtree.spoon.diff.operations.Operation;
import gumtree.spoon.diff.operations.UpdateOperation;
import spoon.Launcher;
import spoon.reflect.code.CtAbstractInvocation;
import spoon.reflect.code.CtLocalVariable;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.declaration.CtClass;`
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtTypedElement;
```

### UNUSED_IMPORT
Unused import `import com.github.gumtreediff.actions.model.Delete;`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
package fr.inria.coming.repairability.repairtools;

import com.github.gumtreediff.actions.model.Delete;
import com.github.gumtreediff.actions.model.Insert;
import com.github.gumtreediff.matchers.MappingStore;
```

### UNUSED_IMPORT
Unused import `import javax.naming.ldap.SortResponseControl;`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
import spoon.reflect.visitor.filter.TypeFilter;

import javax.naming.ldap.SortResponseControl;
import java.io.File;
import java.util.*;
```

### UNUSED_IMPORT
Unused import `import gumtree.spoon.diff.operations.MoveOperation;`
in `src/main/java/fr/inria/coming/repairability/repairtools/JKali.java`
#### Snippet
```java
import gumtree.spoon.diff.operations.DeleteOperation;
import gumtree.spoon.diff.operations.InsertOperation;
import gumtree.spoon.diff.operations.MoveOperation;
import gumtree.spoon.diff.operations.Operation;
import spoon.reflect.declaration.CtElement;
```

### UNUSED_IMPORT
Unused import `import com.github.gumtreediff.tree.ITree;`
in `src/main/java/fr/inria/coming/repairability/repairtools/JMutRepair.java`
#### Snippet
```java
package fr.inria.coming.repairability.repairtools;

import com.github.gumtreediff.tree.ITree;
import fr.inria.coming.changeminer.analyzer.instancedetector.ChangePatternInstance;
import fr.inria.coming.changeminer.analyzer.patternspecification.ChangePatternSpecification;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import fr.inria.coming.utils.EntityTypesInfoResolver;`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
import fr.inria.coming.repairability.models.ASTData;
import fr.inria.coming.utils.ASTInfoResolver;
import fr.inria.coming.utils.EntityTypesInfoResolver;
import gumtree.spoon.diff.Diff;
import gumtree.spoon.diff.operations.InsertOperation;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.visitor.filter.TypeFilter;`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;

/**
```

### UNUSED_IMPORT
Unused import `import com.github.gumtreediff.actions.model.Delete;`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
import java.util.Set;

import com.github.gumtreediff.actions.model.Delete;
import com.github.gumtreediff.actions.model.Insert;
import com.github.gumtreediff.matchers.MappingStore;
```

### UNUSED_IMPORT
Unused import `import com.github.gumtreediff.actions.model.Insert;`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java

import com.github.gumtreediff.actions.model.Delete;
import com.github.gumtreediff.actions.model.Insert;
import com.github.gumtreediff.matchers.MappingStore;
import com.github.gumtreediff.tree.ITree;
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `src/main/java/fr/inria/coming/utils/CommandSummary.java`
#### Snippet
```java
package fr.inria.coming.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import static fr.inria.prophet4j.feature.S4RO.S4ROFeature.CrossType;`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureCross.java`
#### Snippet
```java

import static fr.inria.prophet4j.feature.S4RO.S4ROFeature.*;
import static fr.inria.prophet4j.feature.S4RO.S4ROFeature.CrossType;

public class S4ROFeatureCross implements FeatureCross, Serializable {
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.code.CtIf;`
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
import fr.inria.prophet4j.feature.extended.util.ExtendedRepairAnalyzer;
import spoon.Launcher;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.code.CtStatement;`
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
import spoon.Launcher;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.declaration.CtClass;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.code.CtStatementList;`
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
```

### UNUSED_IMPORT
Unused import `import fr.inria.prophet4j.feature.original.OriginalFeature.AtomicFeature;`
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
import fr.inria.prophet4j.feature.Feature;
import fr.inria.prophet4j.feature.FeatureCross;
import fr.inria.prophet4j.feature.original.OriginalFeature.AtomicFeature;

import static fr.inria.prophet4j.feature.original.OriginalFeature.*;
```

### UNUSED_IMPORT
Unused import `import java.util.HashSet;`
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `srcMvTrees` are updated, but never queried
in `src/main/java/fr/inria/coming/utils/OperationClassifier.java`
#### Snippet
```java
		Set<ITree> srcUpdTrees = new HashSet<>();
		Set<ITree> dstUpdTrees = new HashSet<>();
		Set<ITree> srcMvTrees = new HashSet<>();
		Set<ITree> dstMvTrees = new HashSet<>();
		Set<ITree> srcDelTrees = new HashSet<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `diffOfcommit` are updated, but never queried
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
	@SuppressWarnings("unchecked")
	public JsonArray processFilesPair(File pairFolder) {
		Map<String, Diff> diffOfcommit = new HashMap();

		JsonArray filesArray = new JsonArray();
```

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
			Set<CtElement> insDistinctParsSet = new HashSet<CtElement>();
			insDistinctParsSet.addAll(insPars);
			insDistinctParsSet.removeAll(delPars);
			
			if (insDistinctParsSet.size() == insPars.size())
```

## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/Main.java`
#### Snippet
```java
//	}
	
	public static void main() throws Exception {
	FragmentableComparator comp = new LineComparator();
	comp.compare("AlterTableAlterColumn_r4076_src.java",
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java

	protected void detectRenames(RevTree revTree)
			throws MissingObjectException, IncorrectObjectTypeException, CorruptObjectException, IOException {
		TreeWalk tw = new TreeWalk(repository);
		tw.setRecursive(true);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java

	protected void detectRenames(RevTree revTree)
			throws MissingObjectException, IncorrectObjectTypeException, CorruptObjectException, IOException {
		TreeWalk tw = new TreeWalk(repository);
		tw.setRecursive(true);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java

	protected void detectRenames(RevTree revTree)
			throws MissingObjectException, IncorrectObjectTypeException, CorruptObjectException, IOException {
		TreeWalk tw = new TreeWalk(repository);
		tw.setRecursive(true);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java

	@Override
	public boolean include(TreeWalk walker) throws MissingObjectException, IncorrectObjectTypeException, IOException {
		int n = walker.getTreeCount();
		if (n == 1) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java

	@Override
	public boolean include(TreeWalk walker) throws MissingObjectException, IncorrectObjectTypeException, IOException {
		int n = walker.getTreeCount();
		if (n == 1) {
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SLineComparator.java`
#### Snippet
```java
		String ret = "";
		for (int i = 0; i < this.fLines.length; i++)
			ret += this.fLines[i];
		return ret;
	}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
		String ret = "";
		for (int i = 0; i < this.fTokens.length; i++)
			ret += fTokens[i] + "\n";
		return ret;
	}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/core/entities/DiffResult.java`
#### Snippet
```java
		String r = "";
		for (String file : this.diffOfFiles.keySet()) {
			r += "\n" + ("-" + file);

			R idiff = this.diffOfFiles.get(file);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/changeminer/entity/FinalResult.java`
#### Snippet
```java
		for (R revision : this.keySet()) {

			r += "\n" + ("" + revision.toString());
			RevisionResult rv = this.get(revision);

```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/changeminer/entity/FinalResult.java`
#### Snippet
```java
			for (String processorName : rv.keySet()) {

				r += "\n" + processorName;
				AnalysisResult result = rv.get(processorName);
				try {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/HunkDifftAnalyzer.java`
#### Snippet
```java

				for (int i = diffInfo.ancestorStart(); i < diffInfo.ancestorEnd(); i++) {
					left += fPreviousVersion.getFragment(i) + "\n";
				}

```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/HunkDifftAnalyzer.java`
#### Snippet
```java
				for (int i = diffInfo.rightStart(); i < diffInfo.rightEnd(); i++) {

					right += fNextVersion.getFragment(i) + "\n";
				}

```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromRevision.java`
#### Snippet
```java
		String r = "";
		for (PatternInstancesFromDiff patternInstancesFromDiff : infoPerDiff) {
			r += "\n" + patternInstancesFromDiff.toString();
		}

```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
			String resultString = "\n----For Diff:" + diffString + "\n: number instances found: " + instances.size();
			for (ChangePatternInstance instance : instances) {
				resultString += "\n" + instance.toString();
			}
			return resultString;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
                for (int idx = 0; idx < parameterVector.size(); idx++) {
			jsonfile.addProperty(header.get(idx), valueList.get(idx));
			valueStr+=valueList.get(idx)+",";  	 
			head+=idx+",";
    	        }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
			jsonfile.addProperty(header.get(idx), valueList.get(idx));
			valueStr+=valueList.get(idx)+",";  	 
			head+=idx+",";
    	        }
                
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
				for (Entry<String, JsonElement> extractedFeatureSet : jsonfile.entrySet()) {
					if (feature.contains(extractedFeatureSet.getKey())) {
						features += extractedFeatureSet.getValue() + ",";
					}
				}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
				for (Entry<String, JsonElement> extractedFeatureSet : repairPatterns.entrySet()) {
					if (feature.contains(extractedFeatureSet.getKey())) {
						features += extractedFeatureSet.getValue() + ",";
					}
				}
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
			for (int i = 0; i < featureList.length; i++) {
				if (!"0".equals(featureList[i])) {
					libsvmFeature = libsvmFeature + (i + 1) + ":" + featureList[i] + " ";
				}
			}
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `rootDirectory` initializer `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDatasets.java`
#### Snippet
```java
	 * The folder where all the diff are located
	 */
	protected File rootDirectory = null;

	public FileDatasets(File rootDirectory) {
```

### UnusedAssignment
Variable `flocation` initializer `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileNavigationExperiment.java`
#### Snippet
```java
public class FileNavigationExperiment extends RevisionNavigationExperiment<IRevision> {

	public File flocation = null;

	public FileNavigationExperiment() {
```

### UnusedAssignment
Variable `totalNumberFiles` initializer `0` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java
	 * The numbers of files from the dataset
	 */
	protected int totalNumberFiles = 0;

	public FileDynamicIterator(File rootDirectory) {
```

### UnusedAssignment
Variable `rootDirectory` initializer `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java
	 * The folder where all the diff are located
	 */
	protected File rootDirectory = null;
	/**
	 * The numbers of files from the dataset
```

### UnusedAssignment
Variable `diffFolder` initializer `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
	Logger log = Logger.getLogger(FileDiff.class.getName());

	protected File diffFolder = null;

	public FileDiff(File diffFolder) {
```

### UnusedAssignment
Variable `right` initializer `""` is redundant
in `src/main/java/fr/inria/coming/core/entities/HunkPair.java`
#### Snippet
```java
public class HunkPair {
	String left = "";
	String right = "";

	public HunkPair(String left, String right) {
```

### UnusedAssignment
Variable `left` initializer `""` is redundant
in `src/main/java/fr/inria/coming/core/entities/HunkPair.java`
#### Snippet
```java
 */
public class HunkPair {
	String left = "";
	String right = "";

```

### UnusedAssignment
Variable `relatedRevision` initializer `null` is redundant
in `src/main/java/fr/inria/coming/core/entities/RevisionResult.java`
#### Snippet
```java
public class RevisionResult extends HashMap<String, AnalysisResult> {

	IRevision relatedRevision = null;

	public RevisionResult(IRevision oneRevision) {
```

### UnusedAssignment
Variable `diffOfFiles` initializer `null` is redundant
in `src/main/java/fr/inria/coming/core/entities/DiffResult.java`
#### Snippet
```java
	 * Filename
	 */
	Map<String, R> diffOfFiles = null;

	public DiffResult(T analyzed, Map<String, R> diffOfFiles) {
```

### UnusedAssignment
Variable `par` initializer `null` is redundant
in `src/main/java/fr/inria/coming/utils/ASTInfoResolver.java`
#### Snippet
```java

	public static List<CtElement> getPathToRootNode(CtElement element) {
		CtElement par = null;
		try {
			par = element.getParent();
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `src/main/java/fr/inria/coming/core/extensionpoints/PlugInLoader.java`
#### Snippet
```java

	public static Object loadPlugin(String className, Class type) throws Exception {
		Object object = null;
		try {
			Class classDefinition = Class.forName(className);
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `src/main/java/fr/inria/coming/core/extensionpoints/PlugInLoader.java`
#### Snippet
```java

	public static Object loadPlugin(String className, Class type, Class[] typesConst, Object[] args) throws Exception {
		Object object = null;
		try {
			Class classDefinition = Class.forName(className);
```

### UnusedAssignment
Variable `namePattern` initializer `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
			String nameFromSpecification = docElement.getAttribute("name");

			String namePattern = null;
			if (nameFromSpecification != null && !nameFromSpecification.isEmpty())
				namePattern = nameFromSpecification;
```

### UnusedAssignment
Variable `cmd` initializer `null` is redundant
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
	public boolean createEngine(String[] args) {
		ComingProperties.reset();
		CommandLine cmd = null;
		this.navigatorEngine = null;
		try {
```

### UnusedAssignment
Variable `listV` initializer `null` is redundant
in `src/main/java/fr/inria/coming/utils/MapList.java`
#### Snippet
```java

	public void add(K key, V value) {
		List<V> listV = null;
		if (!this.containsKey(key)) {
			listV = new ArrayList<V>();
```

### UnusedAssignment
Variable `includeComments` initializer `false` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
	protected GranuralityType granularity;

	protected boolean includeComments = false;

	/**
```

### UnusedAssignment
Variable `cdiff` initializer `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
	Logger log = Logger.getLogger(FineGrainDifftAnalyzer.class.getName());

	protected AstComparator cdiff = null;

	protected GranuralityType granularity;
```

### UnusedAssignment
Variable `diffString` initializer `""` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
				return "--Diff null--";
			}
			String diffString = "";

			try {
```

### UnusedAssignment
Variable `features` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/FeaturesResult.java`
#### Snippet
```java
public class FeaturesResult extends AnalysisResult<IRevision> {

	JsonElement features = null;

	public FeaturesResult(IRevision analyzed, JsonElement features) {
```

### UnusedAssignment
Variable `entityType` initializer `ANY` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/PatternEntity.java`
#### Snippet
```java
	public final static String ANY = "*";
	protected int id;
	protected String entityType = ANY;
	protected String newValue = null;
	protected String oldValue = null;
```

### UnusedAssignment
Variable `newValue` initializer `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/PatternEntity.java`
#### Snippet
```java
	protected int id;
	protected String entityType = ANY;
	protected String newValue = null;
	protected String oldValue = null;
	protected String roleInParent = ANY;
```

### UnusedAssignment
Variable `bothArray` initializer `false` is redundant
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
				// is compatible with with that one out of scope

			boolean bothArray = false;
			boolean notCompatible = false;
			do {
```

### UnusedAssignment
The value changed at `i_hunk++` is never used
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java

			File postVersion = new File(pathname + "_t.java");
			i_hunk++;

			JsonObject file = new JsonObject();
```

### UnusedAssignment
The value `diffResut.getDiffOfFiles().keySet().iterator().next().toString()` assigned to `filename` is never used
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		String filename = "";
		if (diffResut.getDiffOfFiles().size()!=0) {
			filename =  diffResut.getDiffOfFiles().keySet().iterator().next().toString();		
		}else {
			filename = diffResut.getAnalyzed().toString();
```

### UnusedAssignment
The value `diffResut.getAnalyzed().toString()` assigned to `filename` is never used
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
			filename =  diffResut.getDiffOfFiles().keySet().iterator().next().toString();		
		}else {
			filename = diffResut.getAnalyzed().toString();
		}

```

### UnusedAssignment
Variable `filePaths` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		// determine source and target file path
		String path = revision.getFolder();
		Map<String, File> filePaths = null;
		if(path!=null) {
			filePaths = processFilesPair(new File(path),"");
```

### UnusedAssignment
Variable `filePaths` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
	public AnalysisResult analyze(IRevision revision, String targetFile) {
		String path = revision.getFolder();
		Map<String, File> filePaths = null;
		if(path!=null) {
			filePaths = processFilesPair(new File(path),targetFile);
```

### UnusedAssignment
Variable `jsonfile` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		List<FeatureMatrix> featureMatrix = codeDiffer.runByGenerator(src, target);
		//Get feature vector
		JsonObject jsonfile = null;
		if(cross) {
			jsonfile = genVectorsCSV(option,target,featureMatrix);
```

### UnusedAssignment
The value `genVectorsCSV(option,target,featureMatrix)` assigned to `jsonfile` is never used
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		JsonObject jsonfile = null;
		if(cross) {
			jsonfile = genVectorsCSV(option,target,featureMatrix);
			return null;
		} else {
```

### UnusedAssignment
Variable `logicalExpressions` initializer `new ArrayList()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
	public List<CtTypeAccess> typeaccess;

	public List<CtExpression> logicalExpressions = new ArrayList();

	public List<CtExpression> desirableExpressions = new ArrayList();
```

### UnusedAssignment
Variable `key` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java

	private Object determineKey(CtElement element) {
		String key = null;
		if (element.getPosition() != null && element.getPosition().getFile() != null) {
			key = element.getPosition().getFile().getName().toString();
```

### UnusedAssignment
Variable `binoperators` initializer `new ArrayList()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
	public List<CtExpression> desirableExpressions = new ArrayList();

	public List<CtBinaryOperator> binoperators = new ArrayList();

	public CodeElementInfo(CtElement elementoriginal, List<CtExpression> allExpressions,
```

### UnusedAssignment
Variable `desirableExpressions` initializer `new ArrayList()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
	public List<CtExpression> logicalExpressions = new ArrayList();

	public List<CtExpression> desirableExpressions = new ArrayList();

	public List<CtBinaryOperator> binoperators = new ArrayList();
```

### UnusedAssignment
Variable `tempFile` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
		// Load test data in libsvm format
		
		File tempFile = null;
		try {
			tempFile = File.createTempFile("test", ".txt");
```

### UnusedAssignment
Variable `in` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
		String odsModelPath = ComingProperties.getProperty(ODS_MODEL);
		File modelFile = new File(odsModelPath);
		InputStream in = null;
		if (modelFile.exists()) {
			in = new FileInputStream(modelFile);
```

### UnusedAssignment
Variable `currentNodeFromAction` initializer `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
        PatternEntity parentEntity = affectedEntity;
        // Let's get the parent of the affected
        CtElement currentNodeFromAction = null;
        boolean matchnewvalue = false;

```

### UnusedAssignment
Variable `matchnewvalue` initializer `false` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
        // Let's get the parent of the affected
        CtElement currentNodeFromAction = null;
        boolean matchnewvalue = false;

        // Search the node to select according to the type of operation and the pattern
```

### UnusedAssignment
Variable `operatorstring` initializer `""` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
		BinaryOperatorKind operatorkind = operatorunderstudy.getKind();
		
		String operatorstring="";
		
		if(logicalOperator.contains(operatorkind)) {
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/RepairTools.java`
#### Snippet
```java
     */
    public static AbstractRepairTool getRepairToolInstance(String toolName) {
        AbstractRepairTool object = null;
        try {
            if (supportsTool(toolName) < 0) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
		}

		PatternInstancesFromRevision result = null;
		result = (PatternInstancesFromRevision) revisionResult.getResultFromClass(RepairabilityAnalyzer.class);
		for (PatternInstancesFromDiff pi : result.getInfoPerDiff()) {
```

### UnusedAssignment
Variable `elementAsString` initializer `""` is redundant
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
		List<CtElement> elementsInConditional = condition.getElements(null);
		for (CtElement element : elementsInConditional) {
			String elementAsString = "";
			if (element instanceof CtAbstractInvocation) {
				elementAsString = getExecutableQualifiedSignature(element);
```

### UnusedAssignment
Variable `srcNode` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
    @Override
    public boolean filter(ChangePatternInstance instance, IRevision revision, Diff diff) {
        CtElement srcNode = null, dstNode = null;
        if (instance.getPattern().getName().contains(UPD_PATTERN_NAME)) {
            Operation anyOperation = instance.getActions().get(0);
```

### UnusedAssignment
Variable `dstNode` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
    @Override
    public boolean filter(ChangePatternInstance instance, IRevision revision, Diff diff) {
        CtElement srcNode = null, dstNode = null;
        if (instance.getPattern().getName().contains(UPD_PATTERN_NAME)) {
            Operation anyOperation = instance.getActions().get(0);
```

### UnusedAssignment
Variable `srcNode` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
		Operation op = patternInstance.getActions().get(0);

		CtElement srcNode = null, dstMappedExpression = null, dstMappedElement = null, dstNode = null;

		if (op instanceof UpdateOperation) {
```

### UnusedAssignment
Variable `dstMappedElement` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
		Operation op = patternInstance.getActions().get(0);

		CtElement srcNode = null, dstMappedExpression = null, dstMappedElement = null, dstNode = null;

		if (op instanceof UpdateOperation) {
```

### UnusedAssignment
Variable `dstNode` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
		Operation op = patternInstance.getActions().get(0);

		CtElement srcNode = null, dstMappedExpression = null, dstMappedElement = null, dstNode = null;

		if (op instanceof UpdateOperation) {
```

### UnusedAssignment
Variable `dstCondition` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
			Set<CtElement> res = new HashSet<CtElement>();
			Operation op = instance.getActions().get(0);
			CtElement dstCondition = null, srcCondition = null;

			if (op instanceof InsertOperation || op instanceof UpdateOperation) {
```

### UnusedAssignment
Variable `srcCondition` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
			Set<CtElement> res = new HashSet<CtElement>();
			Operation op = instance.getActions().get(0);
			CtElement dstCondition = null, srcCondition = null;

			if (op instanceof InsertOperation || op instanceof UpdateOperation) {
```

### UnusedAssignment
Variable `srcRootNode` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java

		if (patternType.startsWith(IF_UPD_DEEP_PATTERN)) {
			CtElement srcRootNode = null, dstCondition = null;
			Operation op = instance.getActions().get(0);

```

### UnusedAssignment
Variable `dstCondition` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java

		if (patternType.startsWith(IF_UPD_DEEP_PATTERN)) {
			CtElement srcRootNode = null, dstCondition = null;
			Operation op = instance.getActions().get(0);

```

### UnusedAssignment
Variable `srcRoot` initializer `null` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
				return false;

			CtElement srcRoot = null, dstRoot = ASTInfoResolver.getRootNode(insertedIf);
			ITree dstRootTree = (ITree) dstRoot.getMetadata("gtnode");
			
```

### UnusedAssignment
Variable `m9methodobjective` initializer `false` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				boolean m4methodHasCompatibleParameterAndReturnSameMethod = false;
				boolean m8methodprimitive = false;
				boolean m9methodobjective = false;
				
				if ((invocation.getType()!=null && (invocation.getType().isPrimitive() || 
```

### UnusedAssignment
Variable `isObject` initializer `false` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				CtVariable ctVariable = aVariableAccess.getVariable().getDeclaration();
				boolean isPrimitive = false; 
				boolean isObject = false;
				
				if (ctVariable != null && ctVariable.getReference() != null
```

### UnusedAssignment
Variable `humanFile` initializer `null` is redundant
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        FilenameFilter javaFilter = (dir, name) -> name.endsWith(".java");
        for (File eachFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            File humanFile = null;
            try {
                File[] humanFiles = new File(eachFile.getPath() + "/human").listFiles(javaFilter);
```

### UnusedAssignment
Variable `humanFile` initializer `null` is redundant
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        FilenameFilter javaFilter = (dir, name) -> name.endsWith(".java");
        for (File eachFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            File humanFile = null;
            try {
                File[] humanFiles = new File(eachFile.getPath() + "/human").listFiles(javaFilter);
```

### UnusedAssignment
Variable `condition` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		// Two cases: if and conditional
		CtExpression condition = null;
		CtConditional parentConditional = element.getParent(CtConditional.class);

```

### UnusedAssignment
Variable `inferredtype` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
			inferredpotentionaltypes.clear();

			CtTypeReference inferredtype = null;
			if (ainvocation.getType() == null) {
				for (CtBinaryOperator certainbinary : binaryOperatorInClass) {
```

### UnusedAssignment
Variable `condition` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		// Two cases: if and conditional
		CtExpression condition = null;
		CtConditional parentConditional = element.getParent(CtConditional.class);

```

### UnusedAssignment
Variable `patchedFile` initializer `null` is redundant
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            String pathName = info[1] + info[2];
            File buggyFile = null;
            File patchedFile = null;
            for (File dataFile : file.listFiles((dir, name) -> !name.startsWith("."))) {
                if (dataFile.getName().equals("buggy")) {
```

### UnusedAssignment
Variable `medianNumerator` initializer `0` is redundant
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
                numerators.add((double) (int) fraction.numerator);
            }
            double medianNumerator = 0;
            if (size % 2 == 0) {
                medianNumerator = (numerators.get(size / 2 - 1) + numerators.get(size / 2)) / 2;
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
                    // get the matching of each action
                    MatchingEntity meA = instance.getMapping().get(actionA).getMatching().stream()
                            .filter(e -> e.patternEntity == entityRelation.getEntity()).findFirst().get();

                    MatchingEntity meB = instance.getMapping().get(actionB).getMatching().stream()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java

                    MatchingEntity meB = instance.getMapping().get(actionB).getMatching().stream()
                            .filter(e -> e.patternEntity == entityRelation.getEntity()).findFirst().get();

                    // == comparing objects.
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `rows` is always 'null'
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/HunkDifftAnalyzer.java`
#### Snippet
```java
		List<DiffRow> rows = null;

		return (new DiffResult<IRevision, HunkDiff>(revision, diffOfFiles,rows));
	}

```

### ConstantValue
Condition `nameFromSpecification != null` is always `true`
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java

			String namePattern = null;
			if (nameFromSpecification != null && !nameFromSpecification.isEmpty())
				namePattern = nameFromSpecification;
			else
```

### ConstantValue
Condition `type != null` is always `true`
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
					String role = eElement.getAttribute("role");

					type = (type != null && !type.trim().isEmpty()) ? type : PatternEntity.ANY;
					value = (value != null && !value.trim().isEmpty()) ? value : PatternEntity.ANY;
					role = (role != null && !role.trim().isEmpty()) ? role : PatternEntity.ANY;
```

### ConstantValue
Condition `value != null` is always `true`
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java

					type = (type != null && !type.trim().isEmpty()) ? type : PatternEntity.ANY;
					value = (value != null && !value.trim().isEmpty()) ? value : PatternEntity.ANY;
					role = (role != null && !role.trim().isEmpty()) ? role : PatternEntity.ANY;

```

### ConstantValue
Condition `role != null` is always `true`
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
					type = (type != null && !type.trim().isEmpty()) ? type : PatternEntity.ANY;
					value = (value != null && !value.trim().isEmpty()) ? value : PatternEntity.ANY;
					role = (role != null && !role.trim().isEmpty()) ? role : PatternEntity.ANY;

					PatternEntity pEntity = new PatternEntity(type, value);
```

### ConstantValue
Condition `idEntity != null` is always `true`
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java

					idEntities.put(idEntity, pEntity);
					if (idEntity != null && !idEntity.isEmpty())
						pEntity.setId(Integer.valueOf(idEntity));

```

### ConstantValue
Condition `type == null` is always `false`
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java

					ActionType type = "*".equals(action) ? ActionType.ANY : ActionType.valueOf(action);
					if (type == null)
						throw new Exception("Action Type not identified");

```

### ConstantValue
Condition `at != null` is always `true`
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			ActionType at = ActionType.valueOf(actionProperty);

			if (at != null && (entityTypeProperty != null || entityValueProperty != null)) {
				ChangePatternSpecification cpattern = new ChangePatternSpecification();
				PatternEntity affectedEntity = new PatternEntity(entityTypeProperty, entityValueProperty);
```

### ConstantValue
Condition `newFilters != null` is always `true`
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
	private void loadFilters() {
		List<IFilter> newFilters = createFilters();
		if (newFilters != null && !newFilters.isEmpty()) {
			if (navigatorEngine.getFilters() == null)
				navigatorEngine.setFilters(newFilters);
```

### ConstantValue
Condition `!(e instanceof RuntimeException)` is always `false`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
			return resultString;
		} catch (Exception e) {
			if (!(e instanceof RuntimeException)) throw new RuntimeException(e);
		}
		return "--Diff ex--";
```

### ConstantValue
Condition `resultFromDiffAnalysis == null` is always `false`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		}

		if (resultFromDiffAnalysis == null) {
			System.err.println("Error Diff must be executed before");
			throw new IllegalArgumentException("Error: missing diff");
```

### ConstantValue
Condition `parentClass != null` is always `true`
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
		try {
			allMethods.addAll(parentClass.getAllMethods());
			if (parentClass != null && parentClass.getParent() instanceof CtClass) {
				CtClass parentParentClass = (CtClass) parentClass.getParent();
				allMethods.addAll(parentParentClass.getAllMethods());
```

### ConstantValue
Condition `typeOfNode != null` is always `true` when reached
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
                    ("*".equals(parentEntity.getEntityType())
//                            || (typeOfNode != null && typeOfNode.equals(parentEntity.getEntityType())))
                            || (typeOfNode != null &&
                                    EntityTypesInfoResolver.getInstance().isAChildOf(typeOfNode, parentEntity.getEntityType())))
                            ///
```

### ConstantValue
Condition `roleInParent != null` is always `true` when reached
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
                            &&
                            // role
                            ("*".equals(parentEntity.getRoleInParent()) || (roleInParent != null
                                    && roleInParent.equals(parentEntity.getRoleInParent().toLowerCase())))) {
                MatchingEntity match = new MatchingEntity(currentNodeFromAction, parentEntity);
```

### ConstantValue
Condition `name != null` is always `true` when reached
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
				for (CtInvocation invocation : invocationstostudy) {
					String name = invocation.getExecutable().getSimpleName();
					if (!name.isEmpty() && name != null) {

						if (name.toLowerCase().indexOf("close") != -1 || name.toLowerCase().indexOf("connection") != -1
```

### ConstantValue
Condition `name != null` is always `true` when reached
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
					for (CtConstructorCall constructorcall : constructorcalls) {
						String name = getSimplenameForConstructorCall(constructorcall);
						if (!name.isEmpty() && name != null) {

							if (name.toLowerCase().indexOf("stream") != -1 || name.toLowerCase().indexOf("file") != -1
```

### ConstantValue
Condition `op instanceof InsertOperation` is always `true`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
			if (op instanceof UpdateOperation) {
				dstNode = op.getDstNode();
			} else if (op instanceof InsertOperation) {
				dstNode = op.getSrcNode();
			}
```

### ConstantValue
Condition `anotherMethod == null` is always `false`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
					CtMethod anotherMethod = (CtMethod) omethod;
					// Ignoring if it's the same
					if (anotherMethod == null || anotherMethod.getSignature().equals(invocation.getExecutable().getSignature()))
						continue;

```

### ConstantValue
Condition `buggyFile == null` is always `true`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                }
                for (File numFile : typeFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (buggyFile == null) {
                        File[] keyFiles = new File(numFile.getPath() + "/buggy").listFiles(nameFilter);
                        if (keyFiles.length == 1) {
```

### ConstantValue
Condition `isFieldAssigned` is always `false`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
						}

						if (isFieldAssigned)
							break;
					}
```

### ConstantValue
Condition `insertOperation == null` is always `true`
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
                    dstNode = insertOperation.getSrcNode(); // ...
                }
            } else if (deleteOperation != null && DEL != null && insertOperation == null ) {
            		Boolean pureDelete = true;
            		for(Operation op :operations) {
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `inferredpotentionaltypes` is always empty
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				
				List<CtTypeReference> inferredpotentionaltypes = new ArrayList<CtTypeReference>();
				inferredpotentionaltypes.clear();
               
				CtTypeReference inferredtype = null;
```

### RedundantOperationOnEmptyContainer
Collection `inferredpotentionaltypes` is always empty
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			
			List<CtTypeReference> inferredpotentionaltypes = new ArrayList<CtTypeReference>();
			inferredpotentionaltypes.clear();
			
			CtTypeReference inferredtype = null;
```

### RedundantOperationOnEmptyContainer
Collection `inferredpotentionaltypes` is always empty
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

			List<CtTypeReference> inferredpotentionaltypes = new ArrayList<CtTypeReference>();
			inferredpotentionaltypes.clear();

			CtTypeReference inferredtype = null;
```

### RedundantOperationOnEmptyContainer
Collection `inferredpotentionaltypes` is always empty
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
					.stream().map(CtBinaryOperator.class::cast).collect(Collectors.toList());

			inferredpotentionaltypes.clear();

			CtTypeReference inferredtype = null;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.coming.core.entities.RevisionDataset' to 'fr.inria.coming.core.entities.RevisionDataset'
in `src/main/java/fr/inria/coming/core/engine/files/FileNavigationExperiment.java`
#### Snippet
```java
		RevisionDataset dataset = new FileDatasets(flocation);

		return dataset;
	}

```

### UNCHECKED_WARNING
Unchecked call to 'accept(T)' as a member of raw type 'fr.inria.coming.core.entities.interfaces.IFilter'
in `src/main/java/fr/inria/coming/core/filter/AbstractChainedFilter.java`
#### Snippet
```java
	@Override
	public boolean accept(T c) {
		return this.parentFilter.accept(c);
	}

```

### UNCHECKED_WARNING
Unchecked call to 'accept(T)' as a member of raw type 'fr.inria.coming.core.entities.interfaces.IFilter'
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
        for (IFilter iFilter : this.getFilters()) {

            accepted &= iFilter.accept(element);
        }
        return accepted;
```

### UNCHECKED_WARNING
Unchecked call to 'accept(T)' as a member of raw type 'fr.inria.coming.core.entities.interfaces.IFilter'
in `src/main/java/fr/inria/coming/core/filter/commitmessage/BugfixIgnoredFilter.java`
#### Snippet
```java
	@Override
	public boolean accept(Commit c) {
		if (this.parentFilter.accept(c))
		{
			String message = c.getShortMessage().toLowerCase();
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SLineComparator.java`
#### Snippet
```java
        ArrayList ar = new ArrayList();
        while ((line = br.readLine()) != null) {
            ar.add(line);
        }
        // It is the responsibility of the caller to close the stream
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.ArrayList'
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SLineComparator.java`
#### Snippet
```java
        }
        // It is the responsibility of the caller to close the stream
        fLines = (String[]) ar.toArray(new String[ar.size()]);
    }
    
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java
	public List<String> getParents() {

		List<String> parents = new ArrayList();
		for (RevCommit rc : this.revCommit.getParents()) {
			parents.add(rc.getName());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java
	public List<String> getBranches() {

		List<String> branches = new ArrayList();
		// https://www.eclipse.org/forums/index.php/t/280339/
		RevWalk walk = new RevWalk(repo.getRepository());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'. Reason: 'finalResult' has raw type, so result of getAllResults is erased
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
			return;

		Map<IRevision, RevisionResult> results = finalResult.getAllResults();

		for (RevisionResult revresult : results.values()) {
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/fr/inria/coming/core/extensionpoints/PlugInLoader.java`
#### Snippet
```java
		try {
			Class classDefinition = Class.forName(className);
			object = classDefinition.getConstructor(typesConst).newInstance(args);
		} catch (Exception e) {
			log.error("Loading " + className + " --" + e);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set\>'
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
		for (Class clazz : allClasses) {
			String currentClassName = clazz.getSimpleName().substring(2);
			Set<Class<? extends CtElement>> childrenOfCurrentClass = reflections.getSubTypesOf(clazz);
			for (Class childOfCurrentClass : childrenOfCurrentClass) {
				if (!childOfCurrentClass.getSimpleName().startsWith("Ct"))
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
		for (Class clazz : allClasses) {
			String currentClassName = clazz.getSimpleName().substring(2);
			Set<Class<? extends CtElement>> childrenOfCurrentClass = reflections.getSubTypesOf(clazz);
			for (Class childOfCurrentClass : childrenOfCurrentClass) {
				if (!childOfCurrentClass.getSimpleName().startsWith("Ct"))
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
					continue;
				String currentChildName = childOfCurrentClass.getSimpleName().substring(2);
				childrenToParents.get(currentChildName).add(currentClassName);
			}
			childrenToParents.get(currentClassName).add(currentClassName); // each class is considered as an ancestor of
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
				childrenToParents.get(currentChildName).add(currentClassName);
			}
			childrenToParents.get(currentClassName).add(currentClassName); // each class is considered as an ancestor of
																			// itself
		}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
			String className = childToParents.getKey();
			pw.print(className + ":");
			Set<String> parents = childToParents.getValue();
			for (String parent : parents) {
				pw.print(" " + parent);
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.coming.core.entities.interfaces.IRevisionPair' to 'fr.inria.coming.core.entities.interfaces.IRevisionPair'
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/HunkDifftAnalyzer.java`
#### Snippet
```java
		Map<String, HunkDiff> diffOfFiles = new HashMap<>();

		for (IRevisionPair<String> fileFromRevision : javaFiles) {

			HunkDiff hunks = getNumberChanges(fileFromRevision.getPreviousVersion(), fileFromRevision.getNextVersion());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
	private List<ChangePatternSpecification> loadPattern() {
		String patternProperty = ComingProperties.getProperty("pattern");
		List<ChangePatternSpecification> patternsFound = new ArrayList();

		if (patternProperty != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.coming.core.entities.interfaces.IRevisionPair' to 'fr.inria.coming.core.entities.interfaces.IRevisionPair'
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
		log.info("\n*****\nCommit: " + revision.getName());

		for (IRevisionPair<String> fileFromRevision : javaFiles) {

			String left = fileFromRevision.getPreviousVersion();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/ChangePatternInstance.java`
#### Snippet
```java
	public ChangePatternInstance(ChangePatternSpecification relatedPattern) {
		super();
		this.actions = new ArrayList();
		this.actionOperation = new HashMap();
		this.pattern = relatedPattern;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/ChangePatternInstance.java`
#### Snippet
```java
		super();
		this.actions = new ArrayList();
		this.actionOperation = new HashMap();
		this.pattern = relatedPattern;
	}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/ChangePatternInstance.java`
#### Snippet
```java
		this.actions = actions;
		this.pattern = relatedPattern;
		this.actionOperation = new HashMap();
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/SpreadPatternInstanceAnalyzer.java`
#### Snippet
```java
public class SpreadPatternInstanceAnalyzer implements Analyzer {

	List<ChangePatternSpecification> patternsToMine = new ArrayList();

	public SpreadPatternInstanceAnalyzer() {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'diffResut' has raw type, so result of getRow_list is erased
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstanceAnalyzer.java`
#### Snippet
```java
		}

		PatternInstancesFromRevision revisionResult = new PatternInstancesFromRevision(input, instancesAll,diffResut.getRow_list());

		return (revisionResult);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstanceAnalyzer.java`
#### Snippet
```java
public class PatternInstanceAnalyzer implements Analyzer {

	List<ChangePatternSpecification> patternsToMine = new ArrayList();

	public PatternInstanceAnalyzer() {
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.coming.core.entities.interfaces.IRevisionPair' to 'fr.inria.coming.core.entities.interfaces.IRevisionPair'
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
				File tempFile = File.createTempFile("add_", ".diff");
				try (FileWriter sb = new FileWriter(tempFile)) {
					for (IRevisionPair<String> fileFromRevision : revision.getChildren()) {
						String previousVersion = fileFromRevision.getPreviousVersion();
						String nextVersion = fileFromRevision.getNextVersion();
```

### UNCHECKED_WARNING
Unchecked cast: 'fr.inria.coming.core.entities.AnalysisResult' to 'fr.inria.coming.core.entities.DiffResult'
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
		AnalysisResult resultsHunk = previousResults.get(HunkDifftAnalyzer.class.getSimpleName());
		if (resultsHunk != null) {
			DiffResult<Commit, HunkDiff> hunkresults = (DiffResult<Commit, HunkDiff>) resultsHunk;
			HunkDiff hunks = hunkresults.getDiffOfFiles().get(nameFile);
			if (hunks != null && hunks.getHunkpairs() != null)
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Boolean' to 'I'
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java

	public boolean isBooleanValueTrue(String key) {
		I res = information.getOrDefault(key, (I)Boolean.FALSE);
		return Boolean.valueOf(res.toString());
	}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java

	public Map processFilesPair(File pairFolder,String targetFile) {
		Map<String, File> pathmap = new HashMap();

		for (File fileModif : pairFolder.listFiles()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		Map<String, File> filePaths = null;
		if(path!=null) {
			filePaths = processFilesPair(new File(path),"");
		} else {
			return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		Map<String, File> filePaths = null;
		if(path!=null) {
			filePaths = processFilesPair(new File(path),targetFile);
		} else {
			return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
	public List<CtTypeAccess> typeaccess;

	public List<CtExpression> logicalExpressions = new ArrayList();

	public List<CtExpression> desirableExpressions = new ArrayList();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
	public List<CtExpression> desirableExpressions = new ArrayList();

	public List<CtBinaryOperator> binoperators = new ArrayList();

	public CodeElementInfo(CtElement elementoriginal, List<CtExpression> allExpressions,
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java

		try {
			allMethods.addAll(parentClass.getAllMethods());
			if (parentClass != null && parentClass.getParent() instanceof CtClass) {
				CtClass parentParentClass = (CtClass) parentClass.getParent();
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
			if (parentClass != null && parentClass.getParent() instanceof CtClass) {
				CtClass parentParentClass = (CtClass) parentClass.getParent();
				allMethods.addAll(parentParentClass.getAllMethods());
			}
		} catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
	public List<CtExpression> logicalExpressions = new ArrayList();

	public List<CtExpression> desirableExpressions = new ArrayList();

	public List<CtBinaryOperator> binoperators = new ArrayList();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/CodeFeatureDetector.java`
#### Snippet
```java
        }

        List<CtExpression> logicalExpressions = new ArrayList();
        for (int index = 0; index < expressionssFromFaultyLine.size(); index++) {

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
		try {

			List<CtLiteral> allConstant = new ArrayList();

			allConstant.addAll(literalsFromFaultyLine);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
			
			
			List<CtLiteral> literalsFromClass = new ArrayList();
			if(parentClass!=null)
			  literalsFromClass = parentClass.getElements(e -> (e instanceof CtLiteral)).stream()
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		addThis=0;
		
		Map<String, File> filePaths = new P4JFeatureAnalyzer().processFilesPair(new File(folderPath),targetFile);
		File src = filePaths.get("src");
		File target = filePaths.get("target");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java

	private static void patchAnalysis(String folderPath) {
		Map<String, File> pathmap = new HashMap();
		File pairFolder = new File(folderPath);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/TypeaccessAnalyzer.java`
#### Snippet
```java
		
		try {
			List<CtTypeAccess> typeaccesss = new ArrayList();
			if(parentClass!=null)
			    typeaccesss = parentClass.getElements(new TypeFilter<>(CtTypeAccess.class));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
	private boolean scannotoperator (CtExpression expressiontostudy) {
		
		List<String> unaryOps = new ArrayList();
		
		CtScanner scanner = new CtScanner() {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/fr/inria/coming/repairability/RepairabilityAnalyzer.java`
#### Snippet
```java
            if(!toolToInstances.containsKey(toolName))
                toolToInstances.put(toolName, new ArrayList());
            toolToInstances.get(toolName).add(instance);
        }
        for(Map.Entry<String, List> entry : toolToInstances.entrySet()){
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/fr/inria/coming/repairability/RepairabilityAnalyzer.java`
#### Snippet
```java
        for(Map.Entry<String, List> entry : toolToInstances.entrySet()){
            String toolName = entry.getKey();
            List<ChangePatternInstance> instances = entry.getValue();
            AbstractRepairTool tool = RepairTools.getRepairToolInstance(toolName);
            res.addAll(tool.filterSelectedInstances(instances, diff));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: '((CtAbstractInvocation) mappedElement)' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
		Set<String> validInvocationsAsArguments = new HashSet<>();
		if (mappedElement != null && mappedElement instanceof CtAbstractInvocation) {
			List<CtExpression> arguments = ((CtAbstractInvocation) mappedElement).getArguments();
			for (CtExpression argument : arguments) {
				if (argument instanceof CtAbstractInvocation) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: '((CtAbstractInvocation) newNode)' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
			if (!executableInvocations.contains(getExecutableQualifiedSignature(newNode)))
				return false;
			List<CtExpression> arguments = ((CtAbstractInvocation) newNode).getArguments();
			for (CtExpression argument : arguments) {
				if (argument.toString().equals("null"))
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'conAffected' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				boolean Con6ArgumentHasPrimitive = false;
				
				List<CtExpression> invocationArguments = conAffected.getArguments();
				
				for(int index=0; index<invocationArguments.size(); index++ ) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				boolean con1SpecificHasSameName = false;
				
				List<CtConstructor> allconstructorsinclass = new ArrayList();
				if(parentClass!=null)
				     allconstructorsinclass = parentClass.getElements(new TypeFilter<>(CtConstructor.class));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				}
				
				List<CtConstructorCall> allconstructorcallsinclass = new ArrayList();

				if(parentClass!=null)
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				boolean con2SpecificHasSimilarName = false;
				
				List<CtConstructor> allconstructorsinclass = new ArrayList();
                if(parentClass!=null)
				     allconstructorsinclass = parentClass.getElements(new TypeFilter<>(CtConstructor.class));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				}
				
				List<CtConstructorCall> allconstructorcallsinclass = new ArrayList();

				if(parentClass!=null)
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'specificinvocation' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				for (CtInvocation specificinvocation : invocationsFromClass) {
					
					List<CtElement> specificarguments = specificinvocation.getArguments(); 
					
					for(int index=0; index< specificarguments.size(); index++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'specificconstructor' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
					for (CtConstructorCall specificconstructor : constructorcallsFromClass) {
						
						List<CtElement> specificarguments = specificconstructor.getArguments(); 
						
						for(int index=0; index< specificarguments.size(); index++) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

			try {
				Cntx<Object> featuresMethod = (Cntx<Object>) context.getInformation().get("FEATURES_METHODS");

				if (featuresMethod != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

				if (featuresMethod != null) {
					Cntx<Object> particularMethod = (Cntx<Object>) featuresMethod.getInformation()
							.get(adjustIdentifyInJson(invocationAffected));

					if (particularMethod != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

			try {
				Cntx<Object> featuresConstructor = (Cntx<Object>) context.getInformation().get("FEATURES_CONSTRUCTOR");

				if (featuresConstructor != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

				if (featuresConstructor != null) {
					Cntx<Object> particularConstructor = (Cntx<Object>) featuresConstructor.getInformation()
							.get(adjustIdentifyInJson(constructorcall));

					if (particularConstructor != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

			try {
				Cntx<Object> featuresVar = (Cntx<Object>) context.getInformation().get("FEATURES_VARS");

				if (featuresVar != null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

				if (featuresVar != null) {
					Cntx<Object> particularVar = (Cntx<Object>) featuresVar.getInformation()
							.get(adjustIdentifyInJson(aVarAffected));

					if (particularVar != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
        boolean addedBefore = false;
        for (ChangePatternInstance existingInstance : ret) {
            Set<CtElement> instanceCoveredNodes = instanceToCoveredNodes.get(existingInstance);
            for (CtElement changedNode : changedNodes) {
                if (coveredByInstanceNodes(instanceCoveredNodes, changedNode)) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
                CtExpression logicalexpression = logicalExperssions.get(indexlogical);		
				
				List<String> unaryOps = new ArrayList();
				CtScanner scanner = new CtScanner() {

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				scanner.scan(logicalexpression);
				
				List<String> binOps = new ArrayList();
				CtScanner scannerOps = new CtScanner() {

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				List<CtVariableAccess> varsAffected = VariableResolver.collectVariableAccess(logicalexpression, false);
				
				List<String> binOps = new ArrayList();
				CtScanner scanner = new CtScanner() {

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
                CtExpression logicalexpression = logicalExperssions.get(indexlogical);	
				
				List<CtBinaryOperator> binOps = new ArrayList();
				
				CtScanner scanner = new CtScanner() {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				scanner.scan(logicalexpression);
				
				List<CtExpression> atomicboolexperssions = new ArrayList();
				
				for(int index=0; index<binOps.size(); index++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
		private void analyzeExpressions(List<CtExpression> atomicexperssions, Cntx<Object> context, int logicalindex,CtExpression logicalexpression) {
			
			List<CtInvocation> invocationtypes = new ArrayList();
			
			List<CtExpression> comparisiontypes = new ArrayList();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			List<CtInvocation> invocationtypes = new ArrayList();
			
			List<CtExpression> comparisiontypes = new ArrayList();
			
			List<CtVariableAccess> variableaccess = new ArrayList();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			List<CtExpression> comparisiontypes = new ArrayList();
			
			List<CtVariableAccess> variableaccess = new ArrayList();
			
			for(CtExpression certainexpression : atomicexperssions) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
			
			List<CtExpression> invocationtarget = new ArrayList();

			for(int index=0; index<invocationtypes.size(); index++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
			
			List<CtExpression> comparisionleft = new ArrayList();
			List<CtExpression> comparisionright = new ArrayList();

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			
			List<CtExpression> comparisionleft = new ArrayList();
			List<CtExpression> comparisionright = new ArrayList();

			for(int index=0; index<comparisiontypes.size(); index++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					
					List<BinaryOperatorKind> logicOperators = Arrays.asList(BinaryOperatorKind.OR, BinaryOperatorKind.AND);
					List<CtBinaryOperator> binOps = new ArrayList();
					
					CtScanner scanner = new CtScanner() {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					}
					
					List<CtExpression> atomicboolexperssions = new ArrayList();
					
					for(int index=0; index<binOps.size(); index++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/fr/inria/coming/repairability/repairtools/JGenProg.java`
#### Snippet
```java
        boolean addedBefore = false;
        for (ChangePatternInstance existingInstance : ret) {
            Set<CtElement> instanceCoveredNodes = instanceToCoveredNodes.get(existingInstance);
            for (CtElement changedNode : changedNodes) {
                if (coveredByInstanceNodes(instanceCoveredNodes, changedNode)) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
		boolean addedBefore = false;
		for (ChangePatternInstance existingInstance : ret) {
			Set<CtElement> instanceCoveredNodes = instanceToCoveredNodes.get(existingInstance);
			for (CtElement changedNode : changedNodes) {
				if (coveredByInstanceNodes(instanceCoveredNodes, changedNode)) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
		boolean addedBefore = false;
		for (ChangePatternInstance existingInstance : ret) {
			Set<CtElement> instanceCoveredNodes = instanceToCoveredNodes.get(existingInstance);
			for (CtElement changedNode : changedNodes) {
				if (coveredByInstanceNodes(instanceCoveredNodes, changedNode)) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
		boolean addedBefore = false;
		for (ChangePatternInstance existingInstance : ret) {
			Set<CtElement> instanceCoveredNodes = instanceToCoveredNodes.get(existingInstance);
			for (CtElement changedNode : changedNodes) {
				if (coveredByInstanceNodes(instanceCoveredNodes, changedNode)) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'invAffected' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				boolean M13ArgumentHasPrimitive = false;
				
				List<CtExpression> invocationArguments = invAffected.getArguments();
				
				for(int index=0; index<invocationArguments.size(); index++ ) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'specificinvocation' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						continue;
					
					List<CtElement> specificarguments = specificinvocation.getArguments(); 
					
					for(int index=0; index< specificarguments.size(); index++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'specificconstructor' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
					for (CtConstructorCall specificconstructor : constructorcallsFromClass) {
						
						List<CtElement> specificarguments = specificconstructor.getArguments(); 
						
						for(int index=0; index< specificarguments.size(); index++) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				
				try {	
				    Cntx<Object> featuresVar = (Cntx<Object>) context.getInformation().get("FEATURES_VARS");  
				    
				    if(featuresVar!=null) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				    if(featuresVar!=null) {
				    	
						Cntx<Object> particularVar = (Cntx<Object>) featuresVar.getInformation().
								get(adjustIdentifyInJson(aVarAffected));
						
						if(particularVar!=null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'parentInvocation' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				if (parentInvocation != null) {
					
					List<CtElement> arguments = parentInvocation.getArguments();
					
					for (CtInvocation specificinvocation : invocationsFromClass) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		
		try {
			List<CtLiteral> allliteralsFromClass = new ArrayList();
			if(parentClass!=null)
			    allliteralsFromClass = parentClass.getElements(e -> (e instanceof CtLiteral)).stream()
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'parentInvocation' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				MapCounter<CtElement> parameterFound = new MapCounter<>();
				if (parentInvocation != null) {
					List<CtElement> arguments = parentInvocation.getArguments();
					for (CtElement i_Argument : arguments) {
						List<CtVariableAccess> varsAccessInParameter = VariableResolver.collectVariableRead(i_Argument);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'parentInvocation' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					if (parentInvocation != null) {
						
						List<CtElement> arguments = parentInvocation.getArguments();
						
						for (CtInvocation specificinvocation : invocationsFromClass) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'specificinvocation' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
								continue;
							
							List<CtElement> specificarguments = specificinvocation.getArguments();

							if(parentInvocation.getExecutable().getSimpleName().equals
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'parentConstructorCall' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
						if (parentConstructorCall != null) {
							
							List<CtElement> arguments = parentConstructorCall.getArguments();
							
							for (CtConstructorCall specificonstructorcall : constructorcallsFromClass) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'specificonstructorcall' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
									continue;
								
								List<CtElement> specificarguments = specificonstructorcall.getArguments();

								if(getSimplenameForConstructorCall(parentConstructorCall).equals
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'specificinvocation' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							continue;
						
						List<CtElement> specificarguments = specificinvocation.getArguments();

						if(parentInvocation.getExecutable().getSimpleName().equals
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'parentConstructor' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
					if (parentConstructor != null) {
						
						List<CtElement> arguments = parentConstructor.getArguments();
						
						for (CtConstructorCall specificconstructor : constructorcallsFromClass) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'specificconstructor' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
								continue;
							
							List<CtElement> specificarguments = specificconstructor.getArguments();

							if(parentConstructor.getExecutable().getSimpleName().equals
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
            for (CtExpression placeholder2 : exprs) {
                CtReturn<Object> RS = factory.createReturn();
                RS.setReturnedExpression(placeholder2);
                CtIf IFS = factory.createIf();
                IFS.setParent(n.getParent());
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
            for (CtExpression placeholder2 : exprs) {
                CtReturn<Object> RS = factory.createReturn();
                RS.setReturnedExpression(placeholder2);
                CtIf IFS = factory.createIf();
                IFS.setParent(n.getParent());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	public void writeGroupedInfo(Cntx<Object> context, String key, CodeFeatures property, Boolean value, String type) {

		Cntx<Object> featuresVar = (Cntx<Object>) context.getInformation().get(type);
		if (featuresVar == null) {
			featuresVar = new Cntx<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'fr.inria.coming.codefeatures.Cntx'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
			context.getInformation().put(type, featuresVar);
		}
		Cntx<Object> particularVar = (Cntx<Object>) featuresVar.getInformation().get(key);
		if (particularVar == null) {
			particularVar = new Cntx<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
            for (CtExpression placeholder2 : exprs) {
                CtReturn<Object> RS = factory.createReturn();
                RS.setReturnedExpression(placeholder2);
                CtIf IFS = factory.createIf();
                IFS.setParent(n.getParent());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/fr/inria/prophet4j/utility/Support.java`
#### Snippet
```java
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            strings = (List<String>) ois.readObject();
            ois.close();
            fis.close();
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
            for (CtExpression placeholder2 : exprs) {
                CtReturn<Object> RS = factory.createReturn();
                RS.setReturnedExpression(placeholder2);
                CtIf IFS = factory.createIf();
                IFS.setParent(n.getParent());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream ois = new ObjectInputStream(fis);
                featureMatrices = (List<FeatureMatrix>) ois.readObject();
                /*
                // if we need to try on merged feature-vector
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `comp`
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
	 * @param pathOfRepo
	 *            The path of the git repository
	 * @param comp
	 *            The comparator used to set the grain of fragments
	 * @param branch
```

### JavadocReference
Cannot resolve symbol `textTokenComparatorFactory`
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
   *
   * @param text the text to be tokenized
   * @param textTokenComparatorFactory a factory to create text token comparators
   */
  public SJavaTokenComparator(String text) {
```

### JavadocReference
Cannot resolve symbol `finalResult`
in `src/main/java/fr/inria/coming/core/entities/interfaces/IOutput.java`
#### Snippet
```java
	 * Compute the outputs for the results of a revision
	 * 
	 * @param finalResult
	 */
	public void generateRevisionOutput(RevisionResult resultAllAnalyzed);
```

### JavadocReference
Cannot resolve symbol `SourceCodeEntity`
in `src/main/java/fr/inria/coming/changeminer/entity/ChangeDistillerEntityType.java`
#### Snippet
```java
 * 
 * @author zubi
 * @see SourceCodeEntity
 */
public enum ChangeDistillerEntityType {
```

### JavadocReference
Cannot resolve symbol `typeLabel`
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/HunkDifftAnalyzer.java`
#### Snippet
```java
	/**
	 * 
	 * @param typeLabel     node label to mine
	 * @param operationType operation type to mine
	 */
```

### JavadocReference
Cannot resolve symbol `operationType`
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/HunkDifftAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param typeLabel     node label to mine
	 * @param operationType operation type to mine
	 */
	public HunkDifftAnalyzer() {
```

### JavadocReference
Cannot resolve symbol `vartofind`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param varContext
	 * @param vartofind
	 * @return
	 */
```

### JavadocReference
Cannot resolve symbol `patternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
	 * PatternInstanceAnalyser.
	 *
	 * @param patternInstance
	 * @param diff
	 * @return
```

### JavadocReference
Cannot resolve symbol `patternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
	 * PatternInstanceAnalyser.
	 *
	 * @param patternInstance
	 * @param revision
	 * @param diff
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
    public List<Feature> getSimpleP4JFeatures() {
    	 	this.simpleP4Jfeatures = new ArrayList<>();
    	 	for(int i=0; i < RepairFeature.values().length;i++) {
        	 	this.simpleP4Jfeatures.add(RepairFeature.values()[i]);
    	 	} 
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
        	 	this.simpleP4Jfeatures.add(RepairFeature.values()[i]);
    	 	} 
    	 	for(int i=0; i < AtomicFeature.values().length;i++) {
        	 	this.simpleP4Jfeatures.add(AtomicFeature.values()[i]);
    	 	}  	 	
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
        	 	this.simpleP4Jfeatures.add(AtomicFeature.values()[i]);
    	 	}  	 	
    	 	for(int i=0; i < ValueFeature.values().length;i++) {
        	 	this.simpleP4Jfeatures.add(ValueFeature.values()[i]);
    	 	}
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `rootDirectory.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/core/engine/files/FileDatasets.java`
#### Snippet
```java
	public int size() {

		return this.rootDirectory != null ? rootDirectory.listFiles().length : 0;
	}

```

### DataFlowIssue
Dereference of `rootDirectory.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java
		super();
		this.rootDirectory = rootDirectory;
		this.totalNumberFiles = rootDirectory.listFiles().length;
	}

```

### DataFlowIssue
Array access `rootDirectory.listFiles()[currentFile]` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java

		if (currentFile < totalNumberFiles) {
			File diffName = rootDirectory.listFiles()[currentFile];
			currentFile++;

```

### DataFlowIssue
Dereference of `diffFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
				File previousVersion = null;
				File postVersion = null;
				for (File fileModif : diffFolder.listFiles()) {

					if (fileModif.getAbsolutePath().endsWith("_s.java")) {
```

### DataFlowIssue
Dereference of `diffFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
			} else {
				// Normal behavious
				for (File fileModif : diffFolder.listFiles()) {

					if (".DS_Store".equals(fileModif.getName()))
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
					JsonObject instance = new JsonObject();

					instance.addProperty("revision", revisionIdentifier.toString());
					instance.addProperty("pattern_name", (instancePattern.getPattern().getName()));
					JsonArray ops = new JsonArray();
```

### DataFlowIssue
Argument `getClass().getResourceAsStream(CLASSES_HIERARCHY_FILE_NAME)` might be null
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
		try {

			Scanner sc = new Scanner(getClass().getResourceAsStream(CLASSES_HIERARCHY_FILE_NAME));

			while (sc.hasNextLine()) {
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
						|| operations.size() < ComingProperties.getPropertyInteger("MIN_AST_CHANGES_PER_FILE")) {
					log.debug(
							"FileRevision with Max number of Root AST Changes. Discating it. Total:" + operations.size()
									+ " max: " + ComingProperties.getPropertyInteger("MAX_AST_CHANGES_PER_FILE"));
					return null;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
			if (parenti == null) {
				continueSearch = false;
				parenti = null;
			} else if (parenti instanceof CtBlock) {
				continueSearch = false;
```

### DataFlowIssue
Dereference of `pairFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java

		JsonArray filesArray = new JsonArray();
		for (File fileModif : pairFolder.listFiles()) {
			int i_hunk = 0;

```

### DataFlowIssue
Method invocation `getParent` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
		// Let's find the parent statement
		try {
			CtStatement parentLine = affectedCtElement.getParent(FILTER);
			if (parentLine != null)
				return parentLine;
```

### DataFlowIssue
Dereference of `pairFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		Map<String, File> pathmap = new HashMap();

		for (File fileModif : pairFolder.listFiles()) {

			if (".DS_Store".equals(fileModif.getName()))
```

### DataFlowIssue
Dereference of `pairFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
		Map<String, File> pathmap = new HashMap<String, File>();

		for (File fileModif : pairFolder.listFiles()) {
			if (!fileModif.getName().contains(".DS")) {
				String pathname = fileModif.getAbsolutePath() + File.separator + pairFolder.getName() + "_"
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
        } else if (affectedOperation instanceof UpdateOperation && (affectedEntity.getOldValue() != null)) {
            currentNodeFromAction = affectedOperation.getSrcNode();
            matchnewvalue = false;
        } else {
            matchnewvalue = true;
```

### DataFlowIssue
Dereference of `pairFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		File pairFolder = new File(folderPath);

		for (File fileModif : pairFolder.listFiles()) {

			if (!".DS_Store".equals(fileModif.getName())) {
```

### DataFlowIssue
Condition `e instanceof CtBinaryOperator` is redundant and can be replaced with a null check
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
					
			List<CtBinaryOperator> logicalOperatorLeft = leftexpression.getElements(
			  e -> e instanceof CtBinaryOperator && logicalOperator.contains(((CtBinaryOperator) e).getKind()));
			
			List<CtBinaryOperator> logicalOperatorRight = rightexpression.getElements(
```

### DataFlowIssue
Condition `e instanceof CtBinaryOperator` is redundant and can be replaced with a null check
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
			
			List<CtBinaryOperator> logicalOperatorRight = rightexpression.getElements(
					  e -> e instanceof CtBinaryOperator && logicalOperator.contains(((CtBinaryOperator) e).getKind()));
			
			if(logicalOperatorLeft.size() == 0) {	
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
				JsonObject instance = new JsonObject();

				instance.addProperty("revision", revisionIdentifier.toString());

				log.info("\n--------\ncommit with instance:\n " + revisionIdentifier);
```

### DataFlowIssue
Method invocation `split` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java

			// nopol might use a field or method of an object that is not used in the src
			String[] parts = elementAsString.split("\\.");
			elementAsString = parts.length == 0 ? elementAsString : parts[parts.length - 1];
			parts = elementAsString.split(NAME_SEPARATOR);
```

### DataFlowIssue
Method invocation `getDstNode` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
			}

			CtStatement movedNode = (CtStatement) movOp.getDstNode();

			CtIf ifNode = (CtIf) ifOp.getSrcNode();
```

### DataFlowIssue
Method invocation `getSrcNode` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
			CtStatement movedNode = (CtStatement) movOp.getDstNode();

			CtIf ifNode = (CtIf) ifOp.getSrcNode();
			
			if(!(ifNode.getCondition() instanceof CtBinaryOperator))
```

### DataFlowIssue
Method invocation `getSrcNode` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
			}

			List<CtElement> thenElems = thenOp.getSrcNode().getElements(null);

			CtStatement thenStatement = null;
```

### DataFlowIssue
Argument `newElement` might be null
in `src/main/java/fr/inria/coming/repairability/repairtools/JGenProg.java`
#### Snippet
```java
        }

        return doesElementOccursInSrcNode(srcNode, newElement);
    }

```

### DataFlowIssue
Method invocation `available` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
            // read the file into buffer
            InputStream inputStream = this.getClass().getResourceAsStream(rootInputFile);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
```

### DataFlowIssue
Method invocation `getSrcNode` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
			}

			CtIf insertedNode = (CtIf) insIfOp.getSrcNode();
			List<CtStatement> thenStatements = insertedNode.getThenStatement()
					.getElements(new TypeFilter<CtStatementList>(CtStatementList.class)).get(0).getStatements();
```

### DataFlowIssue
Method invocation `getDstNode` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
			}

			CtElement dstMov = movOp.getDstNode();
			if (!ASTInfoResolver.getPathToRootNode(dstMov).contains(insertedNode)) {
				return false;
```

### DataFlowIssue
Method invocation `getMetadata` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
			res.add(dstParentNode);

			ITree dstParentTree = (ITree) dstParentNode.getMetadata("gtnode");

			MappingStore mapping = diff.getMappingsComp();
```

### DataFlowIssue
Method invocation `getReturnedExpression` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
		dstMappedElement = ASTInfoResolver.getFirstAncestorOfType(dstNode, entityType);
		if (entityType.equals(CtEntityType.RETURN)) {
			dstMappedExpression = ((CtReturn) dstMappedElement).getReturnedExpression();
		} else if (entityType.equals(CtEntityType.ABSTRACT_INVOCATION)) {
			dstMappedExpression = dstMappedElement;
```

### DataFlowIssue
Method invocation `getMetadata` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
						: getWrapperIfConditoin(op.getDstNode());
				res.add(dstCondition);
				ITree dstConditionTree = (ITree) dstCondition.getMetadata("gtnode");

				MappingStore mapping = diff.getMappingsComp();
```

### DataFlowIssue
Method invocation `getMetadata` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
				srcCondition = getWrapperIfConditoin(op.getSrcNode());
				res.add(srcCondition);
				ITree srcConditionTree = (ITree) srcCondition.getMetadata("gtnode");

				MappingStore mapping = diff.getMappingsComp();
```

### DataFlowIssue
Method invocation `getParent` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
				dstCondition = getWrapperIfConditoin(op.getSrcNode());

				ITree dstConditionParentTree = (ITree) dstCondition.getParent().getMetadata("gtnode");

				MappingStore mapping = diff.getMappingsComp();
```

### DataFlowIssue
Method invocation `getMetadata` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
			} else if (op instanceof DeleteOperation) {
				CtElement srcCondition = getWrapperIfConditoin(op.getSrcNode());
				ITree srcConditionTree = (ITree) srcCondition.getMetadata("gtnode");

				MappingStore mapping = diff.getMappingsComp();
```

### DataFlowIssue
Method invocation `getSrcNode` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
		} else if (patternType.startsWith(IF_INS_SHALLOW_PATTERN) || patternType.startsWith(IF_INS_DEEP_PATTERN)) {
			Operation insertOp = getInsertAction(instance);
			CtIf insertedIf = (CtIf) insertOp.getSrcNode();
			
			if (insertedIf.getElseStatement() != null)
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				
				if(m8methodprimitive)
					m9methodobjective = false;
				else m9methodobjective = true;
				
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				
				if(isPrimitive)
					isObject=false;
				else isObject=true;
				
```

### DataFlowIssue
Dereference of `new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        System.out.println(dataPath);
        for (File file : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            // patchInfo
            String pathName = file.getName();
```

### DataFlowIssue
Dereference of `new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        Map<String, Map<File, List<File>>> catalogs = new HashMap<>();
        FilenameFilter javaFilter = (dir, name) -> name.endsWith(".java");
        for (File typeFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            for (File numFile : typeFile.listFiles((dir, name) -> !name.startsWith("."))) {
                String pathName = typeFile.getName() + "/" + numFile.getName();
```

### DataFlowIssue
Dereference of `typeFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        FilenameFilter javaFilter = (dir, name) -> name.endsWith(".java");
        for (File typeFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            for (File numFile : typeFile.listFiles((dir, name) -> !name.startsWith("."))) {
                String pathName = typeFile.getName() + "/" + numFile.getName();
                if (!catalogs.containsKey(pathName)) {
```

### DataFlowIssue
Dereference of `numFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                List<File> buggyFiles = new ArrayList<>();
                List<File> patchedFiles = new ArrayList<>();
                for (File dataFile : numFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (dataFile.getName().equals("buggy")) {
                        buggyFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> !name.startsWith("."))` might be null
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                for (File dataFile : numFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (dataFile.getName().equals("buggy")) {
                        buggyFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    } else if (dataFile.getName().equals("patched")) {
                        patchedFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> !name.startsWith("."))` might be null
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                        buggyFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    } else if (dataFile.getName().equals("patched")) {
                        patchedFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    }
                }
```

### DataFlowIssue
Argument `patchedFile.listFiles(javaFilter)` might be null
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                }
                for (File patchedFile : patchedFiles) {
                    values.addAll(Arrays.asList(patchedFile.listFiles(javaFilter)));
                }
                for (File key : keys) {
```

### DataFlowIssue
Dereference of `new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
    static Map<String, Map<File, File>> loadSANERWithoutPatches(String dataPath) throws NullPointerException {
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        for (File typeFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            File[] targetDirs = typeFile.listFiles((dir, name) -> name.equals("modifiedFiles"));
            if (targetDirs != null && targetDirs.length > 0) {
```

### DataFlowIssue
Dereference of `targetDirs[0].listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
            File[] targetDirs = typeFile.listFiles((dir, name) -> name.equals("modifiedFiles"));
            if (targetDirs != null && targetDirs.length > 0) {
                for (File numFile : targetDirs[0].listFiles((dir, name) -> !name.startsWith("."))) {
                    String pathName = typeFile.getName() + numFile.getName();
                    if (!catalogs.containsKey(pathName)) {
```

### DataFlowIssue
Dereference of `numFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    List<File> oldFiles = new ArrayList<>();
                    List<File> fixFiles = new ArrayList<>();
                    for (File dataFile : numFile.listFiles((dir, name) -> !name.startsWith("."))) {
                        if (dataFile.getName().equals("old")) {
                            oldFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java"))));
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> name.endsWith(".java"))` might be null
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    for (File dataFile : numFile.listFiles((dir, name) -> !name.startsWith("."))) {
                        if (dataFile.getName().equals("old")) {
                            oldFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java"))));
                        } else if (dataFile.getName().equals("fix")) {
                            fixFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java"))));
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> name.endsWith(".java"))` might be null
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                            oldFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java"))));
                        } else if (dataFile.getName().equals("fix")) {
                            fixFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java"))));
                        }
                    }
```

### DataFlowIssue
Dereference of `new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        Map<String, Map<File, List<File>>> catalogs = new HashMap<>();
        FilenameFilter javaFilter = (dir, name) -> name.endsWith(".java");
        for (File eachFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            File humanFile = null;
            try {
```

### DataFlowIssue
Dereference of `humanFiles` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
            try {
                File[] humanFiles = new File(eachFile.getPath() + "/human").listFiles(javaFilter);
                if (humanFiles.length == 1) {
                    humanFile = humanFiles[0];
                } else {
```

### DataFlowIssue
Dereference of `eachFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
            String humanFileName = humanFile.getName();
            FilenameFilter nameFilter = (dir, name) -> name.equals(humanFileName);
            for (File typeFile : eachFile.listFiles((dir, name) -> !name.startsWith("."))) {
                if (typeFile.getName().equals("human")) {
                    continue;
```

### DataFlowIssue
Dereference of `typeFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    continue;
                }
                for (File numFile : typeFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (buggyFile == null) {
                        File[] keyFiles = new File(numFile.getPath() + "/buggy").listFiles(nameFilter);
```

### DataFlowIssue
Dereference of `keyFiles` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    if (buggyFile == null) {
                        File[] keyFiles = new File(numFile.getPath() + "/buggy").listFiles(nameFilter);
                        if (keyFiles.length == 1) {
                            buggyFile = keyFiles[0];
                        }
```

### DataFlowIssue
Dereference of `valueFiles` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    }
                    File[] valueFiles = new File(numFile.getPath() + "/patch").listFiles(nameFilter);
                    if (valueFiles.length == 1) {
                        // the following files are generated patches
                        patchedFiles.addAll(Arrays.asList(valueFiles));
```

### DataFlowIssue
Dereference of `new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        FilenameFilter javaFilter = (dir, name) -> name.endsWith(".java");
        for (File eachFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            File humanFile = null;
            try {
```

### DataFlowIssue
Dereference of `humanFiles` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
            try {
                File[] humanFiles = new File(eachFile.getPath() + "/human").listFiles(javaFilter);
                if (humanFiles.length == 1) {
                    humanFile = humanFiles[0];
                } else {
```

### DataFlowIssue
Dereference of `eachFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
            String humanFileName = humanFile.getName();
            FilenameFilter nameFilter = (dir, name) -> name.equals(humanFileName);
            label: for (File typeFile : eachFile.listFiles((dir, name) -> !name.startsWith("."))) {
                if (typeFile.getName().equals("human")) {
                    continue;
```

### DataFlowIssue
Dereference of `typeFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    continue;
                }
                for (File numFile : typeFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (buggyFile == null) {
                        File[] keyFiles = new File(numFile.getPath() + "/buggy").listFiles(nameFilter);
```

### DataFlowIssue
Dereference of `keyFiles` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    if (buggyFile == null) {
                        File[] keyFiles = new File(numFile.getPath() + "/buggy").listFiles(nameFilter);
                        if (keyFiles.length == 1) {
                            buggyFile = keyFiles[0];
                            break label;
```

### DataFlowIssue
Dereference of `new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        FilenameFilter javaFilter = (dir, name) -> name.endsWith(".java");
        for (File typeFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            for (File numFile : typeFile.listFiles((dir, name) -> !name.startsWith("."))) {
                String pathName = typeFile.getName() + "/" + numFile.getName();
```

### DataFlowIssue
Dereference of `typeFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        FilenameFilter javaFilter = (dir, name) -> name.endsWith(".java");
        for (File typeFile : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            for (File numFile : typeFile.listFiles((dir, name) -> !name.startsWith("."))) {
                String pathName = typeFile.getName() + "/" + numFile.getName();
                if (!catalogs.containsKey(pathName)) {
```

### DataFlowIssue
Dereference of `numFile.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                List<File> buggyFiles = new ArrayList<>();
                List<File> patchedFiles = new ArrayList<>();
                for (File dataFile : numFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (dataFile.getName().equals("buggy")) {
                        buggyFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> !name.startsWith("."))` might be null
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                for (File dataFile : numFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (dataFile.getName().equals("buggy")) {
                        buggyFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    } else if (dataFile.getName().equals("patched")) {
                        patchedFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> !name.startsWith("."))` might be null
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                        buggyFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    } else if (dataFile.getName().equals("patched")) {
                        patchedFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    }
                }
```

### DataFlowIssue
Argument `patchedFile.listFiles(javaFilter)` might be null
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                }
                for (File patchedFile : patchedFiles) {
                    values.addAll(Arrays.asList(patchedFile.listFiles(javaFilter)));
                }
                for (File key : keys) {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		boolean[] expressionfeaturesdefault = new boolean[2];
		expressionfeaturesdefault[0] = false;
		expressionfeaturesdefault[1] = false;

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		boolean[] expressionfeaturesdefault = new boolean[2];
		expressionfeaturesdefault[0] = false;
		expressionfeaturesdefault[1] = false;

		return expressionfeaturesdefault;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		boolean[] expressionfeaturesdefault = new boolean[3];

		expressionfeaturesdefault[0] = false;
		expressionfeaturesdefault[1] = false;
		expressionfeaturesdefault[2] = false;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		expressionfeaturesdefault[0] = false;
		expressionfeaturesdefault[1] = false;
		expressionfeaturesdefault[2] = false;

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		expressionfeaturesdefault[0] = false;
		expressionfeaturesdefault[1] = false;
		expressionfeaturesdefault[2] = false;

		return expressionfeaturesdefault;
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/utility/Support.java`
#### Snippet
```java

public class Support {
    public static final String PROPHET4J_DIR = Support.class.getClassLoader().getResource("").getPath() + "prophet4j/";

    public enum DirType {
```

### DataFlowIssue
Dereference of `new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    public Map<String, Map<File, File>> loadPFiles(String dataPath) throws NullPointerException {
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        for (File file : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            // patchInfo
            String pathName = file.getName();
```

### DataFlowIssue
Dereference of `new File(auxPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    private Map<String, Map<File, File>> loadDFiles(String dataPath, String auxPath) throws NullPointerException {
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        for (File file : new File(auxPath).listFiles((dir, name) -> !name.startsWith("."))) {
            String[] info = file.getName().split("-");
            // typeInfo + numInfo
```

### DataFlowIssue
Dereference of `file.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            File buggyFile = null;
            File patchedFile = null;
            for (File dataFile : file.listFiles((dir, name) -> !name.startsWith("."))) {
                if (dataFile.getName().equals("buggy")) {
                    List<File> childFiles = Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java")));
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> name.endsWith(".java"))` might be null
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            for (File dataFile : file.listFiles((dir, name) -> !name.startsWith("."))) {
                if (dataFile.getName().equals("buggy")) {
                    List<File> childFiles = Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java")));
                    assert childFiles.size() == 1;
                    buggyFile = childFiles.get(0);
```

### DataFlowIssue
Argument `scopeFile.listFiles((dir, name) -> name.endsWith(".java"))` might be null
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
//                String buggyFileName = buggyFile.getName();
                File scopeFile = new File(dataPath + info[1] + "-" + info[2] + "/");
                List<File> childFiles = Arrays.asList(scopeFile.listFiles((dir, name) -> name.endsWith(".java")));
                assert childFiles.size() == 1;
                patchedFile = childFiles.get(0);
```

### DataFlowIssue
Dereference of `new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    public Map<String, Map<File, File>> loadDFiles(String dataPath) throws NullPointerException {
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        for (File file : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            String[] info = file.getName().split("-");
            // typeInfo + numInfo
```

### DataFlowIssue
Dereference of `file.listFiles((dir, name) -> !name.startsWith("."))` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            File buggyFile = null;
            File patchedFile = null;
            for (File dataFile : file.listFiles((dir, name) -> !name.startsWith("."))) {
                if (dataFile.getName().equals("buggy")) {
                    List<File> childFiles = Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java")));
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> name.endsWith(".java"))` might be null
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            for (File dataFile : file.listFiles((dir, name) -> !name.startsWith("."))) {
                if (dataFile.getName().equals("buggy")) {
                    List<File> childFiles = Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java")));
                    assert childFiles.size() == 1;
                    buggyFile = childFiles.get(0);
```

### DataFlowIssue
Argument `dataFile.listFiles((dir, name) -> name.endsWith(".java"))` might be null
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
                    buggyFile = childFiles.get(0);
                } else if (dataFile.getName().equals("patched")) {
                    List<File> childFiles = Arrays.asList(dataFile.listFiles((dir, name) -> name.endsWith(".java")));
                    assert childFiles.size() == 1;
                    patchedFile = childFiles.get(0);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/fr/inria/coming/core/filter/diff/NbHunkFilter.java`
#### Snippet
```java
		this.max_included = max_included;
		this.min_included = min_included;
	};

	public NbHunkFilter(int min_included, int max_included, IFilter other) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
    }

    ;

    public List<IFilter> getFilters() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/fr/inria/coming/core/entities/AnalysisResult.java`
#### Snippet
```java
    public AnalysisResult(T analyzed) {
		this.analyzed = analyzed;
	};

	public Boolean sucessful() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/fr/inria/coming/utils/Probability.java`
#### Snippet
```java
public class Probability<K> {

	private Map<K, Double> probDist = new LinkedHashMap<>();;
	private Map<K, Double> probAccumulative = new LinkedHashMap<>();

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/fr/inria/coming/utils/Probability.java`
#### Snippet
```java
	public Map<K, Double> getProbAccumulative() {
		return probAccumulative;
	};

	public Map<K, Double> sortByValue(Map<K, Double> prob) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java

	public enum ODSLabel {
		UNKNOWN, CORRECT, OVERFITTING;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/fr/inria/prophet4j/feature/S4R/S4RFeature.java`
#### Snippet
```java
        // expression as one of its parameters and the return type of the method is
        // type compatible with the return type of the arithmetic expression.
        AE1_COMPATIBLE_RETURN_TYPE;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeature.java`
#### Snippet
```java
        // expression as one of its parameters and the return type of the method is
        // type compatible with the return type of the arithmetic expression.
        AE1_COMPATIBLE_RETURN_TYPE;
    }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
The 'filter().findFirst().isPresent()' chain can be replaced with 'anyMatch()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java

						boolean isPresentVar = varsAffected.stream()
								.filter(e -> e.getVariable().getSimpleName().equals(aVarInScope.getSimpleName()))
								.findFirst().isPresent();
						if (!isPresentVar) {
							hasBooleanVarNotPresent = true;
```

### SimplifyStreamApiCallChains
The 'filter().findFirst().isPresent()' chain can be replaced with 'anyMatch()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java

								boolean presentInExpression = varsAffected.stream()
										.filter(e -> e.getVariable().getSimpleName().equals(aVarFromScope.getSimpleName()))
										.findFirst().isPresent();
								
								if (!presentInExpression) {
```

## RuleId[id=ParameterCanBeLocal]
### ParameterCanBeLocal
Parameter can be converted to a local variable
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	@SuppressWarnings("rawtypes")
	public boolean analyze_AffectedVariablesUsed(List<CtVariableAccess> varsAffected, CtElement element,
			List<CtStatement> statements) {

		try {
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	// S8: same, but primitive type variables
	public boolean[] analyze_AffectedObjectLastAppear(List<CtVariableAccess> varsAffected, CtElement element,
			List<CtStatement> statements) {

		try {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `src/main/java/fr/inria/coming/utils/CtEntityType.java`
#### Snippet
```java
    @Override
    public String toString() {
        if(name().toLowerCase().equals("abstract_invocation")){
            return "AbstractInvocation";
        }
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
					JsonObject instance = new JsonObject();

					instance.addProperty("revision", revisionIdentifier.toString());
					instance.addProperty("pattern_name", (instancePattern.getPattern().getName()));
					JsonArray ops = new JsonArray();
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
		String key = null;
		if (element.getPosition() != null && element.getPosition().getFile() != null) {
			key = element.getPosition().getFile().getName().toString();
		} else {
			key = element.getShortRepresentation();
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
				JsonObject instance = new JsonObject();

				instance.addProperty("revision", revisionIdentifier.toString());

				log.info("\n--------\ncommit with instance:\n " + revisionIdentifier);
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
		} else if (element instanceof CtMethod) {
			CtMethod method = (CtMethod) element;
			return method.getDeclaringType().getQualifiedName().toString() + NAME_SEPARATOR + method.getSignature();
		}

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
					
					if (certainexpression.getType()!=null && (certainexpression.getType().isPrimitive() || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
					if (certainexpression.getType()!=null && (certainexpression.getType().isPrimitive() || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
						
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
						
						Con6ArgumentHasPrimitive = true;
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				
				if (conAffected.getType()!=null && (conAffected.getType().isPrimitive() || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				if (conAffected.getType()!=null && (conAffected.getType().isPrimitive() || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
					con4returnprimitive = true;
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
					con4returnprimitive = true;
				}
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
					varname=varname.replaceAll("[^a-zA-Z0-9]", "");
					if(varname.length()>3) {
						if(methodname.toLowerCase().endsWith(varname.toLowerCase()) || methodname.toLowerCase().equals("length") ||
								methodname.toLowerCase().contains("version") || methodname.toLowerCase().contains("clone")) {
							M12hasvarsimiplarinname = true;
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
					
					if (certainexpression.getType()!=null && (certainexpression.getType().isPrimitive() || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
					if (certainexpression.getType()!=null && (certainexpression.getType().isPrimitive() || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
						
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				boolean v16CurrentVarParameterCompatible = false;
				
				if(varAffected.getType()!=null && !varAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("object") &&
						varAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("java.lang.object")==-1) {

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				
				if(varAffected.getType()!=null && !varAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("object") &&
						varAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("java.lang.object")==-1) {

				  if (checkMethodDeclarationWithParameterReturnCompatibleType(allMethods, varAffected.getType()) != null
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
						&& ctVariable.getReference().getType() != null) {
					if (ctVariable.getReference().getType().isPrimitive() ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					if (ctVariable.getReference().getType().isPrimitive() ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
						
						M13ArgumentHasPrimitive = true;
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				
				if ((invocation.getType()!=null && (invocation.getType().isPrimitive() || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				if ((invocation.getType()!=null && (invocation.getType().isPrimitive() || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.nio.")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.nio.")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.io."))) || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.nio.")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.io."))) || 
						whetherhasprimitive(inferPotentionalTypes(invocation, parentClass))) {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.nio.")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("java.io."))) || 
						whetherhasprimitive(inferPotentionalTypes(invocation, parentClass))) {
					
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.nio.")||
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.nio.")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.io.")) {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.nio.")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.io.")) {
						isPrimitive = true;
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.util.")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.nio.")||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("java.io.")) {
						isPrimitive = true;
					} 
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
				whethercontainnull = true;
			
			writeGroupedInfo(context, Integer.toString(operatorindex)+"_"+operatorunderstudy, CodeFeatures.O3_CONTAIN_NULL, 
					whethercontainnull, "FEATURES_BINARYOPERATOR");
			
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
	        }
			
	        writeGroupedInfo(context, Integer.toString(operatorindex)+"_"+operatorunderstudy, CodeFeatures.O4_COMPARE_IN_CONDITION, 
					whethercompareincondition, "FEATURES_BINARYOPERATOR");
		}	
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
		}
		
		writeGroupedInfo(context, Integer.toString(operatorindex)+"_"+operatorunderstudy, CodeFeatures.O5_IS_MATH_ROOT, 
				whethermathroot, "FEATURES_BINARYOPERATOR");	
	}
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
				whethercontain01 = true;
			
			writeGroupedInfo(context, Integer.toString(operatorindex)+"_"+operatorunderstudy, CodeFeatures.O3_CONTAIN_01, 
					whethercontain01, "FEATURES_BINARYOPERATOR");
		}
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
			
			if(cerainfeature.toString().endsWith(operatorstring.toUpperCase()))
				writeGroupedInfo(context,  Integer.toString(operatorindex)+"_"+operatorunderstudy, cerainfeature, 
							true, "FEATURES_BINARYOPERATOR");
			else writeGroupedInfo(context,  Integer.toString(operatorindex)+"_"+operatorunderstudy, cerainfeature, 
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
				writeGroupedInfo(context,  Integer.toString(operatorindex)+"_"+operatorunderstudy, cerainfeature, 
							true, "FEATURES_BINARYOPERATOR");
			else writeGroupedInfo(context,  Integer.toString(operatorindex)+"_"+operatorunderstudy, cerainfeature, 
					false, "FEATURES_BINARYOPERATOR");
		}	
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
		}
		
		writeGroupedInfo(context, Integer.toString(operatorindex)+"_"+operatorunderstudy, CodeFeatures.O2_LOGICAL_CONTAIN_NOT, 
				whethercontainnotoperator, "FEATURES_BINARYOPERATOR");
		
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
					.map(CtConstructorCall.class::cast).collect(Collectors.toList());
			
			writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E1_LOCAL_VAR_NOT_USED, 
					analyze_AffectedVariablesUsed (varsAffected, originalElement, allstatementsinclass), 
					"FEATURES_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
					"FEATURES_EXPRESSION");
			
			writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E1_LOCAL_VAR_NOT_ASSIGNED, 
					analyze_AffectedAssigned (varsAffected, originalElement), 
					"FEATURES_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
			if(expressionfeatures != null) {
				
				writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E2_SIMILAR_OBJECT_TYPE_WITH_NORMAL_GUARD, 
						expressionfeatures[0], "FEATURES_EXPRESSION");
				
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
						expressionfeatures[0], "FEATURES_EXPRESSION");
				
				writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E5_SIMILAR_PRIMITIVE_TYPE_WITH_NORMAL_GUARD, 
						expressionfeatures[1], "FEATURES_EXPRESSION");
				
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
						expressionfeatures[1], "FEATURES_EXPRESSION");
				
				writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E2_SIMILAR_OBJECT_TYPE_WITH_NULL_GUARD, 
						expressionfeatures[2], "FEATURES_EXPRESSION");
				
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
						expressionfeatures[2], "FEATURES_EXPRESSION");
				
				writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E5_SIMILAR_PRIMITIVE_TYPE_WITH_NULL_GUARD, 
						expressionfeatures[3], "FEATURES_EXPRESSION");
			}
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
			}
			
			writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E4_Field_NOT_USED, 
					analyze_AffectedFielfs(varsAffected, originalElement, parentClass), 
					"FEATURES_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
					"FEATURES_EXPRESSION");
			
			writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E4_Field_NOT_ASSIGNED, 
					analyze_AffectedFieldAssigned(varsAffected, originalElement, parentClass), 
					"FEATURES_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
            if(expressionvalueS7S8 != null) {
				
            	writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E7_OBJECT_USED_IN_ASSIGNMENT, 
						expressionvalueS7S8[0], "FEATURES_EXPRESSION");
				
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
						expressionvalueS7S8[0], "FEATURES_EXPRESSION");
				
            	writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E8_PRIMITIVE_USED_IN_ASSIGNMENT, 
						expressionvalueS7S8[1], "FEATURES_EXPRESSION");
			}
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
            if(expressionvalueS9S10 != null) {
				
            	writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E9_METHOD_CALL_WITH_NORMAL_GUARD, 
						expressionvalueS9S10[0], "FEATURES_EXPRESSION");
				
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
						expressionvalueS9S10[0], "FEATURES_EXPRESSION");
				
            	writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E10_METHOD_CALL_WITH_NULL_GUARD, 
						expressionvalueS9S10[1], "FEATURES_EXPRESSION");
			}     
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
			}     
            
            writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E1_RETURN_PRIMITIVE, 
            		getExpressionType(specificexpression), "FEATURES_EXPRESSION");
            
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
            if(expressionvalueType != null) {
				
            	writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E2_COMPATIBLE_INVOCATION_PAREMETER_RETURN, 
						expressionvalueType[0], "FEATURES_EXPRESSION");
				
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
						expressionvalueType[0], "FEATURES_EXPRESSION");
				
            	writeGroupedInfo(context, "expression_"+Integer.toString(expressionindex), CodeFeatures.E3_COMPATIBLE_INVOCATION_PAREMETER, 
						expressionvalueType[1], "FEATURES_EXPRESSION");
			}    
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				boolean containsNot = unaryOps.contains(UnaryOperatorKind.NOT.toString());
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression,  
						CodeFeatures.LE6_HAS_NEGATION,
						(containsAnd || containsOr) && containsNot, "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression, 
						CodeFeatures.LE7_SIMPLE_VAR_OR_METHOD_IN_LOGIC,
						(containsAnd || containsOr) && (hasVarDirectlyUsed || hasMethodDirectlyUsed), "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression,  
						CodeFeatures.LE4_EXISTS_LOCAL_UNUSED_VARIABLES,
						hasBooleanVarNotPresent, "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression,  
						CodeFeatures.LE9_NORMAL_CHECK,
						(whethercontainnormalcheck && !whethercontainnullcheck), "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
						(whethercontainnormalcheck && !whethercontainnullcheck), "FEATURES_LOGICAL_EXPRESSION");
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression,  
						CodeFeatures.LE9_NULL_CHECK,
						(!whethercontainnormalcheck && whethercontainnullcheck), "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
						(!whethercontainnormalcheck && whethercontainnullcheck), "FEATURES_LOGICAL_EXPRESSION");
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression,  
						CodeFeatures.LE9_MIX_CHECK,
						(whethercontainnormalcheck && whethercontainnullcheck), "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
						(whethercontainnormalcheck && whethercontainnullcheck), "FEATURES_LOGICAL_EXPRESSION");
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression,  
						CodeFeatures.LE9_EQUAL_NOTEQUAL_NULL_CHECK,
						(equalnullcheck && notequalnullcheck), "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression,  
						CodeFeatures.LE5_COMPLEX_REFERENCE,
						whethercomplexreference, "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression, 
						CodeFeatures.LE3_IS_COMPATIBLE_VAR_NOT_INCLUDED,
						hasCompatibleVarNoPresent, "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
			
			writeGroupedInfo(context, "logical_expression_"+Integer.toString(logicalindex)+"_"+logicalexpression,  
					CodeFeatures.LE10_ATOMIC_EXPRESSION_SAME_INVOCATION_TARGET, 
					(invocationtarget.size()>=2 &&
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			        "FEATURES_LOGICAL_EXPRESSION");
			
			writeGroupedInfo(context, "logical_expression_"+Integer.toString(logicalindex)+"_"+logicalexpression, 
					CodeFeatures.LE10_ATOMIC_EXPRESSION_COMPARISION_SAME_LEFT,
					(comparisionleft.size()>=2 &&
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			        "FEATURES_LOGICAL_EXPRESSION");
			
			writeGroupedInfo(context, "logical_expression_"+Integer.toString(logicalindex)+"_"+logicalexpression, 
					CodeFeatures.LE10_ATOMIC_EXPRESSION_COMPARISION_SAME_RIGHT,
					(comparisionright.size()>=2 &&
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			        "FEATURES_LOGICAL_EXPRESSION");
			
			writeGroupedInfo(context, "logical_expression_"+Integer.toString(logicalindex)+"_"+logicalexpression, 
					CodeFeatures.LE10_ATOMIC_EXPRESSION_MULTIPLE_VAR_AS_BOOLEAN,
					variableaccess.size()>=2, "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					variableaccess.size()>=2, "FEATURES_LOGICAL_EXPRESSION");
			
			writeGroupedInfo(context, "logical_expression_"+Integer.toString(logicalindex)+"_"+logicalexpression, 
					CodeFeatures.LE10_ATOMIC_EXPRESSION_USED_IN_INVOCATION_COMPARISION_VARIABLE,
					whetherinvtargetincomparision, "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					whetherinvtargetincomparision, "FEATURES_LOGICAL_EXPRESSION");
			
			writeGroupedInfo(context, "logical_expression_"+Integer.toString(logicalindex)+"_"+logicalexpression, 
					CodeFeatures.LE10_CONTAINS_ALL_INVOCATION_COMPARISION_VARIABLE,
					invocationtypes.size()>0 && variableaccess.size()>0 &&
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}

				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression, 
						CodeFeatures.LE2_IS_BOOLEAN_METHOD_PARAM_TYPE_VAR,
						hasAnyLES2paramCompatibleWithBooleanReturn, "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression, 
						CodeFeatures.LE1_EXISTS_RELATED_BOOLEAN_EXPRESSION,
						(similarUsedBefore) > 0, "FEATURES_LOGICAL_EXPRESSION");
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
						(similarUsedBefore) > 0, "FEATURES_LOGICAL_EXPRESSION");
				
				writeGroupedInfo(context, "logical_expression_"+Integer.toString(indexlogical)+"_"+logicalexpression, 
						CodeFeatures.LE8_SCOPE_VAR_USED_OTHER_BOOLEXPER,
						(otherVarUsedinBool) > 0, "FEATURES_LOGICAL_EXPRESSION");
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
            MatchingEntity firstMatchingEntity = matchingAction.getMatching().get(0);
            CtElement affected = firstMatchingEntity.getAffectedNode();
            if (mustMatchedEntities.contains(affected)) {
                mustMatchedEntities.remove(affected);
            }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `docs/javadoc-codefeatures/stylesheet.css`
#### Snippet
```java
    background-color:#4D7A97;
    color:#FFFFFF;
    float:left;
    padding:0;
    width:100%;
    clear:right;
    height:2.8em;
    padding-top:10px;
    overflow:hidden;
    font-size:12px; 
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstanceAnalyzer.java`
#### Snippet
```java
		AnalysisResult resultFromDiffAnalysis = previousResults.getResultFromClass(FineGrainDifftAnalyzer.class);

		if (resultFromDiffAnalysis == null) {
			System.err.println("Error Diff must be executed before");
			throw new IllegalArgumentException("Error: missing diff");
		}

		DiffResult diffResut = (DiffResult) resultFromDiffAnalysis;
		List<PatternInstancesFromDiff> instancesAll = new ArrayList<>();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
		if (element instanceof CtIf) {
			return (((CtIf) element).getCondition());
		} else if (element instanceof CtWhile) {
			return (((CtWhile) element).getLoopingExpression());
		} else if (element instanceof CtFor) {
			return (((CtFor) element).getExpression());
		} else if (element instanceof CtDo) {
			return (((CtDo) element).getLoopingExpression());
		} else if (element instanceof CtForEach) {
			return (((CtForEach) element).getExpression());
		} else if (element instanceof CtSwitch) {
			return (((CtSwitch) element).getSelector());
		} else
			return (element);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/CodeFeatureDetector.java`
#### Snippet
```java
            if (binOp.getKind().equals(BinaryOperatorKind.AND) || binOp.getKind().equals(BinaryOperatorKind.OR)
                || binOp.getKind().equals(BinaryOperatorKind.EQ)
                || binOp.getKind().equals(BinaryOperatorKind.GE)
                || binOp.getKind().equals(BinaryOperatorKind.GT)
                || binOp.getKind().equals(BinaryOperatorKind.INSTANCEOF)
                || binOp.getKind().equals(BinaryOperatorKind.LE)
                || binOp.getKind().equals(BinaryOperatorKind.LT)
                || binOp.getKind().equals(BinaryOperatorKind.NE)
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/CodeFeatureDetector.java`
#### Snippet
```java
        if (currentexpression instanceof CtExpression) {
            CtExpression exper = (CtExpression) currentexpression;
            try {
                if (exper.getType() != null
                    && exper.getType().unbox().toString().equals("boolean")) {
                    return true;
                }
            } catch (Exception e) {
                return false;
            }
        }

        return false;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
			String pathname = fileModif.getAbsolutePath() + File.separator + pairFolder.getName() + "_"
					+ fileModif.getName();

			File previousVersion = new File(pathname + "_s.java");
			if (!previousVersion.exists()) {
				log.error("The source file " + previousVersion.getPath() + " not exist!");
			} else {
				pathmap.put("src", previousVersion);
				File postVersion = new File(pathname + "_t.java");
				pathmap.put("target", postVersion);

			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
				for (CtStatement aStatement : statements) {

					List<CtVariableAccess> varsInRightPart;

					if (!isElementBeforeVariable(variableAffected, aStatement))
						continue;

					if (isStatementInControl(parent, aStatement) || parent == aStatement)
						continue;

					if (aStatement instanceof CtIf || aStatement instanceof CtLoop) {
						varsInRightPart = VariableResolver.collectVariableRead(retrieveElementToStudy(aStatement));
					} else
						varsInRightPart = VariableResolver.collectVariableRead(aStatement);

					// if the var access in the right is the same that the affected
					for (CtVariableAccess varInStatement : varsInRightPart) {
						if (hasSameName(variableAffected, varInStatement)) {
							aVarUsed = true;
							break;
						}
					}
					if (aVarUsed)
						break;
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
					List<CtVariableAccess> varsInRightPart;

					if (!isElementBeforeVariable(variableAffected, aStatement))
						continue;

					if (isStatementInControl(parent, aStatement) || parent == aStatement)
						continue;

					if (aStatement instanceof CtIf || aStatement instanceof CtLoop) {
						varsInRightPart = VariableResolver.collectVariableRead(retrieveElementToStudy(aStatement));
					} else
						varsInRightPart = VariableResolver.collectVariableRead(aStatement);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
			List<CtTypeReference> inferredpotentionaltypes = new ArrayList<CtTypeReference>();
			inferredpotentionaltypes.clear();

			CtTypeReference inferredtype = null;
			if (anInvocation.getType() == null) {
				for (CtBinaryOperator certainbinary : binaryOperatorInClass) {
					if (certainbinary.getLeftHandOperand() instanceof CtInvocation) {

						CtInvocation anotherinvocation = (CtInvocation) certainbinary.getLeftHandOperand();
						if (anotherinvocation.getExecutable().getSignature()
								.equals(anInvocation.getExecutable().getSignature())
								&& certainbinary.getRightHandOperand().getType() != null) {
							inferredtype = certainbinary.getRightHandOperand().getType();
							inferredpotentionaltypes.add(inferredtype);
							break;
						}
					}

					if (certainbinary.getRightHandOperand() instanceof CtInvocation) {
						CtInvocation anotherinvocation = (CtInvocation) certainbinary.getRightHandOperand();
						if (anotherinvocation.getExecutable().getSignature()
								.equals(anInvocation.getExecutable().getSignature())
								&& certainbinary.getLeftHandOperand().getType() != null) {
							inferredtype = certainbinary.getLeftHandOperand().getType();
							inferredpotentionaltypes.add(inferredtype);
							break;
						}
					}
				}

			} else
				inferredtype = anInvocation.getType();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
				for (CtBinaryOperator certainbinary : binaryOperatorInClass) {
					if (certainbinary.getLeftHandOperand() instanceof CtInvocation) {

						CtInvocation anotherinvocation = (CtInvocation) certainbinary.getLeftHandOperand();
						if (anotherinvocation.getExecutable().getSignature()
								.equals(ainvocation.getExecutable().getSignature())
								&& certainbinary.getRightHandOperand().getType() != null) {

							inferredtype = certainbinary.getRightHandOperand().getType();
							inferredpotentionaltypes.add(inferredtype);
							break;
						}
					}

					if (certainbinary.getRightHandOperand() instanceof CtInvocation) {
						CtInvocation anotherinvocation = (CtInvocation) certainbinary.getRightHandOperand();
						if (anotherinvocation.getExecutable().getSignature()
								.equals(ainvocation.getExecutable().getSignature())
								&& certainbinary.getLeftHandOperand().getType() != null) {
							inferredtype = certainbinary.getLeftHandOperand().getType();
							inferredpotentionaltypes.add(inferredtype);
							break;
						}
					}
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
		List<String> unaryOps = new ArrayList();
		
		CtScanner scanner = new CtScanner() {

			@Override
			public <T> void visitCtUnaryOperator(CtUnaryOperator<T> operator) {

				super.visitCtUnaryOperator(operator);
				unaryOps.add(operator.getKind().toString());
			}
		};
		
		scanner.scan(expressiontostudy);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
			if(var.getType().toString().toLowerCase().endsWith("string")) {
				if(literaltype.equals("string"))
				    typecompatiable=true; 
			}
			else  {
			    if(var.getType().isPrimitive()) {
				   if(var.getType().toString().toLowerCase().endsWith("char")) {
					   if(literaltype.equals("char"))
						   typecompatiable=true; 
				   }
				   else if(var.getType().toString().toLowerCase().endsWith("boolean")) {
					   if(literaltype.equals("boolean"))
					       typecompatiable=true; 
				   }
				   else {
					   if(literaltype.equals("numerical"))
					       typecompatiable=true; 
				   }
			    }
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io.")
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType()!=null && (conAffected.getType().isPrimitive() || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().isPrimitive() || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long[]") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("double[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("byte[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("short[]")||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("float[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("chart[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("character[]") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("integer[]")
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
					List<CtElement> specificarguments = specificinvocation.getArguments(); 
					
					for(int index=0; index< specificarguments.size(); index++) {
						
						CtElement specificargument = specificarguments.get(index);
						
						List<CtConstructorCall> invocationsinargument = specificargument.getElements(e -> (e instanceof CtConstructorCall)).stream()
								.map(CtConstructorCall.class::cast).collect(Collectors.toList());
						
						for(int innerindex=0; innerindex<invocationsinargument.size(); innerindex++) {
						
						   if(getSimplenameForConstructorCall(invocationsinargument.get(innerindex)).
								   equals(getSimplenameForConstructorCall(conAffected))) {
							   con3wrapttedinothers = true;
							   break;
						   }	
						}
						
						if(con3wrapttedinothers)
							break;
					}
					
					if(con3wrapttedinothers)
						break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				List<String> binOps = new ArrayList();
				CtScanner scannerOps = new CtScanner() {

					@Override
					public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
						super.visitCtBinaryOperator(operator);
						binOps.add(operator.getKind().toString());
					}
				};
				
				scannerOps.scan(logicalexpression);
				
				boolean containsAnd = binOps.contains(BinaryOperatorKind.AND.toString());
				boolean containsOr = binOps.contains(BinaryOperatorKind.OR.toString());
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					CtElement parent = aVarFromAffected.getParent();
					if (parent instanceof CtExpression) {
						// First case: the parent is a binary
						if (isLogicalExpression((CtExpression) parent)) {
							hasVarDirectlyUsed = true;
							break;
						} else {
							// Second case: the parent is a negation
							if (parent instanceof CtUnaryOperator) {
								if (isLogicalExpression(((CtUnaryOperator) parent).getParent())) {
									hasVarDirectlyUsed = true;
									break;
								}
							}
						}
					}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				List<CtBinaryOperator> binOps = new ArrayList();
				
				CtScanner scanner = new CtScanner() {
					@Override
					public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
						super.visitCtBinaryOperator(operator);
						
						if (logicOperators.contains(operator.getKind()))
							binOps.add(operator);
					}
				};
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				List<CtExpression> atomicboolexperssions = new ArrayList();
				
				for(int index=0; index<binOps.size(); index++) {
					CtExpression left= binOps.get(index).getLeftHandOperand();
					CtExpression right=binOps.get(index).getRightHandOperand();
					if(!wheteherCompundBoolExper(binOps, left))
						atomicboolexperssions.add(left);
					if(!wheteherCompundBoolExper(binOps, right))
						atomicboolexperssions.add(right);
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				if(whetherinvtargetincomparision)
					break;
				
				for(int leftindex=0; leftindex<comparisionleft.size(); leftindex++) {
					CtExpression lefttostudy = comparisionleft.get(leftindex);
					
					List<CtExpression> expressionssFromClass = lefttostudy.getElements(e -> (e instanceof CtExpression)).stream()
							.map(CtExpression.class::cast).collect(Collectors.toList());
					
					if(expressionssFromClass.contains(tostudy)) {
						whetherinvtargetincomparision = true;
						break;
					}
				}
				
				if(whetherinvtargetincomparision)
					break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				for(int rightindex=0; rightindex<comparisionright.size(); rightindex++) {
	                CtExpression righttostudy = comparisionright.get(rightindex);
					
					List<CtExpression> expressionssFromClass = righttostudy.getElements(e -> (e instanceof CtExpression)).stream()
							.map(CtExpression.class::cast).collect(Collectors.toList());
					
					if(expressionssFromClass.contains(tostudy)) {
						whetherinvtargetincomparision = true;
						break;
					}
				}
				
				if(whetherinvtargetincomparision)
					break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						List<CtElement> specificarguments = specificconstructor.getArguments(); 
						
						for(int index=0; index< specificarguments.size(); index++) {
							
							CtElement specificargument = specificarguments.get(index);
							
							List<CtInvocation> invocationsinargument = specificargument.getElements(e -> (e instanceof CtInvocation)).stream()
									.map(CtInvocation.class::cast).collect(Collectors.toList());
							
							for(int innerindex=0; innerindex<invocationsinargument.size(); innerindex++) {
								
								   if(invocationsinargument.get(innerindex).getExecutable().getSimpleName().
										   equals(invAffected.getExecutable().getSimpleName())) {
									   M10wrapttedinothers = true;
									   break;
								  }	
							 }

							if(M10wrapttedinothers)
								break;
						}
						
						if(M10wrapttedinothers)
							break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
					for(int index=0; index< specificarguments.size(); index++) {
						
						CtElement specificargument = specificarguments.get(index);
						
						List<CtInvocation> invocationsinargument = specificargument.getElements(e -> (e instanceof CtInvocation)).stream()
								.map(CtInvocation.class::cast).collect(Collectors.toList());
						
						for(int innerindex=0; innerindex<invocationsinargument.size(); innerindex++) {
						
						   if(invocationsinargument.get(innerindex).getExecutable().getSimpleName().
								   equals(invAffected.getExecutable().getSimpleName())) {
							   M10wrapttedinothers = true;
							   break;
						   }	
						}
						
						if(M10wrapttedinothers)
							break;
					}
					
					if(M10wrapttedinothers)
						break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						    if(Boolean.valueOf(particularVar.getInformation().get("V1_LOCAL_VAR_NOT_USED").toString()))
							    M1_LOCAL_VAR_NOT_USED = true;
						
						    if(Boolean.valueOf(particularVar.getInformation().get("V1_LOCAL_VAR_NOT_ASSIGNED").toString()))
							    M1_LOCAL_VAR_NOT_ASSIGNED = true;

							if(particularVar.isBooleanValueTrue("V2_SIMILAR_OBJECT_TYPE_WITH_NORMAL_GUARD"))
						    	M2_SIMILAR_OBJECT_TYPE_WITH_NORMAL_GUARD = true;

							if(particularVar.isBooleanValueTrue("V5_SIMILAR_PRIMITIVE_TYPE_WITH_NORMAL_GUARD"))
						    	M5_SIMILAR_PRIMITIVE_TYPE_WITH_NORMAL_GUARD = true;

							if(particularVar.isBooleanValueTrue("V2_SIMILAR_OBJECT_TYPE_WITH_NULL_GUARD"))
						    	M2_SIMILAR_OBJECT_TYPE_WITH_NULL_GUARD = true;

							if(particularVar.isBooleanValueTrue("V5_SIMILAR_PRIMITIVE_TYPE_WITH_NULL_GUARD"))
						    	M5_SIMILAR_PRIMITIVE_TYPE_WITH_NULL_GUARD = true;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						if(parentInvocation.equals(specificinvocation))
							continue;
						
						List<CtElement> specificarguments = specificinvocation.getArguments();

						if(parentInvocation.getExecutable().getSimpleName().equals
								(specificinvocation.getExecutable().getSimpleName()) && 
								arguments.size() == specificarguments.size()) {
							
							int[] comparisionresult= argumentDiffMethod(arguments, specificarguments, invAffected);
							
							if(comparisionresult[0]==1 && comparisionresult[1]==1)
								M6ReplacewithVarCurrent =true;
							
							if(comparisionresult[0]==1 && comparisionresult[2]==1)
								M7ReplacewithInvocationCurrent =true;
						}
						
						if(M6ReplacewithVarCurrent && M7ReplacewithInvocationCurrent)
							break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
				CtStatementList CS = (CtStatementList) parent;
				List<CtStatement> tmp = new ArrayList<>();
				int idx = 0;
				boolean found = false;
				for (CtStatement stmt : CS.getStatements()) {
					if (stmt.equals(element)) {
						found = true;
						idx = tmp.size();
					}
					tmp.add(stmt);
				}
				assert (found);

				int s = 0;
				if (idx > LOOKUP_DIS)
					s = idx - LOOKUP_DIS;
				int e = tmp.size();
				if (idx + LOOKUP_DIS + 1 < tmp.size())
					e = idx + LOOKUP_DIS + 1;
				boolean above = true;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
            int s = 0;
            if (idx > LOOKUP_DIS)
                s = idx - LOOKUP_DIS;
            int e = tmp.size();
            if (idx + LOOKUP_DIS + 1 < tmp.size())
                e = idx + LOOKUP_DIS + 1;
            boolean above = true;
            for (int i = s; i < e; i++) {
                if (!tmp.get(i).equals(srcElem)) {
                    if (above)
                        stmtsF.add(tmp.get(i));
                    else
                        stmtsL.add(tmp.get(i));
                }
                if (tmp.get(i).equals(srcElem))
                    above = false;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
				for (int i = s; i < e; i++) {
					if (!tmp.get(i).equals(element)) {
						if (above)
							stmtsBefore.add(tmp.get(i));
						else
							stmtsAfter.add(tmp.get(i));
					}
					if (tmp.get(i).equals(element))
						above = false;
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
			} else if (op instanceof DeleteOperation) {
				MappingStore mapping = diff.getMappingsComp();

				if (!mapping.hasSrc(op.getAction().getNode().getParent()))
					return false;

				ITree dstTree = mapping.getDst(op.getAction().getNode().getParent());
				affectedNode = (CtElement) dstTree.getMetadata("spoon_object");
				srcNode = op.getSrcNode();
			} else if (op instanceof UpdateOperation) {
				affectedNode = op.getDstNode();
				srcNode = op.getSrcNode();
			} else {
				// FIXME: deep_mov operations should not be ignored
				return false;
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
			if ((dstElement instanceof CtVariableAccess || dstElement instanceof CtVariable)
					&& !(dstElement instanceof CtLocalVariable)) {
				String variableType = getType(dstElement);
				dstNodeAsString = replaceElement(dstNodeAsString, dstElement.toString(), "#" + variableType + "#");
			}

			if (dstElement instanceof CtAbstractInvocation) {
				String methodStr = ((CtAbstractInvocation) dstElement).getExecutable().toString();
				methodStr = methodStr.substring(0, methodStr.indexOf('(')) + "(";
				dstNodeAsString = replaceElement(dstNodeAsString, methodStr, "#METHOD#(");
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
		int fromInd = 0;
		while (source.indexOf(element, fromInd) > -1) {
			int ind = source.indexOf(element, fromInd);
			if (!((ind > 0 && isVariableNameChar(source.charAt(ind - 1))) || (ind + element.length() < source.length()
					&& isVariableNameChar(source.charAt(ind + element.length()))))) {
				// the chars before and after the element are not a variable-name-char
				source = source.substring(0, ind) + target
						+ (ind + element.length() >= source.length() ? "" : source.substring(ind + element.length()));
				fromInd = ind + target.length();
				if (fromInd >= source.length())
					break;
				continue;
			}
			fromInd = ind + element.length();
			if (fromInd >= source.length())
				break;
		}
		return source;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
		temp1 = ASTInfoResolver.getCleanedName(temp1);
		temp2 = ASTInfoResolver.getCleanedName(temp2);
		String[] parts1 = temp1.split("#");
		String[] parts2 = temp2.split("#");
		if (parts1.length != parts2.length)
			return false;
		for (int i = 0; i < parts1.length; i++) {
			if (!parts1[i].equals(parts2[i]) && !parts1[i].equals("<nulltype>") && !parts2[i].equals("<nulltype>")
					&& !parts1[i].equals("null") && !parts2[i].equals("null"))
				return false;
		}
		return true;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
			if (op instanceof InsertOperation) {
				res.add(op.getSrcNode());
			} else if (op instanceof UpdateOperation) {
				res.add(op.getSrcNode());
				res.add(op.getDstNode());
			} else if (op instanceof DeleteOperation) {
				res.add(op.getSrcNode());
			} else if (op instanceof MoveOperation) {
				res.add(op.getDstNode());
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
			if (op instanceof InsertOperation) {
				res.add(ASTInfoResolver.getFirstAncestorOfType(op.getSrcNode(), CtEntityType.STATEMENT));
				res.add(ASTInfoResolver.getFirstAncestorOfType(((InsertOperation) op).getParent(),
						CtEntityType.STATEMENT));
			} else if (op instanceof UpdateOperation) {
				res.add(ASTInfoResolver.getFirstAncestorOfType(op.getSrcNode(), CtEntityType.STATEMENT));
				res.add(ASTInfoResolver.getFirstAncestorOfType(op.getDstNode(), CtEntityType.STATEMENT));
			} else if (op instanceof DeleteOperation) {
				res.add(ASTInfoResolver.getFirstAncestorOfType(op.getSrcNode(), CtEntityType.STATEMENT));
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
		Map<ChangePatternInstance, Set> instanceToCoveredNodes = new HashMap<>();
		List<ChangePatternInstance> ret = new ArrayList<>();

		for (ChangePatternInstance instance : lst) {
			if (instance.getPattern().getName().contains(ARJA_SHALLOW_PATTERN)) {
				ret.add(instance);
				instanceToCoveredNodes.put(instance, getInstanceCoveredNodes(instance, diff));
			}
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
		for (ChangePatternInstance instance : lst) {
			if (instance.getPattern().getName().contains(ARJA_DEEP_PATTERN)) {
				List<CtElement> changedNodes = new ArrayList<>();
				changedNodes.add(instance.getActions().get(0).getSrcNode());
				if (instance.getActions().get(0).getDstNode() != null)
					changedNodes.add(instance.getActions().get(0).getDstNode());
				updateSelectedInstances(instanceToCoveredNodes, ret, instance, changedNodes, diff);
			}
		}

		return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
				List<CtElement> changedNodes = new ArrayList<>();
				changedNodes.add(instance.getActions().get(0).getSrcNode());
				if (instance.getActions().get(0).getDstNode() != null)
					changedNodes.add(instance.getActions().get(0).getDstNode());
				updateSelectedInstances(instanceToCoveredNodes, ret, instance, changedNodes, diff);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
		boolean addedBefore = false;
		for (ChangePatternInstance existingInstance : ret) {
			Set<CtElement> instanceCoveredNodes = instanceToCoveredNodes.get(existingInstance);
			for (CtElement changedNode : changedNodes) {
				if (coveredByInstanceNodes(instanceCoveredNodes, changedNode)) {
					addedBefore = true;
					break;
				}
			}
			if (addedBefore)
				break;
		}
		if (!addedBefore) {
			ret.add(instance);
			instanceToCoveredNodes.put(instance, getInstanceCoveredNodes(instance, diff));
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/coming/utils/OperationClassifier.java`
#### Snippet
```java
		for (ITree deletedSrc : srcDelTrees) {

			if (srcDelTrees.contains(deletedSrc.getParent()) || srcUpdTrees.contains(deletedSrc.getParent())) {

				Operation sonOperation = originalActionsSrc.get(deletedSrc);
				Operation parentOperation = originalActionsSrc.get(deletedSrc.getParent());
				hierarchy.add(parentOperation, sonOperation);
			}

		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    if (!catalogs.containsKey(pathName)) {
                        catalogs.put(pathName, new HashMap<>());
                    }
                    Map<File, File> catalog = catalogs.get(pathName);
                    List<File> oldFiles = new ArrayList<>();
                    List<File> fixFiles = new ArrayList<>();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                List<File> buggyFiles = new ArrayList<>();
                List<File> patchedFiles = new ArrayList<>();
                for (File dataFile : numFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (dataFile.getName().equals("buggy")) {
                        buggyFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    } else if (dataFile.getName().equals("patched")) {
                        patchedFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    }
                }
                List<File> keys = new ArrayList<>();
                List<File> values = new ArrayList<>();
                for (File buggyFile : buggyFiles) {
                    if (buggyFile.getName().endsWith(".java")) {
                        keys.add(buggyFile);
                    }
                }
                for (File patchedFile : patchedFiles) {
                    values.addAll(Arrays.asList(patchedFile.listFiles(javaFilter)));
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                for (File dataFile : numFile.listFiles((dir, name) -> !name.startsWith("."))) {
                    if (dataFile.getName().equals("buggy")) {
                        buggyFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    } else if (dataFile.getName().equals("patched")) {
                        patchedFiles.addAll(Arrays.asList(dataFile.listFiles((dir, name) -> !name.startsWith("."))));
                    }
                }
                List<File> keys = new ArrayList<>();
                List<File> values = new ArrayList<>();
                for (File buggyFile : buggyFiles) {
                    if (buggyFile.getName().endsWith(".java")) {
                        keys.add(buggyFile);
                    }
                }
                for (File patchedFile : patchedFiles) {
                    values.addAll(Arrays.asList(patchedFile.listFiles(javaFilter)));
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    String keyName = key.getName();
                    List<File> patches = new ArrayList<>();
                    // we add human patch at the first place
                    File humanFile = new File(patchPath + pathName);
                    for (File file : Lists.newArrayList(Files.fileTraverser().depthFirstPreOrder(humanFile))) {
                        String fileName = file.getName();
                        if (keyName.equals(fileName)) {
                            patches.add(file);
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
            File humanFile = null;
            try {
                File[] humanFiles = new File(eachFile.getPath() + "/human").listFiles(javaFilter);
                if (humanFiles.length == 1) {
                    humanFile = humanFiles[0];
                } else {
                    continue;
                }
            } catch (NullPointerException e) {
//                e.printStackTrace();
                continue;
            }

            String pathName = eachFile.getName();
            if (!catalogs.containsKey(pathName)) {
                catalogs.put(pathName, new HashMap<>());
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
        for (File file : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            // patchInfo
            String pathName = file.getName();
            File buggyFile = null;
            File patchedFile = null;
            for (File tmpFile : Files.fileTraverser().breadthFirst(file)) {
                if (tmpFile.getName().endsWith("_s.java")) {
                    buggyFile = tmpFile;
                } else if (tmpFile.getName().endsWith("_t.java")) {
                    patchedFile = tmpFile;
                }
            }
            if (buggyFile != null && patchedFile != null) {
                Map<File, File> catalog = new HashMap<>();
                catalog.put(buggyFile, patchedFile);

                if (!catalogs.containsKey(pathName)) {
                    catalogs.put(pathName, catalog);
                } else {
                    catalogs.get(pathName).putAll(catalog);
                }
            }
        }
        return catalogs;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            if (buggyFile != null && patchedFile != null) {
                Map<File, File> catalog = new HashMap<>();
                catalog.put(buggyFile, patchedFile);

                if (!catalogs.containsKey(pathName)) {
                    catalogs.put(pathName, catalog);
                } else {
                    catalogs.get(pathName).putAll(catalog);
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
        String dataPath = Support.getFilePath(DirType.DATA_DIR, option);
        String featurePath = Support.getFilePath(DirType.FEATURE_DIR, option);
        List<String> blackList = getBlacklist();

        List<String> filePaths = new ArrayList<>();
        String binFilePath = featurePath + "catalog.bin";
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                        String tmpFileName = oldFile.getName().replace(".java", ".bin");
                        String vectorPath = pathName + "/" + tmpFileName;
                        System.out.println(vectorPath);
                        if (blackList.contains(vectorPath)) {
                            progressNow += 1;
                            System.out.println("blacklist");
                            continue;
                        }
                        vectorPath = featurePath + vectorPath;
                        File vectorFile = new File(vectorPath);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
        EnumSet<RepairFeature> repairFeatures = EnumSet.noneOf(RepairFeature.class);
        if (repair.kind == null) {
            // I used null in FeatureExtractorTest.java
            return repairFeatures;
        }
        switch (repair.kind) {
            case IfExitKind:
                // RepairFeature.INSERT_CONTROL_RF == AddControlRepair
                repairFeatures.add(RepairFeature.INSERT_CONTROL_RF);
                break;
            case GuardKind:
            case SpecialGuardKind:
                // RepairFeature.INSERT_GUARD_RF == GuardRepair
                repairFeatures.add(RepairFeature.INSERT_GUARD_RF);
                break;
            case AddInitKind:
            case AddAndReplaceKind:
                // RepairFeature.INSERT_STMT_RF == AddStmtRepair
                repairFeatures.add(RepairFeature.INSERT_STMT_RF);
                break;
            case TightenConditionKind:
            case LoosenConditionKind:
                // RepairFeature.REPLACE_COND_RF == CondRepair
                repairFeatures.add(RepairFeature.REPLACE_COND_RF);
                break;
            case ReplaceKind:
            case ReplaceStringKind:
                // RepairFeature.REPLACE_STMT_RF == ReplaceStmtRepair
                repairFeatures.add(RepairFeature.REPLACE_STMT_RF);
                break;
        }
        return repairFeatures;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
EnumSet<ValueFeature> valueFeatures = EnumSet.noneOf(ValueFeature.class);
        if (repair.oldRExpr != null && repair.newRExpr != null) {
            String oldStr = repair.oldRExpr.toString();
            String newStr = repair.newRExpr.toString();
            if (valueStr.equals(newStr))
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
                    if (oldStr.contains(newStr) || newStr.contains(oldStr))
                        valueFeatures.add(ValueFeature.MODIFIED_SIMILAR_VF);
            }
        }
        CtElement element = repair.dstElem;
        if (element != null) {
            CtMethod FD = element.getParent(new TypeFilter<>(CtMethod.class));
            if (FD != null) {
                for (Object parameter: FD.getParameters()) {
                    if (parameter instanceof CtParameter) {
                        CtParameter VD = (CtParameter) parameter;
                        if (VD.getSimpleName().equals(valueStr))
                            valueFeatures.add(ValueFeature.FUNC_ARGUMENT_VF);
                    }
                }
            }
        }
        assert(valueExprInfo.containsKey(valueStr));
        CtElement E = valueExprInfo.get(valueStr);
        if (E instanceof CtVariableAccess || E instanceof CtArrayAccess || E instanceof CtLocalVariable) {
            if (E instanceof CtLocalVariable) {
                valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
            } else {
                valueFeatures.add(ValueFeature.GLOBAL_VARIABLE_VF);
            }
        } else if (E instanceof CtExecutableReference){
            // just make CALLEE_AF be meaningful
            if (((CtExecutableReference) E).getParameters().size() > 0){
                valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
            }
        } else if (E instanceof CtIf){
            // just make R_STMT_COND_AF be meaningful
            valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
        }
//        if (E instanceof CtVariable) {
//            if (E instanceof CtLocalVariable)
//                valueFeatures.add(SchemaFeature.LOCAL_VARIABLE_VF);
//            else
//                valueFeatures.add(SchemaFeature.GLOBAL_VARIABLE_VF);
//        } else if (E instanceof CtVariableReference) {
//            if (E instanceof CtLocalVariableReference)
//                valueFeatures.add(SchemaFeature.LOCAL_VARIABLE_VF);
//            else
//                valueFeatures.add(SchemaFeature.GLOBAL_VARIABLE_VF);
//        }
        if (valueStr.contains("length") || valueStr.contains("size"))
            valueFeatures.add(ValueFeature.SIZE_LITERAL_VF);
        if (E.getElements(new TypeFilter<>(CtField.class)).size() > 0)
            valueFeatures.add(ValueFeature.MEMBER_VF);
        if (E instanceof CtLiteral) {
            Object value = ((CtLiteral)E).getValue();
            if (value instanceof String) {
                valueFeatures.add(ValueFeature.STRING_LITERAL_VF);
            } else if (value instanceof Integer) { // ?
                if ((Integer) value == 0) {
                    valueFeatures.add(ValueFeature.ZERO_CONST_VF);
                } else {
                    valueFeatures.add(ValueFeature.NONZERO_CONST_VF);
                }
            }
        }
        return valueFeatures;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
        List<CtElement> stmtsC = getCurrentStmts(repair);
        List<CtElement> stmtsF = new ArrayList<>();
        List<CtElement> stmtsL = new ArrayList<>();
        getNearbyStmts(repair, stmtsF, stmtsL); // update values by reference

        Map<String, Set<AtomicFeature>> srcMapC = new HashMap<>();
        Map<String, Set<AtomicFeature>> srcMapF = new HashMap<>();
        Map<String, Set<AtomicFeature>> srcMapL = new HashMap<>();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
        for (CtElement stmt : stmtsC) {
            Map<String, Set<AtomicFeature>> map = new S4ROFeatureVisitor(valueExprInfo).traverseStmt(stmt);
            map.forEach((k, v) -> srcMapC.merge(k, v, (v1, v2) -> {
                v1.addAll(v2);
                return v1;
            }));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        CtElement srcElem = repair.srcElem;
        if (!repair.isReplace) {
            ret.add(srcElem);
            return ret;
        }
        else {
            ret.add(srcElem);
            CtStatement ElseB = null;
            if (repair.dstElem instanceof CtIf) {
                CtIf IFS = (CtIf) repair.dstElem;
                if (IFS.getThenStatement() instanceof CtStatementList) {
                    CtStatementList CS = IFS.getThenStatement();
                    ret.addAll(CS.getStatements());
                }
                else
                    ret.add(IFS.getThenStatement());
                ElseB = IFS.getElseStatement();
                if (ElseB != null) {
                    if (ElseB instanceof CtStatementList) {
                        CtStatementList CS = IFS.getThenStatement();
                        ret.addAll(CS.getStatements());
                    }
                    else
                        ret.add(ElseB);
                }
            }
            if (ElseB==null) {
                CtElement parent = srcElem.getParent();
                if (parent instanceof CtStatementList) {
                    CtStatementList CS = (CtStatementList) parent;
                    boolean found = false;
                    for (CtStatement stmt : CS.getStatements()) {
                        if (found) {
                            ret.add(stmt);
                            break;
                        }
                        if (stmt.equals(srcElem))
                            found = true;
                    }
                }
            }
            return ret;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
        CtElement parent = srcElem.getParent();
        if (parent instanceof CtStatementList) {
            CtStatementList CS = (CtStatementList) parent;
            List<CtStatement> tmp = new ArrayList<>();
            int idx = 0;
            boolean found = false;
            for (CtStatement stmt: CS.getStatements()) {
                if (stmt.equals(srcElem)) {
                    found = true;
                    idx = tmp.size();
                }
                tmp.add(stmt);
            }
            assert(found);
            int s = 0;
            if (idx > LOOKUP_DIS)
                s = idx - LOOKUP_DIS;
            int e = tmp.size();
            if (idx + LOOKUP_DIS + 1 < tmp.size())
                e = idx + LOOKUP_DIS + 1;
            boolean above = true;
            for (int i = s; i < e; i++) {
                if (tmp.get(i).equals(srcElem)) {
                    if (above)
                        stmtsF.add(tmp.get(i));
                    else
                        stmtsL.add(tmp.get(i));
                }
                if (tmp.get(i).equals(srcElem))
                    above = false;
            }
        }
        if (!repair.isReplace)
            stmtsL.add(srcElem);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        if (S == null) return false;
        if (area.contains(S))
            return true;
        // why Prophet does not need the second condition ?
        if (S instanceof CtStatementList && compound_counter.containsKey(S)) {
            CtStatementList CS = (CtStatementList) S;
            return compound_counter.get(CS) >= 2 || (compound_counter.get(CS) == 1 && CS.getStatements().size() == 1);
        } else {
            return false;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        CtExpression<Boolean> oldCondition = n.getCondition();
        CtLiteral<Boolean> placeholder = factory.createLiteral();
        placeholder.setValue(true); // consider the placeholder, should this be more concrete?
        CtUnaryOperator<Boolean> tmpCondition = factory.createUnaryOperator();
        tmpCondition.setKind(UnaryOperatorKind.NOT);
        tmpCondition.setOperand(placeholder);
        CtBinaryOperator<Boolean> newCondition = factory.createBinaryOperator();
        newCondition.setKind(BinaryOperatorKind.AND);
        newCondition.setLeftHandOperand(oldCondition);
        newCondition.setRightHandOperand(placeholder);

        CtIf S = n.clone();
        S.setParent(n.getParent());
        S.setCondition(newCondition);

        Repair repair = new Repair();
        repair.kind = RepairKind.TightenConditionKind;
        repair.isReplace = true;
        repair.srcElem = n;
        repair.dstElem = S;
        repair.atoms.addAll(repairAnalyzer.getCondCandidateVars(n));
        repairs.add(repair);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        CtExpression<Boolean> oldCondition = n.getCondition();
        CtLiteral<Boolean> placeholder = factory.createLiteral();
        placeholder.setValue(true); // consider the placeholder, should this be more concrete?
        CtBinaryOperator<Boolean> newCondition = factory.createBinaryOperator();
        newCondition.setKind(BinaryOperatorKind.OR);
        newCondition.setLeftHandOperand(oldCondition);
        newCondition.setRightHandOperand(placeholder);

        CtIf S = n.clone();
        S.setParent(n.getParent());
        S.setCondition(newCondition);

        Repair repair = new Repair();
        repair.kind = RepairKind.LoosenConditionKind;
        repair.isReplace = true;
        repair.srcElem = n;
        repair.dstElem = S;
        repair.atoms.addAll(repairAnalyzer.getCondCandidateVars(n));
        repairs.add(repair);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        CtLiteral<Boolean> placeholder = factory.createLiteral();
        placeholder.setValue(true); // consider the placeholder, should this be more concrete?
        CtUnaryOperator<Boolean> guardCondition = factory.createUnaryOperator();
        guardCondition.setKind(UnaryOperatorKind.NOT);
        guardCondition.setOperand(placeholder);

        CtIf guardIf = factory.createIf();
        guardIf.setParent(n.getParent());
        guardIf.setCondition(guardCondition);
        guardIf.setThenStatement(n.clone());

        Repair repair = new Repair();
        repair.kind = RepairKind.GuardKind;
        repair.isReplace = true;
        repair.srcElem = n;
        repair.dstElem = guardIf;
        repair.atoms.addAll(repairAnalyzer.getCondCandidateVars(n));
        repairs.add(repair);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
CtLiteral<Boolean> placeholder = factory.createLiteral();
        placeholder.setValue(true); // consider the placeholder, should this be more concrete?
        Type returnType = void.class;
        CtMethod curFD = repairAnalyzer.getCurrentFunction(n);
        if (curFD != null) {
            CtStatement lastStatement = curFD.getBody().getLastStatement();
//            CtReturn ctReturn = curFD.getBody().getLastStatement();
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
            if (ctReturns.size() > 0) {
                returnType = ctReturns.get(0).getClass().getGenericSuperclass();
            }
        }
        if (returnType == void.class) {
            CtLiteral<Object> returnValue = factory.createLiteral();
            returnValue.setValue(null); // is it equivalent to void ?
            CtReturn<Object> RS = factory.createReturn();
            RS.setReturnedExpression(returnValue);
            CtIf IFS = factory.createIf();
            IFS.setParent(n.getParent());
            IFS.setCondition(placeholder);
            IFS.setThenStatement(RS);
            Repair repair = new Repair();
            repair.kind = RepairKind.IfExitKind;
            repair.isReplace = false;
            repair.srcElem = n;
            repair.dstElem = IFS;
            repair.atoms = repairAnalyzer.getCondCandidateVars(n);
            repairs.add(repair);
        }
        else {
            List<CtExpression> exprs = repairAnalyzer.getCandidateReturnExpr(n, returnType);
            for (CtExpression placeholder2 : exprs) {
                CtReturn<Object> RS = factory.createReturn();
                RS.setReturnedExpression(placeholder2);
                CtIf IFS = factory.createIf();
                IFS.setParent(n.getParent());
                IFS.setCondition(placeholder);
                IFS.setThenStatement(RS);
                Repair repair = new Repair();
                repair.kind = RepairKind.IfExitKind;
                repair.isReplace = false;
                repair.srcElem = n;
                repair.dstElem = IFS;
                repair.atoms = repairAnalyzer.getCondCandidateVars(n);
                repairs.add(repair);
            }
        }
        if (repairAnalyzer.isInsideLoop(n)) {
            CtBreak BS = factory.createBreak();
            CtIf IFS = factory.createIf();
            IFS.setParent(n.getParent());
            IFS.setCondition(placeholder);
            IFS.setThenStatement(BS);
            Repair repair = new Repair();
            repair.kind = RepairKind.IfExitKind;
            repair.isReplace = false;
            repair.srcElem = n;
            repair.dstElem = IFS;
            repair.atoms = repairAnalyzer.getCondCandidateVars(n);
            repairs.add(repair);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
            V.TraverseStmt(n);
            for (CtElement it : V.getResult()) {
                Repair repair = new Repair();
                repair.kind = RepairKind.ReplaceKind;
                repair.isReplace = true;
                repair.srcElem = n;
                repair.dstElem = it;
                repair.atoms.addAll(new ArrayList<>());
                repair.oldRExpr = V.getOldRExpr(it);
                repair.newRExpr = V.getNewRExpr(it);
                repairs.add(repair);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        if (n instanceof CtLiteral) {
            if (((CtLiteral) n).getValue() instanceof String) {
                CtLiteral<String> placeholder = factory.createLiteral();
                placeholder.setValue("");
                Repair repair = new Repair();
                repair.kind = RepairKind.ReplaceStringKind;
                repair.isReplace = true;
                repair.srcElem = n;
                repair.dstElem = placeholder;
                repair.atoms.addAll(new ArrayList<>());
                repair.oldRExpr = n;
                repair.newRExpr = null;
                repairs.add(repair);
            }
        }

        if (n instanceof CtInvocation) {
            for (CtInvocation it : repairAnalyzer.getCandidateCalleeFunction((CtInvocation) n)) {
                Repair repair = new Repair();
                repair.kind = RepairKind.ReplaceKind;
                repair.isReplace = true;
                repair.srcElem = n;
                repair.dstElem = it;
                repair.atoms.addAll(new ArrayList<>());
                repair.oldRExpr = ((CtInvocation) n).getExecutable();
                repair.newRExpr = it;
                repairs.add(repair);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
            V.TraverseStmt(it);
//            if (!repairAnalyzer.isValidStmt(it))
//                continue;

            for (CtElement it2 : V.getResult()) {
//                boolean valid_after_replace = repairAnalyzer.isValidStmt(it2);
//                if (!valid_after_replace) continue;
                Repair repair = new Repair();
                repair.kind = RepairKind.AddAndReplaceKind;
                repair.isReplace = false;
                repair.srcElem = n;
                repair.dstElem = it2;
                repair.atoms.addAll(new ArrayList<>());
                repairs.add(repair);
            }
            Repair repair = new Repair();
            repair.kind = RepairKind.AddAndReplaceKind;
            repair.isReplace = false;
            repair.srcElem = n;
            repair.dstElem = it;
            repair.atoms.addAll(new ArrayList<>());
            repairs.add(repair);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        Set<CtElement> stmts = repairAnalyzer.getGlobalCandidateIfStmts(n);
        for (CtElement it : stmts) {
//            boolean valid = repairAnalyzer.isValidStmt(it);
//            if (!valid) continue;
            Repair repair = new Repair();
            repair.kind = RepairKind.AddAndReplaceKind;
            repair.isReplace = false;
            repair.srcElem = n;
            repair.dstElem = it;
            repair.atoms.addAll(new ArrayList<>());
            repairs.add(repair);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        Repair repair = new Repair();
        repair.kind = null; // related to RepairFeature
        repair.isReplace = false;
        repair.srcElem = diffEntry.srcNode;
        repair.dstElem = diffEntry.dstNode;
        repair.atoms.addAll(new ArrayList<>());
        repair.oldRExpr = null; // related to SchemaFeature
        repair.newRExpr = null; // related to SchemaFeature
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
if (IF2 != null) {
                    CtIf IF1;
                    if (diffEntry.srcNode instanceof CtIf) {
                        IF1 = (CtIf) diffEntry.srcNode;
                    } else {
                        IF1 = diffEntry.srcNode.getParent(new TypeFilter<>(CtIf.class));
                    }
                    if (IF1 != null) {
                        // make sure repair.kind would be assigned one value
                        repair.kind = RepairKind.SpecialGuardKind;
                        if (IF1.getThenStatement().equals(IF2.getThenStatement())) {
                            // LoosenConditionKind and TightenConditionKind are almost same as both are REPLACE_COND_RF
                            if (IF1.getElseStatement()!=null && IF2.getElseStatement()!=null) {
                                if (IF1.getElseStatement().equals(IF2.getElseStatement())) {
                                    repair.kind = RepairKind.LoosenConditionKind;
                                }
                            } else {
                                repair.kind = RepairKind.LoosenConditionKind;
                            }
                        }
                    } else {
                        CtStatement S = IF2.getThenStatement();
                        if (S instanceof CtCFlowBreak) {
                            repair.kind = RepairKind.IfExitKind;
                        } else {
                            repair.kind = RepairKind.GuardKind;
                        }
                    }
                } else {
                    if (diffEntry.srcNode instanceof CtLiteral) {
                        repair.kind = RepairKind.ReplaceStringKind;
                    } else {
                        repair.kind = RepairKind.ReplaceKind;
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
CtScanner scanner = new CtScanner() {

            // https://clang.llvm.org/doxygen/classclang_1_1LabelStmt.html
            private boolean isLabelStmt(CtStatement statement) {
                return false;
            }

            // todo check
            // https://clang.llvm.org/doxygen/classclang_1_1DeclStmt.html
            private boolean isDeclStmt(CtStatement statement) {
                return statement instanceof CtIf || statement instanceof CtLoop || statement instanceof CtSwitch || statement instanceof CtAssignment;
            }

            @Override
            public void visitCtIf(CtIf n) {
                // genTightCondition genLooseCondition
                super.visitCtIf(n);
                CtStatement ThenCS = n.getThenStatement();
                CtStatement ElseCS = n.getElseStatement();
                if (isTainted(n) || isTainted(ThenCS))
                    genTightCondition(n);
                if (isTainted(n) || isTainted(ElseCS))
                    genLooseCondition(n);
            }

            @Override
            public void visitCtStatementList(CtStatementList n) {
                super.visitCtStatementList(n);
                compound_counter.put(n, 0);
                for (CtStatement it : n) {
                    if (isTainted(it)) {
                        compound_counter.put(n, compound_counter.get(n) + 1);
                    }
                }
            }

            @Override
            public void scan(CtRole role, CtElement element) {
                super.scan(role, element);
                if (element instanceof CtStatement && !(element instanceof CtStatementList)) {
                    CtStatement n = (CtStatement) element;

                    if (isTainted(n)) {
                        // This is to compute whether Stmt n is the first
                        // non-decl statement in a CompoundStmt
                        genReplaceStmt(n);
                        // todo check
                        if (!isDeclStmt(n) && !isLabelStmt(n))
                            genAddIfGuard(n);
                        genAddStmt(n);
                        genAddIfExit(n);
                    }
                    else if (n instanceof CtIf) {
                        CtIf IFS = (CtIf) n;
                        CtStatement thenBlock = IFS.getThenStatement();
                        CtStatement firstS = thenBlock;
                        if (thenBlock instanceof CtStatementList) {
                            CtStatementList CS = (CtStatementList) thenBlock;
                            if (CS.getStatements().size() > 1)
                                firstS = CS.getStatements().get(0);
                        }
                        if (isTainted(thenBlock) || isTainted(firstS)) {
                            genAddStmt(n);
                        }
                    }
                }
            }
        };
        // traverse (i.e. go to each node) the AST of clang::ASTContext (the top declaration context)
        scanner.scan(diffEntry.srcNode);
        return repairs;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
        Set<CtElement> locations = new HashSet<>();
        if (statement instanceof CtMethod || statement instanceof CtClass || statement instanceof CtIf || statement instanceof CtStatementList) {
            locations.add(statement);
        } else {
            // "int a;" is not CtStatement?
            CtElement parent = statement.getParent();
            if (parent != null) {
                List<CtElement> statements = parent.getElements(new TypeFilter<>(CtElement.class));
                if (parent instanceof CtStatement) {
                    statements = statements.subList(1, statements.size());
                }
                int idx = statements.indexOf(statement);
                if (idx >= 0) {
                    if (idx > 0)
                        locations.add(statements.get(idx - 1));
                    locations.add(statements.get(idx));
                    if (idx < statements.size() - 1)
                        locations.add(statements.get(idx + 1));
                }
            }
        }
        return locations;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
        if (v == null) {
            if (!resMap.containsKey("@")) {
                resMap.put("@", new HashSet<>());
            }
            resMap.get("@").add(af);
        }
        else {
//            CtExpression e = stripParenAndCast(v);
//            std::string tmp = stmtToString(*ast, e);
            String tmp = v.toString();
            // i can not know why there is one return here
//            if (v instanceof CtAssignment) {
//                return;
//            }
            // CtInvocation or CtExecutable todo check
//            if (v.getElements(new TypeFilter<>(CtInvocation.class)).size() > 0 && !isAbstractStub(v)) {
//                return;
//            }
            if (!resMap.containsKey(tmp)) {
                resMap.put(tmp, new HashSet<>());
            }
            resMap.get(tmp).add(af);
            if (!valueExprInfo.containsKey(tmp)) {
                valueExprInfo.put(tmp, v);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
CtScanner scanner = new CtScanner() {
            @Override
            public void scan(CtElement element) { // VisitExpr
                super.scan(element);
                if (element instanceof CtLoop || element instanceof CtExpression && element.getParent() instanceof CtLoop) {
//                    assert !isReplace;
                    putValueFeature(null, AtomicFeature.STMT_LOOP_AF);
                    putValueFeature(element, AtomicFeature.STMT_LOOP_AF);
                }
                if (element instanceof CtCFlowBreak || element instanceof CtExpression && element.getParent() instanceof CtCFlowBreak) {
                    if (element instanceof CtLabelledFlowBreak || element instanceof CtExpression && element.getParent() instanceof CtLabelledFlowBreak) {
//                        assert !isReplace;
                        putValueFeature(null, AtomicFeature.STMT_LABEL_AF);
                        putValueFeature(element, AtomicFeature.STMT_LABEL_AF);
                    } else {
                        putValueFeature(null, isReplace ? AtomicFeature.R_STMT_CONTROL_AF : AtomicFeature.STMT_CONTROL_AF);
                        putValueFeature(element, isReplace ? AtomicFeature.R_STMT_CONTROL_AF : AtomicFeature.STMT_CONTROL_AF);
                    }
                }
                if (element instanceof CtAssignment || element instanceof CtExpression && element.getParent() instanceof CtAssignment) {
                    putValueFeature(null, isReplace ? AtomicFeature.R_STMT_ASSIGN_AF : AtomicFeature.STMT_ASSIGN_AF);
                    putValueFeature(element, isReplace ? AtomicFeature.R_STMT_ASSIGN_AF : AtomicFeature.STMT_ASSIGN_AF);
                }
                if (element instanceof CtInvocation || element instanceof CtExpression && element.getParent() instanceof CtInvocation) {
                    putValueFeature(null, isReplace ? AtomicFeature.R_STMT_CALL_AF : AtomicFeature.STMT_CALL_AF);
                    putValueFeature(element, isReplace ? AtomicFeature.R_STMT_CALL_AF : AtomicFeature.STMT_CALL_AF);
                }
                if (element instanceof CtIf || element instanceof CtExpression && element.getParent() instanceof CtIf) {
                    putValueFeature(null, isReplace ? AtomicFeature.R_STMT_COND_AF : AtomicFeature.STMT_COND_AF);
                    putValueFeature(element, isReplace ? AtomicFeature.R_STMT_COND_AF : AtomicFeature.STMT_COND_AF);
                }
            }

            @Override
            public <T> void visitCtInvocation(CtInvocation<T> invocation) { // VisitCallExpr
                super.visitCtInvocation(invocation);
                CtElement callee = invocation.getExecutable();
                putValueFeature(callee, AtomicFeature.CALLEE_AF);
                for (CtExpression it : invocation.getArguments()) {
                    putValueFeature(it, AtomicFeature.CALL_ARGUMENT_AF);
                }
            }

            @Override
            public <T> void visitCtField(CtField<T> f) {
                super.visitCtField(f);
//                if (f instanceof CtArrayAccess)
//                    putValueFeature(f, AtomicFeature.DEREF_AF);
                putValueFeature(f, AtomicFeature.MEMBER_ACCESS_AF);
            }

            @Override
            public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
                super.visitCtFieldReference(reference);
//                if (reference instanceof CtArrayAccess)
//                    putValueFeature(reference, AtomicFeature.DEREF_AF);
                putValueFeature(reference, AtomicFeature.MEMBER_ACCESS_AF);
            }

            @Override
            public <T, A extends T> void visitCtAssignment(CtAssignment<T, A> assignment) {
                super.visitCtAssignment(assignment);
                CtExpression LHS = assignment.getAssigned();
                CtExpression RHS = assignment.getAssignment();
                putValueFeature(LHS, AtomicFeature.ASSIGN_LHS_AF);
                putValueFeature(LHS, AtomicFeature.CHANGED_AF);
                if (RHS instanceof CtLiteral) {
                    Object v = ((CtLiteral)RHS).getValue();
                    if (v instanceof Integer) {
                        if ((Integer) v == 0) {
                            putValueFeature(LHS, AtomicFeature.ASSIGN_ZERO_AF);
                        }
                        putValueFeature(LHS, AtomicFeature.ASSIGN_CONST_AF);
                    }
                }
                if (RHS instanceof CtArrayAccess) {
                    putValueFeature(LHS, AtomicFeature.DEREF_AF);
                    putValueFeature(RHS, AtomicFeature.INDEX_AF);
                }
            }

            @Override
            public <T, A extends T> void visitCtOperatorAssignment(CtOperatorAssignment<T, A> assignment) {
                super.visitCtOperatorAssignment(assignment);
                CtExpression LHS = assignment.getAssigned();
                CtExpression RHS = assignment.getAssignment();
                switch (assignment.getKind()) {
                    case PLUS:
                        putValueFeature(LHS, AtomicFeature.OP_ADD_AF);
                        putValueFeature(RHS, AtomicFeature.OP_ADD_AF);
                        break;
                    case MINUS:
                        putValueFeature(LHS, AtomicFeature.OP_SUB_AF);
                        putValueFeature(RHS, AtomicFeature.OP_SUB_AF);
                        break;
                    case MUL:
                        putValueFeature(LHS, AtomicFeature.OP_MUL_AF);
                        putValueFeature(RHS, AtomicFeature.OP_MUL_AF);
                        break;
                    case DIV:
                        putValueFeature(LHS, AtomicFeature.OP_DIV_AF);
                        putValueFeature(RHS, AtomicFeature.OP_DIV_AF);
                        break;
                    case MOD:
                        putValueFeature(LHS, AtomicFeature.OP_MOD_AF);
                        putValueFeature(RHS, AtomicFeature.OP_MOD_AF);
                        break;
                }
                putValueFeature(LHS, AtomicFeature.CHANGED_AF);
            }

            @Override
            public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
                super.visitCtBinaryOperator(operator);
                CtExpression LHS = operator.getLeftHandOperand();
                CtExpression RHS = operator.getRightHandOperand();
                switch (operator.getKind()) {
                    case PLUS:
                        putValueFeature(LHS, AtomicFeature.OP_ADD_AF);
                        putValueFeature(RHS, AtomicFeature.OP_ADD_AF);
                        break;
                    case MINUS:
                        putValueFeature(LHS, AtomicFeature.OP_SUB_AF);
                        putValueFeature(RHS, AtomicFeature.OP_SUB_AF);
                        break;
                    case MUL:
                        putValueFeature(LHS, AtomicFeature.OP_MUL_AF);
                        putValueFeature(RHS, AtomicFeature.OP_MUL_AF);
                        break;
                    case DIV:
                        putValueFeature(LHS, AtomicFeature.OP_DIV_AF);
                        putValueFeature(RHS, AtomicFeature.OP_DIV_AF);
                        break;
                    case MOD:
                        putValueFeature(LHS, AtomicFeature.OP_MOD_AF);
                        putValueFeature(RHS, AtomicFeature.OP_MOD_AF);
                        break;
                    case LE:
                        putValueFeature(LHS, AtomicFeature.OP_LE_AF);
                        putValueFeature(RHS, AtomicFeature.OP_LE_AF);
                        break;
                    case LT:
                        putValueFeature(LHS, AtomicFeature.OP_LT_AF);
                        putValueFeature(RHS, AtomicFeature.OP_LT_AF);
                        break;
                    case GE:
                        putValueFeature(LHS, AtomicFeature.OP_GE_AF);
                        putValueFeature(RHS, AtomicFeature.OP_GE_AF);
                        break;
                    case GT:
                        putValueFeature(LHS, AtomicFeature.OP_GT_AF);
                        putValueFeature(RHS, AtomicFeature.OP_GT_AF);
                        break;
                    case EQ:
                        putValueFeature(LHS, AtomicFeature.OP_EQ_AF);
                        putValueFeature(RHS, AtomicFeature.OP_EQ_AF);
                        break;
                    case NE:
                        putValueFeature(LHS, AtomicFeature.OP_NE_AF);
                        putValueFeature(RHS, AtomicFeature.OP_NE_AF);
                        break;
                }
            }

            @Override
            public <T> void visitCtUnaryOperator(CtUnaryOperator<T> operator) {
                super.visitCtUnaryOperator(operator);
                CtExpression operand = operator.getOperand();
                switch (operator.getKind()) {
                    case POS:
                        putValueFeature(operand, AtomicFeature.OP_ADD_AF);
                        break;
                    case NEG:
                        putValueFeature(operand, AtomicFeature.OP_SUB_AF);
                        break;
                    case PREINC:
                    case POSTINC:
                        putValueFeature(operand, AtomicFeature.UOP_INC_AF);
                        putValueFeature(operand, AtomicFeature.CHANGED_AF);
                        break;
                    case PREDEC:
                    case POSTDEC:
                        putValueFeature(operand, AtomicFeature.UOP_DEC_AF);
                        putValueFeature(operand, AtomicFeature.CHANGED_AF);
                        break;
                }
            }
        };
        scanner.scan(S);
        return getFeatureResult();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        // Global variables
        CtClass ownedClass = element.getParent(new TypeFilter<>(CtClass.class));
        if (ownedClass != null) {
            ret.addAll(ownedClass.getElements(new TypeFilter<>(CtVariableAccess.class)));
            ret.addAll(ownedClass.getElements(new TypeFilter<>(CtArrayAccess.class)));
        }
        // Local variables
        CtMethod ownedMethod = element.getParent(new TypeFilter<>(CtMethod.class));
        if (ownedMethod != null) {
            ret.addAll(ownedMethod.getElements(new TypeFilter<>(CtLocalVariable.class)));
        }
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        CtClass ownedClass = element.getParent(new TypeFilter<>(CtClass.class));
        if (ownedClass != null) {
            for (CtLiteral tmp : ownedClass.getElements(new TypeFilter<>(CtLiteral.class))) {
                if (tmp.getClass().getGenericSuperclass() == type) {
                    ret.add(tmp);
                }
            }
            for (CtVariableAccess tmp : ownedClass.getElements(new TypeFilter<>(CtVariableAccess.class))) {
                if (tmp.getClass().getGenericSuperclass() == type) {
                    ret.add(tmp);
                }
            }
        }
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
        List<CtExpression> ret = new ArrayList<>();
        CtClass ownedClass = element.getParent(new TypeFilter<>(CtClass.class));
        if (ownedClass != null) {
            for (CtLiteral tmp : ownedClass.getElements(new TypeFilter<>(CtLiteral.class))) {
                if (tmp.getClass().getGenericSuperclass() == type) {
                    ret.add(tmp);
                }
            }
            for (CtVariableAccess tmp : ownedClass.getElements(new TypeFilter<>(CtVariableAccess.class))) {
                if (tmp.getClass().getGenericSuperclass() == type) {
                    ret.add(tmp);
                }
            }
        }
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        CtMethod ownedMethod = element.getParent(new TypeFilter<>(CtMethod.class));
        if (ownedMethod != null) {
            for (CtLocalVariable tmp : ownedMethod.getElements(new TypeFilter<>(CtLocalVariable.class))) {
                if (tmp.getClass().getGenericSuperclass() == type) {
                    ret.add(tmp);
                }
            }
        }
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
        Set<CtElement> ret = new HashSet<>();
        CtClass ownedClass = element.getParent(new TypeFilter<>(CtClass.class));
        if (ownedClass != null) {
            ret.addAll(ownedClass.getElements(new TypeFilter<>(CtExpression.class)));
        }
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
        Set<CtElement> ret = new HashSet<>();
        CtClass ownedClass = element.getParent(new TypeFilter<>(CtClass.class));
        if (ownedClass != null) {
            ret.addAll(ownedClass.getElements(new TypeFilter<>(CtIf.class)));
        }
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
            List<CtBinaryOperator> binaryOperators = element.getElements(new TypeFilter<>(CtBinaryOperator.class));
            for (CtBinaryOperator binaryOperator : binaryOperators) {
                CtExpression RHS = binaryOperator.getRightHandOperand();
                if (RHS instanceof CtLiteral || RHS instanceof CtVariableAccess) {
                    if (RHS.getClass().getGenericSuperclass().equals(Integer.class)) {
                        List<CtElement> exprs = getCandidateConstantInType(element, Integer.class);
                        for (CtElement expr : exprs) {
                            res.add(expr);
                            resRExpr.put(expr, new HashMap.SimpleEntry<>(RHS, expr));
                        }
                    }
                } else if (RHS instanceof CtLocalVariable) {
                    List<CtElement> exprs = getCandidateLocalVars(element, RHS.getClass().getGenericSuperclass());
                    for (CtElement expr : exprs) {
                        res.add(expr);
                        resRExpr.put(expr, new HashMap.SimpleEntry<>(RHS, expr));
                    }
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4RORepairAnalyzer.java`
#### Snippet
```java
        List<CtInvocation> ret = new ArrayList<>();

        CtMethod ownedMethod = CE.getParent(new TypeFilter<>(CtMethod.class));
        if (ownedMethod != null) {
            List<CtInvocation> invocations = ownedMethod.getElements(new TypeFilter<>(CtInvocation.class));
            for (CtInvocation invocation : invocations) {
                if (CE == invocation) {
                    continue;
                }
                if (CE.getExecutable() != invocation.getExecutable()) {
                    continue;
                }
                if (CE.getArguments().size() != invocation.getArguments().size()) {
                    continue;
                }
                ret.add(invocation);
            }
        }
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
EnumSet<ValueFeature> valueFeatures = EnumSet.noneOf(ValueFeature.class);
        if (repair.oldRExpr != null && repair.newRExpr != null) {
            String oldStr = repair.oldRExpr.toString();
            String newStr = repair.newRExpr.toString();
            if (valueStr.equals(newStr))
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
                    if (oldStr.contains(newStr) || newStr.contains(oldStr))
                        valueFeatures.add(ValueFeature.MODIFIED_SIMILAR_VF);
            }
        }
        CtElement element = repair.dstElem;
        if (element != null) {
            CtMethod FD = element.getParent(new TypeFilter<>(CtMethod.class));
            if (FD != null) {
                for (Object parameter: FD.getParameters()) {
                    if (parameter instanceof CtParameter) {
                        CtParameter VD = (CtParameter) parameter;
                        if (VD.getSimpleName().equals(valueStr))
                            valueFeatures.add(ValueFeature.FUNC_ARGUMENT_VF);
                    }
                }
            }
        }
        assert(valueExprInfo.containsKey(valueStr));
        CtElement E = valueExprInfo.get(valueStr);
        if (E instanceof CtVariableAccess || E instanceof CtArrayAccess || E instanceof CtLocalVariable) {
            if (E instanceof CtLocalVariable) {
                valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
            } else {
                valueFeatures.add(ValueFeature.GLOBAL_VARIABLE_VF);
            }
        } else if (E instanceof CtExecutableReference){
            // just make CALLEE_AF be meaningful
            if (((CtExecutableReference) E).getParameters().size() > 0){
                valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
            }
        } else if (E instanceof CtIf){
            // just make R_STMT_COND_AF be meaningful
            valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
        }
//        if (E instanceof CtVariable) {
//            if (E instanceof CtLocalVariable)
//                valueFeatures.add(SchemaFeature.LOCAL_VARIABLE_VF);
//            else
//                valueFeatures.add(SchemaFeature.GLOBAL_VARIABLE_VF);
//        } else if (E instanceof CtVariableReference) {
//            if (E instanceof CtLocalVariableReference)
//                valueFeatures.add(SchemaFeature.LOCAL_VARIABLE_VF);
//            else
//                valueFeatures.add(SchemaFeature.GLOBAL_VARIABLE_VF);
//        }
        if (valueStr.contains("get"))
            valueFeatures.add(ValueFeature.LI_GET_VF);
        if (valueStr.contains("size"))
            valueFeatures.add(ValueFeature.LI_SIZE_VF);
        if (valueStr.contains("length"))
            valueFeatures.add(ValueFeature.LI_LENGTH_VF);
        if (valueStr.contains("equals"))
            valueFeatures.add(ValueFeature.LI_EQUALS_VF);
        if (E.getElements(new TypeFilter<>(CtField.class)).size() > 0)
            valueFeatures.add(ValueFeature.MEMBER_VF);
        if (E instanceof CtLiteral) {
            Object value = ((CtLiteral)E).getValue();
            if (value == null) {
                valueFeatures.add(ValueFeature.LV_NULL_VF);
            }
            if (value instanceof Byte) {
                if ((Byte) value == 0) {
                    valueFeatures.add(ValueFeature.LV_ZERO_VF);
                }
                valueFeatures.add(ValueFeature.LT_BYTE_VF);
            } else if (value instanceof Character) {
                if ((Character) value == 0) {
                    valueFeatures.add(ValueFeature.LV_ZERO_VF);
                }
                valueFeatures.add(ValueFeature.LT_CHAR_VF);
            } else if (value instanceof Short) {
                if ((Short) value == 0) {
                    valueFeatures.add(ValueFeature.LV_ZERO_VF);
                }
                valueFeatures.add(ValueFeature.LT_SHORT_VF);
            } else if (value instanceof Integer) {
                if ((Integer) value == 0) {
                    valueFeatures.add(ValueFeature.LV_ZERO_VF);
                }
                valueFeatures.add(ValueFeature.LT_INT_VF);
            } else if (value instanceof Long) {
                if ((Long) value == 0) {
                    valueFeatures.add(ValueFeature.LV_ZERO_VF);
                }
                valueFeatures.add(ValueFeature.LT_LONG_VF);
            } else if (value instanceof Float) {
                if ((Float) value == 0.0) {
                    valueFeatures.add(ValueFeature.LV_ZERO_VF);
                }
                valueFeatures.add(ValueFeature.LT_FLOAT_VF);
            } else if (value instanceof Double) {
                if ((Double) value == 0.0) {
                    valueFeatures.add(ValueFeature.LV_ZERO_VF);
                }
                valueFeatures.add(ValueFeature.LT_DOUBLE_VF);
            } else if (value instanceof Boolean) {
                valueFeatures.add(ValueFeature.LT_BOOLEAN_VF);
            } else if (value instanceof Enum) {
                valueFeatures.add(ValueFeature.LT_ENUM_VF);
            } else if (value instanceof String) {
                if (((String) value).equals("")) {
                    valueFeatures.add(ValueFeature.LV_BLANK_VF);
                }
                valueFeatures.add(ValueFeature.LT_STRING_VF);
            } else if (value instanceof List) {
                if (((List) value).isEmpty()) {
                    valueFeatures.add(ValueFeature.LV_EMPTY_VF);
                }
                valueFeatures.add(ValueFeature.LT_LIST_VF);
            } else if (value instanceof Map) {
                if (((Map) value).isEmpty()) {
                    valueFeatures.add(ValueFeature.LV_EMPTY_VF);
                }
                valueFeatures.add(ValueFeature.LT_MAP_VF);
            } else if (value instanceof Queue) {
                if (((Queue) value).isEmpty()) {
                    valueFeatures.add(ValueFeature.LV_EMPTY_VF);
                }
                valueFeatures.add(ValueFeature.LT_QUEUE_VF);
            } else if (value instanceof Set) {
                if (((Set) value).isEmpty()) {
                    valueFeatures.add(ValueFeature.LV_EMPTY_VF);
                }
                valueFeatures.add(ValueFeature.LT_SET_VF);
            }
        }
        return valueFeatures;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
        for (CtElement stmt : stmtsC) {
            Map<String, Set<AtomicFeature>> map = new EnhancedFeatureVisitor(valueExprInfo).traverseStmt(stmt);
            map.forEach((k, v) -> srcMapC.merge(k, v, (v1, v2) -> {
                v1.addAll(v2);
                return v1;
            }));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
CtScanner scanner = new CtScanner() {
            @Override
            public void scan(CtElement element) { // VisitExpr
                super.scan(element);
                if (element instanceof CtLoop || element instanceof CtExpression && element.getParent() instanceof CtLoop) {
//                    assert !isReplace;
                    putValueFeature(null, AtomicFeature.STMT_LOOP_SF);
                    putValueFeature(element, AtomicFeature.STMT_LOOP_SF);
                }
                if (element instanceof CtCFlowBreak || element instanceof CtExpression && element.getParent() instanceof CtCFlowBreak) {
                    if (element instanceof CtLabelledFlowBreak || element instanceof CtExpression && element.getParent() instanceof CtLabelledFlowBreak) {
//                        assert !isReplace;
                        putValueFeature(null, AtomicFeature.STMT_LABEL_SF);
                        putValueFeature(element, AtomicFeature.STMT_LABEL_SF);
                    } else {
                        putValueFeature(null, isReplace ? AtomicFeature.R_STMT_CONTROL_SF : AtomicFeature.STMT_CONTROL_SF);
                        putValueFeature(element, isReplace ? AtomicFeature.R_STMT_CONTROL_SF : AtomicFeature.STMT_CONTROL_SF);
                    }
                }
                if (element instanceof CtAssignment || element instanceof CtExpression && element.getParent() instanceof CtAssignment) {
                    putValueFeature(null, isReplace ? AtomicFeature.R_STMT_ASSIGN_SF : AtomicFeature.STMT_ASSIGN_SF);
                    putValueFeature(element, isReplace ? AtomicFeature.R_STMT_ASSIGN_SF : AtomicFeature.STMT_ASSIGN_SF);
                }
                if (element instanceof CtInvocation || element instanceof CtExpression && element.getParent() instanceof CtInvocation) {
                    putValueFeature(null, isReplace ? AtomicFeature.R_STMT_CALL_SF : AtomicFeature.STMT_CALL_SF);
                    putValueFeature(element, isReplace ? AtomicFeature.R_STMT_CALL_SF : AtomicFeature.STMT_CALL_SF);
                }
                if (element instanceof CtIf || element instanceof CtExpression && element.getParent() instanceof CtIf) {
                    putValueFeature(null, isReplace ? AtomicFeature.R_STMT_COND_SF : AtomicFeature.STMT_COND_SF);
                    putValueFeature(element, isReplace ? AtomicFeature.R_STMT_COND_SF : AtomicFeature.STMT_COND_SF);
                }
            }

            @Override
            public <T> void visitCtInvocation(CtInvocation<T> invocation) { // VisitCallExpr
                super.visitCtInvocation(invocation);
                CtElement callee = invocation.getExecutable();
                putValueFeature(callee, AtomicFeature.CALLEE_AF);
                for (CtExpression it : invocation.getArguments()) {
                    putValueFeature(it, AtomicFeature.CALL_ARGUMENT_AF);
                }
            }

            @Override
            public <T> void visitCtField(CtField<T> f) {
                super.visitCtField(f);
//                if (f instanceof CtArrayAccess)
//                    putValueFeature(f, AtomicFeature.DEREF_AF);
                putValueFeature(f, AtomicFeature.MEMBER_ACCESS_AF);
            }

            @Override
            public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
                super.visitCtFieldReference(reference);
//                if (reference instanceof CtArrayAccess)
//                    putValueFeature(reference, AtomicFeature.DEREF_AF);
                putValueFeature(reference, AtomicFeature.MEMBER_ACCESS_AF);
            }

            @Override
            public <T, A extends T> void visitCtAssignment(CtAssignment<T, A> assignment) {
                super.visitCtAssignment(assignment);
                CtExpression LHS = assignment.getAssigned();
                CtExpression RHS = assignment.getAssignment();
                putValueFeature(LHS, AtomicFeature.AOP_ASSIGN_AF);
                putValueFeature(RHS, AtomicFeature.AOP_ASSIGN_AF);
                putValueFeature(LHS, AtomicFeature.CHANGED_AF);
                if (RHS instanceof CtArrayAccess) {
                    putValueFeature(LHS, AtomicFeature.DEREF_AF);
                    putValueFeature(RHS, AtomicFeature.INDEX_AF);
                }
            }

            @Override
            public <T, A extends T> void visitCtOperatorAssignment(CtOperatorAssignment<T, A> assignment) {
                super.visitCtOperatorAssignment(assignment);
                CtExpression LHS = assignment.getAssigned();
                CtExpression RHS = assignment.getAssignment();
                switch (assignment.getKind()) {
                    case PLUS:
                        putValueFeature(LHS, AtomicFeature.AOP_PLUS_AF);
                        putValueFeature(RHS, AtomicFeature.AOP_PLUS_AF);
                        break;
                    case MINUS:
                        putValueFeature(LHS, AtomicFeature.AOP_MINUS_AF);
                        putValueFeature(RHS, AtomicFeature.AOP_MINUS_AF);
                        break;
                    case MUL:
                        putValueFeature(LHS, AtomicFeature.AOP_MUL_AF);
                        putValueFeature(RHS, AtomicFeature.AOP_MUL_AF);
                        break;
                    case DIV:
                        putValueFeature(LHS, AtomicFeature.AOP_DIV_AF);
                        putValueFeature(RHS, AtomicFeature.AOP_DIV_AF);
                        break;
                    case MOD:
                        putValueFeature(LHS, AtomicFeature.AOP_MOD_AF);
                        putValueFeature(RHS, AtomicFeature.AOP_MOD_AF);
                        break;
                }
                putValueFeature(LHS, AtomicFeature.CHANGED_AF);
            }

            @Override
            public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
                super.visitCtBinaryOperator(operator);
                CtExpression LHS = operator.getLeftHandOperand();
                CtExpression RHS = operator.getRightHandOperand();
                switch (operator.getKind()) {
                    case PLUS:
                        putValueFeature(LHS, AtomicFeature.BOP_PLUS_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_PLUS_AF);
                        break;
                    case MINUS:
                        putValueFeature(LHS, AtomicFeature.BOP_MINUS_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_MINUS_AF);
                        break;
                    case MUL:
                        putValueFeature(LHS, AtomicFeature.BOP_MUL_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_MUL_AF);
                        break;
                    case DIV:
                        putValueFeature(LHS, AtomicFeature.BOP_DIV_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_DIV_AF);
                        break;
                    case MOD:
                        putValueFeature(LHS, AtomicFeature.BOP_MOD_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_MOD_AF);
                        break;
                    case LE:
                        putValueFeature(LHS, AtomicFeature.BOP_LE_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_LE_AF);
                        break;
                    case LT:
                        putValueFeature(LHS, AtomicFeature.BOP_LT_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_LT_AF);
                        break;
                    case GE:
                        putValueFeature(LHS, AtomicFeature.BOP_GE_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_GE_AF);
                        break;
                    case GT:
                        putValueFeature(LHS, AtomicFeature.BOP_GT_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_GT_AF);
                        break;
                    case EQ:
                        putValueFeature(LHS, AtomicFeature.BOP_EQ_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_EQ_AF);
                        break;
                    case NE:
                        putValueFeature(LHS, AtomicFeature.BOP_NE_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_NE_AF);
                        break;
                    case AND:
                        putValueFeature(LHS, AtomicFeature.BOP_AND_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_AND_AF);
                        break;
                    case OR:
                        putValueFeature(LHS, AtomicFeature.BOP_OR_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_OR_AF);
                        break;
                    case INSTANCEOF:
                        putValueFeature(LHS, AtomicFeature.BOP_INSTANCEOF_AF);
                        putValueFeature(RHS, AtomicFeature.BOP_INSTANCEOF_AF);
                        break;
                }
            }

            @Override
            public <T> void visitCtUnaryOperator(CtUnaryOperator<T> operator) {
                super.visitCtUnaryOperator(operator);
                CtExpression operand = operator.getOperand();
                switch (operator.getKind()) {
                    case NOT:
                        putValueFeature(operand, AtomicFeature.UOP_NOT_AF);
                        break;
                    case POS:
                        putValueFeature(operand, AtomicFeature.UOP_POS_AF);
                        break;
                    case NEG:
                        putValueFeature(operand, AtomicFeature.UOP_NEG_AF);
                        break;
                    case PREINC:
                    case POSTINC:
                        putValueFeature(operand, AtomicFeature.UOP_INC_AF);
                        putValueFeature(operand, AtomicFeature.CHANGED_AF);
                        break;
                    case PREDEC:
                    case POSTDEC:
                        putValueFeature(operand, AtomicFeature.UOP_DEC_AF);
                        putValueFeature(operand, AtomicFeature.CHANGED_AF);
                        break;
                }
            }

            @Override
            public <T> void visitCtSuperAccess(CtSuperAccess<T> f) {
                super.visitCtSuperAccess(f);
                putValueFeature(f, AtomicFeature.REF_SUPER_AF);
            }

            @Override
            public <T> void visitCtThisAccess(CtThisAccess<T> thisAccess) {
                super.visitCtThisAccess(thisAccess);
                putValueFeature(thisAccess, AtomicFeature.REF_THIS_AF);
            }
        };
        scanner.scan(S);
        return getFeatureResult();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
        for (CtElement stmt : stmtsC) {
            Map<String, Set<AtomicFeature>> map = new ExtendedFeatureVisitor(valueExprInfo).traverseStmt(stmt);
            map.forEach((k, v) -> srcMapC.merge(k, v, (v1, v2) -> {
                v1.addAll(v2);
                return v1;
            }));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
        for (CtElement stmt : stmtsC) {
            Map<String, Set<AtomicFeature>> map = new OriginalFeatureVisitor(valueExprInfo).traverseStmt(stmt);
            map.forEach((k, v) -> srcMapC.merge(k, v, (v1, v2) -> {
                v1.addAll(v2);
                return v1;
            }));
        }
        for (CtElement stmt : stmtsF) {
            Map<String, Set<AtomicFeature>> map = new OriginalFeatureVisitor(valueExprInfo).traverseStmt(stmt);
            map.forEach((k, v) -> srcMapF.merge(k, v, (v1, v2) -> {
                v1.addAll(v2);
                return v1;
            }));
        }
        for (CtElement stmt : stmtsL) {
            Map<String, Set<AtomicFeature>> map = new OriginalFeatureVisitor(valueExprInfo).traverseStmt(stmt);
            map.forEach((k, v) -> srcMapL.merge(k, v, (v1, v2) -> {
                v1.addAll(v2);
                return v1;
            }));
        }

        // this will be merged so we do not care about this value named marked
        FeatureVector featureVector = new FeatureVector();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/learner/FeatureLearner.java`
#### Snippet
```java
                List<FeatureMatrix> featureMatrices = sample.getFeatureMatrices();
                // compute scores
                Map<FeatureVector, Double> scores = new HashMap<>();
                for (FeatureMatrix featureMatrix : featureMatrices) {
                    for (FeatureVector featureVector : featureMatrix.getFeatureVectors()) {
                        scores.put(featureVector, featureVector.score(theta));
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
        ParameterVector parameterVector = new ParameterVector(option.featureOption);
        parameterVector.load(inputFilePath);

        List<String> header = new ArrayList<>();
        List<String> values = new ArrayList<>();
        header.add("info");
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
            FeatureCross featureCross;
            switch (option.featureOption) {
                case ORIGINAL:
                    featureCross = new OriginalFeatureCross(idx);
                    header.add(featureCross.getFeatures().toString());
                    break;
                case EXTENDED:
                    featureCross = new ExtendedFeatureCross(idx);
                    header.add(featureCross.getFeatures().toString());
                    break;
                default:
                    System.out.println("Out of Expectation");
                    break;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
            Pattern pattern = Pattern.compile(":(\\d+)");
            Matcher matcher = pattern.matcher(operation.toString());
            if (operation instanceof DeleteOperation) {
                if (matcher.find()) {
                    deleteOperations.put(Integer.valueOf(matcher.group(1)), operation);
                }
            } else if (operation instanceof InsertOperation) {
                if (matcher.find()) {
                    insertOperations.put(Integer.valueOf(matcher.group(1)), operation);
                }
            } else if (operation instanceof MoveOperation) {
                if (matcher.find()) {
                    deleteOperations.put(Integer.valueOf(matcher.group(1)), operation);
                }
                if (matcher.find()) {
                    insertOperations.put(Integer.valueOf(matcher.group(1)), operation);
                }
            } else if (operation instanceof UpdateOperation) {
                if (matcher.find()) {
                    deleteOperations.put(Integer.valueOf(matcher.group(1)), operation);
                    insertOperations.put(Integer.valueOf(matcher.group(1)), operation);
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
            try {
                File file = new File(filePath);
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fos = new FileOutputStream(filePath);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(featureMatrices);
                oos.flush();
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
			}
			return resultString;
		} catch (Exception e) {
			if (!(e instanceof RuntimeException)) throw new RuntimeException(e);
		}
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
				changesArray.add(patternJson);
				
			} catch (Exception e) {
				new RuntimeException("Unable to compute ADD analysis", e);
			}
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}
			}
		 } catch (Exception ex) {
		}
		
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						currentInvocationWithCompVar, "FEATURES_METHODS");			
			}
		  } catch (Exception e) {
		}
	}
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
				}
			}
		} catch (Exception ex) {
		}

```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
		InputStream in = null;
		if (modelFile.exists()) {
			in = new FileInputStream(modelFile);
		} else {
			in = getClass().getResourceAsStream(odsModelPath);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				File target = new File(pathname + "_t.java");
				try {
				List<String> original = IOUtils.readLines(new FileInputStream(src), "UTF-8");
		        List<String> revised = IOUtils.readLines(new FileInputStream(target), "UTF-8");
		        Patch<String> diff = DiffUtils.diff(original, revised);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				try {
				List<String> original = IOUtils.readLines(new FileInputStream(src), "UTF-8");
		        List<String> revised = IOUtils.readLines(new FileInputStream(target), "UTF-8");
		        Patch<String> diff = DiffUtils.diff(original, revised);
		        List<AbstractDelta<String>> deltas = diff.getDeltas();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
            File outFile = File.createTempFile("tmp-" + this.getClass().getSimpleName() + name, null);
            outFilePath = outFile.getPath();
            OutputStream outStream = new FileOutputStream(outFilePath);
            outStream.write(buffer);
            outStream.close();
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
			List<CtLiteral> allConstant = new ArrayList();

			allConstant.addAll(literalsFromFaultyLine);
			
			
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
			
			Set<CtElement> insDistinctParsSet = new HashSet<CtElement>();
			insDistinctParsSet.addAll(insPars);
			insDistinctParsSet.removeAll(delPars);
			
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
		} catch (IOException e) {
			e.printStackTrace();
			log.error("Problem storing ing json file" + e.toString());
		}
	}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        stringJoiner.add(testStringJoiner.toString());

        String filePath = Support.getFilePath(Support.DirType.PARAMETER_DIR, option) + stringJoiner.toString();
        dumpCSV(filePath, rankings);
        System.out.println("dumped files");
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ExpressionCapturerScanner` may be 'static'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
		}
	 
		private final class ExpressionCapturerScanner extends CtScanner {
			public CtElement toScan = null;

```

### InnerClassMayBeStatic
Inner class `Ranking` may be 'static'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    }

    private class Ranking {
        private String entryName;
        private double number;
```

### InnerClassMayBeStatic
Inner class `Fraction` may be 'static'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    }

    private class Fraction<T> {
        private T numerator;
        private T denominator;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
		CtBlock parentblock = element.getParent(CtBlock.class);
		if (parentblock != null) {
			int positionEl = parentblock.getStatements().indexOf(element);
			variables.addAll(VariableResolver.retrieveLocalVariables(positionEl, parentblock));
		}
```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java

		if (parenti != null) {
			int pos = ((CtBlock) parenti).getStatements().indexOf(beforei);
			variables.addAll(retrieveLocalVariables(pos, (CtBlock) parenti));
		}
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
		if (resultsHunk != null) {
			DiffResult<Commit, HunkDiff> hunkresults = (DiffResult<Commit, HunkDiff>) resultsHunk;
			HunkDiff hunks = hunkresults.getDiffOfFiles().get(nameFile);
			if (hunks != null && hunks.getHunkpairs() != null)
				if (hunks.getHunkpairs().size() == 1) {
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					
					if (varAccess.getVariable().getType() != null
							&& enums.contains(varAccess.getVariable().getType().getDeclaration())) {
						isVarAccessTypeEnum = true;
					}
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/fr/inria/coming/core/filter/AbstractChainedFilter.java`
#### Snippet
```java
	}

	/**
	 * Get the success or fail status of the stacked filter on the alone fragment
	 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
package fr.inria.coming.core.filter.diff.syntcomparison;

/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
    }

    /**
     * Returns true if the instance of a pattern respect the relation between the
     * elements of the pattern.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
		List<Feature> LFeatures = new ArrayList<>();

		/**
		 * current position
		 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
		}

		/**
		 * former position
		 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
		}
		
		/**
		 * later position
		 */
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/core/filter/diff/NbHunkFilter.java`
#### Snippet
```java
			}

			if (nbHunks >= min_included && nbHunks <= max_included) {
				return true;
			}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/core/filter/files/ContainTestFilterFilter.java`
#### Snippet
```java
			}

			if (ComingProperties.getPropertyBoolean("ONLY_COMMIT_WITH_TEST_CASE") && nTests == 0) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/core/filter/files/CommitSizeFilter.java`
#### Snippet
```java
			}

			if (ComingProperties.getPropertyBoolean("ONLY_COMMIT_WITH_TEST_CASE") && nTests == 0) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
    }

    if (length < maxLength / 4) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/CodeFeatureDetector.java`
#### Snippet
```java
        if (currentElement.getParent() instanceof CtFor) {
            CtFor forcond = (CtFor) currentElement.getParent();
            if (currentElement.equals(forcond.getExpression()))
                return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
		} else {
			String simpleName = ctVariable.getSimpleName();
			if (simpleName.toUpperCase().equals(simpleName)) {
				return true;
			}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/TypeaccessAnalyzer.java`
#### Snippet
```java
		String[] splited2=name2.split("\\.");
        if(splited1.length>1 && splited2.length>1) {
        	if(splited1[splited1.length-2].equals(splited2[splited2.length-2])
        			&& !splited1[splited1.length-1].equals(splited2[splited2.length-1]))
        		return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/TypeaccessAnalyzer.java`
#### Snippet
```java
			if (splitname.length>1) {
				String simplename=splitname[splitname.length-1];
				if (simplename.toUpperCase().equals(simplename)) 
					return true;
			}		
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
			CodeFeatures cerainfeature = binoperatortype.get(index);
			
			if(cerainfeature.toString().endsWith(operatorstring.toUpperCase()))
				writeGroupedInfo(context,  Integer.toString(operatorindex)+"_"+operatorunderstudy, cerainfeature, 
							true, "FEATURES_BINARYOPERATOR");
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
    private boolean getExpressionType (CtExpression anexpression) {
		
		if (anexpression.getType()!=null && anexpression.getType().isPrimitive()) {		
			return true;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				boolean con5oftheclass = false;
				
				if (conAffected.getType()!=null && (conAffected.getType().getQualifiedName().endsWith(parentclss.getSimpleName()))) {
					con5oftheclass = true;
				}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				boolean con4returnprimitive = false;
				
				if (conAffected.getType()!=null && (conAffected.getType().isPrimitive() || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
			}
			
			if(ifNode.getThenStatement() instanceof CtBlock 
					&& ((CtBlock)ifNode.getThenStatement()).getStatements().size() > 1) {
				return false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java

			String retStr = retNode.toString();
			if (retStr.contains("return null") || retStr.contains("return new") || retStr.length() <= "return ".length() // return
																															// void
					|| new ASTData(ASTInfoResolver.getRootNode(srcNode))
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			CtBinaryOperator binOp = (CtBinaryOperator) currentElement;
						
			if(binOp.getKind().equals(BinaryOperatorKind.AND) || binOp.getKind().equals(BinaryOperatorKind.OR)
				|| binOp.getKind().equals(BinaryOperatorKind.EQ)
				|| binOp.getKind().equals(BinaryOperatorKind.GE)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
		}

		if (!checkSrcIncludesDstTemplate(src, target))
			return false;

```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java

			CtElement dstMov = movOp.getDstNode();
			if (!ASTInfoResolver.getPathToRootNode(dstMov).contains(insertedNode)) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				}
				
				if(m8methodprimitive)
					m9methodobjective = false;
				else m9methodobjective = true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			for (CtVariableAccess aVarAffected : varsAffected) {
				boolean currentIsConstant = false;
				if (aVarAffected.getVariable() instanceof CtFieldReference &&
				// Check if it's uppercase
						aVarAffected.getVariable().getSimpleName().toUpperCase()
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
							appearsInParams++;

							if (!parameterFound.containsKey(varInFaulty)) {
								
								writeGroupedInfo(context, adjustIdentifyInJson(varInFaulty), 
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			return false;
		else {
			if(name1.startsWith(name2) || name1.endsWith(name2) ||
					name2.startsWith(name1) || name2.endsWith(name1))
				return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					boolean isVarAccessTypeEnum = false;
					
					if (varAccess.getVariable().getType() != null
							&& enums.contains(varAccess.getVariable().getType().getDeclaration())) {
						isVarAccessTypeEnum = true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		private boolean whetherConditionalStat(CtElement input) {
			
			if(input instanceof CtIf || input instanceof CtWhile || input instanceof CtFor || input
					instanceof CtForEach)
				return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				}
				
				if(isPrimitive)
					isObject=false;
				else isObject=true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
			List<CtStatement> trystatements = tryblock.getStatements();
			// if(trystatements.size()>0 && trystatements.get(0)==targetstatement)
			if (trystatements.size() > 0)
				return true;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		if (elseBlock != null) {
			List<CtStatement> elsestatements = elseBlock.getStatements();
			if (elsestatements.size() > 0 && elsestatements.get(0) == targetstatement)
				return true;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		} while (parent != parentelement && parent != null);

		if (layer > 1 && parent != null)
			return true;
		else
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'mappedElement != null' covered by subsequent condition 'mappedElement instanceof CtAbstractInvocation'
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
	public boolean canElixirGenerateNode(CtElement mappedElement, CtElement newNode) {
		Set<String> validInvocationsAsArguments = new HashSet<>();
		if (mappedElement != null && mappedElement instanceof CtAbstractInvocation) {
			List<CtExpression> arguments = ((CtAbstractInvocation) mappedElement).getArguments();
			for (CtExpression argument : arguments) {
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/LineComparator.java`
#### Snippet
```java
  @Override
  public Fragmentable createFragmentable(String data)  {
		String dataParsed = data.replaceAll(" |\\t|\\{|\\}", "");

		return new SLineComparator(dataParsed);
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `iterator.next()` to `Object` is redundant
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
			Collection acollec = (Collection) vStat;
			for (Iterator iterator = acollec.iterator(); iterator.hasNext();) {
				Object anItemList = (Object) iterator.next();
				sublistJSon.add(calculateValue(parser, anItemList));
			}
```

### RedundantCast
Casting `e` to `CtBinaryOperator` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
					
			List<CtBinaryOperator> logicalOperatorLeft = leftexpression.getElements(
			  e -> e instanceof CtBinaryOperator && logicalOperator.contains(((CtBinaryOperator) e).getKind()));
			
			List<CtBinaryOperator> logicalOperatorRight = rightexpression.getElements(
```

### RedundantCast
Casting `e` to `CtBinaryOperator` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
			
			List<CtBinaryOperator> logicalOperatorRight = rightexpression.getElements(
					  e -> e instanceof CtBinaryOperator && logicalOperator.contains(((CtBinaryOperator) e).getKind()));
			
			if(logicalOperatorLeft.size() == 0) {	
```

### RedundantCast
Casting `certainconstructorinclass` to `CtConstructor` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				for (CtConstructor certainconstructorinclass : allconstructorsinclass) {

						CtConstructor anotherConstructor = (CtConstructor) certainconstructorinclass;
						// Ignoring if it's the same
						if (anotherConstructor == null || anotherConstructor.getSignature().
```

### RedundantCast
Casting `certainconstructorcallinclass` to `CtConstructorCall` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			    	for (CtConstructorCall certainconstructorcallinclass : allconstructorcallsinclass) {

			    		CtConstructorCall anotherConstructorCall = (CtConstructorCall) certainconstructorcallinclass;
						if (anotherConstructorCall == null || anotherConstructorCall.getExecutable().getSignature().
								equals(constructorcall.getExecutable().getSignature()))
```

### RedundantCast
Casting `certainconstructorinclass` to `CtConstructor` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				for (CtConstructor certainconstructorinclass : allconstructorsinclass) {

						CtConstructor anotherConstructor = (CtConstructor) certainconstructorinclass;
						if (anotherConstructor == null || anotherConstructor.getSignature().
								equals(constructorcall.getExecutable().getSignature()))
```

### RedundantCast
Casting `certainconstructorcallinclass` to `CtConstructorCall` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			    	for (CtConstructorCall certainconstructorcallinclass : allconstructorcallsinclass) {

			    		CtConstructorCall anotherConstructorCall = (CtConstructorCall) certainconstructorcallinclass;
						if (anotherConstructorCall == null || anotherConstructorCall.getExecutable().getSignature().
								equals(constructorcall.getExecutable().getSignature()))
```

### RedundantCast
Casting `parent` to `CtExpression` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					if (parent instanceof CtExpression) {
						// First case: the parent is a binary
						if (isLogicalExpression((CtExpression) parent)) {
							hasVarDirectlyUsed = true;
							break;
```

### RedundantCast
Casting `parent` to `CtUnaryOperator` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
							// Second case: the parent is a negation
							if (parent instanceof CtUnaryOperator) {
								if (isLogicalExpression(((CtUnaryOperator) parent).getParent())) {
									hasVarDirectlyUsed = true;
									break;
```

### RedundantCast
Casting `parent` to `CtExpression` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					if (parent instanceof CtExpression) {
						// First case: the parent is a binary
						if (isLogicalExpression((CtExpression) parent)) {
							hasMethodDirectlyUsed = true;
							break;
```

### RedundantCast
Casting `parent` to `CtUnaryOperator` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
							// Second case: the parent is a negation
							if (parent instanceof CtUnaryOperator) {
								if (isLogicalExpression(((CtUnaryOperator) parent).getParent())) {
									hasMethodDirectlyUsed = true;
									break;
```

### RedundantCast
Casting `(logicalexpression.getParent(...))` to `CtStatement` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				int otherVarUsedinBool = 0;
				
				CtStatement parentstatement=(CtStatement)(logicalexpression.getParent(CtStatement.class));
				
				CtStatement parent = logicalexpression.getParent(new LineFilter());
```

### RedundantCast
Casting `parentConditional` to `CtConditional` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		if (parentConditional != null) {// TODO, maybe force that the var must be in the condition, or not.
			CtConditional cond = (CtConditional) parentConditional;
			condition = cond.getCondition();
			return checkNullCheckGuardCondition(condition);
```

### RedundantCast
Casting `parentConditional` to `CtConditional` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		if (parentConditional != null) { // TODO, maybe force that the var must be in the condition, or not.
			CtConditional cond = (CtConditional) parentConditional;
			condition = cond.getCondition();
			return checkNormalGuardCondition(condition);
```

### RedundantCast
Casting `value` to `String` is redundant
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.LT_ENUM_VF);
            } else if (value instanceof String) {
                if (((String) value).equals("")) {
                    valueFeatures.add(ValueFeature.LV_BLANK_VF);
                }
```

### RedundantCast
Casting `value` to `String` is redundant
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.LT_ENUM_VF);
            } else if (value instanceof String) {
                if (((String) value).equals("")) {
                    valueFeatures.add(ValueFeature.LV_BLANK_VF);
                }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/core/engine/Analyzer.java`
#### Snippet
```java
	 * Returns the Key (identfier) of the Analyzer. By default is the class name.
	 * 
	 * @return
	 */
	public default String key() {
```

### JavadocDeclaration
`@param parentFilter` tag description is missing
in `src/main/java/fr/inria/coming/core/filter/AbstractChainedFilter.java`
#### Snippet
```java
	 * Simply define a parent filter for this filter
	 * 
	 * @param parentFilter
	 */
	public AbstractChainedFilter(IFilter parentFilter) {
```

### JavadocDeclaration
`@param previousVersion` tag description is missing
in `src/main/java/fr/inria/coming/core/filter/diff/NbHunkFilter.java`
#### Snippet
```java
	/**
	 *
	 * @param previousVersion
	 * @param nextVersion
	 * @return
```

### JavadocDeclaration
`@param nextVersion` tag description is missing
in `src/main/java/fr/inria/coming/core/filter/diff/NbHunkFilter.java`
#### Snippet
```java
	 *
	 * @param previousVersion
	 * @param nextVersion
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/core/filter/diff/NbHunkFilter.java`
#### Snippet
```java
	 * @param previousVersion
	 * @param nextVersion
	 * @return
	 */
	protected List<RangeDifference> getNumberChanges(String previousVersion, String nextVersion) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/core/filter/commitmessage/KeyWordsFragmentFilter.java`
#### Snippet
```java
	 * Check if the fragment contain at least one of the word
	 * 
	 * @return
	 */
	@Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
	 * Load all commits of the repository
	 * 
	 * @throws RevisionSyntaxException
	 * @throws AmbiguousObjectException
	 * @throws IncorrectObjectTypeException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
	 * 
	 * @throws RevisionSyntaxException
	 * @throws AmbiguousObjectException
	 * @throws IncorrectObjectTypeException
	 * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
	 * @throws RevisionSyntaxException
	 * @throws AmbiguousObjectException
	 * @throws IncorrectObjectTypeException
	 * @throws IOException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
	 * @throws AmbiguousObjectException
	 * @throws IncorrectObjectTypeException
	 * @throws IOException
	 */
	private void loadCommits()
```

### JavadocDeclaration
`@param tokenType` tag description is missing
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
   * initiates the given comment type.
   *
   * @param tokenType
   * @return the length of the token that start a comment
   * @since 3.3
```

### JavadocDeclaration
`@param finalResult` tag description is missing
in `src/main/java/fr/inria/coming/core/entities/interfaces/IOutput.java`
#### Snippet
```java
	 * Compute output for the final results
	 * 
	 * @param finalResult
	 */
	public void generateFinalOutput(FinalResult finalResult);
```

### JavadocDeclaration
`@param finalResult` tag description is missing
in `src/main/java/fr/inria/coming/core/entities/interfaces/IOutput.java`
#### Snippet
```java
	 * Compute the outputs for the results of a revision
	 * 
	 * @param finalResult
	 */
	public void generateRevisionOutput(RevisionResult resultAllAnalyzed);
```

### JavadocDeclaration
Duplicate @param tag for parameter ''
in `src/main/java/fr/inria/coming/core/entities/DiffResult.java`
#### Snippet
```java
 * @param <T>
 *
 * @param <T>
 */
public class DiffResult<T, R> extends AnalysisResult<T> {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
	 * prefix.
	 *
	 * @param element
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
	 *
	 * @param element
	 * @return
	 */
	public static String getNodeLabelFromCtElement(CtElement element) {
```

### JavadocDeclaration
`@param var` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	/**
	 * 
	 * @param var
	 * @param rootElement
	 * @return
```

### JavadocDeclaration
`@param rootElement` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param var
	 * @param rootElement
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param var
	 * @param rootElement
	 * @return
	 */
	private static boolean checkParent(CtVariable var, CtElement rootElement) {
```

### JavadocDeclaration
`@param ingredientRootElement` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * ingredient.
	 * 
	 * @param ingredientRootElement
	 * @param varAccessCollected
	 * @return
```

### JavadocDeclaration
`@param varAccessCollected` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param ingredientRootElement
	 * @param varAccessCollected
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param ingredientRootElement
	 * @param varAccessCollected
	 * @return
	 */
	public static List<CtVariableAccess> collectInductionVariableAccess(CtElement ingredientRootElement,
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * argument
	 * 
	 * @param element
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param element
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * Return all variables related to the element passed as argument
	 * 
	 * @param element
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param element
	 * @return
	 */
	public static List<CtVariableAccess> collectVariableAccess(CtElement element, boolean duplicates) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varContext          List of variables to match
	 * @param ingredientCtElement element to extract the var access to match
	 * @return
	 */
	public static boolean fitInContext(List<CtVariable> varContext, CtElement ingredientCtElement, boolean matchName) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param positionEl analyze variables from the block until that position.
	 * @param pb         a block to search the local variables
	 * @return
	 */
	protected static List<CtLocalVariable> retrieveLocalVariables(int positionEl, CtBlock pb) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varContext List of variables to match
	 * @param element    element to extract the var access to match
	 * @return
	 */
	public static boolean fitInPlace(List<CtVariable> varContext, CtElement element) {
```

### JavadocDeclaration
`@param varContext` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * parameter. The last argument indicate if we map also the vars name
	 * 
	 * @param varContext
	 * @param vartofind
	 * @param mapName
```

### JavadocDeclaration
`@param vartofind` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param varContext
	 * @param vartofind
	 * @param mapName
	 * @return
```

### JavadocDeclaration
`@param mapName` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varContext
	 * @param vartofind
	 * @param mapName
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param vartofind
	 * @param mapName
	 * @return
	 */
	protected static List<CtVariable> matchVariable(List<CtVariable> varContext, CtVariableAccess vartofind,
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varContext      variables
	 * @param wordFromCluster name of a variable
	 * @return
	 */
	public static List<CtVariable> existVariableWithName(List<CtVariable> varContext, String wordFromCluster) {
```

### JavadocDeclaration
`@param varOutScope` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * Return true if the variables are compatible
	 * 
	 * @param varOutScope
	 * @param varInScope
	 * @return
```

### JavadocDeclaration
`@param varInScope` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param varOutScope
	 * @param varInScope
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varOutScope
	 * @param varInScope
	 * @return
	 */
	public static boolean areVarsCompatible(CtVariableAccess varOutScope, CtVariable varInScope) {
```

### JavadocDeclaration
`@param varContext` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * compatible types (i.e. sub types)
	 * 
	 * @param varContext
	 * @param vartofind
	 * @return
```

### JavadocDeclaration
`@param vartofind` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param varContext
	 * @param vartofind
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varContext
	 * @param vartofind
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
```

### JavadocDeclaration
`@param varsFromContext` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * Return true if there is name conflicts between the vars and the context.
	 * 
	 * @param varsFromContext
	 * @param varInductionCollected
	 * @return
```

### JavadocDeclaration
`@param varInductionCollected` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param varsFromContext
	 * @param varInductionCollected
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varsFromContext
	 * @param varInductionCollected
	 * @return
	 */
	public static boolean nameConflict(List<CtVariable> varsFromContext, List<CtVariableAccess> varInductionCollected) {
```

### JavadocDeclaration
`@param varContext` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * Maps a variable access with a variable declaration.
	 * 
	 * @param varContext
	 * @param varacc
	 * @return
```

### JavadocDeclaration
`@param varacc` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param varContext
	 * @param varacc
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varContext
	 * @param varacc
	 * @return
	 */
	public static Map<CtVariableAccess, List<CtVariable>> matchVars(List<CtVariable> varContext,
```

### JavadocDeclaration
`@param varsFromContext` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * Returns a map between the variables with name conflicts.
	 * 
	 * @param varsFromContext
	 * @param varInductionCollected
	 * @return
```

### JavadocDeclaration
`@param varInductionCollected` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * 
	 * @param varsFromContext
	 * @param varInductionCollected
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @param varsFromContext
	 * @param varInductionCollected
	 * @return
	 */
	public static Map<CtVariableAccess, List<CtVariable>> searchVarNameConflicts(List<CtVariable> varsFromContext,
```

### JavadocDeclaration
`@param operation` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
	 * Get the element that is modified
	 *
	 * @param operation
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
	 *
	 * @param operation
	 * @return
	 */
	public CtElement getLeftElement(Operation operation) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
	 * Get the input stream of the model according to the path of the ODS model.
	 * 
	 * @return
	 * @throws Exception
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
	 * 
	 * @return
	 * @throws Exception
	 */
	public InputStream retrieveStreamOfODSModel() throws Exception {
```

### JavadocDeclaration
`@param changePatternSpecification` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * elements from the pattern and those affected by the diff
     *
     * @param changePatternSpecification
     * @param diffToAnalyze
     * @return
```

### JavadocDeclaration
`@param diffToAnalyze` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     * @param changePatternSpecification
     * @param diffToAnalyze
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * @param changePatternSpecification
     * @param diffToAnalyze
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
```

### JavadocDeclaration
`@param instance` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     *
     * @param instance
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     * @param instance
     * @return
     */
    public boolean validate(ChangePatternInstance instance) {
```

### JavadocDeclaration
`@param instance` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * This method ckecks if the entities are used correctly: eg,
     *
     * @param instance
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     * @param instance
     * @return
     */
    private boolean checkEntitiesUsedOne(ChangePatternInstance instance) {
```

### JavadocDeclaration
`@param instance` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * want the UNCHANGED entities to match nothing.
     *
     * @param instance
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     * @param instance
     * @return
     */
    private boolean checkUnchangedActionAlsoUsedByOther(ChangePatternInstance instance) {
```

### JavadocDeclaration
`@param changePatternSpecification` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * dont want to analyze them.
     *
     * @param changePatternSpecification
     * @param matching
     * @return
```

### JavadocDeclaration
`@param matching` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     * @param changePatternSpecification
     * @param matching
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * @param changePatternSpecification
     * @param matching
     * @return
     */
    private List<ChangePatternInstance> singleInstance(ChangePatternSpecification changePatternSpecification,
```

### JavadocDeclaration
`@param instance` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * elements of the pattern.
     *
     * @param instance
     * @param relations
     * @return
```

### JavadocDeclaration
`@param relations` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     * @param instance
     * @param relations
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * @param instance
     * @param relations
     * @return
     */
    public boolean checkPatternRelationsOnInstance(ChangePatternInstance instance, PatternRelations relations) {
```

### JavadocDeclaration
`@param instance` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * This method checks if the entities are used correctly: eg,
     *
     * @param instance
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     * @param instance
     * @return
     */
    public boolean checkAbsenceNotMappedAction(ChangePatternInstance instance) {
```

### JavadocDeclaration
`@param affectedOperation` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * the pattern specification
     *
     * @param affectedOperation
     * @param affectedEntity
     * @return
```

### JavadocDeclaration
`@param affectedEntity` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     *
     * @param affectedOperation
     * @param affectedEntity
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     * @param affectedOperation
     * @param affectedEntity
     * @return
     */
    private List<MatchingEntity> matchElements(Operation affectedOperation, PatternEntity affectedEntity) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/repairability/RepairTools.java`
#### Snippet
```java
     * We don't wanna modify anything in patterns (like pattern names) in this particular case. Therefore, we override it.
     *
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param patternInstance` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/JMutRepair.java`
#### Snippet
```java
     * This filter is supposed to delete/remove such instances from the results given by PatternInstanceAnalyser.
     *
     * @param patternInstance
     * @param revision
     * @param diff
```

### JavadocDeclaration
`@param revision` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/JMutRepair.java`
#### Snippet
```java
     *
     * @param patternInstance
     * @param revision
     * @param diff
     * @return
```

### JavadocDeclaration
`@param diff` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/JMutRepair.java`
#### Snippet
```java
     * @param patternInstance
     * @param revision
     * @param diff
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/JMutRepair.java`
#### Snippet
```java
     * @param revision
     * @param diff
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param patternInstance` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/JKali.java`
#### Snippet
```java
     * This filter is supposed to delete/remove such instances from the results given by PatternInstanceAnalyser.
     *
     * @param patternInstance
     * @param diff
     * @return
```

### JavadocDeclaration
`@param diff` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/JKali.java`
#### Snippet
```java
     *
     * @param patternInstance
     * @param diff
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/JKali.java`
#### Snippet
```java
     * @param patternInstance
     * @param diff
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	 * whether the associated method or class for the faulty line throws exception
	 * 
	 * @param element
	 * @param context
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param element
	 * @param context
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
```

### JavadocDeclaration
`@param instance` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
     * The filter functions should determine whether the new expression is an instance of a template from the same file.
     *
     * @param instance
     * @param diff
     * @return
```

### JavadocDeclaration
`@param diff` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
     *
     * @param instance
     * @param diff
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
     * @param instance
     * @param diff
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param patternInstance` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
	 * PatternInstanceAnalyser.
	 *
	 * @param patternInstance
	 * @param diff
	 * @return
```

### JavadocDeclaration
`@param diff` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
	 *
	 * @param patternInstance
	 * @param diff
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
	 * @param patternInstance
	 * @param diff
	 * @return
	 */
	@Override
```

### JavadocDeclaration
`@param logicalExperssions` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * starts with the "not" operator! (an exclamation mark)
	 * 
	 * @param logicalExperssions
	 * @param context
	 */	
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param logicalExperssions
	 * @param context
	 */	
	private void analyzeLE6_UnaryInvolved (List<CtExpression> logicalExperssions, Cntx<Object> context) {
```

### JavadocDeclaration
`@param logicalExperssions` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * etc.
	 * 
	 * @param logicalExperssions
	 * @param context
	 * @param invocationssInStatement
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param logicalExperssions
	 * @param context
	 * @param invocationssInStatement
	 */
```

### JavadocDeclaration
`@param invocationssInStatement` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param logicalExperssions
	 * @param context
	 * @param invocationssInStatement
	 */
	
```

### JavadocDeclaration
`@param logicalExperssions` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * other local boolean variables in scope?
	 * 
	 * @param logicalExperssions
	 * @param varsInScope
	 * @param context
```

### JavadocDeclaration
`@param varsInScope` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param logicalExperssions
	 * @param varsInScope
	 * @param context
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param logicalExperssions
	 * @param varsInScope
	 * @param context
	 */
	private void analyzeLE4_BooleanVarNotUsed(List<CtExpression> logicalExperssions, 
```

### JavadocDeclaration
`@param logicalExperssions` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * binary value)
	 * 
	 * @param logicalExperssions
	 * @param varsInScope
	 * @param context
```

### JavadocDeclaration
`@param varsInScope` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param logicalExperssions
	 * @param varsInScope
	 * @param context
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param logicalExperssions
	 * @param varsInScope
	 * @param context
	 */
	private void analyzeLE3_PrimitiveWithCompatibleNotUsed( List<CtExpression> logicalExperssions, 
```

### JavadocDeclaration
`@param invocationsFromClass` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * Access
	 * 
	 * @param invocationsFromClass
	 * @param varAffected
	 * @return
```

### JavadocDeclaration
`@param varAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param invocationsFromClass
	 * @param varAffected
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param invocationsFromClass
	 * @param varAffected
	 * @return
	 */
	public CtInvocation checkBooleanInvocationWithParameterReturn(List<CtInvocation> invocationsFromClass,
```

### JavadocDeclaration
`@param logicalExperssions` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * is same // with vas one of its parameters and return boolean
	 * 
	 * @param logicalExperssions
	 * @param context
	 * @param allMethods
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param logicalExperssions
	 * @param context
	 * @param allMethods
	 * @param logicalExperssions
```

### JavadocDeclaration
`@param allMethods` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param logicalExperssions
	 * @param context
	 * @param allMethods
	 * @param logicalExperssions
	 * @param invocationsFromClass
```

### JavadocDeclaration
Duplicate @param tag for parameter 'logicalExperssions'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param context
	 * @param allMethods
	 * @param logicalExperssions
	 * @param invocationsFromClass
	 * @param parentclass
```

### JavadocDeclaration
`@param logicalExperssions` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param context
	 * @param allMethods
	 * @param logicalExperssions
	 * @param invocationsFromClass
	 * @param parentclass
```

### JavadocDeclaration
`@param invocationsFromClass` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param allMethods
	 * @param logicalExperssions
	 * @param invocationsFromClass
	 * @param parentclass
	 */
```

### JavadocDeclaration
`@param parentclass` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param logicalExperssions
	 * @param invocationsFromClass
	 * @param parentclass
	 */
	private void analyzeLE2_AffectedVariablesInMethod(List<CtExpression> logicalExperssions,
```

### JavadocDeclaration
`@param binOps` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * than 1
	 * 
	 * @param binOps
	 * @param tostudy
	 */
```

### JavadocDeclaration
`@param tostudy` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param binOps
	 * @param tostudy
	 */
	
```

### JavadocDeclaration
`@param allMethods` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * the var affected
	 * 
	 * @param allMethods
	 * @param varAffected
	 * @return
```

### JavadocDeclaration
`@param varAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param allMethods
	 * @param varAffected
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param allMethods
	 * @param varAffected
	 * @return
	 */
	public CtMethod checkBooleanMethodDeclarationWithTypeInParameter(List allMethods, CtVariableAccess varAffected) {
```

### JavadocDeclaration
`@param instance` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
     * This filter is supposed to delete/remove such instances from the results given by PatternInstanceAnalyser.
     *
     * @param instance
     * @param revision
     * @param diff
```

### JavadocDeclaration
`@param revision` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
     *
     * @param instance
     * @param revision
     * @param diff
     * @return boolean value
```

### JavadocDeclaration
`@param diff` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
     * @param instance
     * @param revision
     * @param diff
     * @return boolean value
     */
```

### JavadocDeclaration
`@param patternInstance` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
	 * PatternInstanceAnalyser.
	 *
	 * @param patternInstance
	 * @param diff
	 * @return
```

### JavadocDeclaration
`@param diff` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
	 *
	 * @param patternInstance
	 * @param diff
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
	 * @param patternInstance
	 * @param diff
	 * @return
	 */
	@Override
```

### JavadocDeclaration
`@param patternInstance` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
	 * PatternInstanceAnalyser.
	 *
	 * @param patternInstance
	 * @param revision
	 * @param diff
```

### JavadocDeclaration
`@param revision` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
	 *
	 * @param patternInstance
	 * @param revision
	 * @param diff
	 * @return
```

### JavadocDeclaration
`@param diff` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
	 * @param patternInstance
	 * @param revision
	 * @param diff
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
	 * @param revision
	 * @param diff
	 * @return
	 */
	@Override
```

### JavadocDeclaration
`@param varsAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * similar in identifier name and type compatible
	 * 
	 * @param varsAffected
	 * @param varsInScope
	 * @param element
```

### JavadocDeclaration
`@param varsInScope` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param varsAffected
	 * @param varsInScope
	 * @param element
	 * @param context
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param varsAffected
	 * @param varsInScope
	 * @param element
	 * @param context
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param varsInScope
	 * @param element
	 * @param context
	 */
	private void analyzeV2_AffectedDistanceVarName(List<CtVariableAccess> varsAffected, List<CtVariable> varsInScope,
```

### JavadocDeclaration
`@param varsAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * identifier names are majorly capital letters are constant variables
	 * 
	 * @param varsAffected
	 * @param element
	 * @param context
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param varsAffected
	 * @param element
	 * @param context
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param varsAffected
	 * @param element
	 * @param context
	 */
	private void analyzeV3_AffectedHasConstant(List<CtVariableAccess> varsAffected, CtElement element,
```

### JavadocDeclaration
`@param varsAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	/**
	 * 
	 * @param varsAffected
	 * @param element
	 * @param context
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param varsAffected
	 * @param element
	 * @param context
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param varsAffected
	 * @param element
	 * @param context
	 */
	private void analyzeV4(List<CtVariableAccess> varsAffected, CtElement element, Cntx<Object> context) {
```

### JavadocDeclaration
`@param varsAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * Check is a variable affected is compatible with a method type or parameter
	 * 
	 * @param varsAffected
	 * @param element
	 * @param context
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param varsAffected
	 * @param element
	 * @param context
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param varsAffected
	 * @param element
	 * @param context
	 */
	private void analyzeV1_V6_V16(List<CtVariableAccess> varsAffected, CtElement element, Cntx<Object> context,
```

### JavadocDeclaration
`@param varsAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * certain function transformation of the involved variable
	 * 
	 * @param varsAffected
	 * @param element
	 * @param context
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param varsAffected
	 * @param element
	 * @param context
	 */
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param varsAffected
	 * @param element
	 * @param context
	 */
	@SuppressWarnings("rawtypes")
```

### JavadocDeclaration
`@param varsAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * its introduction (declaration)(chart-4)
	 * 
	 * @param varsAffected
	 * @param element
	 */
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param varsAffected
	 * @param element
	 */
	@SuppressWarnings("rawtypes")
```

### JavadocDeclaration
`@param varsAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * its introduction (declaration) (chart-4)
	 * 
	 * @param varsAffected
	 * @param element
	 * @param statements
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param varsAffected
	 * @param element
	 * @param statements
	 */
```

### JavadocDeclaration
`@param statements` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * @param varsAffected
	 * @param element
	 * @param statements
	 */
	@SuppressWarnings("rawtypes")
```

### JavadocDeclaration
`@param condition` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * Return if the Condition is a guard
	 * 
	 * @param condition
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param condition
	 * @return
	 */
	// we want the condition not to be null related check
```

### JavadocDeclaration
`@param allMethods` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * cttype as argument
	 * 
	 * @param allMethods
	 * @param typeToMatch
	 * @return
```

### JavadocDeclaration
`@param typeToMatch` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param allMethods
	 * @param typeToMatch
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * @param allMethods
	 * @param typeToMatch
	 * @return
	 */
	public CtMethod checkMethodDeclarationWithParameterReturnCompatibleType(List allMethods,
```

### JavadocDeclaration
`@param aStatement` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * Returns a parent that is not a block
	 * 
	 * @param aStatement
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param aStatement
	 * @return
	 */
	public CtElement getParentNotBlock(CtElement aStatement) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * Return if the element is a guard
	 * 
	 * @param element
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param element
	 * @return
	 */
	public boolean isNormalGuard(CtElement element, CtStatement parentStatement) {
```

### JavadocDeclaration
`@param varsAffected` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * been referenced in other methods of the faulty class.
	 * 
	 * @param varsAffected
	 * @param element
	 * @param parentClass
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * 
	 * @param varsAffected
	 * @param element
	 * @param parentClass
	 */
```

### JavadocDeclaration
`@param parentClass` tag description is missing
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 * @param varsAffected
	 * @param element
	 * @param parentClass
	 */
	@SuppressWarnings("rawtypes")
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `commit` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/git/FileCommitGit.java`
#### Snippet
```java
public class FileCommitGit implements FileCommit {

	private Commit commit;
	private String previousFileName;
	private String nextFileName;
```

### FieldMayBeFinal
Field `left` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/filespair/FilePairsDiff.java`
#### Snippet
```java
	Logger log = Logger.getLogger(FilePairsDiff.class.getName());

	private File left, right;

	public FilePairsDiff(File left, File right) {
```

### FieldMayBeFinal
Field `right` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/filespair/FilePairsDiff.java`
#### Snippet
```java
	Logger log = Logger.getLogger(FilePairsDiff.class.getName());

	private File left, right;

	public FilePairsDiff(File left, File right) {
```

### FieldMayBeFinal
Field `rightFile` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/filespair/FilesPairNavigation.java`
#### Snippet
```java

	private File leftFile;
	private File rightFile;

	public FilesPairNavigation() {
```

### FieldMayBeFinal
Field `history` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/filespair/FilesPairNavigation.java`
#### Snippet
```java
class FilesPairRevisionOrder implements RevisionOrder<IRevision> {

	private RevisionDataset<IRevision> history;

	FilesPairRevisionOrder(RevisionDataset<IRevision> history) {
```

### FieldMayBeFinal
Field `leftFile` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/filespair/FilesPairNavigation.java`
#### Snippet
```java
public class FilesPairNavigation extends RevisionNavigationExperiment<IRevision> {

	private File leftFile;
	private File rightFile;

```

### FieldMayBeFinal
Field `max_included` may be 'final'
in `src/main/java/fr/inria/coming/core/filter/diff/NbHunkFilter.java`
#### Snippet
```java

	FragmentableComparator comparator = new LineComparator(); // new JavaTokenComparator();
	private int max_included;
	private int min_included;

```

### FieldMayBeFinal
Field `min_included` may be 'final'
in `src/main/java/fr/inria/coming/core/filter/diff/NbHunkFilter.java`
#### Snippet
```java
	FragmentableComparator comparator = new LineComparator(); // new JavaTokenComparator();
	private int max_included;
	private int min_included;

	public NbHunkFilter() {
```

### FieldMayBeFinal
Field `fLines` may be 'final'
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SLineComparator.java`
#### Snippet
```java
class SLineComparator implements Fragmentable {

    private String[] fLines;

    public SLineComparator(InputStream is, String encoding) throws IOException {
```

### FieldMayBeFinal
Field `keywords` may be 'final'
in `src/main/java/fr/inria/coming/core/filter/commitmessage/KeyWordsIgnoredFragmentFilter.java`
#### Snippet
```java
public class KeyWordsIgnoredFragmentFilter extends AbstractChainedFilter<String> {

	private String[] keywords;

	public KeyWordsIgnoredFragmentFilter(String... keywords) {
```

### FieldMayBeFinal
Field `keywords` may be 'final'
in `src/main/java/fr/inria/coming/core/filter/commitmessage/KeyWordsFragmentFilter.java`
#### Snippet
```java
public class KeyWordsFragmentFilter extends AbstractChainedFilter<String> {

	private String[] keywords;

	public KeyWordsFragmentFilter(String... keywords) {
```

### FieldMayBeFinal
Field `masterBranch` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java

	private List<Commit> commits;
	private String masterBranch;
	private Collection<String> filter;

```

### FieldMayBeFinal
Field `commits` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
	private Repository repository;

	private List<Commit> commits;
	private String masterBranch;
	private Collection<String> filter;
```

### FieldMayBeFinal
Field `filter` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
	private List<Commit> commits;
	private String masterBranch;
	private Collection<String> filter;

	public RepositoryPGit(String pathOfRepo, String branch) {
```

### FieldMayBeFinal
Field `fStarts` may be 'final'
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
  private final String fText;
  private int fCount;
  private int[] fStarts;
  private int[] fLengths;
  private String[] fTokens;
```

### FieldMayBeFinal
Field `fTokens` may be 'final'
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
  private int[] fStarts;
  private int[] fLengths;
  private String[] fTokens;


```

### FieldMayBeFinal
Field `fLengths` may be 'final'
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
  private int fCount;
  private int[] fStarts;
  private int[] fLengths;
  private String[] fTokens;

```

### FieldMayBeFinal
Field `revCommit` may be 'final'
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java

	private RepositoryP repo;
	private RevCommit revCommit;
	static public String[] extensionToConsider = new String[] { ".java" };

```

### FieldMayBeFinal
Field `probAccumulative` may be 'final'
in `src/main/java/fr/inria/coming/utils/Probability.java`
#### Snippet
```java

	private Map<K, Double> probDist = new LinkedHashMap<>();;
	private Map<K, Double> probAccumulative = new LinkedHashMap<>();

	public Map<K, Double> getProbDist() {
```

### FieldMayBeFinal
Field `probDist` may be 'final'
in `src/main/java/fr/inria/coming/utils/Probability.java`
#### Snippet
```java
public class Probability<K> {

	private Map<K, Double> probDist = new LinkedHashMap<>();;
	private Map<K, Double> probAccumulative = new LinkedHashMap<>();

```

### FieldMayBeFinal
Field `allOperations` may be 'final'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/MegaDiff.java`
#### Snippet
```java
	 * Actions over all tree nodes (CtElements)
	 */
	private List<Operation> allOperations = new ArrayList<>();
	/**
	 * Actions over the changes roots.
```

### FieldMayBeFinal
Field `_mappingsComp` may be 'final'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/MegaDiff.java`
#### Snippet
```java
	 * the mapping of this diff
	 */
	private MappingStore _mappingsComp = new MappingStore();
	/**
	 * Context of the spoon diff.
```

### FieldMayBeFinal
Field `context` may be 'final'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/MegaDiff.java`
#### Snippet
```java
	 * Context of the spoon diff.
	 */
	private TreeContext context = new TreeContext();

	public void merge(Diff anotherDiff) {
```

### FieldMayBeFinal
Field `rootOperations` may be 'final'
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/MegaDiff.java`
#### Snippet
```java
	 * Actions over the changes roots.
	 */
	private List<Operation> rootOperations = new ArrayList<>();
	/**
	 * the mapping of this diff
```

### FieldMayBeFinal
Field `changes` may be 'final'
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/ChangePatternSpecification.java`
#### Snippet
```java

	private String name;
	private List<PatternAction> changes;

	public String getName() {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
public class VariableResolver {

	private static Logger logger = Logger.getLogger(VariableResolver.class.getName());

	/**
```

### FieldMayBeFinal
Field `repairToolArg` may be 'final'
in `src/main/java/fr/inria/coming/repairability/RepairTools.java`
#### Snippet
```java


    private String repairToolArg; // The repair-tool argument provided in CLI

    /**
```

### FieldMayBeFinal
Field `PREDEFINED_METHODS_AND_LITERALS` may be 'final'
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
	private String[] PREDEFINED_METHODS_AND_LITERALS_ARR = { "-1", "0", "1", "size()", "length()", "isEmpty()",
			"length" };
	private List<String> PREDEFINED_METHODS_AND_LITERALS = Arrays.asList(PREDEFINED_METHODS_AND_LITERALS_ARR);

	private Set<String> executableInvocations;
```

### FieldMayBeFinal
Field `PREDEFINED_METHODS_AND_LITERALS_ARR` may be 'final'
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
	private static final String NAME_SEPARATOR = "###";

	private String[] PREDEFINED_METHODS_AND_LITERALS_ARR = { "-1", "0", "1", "size()", "length()", "isEmpty()",
			"length" };
	private List<String> PREDEFINED_METHODS_AND_LITERALS = Arrays.asList(PREDEFINED_METHODS_AND_LITERALS_ARR);
```

### FieldMayBeFinal
Field `option` may be 'final'
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java

public class Demo {
    private Option option;

    public Demo(Option option) {
```

### FieldMayBeFinal
Field `codeDiffer` may be 'final'
in `src/main/java/fr/inria/prophet4j/P4J.java`
#### Snippet
```java
// this is the API class of Prophet4J
public class P4J {
    private CodeDiffer codeDiffer;
    private Structure.ParameterVector parameterVector;

```

### FieldMayBeFinal
Field `parameterVector` may be 'final'
in `src/main/java/fr/inria/prophet4j/P4J.java`
#### Snippet
```java
public class P4J {
    private CodeDiffer codeDiffer;
    private Structure.ParameterVector parameterVector;

    public P4J() {
```

### FieldMayBeFinal
Field `task` may be 'final'
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            description = "Task" + commonInfo
    )
    private Task task = Task.EXTRACT;

    @CommandLine.Option(
```

### FieldMayBeFinal
Field `featureOption` may be 'final'
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            description = "Feature Option" + commonInfo
    )
    private FeatureOption featureOption = FeatureOption.ORIGINAL;

    public static void main(String[] args) {
```

### FieldMayBeFinal
Field `displayUsageInfo` may be 'final'
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            description = "display usage info"
    )
    private boolean displayUsageInfo = false;

    @CommandLine.Option(
```

### FieldMayBeFinal
Field `dataOption` may be 'final'
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            description = "Data Option" + commonInfo
    )
    private DataOption dataOption = DataOption.BUG_DOT_JAR_MINUS_MATH;

    @CommandLine.Option(
```

### FieldMayBeFinal
Field `displayVersionInfo` may be 'final'
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            description = "display version info"
    )
    private boolean displayVersionInfo = false;

    @CommandLine.Option(
```

### FieldMayBeFinal
Field `patchOption` may be 'final'
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            description = "Patch Option" + commonInfo
    )
    private PatchOption patchOption = PatchOption.BUG_DOT_JAR_MINUS_MATH;

    @CommandLine.Option(
```

### FieldMayBeFinal
Field `degree` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4R/S4RFeatureCross.java`
#### Snippet
```java
    static final long serialVersionUID = 1L;
    private Integer id;
    private Double degree;
    private List<Feature> features;

```

### FieldMayBeFinal
Field `features` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4R/S4RFeatureCross.java`
#### Snippet
```java
    private Integer id;
    private Double degree;
    private List<Feature> features;

    public S4RFeatureCross(Integer id) {
```

### FieldMayBeFinal
Field `option` may be 'final'
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java

public class DataManager {
    private Option option;

    public DataManager(Option option) {
```

### FieldMayBeFinal
Field `features` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureCross.java`
#### Snippet
```java
    private Integer id;
    private Double degree;
    private List<Feature> features;

    public S4ROFeatureCross(Integer id) {
```

### FieldMayBeFinal
Field `degree` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureCross.java`
#### Snippet
```java
    static final long serialVersionUID = 1L;
    private Integer id;
    private Double degree;
    private List<Feature> features;

```

### FieldMayBeFinal
Field `degree` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureCross.java`
#### Snippet
```java
    static final long serialVersionUID = 1L;
    private Integer id;
    private Double degree;
    private List<Feature> features;

```

### FieldMayBeFinal
Field `features` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureCross.java`
#### Snippet
```java
    private Integer id;
    private Double degree;
    private List<Feature> features;

    public EnhancedFeatureCross(Integer id) {
```

### FieldMayBeFinal
Field `area` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
// based on RepairGenerator.cpp
public class S4RORepairGenerator implements RepairGenerator {
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
```

### FieldMayBeFinal
Field `repairAnalyzer` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private S4RORepairAnalyzer repairAnalyzer = new S4RORepairAnalyzer();

    public S4RORepairGenerator(DiffEntry diffEntry) {
```

### FieldMayBeFinal
Field `repairs` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private S4RORepairAnalyzer repairAnalyzer = new S4RORepairAnalyzer();
```

### FieldMayBeFinal
Field `compound_counter` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private S4RORepairAnalyzer repairAnalyzer = new S4RORepairAnalyzer();

```

### FieldMayBeFinal
Field `diffEntry` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
public class S4RORepairGenerator implements RepairGenerator {
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
```

### FieldMayBeFinal
Field `factory` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
```

### FieldMayBeFinal
Field `valueExprInfo` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
public class S4ROFeatureExtractor implements FeatureExtractor {

    private Map<String, CtElement> valueExprInfo = new HashMap<>();

    private EnumSet<RepairFeature> getRepairFeatures(Repair repair) {
```

### FieldMayBeFinal
Field `features` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureCross.java`
#### Snippet
```java
    private Integer id;
    private Double degree;
    private List<Feature> features;

    public ExtendedFeatureCross(Integer id) {
```

### FieldMayBeFinal
Field `degree` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureCross.java`
#### Snippet
```java
    static final long serialVersionUID = 1L;
    private Integer id;
    private Double degree;
    private List<Feature> features;

```

### FieldMayBeFinal
Field `repairs` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private EnhancedRepairAnalyzer repairAnalyzer = new EnhancedRepairAnalyzer();
```

### FieldMayBeFinal
Field `factory` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
```

### FieldMayBeFinal
Field `compound_counter` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private EnhancedRepairAnalyzer repairAnalyzer = new EnhancedRepairAnalyzer();

```

### FieldMayBeFinal
Field `area` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
// based on RepairGenerator.cpp
public class EnhancedRepairGenerator implements RepairGenerator {
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
```

### FieldMayBeFinal
Field `repairAnalyzer` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private EnhancedRepairAnalyzer repairAnalyzer = new EnhancedRepairAnalyzer();

    public EnhancedRepairGenerator(DiffEntry diffEntry) {
```

### FieldMayBeFinal
Field `diffEntry` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
public class EnhancedRepairGenerator implements RepairGenerator {
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
```

### FieldMayBeFinal
Field `features` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
    private Integer id;
    private Double degree;
    private List<Feature> features;
    private List<Feature> simpleP4Jfeatures;
    private CrossType crossType;
```

### FieldMayBeFinal
Field `degree` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
    static final long serialVersionUID = 1L;
    private Integer id;
    private Double degree;
    private List<Feature> features;
    private List<Feature> simpleP4Jfeatures;
```

### FieldMayBeFinal
Field `valueExprInfo` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
public class EnhancedFeatureExtractor implements FeatureExtractor {

    private Map<String, CtElement> valueExprInfo = new HashMap<>();

    private EnumSet<RepairFeature> getRepairFeatures(Repair repair) {
```

### FieldMayBeFinal
Field `factory` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
```

### FieldMayBeFinal
Field `repairAnalyzer` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private ExtendedRepairAnalyzer repairAnalyzer = new ExtendedRepairAnalyzer();

    public ExtendedRepairGenerator(DiffEntry diffEntry) {
```

### FieldMayBeFinal
Field `compound_counter` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private ExtendedRepairAnalyzer repairAnalyzer = new ExtendedRepairAnalyzer();

```

### FieldMayBeFinal
Field `area` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
// based on RepairGenerator.cpp
public class ExtendedRepairGenerator implements RepairGenerator {
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
```

### FieldMayBeFinal
Field `diffEntry` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
public class ExtendedRepairGenerator implements RepairGenerator {
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
```

### FieldMayBeFinal
Field `repairs` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private ExtendedRepairAnalyzer repairAnalyzer = new ExtendedRepairAnalyzer();
```

### FieldMayBeFinal
Field `valueExprInfo` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
public class ExtendedFeatureExtractor implements FeatureExtractor {

    private Map<String, CtElement> valueExprInfo = new HashMap<>();

    private EnumSet<RepairFeature> getRepairFeatures(Repair repair) {
```

### FieldMayBeFinal
Field `option` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
// used to generate csv files for YE
public class Tool {
    private Option option;

    private Tool(Option option) {
```

### FieldMayBeFinal
Field `area` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
// based on RepairGenerator.cpp
public class OriginalRepairGenerator implements RepairGenerator {
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
```

### FieldMayBeFinal
Field `repairs` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private OriginalRepairAnalyzer repairAnalyzer = new OriginalRepairAnalyzer();
```

### FieldMayBeFinal
Field `factory` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
```

### FieldMayBeFinal
Field `repairAnalyzer` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private OriginalRepairAnalyzer repairAnalyzer = new OriginalRepairAnalyzer();

    public OriginalRepairGenerator(DiffEntry diffEntry) {
```

### FieldMayBeFinal
Field `diffEntry` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
public class OriginalRepairGenerator implements RepairGenerator {
    private Set<CtElement> area; // loc_map
    private DiffEntry diffEntry;
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
```

### FieldMayBeFinal
Field `compound_counter` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
    private CoreFactory factory;
    private List<Repair> repairs = new ArrayList<>();
    private Map<CtStatementList, Integer> compound_counter = new HashMap<>();
    private OriginalRepairAnalyzer repairAnalyzer = new OriginalRepairAnalyzer();

```

### FieldMayBeFinal
Field `option` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/FeatureLearner.java`
#### Snippet
```java
// based on learner.cpp (follow the way of ProphetPaper)
public class FeatureLearner {
    private Option option;

    private static final Logger logger = LogManager.getLogger(FeatureLearner.class.getName());
```

### FieldMayBeFinal
Field `featureCrosses` may be 'final'
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
    class FeatureVector implements Serializable {
        static final long serialVersionUID = 1L;
        private Set<FeatureCross> featureCrosses;

        public FeatureVector() {
```

### FieldMayBeFinal
Field `fileKey` may be 'final'
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
        static final long serialVersionUID = 1L;
        private boolean marked; // for human patch or not
        private String fileKey;
        private List<FeatureVector> featureVectors;

```

### FieldMayBeFinal
Field `featureVectors` may be 'final'
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
        private boolean marked; // for human patch or not
        private String fileKey;
        private List<FeatureVector> featureVectors;

        public FeatureMatrix(boolean marked, String fileKey, List<FeatureVector> featureVectors) {
```

### FieldMayBeFinal
Field `filePath` may be 'final'
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
public interface Structure {
    class Sample { // namely TrainingCase
        private String filePath;
        private List<FeatureMatrix> featureMatrices;

```

### FieldMayBeFinal
Field `valueExprInfo` may be 'final'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
public class OriginalFeatureExtractor implements FeatureExtractor {

    private Map<String, CtElement> valueExprInfo = new HashMap<>();

    private EnumSet<RepairFeature> getRepairFeatures(Repair repair) {
```

### FieldMayBeFinal
Field `numerator` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java

    private class Fraction<T> {
        private T numerator;
        private T denominator;

```

### FieldMayBeFinal
Field `number` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    private class Ranking {
        private String entryName;
        private double number;
        private double median;
        private double mean;
```

### FieldMayBeFinal
Field `median` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        private String entryName;
        private double number;
        private double median;
        private double mean;
        private double SD;
```

### FieldMayBeFinal
Field `entryName` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java

    private class Ranking {
        private String entryName;
        private double number;
        private double median;
```

### FieldMayBeFinal
Field `denominator` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    private class Fraction<T> {
        private T numerator;
        private T denominator;

        Fraction(T numerator, T denominator) {
```

### FieldMayBeFinal
Field `parameterVector` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    private Option option;
    private CodeDiffer codeDiffer;
    private ParameterVector parameterVector;

    public RepairEvaluator(Option option) {
```

### FieldMayBeFinal
Field `codeDiffer` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java

    private Option option;
    private CodeDiffer codeDiffer;
    private ParameterVector parameterVector;

```

### FieldMayBeFinal
Field `option` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
public class RepairEvaluator {

    private Option option;
    private CodeDiffer codeDiffer;
    private ParameterVector parameterVector;
```

### FieldMayBeFinal
Field `SD` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        private double median;
        private double mean;
        private double SD;

        Ranking(String entryName, double number, double median, double mean, double SD) {
```

### FieldMayBeFinal
Field `mean` may be 'final'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        private double number;
        private double median;
        private double mean;
        private double SD;

```

### FieldMayBeFinal
Field `byGenerator` may be 'final'
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
public class CodeDiffer {

    private boolean byGenerator;
    private Option option;
    private String pathName;
```

### FieldMayBeFinal
Field `option` may be 'final'
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java

    private boolean byGenerator;
    private Option option;
    private String pathName;
    private boolean cross=true;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `dataset` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileNavigationExperiment.java`
#### Snippet
```java
	public RevisionDataset<IRevision> loadDataset() {

		RevisionDataset dataset = new FileDatasets(flocation);

		return dataset;
```

### UnnecessaryLocalVariable
Local variable `fileDiff` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java
				return this.next();

			FileDiff fileDiff = new FileDiff(diffName);
			return fileDiff;

```

### UnnecessaryLocalVariable
Local variable `results` is redundant
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/FragmentableComparator.java`
#### Snippet
```java

  public RangeDifference[] compare(Fragmentable sbefore, Fragmentable safter) {
    RangeDifference[] results = RangeDifferencer.findRanges(new LCSSettings(), sbefore, safter, safter);
    return results;
  }
```

### UnnecessaryLocalVariable
Local variable `iterator` is redundant
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java

        Long startTime = System.currentTimeMillis();
        for (Iterator<R> iterator = it; iterator.hasNext(); ) {

            R oneRevision = iterator.next();
```

### UnnecessaryLocalVariable
Local variable `li` is redundant
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java
	public List<IRevisionPair> getChildren() {
		if (extensionToConsider == null || extensionToConsider.length == 0) {
			List<IRevisionPair> li = new ArrayList<>(this.getFileCommits());
			return li;
		} else {
```

### UnnecessaryLocalVariable
Local variable `c` is redundant
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
	   private static Comparator<String> getComparator()
	    {
	        Comparator<String> c = new Comparator<String>()
	        {
	            public int compare(String o1, String o2)
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			throw new IllegalAccessError("error: initialize the engine first");

		FinalResult result = navigatorEngine.analyze();

		return result;
```

### UnnecessaryLocalVariable
Local variable `d` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
	public Diff getDiff(File left, File right) throws Exception {
		AstComparator localdiff = new AstComparator(ComingProperties.getPropertyBoolean("processcomments"));
		Diff d = localdiff.compare(left, right);
		return d;
	}
```

### UnnecessaryLocalVariable
Local variable `d` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
	public Diff getDiff(File left, File right, boolean includeComment) throws Exception {
		AstComparator localdiff = new AstComparator(includeComment);
		Diff d = localdiff.compare(left, right);
		return d;
	}
```

### UnnecessaryLocalVariable
Local variable `future` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
	private Future<Diff> getDiffInFuture(ExecutorService executorService, File left, File right) {

		Future<Diff> future = executorService.submit(() -> {
			AstComparator cdiff = new AstComparator(this.includeComments);
			Diff d = cdiff.compare(left, right);
```

### UnnecessaryLocalVariable
Local variable `d` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
		Future<Diff> future = executorService.submit(() -> {
			AstComparator cdiff = new AstComparator(this.includeComments);
			Diff d = cdiff.compare(left, right);
			return d;
		});
```

### UnnecessaryLocalVariable
Local variable `probMap` is redundant
in `src/main/java/fr/inria/coming/utils/Probability.java`
#### Snippet
```java

	public Map<K, Double> sortByValue(Map<K, Double> prob) {
		Map<K, Double> probMap = prob.entrySet().stream().sorted(Map.Entry.<K, Double>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
```

### UnnecessaryLocalVariable
Local variable `revisionResult` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/SpreadPatternInstanceAnalyzer.java`
#### Snippet
```java
		instancesAll.add(resultDiff);

		PatternInstancesFromRevision revisionResult = new PatternInstancesFromRevision(input, instancesAll);

		return revisionResult;
```

### UnnecessaryLocalVariable
Local variable `revisionResult` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstanceAnalyzer.java`
#### Snippet
```java
		}

		PatternInstancesFromRevision revisionResult = new PatternInstancesFromRevision(input, instancesAll,diffResut.getRow_list());

		return (revisionResult);
```

### UnnecessaryLocalVariable
Local variable `matched` is redundant
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java

		// Now, we match the remain var access.
		Map<CtVariableAccess, List<CtVariable>> matched = matchVars(varContext, varAccessCollected, matchName);
		return matched;
	}
```

### UnnecessaryLocalVariable
Local variable `affectedMoved` is redundant
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java

			// Element to move in source
			CtElement affectedMoved = operation.getSrcNode();

			affectedCtElement = affectedMoved;
```

### UnnecessaryLocalVariable
Local variable `oldLocation` is redundant
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
		} else if (operation instanceof InsertOperation) {

			CtElement oldLocation = ((InsertOperation) operation).getParent();

			affectedCtElement = oldLocation;
```

### UnnecessaryLocalVariable
Local variable `oldLocation` is redundant
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
		} else if (operation instanceof DeleteOperation) {

			CtElement oldLocation = operation.getSrcNode();

			affectedCtElement = oldLocation;
```

### UnnecessaryLocalVariable
Local variable `oldLocation` is redundant
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
		} else if (operation instanceof UpdateOperation) {

			CtElement oldLocation = operation.getSrcNode();

			affectedCtElement = oldLocation;
```

### UnnecessaryLocalVariable
Local variable `p` is redundant
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
			return composed;
		} else if (/* vStat instanceof AstorOutputStatus || */ vStat instanceof String) {
			JsonPrimitive p = new JsonPrimitive(JSONObject.escape(vStat.toString()));
			value = p;
		} else if (vStat instanceof Collection<?>) {
```

### UnnecessaryLocalVariable
Local variable `p` is redundant
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
			try {

				JsonPrimitive p = new JsonPrimitive(JSONObject.escape(vStat.toString()));
				value = p;
			} catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `instances` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
            return Collections.EMPTY_LIST;
        }
        List<ChangePatternInstance> instances = calculateValidInstancesFromMapping(changePatternSpecification,
                mapping.getMappings());

```

### UnnecessaryLocalVariable
Local variable `binaryOperatorsFromFaultyLine` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
			List<CtBinaryOperator> allbinaryoperators) {

		List<CtBinaryOperator> binaryOperatorsFromFaultyLine = allbinaryoperators;
		
		for(int index=0; index<binaryOperatorsFromFaultyLine.size(); index++) {
```

### UnnecessaryLocalVariable
Local variable `finalResult` is redundant
in `src/main/java/fr/inria/coming/repairability/RepairabilityAnalyzer.java`
#### Snippet
```java
        }

        PatternInstancesFromRevision finalResult = new PatternInstancesFromRevision(input, allInstances, result.getRow_list());

        return finalResult;
```

### UnnecessaryLocalVariable
Local variable `anotherConstructor` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				for (CtConstructor certainconstructorinclass : allconstructorsinclass) {

						CtConstructor anotherConstructor = (CtConstructor) certainconstructorinclass;
						// Ignoring if it's the same
						if (anotherConstructor == null || anotherConstructor.getSignature().
```

### UnnecessaryLocalVariable
Local variable `anotherConstructorCall` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			    	for (CtConstructorCall certainconstructorcallinclass : allconstructorcallsinclass) {

			    		CtConstructorCall anotherConstructorCall = (CtConstructorCall) certainconstructorcallinclass;
						if (anotherConstructorCall == null || anotherConstructorCall.getExecutable().getSignature().
								equals(constructorcall.getExecutable().getSignature()))
```

### UnnecessaryLocalVariable
Local variable `anotherConstructor` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
				for (CtConstructor certainconstructorinclass : allconstructorsinclass) {

						CtConstructor anotherConstructor = (CtConstructor) certainconstructorinclass;
						if (anotherConstructor == null || anotherConstructor.getSignature().
								equals(constructorcall.getExecutable().getSignature()))
```

### UnnecessaryLocalVariable
Local variable `anotherConstructorCall` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			    	for (CtConstructorCall certainconstructorcallinclass : allconstructorcallsinclass) {

			    		CtConstructorCall anotherConstructorCall = (CtConstructorCall) certainconstructorcallinclass;
						if (anotherConstructorCall == null || anotherConstructorCall.getExecutable().getSignature().
								equals(constructorcall.getExecutable().getSignature()))
```

### UnnecessaryLocalVariable
Local variable `srcNode` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
		if (!mapping.hasDst(ifTree))
			return null;
		CtElement srcNode = (CtElement) mapping.getSrc(ifTree).getMetadata("spoon_object");
		return srcNode;
	}
```

### UnnecessaryLocalVariable
Local variable `insOp` is redundant
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
		}
		
		Operation insOp = instance.getActions().get(0) instanceof InsertOperation ? instance.getActions().get(0)
				: instance.getActions().get(1);

```

### UnnecessaryLocalVariable
Local variable `cond` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		if (parentConditional != null) {// TODO, maybe force that the var must be in the condition, or not.
			CtConditional cond = (CtConditional) parentConditional;
			condition = cond.getCondition();
			return checkNullCheckGuardCondition(condition);
```

### UnnecessaryLocalVariable
Local variable `isConditionAGuard` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
				if (whethereffectiveguard(guardCandidateIf, parentStatement)) {
					condition = guardCandidateIf.getCondition();
					boolean isConditionAGuard = checkNullCheckGuardCondition(condition);
					return isConditionAGuard;
				}
```

### UnnecessaryLocalVariable
Local variable `constructorname` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		String[] namespace = call.getType().getQualifiedName().split("\\(")[0].split("\\.");
		String constructorname = namespace[namespace.length - 1];
		return constructorname;
	}
```

### UnnecessaryLocalVariable
Local variable `cond` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		if (parentConditional != null) { // TODO, maybe force that the var must be in the condition, or not.
			CtConditional cond = (CtConditional) parentConditional;
			condition = cond.getCondition();
			return checkNormalGuardCondition(condition);
```

### UnnecessaryLocalVariable
Local variable `isConditionAGuard` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
				if (whethereffectiveguard(guardCandidateIf, parentStatement)) {
					condition = guardCandidateIf.getCondition();
					boolean isConditionAGuard = checkNormalGuardCondition(condition);
					return isConditionAGuard;
				}
```

### UnnecessaryLocalVariable
Local variable `list` is redundant
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
        
        public List<FeatureCross> getNonSortedFeatureCrosses() {
            List<FeatureCross> list = new ArrayList<>(featureCrosses);
            return list;
        }
```

## RuleId[id=UnnecessaryTemporaryOnConversionToString]
### UnnecessaryTemporaryOnConversionToString
Unnecessary temporary object in conversion to 'String'
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
				cjson.addProperty("change_type", getOpInComment(comment, iDiff));

				commentsJSON.add(new Integer(commentId).toString(), cjson);
				commentId++;
			}
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
            
            boolean[] constructorcallfeature91012 = analyze_SamerMethodWithGuardOrTrywrap(originalElement, parentClass, emptyinvocationfromclass,
            		emptyinvocationunderstudy, allconstructorcallsFromClass, Arrays.asList(constructorcallAffected));

            if(constructorcallfeature91012 != null) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			
			writeGroupedInfo(context, adjustIdentifyInJson(varAffected), CodeFeatures.V1_LOCAL_VAR_NOT_USED, 
					analyze_AffectedVariablesUsed (Arrays.asList(varAffected), originalElement, allstatementsinclass), 
					"FEATURES_VARS");
			
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			
			writeGroupedInfo(context, adjustIdentifyInJson(varAffected), CodeFeatures.V1_LOCAL_VAR_NOT_ASSIGNED, 
					analyze_AffectedAssigned (Arrays.asList(varAffected), originalElement), 
					"FEATURES_VARS");
			
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					"FEATURES_VARS");
			
			boolean[] varfeatures = analyze_SametypewithGuard(Arrays.asList(varAffected), originalElement, parentClass,
					allstatementsinclass);

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			
			writeGroupedInfo(context, adjustIdentifyInJson(varAffected), CodeFeatures.V4_Field_NOT_USED, 
					analyze_AffectedFielfs(Arrays.asList(varAffected), originalElement, parentClass), "FEATURES_VARS");
			
			writeGroupedInfo(context, adjustIdentifyInJson(varAffected), CodeFeatures.V4_Field_NOT_ASSIGNED, 
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			
			writeGroupedInfo(context, adjustIdentifyInJson(varAffected), CodeFeatures.V4_Field_NOT_ASSIGNED, 
					analyze_AffectedFieldAssigned(Arrays.asList(varAffected), originalElement, parentClass), "FEATURES_VARS");
			
			boolean[] varvalue78 = analyze_AffectedObjectLastAppear(Arrays.asList(varAffected), originalElement, allstatementsinclass);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					analyze_AffectedFieldAssigned(Arrays.asList(varAffected), originalElement, parentClass), "FEATURES_VARS");
			
			boolean[] varvalue78 = analyze_AffectedObjectLastAppear(Arrays.asList(varAffected), originalElement, allstatementsinclass);

            if(varvalue78 != null) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
            
            boolean[] methdofeature91012 = analyze_SamerMethodWithGuardOrTrywrap(originalElement, parentClass, invocationsFromClass,
            		Arrays.asList(invocationAffected), emptyconstructorcallfromclass, emptyconstructorcallunderstudy);

            if(methdofeature91012 != null) {
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Runtime exception instance `new RuntimeException()` is not thrown
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
				
			} catch (Exception e) {
				new RuntimeException("Unable to compute ADD analysis", e);
			}
		}
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java

	private static void extractAndSaveCtElementsHierarchyModel(String outputPath) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File(outputPath));

		Map<String, Set> childrenToParents = new HashMap<>();
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`found == false` can be simplified to '!found'
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
            boolean found = coveredByInstanceNodes(instancePattern, instanceNodes, diffOperation);
            
            if(found == false)
                return false;
        }
```

### PointlessBooleanExpression
`found == false` can be simplified to '!found'
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
			boolean found = coveredByInstanceNodes(instance, instanceNodes, diffOperation);

			if (found == false)
				return false;
		}
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/fr/inria/coming/core/entities/DiffResult.java`
#### Snippet
```java

		for (R ops : this.diffOfFiles.values()) {
			all.add(ops);
		}
		return all;
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
			List<CtParameter> pars = method.getParameters();
			for (CtParameter ctParameter : pars) {
				variables.add(ctParameter);
			}
		}
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
    	 	this.simpleP4Jfeatures = new ArrayList<>();
    	 	for(int i=0; i < RepairFeature.values().length;i++) {
        	 	this.simpleP4Jfeatures.add(RepairFeature.values()[i]);
    	 	} 
    	 	for(int i=0; i < AtomicFeature.values().length;i++) {
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
    	 	} 
    	 	for(int i=0; i < AtomicFeature.values().length;i++) {
        	 	this.simpleP4Jfeatures.add(AtomicFeature.values()[i]);
    	 	}  	 	
    	 	for(int i=0; i < ValueFeature.values().length;i++) {
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
    	 	}  	 	
    	 	for(int i=0; i < ValueFeature.values().length;i++) {
        	 	this.simpleP4Jfeatures.add(ValueFeature.values()[i]);
    	 	}
    	 	return this.simpleP4Jfeatures;    	 	
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
		EnumSet<RepairFeature> repairFeatures = getRepairFeatures(repair);
		for (Feature repairFeature : repairFeatures) {
			CFeatures.add(repairFeature);
		}
		// atomic and value features
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'fileTraverser()' is marked unstable with @Beta
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
            File buggyFile = null;
            File patchedFile = null;
            for (File tmpFile : Files.fileTraverser().breadthFirst(file)) {
                if (tmpFile.getName().endsWith("_s.java")) {
                    buggyFile = tmpFile;
```

### UnstableApiUsage
'breadthFirst(N)' is declared in unstable class 'com.google.common.graph.Traverser' marked with @Beta
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
            File buggyFile = null;
            File patchedFile = null;
            for (File tmpFile : Files.fileTraverser().breadthFirst(file)) {
                if (tmpFile.getName().endsWith("_s.java")) {
                    buggyFile = tmpFile;
```

### UnstableApiUsage
'fileTraverser()' is marked unstable with @Beta
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    // we add human patch at the first place
                    File humanFile = new File(patchPath + pathName);
                    for (File file : Lists.newArrayList(Files.fileTraverser().depthFirstPreOrder(humanFile))) {
                        String fileName = file.getName();
                        if (keyName.equals(fileName)) {
```

### UnstableApiUsage
'depthFirstPreOrder(N)' is declared in unstable class 'com.google.common.graph.Traverser' marked with @Beta
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    // we add human patch at the first place
                    File humanFile = new File(patchPath + pathName);
                    for (File file : Lists.newArrayList(Files.fileTraverser().depthFirstPreOrder(humanFile))) {
                        String fileName = file.getName();
                        if (keyName.equals(fileName)) {
```

### UnstableApiUsage
'fileTraverser()' is marked unstable with @Beta
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    // we add human patch at the first place
                    File humanFile = new File(patchPath + pathName);
                    for (File file : Lists.newArrayList(Files.fileTraverser().depthFirstPreOrder(humanFile))) {
                        String fileName = file.getName();
                        if (keyName.equals(fileName)) {
```

### UnstableApiUsage
'depthFirstPreOrder(N)' is declared in unstable class 'com.google.common.graph.Traverser' marked with @Beta
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
                    // we add human patch at the first place
                    File humanFile = new File(patchPath + pathName);
                    for (File file : Lists.newArrayList(Files.fileTraverser().depthFirstPreOrder(humanFile))) {
                        String fileName = file.getName();
                        if (keyName.equals(fileName)) {
```

### UnstableApiUsage
'fileTraverser()' is marked unstable with @Beta
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            File buggyFile = null;
            File patchedFile = null;
            for (File tmpFile : Files.fileTraverser().breadthFirst(file)) {
                if (tmpFile.getName().endsWith("_s.java")) {
                    buggyFile = tmpFile;
```

### UnstableApiUsage
'breadthFirst(N)' is declared in unstable class 'com.google.common.graph.Traverser' marked with @Beta
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            File buggyFile = null;
            File patchedFile = null;
            for (File tmpFile : Files.fileTraverser().breadthFirst(file)) {
                if (tmpFile.getName().endsWith("_s.java")) {
                    buggyFile = tmpFile;
```

