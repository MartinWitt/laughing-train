# commons-statistics 
 
# Bad smells
I found 54 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SuspiciousNameCombination | 15 | false |
| NestedAssignment | 9 | false |
| ManualMinMaxCalculation | 8 | false |
| UnnecessaryLocalVariable | 7 | true |
| RedundantMethodOverride | 2 | false |
| EmptyMethod | 2 | false |
| DuplicateExpressions | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| PointlessArithmeticExpression | 1 | false |
| CommentedOutCode | 1 | false |
| ReturnNull | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| ConstantMathCall | 1 | false |
| NumericOverflow | 1 | false |
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

### SuspiciousNameCombination
'x' should probably not be passed as parameter 'y'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovDistribution.java`
#### Snippet
```java
                e = fpow.pow(z.hi(), z.lo(), n, z);
                // x in (1/n, 1 - 1/n) so the divide of the fraction is safe
                DD.divide(z.hi(), z.lo(), x, 0, z);
                e += DD.frexp(z.hi(), z.lo(), z);
            }
```

### SuspiciousNameCombination
'x' should probably not be passed as parameter 'y'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovDistribution.java`
#### Snippet
```java
                // T = ((n-j)/n - x)^(n-j)
                DD.uncheckedDivide(j, n, z);
                DD.fastAdd(z.hi(), z.lo(), x, z);
                final long es = fpow.pow(z.hi(), z.lo(), j - 1, z);
                final double s = z.hi();
```

### SuspiciousNameCombination
'x' should probably not be passed as parameter 'y'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovDistribution.java`
#### Snippet
```java
            // this is safe as long as x does not approach a sub-normal.
            // Typically x in (1/n, 1 - 1/n).
            DD.multiply(sum.hi(), sum.lo(), x, sum);
            // Rescale the result
            DD.ldexp(sum.hi(), sum.lo(), (int) esum, sum);
```

### SuspiciousNameCombination
'x' should probably not be passed as parameter 'y'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovDistribution.java`
#### Snippet
```java
            // Described on page 14 in van Mulbregt [1].
            // nx = U+V (exact)
            DD.twoProd(n, x, z);
            final double u = z.hi();
            final double v = z.lo();
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/TTest.java`
#### Snippet
```java
        final long n2 = checkSampleSize(y.length);
        final double m1 = StatisticUtils.mean(x);
        final double m2 = StatisticUtils.mean(y);
        final double v1 = StatisticUtils.variance(x, m1);
        final double v2 = StatisticUtils.variance(y, m2);
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/TTest.java`
#### Snippet
```java
        final double m2 = StatisticUtils.mean(y);
        final double v1 = StatisticUtils.variance(x, m1);
        final double v2 = StatisticUtils.variance(y, m2);
        return equalVariances ?
            computeHomoscedasticT(mu, m1, v1, n1, m2, v2, n2) :
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/TTest.java`
#### Snippet
```java
        final long n2 = checkSampleSize(y.length);
        final double m1 = StatisticUtils.mean(x);
        final double m2 = StatisticUtils.mean(y);
        final double v1 = StatisticUtils.variance(x, m1);
        final double v2 = StatisticUtils.variance(y, m2);
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/TTest.java`
#### Snippet
```java
        final double m2 = StatisticUtils.mean(y);
        final double v1 = StatisticUtils.variance(x, m1);
        final double v2 = StatisticUtils.variance(y, m2);
        double t;
        double df;
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/DD.java`
#### Snippet
```java
        final double q0 = x / y;
        // remainder r0 = x - q0 * y
        multiply(y, yy, q0, q);
        add(-q.hi, -q.lo, x, xx, q);
        final double r = q.hi;
```

