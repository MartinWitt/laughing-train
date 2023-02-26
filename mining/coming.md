# coming 
 
# Bad smells
I found 1387 bad smells with 152 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 157 | false |
| StringOperationCanBeSimplified | 133 | false |
| ThrowablePrintStackTrace | 112 | false |
| DataFlowIssue | 79 | false |
| CommentedOutCode | 78 | false |
| SystemOutErr | 68 | false |
| UnusedAssignment | 60 | false |
| ReturnNull | 56 | false |
| UNUSED_IMPORT | 52 | false |
| SizeReplaceableByIsEmpty | 51 | true |
| RedundantFieldInitialization | 50 | false |
| DynamicRegexReplaceableByCompiledPattern | 48 | false |
| IndexOfReplaceableByContains | 40 | false |
| UnnecessaryCallToStringValueOf | 40 | false |
| UnnecessaryLocalVariable | 36 | true |
| UnnecessaryModifier | 33 | true |
| KeySetIterationMayUseEntrySet | 33 | false |
| EnumSwitchStatementWhichMissesCases | 24 | false |
| ConstantValue | 22 | false |
| UnnecessaryBoxing | 17 | false |
| UtilityClassWithoutPrivateConstructor | 13 | true |
| AssignmentToMethodParameter | 12 | false |
| IgnoreResultOfCall | 9 | false |
| RedundantSuppression | 9 | false |
| UnnecessarySemicolon | 8 | false |
| SetReplaceableByEnumSet | 8 | false |
| UnstableApiUsage | 8 | false |
| WrapperTypeMayBePrimitive | 6 | false |
| UnnecessaryStringEscape | 6 | true |
| MissortedModifiers | 6 | false |
| Convert2MethodRef | 6 | false |
| UseBulkOperation | 6 | false |
| IfStatementWithIdenticalBranches | 5 | false |
| DuplicateThrows | 5 | false |
| CatchMayIgnoreException | 5 | false |
| EqualsBetweenInconvertibleTypes | 4 | false |
| ReplaceAssignmentWithOperatorAssignment | 4 | false |
| RedundantOperationOnEmptyContainer | 4 | false |
| StringEqualsEmptyString | 4 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| TrivialStringConcatenation | 3 | false |
| RedundantMethodOverride | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| IOResource | 3 | false |
| ManualArrayToCollectionCopy | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| EmptyStatementBody | 2 | false |
| CStyleArrayDeclaration | 2 | false |
| DuplicateCondition | 2 | false |
| NestedAssignment | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| EmptyMethod | 2 | false |
| DoubleBraceInitialization | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| FieldMayBeStatic | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| ParameterCanBeLocal | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| AssignmentToForLoopParameter | 2 | false |
| PointlessBooleanExpression | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| StringEquality | 1 | false |
| ClassGetClass | 1 | false |
| RegExpRedundantEscape | 1 | false |
| UnnecessaryReturn | 1 | true |
| NonShortCircuitBoolean | 1 | false |
| InstanceofIncompatibleInterface | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| CallToStringConcatCanBeReplacedByOperator | 1 | false |
| InstanceofCatchParameter | 1 | false |
| ComparatorCombinators | 1 | false |
| RedundantCollectionOperation | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| Anonymous2MethodRef | 1 | false |
| Convert2Lambda | 1 | false |
| UnnecessaryTemporaryOnConversionToString | 1 | false |
| ThrowableNotThrown | 1 | false |
| RedundantFileCreation | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (delta.getType()) { case INSERT: Chunk` insert... statement on enum type 'com.github.difflib.patch.DeltaType' misses case 'EQUAL'
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		        List<AbstractDelta<String>> deltas = diff.getDeltas();
		        deltas.forEach(delta -> {
		            switch (delta.getType()) {
		                case INSERT:
		                    Chunk<String> insert = delta.getTarget();
		                    addLineNo += insert.size();
		                    break;
		                case CHANGE:
		                    Chunk<String> source = delta.getSource();
		                    Chunk<String> target1 = delta.getTarget();
		                    rmLineNo += source.size();
		                    addLineNo += target1.size();
		                    break;
		                case DELETE:
		                    Chunk<String> delete = delta.getSource();
		                    rmLineNo += delete.size();
		                    break;
		            }

		        });
```

### EnumSwitchStatementWhichMissesCases
`switch (row.getTag()) { case INSERT: repair.addProperty("INSERT:", row.getNewLine()); ...` statement on enum type 'com.github.difflib.text.DiffRow.Tag' misses case 'EQUAL'
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
//                  System.out.println(result.getRow_list());
					for (DiffRow row : result.getRow_list()) {
						switch (row.getTag()) {
						case INSERT:
							repair.addProperty("INSERT:", row.getNewLine());
							break;
						case DELETE:
							repair.addProperty("DELETE:", row.getOldLine());
							break;
						case CHANGE:
							repair.addProperty("CHANGE_old:", row.getOldLine());
							repair.addProperty("CHANGE_new:", row.getNewLine());
							break;
						}
					}

```

### EnumSwitchStatementWhichMissesCases
`switch (option.dataOption) { case CARDUMEN: return DataLoader.loadCardum...` statement on enum type 'fr.inria.prophet4j.utility.Option.DataOption' misses case 'CLOSURE'
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java

    private Map<String, Map<File, List<File>>> loadDataWithPatches(String dataPath) {
        switch (option.dataOption) {
            case CARDUMEN:
                return DataLoader.loadCardumenWithPatches(dataPath, Support.PROPHET4J_DIR + "cardumen_dissection/");
            case SANER:
                break;
            case BEARS:
            case BUG_DOT_JAR_MINUS_MATH:
            case QUIX_BUGS:
                return DataLoader.loadODSWithPatches(dataPath);
        }
        return new HashMap<>();
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (option.patchOption) { case CARDUMEN: break; case SPR...` statement on enum type 'fr.inria.prophet4j.utility.Option.PatchOption' misses cases: 'BEARS', 'BUG_DOT_JAR_MINUS_MATH', and 'QUIX_BUGS'
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
    private List<String> getBlacklist() {
        List<String> blacklist = new ArrayList<>();
        switch (option.patchOption) {
            case CARDUMEN:
                break;
            case SPR:
                switch (option.dataOption) {
                    case CARDUMEN:
                        break;
                    case SANER:
                        blacklist.add("ignatov_intellij-erlang10/ErlangFormattingModelBuilder.bin");
                        blacklist.add("ignatov_intellij-erlang14/ErlangFormattingModelBuilder.bin");
                        blacklist.add("JetBrains_kotlin28/JetFormattingModelBuilder.bin");
                        blacklist.add("JetBrains_kotlin14/JetFormattingModelBuilder.bin");
                        break;
                }
                break;
        }
        return blacklist;
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (option.dataOption) { case CARDUMEN: break; ...` statement on enum type 'fr.inria.prophet4j.utility.Option.DataOption' misses cases: 'BEARS', 'BUG_DOT_JAR_MINUS_MATH', ...
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                break;
            case SPR:
                switch (option.dataOption) {
                    case CARDUMEN:
                        break;
                    case SANER:
                        blacklist.add("ignatov_intellij-erlang10/ErlangFormattingModelBuilder.bin");
                        blacklist.add("ignatov_intellij-erlang14/ErlangFormattingModelBuilder.bin");
                        blacklist.add("JetBrains_kotlin28/JetFormattingModelBuilder.bin");
                        blacklist.add("JetBrains_kotlin14/JetFormattingModelBuilder.bin");
                        break;
                }
                break;
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (diffEntry.type) { case DeleteType: // kind // GuardKind: // INSE...` statement on enum type 'fr.inria.prophet4j.utility.Structure.DiffType' misses case 'PartialDeleteType'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
switch (diffEntry.type) {
            case DeleteType: // kind
                // GuardKind: // INSERT_GUARD_RF
                repair.kind = RepairKind.GuardKind;
                break;
            case InsertType: // kind
                // IfExitKind: // INSERT_CONTROL_RF
                // AddAndReplaceKind: // INSERT_STMT_RF
                if (diffEntry.dstNode instanceof CtIf) {
                    repair.kind = RepairKind.IfExitKind;
                } else {
                    repair.kind = RepairKind.AddAndReplaceKind;
                }
                // compare with others in obtainRepairCandidates()
                break;
            case UpdateType: // kind // oldRExpr // newRExpr
                // IfExitKind: // INSERT_CONTROL_RF
                // GuardKind: // INSERT_GUARD_RF
                // SpecialGuardKind: // INSERT_GUARD_RF
                // LoosenConditionKind: // REPLACE_COND_RF
                // TightenConditionKind: // REPLACE_COND_RF
                // ReplaceKind: // REPLACE_STMT_RF
                // ReplaceStringKind: // REPLACE_STMT_RF
                CtIf IF2;
                if (diffEntry.dstNode instanceof CtIf) {
                    IF2 = (CtIf) diffEntry.dstNode;
                } else {
                    IF2 = diffEntry.dstNode.getParent(new TypeFilter<>(CtIf.class));
                }
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
                repair.oldRExpr = diffEntry.srcNode;
                repair.newRExpr = diffEntry.dstNode;
//                if (repair.oldRExpr instanceof CtExpression) {
//                    if (!(repair.oldRExpr instanceof CtAnnotation || repair.oldRExpr instanceof CtImport)) {
//                        while (!(repair.oldRExpr instanceof CtStatement)){
//                            repair.oldRExpr = repair.oldRExpr.getParent();
//                        }
//                    }
//                }
//                if (repair.newRExpr instanceof CtExpression) {
//                    if (!(repair.newRExpr instanceof CtAnnotation || repair.newRExpr instanceof CtImport)) {
//                        while (!(repair.newRExpr instanceof CtStatement)){
//                            repair.newRExpr = repair.newRExpr.getParent();
//                        }
//                    }
//                }
                // compare with others in obtainRepairCandidates()
                repair.isReplace = true;
                break;
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (assignment.getKind()) { case PLUS: putValueFeatu...` statement on enum type 'spoon.reflect.code.BinaryOperatorKind' misses cases: 'OR', 'AND', 'BITOR', 'BITXOR', 'BITAND', ...
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (operator.getKind()) { case POS: putValueFeature(...` statement on enum type 'spoon.reflect.code.UnaryOperatorKind' misses cases: 'NOT', and 'COMPL'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (operator.getKind()) { case PLUS: putValueFeature...` statement on enum type 'spoon.reflect.code.BinaryOperatorKind' misses cases: 'OR', 'AND', 'BITOR', 'BITXOR', 'BITAND', ...
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (repair.kind) { case IfExitKind: // RepairFeature.INSERT_CONTROL_...` statement on enum type 'fr.inria.prophet4j.utility.Structure.RepairKind' misses cases: 'RemovePartialIFKind', 'RemoveSTMTKind', ...
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
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
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (diffEntry.type) { case DeleteType: // kind // GuardKind: // INSE...` statement on enum type 'fr.inria.prophet4j.utility.Structure.DiffType' misses case 'PartialDeleteType'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
switch (diffEntry.type) {
            case DeleteType: // kind
                // GuardKind: // INSERT_GUARD_RF
                repair.kind = RepairKind.GuardKind;
                break;
            case InsertType: // kind
                // IfExitKind: // INSERT_CONTROL_RF
                // AddAndReplaceKind: // INSERT_STMT_RF
                if (diffEntry.dstNode instanceof CtIf) {
                    repair.kind = RepairKind.IfExitKind;
                } else {
                    repair.kind = RepairKind.AddAndReplaceKind;
                }
                // compare with others in obtainRepairCandidates()
                break;
            case UpdateType: // kind // oldRExpr // newRExpr
                // IfExitKind: // INSERT_CONTROL_RF
                // GuardKind: // INSERT_GUARD_RF
                // SpecialGuardKind: // INSERT_GUARD_RF
                // LoosenConditionKind: // REPLACE_COND_RF
                // TightenConditionKind: // REPLACE_COND_RF
                // ReplaceKind: // REPLACE_STMT_RF
                // ReplaceStringKind: // REPLACE_STMT_RF
                CtIf IF2;
                if (diffEntry.dstNode instanceof CtIf) {
                    IF2 = (CtIf) diffEntry.dstNode;
                } else {
                    IF2 = diffEntry.dstNode.getParent(new TypeFilter<>(CtIf.class));
                }
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
                repair.oldRExpr = diffEntry.srcNode;
                repair.newRExpr = diffEntry.dstNode;
//                if (repair.oldRExpr instanceof CtExpression) {
//                    if (!(repair.oldRExpr instanceof CtAnnotation || repair.oldRExpr instanceof CtImport)) {
//                        while (!(repair.oldRExpr instanceof CtStatement)){
//                            repair.oldRExpr = repair.oldRExpr.getParent();
//                        }
//                    }
//                }
//                if (repair.newRExpr instanceof CtExpression) {
//                    if (!(repair.newRExpr instanceof CtAnnotation || repair.newRExpr instanceof CtImport)) {
//                        while (!(repair.newRExpr instanceof CtStatement)){
//                            repair.newRExpr = repair.newRExpr.getParent();
//                        }
//                    }
//                }
                // compare with others in obtainRepairCandidates()
                repair.isReplace = true;
                break;
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (operator.getKind()) { case PLUS: putValueFeature...` statement on enum type 'spoon.reflect.code.BinaryOperatorKind' misses cases: 'BITOR', 'BITXOR', 'BITAND', 'SL', 'SR', and 'USR'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (assignment.getKind()) { case PLUS: putValueFeatu...` statement on enum type 'spoon.reflect.code.BinaryOperatorKind' misses cases: 'OR', 'AND', 'BITOR', 'BITXOR', 'BITAND', ...
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (operator.getKind()) { case NOT: putValueFeature(...` statement on enum type 'spoon.reflect.code.UnaryOperatorKind' misses case 'COMPL'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
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

```

### EnumSwitchStatementWhichMissesCases
`switch (diffEntry.type) { case DeleteType: // kind // GuardKind: // INSE...` statement on enum type 'fr.inria.prophet4j.utility.Structure.DiffType' misses case 'PartialDeleteType'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
switch (diffEntry.type) {
            case DeleteType: // kind
                // GuardKind: // INSERT_GUARD_RF
                repair.kind = RepairKind.GuardKind;
                break;
            case InsertType: // kind
                // IfExitKind: // INSERT_CONTROL_RF
                // AddAndReplaceKind: // INSERT_STMT_RF
                if (diffEntry.dstNode instanceof CtIf) {
                    repair.kind = RepairKind.IfExitKind;
                } else {
                    repair.kind = RepairKind.AddAndReplaceKind;
                }
                // compare with others in obtainRepairCandidates()
                break;
            case UpdateType: // kind // oldRExpr // newRExpr
                // IfExitKind: // INSERT_CONTROL_RF
                // GuardKind: // INSERT_GUARD_RF
                // SpecialGuardKind: // INSERT_GUARD_RF
                // LoosenConditionKind: // REPLACE_COND_RF
                // TightenConditionKind: // REPLACE_COND_RF
                // ReplaceKind: // REPLACE_STMT_RF
                // ReplaceStringKind: // REPLACE_STMT_RF
                CtIf IF2;
                if (diffEntry.dstNode instanceof CtIf) {
                    IF2 = (CtIf) diffEntry.dstNode;
                } else {
                    IF2 = diffEntry.dstNode.getParent(new TypeFilter<>(CtIf.class));
                }
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
                repair.oldRExpr = diffEntry.srcNode;
                repair.newRExpr = diffEntry.dstNode;
//                if (repair.oldRExpr instanceof CtExpression) {
//                    if (!(repair.oldRExpr instanceof CtAnnotation || repair.oldRExpr instanceof CtImport)) {
//                        while (!(repair.oldRExpr instanceof CtStatement)){
//                            repair.oldRExpr = repair.oldRExpr.getParent();
//                        }
//                    }
//                }
//                if (repair.newRExpr instanceof CtExpression) {
//                    if (!(repair.newRExpr instanceof CtAnnotation || repair.newRExpr instanceof CtImport)) {
//                        while (!(repair.newRExpr instanceof CtStatement)){
//                            repair.newRExpr = repair.newRExpr.getParent();
//                        }
//                    }
//                }
                // compare with others in obtainRepairCandidates()
                repair.isReplace = true;
                break;
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (crossType) { case RF_CT: assert features.size() == 1; ...` statement on enum type 'fr.inria.prophet4j.feature.original.OriginalFeature.CrossType' misses cases: 'SRC', 'FORMER', and 'LATER'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureCross.java`
#### Snippet
```java
switch (crossType) {
            case RF_CT:
                assert features.size() == 1;
                assert features.get(0) instanceof RepairFeature;
                ordinal0 = ((RepairFeature) features.get(0)).ordinal();
                this.id = FEATURE_BASE_0 + ordinal0;
                break;
            case POS_AF_RF_CT:
                assert features.size() == 3;
                assert features.get(0) instanceof Position;
                assert features.get(1) instanceof AtomicFeature;
                assert features.get(2) instanceof RepairFeature;
                ordinal0 = ((Position) features.get(0)).ordinal();
                ordinal1 = ((AtomicFeature) features.get(1)).ordinal();
                ordinal2 = ((RepairFeature) features.get(2)).ordinal();
                this.id = FEATURE_BASE_1 + ordinal0 * AF_SIZE * RF_SIZE + ordinal1 * RF_SIZE + ordinal2;
                break;
            case POS_AF_AF_CT:
                assert features.size() == 3;
                assert features.get(0) instanceof Position;
                assert features.get(1) instanceof AtomicFeature;
                assert features.get(2) instanceof AtomicFeature;
                ordinal0 = ((Position) features.get(0)).ordinal();
                ordinal1 = ((AtomicFeature) features.get(1)).ordinal();
                ordinal2 = ((AtomicFeature) features.get(2)).ordinal();
                this.id = FEATURE_BASE_2 + ordinal0 * AF_SIZE * AF_SIZE + ordinal1 * AF_SIZE + ordinal2;
                break;
            case AF_VF_CT:
                assert features.size() == 2;
                assert features.get(0) instanceof AtomicFeature;
                assert features.get(1) instanceof ValueFeature;
                ordinal0 = ((AtomicFeature) features.get(0)).ordinal();
                ordinal1 = ((ValueFeature) features.get(1)).ordinal();
                this.id = FEATURE_BASE_3 + ordinal0 * VF_SIZE + ordinal1;
                break;
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (repair.kind) { case IfExitKind: // RepairFeature.INSERT_CONTROL_...` statement on enum type 'fr.inria.prophet4j.utility.Structure.RepairKind' misses cases: 'RemovePartialIFKind', 'RemoveSTMTKind', ...
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
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
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (repair.kind) { case IfExitKind: // RepairFeature.INSERT_CONTROL_...` statement on enum type 'fr.inria.prophet4j.utility.Structure.RepairKind' misses cases: 'RemovePartialIFKind', 'RemoveSTMTKind', ...
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
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
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (operator.getKind()) { case NOT: putValueFeature(...` statement on enum type 'spoon.reflect.code.UnaryOperatorKind' misses case 'COMPL'
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
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

```

### EnumSwitchStatementWhichMissesCases
`switch (operator.getKind()) { case PLUS: putValueFeature...` statement on enum type 'spoon.reflect.code.BinaryOperatorKind' misses cases: 'BITOR', 'BITXOR', 'BITAND', 'SL', 'SR', and 'USR'
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (assignment.getKind()) { case PLUS: putValueFeatu...` statement on enum type 'spoon.reflect.code.BinaryOperatorKind' misses cases: 'OR', 'AND', 'BITOR', 'BITXOR', 'BITAND', ...
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (assignment.getKind()) { case PLUS: putValueFeatu...` statement on enum type 'spoon.reflect.code.BinaryOperatorKind' misses cases: 'OR', 'AND', 'BITOR', 'BITXOR', 'BITAND', ...
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (operator.getKind()) { case PLUS: putValueFeature...` statement on enum type 'spoon.reflect.code.BinaryOperatorKind' misses cases: 'OR', 'AND', 'BITOR', 'BITXOR', 'BITAND', ...
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
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
```

### EnumSwitchStatementWhichMissesCases
`switch (operator.getKind()) { case POS: putValueFeature(...` statement on enum type 'spoon.reflect.code.UnaryOperatorKind' misses cases: 'NOT', and 'COMPL'
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
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
```

## RuleId[ruleID=StringEquality]
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

## RuleId[ruleID=WrapperTypeMayBePrimitive]
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

## RuleId[ruleID=UnnecessaryModifier]
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
	public void generateRevisionOutput(RevisionResult resultAllAnalyzed);

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
in `src/main/java/fr/inria/coming/core/entities/interfaces/IRevisionPair.java`
#### Snippet
```java
	public void setNextName(String name);

	public void setPreviousName(String previousName);

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
public interface IRevisionPair<T> {

	public T getPreviousVersion();

	public T getNextVersion();
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
	public String getPreviousName();

	public void setPreviousVersion(T previousContent);

	public void setNextVersion(T content);
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
	public void setPreviousVersion(T previousContent);

	public void setNextVersion(T content);

	public void setNextName(String name);
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
in `src/main/java/fr/inria/coming/core/entities/interfaces/RevisionOrder.java`
#### Snippet
```java
public interface RevisionOrder<T> extends ComingExtensionPoint {

	public Iterator<T> orderOfNavigation(RevisionDataset<T> data);

}
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
in `src/main/java/fr/inria/coming/core/entities/interfaces/RepositoryP.java`
#### Snippet
```java
	 * @return the list of the commit of the repo
	 */
	public List<Commit> history();

	
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
	public boolean containsJavaFile();

	public String getShortMessage();

	public String getFullMessage();
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
	public List<FileCommit> getFileCommits();

	public List<FileCommit> getJavaFileCommits();

	public List<FileCommit> getFileCommits(String extension);
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
	public String getName();

	public boolean containsJavaFile();

	public String getShortMessage();
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
	public String getRevDate();

	public List<String> getParents();

	public List<String> getBranches();
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

## RuleId[ruleID=ClassGetClass]
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

## RuleId[ruleID=EmptyStatementBody]
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

## RuleId[ruleID=UnnecessaryStringEscape]
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

## RuleId[ruleID=CStyleArrayDeclaration]
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

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=RegExpRedundantEscape]
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

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `this.diffOfFiles.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/core/entities/DiffResult.java`
#### Snippet
```java
	public String toString() {
		String r = "";
		for (String file : this.diffOfFiles.keySet()) {
			r += "\n" + ("-" + file);

```

### KeySetIterationMayUseEntrySet
Iteration over `sorted.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
		JsonArray frequencyArray = new JsonArray();
		root.add(key1, frequencyArray);
		for (Object key : sorted.keySet()) {
			Object v = sorted.get(key);
			JsonObject singlediff = new JsonObject();
```

### KeySetIterationMayUseEntrySet
Iteration over `this.command.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/utils/CommandSummary.java`
#### Snippet
```java
	public String[] flat() {
		List<String> values = new ArrayList<>();
		for (String key : this.command.keySet()) {
			values.add(key);
			String v = command.get(key);
```

### KeySetIterationMayUseEntrySet
Iteration over `rv.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/changeminer/entity/FinalResult.java`
#### Snippet
```java
			RevisionResult rv = this.get(revision);

			for (String processorName : rv.keySet()) {

				r += "\n" + processorName;
```

### KeySetIterationMayUseEntrySet
Iteration over `elementParents.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
			// Parent reification
			// Now, for each entity, let's find the entities that correspond to its parents.
			for (String idEntity : elementParents.keySet()) {
				PatternEntity entity = idEntities.get(idEntity);
				List<String> parents = elementParents.get(idEntity);
```

### KeySetIterationMayUseEntrySet
Iteration over `commonEntitiesByPattern.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/ChangePatternSpecification.java`
#### Snippet
```java
		}
		// For each entity
		for (PatternEntity sharedEntity : commonEntitiesByPattern.keySet()) {
			List<PatternAction> pl = commonEntitiesByPattern.get(sharedEntity);
			if (pl.size() > 1) {
```

### KeySetIterationMayUseEntrySet
Iteration over `matching.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
        List<ChangePatternInstance> instancesAllCombinations = new ArrayList<>();

        for (PatternAction pa : matching.keySet()) {

            List<ChangePatternInstance> temp = new ArrayList<>();
```

### KeySetIterationMayUseEntrySet
Iteration over `matching.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java

        ChangePatternInstance ins = new ChangePatternInstance(changePatternSpecification);
        for (PatternAction pa : matching.keySet()) {

            List<ChangePatternInstance> temp = new ArrayList<>();
```

### KeySetIterationMayUseEntrySet
Iteration over `information.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
		JsonObject generalStatsjson = new JsonObject();
		JSONParser parser = new JSONParser();
		for (String generalStat : information.keySet()) {
			Object vStat = information.get(generalStat);

```

### KeySetIterationMayUseEntrySet
Iteration over `matched.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java

		// Now, we analyze if all access were matched
		for (CtVariableAccess ctVariableAccess : matched.keySet()) {
			List<CtVariable> mapped = matched.get(ctVariableAccess);
			if (mapped.isEmpty()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `catalogs.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
            Map<String, Map<File, File>> catalogs = loadDataWithoutPatches(dataPath);
            int progressAll = catalogs.size(), progressNow = 0;
            for (String pathName : catalogs.keySet()) {
                Map<File, File> catalog = catalogs.get(pathName);
                for (File oldFile : catalog.keySet()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `catalog.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
            for (String pathName : catalogs.keySet()) {
                Map<File, File> catalog = catalogs.get(pathName);
                for (File oldFile : catalog.keySet()) {
                    try {
                        String tmpFileName = oldFile.getName().replace(".java", ".bin");
```

### KeySetIterationMayUseEntrySet
Iteration over `catalogs.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
            Map<String, Map<File, List<File>>> catalogs = loadDataWithPatches(dataPath);
            int progressAll = catalogs.size(), progressNow = 0;
            for (String pathName : catalogs.keySet()) {
                codeDiffer.setPathName(pathName);
                Map<File, List<File>> catalog = catalogs.get(pathName);
```

### KeySetIterationMayUseEntrySet
Iteration over `catalog.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                codeDiffer.setPathName(pathName);
                Map<File, List<File>> catalog = catalogs.get(pathName);
                for (File oldFile : catalog.keySet()) {
                    try {
                        String tmpFileName = oldFile.getName().replace(".java", ".bin");
```

### KeySetIterationMayUseEntrySet
Iteration over `dstMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java

        // VarCrossFeatureNum   = 3 * AtomFeatureNum * AtomFeatureNum   = 2700
        for (String key : dstMap.keySet()) {
            if (valueExprInfo.containsKey(key)) {
                CtElement E = valueExprInfo.get(key);
```

### KeySetIterationMayUseEntrySet
Iteration over `dstMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java

        // ValueCrossFeatureNum = AtomFeatureNum * ValueFeatureNum      = 360
        for (String key : dstMap.keySet()) {
            Set<AtomicFeature> atomicFeatures = dstMap.get(key);
            Set<ValueFeature> valueFeatures = getValueFeature(key, repair, valueExprInfo);
```

### KeySetIterationMayUseEntrySet
Iteration over `dstMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java

        // VarCrossFeatureNum   = 3 * AtomFeatureNum * AtomFeatureNum   = 2700
        for (String key : dstMap.keySet()) {
            // what is the meaning of this block ?
            if (valueExprInfo.containsKey(key)) {
```

### KeySetIterationMayUseEntrySet
Iteration over `srcMapC.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java

        // 3 * ValueFeatureNum * AtomFeatureNum
        for (String key : srcMapC.keySet()) {
            Set<AtomicFeature> atomicFeatures = srcMapC.get(key);
            Set<ValueFeature> valueFeatures = getValueFeature(key, repair, valueExprInfo);
```

### KeySetIterationMayUseEntrySet
Iteration over `srcMapF.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
            }
        }
        for (String key : srcMapF.keySet()) {
            Set<AtomicFeature> atomicFeatures = srcMapF.get(key);
            Set<ValueFeature> valueFeatures = getValueFeature(key, repair, valueExprInfo);
```

### KeySetIterationMayUseEntrySet
Iteration over `srcMapL.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
            }
        }
        for (String key : srcMapL.keySet()) {
            Set<AtomicFeature> atomicFeatures = srcMapL.get(key);
            Set<ValueFeature> valueFeatures = getValueFeature(key, repair, valueExprInfo);
```

### KeySetIterationMayUseEntrySet
Iteration over `dstMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java

        // ValueCrossFeatureNum = AtomFeatureNum * ValueFeatureNum      = 360
        for (String key : dstMap.keySet()) {
            Set<AtomicFeature> atomicFeatures = dstMap.get(key);
            Set<ValueFeature> valueFeatures = getValueFeature(key, repair, valueExprInfo);
```

### KeySetIterationMayUseEntrySet
Iteration over `dstMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java

        // VarCrossFeatureNum   = 3 * AtomFeatureNum * AtomFeatureNum   = 2700
        for (String key : dstMap.keySet()) {
            if (valueExprInfo.containsKey(key)) {
                CtElement E = valueExprInfo.get(key);
```

### KeySetIterationMayUseEntrySet
Iteration over `dstMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java

        // ValueCrossFeatureNum = AtomFeatureNum * ValueFeatureNum      = 360
        for (String key : dstMap.keySet()) {
            Set<AtomicFeature> atomicFeatures = dstMap.get(key);
            Set<ValueFeature> valueFeatures = getValueFeature(key, repair, valueExprInfo);
```

### KeySetIterationMayUseEntrySet
Iteration over `rankingFiles.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
        CodeDiffer codeDiffer = new CodeDiffer(false, option);
        Map<String, Map<File, Double>> scores4Files = new HashMap<>();
        for (String key : rankingFiles.keySet()) {
            if (!scores4Files.containsKey(key)) {
                scores4Files.put(key, new HashMap<>());
```

### KeySetIterationMayUseEntrySet
Iteration over `pairs.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
            }
            Map<File, File> pairs = rankingFiles.get(key);
            for (File buggyFile : pairs.keySet()) {
                File patchedFile = pairs.get(buggyFile);
                List<FeatureMatrix> featureMatrices = codeDiffer.runByGenerator(buggyFile, patchedFile);
```

### KeySetIterationMayUseEntrySet
Iteration over `files.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java

        Map<String, List<Double>> scores4Files = new HashMap<>();
        for (String key : files.keySet()) {
            if (!scores4Files.containsKey(key)) {
                scores4Files.put(key, new ArrayList<>());
```

### KeySetIterationMayUseEntrySet
Iteration over `scores4ForeFiles.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        // we only care rankings for ForeFiles
        Map<String, List<Fraction>> ranks4ForeFiles = new HashMap<>();
        for (String key : scores4ForeFiles.keySet()) {
            ranks4ForeFiles.put(key, new ArrayList<>());

```

### KeySetIterationMayUseEntrySet
Iteration over `ranks4ForeFiles.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java

        List<Ranking> rankings = new ArrayList<>();
        for (String key : ranks4ForeFiles.keySet()) {
            // mean
            double meanNumerator = 0;
```

### KeySetIterationMayUseEntrySet
Iteration over `srcMapC.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
		}
		// atomic and value features
		for (String key : srcMapC.keySet()) {
			Set<AtomicFeature> atomicFeatures = srcMapC.get(key);
			for (AtomicFeature af : atomicFeatures) {
```

### KeySetIterationMayUseEntrySet
Iteration over `srcMapF.keySet()` may be replaced with 'values()' iteration
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
		 */
		
		for (String key : srcMapF.keySet()) {
			Set<AtomicFeature> atomicFeatures = srcMapF.get(key);
			for (AtomicFeature af : atomicFeatures) {
```

### KeySetIterationMayUseEntrySet
Iteration over `srcMapL.keySet()` may be replaced with 'values()' iteration
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
		 */

		for (String key : srcMapL.keySet()) {
			Set<AtomicFeature> atomicFeatures = srcMapL.get(key);
			for (AtomicFeature af : atomicFeatures) {
```

### KeySetIterationMayUseEntrySet
Iteration over `dstMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java

        // VarCrossFeatureNum   = 3 * AtomFeatureNum * AtomFeatureNum   = 2700
        for (String key : dstMap.keySet()) {
            if (valueExprInfo.containsKey(key)) {
                CtElement E = valueExprInfo.get(key);
```

### KeySetIterationMayUseEntrySet
Iteration over `dstMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java

        // ValueCrossFeatureNum = AtomFeatureNum * ValueFeatureNum      = 360
        for (String key : dstMap.keySet()) {
            Set<AtomicFeature> atomicFeatures = dstMap.get(key);
            Set<ValueFeature> valueFeatures = getValueFeature(key, repair, valueExprInfo);
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`pi.getInstances().size() > 0` can be replaced with '!pi.getInstances().isEmpty()'
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java

		for (PatternInstancesFromDiff pi : result.getInfoPerDiff()) {
			if (pi.getInstances().size() > 0) {

				for (ChangePatternInstance instancePattern : pi.getInstances()) {
```

### SizeReplaceableByIsEmpty
`operations.size() > 0` can be replaced with '!operations.isEmpty()'
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
				}

				if (operations.size() > 0) {

					return diff;
```

### SizeReplaceableByIsEmpty
`diffResut.getDiffOfFiles().size()!=0` can be replaced with '!diffResut.getDiffOfFiles().isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		DiffResult diffResut = (DiffResult) resultFromDiffAnalysis;
		String filename = "";
		if (diffResut.getDiffOfFiles().size()!=0) {
			filename =  diffResut.getDiffOfFiles().keySet().iterator().next().toString();		
		}else {
```

### SizeReplaceableByIsEmpty
`diff.getRootOperations().size() == 0` can be replaced with 'diff.getRootOperations().isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java

			// Case: No diff detected, we return empty feature string
			if (diff.getRootOperations().size() == 0) {
				System.out.print("diff is null: " + previousVersion.getAbsolutePath());
				return features;
```

### SizeReplaceableByIsEmpty
`allConstant.size() > 0` can be replaced with '!allConstant.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
								.map(CtVariable.class::cast).collect(Collectors.toList());

			if (allConstant.size() > 0) {

				for (CtLiteral literalFormFaulty : allConstant) {
```

### SizeReplaceableByIsEmpty
`logicalOperatorLeft.size() == 0` can be replaced with 'logicalOperatorLeft.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
					  e -> e instanceof CtBinaryOperator && logicalOperator.contains(((CtBinaryOperator) e).getKind()));
			
			if(logicalOperatorLeft.size() == 0) {	
				if(scannotoperator(leftexpression))
					whethercontainnotoperator=true;
```

### SizeReplaceableByIsEmpty
`logicalOperatorRight.size() == 0` can be replaced with 'logicalOperatorRight.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
			}
				
			if(!whethercontainnotoperator && logicalOperatorRight.size() == 0)	{
				if(scannotoperator(rightexpression))
					whethercontainnotoperator=true;
```

### SizeReplaceableByIsEmpty
`varInductionCollected.size() > 0` can be replaced with '!varInductionCollected.isEmpty()'
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
		boolean removedInduction = varAccessCollected.removeAll(varInductionCollected);

		if (varInductionCollected.size() > 0 && !removedInduction)
			throw new IllegalAccessError("Var induction not removed");

```

### SizeReplaceableByIsEmpty
`varStaticAccessCollected.size() > 0` can be replaced with '!varStaticAccessCollected.isEmpty()'
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
		boolean removedStaticAccess = varAccessCollected.removeAll(varStaticAccessCollected);

		if (varStaticAccessCollected.size() > 0 && !removedStaticAccess)
			throw new IllegalAccessError("Var static access not removed");

```

### SizeReplaceableByIsEmpty
`varsConf.size() > 0` can be replaced with '!varsConf.isEmpty()'
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
				}
			}
			if (varsConf.size() > 0) {
				mappingConflicts.put(inductionVar, varsConf);
			}
```

### SizeReplaceableByIsEmpty
`pi.getInstances().size() > 0` can be replaced with '!pi.getInstances().isEmpty()'
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
		result = (PatternInstancesFromRevision) revisionResult.getResultFromClass(RepairabilityAnalyzer.class);
		for (PatternInstancesFromDiff pi : result.getInfoPerDiff()) {
			if (pi.getInstances().size() > 0) {

				Diff diff = pi.getDiff();
```

### SizeReplaceableByIsEmpty
`superInterfaces.size() > 0` can be replaced with '!superInterfaces.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
						S18Insynchronizedmethod = true;

					if (superInterfaces.size() > 0) {
						for (CtTypeReference specificreference : superInterfaces) {
							if (specificreference != null
```

### SizeReplaceableByIsEmpty
`parentMethod.getThrownTypes().size() > 0` can be replaced with '!parentMethod.getThrownTypes().isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
				if (parentMethod != null) {
					// Exception
					context.put(CodeFeatures.S6_METHOD_THROWS_EXCEPTION, parentMethod.getThrownTypes().size() > 0);
				}

```

### SizeReplaceableByIsEmpty
`superInterfaces.size() > 0` can be replaced with '!superInterfaces.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
						s11ExceptionType = true;

					if (superInterfaces.size() > 0) {
						for (CtTypeReference specificreference : superInterfaces) {
							if (specificreference != null
```

### SizeReplaceableByIsEmpty
`featureMatrices.size() == 0` can be replaced with 'featureMatrices.isEmpty()'
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                            List<FeatureMatrix> featureMatrices = codeDiffer.runByGenerator(oldFile, catalog.get(oldFile));
                            // we should have more than one FeatureMatrix when CodeDiffer's "byGenerator" is true
                            if (featureMatrices.size() == 0) {
                                continue;
                            }
```

### SizeReplaceableByIsEmpty
`featureMatrices.get(0).getFeatureVectors().size() == 0` can be replaced with 'featureMatrices.get(0).getFeatureVectors().isEmpty()'
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                                continue;
                            }
                            if (featureMatrices.get(0).getFeatureVectors().size() == 0) {
                                // diff.commonAncestor() returns null value
                                continue;
```

### SizeReplaceableByIsEmpty
`featureMatrices.size() == 0` can be replaced with 'featureMatrices.isEmpty()'
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                        if (!vectorFile.exists()) {
                            List<FeatureMatrix> featureMatrices = codeDiffer.runByPatches(oldFile, catalog.get(oldFile));
                            if (featureMatrices.size() == 0) {
                                // diff.commonAncestor() returns null value
                                continue;
```

### SizeReplaceableByIsEmpty
`paths.size() > 0` can be replaced with '!paths.isEmpty()'
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java

        ArrayList<String> getPaths(String commitName) {
            return paths.size() > 0 ? paths.get(commitName) : new ArrayList<>();
        }
    }
```

### SizeReplaceableByIsEmpty
`diffList.size() == 0` can be replaced with 'diffList.isEmpty()'
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
//                setPathFilter(FollowFilter.create(path, diffConfig)).
        call();
        if (diffList.size() == 0)
            return null;
        if (diffList.size() > 1)
```

### SizeReplaceableByIsEmpty
`featureMatrices.size() == 0` can be replaced with 'featureMatrices.isEmpty()'
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
                List<FeatureMatrix> featureMatrices = codeDiffer.runByGenerator(oldFile, newFile);
                // we should have more than one FeatureMatrix when CodeDiffer's "byGenerator" is true
                if (featureMatrices.size() == 0) {
                    continue;
                }
```

### SizeReplaceableByIsEmpty
`featureMatrices.get(0).getFeatureVectors().size() == 0` can be replaced with 'featureMatrices.get(0).getFeatureVectors().isEmpty()'
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
                    continue;
                }
                if (featureMatrices.get(0).getFeatureVectors().size() == 0) {
                    // diff.commonAncestor() returns null value
                    progressNow += 1;
```

### SizeReplaceableByIsEmpty
`ctReturns.size() > 0` can be replaced with '!ctReturns.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4RORepairGenerator.java`
#### Snippet
```java
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
            if (ctReturns.size() > 0) {
                returnType = ctReturns.get(0).getClass().getGenericSuperclass();
            }
```

### SizeReplaceableByIsEmpty
`oldStr.length() > 0` can be replaced with '!oldStr.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
```

### SizeReplaceableByIsEmpty
`newStr.length() > 0` can be replaced with '!newStr.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
```

### SizeReplaceableByIsEmpty
`((CtExecutableReference) E).getParameters().size() > 0` can be replaced with '!((CtExecutableReference) E).getParameters().isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
        } else if (E instanceof CtExecutableReference){
            // just make CALLEE_AF be meaningful
            if (((CtExecutableReference) E).getParameters().size() > 0){
                valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
            }
```

### SizeReplaceableByIsEmpty
`E.getElements(new TypeFilter<>(CtField.class)).size() > 0` can be replaced with '!E.getElements(new TypeFilter\<\>(CtField.class)).isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
        if (valueStr.contains("length") || valueStr.contains("size"))
            valueFeatures.add(ValueFeature.SIZE_LITERAL_VF);
        if (E.getElements(new TypeFilter<>(CtField.class)).size() > 0)
            valueFeatures.add(ValueFeature.MEMBER_VF);
        if (E instanceof CtLiteral) {
```

### SizeReplaceableByIsEmpty
`ctReturns.size() > 0` can be replaced with '!ctReturns.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedRepairGenerator.java`
#### Snippet
```java
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
            if (ctReturns.size() > 0) {
                returnType = ctReturns.get(0).getClass().getGenericSuperclass();
            }
```

### SizeReplaceableByIsEmpty
`binOps.size()==0` can be replaced with 'binOps.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					}
					
					if(binOps.size()==0)
						atomicboolexperssions.add(logicalexpression);
					
```

### SizeReplaceableByIsEmpty
`invocationtypes.size()>0` can be replaced with '!invocationtypes.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			writeGroupedInfo(context, "logical_expression_"+Integer.toString(logicalindex)+"_"+logicalexpression, 
					CodeFeatures.LE10_CONTAINS_ALL_INVOCATION_COMPARISION_VARIABLE,
					invocationtypes.size()>0 && variableaccess.size()>0 &&
					comparisiontypes.size()>0, "FEATURES_LOGICAL_EXPRESSION");
		}
```

### SizeReplaceableByIsEmpty
`variableaccess.size()>0` can be replaced with '!variableaccess.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			writeGroupedInfo(context, "logical_expression_"+Integer.toString(logicalindex)+"_"+logicalexpression, 
					CodeFeatures.LE10_CONTAINS_ALL_INVOCATION_COMPARISION_VARIABLE,
					invocationtypes.size()>0 && variableaccess.size()>0 &&
					comparisiontypes.size()>0, "FEATURES_LOGICAL_EXPRESSION");
		}
```

### SizeReplaceableByIsEmpty
`comparisiontypes.size()>0` can be replaced with '!comparisiontypes.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
					CodeFeatures.LE10_CONTAINS_ALL_INVOCATION_COMPARISION_VARIABLE,
					invocationtypes.size()>0 && variableaccess.size()>0 &&
					comparisiontypes.size()>0, "FEATURES_LOGICAL_EXPRESSION");
		}
}
```

### SizeReplaceableByIsEmpty
`ctReturns.size() > 0` can be replaced with '!ctReturns.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedRepairGenerator.java`
#### Snippet
```java
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
            if (ctReturns.size() > 0) {
                returnType = ctReturns.get(0).getClass().getGenericSuperclass();
            }
```

### SizeReplaceableByIsEmpty
`oldStr.length() > 0` can be replaced with '!oldStr.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
```

### SizeReplaceableByIsEmpty
`newStr.length() > 0` can be replaced with '!newStr.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
```

### SizeReplaceableByIsEmpty
`((CtExecutableReference) E).getParameters().size() > 0` can be replaced with '!((CtExecutableReference) E).getParameters().isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
        } else if (E instanceof CtExecutableReference){
            // just make CALLEE_AF be meaningful
            if (((CtExecutableReference) E).getParameters().size() > 0){
                valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
            }
```

### SizeReplaceableByIsEmpty
`E.getElements(new TypeFilter<>(CtField.class)).size() > 0` can be replaced with '!E.getElements(new TypeFilter\<\>(CtField.class)).isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
        if (valueStr.contains("equals"))
            valueFeatures.add(ValueFeature.LI_EQUALS_VF);
        if (E.getElements(new TypeFilter<>(CtField.class)).size() > 0)
            valueFeatures.add(ValueFeature.MEMBER_VF);
        if (E instanceof CtLiteral) {
```

### SizeReplaceableByIsEmpty
`oldStr.length() > 0` can be replaced with '!oldStr.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
```

### SizeReplaceableByIsEmpty
`newStr.length() > 0` can be replaced with '!newStr.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
```

### SizeReplaceableByIsEmpty
`((CtExecutableReference) E).getParameters().size() > 0` can be replaced with '!((CtExecutableReference) E).getParameters().isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
        } else if (E instanceof CtExecutableReference){
            // just make CALLEE_AF be meaningful
            if (((CtExecutableReference) E).getParameters().size() > 0){
                valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
            }
```

### SizeReplaceableByIsEmpty
`E.getElements(new TypeFilter<>(CtField.class)).size() > 0` can be replaced with '!E.getElements(new TypeFilter\<\>(CtField.class)).isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
        if (valueStr.contains("equals"))
            valueFeatures.add(ValueFeature.LI_EQUALS_VF);
        if (E.getElements(new TypeFilter<>(CtField.class)).size() > 0)
            valueFeatures.add(ValueFeature.MEMBER_VF);
        if (E instanceof CtLiteral) {
```

### SizeReplaceableByIsEmpty
`thenstatements.size() > 0` can be replaced with '!thenstatements.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		if (thenBlock != null) {
			List<CtStatement> thenstatements = thenBlock.getStatements();
			if (thenstatements.size() > 0 && thenstatements.get(0) == targetstatement)
				return true;
		}
```

### SizeReplaceableByIsEmpty
`elsestatements.size() > 0` can be replaced with '!elsestatements.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		if (elseBlock != null) {
			List<CtStatement> elsestatements = elseBlock.getStatements();
			if (elsestatements.size() > 0 && elsestatements.get(0) == targetstatement)
				return true;
		}
```

### SizeReplaceableByIsEmpty
`binOp.size() > 0` can be replaced with '!binOp.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		if (condition != null) {
			List<CtBinaryOperator> binOp = condition.getElements(new TypeFilter<>(CtBinaryOperator.class));
			if (binOp != null && binOp.size() > 0) {

				for (CtBinaryOperator ctBinaryOperator : binOp) {
```

### SizeReplaceableByIsEmpty
`binOp.size() > 0` can be replaced with '!binOp.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		if (condition != null) {
			List<CtBinaryOperator> binOp = condition.getElements(new TypeFilter<>(CtBinaryOperator.class));
			if (binOp != null && binOp.size() > 0) {

				for (CtBinaryOperator ctBinaryOperator : binOp) {
```

### SizeReplaceableByIsEmpty
`trystatements.size() > 0` can be replaced with '!trystatements.isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
			List<CtStatement> trystatements = tryblock.getStatements();
			// if(trystatements.size()>0 && trystatements.get(0)==targetstatement)
			if (trystatements.size() > 0)
				return true;
		}
```

### SizeReplaceableByIsEmpty
`ctReturns.size() > 0` can be replaced with '!ctReturns.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalRepairGenerator.java`
#### Snippet
```java
//            Type returnType = ctReturn.getClass().getGenericSuperclass();
            List<CtReturn> ctReturns = lastStatement.getElements(new TypeFilter<>(CtReturn.class));
            if (ctReturns.size() > 0) {
                returnType = ctReturns.get(0).getClass().getGenericSuperclass();
            }
```

### SizeReplaceableByIsEmpty
`scores4Files.get(key).size() == 0` can be replaced with 'scores4Files.get(key).isEmpty()'
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
                }
            }
            if (scores4Files.get(key).size() == 0) {
                scores4Files.remove(key);
            }
```

### SizeReplaceableByIsEmpty
`oldStr.length() > 0` can be replaced with '!oldStr.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
```

### SizeReplaceableByIsEmpty
`newStr.length() > 0` can be replaced with '!newStr.isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.MODIFIED_VF);
            // I can not figure out the meaning of MODIFIED_SIMILAR_VF
            if (oldStr.length() > 0 && newStr.length() > 0) {
                double ratio = ((double)oldStr.length()) / newStr.length();
                if (ratio > 0.5 && ratio < 2 && oldStr.length() > 3 && newStr.length() > 3)
```

### SizeReplaceableByIsEmpty
`((CtExecutableReference) E).getParameters().size() > 0` can be replaced with '!((CtExecutableReference) E).getParameters().isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
        } else if (E instanceof CtExecutableReference){
            // just make CALLEE_AF be meaningful
            if (((CtExecutableReference) E).getParameters().size() > 0){
                valueFeatures.add(ValueFeature.LOCAL_VARIABLE_VF);
            }
```

### SizeReplaceableByIsEmpty
`E.getElements(new TypeFilter<>(CtField.class)).size() > 0` can be replaced with '!E.getElements(new TypeFilter\<\>(CtField.class)).isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
        if (valueStr.contains("length") || valueStr.contains("size"))
            valueFeatures.add(ValueFeature.SIZE_LITERAL_VF);
        if (E.getElements(new TypeFilter<>(CtField.class)).size() > 0)
            valueFeatures.add(ValueFeature.MEMBER_VF);
        if (E instanceof CtLiteral) {
```

## RuleId[ruleID=UnnecessaryReturn]
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

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `accepted &= iFilter.accept(element)`
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
        for (IFilter iFilter : this.getFilters()) {

            accepted &= iFilter.accept(element);
        }
        return accepted;
```

## RuleId[ruleID=TrivialStringConcatenation]
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

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends FileCommit`
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java
	}

	public List<FileCommit> filter(List<FileCommit> files, String extension) {
		List<FileCommit> javaFiles = new ArrayList<FileCommit>();

```

### BoundedWildcard
Can generalize to `? extends FeatureMatrix`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
	

	public JsonObject getSimleP4JJSON(Option option, File target, List<FeatureMatrix> featureMatrix, Boolean numericalIndixator) {
		
	        JsonObject jsonfile = new JsonObject();
```

### BoundedWildcard
Can generalize to `? extends FeatureMatrix`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
	
	
	 public JsonObject genVectorsCSV(Option option, File patchedFile, List<FeatureMatrix> featureMatrices) {
		 
		 	String[] pathStr = patchedFile.getAbsolutePath().split("/");
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
	}
		
	public JsonObject extractFeatures(Map<String, File> filePaths) {
		File src = filePaths.get("src");
		File target = filePaths.get("target");
```

### BoundedWildcard
Can generalize to `? extends PatternAction`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java

    public List<ChangePatternInstance> allCombinations(ChangePatternSpecification changePatternSpecification,
                                                       MapList<PatternAction, MatchingAction> matching) {

        List<ChangePatternInstance> instancesAllCombinations = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends PatternAction`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
     */
    private List<ChangePatternInstance> singleInstance(ChangePatternSpecification changePatternSpecification,
                                                       MapList<PatternAction, MatchingAction> matching) {
        List<ChangePatternInstance> instancesAllCombinations = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
	
	private void analyzeC1_Constant(CtElement element, Cntx<Object> context, CtClass parentClass,
			List<CtVariable> varsInScope, List<CtVariableAccess> varsAffected, List<CtLiteral> literalsFromFaultyLine) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtLiteral`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
	
	private void analyzeC1_Constant(CtElement element, Cntx<Object> context, CtClass parentClass,
			List<CtVariable> varsInScope, List<CtVariableAccess> varsAffected, List<CtLiteral> literalsFromFaultyLine) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends Diff`
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
	}

	public static JsonObject computeJSonOfRev(IRevision rev, DiffResult<IRevision, Diff> result,
			Map<String, VulInstance> vtypes) {

```

### BoundedWildcard
Can generalize to `? extends VulInstance`
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java

	public static JsonObject computeJSonOfRev(IRevision rev, DiffResult<IRevision, Diff> result,
			Map<String, VulInstance> vtypes) {

		JsonObject rootRevision = new JsonObject();
```

### BoundedWildcard
Can generalize to `? extends CtTypeAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/TypeaccessAnalyzer.java`
#### Snippet
```java
	
	private void analyzeC3C4_SimilarTypeAccessActualVar(CtElement element, Cntx<Object> context, 
			List<CtTypeAccess> typeaccessaaffected, CtClass parentClass) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected static List<CtVariable> compatiblesSubType(List<CtVariable> varContext, CtTypeReference typeToFind) {

		List<CtVariable> result = new ArrayList<CtVariable>();
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 */
	public static List<CtVariableAccess> retriveVariablesOutOfContext(List<CtVariable> varContext,
			List<CtVariableAccess> variablesToChech) {
		List<CtVariableAccess> variablesOutOfScope = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 */
	public static List<CtVariableAccess> collectInductionVariableAccess(CtElement ingredientRootElement,
			List<CtVariableAccess> varAccessCollected) {

		List<CtVariableAccess> induction = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	}

	public static List<CtVariableAccess> checkMapping(Map<CtVariableAccess, List<CtVariable>> matched) {
		List<CtVariableAccess> notMapped = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	}

	public static List<CtVariableAccess> checkMapping(Map<CtVariableAccess, List<CtVariable>> matched) {
		List<CtVariableAccess> notMapped = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @return
	 */
	public static Map<CtVariableAccess, List<CtVariable>> searchVarNameConflicts(List<CtVariable> varsFromContext,
			List<CtVariableAccess> varInductionCollected) {

```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 */
	public static Map<CtVariableAccess, List<CtVariable>> searchVarNameConflicts(List<CtVariable> varsFromContext,
			List<CtVariableAccess> varInductionCollected) {

		Map<CtVariableAccess, List<CtVariable>> mappingConflicts = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java

	public static List<CtVariableAccess> collectStaticVariableAccess(CtElement rootElement,
			List<CtVariableAccess> varAccessCollected) {
		List<CtVariableAccess> statics = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 */
	public static Map<CtVariableAccess, List<CtVariable>> matchVars(List<CtVariable> varContext,
			List<CtVariableAccess> varacc, boolean mapName) {

		Map<CtVariableAccess, List<CtVariable>> mapping = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 * @return
	 */
	public static List<CtVariable> existVariableWithName(List<CtVariable> varContext, String wordFromCluster) {
		List<CtVariable> founds = new ArrayList<>();
		for (CtVariable ctVariable : varContext) {
```

### BoundedWildcard
Can generalize to `? extends ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/RepairabilityAnalyzer.java`
#### Snippet
```java
    }

    private List<ChangePatternInstance> filterResult(List<ChangePatternInstance> patternInstanceList, Diff diff) {
        List<ChangePatternInstance> res = new ArrayList<>();
        Map<String, List> toolToInstances = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeExpressionFeatures(List<CtExpression> expressionsToStudy, CtElement originalElement, Cntx<Object> context,
			CtClass parentClass, List<CtStatement> allstatementsinclass, List<CtVariable> varsInScope, 
			List allMethodsFromClass, List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
	
	private void analyzeCon1_ConstructorOverload(CtElement element, Cntx<Object> context, CtClass parentClass,
			 List<CtConstructorCall> constructorcalls) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
   
   private void analyzeCon2_ConstructorSimilar(CtElement element, Cntx<Object> context, CtClass parentClass,
			 List<CtConstructorCall> constructorcalls) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeVarConstructorArgumentPrimitive (List<CtConstructorCall> constructorsaffected, Cntx<Object> context) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeWhetherConstructorWraptedCon3 (List<CtConstructorCall> constructorsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
	
	private void analyzeWhetherConstructorWraptedCon3 (List<CtConstructorCall> constructorsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
	
	private void analyzeWhetherConstructorWraptedCon3 (List<CtConstructorCall> constructorsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeWhetherConstructorreturnprimitive (List<CtConstructorCall> constructorsaffected, Cntx<Object> context) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
	
	private void analyzeConstructorFeature_Extend (CtElement originalElement, Cntx<Object> context,
		CtClass parentClass, List<CtConstructorCall> allconstructorcallsFromClass, List<CtConstructorCall> constructorcallstostudy) {
		
		List<CtInvocation> emptyinvocationfromclass = new ArrayList<CtInvocation>();
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeWhetherConstructorOftheclass (List<CtConstructorCall> constructorsaffected, Cntx<Object> context,
			CtClass parentclss) {
		
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	}

	private void analyzeFeature_ExtendFromVar(Cntx<Object> context, List<CtVariableAccess> varsAffected) {

		boolean S1_LOCAL_VAR_NOT_USED = false;
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	}

	private void analyzeFeature_ExtendFromMethod(Cntx<Object> context, List<CtInvocation> invocations,
			List<CtConstructorCall> constructorcalls) {

```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

	private void analyzeFeature_ExtendFromMethod(Cntx<Object> context, List<CtInvocation> invocations,
			List<CtConstructorCall> constructorcalls) {

		boolean S9_METHOD_CALL_WITH_NORMAL_GUARD = false;
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

	private void analyzeS15_HasObjectiveInvocations(CtElement element, Cntx<Object> context, CtClass parentClass,
			List<CtInvocation> invocationstostudy) {

		try {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

	private void analyzeS16_HasInvocationsPronetoException(CtElement element, Cntx<Object> context,
			List<CtInvocation> invocationstostudy, List<CtConstructorCall> constructorcalls) {

		try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

	private void analyzeS16_HasInvocationsPronetoException(CtElement element, Cntx<Object> context,
			List<CtInvocation> invocationstostudy, List<CtConstructorCall> constructorcalls) {

		try {
```

### BoundedWildcard
Can generalize to `? super ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
    private void updateSelectedInstances
            (
                    Map<ChangePatternInstance, Set> instanceToCoveredNodes,
                    List<ChangePatternInstance> ret,
                    ChangePatternInstance instance,
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
                    List<ChangePatternInstance> ret,
                    ChangePatternInstance instance,
                    List<CtElement> changedNodes,
                    Diff diff
            ) {
```

### BoundedWildcard
Can generalize to `? extends ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
    // DEL_MOV/INS might add instances that are already added by other patterns. They should be filtered.
    @Override
    public List<ChangePatternInstance> filterSelectedInstances(List<ChangePatternInstance> lst, Diff diff) {
        Map<ChangePatternInstance, Set> instanceToCoveredNodes = new HashMap<>();
        List<ChangePatternInstance> ret = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
	}

	protected boolean coveredByInstanceNodes(Set<CtElement> instanceCoveredNodes, CtElement node) {
		List<CtElement> pathToDiffRoot = ASTInfoResolver.getPathToRootNode(node);
		for (CtElement element : pathToDiffRoot) {
```

### BoundedWildcard
Can generalize to `? super ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/JGenProg.java`
#### Snippet
```java
    private void updateSelectedInstances
            (
                    Map<ChangePatternInstance, Set> instanceToCoveredNodes,
                    List<ChangePatternInstance> ret,
                    ChangePatternInstance instance,
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/repairability/repairtools/JGenProg.java`
#### Snippet
```java
                    List<ChangePatternInstance> ret,
                    ChangePatternInstance instance,
                    Collection<CtElement> changedNodes,
                    Diff diff
            ) {
```

### BoundedWildcard
Can generalize to `? extends ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/JGenProg.java`
#### Snippet
```java

    @Override
    public List<ChangePatternInstance> filterSelectedInstances(List<ChangePatternInstance> lst, Diff diff) {
        Map<ChangePatternInstance, Set> instanceToCoveredNodes = new HashMap<>();
        List<ChangePatternInstance> ret = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java

	@Override
	public List<ChangePatternInstance> filterSelectedInstances(List<ChangePatternInstance> lst, Diff diff) {
		Map<ChangePatternInstance, Set> instanceToCoveredNodes = new HashMap<>();
		List<ChangePatternInstance> ret = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
	}

	private void updateSelectedInstances(Map<ChangePatternInstance, Set> instanceToCoveredNodes,
			List<ChangePatternInstance> ret, ChangePatternInstance instance, Collection<CtElement> changedNodes,
			Diff diff) {
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java

	private void updateSelectedInstances(Map<ChangePatternInstance, Set> instanceToCoveredNodes,
			List<ChangePatternInstance> ret, ChangePatternInstance instance, Collection<CtElement> changedNodes,
			Diff diff) {
		boolean addedBefore = false;
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
    protected boolean coveredByInstanceNodes
            (
                    Set<CtElement> instanceCoveredNodes,
                    CtElement node
            ) {
```

### BoundedWildcard
Can generalize to `? super ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
	}

	private void updateSelectedInstances(Map<ChangePatternInstance, Set> instanceToCoveredNodes,
			List<ChangePatternInstance> ret, ChangePatternInstance instance, Collection<CtElement> changedNodes,
			Diff diff) {
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java

	private void updateSelectedInstances(Map<ChangePatternInstance, Set> instanceToCoveredNodes,
			List<ChangePatternInstance> ret, ChangePatternInstance instance, Collection<CtElement> changedNodes,
			Diff diff) {
		boolean addedBefore = false;
```

### BoundedWildcard
Can generalize to `? extends ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java

	@Override
	public List<ChangePatternInstance> filterSelectedInstances(List<ChangePatternInstance> lst, Diff diff) {
		Map<ChangePatternInstance, Set> instanceToCoveredNodes = new HashMap<>();
		List<ChangePatternInstance> ret = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
	}

	private void updateSelectedInstances(Map<ChangePatternInstance, Set> instanceToCoveredNodes,
			List<ChangePatternInstance> ret, ChangePatternInstance instance, Collection<CtElement> changedNodes,
			Diff diff) {
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java

	private void updateSelectedInstances(Map<ChangePatternInstance, Set> instanceToCoveredNodes,
			List<ChangePatternInstance> ret, ChangePatternInstance instance, Collection<CtElement> changedNodes,
			Diff diff) {
		boolean addedBefore = false;
```

### BoundedWildcard
Can generalize to `? extends ChangePatternInstance`
in `src/main/java/fr/inria/coming/repairability/repairtools/Elixir.java`
#### Snippet
```java
	}

	private void filterAndAddSelectedInstancesOfPattern(List<ChangePatternInstance> lst, Diff diff,
			Map<ChangePatternInstance, Set> instanceToCoveredNodes, List<ChangePatternInstance> ret, String pattern) {
		for (ChangePatternInstance instance : lst) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();

    public S4ROFeatureVisitor(Map<String, CtElement> valueExprInfo) {
        this.valueExprInfo = valueExprInfo;
    }
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();

    public S4ROFeatureVisitor(Map<String, CtElement> valueExprInfo) {
        this.valueExprInfo = valueExprInfo;
    }
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
    }

    private EnumSet<ValueFeature> getValueFeature(final String valueStr, final Repair repair, Map<String, CtElement> valueExprInfo) {
        EnumSet<ValueFeature> valueFeatures = EnumSet.noneOf(ValueFeature.class);
        if (repair.oldRExpr != null && repair.newRExpr != null) {
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
    }

    private void getNearbyStmts(Repair repair, List<CtElement> stmtsF, List<CtElement> stmtsL) {
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
    }

    private void getNearbyStmts(Repair repair, List<CtElement> stmtsF, List<CtElement> stmtsL) {
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
		
		private void analyzV11_ConditionWithCompatibleTypes (List<CtVariableAccess> varsAffected, List<CtVariable> varsInScope,
				CtElement element, Cntx<Object> context) {
			
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
		
		private void analyzeV17_IsEnum (List<CtVariableAccess> varsAffected, Cntx<Object> context, CtClass parentClass) {
			try {
				
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void analyzeV8_TypesVarsAffected(List<CtVariableAccess> varsAffected, CtElement element,
			Cntx<Object> context) {
		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
		
		private void analyzeV14_VarInstanceOfClass (List<CtVariableAccess> varsAffected, Cntx<Object> context,
				CtClass parentClass) {
			
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param context
	 */
	private void analyzeV2_AffectedDistanceVarName(List<CtVariableAccess> varsAffected, List<CtVariable> varsInScope,
			CtElement element, Cntx<Object> context) {
		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param context
	 */
	private void analyzeV2_AffectedDistanceVarName(List<CtVariableAccess> varsAffected, List<CtVariable> varsInScope,
			CtElement element, Cntx<Object> context) {
		try {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	}
	
	public CtInvocation checkInvocationWithReturnCompatibleType(List<CtInvocation> invocationsFromClass,
			CtTypeReference type, CtClass parentclass) {
		
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeV19_VarWithSpecialName (List<CtVariableAccess> varsAffected, Cntx<Object> context) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeV18_HasMethodSimilarInName (List<CtVariableAccess> varsAffected, Cntx<Object> context, 
			List<CtInvocation> invocationsFromClass, List allMethodsFromClass, 
			List<CtConstructorCall> allconstructorcallsFromClass, CtClass parentClass) {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	
	private void analyzeV18_HasMethodSimilarInName (List<CtVariableAccess> varsAffected, Cntx<Object> context, 
			List<CtInvocation> invocationsFromClass, List allMethodsFromClass, 
			List<CtConstructorCall> allconstructorcallsFromClass, CtClass parentClass) {
		
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	private void analyzeV18_HasMethodSimilarInName (List<CtVariableAccess> varsAffected, Cntx<Object> context, 
			List<CtInvocation> invocationsFromClass, List allMethodsFromClass, 
			List<CtConstructorCall> allconstructorcallsFromClass, CtClass parentClass) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
		
		private void analyzeV15_LastthreeVariableIntroduction (List<CtVariableAccess> varsAffected, CtElement element,
				Cntx<Object> context) {
			try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
		
		private void analyzeV1213_ReplaceVarGetAnotherInvocation (List<CtVariableAccess> varsAffected, Cntx<Object> context,
				List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
			
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		
		private void analyzeV1213_ReplaceVarGetAnotherInvocation (List<CtVariableAccess> varsAffected, Cntx<Object> context,
				List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
			
			try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		
		private void analyzeV1213_ReplaceVarGetAnotherInvocation (List<CtVariableAccess> varsAffected, Cntx<Object> context,
				List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
			
			try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	
	private void analyzeV9_VarSimilarLiteral(CtElement element, Cntx<Object> context, CtClass parentClass,
			List<CtVariableAccess> varsAffected) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 */
	@SuppressWarnings("rawtypes")
	private void analyzeV5_AffectedVariablesInTransformation(List<CtVariableAccess> varsAffected, CtElement element,
			Cntx<Object> context) {
		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param context
	 */
	private void analyzeV4(List<CtVariableAccess> varsAffected, CtElement element, Cntx<Object> context) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param context
	 */
	private void analyzeV3_AffectedHasConstant(List<CtVariableAccess> varsAffected, CtElement element,
			Cntx<Object> context) {
		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
	  
		private void analyzV10_AffectedWithCompatibleTypes(List<CtVariableAccess> varsAffected, List<CtVariable> varsInScope,
				CtElement element, Cntx<Object> context) {
			try {
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
	  
		private void analyzV10_AffectedWithCompatibleTypes(List<CtVariableAccess> varsAffected, List<CtVariable> varsInScope,
				CtElement element, Cntx<Object> context) {
			try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	 * @param context
	 */
	private void analyzeV1_V6_V16(List<CtVariableAccess> varsAffected, CtElement element, Cntx<Object> context,
			List allMethods, List<CtInvocation> invocationsFromClass, CtClass parentclass) {
		
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
		
		private int[] argumentDiff(List<CtElement> argumentsoriginal, List<CtElement> argumentsother, CtVariableAccess varaccess) {
			
			int numberdiffargument =0;
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
		
		private int[] argumentDiff(List<CtElement> argumentsoriginal, List<CtElement> argumentsother, CtVariableAccess varaccess) {
			
			int numberdiffargument =0;
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeFeature_Extend(List<CtVariableAccess> varsAffected, CtElement originalElement, Cntx<Object> context,
			CtClass parentClass, List<CtStatement> allstatementsinclass ) {

```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
    
    private void analyzeM67_ReplaceVarGetAnotherInvocation (List<CtInvocation> invocationsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
    
    private void analyzeM67_ReplaceVarGetAnotherInvocation (List<CtInvocation> invocationsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
    
    private void analyzeM67_ReplaceVarGetAnotherInvocation (List<CtInvocation> invocationsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeFeature_ExtendFromVar (Cntx<Object> context, List<CtInvocation> invocations) {
		
        for(CtInvocation invocationAffected : invocations) {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
    
    private void analyzeM5(CtElement element, Cntx<Object> context, List<CtInvocation> invocations,
			List<CtVariable> varsInScope) {
		
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
    
    private void analyzeM5(CtElement element, Cntx<Object> context, List<CtInvocation> invocations,
			List<CtVariable> varsInScope) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtTypeReference`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
	
   private boolean whetherhasprimitive(List<CtTypeReference> inferredtypes) {
		
		for (int index=0; index<inferredtypes.size(); index++) {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	
	private void analyzeM1_eM2_M3_M4_M8_M9SimilarMethod(CtElement element, Cntx<Object> context, CtClass parentClass,
			List allMethodsFromClass, List<CtInvocation> invocations) {
		try {
			// m1: For each method invocation, whether the method has overloaded method
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	
	private void analyzeMethodFeature_Extend (CtElement originalElement, Cntx<Object> context,
			CtClass parentClass, List<CtInvocation> invocationsFromClass, List<CtInvocation> invocations) {
		
		List<CtConstructorCall> emptyconstructorcallfromclass = new ArrayList<CtConstructorCall>();
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeVarMethodNameSimilarM12 (List<CtInvocation> invocationsaffected, List<CtVariable> scopevars, Cntx<Object> context) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeVarMethodNameSimilarM12 (List<CtInvocation> invocationsaffected, List<CtVariable> scopevars, Cntx<Object> context) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeWhetherMethodSatrtsWithGetM11 (List<CtInvocation> invocationsaffected, Cntx<Object> context) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeWhetherMethodWraptedM10 (List<CtInvocation> invocationsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	
	private void analyzeWhetherMethodWraptedM10 (List<CtInvocation> invocationsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	
	private void analyzeWhetherMethodWraptedM10 (List<CtInvocation> invocationsaffected, Cntx<Object> context,
			List<CtInvocation> invocationsFromClass, List<CtConstructorCall> constructorcallsFromClass) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
	
	private void analyzeVarMethodArgumentPrimitiveM13 (List<CtInvocation> invocationsaffected, Cntx<Object> context) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
    
    private int[] argumentDiffMethod(List<CtElement> argumentsoriginal, List<CtElement> argumentsother, 
 		   CtInvocation invocationaccess) {
 		
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
	}
    
    private int[] argumentDiffMethod(List<CtElement> argumentsoriginal, List<CtElement> argumentsother, 
 		   CtInvocation invocationaccess) {
 		
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();

    public EnhancedFeatureVisitor(Map<String, CtElement> valueExprInfo) {
        this.valueExprInfo = valueExprInfo;
    }
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();

    public EnhancedFeatureVisitor(Map<String, CtElement> valueExprInfo) {
        this.valueExprInfo = valueExprInfo;
    }
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	}
	
	 private void analyzeLE10_Analyze_Atomic_Boolexps(List<CtExpression> logicalExperssions, Cntx<Object> context) {
			
			try {	
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 */
	
	private void analyzeLE7_VarDirectlyUsed(List<CtExpression> logicalExperssions, 
			Cntx<Object> context, List<CtInvocation> invocationssInStatement) {
		
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	
	private void analyzeLE7_VarDirectlyUsed(List<CtExpression> logicalExperssions, 
			Cntx<Object> context, List<CtInvocation> invocationssInStatement) {
		
         try {
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param context
	 */
	private void analyzeLE3_PrimitiveWithCompatibleNotUsed( List<CtExpression> logicalExperssions, 
			List<CtVariable> varsInScope, Cntx<Object> context) {
		
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 */
	private void analyzeLE3_PrimitiveWithCompatibleNotUsed( List<CtExpression> logicalExperssions, 
			List<CtVariable> varsInScope, Cntx<Object> context) {
		
		 try {
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	
	@SuppressWarnings("rawtypes")
	private void analyzeLE1LE8_AffectedVariablesUsed(List<CtExpression> logicalExperssions, 
			List<CtVariable> varsInScope, Cntx<Object> context, CtClass parentClass, List<CtStatement> statements) {
		
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	@SuppressWarnings("rawtypes")
	private void analyzeLE1LE8_AffectedVariablesUsed(List<CtExpression> logicalExperssions, 
			List<CtVariable> varsInScope, Cntx<Object> context, CtClass parentClass, List<CtStatement> statements) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtStatement`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	@SuppressWarnings("rawtypes")
	private void analyzeLE1LE8_AffectedVariablesUsed(List<CtExpression> logicalExperssions, 
			List<CtVariable> varsInScope, Cntx<Object> context, CtClass parentClass, List<CtStatement> statements) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
		}
		
		private void analyzeExpressions(List<CtExpression> atomicexperssions, Cntx<Object> context, int logicalindex,CtExpression logicalexpression) {
			
			List<CtInvocation> invocationtypes = new ArrayList();
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	

    private void analyzeLE5_Analyze_ComplexReference (List<CtExpression> logicalExperssions, Cntx<Object> context) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param parentclass
	 */
	private void analyzeLE2_AffectedVariablesInMethod(List<CtExpression> logicalExperssions,
			Cntx<Object> context, List allMethods, List<CtInvocation> invocationsFromClass, CtClass parentclass) {
		
```

### BoundedWildcard
Can generalize to `? extends CtTypeReference`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	}
	
	public static boolean whetherpotentionalboolean(List<CtTypeReference> potentionaltypes) {
		
		for(int i=0; i<potentionaltypes.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @return
	 */
	public CtInvocation checkBooleanInvocationWithParameterReturn(List<CtInvocation> invocationsFromClass,
			CtVariableAccess varAffected, CtClass parentclass) {

```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param context
	 */	
	private void analyzeLE6_UnaryInvolved (List<CtExpression> logicalExperssions, Cntx<Object> context) {
		 
		try {
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	}
	
    private void analyzeLE9_BothNULLAndNormal(List<CtExpression> logicalExperssions, Cntx<Object> context) {
		
		try {
```

### BoundedWildcard
Can generalize to `? extends CtExpression`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 * @param context
	 */
	private void analyzeLE4_BooleanVarNotUsed(List<CtExpression> logicalExperssions, 
			List<CtVariable> varsInScope, Cntx<Object> context) {
		
```

### BoundedWildcard
Can generalize to `? extends CtVariable`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 */
	private void analyzeLE4_BooleanVarNotUsed(List<CtExpression> logicalExperssions, 
			List<CtVariable> varsInScope, Cntx<Object> context) {
		
		try {
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
    }

    private void getNearbyStmts(Repair repair, List<CtElement> stmtsF, List<CtElement> stmtsL) {
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
    }

    private void getNearbyStmts(Repair repair, List<CtElement> stmtsF, List<CtElement> stmtsL) {
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
    }

    private EnumSet<ValueFeature> getValueFeature(final String valueStr, final Repair repair, Map<String, CtElement> valueExprInfo) {
        EnumSet<ValueFeature> valueFeatures = EnumSet.noneOf(ValueFeature.class);
        if (repair.oldRExpr != null && repair.newRExpr != null) {
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
    }

    private void getNearbyStmts(Repair repair, List<CtElement> stmtsF, List<CtElement> stmtsL) {
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
    }

    private void getNearbyStmts(Repair repair, List<CtElement> stmtsF, List<CtElement> stmtsL) {
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
    }

    private EnumSet<ValueFeature> getValueFeature(final String valueStr, final Repair repair, Map<String, CtElement> valueExprInfo) {
        EnumSet<ValueFeature> valueFeatures = EnumSet.noneOf(ValueFeature.class);
        if (repair.oldRExpr != null && repair.newRExpr != null) {
```

### BoundedWildcard
Can generalize to `? extends CtTypeReference`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	}

	public boolean whetherhasobjective(List<CtTypeReference> inferredtypes) {

		for (int index = 0; index < inferredtypes.size(); index++) {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	// left-hand side of assignment.
	// S8: same, but primitive type variables
	public boolean[] analyze_AffectedObjectLastAppear(List<CtVariableAccess> varsAffected, CtElement element,
			List<CtStatement> statements) {

```

### BoundedWildcard
Can generalize to `? extends CtStatement`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	// S8: same, but primitive type variables
	public boolean[] analyze_AffectedObjectLastAppear(List<CtVariableAccess> varsAffected, CtElement element,
			List<CtStatement> statements) {

		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 */
	@SuppressWarnings("rawtypes")
	public boolean analyze_AffectedVariablesUsed(List<CtVariableAccess> varsAffected, CtElement element,
			List<CtStatement> statements) {

```

### BoundedWildcard
Can generalize to `? extends CtStatement`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	@SuppressWarnings("rawtypes")
	public boolean analyze_AffectedVariablesUsed(List<CtVariableAccess> varsAffected, CtElement element,
			List<CtStatement> statements) {

		try {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

	public boolean[] analyze_SamerMethodWithGuardOrTrywrap(CtElement element, CtClass parentClass,
			List<CtInvocation> allinvocationsFromClass, List<CtInvocation> invocationstostudy,
			List<CtConstructorCall> allconstructorcallsFromClass, List<CtConstructorCall> constructorcallstostudy) {

```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

	public boolean[] analyze_SamerMethodWithGuardOrTrywrap(CtElement element, CtClass parentClass,
			List<CtInvocation> allinvocationsFromClass, List<CtInvocation> invocationstostudy,
			List<CtConstructorCall> allconstructorcallsFromClass, List<CtConstructorCall> constructorcallstostudy) {

```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	public boolean[] analyze_SamerMethodWithGuardOrTrywrap(CtElement element, CtClass parentClass,
			List<CtInvocation> allinvocationsFromClass, List<CtInvocation> invocationstostudy,
			List<CtConstructorCall> allconstructorcallsFromClass, List<CtConstructorCall> constructorcallstostudy) {

		try {
```

### BoundedWildcard
Can generalize to `? extends CtConstructorCall`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	public boolean[] analyze_SamerMethodWithGuardOrTrywrap(CtElement element, CtClass parentClass,
			List<CtInvocation> allinvocationsFromClass, List<CtInvocation> invocationstostudy,
			List<CtConstructorCall> allconstructorcallsFromClass, List<CtConstructorCall> constructorcallstostudy) {

		try {
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 */
	@SuppressWarnings("rawtypes")
	public boolean analyze_AffectedFielfs(List<CtVariableAccess> varsAffected, CtElement element, CtClass parentClass) {
		try {
			CtMethod methodParent = element.getParent(CtMethod.class);
```

### BoundedWildcard
Can generalize to `? extends CtTypeReference`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	}

	public static boolean compareInferredTypes(CtTypeReference t1, List<CtTypeReference> potentionaltypes) {

		for (int i = 0; i < potentionaltypes.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	}

	public CtInvocation checkInvocationWithParameterReturnCompatibleType(List<CtInvocation> invocationsFromClass,
			CtTypeReference type, CtClass parentclass) {

```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	}

	public CtInvocation checkInvocationWithParemetrCompatibleType(List<CtInvocation> invocationsFromClass,
			CtTypeReference type) {

```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	}

	public boolean[] analyze_SametypewithGuard(List<CtVariableAccess> varsAffected, CtElement element,
			CtClass parentClass, List<CtStatement> statements) {

```

### BoundedWildcard
Can generalize to `? extends CtStatement`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

	public boolean[] analyze_SametypewithGuard(List<CtVariableAccess> varsAffected, CtElement element,
			CtClass parentClass, List<CtStatement> statements) {

		boolean hasPrimitiveSimilarTypeWithNormalGuard = false;
```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	}

	public boolean analyze_AffectedFieldAssigned(List<CtVariableAccess> varsAffected, CtElement element,
			CtClass parentClass) {

```

### BoundedWildcard
Can generalize to `? extends CtVariableAccess`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
	 */
	@SuppressWarnings("rawtypes")
	public boolean analyze_AffectedAssigned(List<CtVariableAccess> varsAffected, CtElement element) {
		try {
			CtMethod methodParent = element.getParent(CtMethod.class);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();

    public ExtendedFeatureVisitor(Map<String, CtElement> valueExprInfo) {
        this.valueExprInfo = valueExprInfo;
    }
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();

    public ExtendedFeatureVisitor(Map<String, CtElement> valueExprInfo) {
        this.valueExprInfo = valueExprInfo;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();

    public OriginalFeatureVisitor(Map<String, CtElement> valueExprInfo) {
        this.valueExprInfo = valueExprInfo;
    }
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();

    public OriginalFeatureVisitor(Map<String, CtElement> valueExprInfo) {
        this.valueExprInfo = valueExprInfo;
    }
```

### BoundedWildcard
Can generalize to `? extends Map`
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
    }

    private Map<String, List<Double>> scoreFiles(RankingOption rankingOption, Map<String, Map<File, File>> files) {
        String tmpPath = Support.getFilePath4Ranking(this.option, rankingOption, false);
        String rankingPath = Support.getFilePath4Ranking(this.option, rankingOption, true);
```

### BoundedWildcard
Can generalize to `? extends Ranking`
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java

    // consider move to DataHelper and make more general
    private void dumpCSV(String csvFileName, List<Ranking> rankings) {
        List<String> header = new ArrayList<>();
        header.add("entryName");
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
    }

    private void getNearbyStmts(Repair repair, List<CtElement> stmtsF, List<CtElement> stmtsL) {
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
```

### BoundedWildcard
Can generalize to `? super CtElement`
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
    }

    private void getNearbyStmts(Repair repair, List<CtElement> stmtsF, List<CtElement> stmtsL) {
        final int LOOKUP_DIS = 3;
        CtElement srcElem = repair.srcElem;
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
    }

    private EnumSet<ValueFeature> getValueFeature(final String valueStr, final Repair repair, Map<String, CtElement> valueExprInfo) {
        EnumSet<ValueFeature> valueFeatures = EnumSet.noneOf(ValueFeature.class);
        if (repair.oldRExpr != null && repair.newRExpr != null) {
```

### BoundedWildcard
Can generalize to `? extends Sample`
in `src/main/java/fr/inria/prophet4j/learner/FeatureLearner.java`
#### Snippet
```java
    }

    private ParameterVector learn(List<Sample> trainingData, List<Sample> validationData) {
        double eta = 1;
        double bestGamma = 1;
```

### BoundedWildcard
Can generalize to `? extends Sample`
in `src/main/java/fr/inria/prophet4j/learner/FeatureLearner.java`
#### Snippet
```java
    }

    private ParameterVector learn(List<Sample> trainingData, List<Sample> validationData) {
        double eta = 1;
        double bestGamma = 1;
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
    // for DataLoader, we do not need to obtainRepairCandidates as they are given
    // byGenerator = false as long as this func gets called
    public List<FeatureMatrix> runByPatches(File oldFile, List<File> newFiles) {
        List<FeatureMatrix> featureMatrices = new ArrayList<>();
        for (File newFile : newFiles) {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/fr/inria/coming/core/filter/commitmessage/BugfixKeywordsFilter.java`
#### Snippet
```java
public class BugfixKeywordsFilter extends KeyWordsTitleFilter {
	
	private final static String [] keywords = 
			new String[] {"fix","solve","correct", "patch", "bug"};
	
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/fr/inria/coming/core/filter/commitmessage/BugfixIgnoredFilter.java`
#### Snippet
```java
public class BugfixIgnoredFilter extends KeyWordsTitleFilter{
	
	private final static String [] keywords = 
			new String[] {"fix","solve","correct", "patch" };
	
```

### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java
	private RepositoryP repo;
	private RevCommit revCommit;
	static public String[] extensionToConsider = new String[] { ".java" };

	static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/PatternEntity.java`
#### Snippet
```java
	protected ParentPatternEntity parent = null;

	public final static PatternEntity ANY_ENTITY = new PatternEntity("*");

	public PatternEntity(String entityType) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/PatternEntity.java`
#### Snippet
```java
public class PatternEntity {

	public final static String ANY = "*";
	protected int id;
	protected String entityType = ANY;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
public class Cntx<I> {

	public final static String PREFIX = "CNTX";

	private Object identifier = null;
```

## RuleId[ruleID=EqualsBetweenInconvertibleTypes]
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

## RuleId[ruleID=DuplicateCondition]
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

## RuleId[ruleID=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `CtAssignment`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
			Operation ifOp = instance.getActions().get(0), assignOp = instance.getActions().get(1);

			if (!(assignOp instanceof CtAssignment)) {
				assignOp = instance.getActions().get(1);
				ifOp = instance.getActions().get(0);
```

## RuleId[ruleID=IgnoreResultOfCall]
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
				}
			}
			tempFile.delete();

			// To use XGBoost4J, we convert csv format features obtain above to libsvm
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
                File file = new File(jsonPath);
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                }
                Files.write(Paths.get(jsonPath), json.getBytes());
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

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitCtTypeAccess()` only delegates to its super method
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java

			@Override
			public <T> void visitCtTypeAccess(CtTypeAccess<T> typeAccess) {
				super.visitCtTypeAccess(typeAccess);
				// varaccess.add(typeAccess);
```

### RedundantMethodOverride
Method `visitCtTypeAccess()` only delegates to its super method
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java

			@Override
			public <T> void visitCtTypeAccess(CtTypeAccess<T> typeAccess) {
				super.visitCtTypeAccess(typeAccess);
				// varaccess.add(typeAccess);
```

### RedundantMethodOverride
Method `filter()` is identical to its super method
in `src/main/java/fr/inria/coming/repairability/repairtools/JKali.java`
#### Snippet
```java
     */
    @Override
    public boolean filter(ChangePatternInstance patternInstance, IRevision revision, Diff diff) {
        return true;
    }
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
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
in `src/main/java/fr/inria/prophet4j/feature/original/OriginalFeatureExtractor.java`
#### Snippet
```java
        List<CtElement> ret = new ArrayList<>();
        CtElement srcElem = repair.srcElem;
        if (!repair.isReplace) {
            ret.add(srcElem);
            return ret;
```

## RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`path = path + "/"` could be simplified to 'path += "/"'
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		String path = pathOfRepo;
		if (!path.endsWith("/"))
			path = path + "/";
		path = path + ".git";
		try {
```

### ReplaceAssignmentWithOperatorAssignment
`path = path + ".git"` could be simplified to 'path += ".git"'
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		if (!path.endsWith("/"))
			path = path + "/";
		path = path + ".git";
		try {
			repository = builder.setGitDir(new File(path)).readEnvironment().findGitDir().build();
```

### ReplaceAssignmentWithOperatorAssignment
`accumul = (accumul + probability_k)` could be simplified to 'accumul += probability_k'
in `src/main/java/fr/inria/coming/utils/MapList.java`
#### Snippet
```java
			int v = this.get(k).size();
			double probability_k = (double) v / (double) sum;
			accumul = (accumul + probability_k);
			probO.getProbAccumulative().put(k, accumul);
			probO.getProbDist().put(k, probability_k);
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			}

			for (int i = 0; i < pars.length; i = i + 2) {
				String key = pars[i];
				String value = pars[i + 1];
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SLineComparator.java`
#### Snippet
```java
        String line;
        ArrayList ar = new ArrayList();
        while ((line = br.readLine()) != null) {
            ar.add(line);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
    try {
      int tokenType;
      while ((tokenType= scanner.getNextToken()) != ITerminalSymbols.TokenNameEOF) {
        int start= scanner.getCurrentTokenStartPosition();
        int end= scanner.getCurrentTokenEndPosition()+1;
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstanceAnalyzer.java`
#### Snippet
```java
	}

	public void loadPattern() {
	}

```

### EmptyMethod
The method is empty
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/SpreadPatternInstanceAnalyzer.java`
#### Snippet
```java
	}

	public void loadPattern() {
	}

```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileNavigationExperiment.java`
#### Snippet
```java
public class FileNavigationExperiment extends RevisionNavigationExperiment<IRevision> {

	public File flocation = null;

	public FileNavigationExperiment() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDatasets.java`
#### Snippet
```java
	 * The folder where all the diff are located
	 */
	protected File rootDirectory = null;

	public FileDatasets(File rootDirectory) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/git/GITRepositoryInspector.java`
#### Snippet
```java
	protected Logger log = Logger.getLogger(GITRepositoryInspector.class.getName());

	RevisionDataset<Commit> history = null;

	public GITRepositoryInspector() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java
	 * The numbers of files from the dataset
	 */
	protected int totalNumberFiles = 0;

	public FileDynamicIterator(File rootDirectory) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java
	 * The folder where all the diff are located
	 */
	protected File rootDirectory = null;
	/**
	 * The numbers of files from the dataset
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java
public class FileDynamicIterator implements Iterator<IRevision>, RevisionOrder<IRevision> {

	private int currentFile = 0;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
	Logger log = Logger.getLogger(FileDiff.class.getName());

	protected File diffFolder = null;

	public FileDiff(File diffFolder) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
    Logger log = Logger.getLogger(FilePairsDiff.class.getName());

    protected RevisionOrder<R> navigationStrategy = null;
    protected List<Analyzer> analyzers = new ArrayList<>();
    protected List<IFilter> filters = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
    protected IntermediateResultProcessorCallback intermediateCallback = null;

    protected FinalResult<R> allResults = null;

    public RevisionNavigationExperiment() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
    protected List<IFilter> filters = new ArrayList<>();
    protected List<IOutput> outputProcessors = new ArrayList<>();
    protected IntermediateResultProcessorCallback intermediateCallback = null;

    protected FinalResult<R> allResults = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/entities/RevisionResult.java`
#### Snippet
```java
public class RevisionResult extends HashMap<String, AnalysisResult> {

	IRevision relatedRevision = null;

	public RevisionResult(IRevision oneRevision) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/entities/RevisionDataset.java`
#### Snippet
```java
public class RevisionDataset<Data> {

	Collection<Data> data = null;

	public RevisionDataset() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/core/entities/DiffResult.java`
#### Snippet
```java
	 * Filename
	 */
	Map<String, R> diffOfFiles = null;

	public DiffResult(T analyzed, Map<String, R> diffOfFiles) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java
// FIXME: getPathToRootNode & getOperatoinStats & getLabel... functions should be moved to a separate class
public class EntityTypesInfoResolver {
	private static EntityTypesInfoResolver _instance = null;
	private static final String CLASSES_HIERARCHY_FILE_NAME = "/gumtree-inheritance-relations.txt";

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
	}

	RevisionNavigationExperiment<?> navigatorEngine = null;

	@SuppressWarnings("rawtypes")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromRevision.java`
#### Snippet
```java
	 * Stores the information of the Diff.
	 */
	protected List<PatternInstancesFromDiff> infoPerDiff = null;
	List<DiffRow> row_list = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromRevision.java`
#### Snippet
```java
	 */
	protected List<PatternInstancesFromDiff> infoPerDiff = null;
	List<DiffRow> row_list = null;

	public PatternInstancesFromRevision(IRevision analyzed) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
	Logger log = Logger.getLogger(FineGrainDifftAnalyzer.class.getName());

	protected AstComparator cdiff = null;

	protected GranuralityType granularity;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
	protected GranuralityType granularity;

	protected boolean includeComments = false;

	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/PatternEntity.java`
#### Snippet
```java
	protected String entityType = ANY;
	protected String newValue = null;
	protected String oldValue = null;
	protected String roleInParent = ANY;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/PatternEntity.java`
#### Snippet
```java
	protected String roleInParent = ANY;

	protected ParentPatternEntity parent = null;

	public final static PatternEntity ANY_ENTITY = new PatternEntity("*");
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/patternspecification/PatternEntity.java`
#### Snippet
```java
	protected int id;
	protected String entityType = ANY;
	protected String newValue = null;
	protected String oldValue = null;
	protected String roleInParent = ANY;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/FeaturesResult.java`
#### Snippet
```java
public class FeaturesResult extends AnalysisResult<IRevision> {

	JsonElement features = null;

	public FeaturesResult(IRevision analyzed, JsonElement features) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
	protected List<ChangePatternInstance> instances = null;
	protected Diff diff = null;
	protected String location = null;

    Logger log = Logger.getLogger(this.getClass().getName());
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
public class PatternInstancesFromDiff extends AnalysisResult<IRevision> {

	protected List<ChangePatternInstance> instances = null;
	protected Diff diff = null;
	protected String location = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java

	protected List<ChangePatternInstance> instances = null;
	protected Diff diff = null;
	protected String location = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/coming/utils/MapCounter.java`
#### Snippet
```java

	Map<K, Double> probMap = new HashMap<K, Double>();
	boolean changeSinceLastCreation = false;

	public void add(K key) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int	patchedFileNo=0;
	 static int	rmLineNo=0;
	 static int	addLineNo=0;
	 static int	 addThis=0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int removeNullinCond = 0 ; //remove null in if
	 static int	patchedFileNo=0;
	 static int	rmLineNo=0;
	 static int	addLineNo=0;
	 static int	 addThis=0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int insertBooleanLiteral = 0; //a varaible is replaced by true or false
	 static int insertNewConstLiteral = 0; // const, false, true
	 static int UpdateLiteral = 0 ;
	 static int removeNullinCond = 0 ; //remove null in if
	 static int	patchedFileNo=0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int ifTrue = 0;  //if true to replace if condition
	 static int condLogicReduce = 0;  //if false to replace if condition
	 static int insertBooleanLiteral = 0; //a varaible is replaced by true or false
	 static int insertNewConstLiteral = 0; // const, false, true
	 static int UpdateLiteral = 0 ;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
public class RepairPatternFeatureAnalyzer {
	 static int dupArgsInvocation = 0; //duplicate variables in method invocation
	 static int updIfFalse = 0;  //if false to replace if condition
	 static int insertIfFalse = 0;  //

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int	rmLineNo=0;
	 static int	addLineNo=0;
	 static int	 addThis=0;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int UpdateLiteral = 0 ;
	 static int removeNullinCond = 0 ; //remove null in if
	 static int	patchedFileNo=0;
	 static int	rmLineNo=0;
	 static int	addLineNo=0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java

	 static int ifTrue = 0;  //if true to replace if condition
	 static int condLogicReduce = 0;  //if false to replace if condition
	 static int insertBooleanLiteral = 0; //a varaible is replaced by true or false
	 static int insertNewConstLiteral = 0; // const, false, true
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int insertNewConstLiteral = 0; // const, false, true
	 static int UpdateLiteral = 0 ;
	 static int removeNullinCond = 0 ; //remove null in if
	 static int	patchedFileNo=0;
	 static int	rmLineNo=0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int dupArgsInvocation = 0; //duplicate variables in method invocation
	 static int updIfFalse = 0;  //if false to replace if condition
	 static int insertIfFalse = 0;  //

	 static int ifTrue = 0;  //if true to replace if condition
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java

public class RepairPatternFeatureAnalyzer {
	 static int dupArgsInvocation = 0; //duplicate variables in method invocation
	 static int updIfFalse = 0;  //if false to replace if condition
	 static int insertIfFalse = 0;  //
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int condLogicReduce = 0;  //if false to replace if condition
	 static int insertBooleanLiteral = 0; //a varaible is replaced by true or false
	 static int insertNewConstLiteral = 0; // const, false, true
	 static int UpdateLiteral = 0 ;
	 static int removeNullinCond = 0 ; //remove null in if
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
	 static int insertIfFalse = 0;  //

	 static int ifTrue = 0;  //if true to replace if condition
	 static int condLogicReduce = 0;  //if false to replace if condition
	 static int insertBooleanLiteral = 0; //a varaible is replaced by true or false
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
	public final static String PREFIX = "CNTX";

	private Object identifier = null;

	private Map<String, I> information = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            description = "display version info"
    )
    private boolean displayVersionInfo = false;

    @CommandLine.Option(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            description = "display usage info"
    )
    private boolean displayUsageInfo = false;

    @CommandLine.Option(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
// based on FeatureExtract.cpp
public class S4ROFeatureVisitor {
    boolean isReplace = false;
    Map<String, CtElement> valueExprInfo;
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
// based on FeatureExtract.cpp
public class EnhancedFeatureVisitor {
    boolean isReplace = false;
    Map<String, CtElement> valueExprInfo;
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
	 
		private final class ExpressionCapturerScanner extends CtScanner {
			public CtElement toScan = null;

			@Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
// based on FeatureExtract.cpp
public class ExtendedFeatureVisitor {
    boolean isReplace = false;
    Map<String, CtElement> valueExprInfo;
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
// based on FeatureExtract.cpp
public class OriginalFeatureVisitor {
    boolean isReplace = false;
    Map<String, CtElement> valueExprInfo;
    Map<String, Set<AtomicFeature>> resMap = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
    // entity which contains weights for all feature-crosses
    class ParameterVector {
        public double gamma = 0;
        private int arraySize = 0;
        private double[] parameterArray;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
    class ParameterVector {
        public double gamma = 0;
        private int arraySize = 0;
        private double[] parameterArray;

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-26-12-57-38.586.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
            for (IndexEntry indexEntry : index) {
                InputStream entry = sivaReader.getEntry(indexEntry);
                Path outPath = Paths.get(SIVA_UNPACKED_DIR.concat(indexEntry.getName()));
                FileUtils.copyInputStreamToFile(entry, new File(outPath.toString()));
            }
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
			return resultString;
		} catch (Exception e) {
			if (!(e instanceof RuntimeException)) throw new RuntimeException(e);
		}
		return "--Diff ex--";
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(header.toArray(new String[0])));
            // only one line of data
            csvPrinter.printRecord(values);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(header.toArray(new String[0])));
            // only one line of data
            for (List<String> valueList : valueLists) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        try {
            BufferedWriter writer = java.nio.file.Files.newBufferedWriter(Paths.get(csvFileName));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(header.toArray(new String[0])));
            rankings.sort(Comparator.comparing(Ranking::getMean).thenComparing(Ranking::getSD).thenComparing(Ranking::getEntryName));
            for (Ranking ranking : rankings) {
```

## RuleId[ruleID=DuplicateThrows]
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

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
		};

		Map<String, DMatrix> watches = new HashMap<String, DMatrix>() {
			{
				put("train", trainMat);
```

### DoubleBraceInitialization
Double brace initialization
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
		String trainingFile = ComingProperties.getProperty("ODSTrainingFile");
		DMatrix trainMat = new DMatrix(trainingFile);
		Map<String, Object> params = new HashMap<String, Object>() {
			{
				put("eta", ComingProperties.getProperty("xgboost-training-eta"));
```

## RuleId[ruleID=UnusedAssignment]
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
Variable `cdiff` initializer `null` is redundant
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
	Logger log = Logger.getLogger(FineGrainDifftAnalyzer.class.getName());

	protected AstComparator cdiff = null;

	protected GranuralityType granularity;
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
Variable `features` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/FeaturesResult.java`
#### Snippet
```java
public class FeaturesResult extends AnalysisResult<IRevision> {

	JsonElement features = null;

	public FeaturesResult(IRevision analyzed, JsonElement features) {
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
The value changed at `i_hunk++` is never used
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java

			File postVersion = new File(pathname + "_t.java");
			i_hunk++;

			JsonObject file = new JsonObject();
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
Variable `logicalExpressions` initializer `new ArrayList()` is redundant
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
	public List<CtTypeAccess> typeaccess;

	public List<CtExpression> logicalExpressions = new ArrayList();

	public List<CtExpression> desirableExpressions = new ArrayList();
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
Variable `condition` initializer `null` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		// Two cases: if and conditional
		CtExpression condition = null;
		CtConditional parentConditional = element.getParent(CtConditional.class);

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

## RuleId[ruleID=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1` can be replaced with 'certainexpression.getType().getQualifiedName().toString().toLowerCase().contains("string")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("double") ||
```

### IndexOfReplaceableByContains
`conAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1` can be replaced with 'conAffected.getType().getQualifiedName().toString().toLowerCase().contains("string")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						conAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### IndexOfReplaceableByContains
`superType.getQualifiedName().toLowerCase().indexOf("thread") != -1` can be replaced with 'superType.getQualifiedName().toLowerCase().contains("thread")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
					CtTypeReference<?> superType = parentClass.getSuperclass();

					if (superType != null && superType.getQualifiedName().toLowerCase().indexOf("thread") != -1)
						S18Insynchronizedmethod = true;

```

### IndexOfReplaceableByContains
`specificreference.getQualifiedName().toLowerCase().indexOf("thread") != -1` can be replaced with 'specificreference.getQualifiedName().toLowerCase().contains("thread")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
						for (CtTypeReference specificreference : superInterfaces) {
							if (specificreference != null
									&& specificreference.getQualifiedName().toLowerCase().indexOf("thread") != -1) {
								S18Insynchronizedmethod = true;
								break;
```

### IndexOfReplaceableByContains
`superType.getQualifiedName().toLowerCase().indexOf("exception") != -1` can be replaced with 'superType.getQualifiedName().toLowerCase().contains("exception")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
					CtTypeReference<?> superType = parentClass.getSuperclass();

					if (superType != null && superType.getQualifiedName().toLowerCase().indexOf("exception") != -1)
						s11ExceptionType = true;

```

### IndexOfReplaceableByContains
`specificreference.getQualifiedName().toLowerCase().indexOf("exception") != -1` can be replaced with 'specificreference.getQualifiedName().toLowerCase().contains("exception")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
						for (CtTypeReference specificreference : superInterfaces) {
							if (specificreference != null
									&& specificreference.getQualifiedName().toLowerCase().indexOf("exception") != -1) {
								s11ExceptionType = true;
								break;
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("close") != -1` can be replaced with 'name.toLowerCase().contains("close")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
					if (!name.isEmpty() && name != null) {

						if (name.toLowerCase().indexOf("close") != -1 || name.toLowerCase().indexOf("connection") != -1
								|| name.toLowerCase().indexOf("stall") != -1
								|| name.toLowerCase().indexOf("accept") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("connection") != -1` can be replaced with 'name.toLowerCase().contains("connection")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
					if (!name.isEmpty() && name != null) {

						if (name.toLowerCase().indexOf("close") != -1 || name.toLowerCase().indexOf("connection") != -1
								|| name.toLowerCase().indexOf("stall") != -1
								|| name.toLowerCase().indexOf("accept") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("stall") != -1` can be replaced with 'name.toLowerCase().contains("stall")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

						if (name.toLowerCase().indexOf("close") != -1 || name.toLowerCase().indexOf("connection") != -1
								|| name.toLowerCase().indexOf("stall") != -1
								|| name.toLowerCase().indexOf("accept") != -1
								|| name.toLowerCase().indexOf("context") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("accept") != -1` can be replaced with 'name.toLowerCase().contains("accept")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
						if (name.toLowerCase().indexOf("close") != -1 || name.toLowerCase().indexOf("connection") != -1
								|| name.toLowerCase().indexOf("stall") != -1
								|| name.toLowerCase().indexOf("accept") != -1
								|| name.toLowerCase().indexOf("context") != -1
								|| name.toLowerCase().indexOf("write") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("context") != -1` can be replaced with 'name.toLowerCase().contains("context")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("stall") != -1
								|| name.toLowerCase().indexOf("accept") != -1
								|| name.toLowerCase().indexOf("context") != -1
								|| name.toLowerCase().indexOf("write") != -1
								|| name.toLowerCase().indexOf("getmethod") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("write") != -1` can be replaced with 'name.toLowerCase().contains("write")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("accept") != -1
								|| name.toLowerCase().indexOf("context") != -1
								|| name.toLowerCase().indexOf("write") != -1
								|| name.toLowerCase().indexOf("getmethod") != -1
								|| name.toLowerCase().indexOf("getconstructor") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("getmethod") != -1` can be replaced with 'name.toLowerCase().contains("getmethod")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("context") != -1
								|| name.toLowerCase().indexOf("write") != -1
								|| name.toLowerCase().indexOf("getmethod") != -1
								|| name.toLowerCase().indexOf("getconstructor") != -1
								|| name.toLowerCase().indexOf("getdeclaredmethod") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("getconstructor") != -1` can be replaced with 'name.toLowerCase().contains("getconstructor")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("write") != -1
								|| name.toLowerCase().indexOf("getmethod") != -1
								|| name.toLowerCase().indexOf("getconstructor") != -1
								|| name.toLowerCase().indexOf("getdeclaredmethod") != -1
								|| name.toLowerCase().indexOf("getdeclaredfield") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("getdeclaredmethod") != -1` can be replaced with 'name.toLowerCase().contains("getdeclaredmethod")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("getmethod") != -1
								|| name.toLowerCase().indexOf("getconstructor") != -1
								|| name.toLowerCase().indexOf("getdeclaredmethod") != -1
								|| name.toLowerCase().indexOf("getdeclaredfield") != -1
								|| name.toLowerCase().indexOf("read") != -1 || name.toLowerCase().indexOf("open") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("getdeclaredfield") != -1` can be replaced with 'name.toLowerCase().contains("getdeclaredfield")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("getconstructor") != -1
								|| name.toLowerCase().indexOf("getdeclaredmethod") != -1
								|| name.toLowerCase().indexOf("getdeclaredfield") != -1
								|| name.toLowerCase().indexOf("read") != -1 || name.toLowerCase().indexOf("open") != -1
								|| name.toLowerCase().indexOf("resource") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("read") != -1` can be replaced with 'name.toLowerCase().contains("read")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("getdeclaredmethod") != -1
								|| name.toLowerCase().indexOf("getdeclaredfield") != -1
								|| name.toLowerCase().indexOf("read") != -1 || name.toLowerCase().indexOf("open") != -1
								|| name.toLowerCase().indexOf("resource") != -1
								|| name.toLowerCase().indexOf("parse") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("open") != -1` can be replaced with 'name.toLowerCase().contains("open")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("getdeclaredmethod") != -1
								|| name.toLowerCase().indexOf("getdeclaredfield") != -1
								|| name.toLowerCase().indexOf("read") != -1 || name.toLowerCase().indexOf("open") != -1
								|| name.toLowerCase().indexOf("resource") != -1
								|| name.toLowerCase().indexOf("parse") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("resource") != -1` can be replaced with 'name.toLowerCase().contains("resource")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("getdeclaredfield") != -1
								|| name.toLowerCase().indexOf("read") != -1 || name.toLowerCase().indexOf("open") != -1
								|| name.toLowerCase().indexOf("resource") != -1
								|| name.toLowerCase().indexOf("parse") != -1
								|| name.toLowerCase().indexOf("waitfor") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("parse") != -1` can be replaced with 'name.toLowerCase().contains("parse")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("read") != -1 || name.toLowerCase().indexOf("open") != -1
								|| name.toLowerCase().indexOf("resource") != -1
								|| name.toLowerCase().indexOf("parse") != -1
								|| name.toLowerCase().indexOf("waitfor") != -1
								|| name.toLowerCase().indexOf("install") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("waitfor") != -1` can be replaced with 'name.toLowerCase().contains("waitfor")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("resource") != -1
								|| name.toLowerCase().indexOf("parse") != -1
								|| name.toLowerCase().indexOf("waitfor") != -1
								|| name.toLowerCase().indexOf("install") != -1
								|| name.toLowerCase().indexOf("load") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("install") != -1` can be replaced with 'name.toLowerCase().contains("install")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("parse") != -1
								|| name.toLowerCase().indexOf("waitfor") != -1
								|| name.toLowerCase().indexOf("install") != -1
								|| name.toLowerCase().indexOf("load") != -1
								|| name.toLowerCase().indexOf("synchron") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("load") != -1` can be replaced with 'name.toLowerCase().contains("load")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("waitfor") != -1
								|| name.toLowerCase().indexOf("install") != -1
								|| name.toLowerCase().indexOf("load") != -1
								|| name.toLowerCase().indexOf("synchron") != -1
								|| name.toLowerCase().indexOf("flush") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("synchron") != -1` can be replaced with 'name.toLowerCase().contains("synchron")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("install") != -1
								|| name.toLowerCase().indexOf("load") != -1
								|| name.toLowerCase().indexOf("synchron") != -1
								|| name.toLowerCase().indexOf("flush") != -1
								|| name.toLowerCase().indexOf("listen") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("flush") != -1` can be replaced with 'name.toLowerCase().contains("flush")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("load") != -1
								|| name.toLowerCase().indexOf("synchron") != -1
								|| name.toLowerCase().indexOf("flush") != -1
								|| name.toLowerCase().indexOf("listen") != -1
								|| name.toLowerCase().indexOf("invoke") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("listen") != -1` can be replaced with 'name.toLowerCase().contains("listen")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("synchron") != -1
								|| name.toLowerCase().indexOf("flush") != -1
								|| name.toLowerCase().indexOf("listen") != -1
								|| name.toLowerCase().indexOf("invoke") != -1
								|| name.toLowerCase().indexOf("clone") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("invoke") != -1` can be replaced with 'name.toLowerCase().contains("invoke")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("flush") != -1
								|| name.toLowerCase().indexOf("listen") != -1
								|| name.toLowerCase().indexOf("invoke") != -1
								|| name.toLowerCase().indexOf("clone") != -1
								|| name.toLowerCase().indexOf("shutdown") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("clone") != -1` can be replaced with 'name.toLowerCase().contains("clone")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("listen") != -1
								|| name.toLowerCase().indexOf("invoke") != -1
								|| name.toLowerCase().indexOf("clone") != -1
								|| name.toLowerCase().indexOf("shutdown") != -1
								|| name.toLowerCase().indexOf("connect") != -1) {
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("shutdown") != -1` can be replaced with 'name.toLowerCase().contains("shutdown")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("invoke") != -1
								|| name.toLowerCase().indexOf("clone") != -1
								|| name.toLowerCase().indexOf("shutdown") != -1
								|| name.toLowerCase().indexOf("connect") != -1) {
							S16HasInvocationsPronetoException = true;
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("connect") != -1` can be replaced with 'name.toLowerCase().contains("connect")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
								|| name.toLowerCase().indexOf("clone") != -1
								|| name.toLowerCase().indexOf("shutdown") != -1
								|| name.toLowerCase().indexOf("connect") != -1) {
							S16HasInvocationsPronetoException = true;
							break;
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("stream") != -1` can be replaced with 'name.toLowerCase().contains("stream")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
						if (!name.isEmpty() && name != null) {

							if (name.toLowerCase().indexOf("stream") != -1 || name.toLowerCase().indexOf("file") != -1
									|| name.toLowerCase().indexOf("output") != -1
									|| name.toLowerCase().indexOf("accept") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("file") != -1` can be replaced with 'name.toLowerCase().contains("file")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
						if (!name.isEmpty() && name != null) {

							if (name.toLowerCase().indexOf("stream") != -1 || name.toLowerCase().indexOf("file") != -1
									|| name.toLowerCase().indexOf("output") != -1
									|| name.toLowerCase().indexOf("accept") != -1
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("output") != -1` can be replaced with 'name.toLowerCase().contains("output")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

							if (name.toLowerCase().indexOf("stream") != -1 || name.toLowerCase().indexOf("file") != -1
									|| name.toLowerCase().indexOf("output") != -1
									|| name.toLowerCase().indexOf("accept") != -1
									|| name.toLowerCase().indexOf("input") != -1) {
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("accept") != -1` can be replaced with 'name.toLowerCase().contains("accept")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
							if (name.toLowerCase().indexOf("stream") != -1 || name.toLowerCase().indexOf("file") != -1
									|| name.toLowerCase().indexOf("output") != -1
									|| name.toLowerCase().indexOf("accept") != -1
									|| name.toLowerCase().indexOf("input") != -1) {
								S16HasInvocationsPronetoException = true;
```

### IndexOfReplaceableByContains
`name.toLowerCase().indexOf("input") != -1` can be replaced with 'name.toLowerCase().contains("input")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
									|| name.toLowerCase().indexOf("output") != -1
									|| name.toLowerCase().indexOf("accept") != -1
									|| name.toLowerCase().indexOf("input") != -1) {
								S16HasInvocationsPronetoException = true;
								break;
```

### IndexOfReplaceableByContains
`ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-...` can be replaced with 'ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().contains("string")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
					ctVariable.getReference().getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### IndexOfReplaceableByContains
`varAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("java.lang.object")==-1` can be replaced with '!varAffected.getType().getQualifiedName().toString().toLowerCase().contains("java.lang.object")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				
				if(varAffected.getType()!=null && !varAffected.getType().getQualifiedName().toString().toLowerCase().endsWith("object") &&
						varAffected.getType().getQualifiedName().toString().toLowerCase().indexOf("java.lang.object")==-1) {

				  if (checkMethodDeclarationWithParameterReturnCompatibleType(allMethods, varAffected.getType()) != null
```

### IndexOfReplaceableByContains
`invocation.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1` can be replaced with 'invocation.getType().getQualifiedName().toString().toLowerCase().contains("string")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
						invocation.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1||
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
						invocation.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### IndexOfReplaceableByContains
`certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1` can be replaced with 'certainexpression.getType().getQualifiedName().toString().toLowerCase().contains("string")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("string") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("list") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().indexOf("string")!=-1 ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("long") || 
							certainexpression.getType().getQualifiedName().toString().toLowerCase().endsWith("boolean") ||
```

### IndexOfReplaceableByContains
`inputLiteral.toString().indexOf("null") != -1` can be replaced with 'inputLiteral.toString().contains("null")'
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
			literaltypeandvalue[0] = "string";
			literaltypeandvalue[1] = inputLiteral.getValue().toString();
		} else if (inputLiteral.toString().indexOf("null") != -1) {
			literaltypeandvalue[0] = "null";
			literaltypeandvalue[1] = "null";
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
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

## RuleId[ruleID=ConstantValue]
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
Condition `e instanceof RuntimeException` is always `true`
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

## RuleId[ruleID=IOResource]
### IOResource
'CSVPrinter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(header.toArray(new String[0])));
            // only one line of data
            csvPrinter.printRecord(values);
```

### IOResource
'CSVPrinter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(header.toArray(new String[0])));
            // only one line of data
            for (List<String> valueList : valueLists) {
```

### IOResource
'CSVPrinter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        try {
            BufferedWriter writer = java.nio.file.Files.newBufferedWriter(Paths.get(csvFileName));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(header.toArray(new String[0])));
            rankings.sort(Comparator.comparing(Ranking::getMean).thenComparing(Ranking::getSD).thenComparing(Ranking::getEntryName));
            for (Ranking ranking : rankings) {
```

## RuleId[ruleID=RedundantOperationOnEmptyContainer]
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
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
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

### RedundantOperationOnEmptyContainer
Collection `inferredpotentionaltypes` is always empty
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

			List<CtTypeReference> inferredpotentionaltypes = new ArrayList<CtTypeReference>();
			inferredpotentionaltypes.clear();

			CtTypeReference inferredtype = null;
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `commonInfo` may be 'static'
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
    }

    private final String commonInfo = "\ndefault value: ${DEFAULT-VALUE}\nvalid values: ${COMPLETION-CANDIDATES}";

    @CommandLine.Option(
```

### FieldMayBeStatic
Field `PROPHET4J_DIR` may be 'static'
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
    ]
     */
    private final String PROPHET4J_DIR = "src/main/resources/prophet4j/";
    private final String SIVA_FILES_DIR = PROPHET4J_DIR + "siva_files/";
    private final String SIVA_UNPACKED_DIR = PROPHET4J_DIR + "siva_unpacked/";
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FileUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/core/engine/files/FileUtil.java`
#### Snippet
```java
 *
 */
public class FileUtil {

	public static String extractFileName(String completeFileName) {
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/Main.java`
#### Snippet
```java

// should be run as "JUnit Plugin test" in headless more (Run an application: no application headless mode)
public class Main {	
	
	
```

### UtilityClassWithoutPrivateConstructor
Class `PlugInLoader` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/core/extensionpoints/PlugInLoader.java`
#### Snippet
```java
 *
 */
public class PlugInLoader {

	protected static Logger log = Logger.getLogger(Thread.currentThread().getName());
```

### UtilityClassWithoutPrivateConstructor
Class `ComingProperties` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/main/ComingProperties.java`
#### Snippet
```java
 *
 */
public class ComingProperties {

	public static Properties properties;
```

### UtilityClassWithoutPrivateConstructor
Class `ASTInfoResolver` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/utils/ASTInfoResolver.java`
#### Snippet
```java
import java.util.List;

public class ASTInfoResolver {

	public static CtElement getRootNode(CtElement node) {
```

### UtilityClassWithoutPrivateConstructor
Class `StringDistance` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/utils/StringDistance.java`
#### Snippet
```java
 *
 */
public class StringDistance {
	public static int calculate(String x, String y) {
		int[][] dp = new int[x.length() + 1][y.length() + 1];
```

### UtilityClassWithoutPrivateConstructor
Class `ConsoleOutput` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/changeminer/util/ConsoleOutput.java`
#### Snippet
```java
 *
 */
public class ConsoleOutput {

	public static Logger log = Logger.getLogger(ConsoleOutput.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `OperationClassifier` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/utils/OperationClassifier.java`
#### Snippet
```java
 *
 */
public class OperationClassifier {

	public static MapList<Operation, Operation> getOperationHierarchy(Diff iDiff) {
```

### UtilityClassWithoutPrivateConstructor
Class `RepairPatternFeatureAnalyzer` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
import gumtree.spoon.diff.operations.Operation;

public class RepairPatternFeatureAnalyzer {
	 static int dupArgsInvocation = 0; //duplicate variables in method invocation
	 static int updIfFalse = 0;  //if false to replace if condition
```

### UtilityClassWithoutPrivateConstructor
Class `SecAnalysis` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
 *
 */
public class SecAnalysis {

	public static JsonObject createJSonOfOperation(MapList<Operation, Operation> operationHierarchy,
```

### UtilityClassWithoutPrivateConstructor
Class `VariableResolver` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
 */
@SuppressWarnings("rawtypes")
public class VariableResolver {

	private static Logger logger = Logger.getLogger(VariableResolver.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `DataLoader` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
import java.util.*;

class DataLoader {
    // load buggy files and human patches
    static Map<String, Map<File, File>> loadSANERWithoutPatches(String dataPath) throws NullPointerException {
```

### UtilityClassWithoutPrivateConstructor
Class `Support` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/prophet4j/utility/Support.java`
#### Snippet
```java
import java.util.StringJoiner;

public class Support {
    public static final String PROPHET4J_DIR = Support.class.getClassLoader().getResource("").getPath() + "prophet4j/";

```

## RuleId[ruleID=ManualArrayToCollectionCopy]
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

## RuleId[ruleID=DataFlowIssue]
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
Dereference of `pairFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		File pairFolder = new File(folderPath);

		for (File fileModif : pairFolder.listFiles()) {

			if (!".DS_Store".equals(fileModif.getName())) {
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
Variable is already assigned to this value
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				
				if(isPrimitive)
					isObject=false;
				else isObject=true;
				
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
    public Map<String, Map<File, File>> loadPFiles(String dataPath) throws NullPointerException {
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        for (File file : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            // patchInfo
            String pathName = file.getName();
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

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `src/main/java/fr/inria/prophet4j/utility/Support.java`
#### Snippet
```java

public class Support {
    public static final String PROPHET4J_DIR = Support.class.getClassLoader().getResource("").getPath() + "prophet4j/";

    public enum DirType {
```

## RuleId[ruleID=UnnecessarySemicolon]
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

## RuleId[ruleID=SimplifyStreamApiCallChains]
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

## RuleId[ruleID=ParameterCanBeLocal]
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

## RuleId[ruleID=StringOperationCanBeSimplified]
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
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.util.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.nio.") ||
							certainexpression.getType().getQualifiedName().toString().toLowerCase().startsWith("java.io."))) {
						
						M13ArgumentHasPrimitive = true;
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/fr/inria/coming/utils/MapList.java`
#### Snippet
```java

		Probability<K> probO = new Probability<>();
		int sum = this.values().stream().mapToInt(e -> e.size()).sum();
		double accumul = 0;
		for (K k : this.keySet()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
                : allCombinations(changePatternSpecification, matching);

        instancesAllCombinations = instancesAllCombinations.stream().filter(e -> validate(e))
                .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
					.map(CtLiteral.class::cast).collect(Collectors.toList());
			
			List<CtVariable> constantVarsInScope = varsInScope.stream().filter(e -> isConstantVariable(e))
								.map(CtVariable.class::cast).collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
        } else if (instance.getPattern().getName().contains(UPD_PATTERN_NAME)) {
            srcNodes = instance.getActions().stream()
                    .map(action -> (action.getSrcNode())).collect(Collectors.toSet());
        }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
							continue; 

						List<CtElement> elements = aStatement.getElements(e -> isBooleanExpression(e)).stream()
								.map(CtElement.class::cast).collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
							continue; 

						List<CtElement> elements = aStatement.getElements(e -> isBooleanExpression(e)).stream()
								.map(CtElement.class::cast).collect(Collectors.toList());

```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
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
		
		writeGroupedInfo(context, Integer.toString(operatorindex)+"_"+operatorunderstudy, CodeFeatures.O2_LOGICAL_CONTAIN_NOT, 
				whethercontainnotoperator, "FEATURES_BINARYOPERATOR");
		
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
						CodeFeatures.LE3_IS_COMPATIBLE_VAR_NOT_INCLUDED,
						hasCompatibleVarNoPresent, "FEATURES_LOGICAL_EXPRESSION");
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
						CodeFeatures.LE2_IS_BOOLEAN_METHOD_PARAM_TYPE_VAR,
						hasAnyLES2paramCompatibleWithBooleanReturn, "FEATURES_LOGICAL_EXPRESSION");
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
						CodeFeatures.LE4_EXISTS_LOCAL_UNUSED_VARIABLES,
						hasBooleanVarNotPresent, "FEATURES_LOGICAL_EXPRESSION");
```

## RuleId[ruleID=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparingInt'
in `src/main/java/fr/inria/coming/utils/MapList.java`
#### Snippet
```java
	public MapList<K, V> getSorted() {
		return this.entrySet().stream()
				.sorted(Map.Entry.<K, List<V>>comparingByValue((l1, l2) -> Integer.compare(l1.size(), l2.size()))
						.reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
```

## RuleId[ruleID=RedundantCollectionOperation]
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

## RuleId[ruleID=CatchMayIgnoreException]
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
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
				}
			}
		} catch (Exception ex) {
		}

```

## RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/fr/inria/coming/utils/CommandSummary.java`
#### Snippet
```java
				if (i < pCommand.length - 1 && !pCommand[i + 1].startsWith("-")) {
					command.put(key, pCommand[i + 1]);
					i++;
				} else
					command.put(key, null);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `epoch`
in `src/main/java/fr/inria/prophet4j/learner/FeatureLearner.java`
#### Snippet
```java
            // update results
            if (bestGamma > gamma) {
                epoch = 0;
                bestTheta.clone(theta);
                bestGamma = gamma;
```

## RuleId[ruleID=InnerClassMayBeStatic]
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

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
        if (v == null) {
            if (!resMap.containsKey("@")) {
                resMap.put("@", new HashSet<>());
            }
            resMap.get("@").add(af);
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/fr/inria/prophet4j/feature/S4RO/util/S4ROFeatureVisitor.java`
#### Snippet
```java
//            }
            if (!resMap.containsKey(tmp)) {
                resMap.put(tmp, new HashSet<>());
            }
            resMap.get(tmp).add(af);
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
        if (v == null) {
            if (!resMap.containsKey("@")) {
                resMap.put("@", new HashSet<>());
            }
            resMap.get("@").add(af);
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/util/EnhancedFeatureVisitor.java`
#### Snippet
```java
//            }
            if (!resMap.containsKey(tmp)) {
                resMap.put(tmp, new HashSet<>());
            }
            resMap.get(tmp).add(af);
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
        if (v == null) {
            if (!resMap.containsKey("@")) {
                resMap.put("@", new HashSet<>());
            }
            resMap.get("@").add(af);
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/fr/inria/prophet4j/feature/extended/util/ExtendedFeatureVisitor.java`
#### Snippet
```java
//            }
            if (!resMap.containsKey(tmp)) {
                resMap.put(tmp, new HashSet<>());
            }
            resMap.get(tmp).add(af);
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
        if (v == null) {
            if (!resMap.containsKey("@")) {
                resMap.put("@", new HashSet<>());
            }
            resMap.get("@").add(af);
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/fr/inria/prophet4j/feature/original/util/OriginalFeatureVisitor.java`
#### Snippet
```java
//            }
            if (!resMap.containsKey(tmp)) {
                resMap.put(tmp, new HashSet<>());
            }
            resMap.get(tmp).add(af);
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
		// Obtain feature in libsvm format
		String features = extractFeatures(pairFolder);
		if ("".equals(features)) {
			return ODSLabel.UNKNOWN;
		}
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/fr/inria/coming/repairability/RepairTools.java`
#### Snippet
```java
            // consider default/ALL Case
            toolsToBeConsidered = getRepairToolsInstance(Arrays.asList(supportedTools));
        } else if (repairToolArg.equals("") || repairToolArg.equals("ALL")) {
            // consider default/ALL Case
            toolsToBeConsidered = getRepairToolsInstance(Arrays.asList(supportedTools));
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.LT_ENUM_VF);
            } else if (value instanceof String) {
                if (((String) value).equals("")) {
                    valueFeatures.add(ValueFeature.LV_BLANK_VF);
                }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
                valueFeatures.add(ValueFeature.LT_ENUM_VF);
            } else if (value instanceof String) {
                if (((String) value).equals("")) {
                    valueFeatures.add(ValueFeature.LV_BLANK_VF);
                }
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<ChangePatternInstance> findPatternInstances(ChangePatternSpecification changePatternSpecification,
                                                            Diff diffToAnalyze) {

```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	public JsonObject toJSON() {

		JsonObject generalStatsjson = new JsonObject();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void analyzeV8_TypesVarsAffected(List<CtVariableAccess> varsAffected, CtElement element,
			Cntx<Object> context) {
		try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void analyzeS6S11_Method_Method_Features(CtElement element, Cntx<Object> context) {
		try {

```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public void processEndRevision(R element, RevisionResult resultAllAnalyzed) {

        if (this.intermediateCallback != null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java

	@SuppressWarnings({ "unused", "unchecked" })
	private void addStats(JsonObject root, String key1, Map sorted) {
		JsonArray frequencyArray = new JsonArray();
		root.add(key1, frequencyArray);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	public static JsonObject getJSONFromOperator(Operation operation) {
		JsonObject op = new JsonObject();
		op.addProperty("operator", operation.getAction().getName());
```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected static List<CtVariable> compatiblesSubType(List<CtVariable> varContext, CtTypeReference typeToFind) {

		List<CtVariable> result = new ArrayList<CtVariable>();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
        DiffFormatter formatter = new DiffFormatter(System.out);
        formatter.setRepository(repo);
        //noinspection ConstantConditions
        formatter.format(diff);
    }
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		String outputs = ComingProperties.getProperty("outputprocessor");
		if (outputs == null) {
			if (Boolean.valueOf(System.getProperty("executed_by_travis"))) {
				navigatorEngine.getOutputProcessors().add(0, new NullOutput());
				System.out.println("****EXECUTED_BY_TRAVIS****");
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
					idEntities.put(idEntity, pEntity);
					if (idEntity != null && !idEntity.isEmpty())
						pEntity.setId(Integer.valueOf(idEntity));

					NodeList nListParent = eElement.getElementsByTagName(PARENT);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
						throw new Exception("Parent not identified");
					}
					entity.setParent(entParent, Integer.valueOf(pspl[1]));
				}

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/fr/inria/coming/utils/MapCounter.java`
#### Snippet
```java
		changeSinceLastCreation = true;
		if (!containsKey(key))
			this.put(key, new Integer(1));
		else {
			Integer i = this.get(key);
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
	public boolean isBooleanValueTrue(String key) {
		I res = information.getOrDefault(key, (I)Boolean.FALSE);
		return Boolean.valueOf(res.toString());
	}

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
					if (particularVar != null) {

						if (Boolean.valueOf(particularVar.getInformation().get("V1_LOCAL_VAR_NOT_USED").toString()))
							S1_LOCAL_VAR_NOT_USED = true;

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
							S1_LOCAL_VAR_NOT_USED = true;

						if (Boolean.valueOf(particularVar.getInformation().get("V1_LOCAL_VAR_NOT_ASSIGNED").toString()))
							S1_LOCAL_VAR_NOT_ASSIGNED = true;

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
					if (particularMethod != null) {

						if (Boolean.valueOf(
								particularMethod.getInformation().get("M9_METHOD_CALL_WITH_NORMAL_GUARD").toString()))
							S9_METHOD_CALL_WITH_NORMAL_GUARD = true;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
							S9_METHOD_CALL_WITH_NORMAL_GUARD = true;

						if (Boolean.valueOf(
								particularMethod.getInformation().get("M10_METHOD_CALL_WITH_NULL_GUARD").toString()))
							S10_METHOD_CALL_WITH_NULL_GUARD = true;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
							S10_METHOD_CALL_WITH_NULL_GUARD = true;

						if (Boolean.valueOf(
								particularMethod.getInformation().get("M12_METHOD_CALL_WITH_TRY_CATCH").toString()))
							S12_METHOD_CALL_WITH_TRY_CATCH = true;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
					if (particularConstructor != null) {

						if (Boolean.valueOf(particularConstructor.getInformation()
								.get("CON9_METHOD_CALL_WITH_NORMAL_GUARD").toString()))
							S9_METHOD_CALL_WITH_NORMAL_GUARD = true;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
							S9_METHOD_CALL_WITH_NORMAL_GUARD = true;

						if (Boolean.valueOf(particularConstructor.getInformation()
								.get("CON10_METHOD_CALL_WITH_NULL_GUARD").toString()))
							S10_METHOD_CALL_WITH_NULL_GUARD = true;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
							S10_METHOD_CALL_WITH_NULL_GUARD = true;

						if (Boolean.valueOf(particularConstructor.getInformation()
								.get("CON12_METHOD_CALL_WITH_TRY_CATCH").toString()))
							S12_METHOD_CALL_WITH_TRY_CATCH = true;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						if(particularVar!=null) {
						
						    if(Boolean.valueOf(particularVar.getInformation().get("V1_LOCAL_VAR_NOT_USED").toString()))
							    M1_LOCAL_VAR_NOT_USED = true;
						
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
							    M1_LOCAL_VAR_NOT_USED = true;
						
						    if(Boolean.valueOf(particularVar.getInformation().get("V1_LOCAL_VAR_NOT_ASSIGNED").toString()))
							    M1_LOCAL_VAR_NOT_ASSIGNED = true;

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						    	M5_SIMILAR_PRIMITIVE_TYPE_WITH_NULL_GUARD = true;
						
						    if(Boolean.valueOf(particularVar.getInformation().get("V4_Field_NOT_USED").toString()))
						    	M4_Field_NOT_USED = true;
						
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
						    	M4_Field_NOT_USED = true;
						
						    if(Boolean.valueOf(particularVar.getInformation().get("V4_Field_NOT_ASSIGNED").toString()))
						    	M4_Field_NOT_ASSIGNED = true;

```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SJavaTokenComparator.java`
#### Snippet
```java
    if (DEBUG)
     {
      System.out.println(fCount + " (" + start + "-" + length + ")>" + token + "<"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    }
    fCount++;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/entities/output/StdOutput.java`
#### Snippet
```java
	@Override
	public void generateFinalOutput(FinalResult finalResult) {
		System.out.println(finalResult);
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		for (DiffEntry de : lde) {
			if (de.getScore() >= rd.getRenameScore()) {
				System.out.println("file: " + de.getOldPath() + " copied/moved to: " + de.getNewPath() + " ");
			}
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
			JsonElement je = jp.parse(root.toString());
			String prettyJsonString = gson.toJson(je);
			System.out.println("\nJSON Code Change Frequency: (file stored at " + fileName + ")\n");
			System.out.println(prettyJsonString);
			fw.write(prettyJsonString);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
			String prettyJsonString = gson.toJson(je);
			System.out.println("\nJSON Code Change Frequency: (file stored at " + fileName + ")\n");
			System.out.println(prettyJsonString);
			fw.write(prettyJsonString);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingProperties.java`
#### Snippet
```java
	public static void main(String[] s) {
		String ss = ComingProperties.properties.getProperty("test");
		System.out.println("-->" + ss);
	}
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java

		if (cmd.hasOption("showactions")) {
			System.out.println("---");
			System.out.println("Actions available: ");
			for (ActionType a : ActionType.values()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		if (cmd.hasOption("showactions")) {
			System.out.println("---");
			System.out.println("Actions available: ");
			for (ActionType a : ActionType.values()) {
				System.out.println(a);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			System.out.println("Actions available: ");
			for (ActionType a : ActionType.values()) {
				System.out.println(a);
			}
			System.out.println("---");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
				System.out.println(a);
			}
			System.out.println("---");
			return false;
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java

		if (cmd.hasOption("showentities")) {
			System.out.println("---");
			System.out.println("Entities Type Available:");
			System.out.println("---");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		if (cmd.hasOption("showentities")) {
			System.out.println("---");
			System.out.println("Entities Type Available:");
			System.out.println("---");
			for (EntityTypeSpoon et : EntityTypeSpoon.values()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			System.out.println("---");
			System.out.println("Entities Type Available:");
			System.out.println("---");
			for (EntityTypeSpoon et : EntityTypeSpoon.values()) {
				System.out.println(et);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			System.out.println("---");
			for (EntityTypeSpoon et : EntityTypeSpoon.values()) {
				System.out.println(et);
			}
			System.out.println("---");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
				System.out.println(et);
			}
			System.out.println("---");
			return false;
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			e.printStackTrace();
		}
		System.out.println("We could not load input: " + input);
		return null;
	}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			if (Boolean.valueOf(System.getProperty("executed_by_travis"))) {
				navigatorEngine.getOutputProcessors().add(0, new NullOutput());
				System.out.println("****EXECUTED_BY_TRAVIS****");
			} else {
				navigatorEngine.getOutputProcessors().add(0, new StdOutput());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			} else {
				navigatorEngine.getOutputProcessors().add(0, new StdOutput());
				System.out.println("**NOT_EXECUTED_BY_TRAVIS**");
			}
		} else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
			return pattern;
		} catch (Exception e) {
			System.err.println("Problems parsing file " + fXmlFile);
			e.printStackTrace();
			return null;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/SpreadPatternInstanceAnalyzer.java`
#### Snippet
```java

		if (resultFromDiffAnalysis == null) {
			System.err.println("Error Diff must be executed before");
			throw new IllegalArgumentException("Error: missing diff");
		}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstanceAnalyzer.java`
#### Snippet
```java

		if (resultFromDiffAnalysis == null) {
			System.err.println("Error Diff must be executed before");
			throw new IllegalArgumentException("Error: missing diff");
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/utils/MapCounter.java`
#### Snippet
```java
	public void printSort() {
		this.entrySet().stream().sorted(Map.Entry.<K, Integer>comparingByValue().reversed())
				.forEach(System.out::println);
	}

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java

		if (resultFromDiffAnalysis == null) {
			System.err.println("Error Diff must be executed before");
			throw new IllegalArgumentException("Error: missing diff");
		}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java

		if (resultFromDiffAnalysis == null) {
			System.err.println("Error Diff must be executed before");
			throw new IllegalArgumentException("Error: missing diff");
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
			// Case: No diff detected, we return empty feature string
			if (diff.getRootOperations().size() == 0) {
				System.out.print("diff is null: " + previousVersion.getAbsolutePath());
				return features;
			}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
				generalStatsjson.add(generalStat, value);
			} catch (Exception e) {
				System.out.println("Error property: " + generalStat);
				log.error(e);
				e.printStackTrace();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				System.err.println("error caught at " + new Exception().getStackTrace()[0].toString());
				e.printStackTrace();
			}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java
        RepairEvaluator repairEvaluator = new RepairEvaluator(option);
        repairEvaluator.run();
        System.out.println("1/1 EVALUATED");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java
            sample.saveAsJson(option.featureOption);
        }
        System.out.println("1/1 EXTRACTED");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java
        FeatureLearner featureLearner = new FeatureLearner(option);
        featureLearner.run(filePaths);
        System.out.println("1/1 LEARNED");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
        commandLine.parse(args);
        if (commandLine.isUsageHelpRequested()) {
            commandLine.usage(System.out);
            return;
        } else if (commandLine.isVersionHelpRequested()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
            return;
        } else if (commandLine.isVersionHelpRequested()) {
            commandLine.printVersionHelp(System.out);
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
        if (option.dataOption == DataOption.SANER) {
            if (option.patchOption != PatchOption.SPR) {
                System.out.println("dataOption=SANER is valid only when patchOption=SPR");
                return;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
        if (option.patchOption == PatchOption.SPR) {
            if (option.featureOption == FeatureOption.S4R || option.featureOption == FeatureOption.S4RO) {
                System.out.println("patchOption=SPR is valid except when featureOption=S4R/S4RO");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java
        }

        System.out.println(option);
        System.out.println("TASK: " + cli.task.name());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/CLI.java`
#### Snippet
```java

        System.out.println(option);
        System.out.println("TASK: " + cli.task.name());

        switch (cli.task) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                        String tmpFileName = oldFile.getName().replace(".java", ".bin");
                        String vectorPath = pathName + "/" + tmpFileName;
                        System.out.println(vectorPath);
                        if (blackList.contains(vectorPath)) {
                            progressNow += 1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                        if (blackList.contains(vectorPath)) {
                            progressNow += 1;
                            System.out.println("blacklist");
                            continue;
                        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                }
                progressNow += 1;
                System.out.println(pathName + " : " + progressNow + " / " + progressAll);
            }
            Support.serialize(binFilePath, filePaths);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                        String tmpFileName = oldFile.getName().replace(".java", ".bin");
                        String vectorPath = pathName + "/" + tmpFileName;
                        System.out.println(vectorPath);
                        if (blackList.contains(vectorPath)) {
                            progressNow += 1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                        if (blackList.contains(vectorPath)) {
                            progressNow += 1;
                            System.out.println("blacklist");
                            continue;
                        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                }
                progressNow += 1;
                System.out.println(pathName + " : " + progressNow + " / " + progressAll);
            }
            Support.serialize(binFilePath, filePaths);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
                .call();

        System.out.println("Found: " + diffs.size() + " differences");
        for (DiffEntry diff : diffs) {
            System.out.println("Diff: " + diff.getChangeType() + ": " +
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
        System.out.println("Found: " + diffs.size() + " differences");
        for (DiffEntry diff : diffs) {
            System.out.println("Diff: " + diff.getChangeType() + ": " +
                    (diff.getOldPath().equals(diff.getNewPath()) ? diff.getNewPath() : diff.getOldPath() + " -> " + diff.getNewPath()));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java

        CommitDiffer commitDiffer = new CommitDiffer();
        System.out.println("Found: " + diffs.size() + " differences");
        for (DiffEntry diff : diffs) {
            if (diff.getChangeType().equals(DiffEntry.ChangeType.MODIFY)) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
                        commitDiffer.addDiffer(oldCommitName, newCommitName, oldPath, newPath, option);
                    } else {
                        System.out.println("oldPath is different from newPath");
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java

        // Display the diff
        System.out.println("Showing diff of " + path);
        DiffFormatter formatter = new DiffFormatter(System.out);
        formatter.setRepository(repo);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
        // Display the diff
        System.out.println("Showing diff of " + path);
        DiffFormatter formatter = new DiffFormatter(System.out);
        formatter.setRepository(repo);
        //noinspection ConstantConditions
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
                .findGitDir() // scan up the file system tree
                .build();
        System.out.println("Having repository: " + repository.getDirectory());

        Git git = new Git(repository);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
        RevCommit lastCommit = null;
        for (RevCommit commit : commits) {
            System.out.println("LogCommit: " + commit);
            if (lastCommit != null) {
                // why runDiff() for some commits returns "java.lang.RuntimeException: invalid diff"? (tested on the very first one case)
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
            */
        }
        System.out.println(countCommits + " Commits");
        System.out.println(countDiffers + " Differs");
        progressAll = countDiffers;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
        }
        System.out.println(countCommits + " Commits");
        System.out.println(countDiffers + " Differs");
        progressAll = countDiffers;
//        runDiff(repository, "5fddbeb678bd2c36c5e5c891ab8f2b143ced5baf", "5d7303c49ac984a9fec60523f2d5297682e16646", "README.md");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
        for (Differ differ : differs) {
            File vectorFile = new File(differ.vectorFilePath);
            System.out.println("================");
            System.out.println(differ.vectorFilePath);
            if (!vectorFile.exists()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
            File vectorFile = new File(differ.vectorFilePath);
            System.out.println("================");
            System.out.println(differ.vectorFilePath);
            if (!vectorFile.exists()) {
                File oldFile = new File(differ.oldFilePath);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
            filePaths.add(differ.vectorFilePath);
            progressNow += 1;
            System.out.println(progressNow + " / " + progressAll);
        }
        new FeatureLearner(option).run(filePaths);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
        // and using commit's tree find the path
        RevTree tree = commit.getTree();
        System.out.println("Having tree: " + tree);

        // now try to find a specific file
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataLoader.java`
#### Snippet
```java
    static Map<String, Map<File, File>> loadCLOSUREWithoutPatches(String dataPath) throws NullPointerException {
        Map<String, Map<File, File>> catalogs = new HashMap<>();
        System.out.println(dataPath);
        for (File file : new File(dataPath).listFiles((dir, name) -> !name.startsWith("."))) {
            // patchInfo
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				    }
				} catch (Throwable e) {
					System.err.println("error caught at " + new Exception().getStackTrace()[0].toString());
					e.printStackTrace();
				}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
                    break;
                default:
                    System.out.println("Out of Expectation");
                    break;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
                    break;
                default:
                    System.out.println("Out of Expectation");
                    break;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            Support.serialize(binFilePath, filePaths);
        }
        System.out.println("Distilling Json");
        for (String filePath : filePaths) {
            Sample sample = new Sample(filePath);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            sample.saveAsJson(option.featureOption);
        }
        System.out.println("Distilled Json");
        return scores4Files;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        for (String key : uniqueForeKeys) foreFiles.remove(key);
        for (String key : uniqueBackKeys) backFiles.remove(key);
        System.out.println("loaded files");

        Map<String, List<Double>> scores4ForeFiles = scoreFiles(foreOption, foreFiles);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        for (String key : uniqueForeKeys) scores4ForeFiles.remove(key);
        for (String key : uniqueBackKeys) scores4BackFiles.remove(key);
        System.out.println("scored files");

        // we only care rankings for ForeFiles
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            }
        }
        System.out.println("ranked files");

        List<Ranking> rankings = new ArrayList<>();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        String filePath = Support.getFilePath(Support.DirType.PARAMETER_DIR, option) + stringJoiner.toString();
        dumpCSV(filePath, rankings);
        System.out.println("dumped files");

        System.out.println("EvaluationResult is saved to " + filePath);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
        System.out.println("dumped files");

        System.out.println("EvaluationResult is saved to " + filePath);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/FeatureLearner.java`
#### Snippet
```java
        if (bestParameterVector != null) {
            bestParameterVector.save(parameterFilePath);
            System.out.println("ParameterVector is saved to " + parameterFilePath);
        }
    }
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/LineComparator.java`
#### Snippet
```java
  @Override
  public Fragmentable createFragmentable(String data)  {
		String dataParsed = data.replaceAll(" |\\t|\\{|\\}", "");

		return new SLineComparator(dataParsed);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
	private String getNameFromFile(File fileModif) {
		String result = getName(fileModif);
		return result.replace("_s", "").replace("_t", "");
	}

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
	private String getNameFromFile(File fileModif) {
		String result = getName(fileModif);
		return result.replace("_s", "").replace("_t", "");
	}

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/core/filter/diff/syntcomparison/SLineComparator.java`
#### Snippet
```java
    
    public SLineComparator(String data)  {
        fLines = data.split("\\r?\\n");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
			JsonObject singlediff = new JsonObject();

			singlediff.addProperty("c", key.toString().replace("Ct", "").replace("Impl", ""));
			singlediff.addProperty("f", v.toString());
			frequencyArray.add(singlediff);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
			JsonObject singlediff = new JsonObject();

			singlediff.addProperty("c", key.toString().replace("Ct", "").replace("Impl", ""));
			singlediff.addProperty("f", v.toString());
			frequencyArray.add(singlediff);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
				namePattern = nameFromSpecification;
			else
				namePattern = fXmlFile.getName().replace(".xml", "");

			// Get all entities tags
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		for (Operation opt : operations) {
			if (opt.getAction().getName().contains("INS")) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);
				targetline = targetline.replace(" ", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);
				targetline = targetline.replace(" ", "");
				if ((targetline).contains("if(true)")) {
					ifTrue = 1;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		for (Operation opt : operations) {
			if (opt.toString().contains("Update VariableRead") || opt.toString().contains("Update BinaryOperator") ) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String oldVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[0];
				String newVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[1];
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
			if (opt.toString().contains("Update VariableRead") || opt.toString().contains("Update BinaryOperator") ) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String oldVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[0];
				String newVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[1];
				newVar = newVar.replace("\n", "").trim();
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
			if (opt.toString().contains("Update VariableRead") || opt.toString().contains("Update BinaryOperator") ) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String oldVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[0];
				String newVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[1];
				newVar = newVar.replace("\n", "").trim();
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String oldVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[0];
				String newVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[1];
				newVar = newVar.replace("\n", "").trim();
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);			    
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String oldVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[0];
				String newVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[1];
				newVar = newVar.replace("\n", "").trim();
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);			    
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				String oldVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[0];
				String newVar = opt.toString().split(":")[1].split("\n\t")[1].split("to")[1];
				newVar = newVar.replace("\n", "").trim();
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);			    
				targetline = targetline.trim();
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		for (Operation opt : operations) {
			if (opt.toString().contains("Delete BinaryOperator") ) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String deletedItem = opt.toString().split("\n\t")[1];
				String sourceline = getSpecificLine(source.getPath(), Integer.parseInt(specificNo) - 1);		
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
			if (opt.toString().contains("Delete BinaryOperator") ) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String deletedItem = opt.toString().split("\n\t")[1];
				String sourceline = getSpecificLine(source.getPath(), Integer.parseInt(specificNo) - 1);		
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		for (Operation opt : operations) {
			if (opt.toString().contains("Delete BinaryOperator") ) {
				String deleted = opt.toString().split(":")[1].split("\n\t")[1];
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String sourceline = getSpecificLine(source.getPath(), Integer.parseInt(specificNo) - 1);		
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
			if (opt.toString().contains("Delete BinaryOperator") ) {
				String deleted = opt.toString().split(":")[1].split("\n\t")[1];
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String sourceline = getSpecificLine(source.getPath(), Integer.parseInt(specificNo) - 1);		
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		for (Operation opt : operations) {
			if (opt.toString().contains("Insert") ) {
				String newvar = opt.toString().split(":")[1].split("\n\t")[1];
				if(newvar.contains("this")) {
					addThis = 1;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		for (Operation opt : operations) {
			if (opt.toString().contains("Insert Literal") ) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String newLiteral = opt.toString().split(":")[1].split("\n\t")[1];
				if (!newLiteral.contains("true") && !newLiteral.contains("false")) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
			if (opt.toString().contains("Insert Literal") ) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String newLiteral = opt.toString().split(":")[1].split("\n\t")[1];
				if (!newLiteral.contains("true") && !newLiteral.contains("false")) {
					newLiteral = newLiteral.trim().replace("\n", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				String newLiteral = opt.toString().split(":")[1].split("\n\t")[1];
				if (!newLiteral.contains("true") && !newLiteral.contains("false")) {
					newLiteral = newLiteral.trim().replace("\n", "");
					
					try {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				} else {
					String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);
					targetline=targetline.replace(" ", "");
					if (targetline.contains("==true") && targetline.contains("==false")) {
						insertBooleanLiteral = 1;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		for (Operation opt : operations) {
			if (opt.getAction().getName().contains("INS")) {
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);
				targetline = targetline.replace(" ", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
				String specificNo = opt.toString().split(":")[1].split("\n\t")[0];
				String targetline = getSpecificLine(target.getPath(), Integer.parseInt(specificNo) - 1);
				targetline = targetline.replace(" ", "");
				if (opt.toString().contains("Insert If")) {
					if ((targetline).contains("if(false)")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
				}
			}
			features = features.replace("\"", "");

			// Extract repair pattern features (ADD)
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		 	String[] pathStr = patchedFile.getAbsolutePath().split("/");
		 	String fileName = pathStr[pathStr.length-1];
		 	fileName = fileName.replace(".java", "");
		 	
	        ParameterVector parameterVector = new ParameterVector(option.featureOption);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
			change.addProperty("change_type", operation.getAction().getName());
			change.addProperty("entity_type",
					operation.getSrcNode().getClass().getSimpleName().replace("Ct", "").replace("Impl", ""));

			// code source
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
			change.addProperty("change_type", operation.getAction().getName());
			change.addProperty("entity_type",
					operation.getSrcNode().getClass().getSimpleName().replace("Ct", "").replace("Impl", ""));

			// code source
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
			String[] parts = elementAsString.split("\\.");
			elementAsString = parts.length == 0 ? elementAsString : parts[parts.length - 1];
			parts = elementAsString.split(NAME_SEPARATOR);
			elementAsString = parts.length == 0 ? elementAsString : parts[parts.length - 1];

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
				parts = str.split("\\.");
				str = parts.length == 0 ? str : parts[parts.length - 1];
				parts = str.split(NAME_SEPARATOR);
				str = parts.length == 0 ? str : parts[parts.length - 1];
				if (str.equals(elementAsString)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			for (int indexbefore = 0; indexbefore < stmtsBefore.size(); indexbefore++) {
				CtElement beforeelement = stmtsBefore.get(indexbefore);
				String type = beforeelement.getClass().getSimpleName().replaceAll("Ct", "").replaceAll("Impl", "");

				if ((stmtsBefore.size() - indexbefore) == 1) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			for (int indexbefore = 0; indexbefore < stmtsBefore.size(); indexbefore++) {
				CtElement beforeelement = stmtsBefore.get(indexbefore);
				String type = beforeelement.getClass().getSimpleName().replaceAll("Ct", "").replaceAll("Impl", "");

				if ((stmtsBefore.size() - indexbefore) == 1) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			for (int indexafter = 0; indexafter < stmtsAfter.size(); indexafter++) {
				CtElement afterelement = stmtsAfter.get(indexafter);
				String type = afterelement.getClass().getSimpleName().replaceAll("Ct", "").replaceAll("Impl", "");

				if (indexafter == 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			for (int indexafter = 0; indexafter < stmtsAfter.size(); indexafter++) {
				CtElement afterelement = stmtsAfter.get(indexafter);
				String type = afterelement.getClass().getSimpleName().replaceAll("Ct", "").replaceAll("Impl", "");

				if (indexafter == 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	public void analyzeS3_TypeOfFaulty(CtElement element, Cntx<Object> context) {
		try {
			String type = element.getClass().getSimpleName().replaceAll("Ct", "").replaceAll("Impl", "");
			context.put(CodeFeatures.S3_TYPE_OF_FAULTY_STATEMENT, type);
		} catch (Throwable e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
	public void analyzeS3_TypeOfFaulty(CtElement element, Cntx<Object> context) {
		try {
			String type = element.getClass().getSimpleName().replaceAll("Ct", "").replaceAll("Impl", "");
			context.put(CodeFeatures.S3_TYPE_OF_FAULTY_STATEMENT, type);
		} catch (Throwable e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
		try {
			CtElement parentElement = getParentNotBlock(element);
			String type = parentElement.getClass().getSimpleName().replaceAll("Ct", "").replaceAll("Impl", "");
			context.put(CodeFeatures.S14_TYPE_OF_FAULTY_STATEMENT_PARENT, type);
		} catch (Throwable e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
		try {
			CtElement parentElement = getParentNotBlock(element);
			String type = parentElement.getClass().getSimpleName().replaceAll("Ct", "").replaceAll("Impl", "");
			context.put(CodeFeatures.S14_TYPE_OF_FAULTY_STATEMENT_PARENT, type);
		} catch (Throwable e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                for (File oldFile : catalog.keySet()) {
                    try {
                        String tmpFileName = oldFile.getName().replace(".java", ".bin");
                        String vectorPath = pathName + "/" + tmpFileName;
                        System.out.println(vectorPath);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                for (File oldFile : catalog.keySet()) {
                    try {
                        String tmpFileName = oldFile.getName().replace(".java", ".bin");
                        String vectorPath = pathName + "/" + tmpFileName;
                        System.out.println(vectorPath);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				boolean V18HasMethodSimilarInName = false;
				String varname= aVarAffected.getVariable().getSimpleName();
				varname=varname.replaceAll("[^a-zA-Z0-9]", "");

				for (CtInvocation invInClass : invocationsFromClass) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
					
					String varname=aVarInScope.getSimpleName();
					varname=varname.replaceAll("[^a-zA-Z0-9]", "");
					if(varname.length()>3) {
						if(methodname.toLowerCase().endsWith(varname.toLowerCase()) || methodname.toLowerCase().equals("length") ||
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
                File patchedFile = files.get(key).get(buggyFile);
                String binPath = rankingPath + patchedFile.getPath().substring(tmpPath.length());
                binPath = binPath.replace(".java", ".bin");
                Sample sample = new Sample(binPath);
                if (filePaths.contains(binPath)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
            }
            String json = new Gson().toJson(featureMatrixList);
            String jsonPath = filePath.replace("prophet4j/_BIN/", "prophet4j/_JSON/");
            jsonPath = jsonPath.replace(".bin", ".json");
            try {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
            String json = new Gson().toJson(featureMatrixList);
            String jsonPath = filePath.replace("prophet4j/_BIN/", "prophet4j/_JSON/");
            jsonPath = jsonPath.replace(".bin", ".json");
            try {
                File file = new File(jsonPath);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
            int rightIndex = filePath.lastIndexOf("/");
            String fileKey = filePath.substring(leftIndex + 1, rightIndex);
            fileKey = fileKey.replace("/", "-");
            featureMatrices.addAll(genFeatureMatrices(diff, fileKey));
        } catch (Exception e) {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
    private boolean checkEntitiesUsedOne(ChangePatternInstance instance) {
        List<Integer> ids = new ArrayList<>();
        Map<CtElement, Integer> entitiesById = new java.util.HashMap<>();
        for (PatternAction paction : instance.actionOperation.keySet()) {
            if (paction.getAction().isUnchanged()) {
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/filespair/FilePairsDiff.java`
#### Snippet
```java
			pairs.add(fpair);
		} catch (IOException e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
		} catch (Exception e) {
			log.error("Error analyzing " + diffFolder);
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		} catch (RevisionSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AmbiguousObjectException e) {
			// TODO Auto-generated catch block
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		} catch (AmbiguousObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IncorrectObjectTypeException e) {
			// TODO Auto-generated catch block
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		} catch (IncorrectObjectTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/RepositoryPGit.java`
#### Snippet
```java
		} catch (GitAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java
				} catch (Exception e1) {

					e1.printStackTrace();
				}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java
			}
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			rw.dispose();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/entities/DiffResult.java`
#### Snippet
```java
//				System.err.println("Error when printing diff result: " + e.getMessage());
				log.error("Error when printing diff result: " + e.getMessage());
				e.printStackTrace();
			}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/entities/output/JSonChangeFrequencyOutput.java`
#### Snippet
```java
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/changeminer/entity/FinalResult.java`
#### Snippet
```java
				} catch (Exception e) {
					r += "\n -Error on toString-";
					e.printStackTrace();
				}
			}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("We could not load input: " + input);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
		} catch (Exception e) {
			System.err.println("Problems parsing file " + fXmlFile);
			e.printStackTrace();
			return null;
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
						Arrays.stream(fileFromRevision.getNextVersion().split("\n")).collect(Collectors.toList()));
			} catch (DiffException e) {
				e.printStackTrace();
			}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
			} catch (Exception e) {
				log.error("Exception e: " + e);
				e.printStackTrace();

			}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/PatternInstancesFromDiff.java`
#### Snippet
```java
//				System.err.println("Error when printing diff result: " + e.getMessage());

				e.printStackTrace();
				diffString = "wrong diff";
			}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		        
				} catch(Exception e) {
					e.printStackTrace();
				}
				
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/RepairPatternFeatureAnalyzer.java`
#### Snippet
```java
			targetline = Files.readAllLines(Paths.get(filePath)).get(lineNo);
		} catch (IOException e) {
			e.printStackTrace();
			return targetline;
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allMethods;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java

		} catch (IOException e) {
			e.printStackTrace();
			log.error("Problem storing ing json file" + e.toString());
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/Cntx.java`
#### Snippet
```java
				System.out.println("Error property: " + generalStat);
				log.error(e);
				e.printStackTrace();
			}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/CodeFeatureDetector.java`
#### Snippet
```java

        } catch (Throwable e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/TypeaccessAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}	
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/repairability/RepairTools.java`
#### Snippet
```java

        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("Can't load the class corresponding to " + toolName);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/repairability/JSONRepairabilityOutput.java`
#### Snippet
```java
								opjson.addProperty("line", op.getNode().getPosition().getLine());
							} catch (UnsupportedOperationException e) {
								e.printStackTrace();
								opjson.addProperty("line", -1);
							}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}
		
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			} 		
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
						
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			} catch (Throwable e) {
				System.err.println("error caught at " + new Exception().getStackTrace()[0].toString());
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			context.put(CodeFeatures.S3_TYPE_OF_FAULTY_STATEMENT, type);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			context.put(CodeFeatures.S15_HAS_OBJECTIVE_METHOD_CALL, S15anyReturnObjective);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			context.put(CodeFeatures.S14_TYPE_OF_FAULTY_STATEMENT_PARENT, type);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/WholeStatementAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java
//            runODS2(option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/Demo.java`
#### Snippet
```java
            new Demo(option).evaluate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/repairability/repairtools/AbstractRepairTool.java`
#### Snippet
```java
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/dataset/DataManager.java`
#### Snippet
```java
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java

			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
				} catch (Throwable e) {
					System.err.println("error caught at " + new Exception().getStackTrace()[0].toString());
					e.printStackTrace();
				}
			}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		} catch (Throwable e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/Tool.java`
#### Snippet
```java
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/learner/RepairEvaluator.java`
#### Snippet
```java
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/Support.java`
#### Snippet
```java
            fis.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return strings;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/Support.java`
#### Snippet
```java
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                FileUtils.writeStringToFile(vectorFile, stringJoiner.toString(), Charset.defaultCharset(), false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                fis.close();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                parameterArray = Arrays.stream(substrings).mapToDouble(Double::valueOf).toArray();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                Files.write(Paths.get(jsonPath), json.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
            featureMatrices.addAll(genFeatureMatrices(diff, fileKey));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return featureMatrices;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                // based on L61-79 at FeaturesOnD4jTest.java
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                // based on L61-79 at FeaturesOnD4jTest.java
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/prophet4j/utility/CodeDiffer.java`
#### Snippet
```java
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            logger.log(Level.WARN, "diff.commonAncestor() returns null value");
        }
```

## RuleId[ruleID=RegExpSingleCharAlternation]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractChainedFilter()` of an abstract class should not be declared 'public'
in `src/main/java/fr/inria/coming/core/filter/AbstractChainedFilter.java`
#### Snippet
```java
	 * Define a filter which don't have any parent
	 */
	public AbstractChainedFilter() {
		this.parentFilter = new DummyFilter(); // empty object for a safe use of filters chain
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractChainedFilter()` of an abstract class should not be declared 'public'
in `src/main/java/fr/inria/coming/core/filter/AbstractChainedFilter.java`
#### Snippet
```java
	 * @param parentFilter
	 */
	public AbstractChainedFilter(IFilter parentFilter) {
		this.parentFilter = parentFilter;
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `RevisionNavigationExperiment()` of an abstract class should not be declared 'public'
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
    }

    public RevisionNavigationExperiment(RevisionOrder<R> navigationStrategy) {
        super();
        this.navigationStrategy = navigationStrategy;
```

### NonProtectedConstructorInAbstractClass
Constructor `RevisionNavigationExperiment()` of an abstract class should not be declared 'public'
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
    protected FinalResult<R> allResults = null;

    public RevisionNavigationExperiment() {
        allResults = new FinalResult<>();
    }
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Comparator() can be replaced with method reference
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
	   private static Comparator<String> getComparator()
	    {
	        Comparator<String> c = new Comparator<String>()
	        {
	            public int compare(String o1, String o2)
	            {
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
	   private static Comparator<String> getComparator()
	    {
	        Comparator<String> c = new Comparator<String>()
	        {
	            public int compare(String o1, String o2)
	            {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `elementName`
in `src/main/java/fr/inria/coming/utils/ASTInfoResolver.java`
#### Snippet
```java
	public static String getCleanedName(String elementName) {
		while (elementName.startsWith("(") && elementName.endsWith(")")) {
			elementName = elementName.substring(1, elementName.length() - 1);
		}
		if (elementName.startsWith("this.")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `elementName`
in `src/main/java/fr/inria/coming/utils/ASTInfoResolver.java`
#### Snippet
```java
		}
		if (elementName.startsWith("this.")) {
			elementName = elementName.substring("this.".length());
		}
		return elementName;
```

### AssignmentToMethodParameter
Assignment to method parameter `type1`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
				bothArray = clusterIsArray && ourIsArray;
				if (bothArray) {
					type1 = ((CtArrayTypeReference) type1).getComponentType();
					type2 = ((CtArrayTypeReference) type2).getComponentType();
				}
```

### AssignmentToMethodParameter
Assignment to method parameter `type2`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
				if (bothArray) {
					type1 = ((CtArrayTypeReference) type1).getComponentType();
					type2 = ((CtArrayTypeReference) type2).getComponentType();
				}

```

### AssignmentToMethodParameter
Assignment to method parameter `temp1`
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java

    private boolean areTheSameTemplates(String temp1, String temp2) {
        temp1 = ASTInfoResolver.getCleanedName(temp1);
        temp2 = ASTInfoResolver.getCleanedName(temp2);
        String[] parts1 = temp1.split("#");
```

### AssignmentToMethodParameter
Assignment to method parameter `temp2`
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
    private boolean areTheSameTemplates(String temp1, String temp2) {
        temp1 = ASTInfoResolver.getCleanedName(temp1);
        temp2 = ASTInfoResolver.getCleanedName(temp2);
        String[] parts1 = temp1.split("#");
        String[] parts2 = temp2.split("#");
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `src/main/java/fr/inria/coming/repairability/repairtools/Cardumen.java`
#### Snippet
```java
                    isVariableNameChar(source.charAt(ind + element.length()))))) {
                // the chars before and after the element are not a variable-name-char
                source = source.substring(0, ind) + target + (ind + element.length() >= source.length() ? "" :
                        source.substring(ind + element.length()));
                fromInd = ind + target.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `temp1`
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java

	private boolean areTheSameTemplates(String temp1, String temp2) {
		temp1 = ASTInfoResolver.getCleanedName(temp1);
		temp2 = ASTInfoResolver.getCleanedName(temp2);
		String[] parts1 = temp1.split("#");
```

### AssignmentToMethodParameter
Assignment to method parameter `temp2`
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
	private boolean areTheSameTemplates(String temp1, String temp2) {
		temp1 = ASTInfoResolver.getCleanedName(temp1);
		temp2 = ASTInfoResolver.getCleanedName(temp2);
		String[] parts1 = temp1.split("#");
		String[] parts2 = temp2.split("#");
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
					&& isVariableNameChar(source.charAt(ind + element.length()))))) {
				// the chars before and after the element are not a variable-name-char
				source = source.substring(0, ind) + target
						+ (ind + element.length() >= source.length() ? "" : source.substring(ind + element.length()));
				fromInd = ind + target.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `statements`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
				return null;

			statements = methodParent.getElements(new LineFilter());

			int objectsLastAssign = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `statements`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
				// the element is not in a method.
				return false;
			statements = methodParent.getElements(new LineFilter());

			int usedObjects = 0;
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/engine/files/FileDynamicIterator.java`
#### Snippet
```java

		} else {
			return null;
		}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/engine/filespair/FilePairsDiff.java`
#### Snippet
```java
	@Override
	public String getName() {
		return this.left != null && this.right != null ? left.getName() + "->" + right.getName() : null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/engine/filespair/FilePairsDiff.java`
#### Snippet
```java
		if (left == null || right == null) {
			log.info("files is null");
			return null;
		}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
		if (this.diffFolder == null) {
			log.info("Diff folder == null");
			return null;
		}
		List<IRevisionPair> pairs = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/engine/files/FileDiff.java`
#### Snippet
```java
	public String getName() {

		return this.diffFolder != null ? this.diffFolder.getName() : null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java
            return this.allResults;
        } else
            return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/entities/RevisionDataset.java`
#### Snippet
```java
	public Iterator<Data> getIterator() {
		if (this.data == null)
			return null;
		return this.data.iterator();

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/engine/git/CommitGit.java`
#### Snippet
```java
	public String getFolder() {
		// TODO Auto-generated method stub
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/extensionpoints/PlugInLoader.java`
#### Snippet
```java
		String property = ComingProperties.getProperty(ep.identifier);
		if (property == null || property.trim().isEmpty())
			return null;

		return loadPlugin(property, ep._class, typesConst, args);
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/entities/output/FeaturesOutput.java`
#### Snippet
```java
		if (result == null) {
			log.debug("No Code Change feature captured");
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java

		if (affectedEntity == null)
			return null;
		JsonObject jsonEntity = new JsonObject();
		jsonEntity.addProperty("entity_type", affectedEntity.getEntityType());
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/utils/ASTInfoResolver.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		boolean created = createEngine(args);
		if (!created)
			return null;

		if (args.length == 0) {
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		if (args.length == 0) {
			help();
			return null;
		}
		return start();
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java

		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
		}
		System.out.println("We could not load input: " + input);
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/main/ComingMain.java`
#### Snippet
```java
			e.printStackTrace();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/changeminer/util/PatternXMLParser.java`
#### Snippet
```java
			System.err.println("Problems parsing file " + fXmlFile);
			e.printStackTrace();
			return null;
		}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
							"FileRevision with Max number of Root AST Changes. Discating it. Total:" + operations.size()
									+ " max: " + ComingProperties.getPropertyInteger("MAX_AST_CHANGES_PER_FILE"));
					return null;
				}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/changeminer/analyzer/commitAnalyzer/FineGrainDifftAnalyzer.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/MegaDiff.java`
#### Snippet
```java
	public CtElement commonAncestor() {
		// TODO Auto-generated method stub
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/MegaDiff.java`
#### Snippet
```java
	public CtElement changedNode(Class<? extends Operation> operationWanted) {
		// TODO Auto-generated method stub
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/MegaDiff.java`
#### Snippet
```java
	public List<Operation> getOperationChildren(Operation operationParent, List<Operation> rootOperations) {
		// TODO Auto-generated method stub
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/MegaDiff.java`
#### Snippet
```java
	public CtElement changedNode() {
		// TODO Auto-generated method stub
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
			filePaths = processFilesPair(new File(path),targetFile);
		} else {
			return null;
		}		
		JsonObject jsonfile = extractFeatures(filePaths);
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		
		if(jsonfile==null) {
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
                
                if(valueList==null) {
                	return null;
                }
                
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
		if(cross) {
			jsonfile = genVectorsCSV(option,target,featureMatrix);
			return null;
		} else {
			jsonfile = getSimleP4JJSON(option,target,featureMatrix,true);
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/P4JFeatureAnalyzer.java`
#### Snippet
```java
			filePaths = processFilesPair(new File(path),"");
		} else {
			return null;
		}
		JsonObject jsonfile = extractFeatures(filePaths);
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
        }
        // Not all matched
        return null;

    }
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/utils/VariableResolver.java`
#### Snippet
```java
		if (nameConflict) {
			logger.debug("Name Conflict " + varAccessCollected);
			return null;
		}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
			
			if(expressionToStudy instanceof CtVariableAccess)
				return null;
			
			boolean hasExpressionReturnParmeterCompatible = false;
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/ExpressionAnalyzer.java`
#### Snippet
```java
		}
		
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/repairability/repairtools/NPEfix.java`
#### Snippet
```java
		MappingStore mapping = diff.getMappingsComp();
		if (!mapping.hasDst(ifTree))
			return null;
		CtElement srcNode = (CtElement) mapping.getSrc(ifTree).getMetadata("spoon_object");
		return srcNode;
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
		String patternType = instance.getPattern().getName().split(File.pathSeparator)[1];
		if(!patternType.startsWith(IF_INS_SHALLOW_PATTERN) && !patternType.startsWith(IF_INS_DEEP_PATTERN)) {
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/repairability/repairtools/Nopol.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/prophet4j/feature/S4R/S4RFeatureCross.java`
#### Snippet
```java
	public List<Feature> getSimpleP4JFeatures() {
		// TODO Auto-generated method stub
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/prophet4j/dataset/PGA.java`
#### Snippet
```java
        call();
        if (diffList.size() == 0)
            return null;
        if (diffList.size() > 1)
            throw new RuntimeException("invalid diff");
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureCross.java`
#### Snippet
```java
	public List<Feature> getSimpleP4JFeatures() {
		// TODO Auto-generated method stub
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/prophet4j/feature/S4RO/S4ROFeatureExtractor.java`
#### Snippet
```java
	public FeatureVector extractSimpleP4JFeature(Repair repair, CtElement atom) {
		// TODO Auto-generated method stub
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
		}
		
		return null;
	}
    
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureCross.java`
#### Snippet
```java
	public List<Feature> getSimpleP4JFeatures() {
		// TODO Auto-generated method stub
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureCross.java`
#### Snippet
```java
	public List<Feature> getSimpleP4JFeatures() {
		// TODO Auto-generated method stub
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
		}
		
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/prophet4j/feature/enhanced/EnhancedFeatureExtractor.java`
#### Snippet
```java
	public FeatureVector extractSimpleP4JFeature(Repair repair, CtElement atom) {
		// TODO Auto-generated method stub
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/prophet4j/feature/extended/ExtendedFeatureExtractor.java`
#### Snippet
```java
	public FeatureVector extractSimpleP4JFeature(Repair repair, CtElement atom) {
		// TODO Auto-generated method stub
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
			if (methodParent == null)
				// the element is not in a method.
				return null;

			statements = methodParent.getElements(new LineFilter());
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
			if (faultyMethodParent == null)
				// the element is not in a method.
				return null;

			// For each variable affected
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java

		if (aStatement == null)
			return null;
		if (aStatement.getParent() instanceof CtBlock)
			return getParentNotBlock(aStatement.getParent());
```

## RuleId[ruleID=UnnecessaryLocalVariable]
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
Local variable `iterator` is redundant
in `src/main/java/fr/inria/coming/core/engine/RevisionNavigationExperiment.java`
#### Snippet
```java

        Long startTime = System.currentTimeMillis();
        for (Iterator<R> iterator = it; iterator.hasNext(); ) {

            R oneRevision = iterator.next();
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
	public Diff getDiff(File left, File right, boolean includeComment) throws Exception {
		AstComparator localdiff = new AstComparator(includeComment);
		Diff d = localdiff.compare(left, right);
		return d;
	}
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
Local variable `binaryOperatorsFromFaultyLine` is redundant
in `src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
			List<CtBinaryOperator> allbinaryoperators) {

		List<CtBinaryOperator> binaryOperatorsFromFaultyLine = allbinaryoperators;
		
		for(int index=0; index<binaryOperatorsFromFaultyLine.size(); index++) {
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
Local variable `list` is redundant
in `src/main/java/fr/inria/prophet4j/utility/Structure.java`
#### Snippet
```java
        
        public List<FeatureCross> getNonSortedFeatureCrosses() {
            List<FeatureCross> list = new ArrayList<>(featureCrosses);
            return list;
        }
```

## RuleId[ruleID=UnnecessaryTemporaryOnConversionToString]
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

## RuleId[ruleID=ThrowableNotThrown]
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

## RuleId[ruleID=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `src/main/java/fr/inria/coming/utils/EntityTypesInfoResolver.java`
#### Snippet
```java

	private static void extractAndSaveCtElementsHierarchyModel(String outputPath) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File(outputPath));

		Map<String, Set> childrenToParents = new HashMap<>();
```

## RuleId[ruleID=PointlessBooleanExpression]
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

## RuleId[ruleID=UseBulkOperation]
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

## RuleId[ruleID=UnstableApiUsage]
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

