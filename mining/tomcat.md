# tomcat 
 
# Bad smells
I found 79 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=RegExpSimplifiable] | 27 | false |
| RuleId[ruleID=RegExpRedundantNestedCharacterClass] | 26 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 19 | false |
| RuleId[ruleID=RegExpSingleCharAlternation] | 7 | false |
## RuleId[ruleID=RegExpSimplifiable]
### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `java/jakarta/servlet/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
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

### RuleId[ruleID=RegExpSimplifiable]
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

## RuleId[ruleID=RegExpSingleCharAlternation]
### RuleId[ruleID=RegExpSingleCharAlternation]
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

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `java/jakarta/servlet/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
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

### RuleId[ruleID=RegExpSingleCharAlternation]
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

### RuleId[ruleID=RegExpSingleCharAlternation]
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

### RuleId[ruleID=RegExpSingleCharAlternation]
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

### RuleId[ruleID=RegExpSingleCharAlternation]
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

## RuleId[ruleID=RegExpRedundantNestedCharacterClass]
### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
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

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
        </xsd:restriction>

```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
        </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
        </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `java/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java
        </xsd:annotation>
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
        </xsd:restriction>

```

