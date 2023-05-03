# quick-authentication-mobile 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DifferentKotlinGradleVersion | 1 | false |
## RuleId[id=DifferentKotlinGradleVersion]
### DifferentKotlinGradleVersion
Kotlin version that is used for building with Gradle (1.3.31) is not properly supported in the IDE plugin (1.9)
in `android/build.gradle`
#### Snippet
```java
        classpath "com.diffplug.spotless:spotless-plugin-gradle:6.10.0"
        // kotlin
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.31"
    }
}
```

