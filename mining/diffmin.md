# diffmin 
 
# Bad smells
I found 17 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 10 | false |
| RuleId[ruleID=SystemOutErr] | 2 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 1 | false |
| RuleId[ruleID=SetReplaceableByEnumSet] | 1 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 1 | false |
## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `matches`
in `src/main/java/com/diffmin/SpoonMapping.java`
#### Snippet
```java
                        inferAdditionalMappings(srcAndDst.getFirst(), srcAndDst.getSecond()));
            }
            matches = newMatches;
        }
    }
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/diffmin/Main.java`
#### Snippet
```java
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println("Usage: DiffSpoon <file_1>  <file_2>");
            System.exit(1);
        }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/diffmin/Main.java`
#### Snippet
```java
        }
        CtModel patchedCtModel = Main.patchAndGenerateModel(new File(args[0]), new File(args[1]));
        System.out.println(SpoonUtil.prettyPrintModelWithSingleCompilationUnit(patchedCtModel));
        System.exit(0);
    }
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-18-09-29-42.464.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/diffmin/Main.java`
#### Snippet
```java

/** Main execution of generating and applying patch. */
class Main {

    /**
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### RuleId[ruleID=SetReplaceableByEnumSet]
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java
            case MODIFIER:
                if (toBeInserted instanceof CtVirtualElement) {
                    Set<ModifierKind> newModifiers = new HashSet<>();
                    for (Object modifierKind : ((CtVirtualElement) toBeInserted).getChildren()) {
                        newModifiers.add((ModifierKind) modifierKind);
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java

    private static void performMovement(
            Pair<CtElement, ImmutableTriple<Integer, CtElement, CtElement>> movePatch) {
        CtElement toBeDeleted = movePatch.getFirst();
        ImmutableTriple<Integer, CtElement, CtElement> toBeInserted = movePatch.getSecond();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java
    /** Apply all the patches generated. */
    public static void applyPatch(
            List<CtElement> deletePatches,
            List<Pair<CtElement, CtElement>> updatePatches,
            List<ImmutableTriple<Integer, CtElement, CtElement>> insertPatches,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Pair`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java
    public static void applyPatch(
            List<CtElement> deletePatches,
            List<Pair<CtElement, CtElement>> updatePatches,
            List<ImmutableTriple<Integer, CtElement, CtElement>> insertPatches,
            List<Pair<CtElement, ImmutableTriple<Integer, CtElement, CtElement>>> movePatches) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Pair`>
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java
            List<Pair<CtElement, CtElement>> updatePatches,
            List<ImmutableTriple<Integer, CtElement, CtElement>> insertPatches,
            List<Pair<CtElement, ImmutableTriple<Integer, CtElement, CtElement>>> movePatches) {
        deletePatches.forEach(PatchApplication::performDeletion);
        updatePatches.forEach(PatchApplication::performUpdating);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    private static void performInsertion(
            ImmutableTriple<Integer, CtElement, CtElement> insertPatch) {
        int where = insertPatch.left;
        CtElement toBeInserted = insertPatch.middle;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    private static void performInsertion(
            ImmutableTriple<Integer, CtElement, CtElement> insertPatch) {
        int where = insertPatch.left;
        CtElement toBeInserted = insertPatch.middle;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java

    /** Apply the update patch. */
    private static void performUpdating(Pair<CtElement, CtElement> updatePatch) {
        CtElement prevNode = updatePatch.getFirst();
        CtElement newNode = updatePatch.getSecond();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java

    /** Apply the update patch. */
    private static void performUpdating(Pair<CtElement, CtElement> updatePatch) {
        CtElement prevNode = updatePatch.getFirst();
        CtElement newNode = updatePatch.getSecond();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Pair`
in `src/main/java/com/diffmin/SpoonMapping.java`
#### Snippet
```java
     * @param matches Pairs of matched nodes, as computed by GumTree/gumtree-spoon-ast-diff.
     */
    private void inferAdditionalMappings(List<Pair<CtElement, CtElement>> matches) {
        while (!matches.isEmpty()) {
            List<Pair<CtElement, CtElement>> newMatches = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Operation`
in `src/main/java/com/diffmin/patch/PatchGeneration.java`
#### Snippet
```java

    @SuppressWarnings("rawtypes")
    private boolean isRootOperation(Operation<?> operation, List<Operation> rootOperations) {
        // assuming that insert, delete, and move root operations are correctly computed by
        // gumtree-spoon-ast-diff
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`OptionalInt.getAsInt()` without 'isPresent()' check
in `src/main/java/com/diffmin/patch/PatchGeneration.java`
#### Snippet
```java
                                    .filter((i) -> newCollectionList.get(i) == srcNode)
                                    .findFirst()
                                    .getAsInt();
                        }
                        return -1;
```

