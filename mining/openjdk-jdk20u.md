# openjdk-jdk20u 
 
# Bad smells
I found 8 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RegExpSimplifiable | 6 | false |
| RegExpRedundantNestedCharacterClass | 2 | false |
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

