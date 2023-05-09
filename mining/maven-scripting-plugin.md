# maven-scripting-plugin 
 
# Bad smells
I found 3 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 1 | false |
| DataFlowIssue | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/scripting/FileScriptEvaluator.java`
#### Snippet
```java
            int position = extension.indexOf(".");

            if (position >= 0) {
                extension = extension.substring(position + 1);
            }
            result = manager.getEngineByExtension(extension);

            if (result == null) {
                throw new UnsupportedScriptEngineException("No engine found by extension \"" + extension + "\n");
            }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `is` might be null
in `src/main/java/org/apache/maven/plugins/scripting/ResourceScriptEvaluator.java`
#### Snippet
```java

        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream(resourceName);
                Reader reader = new InputStreamReader(is)) {
            return engine.eval(reader, context);
        } catch (IOException ex) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/maven/plugins/scripting/EvalMojo.java`
#### Snippet
```java
     * When scriptFile provided the script is ignored.
     * The file name extension identifies the script language to use, as of javax.script.ScriptEngineManager
     * and {@linkplain "https://jcp.org/aboutJava/communityprocess/final/jsr223/index.html"}
     */
    @Parameter
```

