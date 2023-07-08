# escapevelocity 
 
# Bad smells
I found 13 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 6 | false |
| NullableProblems | 2 | false |
| StringBufferReplaceableByString | 1 | false |
| RedundantTypeArguments | 1 | false |
| RedundantCast | 1 | false |
| ConstantValue | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Reader`
in `src/main/java/com/google/escapevelocity/ParseNode.java`
#### Snippet
```java
 * Template}. If the string was seen before (in this evaluation, or an earlier evaluation) then the
 * {@code Template} will be retrieved from the {@code parseCache}. Otherwise we will get a {@link
 * Reader} from the {@link ResourceOpener} and parse its contents to produce a new {@code Template},
 * which we will record in the {@code parseCache}. Either way, we will execute the nested {@code
 * Template}, which means adding its macros to the {@link EvaluationContext} and evaluating it to
```

### JavadocReference
Cannot resolve symbol `Method`
in `src/main/java/com/google/escapevelocity/Template.java`
#### Snippet
```java

  /**
   * Caches {@link Method} objects for public methods accessed through references. The first time
   * we evaluate {@code $var.property} or {@code $var.method(...)} for a {@code $var} of a given
   * class and for a given property or method signature, we'll store the resultant {@link Method}
```

### JavadocReference
Cannot resolve symbol `Method`
in `src/main/java/com/google/escapevelocity/Template.java`
#### Snippet
```java
   * Caches {@link Method} objects for public methods accessed through references. The first time
   * we evaluate {@code $var.property} or {@code $var.method(...)} for a {@code $var} of a given
   * class and for a given property or method signature, we'll store the resultant {@link Method}
   * object. Every subsequent time we'll reuse that {@link Method}. The method lookup is quite slow
   * so caching is useful. The main downside is that we may potentially hold on to {@link Method}
```

### JavadocReference
Cannot resolve symbol `Method`
in `src/main/java/com/google/escapevelocity/Template.java`
#### Snippet
```java
   * we evaluate {@code $var.property} or {@code $var.method(...)} for a {@code $var} of a given
   * class and for a given property or method signature, we'll store the resultant {@link Method}
   * object. Every subsequent time we'll reuse that {@link Method}. The method lookup is quite slow
   * so caching is useful. The main downside is that we may potentially hold on to {@link Method}
   * objects that will never be used with this {@link Template} again. But in practice templates
```

### JavadocReference
Cannot resolve symbol `Method`
in `src/main/java/com/google/escapevelocity/Template.java`
#### Snippet
```java
   * class and for a given property or method signature, we'll store the resultant {@link Method}
   * object. Every subsequent time we'll reuse that {@link Method}. The method lookup is quite slow
   * so caching is useful. The main downside is that we may potentially hold on to {@link Method}
   * objects that will never be used with this {@link Template} again. But in practice templates
   * tend to be used repeatedly with the same classes.
```

### JavadocReference
Cannot resolve symbol `visibleMethods`
in `src/main/java/com/google/escapevelocity/MethodFinder.java`
#### Snippet
```java
   * different names are called at different times. With an all-at-once scheme, we might end up
   * computing and storing information about a bunch of methods that will never be called. Because
   * the profiling that led to the creation of this class revealed that {@link #visibleMethods} in
   * particular is quite expensive, it's probably best to avoid calling it unnecessarily.
   */
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/com/google/escapevelocity/ExpressionNode.java`
#### Snippet
```java
          rhsValue = rhs.toString();
        }
        return new StringBuilder().append(lhsValue).append(rhsValue).toString();
      }
      if (lhsValue == null || rhsValue == null) {
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/google/escapevelocity/Node.java`
#### Snippet
```java
   */
  static Node emptyNode(String resourceName, int lineNumber) {
    return new Cons(resourceName, lineNumber, ImmutableList.<Node>of());
  }

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/com/google/escapevelocity/Template.java`
#### Snippet
```java
    };
    try {
      return parseFrom((String) null, resourceOpener);
    } finally {
      reader.close();
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
      return new ForwardingSortedSet<Integer>() {
        @Override
        protected ImmutableSortedSet<Integer> delegate() {
          return set;
        }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java

        @Override
        public String toString() {
          // ContiguousSet returns [1..3] whereas Velocity uses [1, 2, 3].
          return set.asList().toString();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `c == ')'` is always `true`
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
      }
    }
    assert c == ')';
    next();
    return new MethodReferenceNode(lhs, id, args.build(), silent);
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'getModule'
in `src/main/java/com/google/escapevelocity/MethodFinder.java`
#### Snippet
```java
    Method moduleIsExportedMethod;
    try {
      classGetModuleMethod = Class.class.getMethod("getModule");
      Class<?> moduleClass = classGetModuleMethod.getReturnType();
      moduleIsExportedMethod = moduleClass.getMethod("isExported", String.class);
```

