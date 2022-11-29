# commons-statistics 
 
# Bad smells
I found 8 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NestedAssignment | 2 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| SuspiciousNameCombination | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| ConstantMathCall | 1 | false |
## RuleId[ruleID=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/ParetoDistribution.java`
#### Snippet
```java
        // Note: For small shape the input RNG is also wrapped to use nextLong as the source of
        // randomness; this ensures the nextDouble method uses the interface output of [0, 1).
        final UniformRandomProvider wrappedRng = shape >= 1 ? new InvertedRNG(rng) : rng::nextLong;
        return InverseTransformParetoSampler.of(wrappedRng, scale, shape)::sample;
    }
```

## RuleId[ruleID=SuspiciousNameCombination]
### SuspiciousNameCombination
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
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-29-21-36-56.539.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
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
### ManualMinMaxCalculation
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
### ConstantMathCall
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
### NestedAssignment
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

### NestedAssignment
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

