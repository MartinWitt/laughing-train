# commons-statistics 
 
# Bad smells
I found 10 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NestedAssignment | 3 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| SuspiciousNameCombination | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
| ConstantMathCall | 1 | false |
| ManualMinMaxCalculation | 1 | false |
## RuleId[ruleID=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/ParetoDistribution.java`
#### Snippet
```java
        // randomness; this ensures the nextDouble method uses the interface output of [0, 1).
        // Commons RNG v1.6 uses nextLong and will not be affected by changes to nextDouble.
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
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-12-29-09-27-51.987.html`
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

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `commons-statistics-ranking/src/main/java/org/apache/commons/statistics/ranking/NaturalRanking.java`
#### Snippet
```java
        if (nonNanSize == 0) {
            // Either NaN are left in-place or removed
            return nanStrategy == NaNStrategy.FIXED ? data : new double[0];
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

### NestedAssignment
Result of assignment expression used
in `commons-statistics-ranking/src/main/java/org/apache/commons/statistics/ranking/NaturalRanking.java`
#### Snippet
```java
        if (r == null) {
            // Default to a SplittableRandom
            randomIntFunction = r = new SplittableRandom()::nextInt;
        }
        return r;
```

