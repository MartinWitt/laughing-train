# todo-app-java-on-azure 
 
# Bad smells
I found 2 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `TodoApplication` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/azure/sample/TodoApplication.java`
#### Snippet
```java

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/microsoft/azure/sample/controller/TodoListController.java`
#### Snippet
```java
    public ResponseEntity<?> getTodoItem(@PathVariable("index") String index) {
        try {
            return new ResponseEntity<TodoItem>(todoItemRepository.findById(index).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(index + " not found", HttpStatus.NOT_FOUND);
```

