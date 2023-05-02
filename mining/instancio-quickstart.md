# instancio-quickstart 
 
# Bad smells
I found 2 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantMethodOverride | 1 | false |
| UNUSED_IMPORT | 1 | false |
## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `toString()` is identical to its super method
in `src/main/java/org/example/person/PhoneWithExtension.java`
#### Snippet
```java

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.time.LocalDate;`
in `src/main/java/org/example/person/Person.java`
#### Snippet
```java
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
```

