# openjdk-jdk20u 
 
# Bad smells
I found 10 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RegExpSimplifiable | 6 | false |
| DuplicatedCode | 2 | false |
| RegExpRedundantNestedCharacterClass | 2 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/jdk.javadoc/share/classes/jdk/javadoc/internal/doclets/formats/html/resources/script-dir/jquery-ui.css`
#### Snippet
```java
/*! jQuery UI - v1.13.1 - 2022-05-12
* http://jqueryui.com
* Includes: core.css, autocomplete.css, menu.css
```

### DuplicatedCode
Duplicated code
in `test/langtools/jdk/javadoc/doclet/testOptions/custom-stylesheet.css`
#### Snippet
```java
    background-color:#4D7A97;
    color:#FFFFFF;
    float:left;
    padding:0;
    width:100%;
    clear:right;
    height:2.8em;
    padding-top:10px;
    overflow:hidden;
    font-size:12px; 
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[:]` can be simplified to ':'
in `test/jaxp/javax/xml/jaxp/unittest/stream/XMLStreamReaderTest/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `test/jaxp/javax/xml/jaxp/unittest/stream/XMLStreamReaderTest/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `test/jaxp/javax/xml/jaxp/unittest/validation/Bug6773084.xsd`
#### Snippet
```java
        <xs:simpleType>
            <xs:restriction base="xs:string">
                <xs:pattern value="[A-Z]{0,1}"/>
            </xs:restriction>
        </xs:simpleType>
```

### RegExpSimplifiable
`[-]` can be simplified to '-'
in `test/jaxp/javax/xml/jaxp/unittest/validation/tck/Bug6970890_1.xsd`
#### Snippet
```java
<xsd:simpleType name="Regex">
       <xsd:restriction base="xsd:string">
           <xsd:pattern value="[-]"/>
       </xsd:restriction>
</xsd:simpleType>
```

### RegExpSimplifiable
`[-]` can be simplified to '-'
in `test/jaxp/javax/xml/jaxp/unittest/validation/tck/Bug6970890.xsd`
#### Snippet
```java
  <xs:simpleType>
    <xs:restriction base='xs:string'>
      <xs:pattern value='a[-]?c'/>
    </xs:restriction>
  </xs:simpleType>
```

### RegExpSimplifiable
`[\w]` can be simplified to '\\w'
in `test/jaxp/javax/xml/jaxp/unittest/validation/tck/reZ003.xsd`
#### Snippet
```java
 <xs:simpleType>
  <xs:restriction base="xs:string">
   <xs:pattern value="[\w]"/>
  </xs:restriction>
 </xs:simpleType>
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `test/jaxp/javax/xml/jaxp/unittest/stream/XMLStreamReaderTest/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `test/jaxp/javax/xml/jaxp/unittest/stream/XMLStreamReaderTest/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

