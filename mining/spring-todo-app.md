# spring-todo-app 
 
# Bad smells
I found 2 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `logger` may be 'final'
in `src/main/java/com/azure/spring/samples/controller/TodoListController.java`
#### Snippet
```java
public class TodoListController {

    private static Logger logger = LoggerFactory.getLogger(TodoListController.class);

    @Autowired
```

## RuleId[id=OptionalGetWithoutIsPresent]
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

