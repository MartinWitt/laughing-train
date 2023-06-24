# eclipse-collections-kata 
 
# Bad smells
I found 46 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 23 | false |
| FieldMayBeFinal | 14 | false |
| NonFinalFieldInEnum | 6 | false |
| DuplicatedCode | 1 | false |
| Deprecation | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `jackson-kata-solutions/src/main/java/org/eclipse/collections/jacksonkata/Person.java`
#### Snippet
```java
        Pet pet = new Pet(petType, name, age);
        this.pets.add(pet);
        this.petsByAge.getIfAbsentPut(pet.getAge(), Lists.mutable::empty).add(pet);
        this.petsByType.getIfAbsentPut(pet.getType(), Lists.mutable::empty).add(pet);
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `ALL` in enum 'Fruit'
in `top-methods-kata-solutions/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java
    ORANGE("🍊", Color.ORANGE);

    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;
```

### NonFinalFieldInEnum
Non-final field `emoji` in enum 'Fruit'
in `top-methods-kata-solutions/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java

    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;

```

### NonFinalFieldInEnum
Non-final field `color` in enum 'Fruit'
in `top-methods-kata-solutions/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java
    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;

    Fruit(String emoji, Color color)
```

### NonFinalFieldInEnum
Non-final field `color` in enum 'Fruit'
in `top-methods-kata/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java
    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;

    Fruit(String emoji, Color color)
```

### NonFinalFieldInEnum
Non-final field `emoji` in enum 'Fruit'
in `top-methods-kata/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java

    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;

```

### NonFinalFieldInEnum
Non-final field `ALL` in enum 'Fruit'
in `top-methods-kata/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java
    ORANGE("🍊", Color.ORANGE);

    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;
```

## RuleId[id=Deprecation]
### Deprecation
'injectInto(double, org.eclipse.collections.api.block.function.primitive.DoubleObjectToDoubleFunction)' is deprecated
in `company-kata/src/main/java/org/eclipse/collections/companykata/Order.java`
#### Snippet
```java
        return Lists.adapt(this.lineItems)
                .collect(LineItem::getValue)
                .injectInto(0.0, AddFunction.DOUBLE_TO_DOUBLE);
    }
}
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `age` may be 'final'
in `jackson-kata/src/main/java/org/eclipse/collections/jacksonkata/Pet.java`
#### Snippet
```java
    private PetType type;
    private String name;
    private int age;

    public Pet(PetType type, String name, int age)
```

### FieldMayBeFinal
Field `name` may be 'final'
in `jackson-kata/src/main/java/org/eclipse/collections/jacksonkata/Pet.java`
#### Snippet
```java
{
    private PetType type;
    private String name;
    private int age;

```

### FieldMayBeFinal
Field `type` may be 'final'
in `jackson-kata/src/main/java/org/eclipse/collections/jacksonkata/Pet.java`
#### Snippet
```java
public class Pet
{
    private PetType type;
    private String name;
    private int age;
```

### FieldMayBeFinal
Field `firstName` may be 'final'
in `jackson-kata-solutions/src/main/java/org/eclipse/collections/jacksonkata/Person.java`
#### Snippet
```java
public class Person
{
    private String firstName;
    private String lastName;
    private int age;
```

### FieldMayBeFinal
Field `age` may be 'final'
in `jackson-kata-solutions/src/main/java/org/eclipse/collections/jacksonkata/Person.java`
#### Snippet
```java
    private String firstName;
    private String lastName;
    private int age;

    @JsonProperty
```

### FieldMayBeFinal
Field `lastName` may be 'final'
in `jackson-kata-solutions/src/main/java/org/eclipse/collections/jacksonkata/Person.java`
#### Snippet
```java
{
    private String firstName;
    private String lastName;
    private int age;

```

### FieldMayBeFinal
Field `candyCount` may be 'final'
in `candy-kata/src/main/java/org/eclipse/collections/candykata/SchoolGroup.java`
#### Snippet
```java

    private LocalDateTime time;
    private long candyCount;

    private SchoolGroup(LocalDateTime time, long candyCount)
```

### FieldMayBeFinal
Field `time` may be 'final'
in `candy-kata/src/main/java/org/eclipse/collections/candykata/SchoolGroup.java`
#### Snippet
```java
            new SchoolGroup(HALLOWEEN.atTime(HIGH_SCHOOL_START), CANDY_COUNT);

    private LocalDateTime time;
    private long candyCount;

```

### FieldMayBeFinal
Field `candyCount` may be 'final'
in `candy-kata-solutions/src/main/java/org/eclipse/collections/candykata/SchoolGroup.java`
#### Snippet
```java

    private LocalDateTime time;
    private long candyCount;

    private SchoolGroup(LocalDateTime time, long candyCount)
```

### FieldMayBeFinal
Field `time` may be 'final'
in `candy-kata-solutions/src/main/java/org/eclipse/collections/candykata/SchoolGroup.java`
#### Snippet
```java
            new SchoolGroup(HALLOWEEN.atTime(HIGH_SCHOOL_START), CANDY_COUNT);

    private LocalDateTime time;
    private long candyCount;

```

### FieldMayBeFinal
Field `emoji` may be 'final'
in `top-methods-kata-solutions/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java

    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;

```

### FieldMayBeFinal
Field `color` may be 'final'
in `top-methods-kata-solutions/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java
    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;

    Fruit(String emoji, Color color)
```

### FieldMayBeFinal
Field `color` may be 'final'
in `top-methods-kata/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java
    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;

    Fruit(String emoji, Color color)
```

### FieldMayBeFinal
Field `emoji` may be 'final'
in `top-methods-kata/src/main/java/org/eclipse/collections/topmethodskata/Fruit.java`
#### Snippet
```java

    public static ImmutableList<Fruit> ALL = Lists.immutable.with(Fruit.values());
    private String emoji;
    private Color color;

```