### SuspiciousNameCombination
'x' should probably not be passed as parameter 'y'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/DD.java`
#### Snippet
```java
        // remainder r0 = x - q0 * y
        multiply(y, yy, q0, q);
        add(-q.hi, -q.lo, x, xx, q);
        final double r = q.hi;
        final double rr = q.lo;
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/DD.java`
#### Snippet
```java
        final double q1 = r / y;
        // remainder r1 = r0 - q1 * y
        multiply(y, yy, q1, q);
        add(-q.hi, -q.lo, r, rr, q);
        // next quotient q2 = r1 / y
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/DD.java`
#### Snippet
```java
        final double q0 = 1 / y;
        // remainder r0 = x - q0 * y
        multiply(y, yy, q0, q);
        // This add saves 2 twoSum and 2 fastTwoSum (18 FLOPS)
        add(-q.hi, -q.lo, 1, q);
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/DD.java`
#### Snippet
```java
        final double q1 = r / y;
        // remainder r1 = r0 - q1 * y
        multiply(y, yy, q1, q);
        add(-q.hi, -q.lo, r, rr, q);
        // next quotient q2 = r1 / y
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
        // Sort the sample arrays
        sort(x, SAMPLE_1_NAME);
        sort(y, SAMPLE_2_NAME);
        final int n = x.length;
        final int m = y.length;
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `getStatistic()` only delegates to its super method
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/MannWhitneyUTest.java`
#### Snippet
```java
         */
        @Override
        public double getStatistic() {
            // Note: This method is here for documentation
            return super.getStatistic();
```

### RedundantMethodOverride
Method `getStatistic()` only delegates to its super method
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
         */
        @Override
        public double getStatistic() {
            // Note: This method is here for documentation
            return super.getStatistic();
```

## RuleId[ruleID=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`xy - xy` can be replaced with '0.0'
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/DD.java`
#### Snippet
```java
        if (isNotNormal(xy)) {
            // Returns 0.0 for sub-normal xy, otherwise NaN for inf/nan:
            z.lo = xy - xy;
            return z;
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
in `commons-statistics-ranking/src/main/java/org/apache/commons/statistics/ranking/NaturalRanking.java`
#### Snippet
```java
        if (r == null) {
            // Default to a SplittableRandom
            randomIntFunction = r = new SplittableRandom()::nextInt;
        }
        return r;
```

### NestedAssignment
Result of assignment expression used
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/WilcoxonSignedRankTest.java`
#### Snippet
```java
        final double[] u = new double[t + 1];
        // Initialize u_1(t) using base cases for recursion
        u[0] = u[1] = 1;

        // Each u_n(t) is created using the current correct values for u_{n-1}(t)
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
in `commons-statistics-distribution/src/main/java/org/apache/commons/statistics/distribution/HypergeometricDistribution.java`
#### Snippet
```java
                p1 = p0;
            }
            midpoint = v = new double[] {x, p1};
        }
        return v;
```

### NestedAssignment
Result of assignment expression used
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/MannWhitneyUTest.java`
#### Snippet
```java
                        f[x] = Arrays.copyOf(f[x], sn);
                        for (int y = n1; y < sn; y++) {
                            final double[] b = f[x][y] = new double[sk];
                            initialize(b);
                        }
```

### NestedAssignment
Result of assignment expression used
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/MannWhitneyUTest.java`
#### Snippet
```java
                    for (int x = 0; x < m1; x++) {
                        for (int y = 0; y < n1; y++) {
                            final double[] b = f[x][y] = Arrays.copyOf(f[x][y], sk);
                            for (int z = k1; z < sk; z++) {
                                b[z] = UNSET;
```

### NestedAssignment
Result of assignment expression used
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/MannWhitneyUTest.java`
#### Snippet
```java
            // Recursion from formula (3):
            // f(m, n, k) = f(m-1, n, k-n) + f(m, n-1, k)
            f[m][n][k] = fmnk = fmnk(f, m - 1, n, k - n) + fmnk(f, m, n - 1, k);
        }
        return fmnk;
```

### NestedAssignment
Result of assignment expression used
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
        } else {
            final boolean exact = method == PValueMethod.EXACT;
            p = p2 = twoSampleP(dnm, n, m, gcd, d, exact);
            if (significantTies) {
                // Compute the upper bound on D.
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
            val = startJ == 0 ? 0 : 1;

            //assert startJ == 0 || Math.abs(im - (startJ - 1) * (long) n) >= dnm : "|im - jn| < dnm for j < startJ";
            //assert endJ > m || Math.abs(im - endJ * (long) n) >= dnm : "|im - jn| < dnm for j >= endJ";
            for (int j = startJ; j < endJ; j++) {
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
Method only calls its super
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
         */
        @Override
        public double getStatistic() {
            // Note: This method is here for documentation
            return super.getStatistic();
```

### EmptyMethod
Method only calls its super
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/MannWhitneyUTest.java`
#### Snippet
```java
         */
        @Override
        public double getStatistic() {
            // Note: This method is here for documentation
            return super.getStatistic();
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/OneWayAnova.java`
#### Snippet
```java
        if (statistic != null) {
            statistic[0] = f;
            return null;
        }
        final double p = FDistribution.of(dfbg, dfwg).survivalProbability(f);
```

## RuleId[ruleID=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `o * Math.log(o / e)`
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/GTest.java`
#### Snippet
```java
            if (o > e) {
                // Positive term
                sum.add(o * Math.log(o / e));
            } else if (o > 0) {
                // Negative term
```

### DuplicateExpressions
Multiple occurrences of `o * Math.log(o / e)`
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/GTest.java`
#### Snippet
```java
                // Negative term
                // Process non-zero counts to avoid 0 * -inf = NaN
                sum2.add(o * Math.log(o / e));
            }
        }
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `d1` is redundant
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/TTest.java`
#### Snippet
```java
                                    double v2, long n2) {
        // Sample sizes are specified as a double to avoid integer overflow
        final double d1 = n1;
        final double d2 = n2;
        return (((v1 / d1) + (v2 / d2)) * ((v1 / d1) + (v2 / d2))) /
```

### UnnecessaryLocalVariable
Local variable `d2` is redundant
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/TTest.java`
#### Snippet
```java
        // Sample sizes are specified as a double to avoid integer overflow
        final double d1 = n1;
        final double d2 = n2;
        return (((v1 / d1) + (v2 / d2)) * ((v1 / d1) + (v2 / d2))) /
            ((v1 * v1) / (d1 * d1 * (n1 - 1)) + (v2 * v2) / (d2 * d2 * (n2 - 1)));
```

### UnnecessaryLocalVariable
Local variable `b` is redundant
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/OneWayAnova.java`
#### Snippet
```java
            // a is an estimate of the between-group variance
            final double a = (msbg - mswg) / nO;
            final double b = mswg;
            return a / (a + b);
        }
