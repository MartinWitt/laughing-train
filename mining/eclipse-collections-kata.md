# eclipse-collections-kata 
 
# Bad smells
I found 38 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 23 | false |
| FieldMayBeStatic | 8 | false |
| ReturnNull | 2 | false |
| Convert2MethodRef | 2 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-11-07-18-42.225.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `company-kata/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java
    {
        Assertions.fail("Implement this method as part of Exercise 2");
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `pet-kata/src/main/java/org/eclipse/collections/petkata/PetType.java`
#### Snippet
```java
    {
        // Find the correct PetType based on the String emoji
        return null;
    }
}
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `trueValue` may be 'static'
in `lost-and-found-kata-solutions/src/main/java/org/eclipse/collections/lostandfoundkata/primitive/MinMaxPrimitivesBoxed.java`
#### Snippet
```java
class MinMaxPrimitivesBoxed
{
    private final Boolean trueValue = true;
    private final Boolean falseValue = false;
    private final Byte minbyteValue = Byte.MIN_VALUE;
```

### FieldMayBeStatic
Field `falseValue` may be 'static'
in `lost-and-found-kata-solutions/src/main/java/org/eclipse/collections/lostandfoundkata/primitive/MinMaxPrimitivesBoxed.java`
#### Snippet
```java
{
    private final Boolean trueValue = true;
    private final Boolean falseValue = false;
    private final Byte minbyteValue = Byte.MIN_VALUE;
    private final Byte maxbyteValue = Byte.MAX_VALUE;
```

### FieldMayBeStatic
Field `falseValue` may be 'static'
in `lost-and-found-kata/src/main/java/org/eclipse/collections/lostandfoundkata/primitive/MinMaxPrimitivesPlain.java`
#### Snippet
```java
{
    private final boolean trueValue = true;
    private final boolean falseValue = false;
    private final byte minbyteValue = Byte.MIN_VALUE;
    private final byte maxbyteValue = Byte.MAX_VALUE;
```

### FieldMayBeStatic
Field `trueValue` may be 'static'
in `lost-and-found-kata/src/main/java/org/eclipse/collections/lostandfoundkata/primitive/MinMaxPrimitivesPlain.java`
#### Snippet
```java
class MinMaxPrimitivesPlain
{
    private final boolean trueValue = true;
    private final boolean falseValue = false;
    private final byte minbyteValue = Byte.MIN_VALUE;
```

### FieldMayBeStatic
Field `falseValue` may be 'static'
in `lost-and-found-kata-solutions/src/main/java/org/eclipse/collections/lostandfoundkata/primitive/MinMaxPrimitivesPlain.java`
#### Snippet
```java
{
    private final boolean trueValue = true;
    private final boolean falseValue = false;
    private final byte minbyteValue = Byte.MIN_VALUE;
    private final byte maxbyteValue = Byte.MAX_VALUE;
```

### FieldMayBeStatic
Field `trueValue` may be 'static'
in `lost-and-found-kata-solutions/src/main/java/org/eclipse/collections/lostandfoundkata/primitive/MinMaxPrimitivesPlain.java`
#### Snippet
```java
class MinMaxPrimitivesPlain
{
    private final boolean trueValue = true;
    private final boolean falseValue = false;
    private final byte minbyteValue = Byte.MIN_VALUE;
```

### FieldMayBeStatic
Field `trueValue` may be 'static'
in `lost-and-found-kata/src/main/java/org/eclipse/collections/lostandfoundkata/primitive/MinMaxPrimitivesBoxed.java`
#### Snippet
```java
class MinMaxPrimitivesBoxed
{
    private final Boolean trueValue = true;
    private final Boolean falseValue = false;
    private final Byte minbyteValue = Byte.MIN_VALUE;
```

