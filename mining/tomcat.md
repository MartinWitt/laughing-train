# tomcat 
 
# Bad smells
I found 321 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| WebProperties | 226 | false |
| RegExpSimplifiable | 27 | false |
| RegExpRedundantNestedCharacterClass | 26 | false |
| RegExpRedundantEscape | 19 | false |
| RegExpSingleCharAlternation | 7 | false |
| ConstantValue | 4 | false |
| ServletWithoutMappingInspection | 4 | false |
| IfStatementWithIdenticalBranches | 3 | false |
| InnerClassMayBeStatic | 2 | true |
| DuplicatedCode | 1 | false |
| DataFlowIssue | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `webapps/host-manager/css/manager.css`
#### Snippet
```java
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `java/jakarta/servlet/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `java/jakarta/servlet/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `java/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `java/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `java/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `java/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:string">
            <xsd:pattern value="[^\s]+" />
        </xsd:restriction>
    </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `webapps/manager/WEB-INF/jsp/sessionDetail.jsp`
#### Snippet
```java
</head>
<body>
<% if (currentHttpSession == null) { %>
   <h1><%=currentSessionId%></h1>
<% } else { %>
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `webapps/examples/jsp/forward/forward.jsp`
#### Snippet
```java
   double totlMem = Runtime.getRuntime().totalMemory();
   double percent = freeMem/totlMem;
   if (percent < 0.5) {
%>

```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `webapps/examples/jsp/security/protected/index.jsp`
#### Snippet
```java
<%
  Principal p = request.getUserPrincipal();
  if (!(p instanceof TomcatPrincipal)) {
%>
<p>The principal does not support attributes.</p>
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `webapps/examples/jsp/error/err.jsp`
#### Snippet
```java
          if (foo.getName().equalsIgnoreCase("integra"))
              name = "acura";
          if (name.equalsIgnoreCase("acura")) {
    %>

```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/jakarta/servlet/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/jakarta/servlet/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:string">
            <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?" />
        </xsd:restriction>
    </xsd:simpleType>
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Bug54241` may be 'static'
in `test/webapp/bug5nnnn/bug54241b.jsp`
#### Snippet
```java
--%>
<%!
  class Bug54241 {
    public String toString() {
      return null;
```

### InnerClassMayBeStatic
Inner class `Bug54338` may be 'static'
in `test/webapp/bug5nnnn/bug54338.jsp`
#### Snippet
```java
--%>
<%!
  public class Bug54338 {
    private int answer;
    public int getAnswer() { return answer; }
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
        </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `currentSessionId` initializer `null` is redundant
in `webapps/manager/WEB-INF/jsp/sessionDetail.jsp`
#### Snippet
```java
   ContextName cn = new ContextName(path, version);
   Session currentSession = (Session)request.getAttribute("currentSession");
   String currentSessionId = null;
   HttpSession currentHttpSession = null;
   if (currentSession != null) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `1==2` is always `false`
in `test/webapp/bug49nnn/bug49799.jsp`
#### Snippet
```java
</jsp:element>
<jsp:element name="p">
  <jsp:attribute name="style" omit="<%=(1==2)%>">color:red</jsp:attribute>
  <jsp:body>04-Red</jsp:body>
</jsp:element>
```

### ConstantValue
Condition `1==1` is always `true`
in `test/webapp/bug49nnn/bug49799.jsp`
#### Snippet
```java
</jsp:element>
<jsp:element name="p">
  <jsp:attribute name="style" omit="<%=(1==1)%>">color:red</jsp:attribute>
  <jsp:body>05-Not Red</jsp:body>
</jsp:element>
```

### ConstantValue
Condition is always true
in `test/webapp/bug5nnnn/bug56581.jsp`
#### Snippet
```java
  out.print(" Hello world!\n");
}
if (true) throw new RuntimeException("Oops. Testing exception handling.");
for (int i=0; i<1000; i++) {
  out.print(i);
```

### ConstantValue
Value `nullString` is always 'null'
in `test/webapp/bug5nnnn/bug54241a.jsp`
#### Snippet
```java
    <p>01: <%= (Object) null %></p>
    <!-- JspWriter.print(String) is defined to print null for a null String -->
    <p>02: <%= nullString %></p>
  </body>
</html>
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `ve` in RegExp
in `java/jakarta/servlet/jsp/resources/jspxml.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base = "xsd:anyURI">
      <xsd:pattern value = "&RelativeURL;"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `java/jakarta/servlet/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `java/jakarta/servlet/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `java/jakarta/servlet/resources/web-common_6_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `java/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `java/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `java/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `java/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `java/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `java/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `java/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `java/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `java/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `java/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `java/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `java/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
        </xsd:restriction>

```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
        </xsd:restriction>

```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
        </xsd:restriction>

```

## RuleId[id=ServletWithoutMappingInspection]
### ServletWithoutMappingInspection
Servlet should have a mapping
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <servlet>
    <servlet-name>jsp</servlet-name>
      <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
      <init-param>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <!-- Define example filters -->
    <filter>
        <filter-name>Timing Filter</filter-name>
        <filter-class>filters.ExampleFilter</filter-class>
        <init-param>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>Request Dumper Filter</filter-name>
        <filter-class>org.apache.catalina.filters.RequestDumperFilter</filter-class>
    </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java

    <filter>
        <filter-name>Compression Filter</filter-name>
        <filter-class>compressionFilters.CompressionFilter</filter-class>
        <init-param>
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'org'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'servlets'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class 'DefaultServlet'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'jasper'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class 'JspServlet'
in `conf/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'test'
in `test/org/apache/catalina/startup/web-1lifecyclecallback.xml`
#### Snippet
```java
  metadata-complete="true">
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct</lifecycle-callback-method>
  </post-construct>
```

### WebProperties
Cannot resolve class 'TestServlet'
in `test/org/apache/catalina/startup/web-1lifecyclecallback.xml`
#### Snippet
```java
  metadata-complete="true">
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct</lifecycle-callback-method>
  </post-construct>
```

### WebProperties
Cannot resolve method 'postConstruct()'
in `test/org/apache/catalina/startup/web-1lifecyclecallback.xml`
#### Snippet
```java
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct</lifecycle-callback-method>
  </post-construct>
  <pre-destroy>
```

### WebProperties
Cannot resolve class or package 'test'
in `test/org/apache/catalina/startup/web-1lifecyclecallback.xml`
#### Snippet
```java
  </post-construct>
  <pre-destroy>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>preDestroy</lifecycle-callback-method>
  </pre-destroy>
```

### WebProperties
Cannot resolve class 'TestServlet'
in `test/org/apache/catalina/startup/web-1lifecyclecallback.xml`
#### Snippet
```java
  </post-construct>
  <pre-destroy>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>preDestroy</lifecycle-callback-method>
  </pre-destroy>
```

### WebProperties
Cannot resolve method 'preDestroy()'
in `test/org/apache/catalina/startup/web-1lifecyclecallback.xml`
#### Snippet
```java
  <pre-destroy>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>preDestroy</lifecycle-callback-method>
  </pre-destroy>
</web-app>
```

### WebProperties
Cannot resolve class or package 'test'
in `test/org/apache/catalina/startup/web-2lifecyclecallback.xml`
#### Snippet
```java
  metadata-complete="true">
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct1</lifecycle-callback-method>
  </post-construct>
```

### WebProperties
Cannot resolve class 'TestServlet'
in `test/org/apache/catalina/startup/web-2lifecyclecallback.xml`
#### Snippet
```java
  metadata-complete="true">
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct1</lifecycle-callback-method>
  </post-construct>
```

### WebProperties
Cannot resolve method 'postConstruct1()'
in `test/org/apache/catalina/startup/web-2lifecyclecallback.xml`
#### Snippet
```java
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct1</lifecycle-callback-method>
  </post-construct>
  <post-construct>
```

### WebProperties
Cannot resolve class or package 'test'
in `test/org/apache/catalina/startup/web-2lifecyclecallback.xml`
#### Snippet
```java
  </post-construct>
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct2</lifecycle-callback-method>
  </post-construct>
```

### WebProperties
Cannot resolve class 'TestServlet'
in `test/org/apache/catalina/startup/web-2lifecyclecallback.xml`
#### Snippet
```java
  </post-construct>
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct2</lifecycle-callback-method>
  </post-construct>
```

### WebProperties
Cannot resolve method 'postConstruct2()'
in `test/org/apache/catalina/startup/web-2lifecyclecallback.xml`
#### Snippet
```java
  <post-construct>
    <lifecycle-callback-class>test.TestServlet</lifecycle-callback-class>
    <lifecycle-callback-method>postConstruct2</lifecycle-callback-method>
  </post-construct>
</web-app>
```

### WebProperties
Cannot resolve class or package 'org'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>jsp</servlet-name>
      <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
      <init-param>
        <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>jsp</servlet-name>
      <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
      <init-param>
        <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'jasper'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>jsp</servlet-name>
      <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
      <init-param>
        <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>jsp</servlet-name>
      <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
      <init-param>
        <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class 'JspServlet'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>jsp</servlet-name>
      <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
      <init-param>
        <param-name>fork</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter-name>Bug49922</filter-name>
    <filter-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Filter
    </filter-class>
  </filter>
```

### WebProperties
Cannot resolve class or package 'apache'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter-name>Bug49922</filter-name>
    <filter-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Filter
    </filter-class>
  </filter>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter-name>Bug49922</filter-name>
    <filter-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Filter
    </filter-class>
  </filter>
```

### WebProperties
Cannot resolve class or package 'core'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter-name>Bug49922</filter-name>
    <filter-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Filter
    </filter-class>
  </filter>
```

### WebProperties
Cannot resolve class 'TestStandardContext'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter-name>Bug49922</filter-name>
    <filter-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Filter
    </filter-class>
  </filter>
```

### WebProperties
Cannot resolve class 'Bug49922Filter'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter-name>Bug49922</filter-name>
    <filter-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Filter
    </filter-class>
  </filter>
```

### WebProperties
Cannot resolve class or package 'org'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Forward</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922ForwardServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'apache'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Forward</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922ForwardServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Forward</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922ForwardServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'core'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Forward</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922ForwardServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class 'TestStandardContext'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Forward</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922ForwardServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class 'Bug49922ForwardServlet'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Forward</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922ForwardServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Include</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922IncludeServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'apache'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Include</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922IncludeServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Include</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922IncludeServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'core'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Include</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922IncludeServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class 'TestStandardContext'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Include</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922IncludeServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class 'Bug49922IncludeServlet'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Include</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922IncludeServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Target</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922TargetServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'apache'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Target</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922TargetServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Target</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922TargetServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'core'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Target</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922TargetServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class 'TestStandardContext'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Target</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922TargetServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class 'Bug49922TargetServlet'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922Target</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922TargetServlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'org'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Servlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'apache'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Servlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Servlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'core'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Servlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class 'TestStandardContext'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Servlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve class 'Bug49922Servlet'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet-name>Bug49922</servlet-name>
    <servlet-class>
      org.apache.catalina.core.TestStandardContext$Bug49922Servlet
    </servlet-class>
  </servlet>
```

### WebProperties
Cannot resolve directory 'bug5nnnn'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <jsp-property-group>
      <url-pattern>/bug5nnnn/bug55262.jsp</url-pattern>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
```

### WebProperties
Cannot resolve file 'bug55262-prelude.jspf'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <jsp-property-group>
      <url-pattern>/bug5nnnn/bug55262.jsp</url-pattern>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
```

### WebProperties
Cannot resolve directory 'bug5nnnn'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
      <url-pattern>/bug5nnnn/bug55262.jsp</url-pattern>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
```

### WebProperties
Cannot resolve file 'bug55262-prelude.jspf'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
      <url-pattern>/bug5nnnn/bug55262.jsp</url-pattern>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
```

### WebProperties
Cannot resolve directory 'bug5nnnn'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <default-content-type>text/plain</default-content-type>
```

### WebProperties
Cannot resolve file 'bug55262-coda.jspf'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <default-content-type>text/plain</default-content-type>
```

### WebProperties
Cannot resolve directory 'bug5nnnn'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <default-content-type>text/plain</default-content-type>
    </jsp-property-group>
```

### WebProperties
Cannot resolve file 'bug55262-coda.jspf'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
      <include-prelude>/bug5nnnn/bug55262-prelude.jspf</include-prelude>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <include-coda>/bug5nnnn/bug55262-coda.jspf</include-coda>
      <default-content-type>text/plain</default-content-type>
    </jsp-property-group>
```

### WebProperties
Cannot resolve class or package 'org'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DenyByAnnotation</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$DenyAllServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'apache'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DenyByAnnotation</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$DenyAllServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DenyByAnnotation</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$DenyAllServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'core'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DenyByAnnotation</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$DenyAllServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'TestStandardWrapper'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DenyByAnnotation</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$DenyAllServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class 'DenyAllServlet'
in `test/webapp/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>DenyByAnnotation</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$DenyAllServlet</servlet-class>
  </servlet>
  <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'org'
in `test/webapp-servletsecurity-a/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>RoleProtected</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$RoleAllowServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class or package 'apache'
in `test/webapp-servletsecurity-a/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>RoleProtected</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$RoleAllowServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class or package 'catalina'
in `test/webapp-servletsecurity-a/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>RoleProtected</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$RoleAllowServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class or package 'core'
in `test/webapp-servletsecurity-a/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>RoleProtected</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$RoleAllowServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class 'TestStandardWrapper'
in `test/webapp-servletsecurity-a/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>RoleProtected</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$RoleAllowServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class 'RoleAllowServlet'
in `test/webapp-servletsecurity-a/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>RoleProtected</servlet-name>
    <servlet-class>org.apache.catalina.core.TestStandardWrapper$RoleAllowServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class or package 'org'
in `modules/cxf/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java
        <servlet-name>ApacheTomcatCXFServlet</servlet-name>
        <display-name>Apache Tomcat CXF Servlet</display-name>
        <servlet-class>org.apache.cxf.cdi.CXFCdiServlet</servlet-class>    
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'apache'
in `modules/cxf/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java
        <servlet-name>ApacheTomcatCXFServlet</servlet-name>
        <display-name>Apache Tomcat CXF Servlet</display-name>
        <servlet-class>org.apache.cxf.cdi.CXFCdiServlet</servlet-class>    
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'cxf'
in `modules/cxf/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java
        <servlet-name>ApacheTomcatCXFServlet</servlet-name>
        <display-name>Apache Tomcat CXF Servlet</display-name>
        <servlet-class>org.apache.cxf.cdi.CXFCdiServlet</servlet-class>    
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'cdi'
in `modules/cxf/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java
        <servlet-name>ApacheTomcatCXFServlet</servlet-name>
        <display-name>Apache Tomcat CXF Servlet</display-name>
        <servlet-class>org.apache.cxf.cdi.CXFCdiServlet</servlet-class>    
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class 'CXFCdiServlet'
in `modules/cxf/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java
        <servlet-name>ApacheTomcatCXFServlet</servlet-name>
        <display-name>Apache Tomcat CXF Servlet</display-name>
        <servlet-class>org.apache.cxf.cdi.CXFCdiServlet</servlet-class>    
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'mypackage'
in `webapps/docs/appdev/sample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>HelloServlet</servlet-name>
        <servlet-class>mypackage.Hello</servlet-class>
    </servlet>

```

### WebProperties
Cannot resolve class 'Hello'
in `webapps/docs/appdev/sample/web/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>HelloServlet</servlet-name>
        <servlet-class>mypackage.Hello</servlet-class>
    </servlet>

```

### WebProperties
Cannot resolve directory 'WEB-INF'
in `webapps/docs/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>

```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/docs/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>

```

### WebProperties
Cannot resolve file '403.jsp'
in `webapps/docs/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>

```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Manager</servlet-name>
    <servlet-class>org.apache.catalina.manager.ManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Manager</servlet-name>
    <servlet-class>org.apache.catalina.manager.ManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Manager</servlet-name>
    <servlet-class>org.apache.catalina.manager.ManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'manager'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Manager</servlet-name>
    <servlet-class>org.apache.catalina.manager.ManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class 'ManagerServlet'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Manager</servlet-name>
    <servlet-class>org.apache.catalina.manager.ManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.HTMLManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.HTMLManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.HTMLManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'manager'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.HTMLManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class 'HTMLManagerServlet'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.HTMLManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Status</servlet-name>
    <servlet-class>org.apache.catalina.manager.StatusManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Status</servlet-name>
    <servlet-class>org.apache.catalina.manager.StatusManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Status</servlet-name>
    <servlet-class>org.apache.catalina.manager.StatusManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'manager'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Status</servlet-name>
    <servlet-class>org.apache.catalina.manager.StatusManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class 'StatusManagerServlet'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Status</servlet-name>
    <servlet-class>org.apache.catalina.manager.StatusManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>JMXProxy</servlet-name>
    <servlet-class>org.apache.catalina.manager.JMXProxyServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>JMXProxy</servlet-name>
    <servlet-class>org.apache.catalina.manager.JMXProxyServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>JMXProxy</servlet-name>
    <servlet-class>org.apache.catalina.manager.JMXProxyServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class or package 'manager'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>JMXProxy</servlet-name>
    <servlet-class>org.apache.catalina.manager.JMXProxyServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class 'JMXProxyServlet'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>JMXProxy</servlet-name>
    <servlet-class>org.apache.catalina.manager.JMXProxyServlet</servlet-class>
  </servlet>

```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class or package 'filters'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class 'CsrfPreventionFilter'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve class or package 'filters'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve class 'HttpHeaderSecurityFilter'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve directory 'WEB-INF'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>401</error-code>
    <location>/WEB-INF/jsp/401.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>401</error-code>
    <location>/WEB-INF/jsp/401.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve file '401.jsp'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>401</error-code>
    <location>/WEB-INF/jsp/401.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve directory 'WEB-INF'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve file '403.jsp'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve directory 'WEB-INF'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>404</error-code>
    <location>/WEB-INF/jsp/404.jsp</location>
  </error-page>

```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>404</error-code>
    <location>/WEB-INF/jsp/404.jsp</location>
  </error-page>

```

### WebProperties
Cannot resolve file '404.jsp'
in `webapps/manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>404</error-code>
    <location>/WEB-INF/jsp/404.jsp</location>
  </error-page>

```

### WebProperties
Cannot resolve class or package 'filters'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Timing Filter</filter-name>
        <filter-class>filters.ExampleFilter</filter-class>
        <init-param>
            <param-name>attribute</param-name>
```

### WebProperties
Cannot resolve class 'ExampleFilter'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Timing Filter</filter-name>
        <filter-class>filters.ExampleFilter</filter-class>
        <init-param>
            <param-name>attribute</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Request Dumper Filter</filter-name>
        <filter-class>org.apache.catalina.filters.RequestDumperFilter</filter-class>
    </filter>

```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Request Dumper Filter</filter-name>
        <filter-class>org.apache.catalina.filters.RequestDumperFilter</filter-class>
    </filter>

```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Request Dumper Filter</filter-name>
        <filter-class>org.apache.catalina.filters.RequestDumperFilter</filter-class>
    </filter>

```

### WebProperties
Cannot resolve class or package 'filters'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Request Dumper Filter</filter-name>
        <filter-class>org.apache.catalina.filters.RequestDumperFilter</filter-class>
    </filter>

```

### WebProperties
Cannot resolve class 'RequestDumperFilter'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Request Dumper Filter</filter-name>
        <filter-class>org.apache.catalina.filters.RequestDumperFilter</filter-class>
    </filter>

```

### WebProperties
Cannot resolve class or package 'compressionFilters'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Compression Filter</filter-name>
        <filter-class>compressionFilters.CompressionFilter</filter-class>
        <init-param>
            <param-name>compressionThreshold</param-name>
```

### WebProperties
Cannot resolve class 'CompressionFilter'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>Compression Filter</filter-name>
        <filter-class>compressionFilters.CompressionFilter</filter-class>
        <init-param>
            <param-name>compressionThreshold</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>HTTP header security filter</filter-name>
        <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
        <async-supported>true</async-supported>
        <init-param>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>HTTP header security filter</filter-name>
        <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
        <async-supported>true</async-supported>
        <init-param>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>HTTP header security filter</filter-name>
        <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
        <async-supported>true</async-supported>
        <init-param>
```

### WebProperties
Cannot resolve class or package 'filters'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>HTTP header security filter</filter-name>
        <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
        <async-supported>true</async-supported>
        <init-param>
```

### WebProperties
Cannot resolve class 'HttpHeaderSecurityFilter'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>HTTP header security filter</filter-name>
        <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
        <async-supported>true</async-supported>
        <init-param>
```

### WebProperties
Cannot resolve class or package 'listeners'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <!-- Define example application events listeners -->
    <listener>
        <listener-class>listeners.ContextListener</listener-class>
    </listener>
    <listener>
```

### WebProperties
Cannot resolve class 'ContextListener'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <!-- Define example application events listeners -->
    <listener>
        <listener-class>listeners.ContextListener</listener-class>
    </listener>
    <listener>
```

### WebProperties
Cannot resolve class or package 'listeners'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    </listener>
    <listener>
        <listener-class>listeners.SessionListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class 'SessionListener'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    </listener>
    <listener>
        <listener-class>listeners.SessionListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class or package 'async'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <!-- Define listeners required by examples -->
    <listener>
        <listener-class>async.AsyncStockContextListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class 'AsyncStockContextListener'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <!-- Define listeners required by examples -->
    <listener>
        <listener-class>async.AsyncStockContextListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class 'ServletToJsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>ServletToJsp</servlet-name>
      <servlet-class>ServletToJsp</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class or package 'compressionFilters'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>CompressionFilterTestServlet</servlet-name>
        <servlet-class>compressionFilters.CompressionFilterTestServlet</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'CompressionFilterTestServlet'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>CompressionFilterTestServlet</servlet-name>
        <servlet-class>compressionFilters.CompressionFilterTestServlet</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'HelloWorldExample'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>HelloWorldExample</servlet-name>
        <servlet-class>HelloWorldExample</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'RequestInfoExample'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>RequestInfoExample</servlet-name>
        <servlet-class>RequestInfoExample</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'RequestHeaderExample'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>RequestHeaderExample</servlet-name>
        <servlet-class>RequestHeaderExample</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'RequestParamExample'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>RequestParamExample</servlet-name>
        <servlet-class>RequestParamExample</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'CookieExample'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>CookieExample</servlet-name>
        <servlet-class>CookieExample</servlet-class>
    </servlet>
    <servlet>
```

### WebProperties
Cannot resolve class 'SessionExample'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>SessionExample</servlet-name>
        <servlet-class>SessionExample</servlet-class>
    </servlet>

```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
            <page-encoding>ISO-8859-1</page-encoding>
            <scripting-invalid>true</scripting-invalid>
            <include-prelude>/jsp/jsp2/misc/prelude.jspf</include-prelude>
            <include-coda>/jsp/jsp2/misc/coda.jspf</include-coda>
        </jsp-property-group>
```

### WebProperties
Cannot resolve directory 'jsp2'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
            <page-encoding>ISO-8859-1</page-encoding>
            <scripting-invalid>true</scripting-invalid>
            <include-prelude>/jsp/jsp2/misc/prelude.jspf</include-prelude>
            <include-coda>/jsp/jsp2/misc/coda.jspf</include-coda>
        </jsp-property-group>
```

### WebProperties
Cannot resolve directory 'misc'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
            <page-encoding>ISO-8859-1</page-encoding>
            <scripting-invalid>true</scripting-invalid>
            <include-prelude>/jsp/jsp2/misc/prelude.jspf</include-prelude>
            <include-coda>/jsp/jsp2/misc/coda.jspf</include-coda>
        </jsp-property-group>
```

### WebProperties
Cannot resolve file 'prelude.jspf'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
            <page-encoding>ISO-8859-1</page-encoding>
            <scripting-invalid>true</scripting-invalid>
            <include-prelude>/jsp/jsp2/misc/prelude.jspf</include-prelude>
            <include-coda>/jsp/jsp2/misc/coda.jspf</include-coda>
        </jsp-property-group>
```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
            <scripting-invalid>true</scripting-invalid>
            <include-prelude>/jsp/jsp2/misc/prelude.jspf</include-prelude>
            <include-coda>/jsp/jsp2/misc/coda.jspf</include-coda>
        </jsp-property-group>
    </jsp-config>
```

### WebProperties
Cannot resolve directory 'jsp2'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
            <scripting-invalid>true</scripting-invalid>
            <include-prelude>/jsp/jsp2/misc/prelude.jspf</include-prelude>
            <include-coda>/jsp/jsp2/misc/coda.jspf</include-coda>
        </jsp-property-group>
    </jsp-config>
```

### WebProperties
Cannot resolve directory 'misc'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
            <scripting-invalid>true</scripting-invalid>
            <include-prelude>/jsp/jsp2/misc/prelude.jspf</include-prelude>
            <include-coda>/jsp/jsp2/misc/coda.jspf</include-coda>
        </jsp-property-group>
    </jsp-config>
```

### WebProperties
Cannot resolve file 'coda.jspf'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
            <scripting-invalid>true</scripting-invalid>
            <include-prelude>/jsp/jsp2/misc/prelude.jspf</include-prelude>
            <include-coda>/jsp/jsp2/misc/coda.jspf</include-coda>
        </jsp-property-group>
    </jsp-config>
```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
      <realm-name>Example Form-Based Authentication Area</realm-name>
      <form-login-config>
        <form-login-page>/jsp/security/protected/login.jsp</form-login-page>
        <form-error-page>/jsp/security/protected/error.jsp</form-error-page>
      </form-login-config>
```

### WebProperties
Cannot resolve directory 'security'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
      <realm-name>Example Form-Based Authentication Area</realm-name>
      <form-login-config>
        <form-login-page>/jsp/security/protected/login.jsp</form-login-page>
        <form-error-page>/jsp/security/protected/error.jsp</form-error-page>
      </form-login-config>
```

### WebProperties
Cannot resolve directory 'protected'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
      <realm-name>Example Form-Based Authentication Area</realm-name>
      <form-login-config>
        <form-login-page>/jsp/security/protected/login.jsp</form-login-page>
        <form-error-page>/jsp/security/protected/error.jsp</form-error-page>
      </form-login-config>
```

### WebProperties
Cannot resolve file 'login.jsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
      <realm-name>Example Form-Based Authentication Area</realm-name>
      <form-login-config>
        <form-login-page>/jsp/security/protected/login.jsp</form-login-page>
        <form-error-page>/jsp/security/protected/error.jsp</form-error-page>
      </form-login-config>
```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
      <form-login-config>
        <form-login-page>/jsp/security/protected/login.jsp</form-login-page>
        <form-error-page>/jsp/security/protected/error.jsp</form-error-page>
      </form-login-config>
    </login-config>
```

### WebProperties
Cannot resolve directory 'security'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
      <form-login-config>
        <form-login-page>/jsp/security/protected/login.jsp</form-login-page>
        <form-error-page>/jsp/security/protected/error.jsp</form-error-page>
      </form-login-config>
    </login-config>
```

### WebProperties
Cannot resolve directory 'protected'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
      <form-login-config>
        <form-login-page>/jsp/security/protected/login.jsp</form-login-page>
        <form-error-page>/jsp/security/protected/error.jsp</form-error-page>
      </form-login-config>
    </login-config>
```

### WebProperties
Cannot resolve file 'error.jsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
      <form-login-config>
        <form-login-page>/jsp/security/protected/login.jsp</form-login-page>
        <form-error-page>/jsp/security/protected/error.jsp</form-error-page>
      </form-login-config>
    </login-config>
```

### WebProperties
Cannot resolve class or package 'async'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>async0</servlet-name>
      <servlet-class>async.Async0</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class 'Async0'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>async0</servlet-name>
      <servlet-class>async.Async0</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'async'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>async1</servlet-name>
      <servlet-class>async.Async1</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class 'Async1'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>async1</servlet-name>
      <servlet-class>async.Async1</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'async'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>async2</servlet-name>
      <servlet-class>async.Async2</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class 'Async2'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>async2</servlet-name>
      <servlet-class>async.Async2</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'async'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>async3</servlet-name>
      <servlet-class>async.Async3</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class 'Async3'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>async3</servlet-name>
      <servlet-class>async.Async3</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'async'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>stock</servlet-name>
      <servlet-class>async.AsyncStockServlet</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class 'AsyncStockServlet'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>stock</servlet-name>
      <servlet-class>async.AsyncStockServlet</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'nonblocking'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>bytecounter</servlet-name>
      <servlet-class>nonblocking.ByteCounter</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class 'ByteCounter'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>bytecounter</servlet-name>
      <servlet-class>nonblocking.ByteCounter</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'nonblocking'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>numberwriter</servlet-name>
      <servlet-class>nonblocking.NumberWriter</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class 'NumberWriter'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>numberwriter</servlet-name>
      <servlet-class>nonblocking.NumberWriter</servlet-class>
      <async-supported>true</async-supported>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'http2'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>simpleimagepush</servlet-name>
      <servlet-class>http2.SimpleImagePush</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'SimpleImagePush'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>simpleimagepush</servlet-name>
      <servlet-class>http2.SimpleImagePush</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'trailers'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>responsetrailer</servlet-name>
      <servlet-class>trailers.ResponseTrailers</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class 'ResponseTrailers'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
      <servlet-name>responsetrailer</servlet-name>
      <servlet-class>trailers.ResponseTrailers</servlet-class>
    </servlet>
    <servlet-mapping>
```

### WebProperties
Cannot resolve class or package 'websocket'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <!-- Websocket examples -->
    <listener>
        <listener-class>websocket.drawboard.DrawboardContextListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class or package 'drawboard'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <!-- Websocket examples -->
    <listener>
        <listener-class>websocket.drawboard.DrawboardContextListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class 'DrawboardContextListener'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <!-- Websocket examples -->
    <listener>
        <listener-class>websocket.drawboard.DrawboardContextListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve directory 'WEB-INF'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <error-page>
        <error-code>403</error-code>
        <location>/WEB-INF/jsp/403.jsp</location>
    </error-page>

```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <error-page>
        <error-code>403</error-code>
        <location>/WEB-INF/jsp/403.jsp</location>
    </error-page>

```

### WebProperties
Cannot resolve file '403.jsp'
in `webapps/examples/WEB-INF/web.xml`
#### Snippet
```java
    <error-page>
        <error-code>403</error-code>
        <location>/WEB-INF/jsp/403.jsp</location>
    </error-page>

```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'manager'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'host'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class 'HostManagerServlet'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLHostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HTMLHostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLHostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HTMLHostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLHostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HTMLHostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'manager'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLHostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HTMLHostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'host'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLHostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HTMLHostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class 'HTMLHostManagerServlet'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>HTMLHostManager</servlet-name>
    <servlet-class>org.apache.catalina.manager.host.HTMLHostManagerServlet</servlet-class>
    <init-param>
      <param-name>debug</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class or package 'filters'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class 'CsrfPreventionFilter'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>CSRF</filter-name>
    <filter-class>org.apache.catalina.filters.CsrfPreventionFilter</filter-class>
    <init-param>
      <param-name>entryPoints</param-name>
```

### WebProperties
Cannot resolve class or package 'org'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve class or package 'filters'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve class 'HttpHeaderSecurityFilter'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>HTTP header security filter</filter-name>
    <filter-class>org.apache.catalina.filters.HttpHeaderSecurityFilter</filter-class>
    <init-param>
      <param-name>hstsEnabled</param-name>
```

### WebProperties
Cannot resolve directory 'WEB-INF'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>401</error-code>
    <location>/WEB-INF/jsp/401.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>401</error-code>
    <location>/WEB-INF/jsp/401.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve file '401.jsp'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>401</error-code>
    <location>/WEB-INF/jsp/401.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve directory 'WEB-INF'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve file '403.jsp'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>403</error-code>
    <location>/WEB-INF/jsp/403.jsp</location>
  </error-page>
  <error-page>
```

### WebProperties
Cannot resolve directory 'WEB-INF'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>404</error-code>
    <location>/WEB-INF/jsp/404.jsp</location>
  </error-page>

```

### WebProperties
Cannot resolve directory 'jsp'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>404</error-code>
    <location>/WEB-INF/jsp/404.jsp</location>
  </error-page>

```

### WebProperties
Cannot resolve file '404.jsp'
in `webapps/host-manager/WEB-INF/web.xml`
#### Snippet
```java
  <error-page>
    <error-code>404</error-code>
    <location>/WEB-INF/jsp/404.jsp</location>
  </error-page>

```

