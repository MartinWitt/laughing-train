# maven-scripting-plugin 
 
# Bad smells
I found 16 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 15 | false |
| DataFlowIssue | 1 | false |
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.scripting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/StringScriptEvaluator.java`
#### Snippet
```java
     * @param context the script context.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/StringScriptEvaluator.java`
#### Snippet
```java
     * @param context the script context.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/StringScriptEvaluator.java`
#### Snippet
```java
     * @param context the script context.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.scripting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/StringScriptEvaluator.java`
#### Snippet
```java
     * @param manager the script engine manager.
     * @throws UnsupportedScriptEngineException if the engineName is not supported
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#getEngine(javax.script.ScriptEngineManager)
     */
    protected ScriptEngine getEngine(ScriptEngineManager manager) throws UnsupportedScriptEngineException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/StringScriptEvaluator.java`
#### Snippet
```java
     * @param manager the script engine manager.
     * @throws UnsupportedScriptEngineException if the engineName is not supported
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#getEngine(javax.script.ScriptEngineManager)
     */
    protected ScriptEngine getEngine(ScriptEngineManager manager) throws UnsupportedScriptEngineException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.scripting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/ResourceScriptEvaluator.java`
#### Snippet
```java
     * @param manager the script engine manager
     * @throws UnsupportedScriptEngineException if specified engine is not available
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#getEngine(javax.script.ScriptEngineManager)
     */
    protected ScriptEngine getEngine(ScriptEngineManager manager) throws UnsupportedScriptEngineException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/ResourceScriptEvaluator.java`
#### Snippet
```java
     * @param manager the script engine manager
     * @throws UnsupportedScriptEngineException if specified engine is not available
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#getEngine(javax.script.ScriptEngineManager)
     */
    protected ScriptEngine getEngine(ScriptEngineManager manager) throws UnsupportedScriptEngineException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.scripting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/ResourceScriptEvaluator.java`
#### Snippet
```java
     * @return the result of the scriptFile.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/ResourceScriptEvaluator.java`
#### Snippet
```java
     * @return the result of the scriptFile.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/ResourceScriptEvaluator.java`
#### Snippet
```java
     * @return the result of the scriptFile.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.scripting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/FileScriptEvaluator.java`
#### Snippet
```java
     * @return the result of the scriptFile.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/FileScriptEvaluator.java`
#### Snippet
```java
     * @return the result of the scriptFile.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/FileScriptEvaluator.java`
#### Snippet
```java
     * @return the result of the scriptFile.
     * @throws ScriptException if an error occurs in script.
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#eval(javax.script.ScriptEngine, javax.script.ScriptContext)
     */
    protected Object eval(ScriptEngine engine, ScriptContext context) throws ScriptException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.scripting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/FileScriptEvaluator.java`
#### Snippet
```java
     * @param manager the script engine manager
     * @throws UnsupportedScriptEngineException if specified engine is not available
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#getEngine(javax.script.ScriptEngineManager)
     */
    protected ScriptEngine getEngine(ScriptEngineManager manager) throws UnsupportedScriptEngineException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.script` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/scripting/FileScriptEvaluator.java`
#### Snippet
```java
     * @param manager the script engine manager
     * @throws UnsupportedScriptEngineException if specified engine is not available
     * @see org.apache.maven.plugins.scripting.AbstractScriptEvaluator#getEngine(javax.script.ScriptEngineManager)
     */
    protected ScriptEngine getEngine(ScriptEngineManager manager) throws UnsupportedScriptEngineException {
```

