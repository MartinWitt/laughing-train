# spring-todo-app 
 
# Bad smells
I found 3 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| OptionalGetWithoutIsPresent | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `TodoApplication` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/azure/spring/samples/TodoApplication.java`
#### Snippet
```java

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/azure/spring/samples/controller/TodoListController.java`
#### Snippet
```java
        logger.info("GET request access '/api/todolist/{}' path.", index);
        try {
            return new ResponseEntity<TodoItem>(todoItemRepository.findById(index).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(index + " not found", HttpStatus.NOT_FOUND);
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `iterable != null` is always `true`
in `src/main/java/com/azure/spring/samples/controller/TodoListController.java`
#### Snippet
```java
            List<TodoItem> todoItems = new ArrayList<>();
            Iterable<TodoItem> iterable = todoItemRepository.findAll();
            if (iterable != null) {
                iterable.forEach(todoItems::add);
            }
```

