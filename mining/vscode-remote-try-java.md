# vscode-remote-try-java 
 
# Bad smells
I found 2 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/mycompany/app/App.java`
#### Snippet
```java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");
    }
}
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `App` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/mycompany/app/App.java`
#### Snippet
```java
package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");
```

