# diffmin 
 
# Bad smells
I found 17 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 10 | false |
| SystemOutErr | 2 | false |
| AssignmentToMethodParameter | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
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
### SystemOutErr
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

### SystemOutErr
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
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-26-15-24-09.809.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/diffmin/Main.java`
#### Snippet
```java

/** Main execution of generating and applying patch. */
class Main {

    /**
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
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
### BoundedWildcard
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

### BoundedWildcard
Can generalize to `? extends Operation`
in `src/main/java/com/diffmin/patch/PatchGeneration.java`
#### Snippet
```java

    @SuppressWarnings("rawtypes")
    private boolean isRootOperation(Operation<?> operation, List<Operation> rootOperations) {
        // assuming that insert, delete, and move root operations are correctly computed by
        // gumtree-spoon-ast-diff
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java

    /** Apply the update patch. */
    private static void performUpdating(Pair<CtElement, CtElement> updatePatch) {
        CtElement prevNode = updatePatch.getFirst();
        CtElement newNode = updatePatch.getSecond();
```

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java

    /** Apply the update patch. */
    private static void performUpdating(Pair<CtElement, CtElement> updatePatch) {
        CtElement prevNode = updatePatch.getFirst();
        CtElement newNode = updatePatch.getSecond();
```

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
Can generalize to `? extends CtElement`
in `src/main/java/com/diffmin/patch/PatchApplication.java`
#### Snippet
```java

    private static void performMovement(
            Pair<CtElement, ImmutableTriple<Integer, CtElement, CtElement>> movePatch) {
        CtElement toBeDeleted = movePatch.getFirst();
        ImmutableTriple<Integer, CtElement, CtElement> toBeInserted = movePatch.getSecond();
```

### BoundedWildcard
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

### BoundedWildcard
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

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
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

