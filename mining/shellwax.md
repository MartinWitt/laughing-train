# shellwax 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shellwax4206571331938260311701831980508167675/org.eclipse.shellwax.core/src/org/eclipse/shellwax/internal/run/ShLaunchShortcut.java`
#### Snippet
```java
resource.getLocation().toFile().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shellwax4206571331938260311701831980508167675/org.eclipse.shellwax.core/src/org/eclipse/shellwax/internal/run/ShLaunchShortcut.java`
#### Snippet
```java
resource.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shellwax4206571331938260311701831980508167675/org.eclipse.shellwax.core/src/org/eclipse/shellwax/internal/run/ShLaunchShortcut.java`
#### Snippet
```java
resource.getLocation().removeLastSegments(1).toString()
```