### FieldMayBeStatic
Field `falseValue` may be 'static'
in `lost-and-found-kata/src/main/java/org/eclipse/collections/lostandfoundkata/primitive/MinMaxPrimitivesBoxed.java`
#### Snippet
```java
{
    private final Boolean trueValue = true;
    private final Boolean falseValue = false;
    private final Byte minbyteValue = Byte.MIN_VALUE;
    private final Byte maxbyteValue = Byte.MAX_VALUE;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `objectMapper` is redundant
in `jackson-kata/src/main/java/org/eclipse/collections/jacksonkata/ObjectMapperUtils.java`
#### Snippet
```java
    public static ObjectMapper createObjectMapperWithEclipseCollectionsSupport()
    {
        ObjectMapper objectMapper = ObjectMapperUtils.createSimpleObjectMapper();
        //Register Eclipse Collections Object Mapper support bellow
        return objectMapper;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `company-kata/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java

    // Suppliers are array based. Refactor to a MutableList<Supplier>
    private Supplier[] suppliers = new Supplier[0];

    public Company(String name)
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.eclipse.collections.api.RichIterable;`
in `candy-kata/src/main/java/org/eclipse/collections/candykata/SchoolGroup.java`
#### Snippet
```java
import java.util.stream.IntStream;

import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.bag.Bag;
import org.eclipse.collections.api.list.ImmutableList;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.api.RichIterable;`
in `candy-kata-solutions/src/main/java/org/eclipse/collections/candykata/SchoolGroup.java`
#### Snippet
```java
import java.util.stream.IntStream;

import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.bag.Bag;
import org.eclipse.collections.api.list.ImmutableList;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.list.mutable.FastList;`
in `company-kata/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.jupiter.api.Assertions;

```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.api.block.function.Function;`
in `company-kata/src/main/java/org/eclipse/collections/companykata/Customer.java`
#### Snippet
```java
package org.eclipse.collections.companykata;

import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.block.function.AddFunction;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.api.list.MutableList;`
in `company-kata/src/main/java/org/eclipse/collections/companykata/Customer.java`
#### Snippet
```java

import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.block.function.AddFunction;
import org.eclipse.collections.impl.utility.ListIterate;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.block.function.AddFunction;`
in `company-kata/src/main/java/org/eclipse/collections/companykata/Customer.java`
#### Snippet
```java
import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.block.function.AddFunction;
import org.eclipse.collections.impl.utility.ListIterate;
import org.junit.jupiter.api.Assertions;
```

### UNUSED_IMPORT
Unused import `import org.junit.jupiter.api.Assertions;`
in `company-kata/src/main/java/org/eclipse/collections/companykata/Customer.java`
#### Snippet
```java
import org.eclipse.collections.impl.block.function.AddFunction;
import org.eclipse.collections.impl.utility.ListIterate;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.api.block.function.Function;`
in `company-kata/src/main/java/org/eclipse/collections/companykata/LineItem.java`
#### Snippet
```java
package org.eclipse.collections.companykata;

import org.eclipse.collections.api.block.function.Function;

/**
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.api.block.function.Function;`
in `company-kata/src/main/java/org/eclipse/collections/companykata/Supplier.java`
#### Snippet
```java
package org.eclipse.collections.companykata;

import org.eclipse.collections.api.block.function.Function;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java
package org.eclipse.collections.companykata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

```

### UNUSED_IMPORT
Unused import `import java.util.function.IntFunction;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

import org.eclipse.collections.api.block.function.Function;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.list.mutable.ArrayListAdapter;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.list.mutable.ArrayListAdapter;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.jupiter.api.Assertions;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.list.mutable.FastList;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.list.mutable.ArrayListAdapter;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.jupiter.api.Assertions;

```

### UNUSED_IMPORT
Unused import `import org.junit.jupiter.api.Assertions;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Company.java`
#### Snippet
```java
import org.eclipse.collections.impl.list.mutable.ArrayListAdapter;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.jupiter.api.Assertions;

/**
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.block.function.AddFunction;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Customer.java`
#### Snippet
```java
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.block.function.AddFunction;
import org.eclipse.collections.impl.utility.ListIterate;

```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.utility.ListIterate;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Customer.java`
#### Snippet
```java
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.block.function.AddFunction;
import org.eclipse.collections.impl.utility.ListIterate;

/**
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.api.block.function.Function;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/LineItem.java`
#### Snippet
```java
package org.eclipse.collections.companykata;

import org.eclipse.collections.api.block.function.Function;

/**
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.block.function.AddFunction;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Order.java`
#### Snippet
```java
import org.eclipse.collections.api.block.function.primitive.DoubleFunction;
import org.eclipse.collections.impl.block.factory.Comparators;
import org.eclipse.collections.impl.block.function.AddFunction;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.SortedBags;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.factory.Lists;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Order.java`
#### Snippet
```java
import org.eclipse.collections.impl.block.factory.Comparators;
import org.eclipse.collections.impl.block.function.AddFunction;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.SortedBags;

```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.api.block.function.Function;`
in `company-kata-solutions/src/main/java/org/eclipse/collections/companykata/Supplier.java`
#### Snippet
```java
package org.eclipse.collections.companykata;

import org.eclipse.collections.api.block.function.Function;

/**
```

### UNUSED_IMPORT
Unused import `import org.eclipse.collections.impl.utility.ArrayIterate;`
in `pet-kata/src/main/java/org/eclipse/collections/petkata/PetType.java`
#### Snippet
```java
package org.eclipse.collections.petkata;

import org.eclipse.collections.impl.utility.ArrayIterate;

public enum PetType
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `jackson-kata/src/main/java/org/eclipse/collections/jacksonkata/Person.java`
#### Snippet
```java
    public MutableList<Pet> getPetsByAge(int age)
    {
        return this.petsByAge.getIfAbsent(age, () -> Lists.mutable.empty());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `jackson-kata-solutions/src/main/java/org/eclipse/collections/jacksonkata/Person.java`
#### Snippet
```java
    public MutableList<Pet> getPetsByAge(int age)
    {
        return this.petsByAge.getIfAbsent(age, () -> Lists.mutable.empty());
    }

```

