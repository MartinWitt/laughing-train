# stateful-java-web-app 
 
# Bad smells
I found 8 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 2 | false |
| WrongPackageStatement | 2 | false |
| RedundantFieldInitialization | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/microsoft/webapp/samples/PageVisits.java`
#### Snippet
```java
    public static final Logger LOG = LogManager.getLogger(com.microsoft.webapp.samples.PageVisits.class);

    private int pageViews = 0;

    /**
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `env.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java

        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            if (envName.startsWith("WEBSITE")) {
                buffer.append(String.format("%s = %s%n",
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
        out.println("Your IP Address = " + request.getRemoteAddr() + "<br>");

        StringBuffer buffer = new StringBuffer();
        buffer.append("<br>");
        buffer.append("<hr>");
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/webapp/samples/PageVisits.java`
#### Snippet
```java
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/webapp/samples/PageVisits.java`
#### Snippet
```java
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        LOG.info("=========================================");
        LOG.info("Writing out Page Visit into output stream");
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
         */

        out.println(buffer.toString());

        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'com.microsoft.webapp.samples' does not correspond to the file path 'main.java.com.microsoft.webapp.samples'
in `src/main/java/com/microsoft/webapp/samples/TrackerServlet.java`
#### Snippet
```java
 */

package com.microsoft.webapp.samples;

import java.io.IOException;
```

### WrongPackageStatement
Package name 'com.microsoft.webapp.samples' does not correspond to the file path 'main.java.com.microsoft.webapp.samples'
in `src/main/java/com/microsoft/webapp/samples/PageVisits.java`
#### Snippet
```java
 */

package com.microsoft.webapp.samples;

import java.io.IOException;
```

