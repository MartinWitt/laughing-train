# vsminecraft 
 
# Bad smells
I found 2 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RegExpRedundantEscape | 2 | false |
## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\-` in RegExp
in `dependencies/protobuf-net/TestWcfClient/Service References/ServiceReference1/Service1.xsd`
#### Snippet
```java
  <xs:simpleType name="duration">
    <xs:restriction base="xs:duration">
      <xs:pattern value="\-?P(\d*D)?(T(\d*H)?(\d*M)?(\d*(\.\d*)?S)?)?" />
      <xs:minInclusive value="-P10675199DT2H48M5.4775808S" />
      <xs:maxInclusive value="P10675199DT2H48M5.4775807S" />
```

### RegExpRedundantEscape
Redundant character escape `\-` in RegExp
in `dependencies/protobuf-net/demo-rpc-client-silverlight/Service References/Northwind/service1.xsd`
#### Snippet
```java
  <xs:simpleType name="duration">
    <xs:restriction base="xs:duration">
      <xs:pattern value="\-?P(\d*D)?(T(\d*H)?(\d*M)?(\d*(\.\d*)?S)?)?" />
      <xs:minInclusive value="-P10675199DT2H48M5.4775808S" />
      <xs:maxInclusive value="P10675199DT2H48M5.4775807S" />
```

