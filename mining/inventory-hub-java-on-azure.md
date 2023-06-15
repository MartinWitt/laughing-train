# inventory-hub-java-on-azure 
 
# Bad smells
I found 13 bad smells with 13 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 13 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
((String) (eventHubMessage.get("pointOfTransaction").toString()))
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
((String) (eventHubMessage.get("productInformation").toString()))
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
pointOfTransaction.get("location").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
productInformation.get("productId").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
productInformation.get("productName").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
productInformation.get("description").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
productInformation.get("count").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
eventHubMessage.get("type").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
eventHubMessage.get("type").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
eventHubMessage.get("type").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
eventHubMessage.get("type").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
productInformation.get("count").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-inventory-hub-java-on-azure25620453199734713839678590537916605349/function-apps/Update-Product-Inventory/src/main/java/org/inventory/hub/UpdateProductInventory.java`
#### Snippet
```java
productInformation.get("productId").toString()
```

