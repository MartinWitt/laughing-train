# Change Log
## The following bad smells are found in the code:
### Non-Protected-Constructor-in-Abstract-Class
- Constructor `SoraldAbstractProcessor()` of an abstract class should not be declared 'public'in `sorald.processor.SoraldAbstractProcessor`
### Unnecessary-Interface-Modifier
- Modifier `public` is redundant for interface methodsin `sorald.annotations.ProcessorAnnotation`
- Modifier `public` is redundant for interface methodsin `sorald.annotations.ProcessorAnnotation`
### ParameterNameDiffersFromOverriddenParameter
- Parameter name `element` is different from parameter 'e' overriddenin `sorald.processor.SoraldAbstractProcessor`
- Parameter name `element` is different from parameter 'candidate' overriddenin `sorald.processor.SoraldAbstractProcessor`
- Parameter name `metricKey` is different from parameter 's' overriddenin `sorald.sonar.RuleVerifier`
- Parameter name `line` is different from parameter 'i' overriddenin `sorald.sonar.RuleVerifier`
- Parameter name `value` is different from parameter 's1' overriddenin `sorald.sonar.RuleVerifier`
- Parameter name `metricKey` is different from parameter 's' overriddenin `sorald.sonar.RuleVerifier`
- Parameter name `line` is different from parameter 'i' overriddenin `sorald.sonar.RuleVerifier`
- Parameter name `value` is different from parameter 'i1' overriddenin `sorald.sonar.RuleVerifier`
- Parameter name `o` is different from parameter 'obj' overriddenin `sorald.sonar.SonarRule`
- Parameter name `rules` is different from parameter 'rule' overriddenin `sorald.sonar.SonarStaticAnalyzer`
