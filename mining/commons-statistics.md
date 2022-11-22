# commons-statistics 
 
# Bad smells
I found 7 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=NestedAssignment] | 2 | false |
| RuleId[ruleID=SuspiciousNameCombination] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 1 | true |
| RuleId[ruleID=ManualMinMaxCalculation] | 1 | false |
| RuleId[ruleID=ConstantMathCall] | 1 | false |
## RuleId[ruleID=SuspiciousNameCombination]
### RuleId[ruleID=SuspiciousNameCombination]
'y' should probably not be passed as parameter 'x'
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/GammaDistribution.java`
#### Snippet
```java
        // More accurate to log the density when it is finite.
        // See NUMBERS-174: 'Log of the Gamma P Derivative'
        final double p = RegularizedGamma.P.derivative(shape, y) / scale;
        if (p <= Double.MAX_VALUE && p >= Double.MIN_NORMAL) {
            return Math.log(p);
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-22-06-47-43.311.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `shape` is redundant
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/NakagamiDistribution.java`
#### Snippet
```java
        // Generate using a related Gamma distribution
        // See https://en.wikipedia.org/wiki/Nakagami_distribution#Generation
        final double shape = mu;
        final double scale = omega / mu;
        final SharedStateContinuousSampler sampler =
```

## RuleId[ruleID=ManualMinMaxCalculation]
### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.min()' call
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/TruncatedNormalDistribution.java`
#### Snippet
```java
            return lower;
        }
        return x < upper ? x : upper;
    }

```

## RuleId[ruleID=ConstantMathCall]
### RuleId[ruleID=ConstantMathCall]
Constant call to `sqrt()` can be simplified
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/LogNormalDistribution.java`
#### Snippet
```java
    private static final double HALF_LOG_TWO_PI = 0.9189385332046727417803297;
    /** &radic;(2 &pi;). */
    private static final double SQRT2PI = Math.sqrt(2 * Math.PI);
    /** The mu parameter of this distribution. */
    private final double mu;
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/AbstractDiscreteDistribution.java`
#### Snippet
```java
        long m = median;
        if (m == NO_MEDIAN) {
            median = m = inverseCumulativeProbability(0.5);
        }
        return (int) m;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/AbstractContinuousDistribution.java`
#### Snippet
```java
        double m = median;
        if (Double.isNaN(m)) {
            median = m = inverseCumulativeProbability(0.5);
        }
        return m;
```