```

### UnnecessaryLocalVariable
Local variable `hi` is redundant
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/StatisticUtils.java`
#### Snippet
```java
    private static void add(DD sum, long v) {
        // Split into hi and lo parts so the high part has 53-bits
        final double hi = v;
        final long lo = v - (long) hi;
        // The condition here is a high probability branch if the sample is
```

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

### UnnecessaryLocalVariable
Local variable `lm` is redundant
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java

        // Normalized by binom(m+n, n). Check this is possible.
        final long lm = m;
        if (n + lm > Integer.MAX_VALUE) {
            return -1;
```

### UnnecessaryLocalVariable
Local variable `nd` is redundant
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
    private double computeStatistic(double[] x, DoubleUnaryOperator cdf, int[] sign) {
        final int n = checkArrayLength(x);
        final double nd = n;
        final double[] sx = sort(x.clone(), "Sample");
        // Note: ties in the data do not matter as we compare the empirical CDF
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `sd |= sdN <= SD_MAX_TERMS && n >= SD_MIN_N`
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovDistribution.java`
#### Snippet
```java
                sd = sdN <= 1;
                // Otherwise when x < 4 / n
                sd |= sdN <= SD_MAX_TERMS && n >= SD_MIN_N;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `growM | growN | growK`
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/MannWhitneyUTest.java`
#### Snippet
```java
            final boolean growN = n1 - n < 1;
            final boolean growK = k1 - k < 1;
            if (growM | growN | growK) {
                // Some part of the previous f is too small.
                // Atomically grow without destroying the previous computation.
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

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
                    d += m;
                } while (i < n && x[i] == z);
                plus = d > plus ? d : plus;
            } else if (x[i] > y[j]) {
                final double z = y[j];
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
                    d -= n;
                } while (j < m && y[j] == z);
                minus = d < minus ? d : minus;
            } else {
                // Traverse to the end of the tied section for d.
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
                d += k * (long) m;
                // Extreme D+ path
                tplus = d > tplus ? d : tplus;
                k = j;
                do {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
                final double yi = cdf.applyAsDouble(sx[i]);
                final double dp = (i + 1) / nd - yi;
                d = dp > d ? dp : d;
            }
            sign[0] = 1;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
                final double yi = cdf.applyAsDouble(sx[i]);
                final double dn = yi - i / nd;
                d = dn > d ? dn : d;
            }
            sign[0] = -1;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
                final double dn = yi - i / nd;
                final double dp = (i + 1) / nd - yi;
                minus = dn > minus ? dn : minus;
                plus = dp > plus ? dp : plus;
            }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/KolmogorovSmirnovTest.java`
#### Snippet
```java
                final double dp = (i + 1) / nd - yi;
                minus = dn > minus ? dn : minus;
                plus = dp > plus ? dp : plus;
            }
            sign[0] = Double.compare(plus, minus);
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

## RuleId[ruleID=NumericOverflow]
### NumericOverflow
Numeric overflow in expression
in `commons-statistics-inference/src/main/java/org/apache/commons/statistics/inference/DD.java`
#### Snippet
```java
    /** The value -1 converted for use if using {@link Integer#compareUnsigned(int, int)}.
     * This requires adding {@link Integer#MIN_VALUE} to -1. */
    private static final int CMP_UNSIGNED_MINUS_1 = Integer.MIN_VALUE - 1;
    /** The value 1022 converted for use if using {@link Integer#compareUnsigned(int, int)}.
     * This requires adding {@link Integer#MIN_VALUE} to 1022. */
```

