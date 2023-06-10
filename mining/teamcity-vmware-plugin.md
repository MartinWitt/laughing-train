# teamcity-vmware-plugin 
 
# Bad smells
I found 5 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 5 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-vmware-plugin363584112638183770611618607865373827402/cloud-vmware-server/src/test/java/jetbrains/buildServer/clouds/vmware/VmwareTestUtils.java`
#### Snippet
```java
UUID.randomUUID().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-vmware-plugin363584112638183770611618607865373827402/cloud-vmware-server/src/main/java/jetbrains/buildServer/clouds/vmware/connector/VMWareApiConnectorImpl.java`
#### Snippet
```java
parent.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-vmware-plugin363584112638183770611618607865373827402/cloud-vmware-server/src/main/java/jetbrains/buildServer/clouds/vmware/connector/VMWareApiConnectorImpl.java`
#### Snippet
```java
parent.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-vmware-plugin363584112638183770611618607865373827402/cloud-vmware-server/src/main/java/jetbrains/buildServer/clouds/vmware/web/VMWareEditProfileController.java`
#### Snippet
```java
ex.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-vmware-plugin363584112638183770611618607865373827402/cloud-vmware-server/src/test/java/jetbrains/buildServer/clouds/vmware/stubs/FakeVirtualMachine.java`
#### Snippet
```java
opt.getValue().toString()
```

