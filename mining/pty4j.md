# pty4j 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-pty4j9196913551604222324329489487562901634/src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
INSTANCE.winpty_conin_name(winpty).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-pty4j9196913551604222324329489487562901634/src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
INSTANCE.winpty_conout_name(winpty).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-pty4j9196913551604222324329489487562901634/src/com/pty4j/windows/WinPty.java`
#### Snippet
```java
INSTANCE.winpty_conerr_name(winpty).toString()
```

