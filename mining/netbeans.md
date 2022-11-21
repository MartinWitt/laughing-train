# netbeans 
 
# Bad smells
I found 312 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=GroovyUnusedAssignment] | 144 | false |
| RuleId[ruleID=RegExpSimplifiable] | 68 | false |
| RuleId[ruleID=RegExpRedundantNestedCharacterClass] | 58 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 28 | false |
| RuleId[ruleID=RegExpSingleCharAlternation] | 10 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 4 | false |
## RuleId[ruleID=GroovyUnusedAssignment]
### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/javasimple/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App'

run {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/simple2/build.gradle`
#### Snippet
```java
apply plugin: 'eclipse'

group = 'nbtest'
version = '0.1'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/simple2/build.gradle`
#### Snippet
```java

group = 'nbtest'
version = '0.1'

println project.group
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/artifacts/withTests/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App'

run {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/artifacts/shadowed/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App'

run {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/parse/starter.gradle`
#### Snippet
```java
}

version = "0.1"
group = "com.example"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/parse/starter.gradle`
#### Snippet
```java

version = "0.1"
group = "com.example"

repositories {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/parse/simple.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App'

run {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `java/gradle.java/test/unit/data/dependencies/parse/simple.gradle`
#### Snippet
```java
dependencies {
    antContrib files('ant/antcontrib.jar')
    @@A@@runtimeOnly group: 'org.springframework', name: 'spring-beans', version: '2.5'@@A@@
    runtimeOnly @@B@@'org.springframework:spring-core:3.5'@@B@@,
            @@C@@'org.springframework:spring-aop:3.5'@@C@@
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `java/gradle.java/test/unit/data/dependencies/parse/variousSyntax.gradle`
#### Snippet
```java
        @@H@@[group:'org.ow2.asm', name:'asm', version:'7.1']@@H@@
    )
    @@I@@implementation group: 'org.apache.logging.log4j', name: 'log4j-core', version: '2.17.0'@@I@@
}
application {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/micronaut/build.gradle`
#### Snippet
```java
}

version = "0.1"
group = "com.example"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/micronaut/build.gradle`
#### Snippet
```java

version = "0.1"
group = "com.example"

repositories {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/parse/complexPrologue.gradle`
#### Snippet
```java

mainClassName = "example.HelloWorldFunction"
applicationDefaultJvmArgs = [""]
ignoredDeps1 = "dependencies { }"
ignoredDeps2 = 'dependencies { }'
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/parse/complexPrologue.gradle`
#### Snippet
```java
mainClassName = "example.HelloWorldFunction"
applicationDefaultJvmArgs = [""]
ignoredDeps1 = "dependencies { }"
ignoredDeps2 = 'dependencies { }'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `java/gradle.java/test/unit/data/dependencies/parse/complexPrologue.gradle`
#### Snippet
```java
applicationDefaultJvmArgs = [""]
ignoredDeps1 = "dependencies { }"
ignoredDeps2 = 'dependencies { }'

jar {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/simple/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/multi/p2/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App2'

group = 'nbtest'
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/multi/p2/build.gradle`
#### Snippet
```java
mainClassName = 'test.App2'

group = 'nbtest'
version = '0.1'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/multi/p2/build.gradle`
#### Snippet
```java

group = 'nbtest'
version = '0.1'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/multi/p1/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App'

group = 'nbtest'
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/multi/p1/build.gradle`
#### Snippet
```java
mainClassName = 'test.App'

group = 'nbtest'
version = '0.1'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/multi/p1/build.gradle`
#### Snippet
```java

group = 'nbtest'
version = '0.1'


```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/oldgradle/basic/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/externaldeps/p1/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App'

group = 'nbtest'
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/externaldeps/p1/build.gradle`
#### Snippet
```java
mainClassName = 'test.App'

group = 'nbtest'
version = '0.1'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/externaldeps/p1/build.gradle`
#### Snippet
```java

group = 'nbtest'
version = '0.1'


```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/externaldeps/p2/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'test.App2'

jar.dependsOn(':p1:jar')
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/externaldeps/p2/build.gradle`
#### Snippet
```java
jar.dependsOn(':p1:jar')

group = 'nbtest'
version = '0.1'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/projects/externaldeps/p2/build.gradle`
#### Snippet
```java

group = 'nbtest'
version = '0.1'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/release/modules/gradle/daemon-loader/build.gradle`
#### Snippet
```java
 */

description='Simple Project Just to Fire up a Daemon'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/buildprops/micronaut/build.gradle`
#### Snippet
```java
}

version = "0.1"
group = "com.example"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/test/unit/data/buildprops/micronaut/build.gradle`
#### Snippet
```java

version = "0.1"
group = "com.example"

repositories {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/netbeans-gradle-tooling/build.gradle`
#### Snippet
```java
apply plugin: 'application'

mainClassName = 'org.netbeans.modules.gradle.DebugTooling'

sourceCompatibility = '1.8'
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `extide/gradle/netbeans-gradle-tooling/build.gradle`
#### Snippet
```java
mainClassName = 'org.netbeans.modules.gradle.DebugTooling'

sourceCompatibility = '1.8'
[compileJava, compileTestJava]*.options*.encoding = 'UTF-8'

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.kit/test/qa-functional/data/projects/GrailsActions/grails-app/conf/spring/resources.groovy`
#### Snippet
```java
// Place your Spring DSL code here
beans = {
    
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/src/org/netbeans/modules/groovy/editor/resources/FontsAndColorsPreview.groovy`
#### Snippet
```java

    def count() {
        int universeConstant = 2 + 6
    }
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/ASTPath1.groovy`
#### Snippet
```java
        ProcessBuilder b = new ProcessBuilder()
        b.command("good").inheritIO().command()
        Object o = ProcessBuilder.class;
        
        ProcessBuilder aa = new ProcessBuilder()
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/Hello.groovy`
#### Snippet
```java

    static void main(args) {
        String s = 'aaa'
        println 'Hello, world'
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/TypeOccurrencesTester.groovy`
#### Snippet
```java

    public void stringUsedInDifferentSituations() {
        String string
        String stringInit = new String()
        String[] stringArray
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/TypeOccurrencesTester.groovy`
#### Snippet
```java
    public void stringUsedInDifferentSituations() {
        String string
        String stringInit = new String()
        String[] stringArray
        String[] stringArrayInit = new String[1]
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/TypeOccurrencesTester.groovy`
#### Snippet
```java
        String string
        String stringInit = new String()
        String[] stringArray
        String[] stringArrayInit = new String[1]
        List<String> stringList
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/GroovyScopeTestcase.groovy`
#### Snippet
```java

    def test (Object xy = 0 ) {
        xy = 5

        [1,2,3].each { value ->
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/TypeOccurrencesTester.groovy`
#### Snippet
```java
        String stringInit = new String()
        String[] stringArray
        String[] stringArrayInit = new String[1]
        List<String> stringList
        List<String> stringListInit = new ArrayList<String>()
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/TypeOccurrencesTester.groovy`
#### Snippet
```java
        String[] stringArray
        String[] stringArrayInit = new String[1]
        List<String> stringList
        List<String> stringListInit = new ArrayList<String>()

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/TypeOccurrencesTester.groovy`
#### Snippet
```java
        String[] stringArrayInit = new String[1]
        List<String> stringList
        List<String> stringListInit = new ArrayList<String>()

        String.CASE_INSENSITIVE_ORDER
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/TypeOccurrencesTester.groovy`
#### Snippet
```java

        for (String sss : somearray) {
            String innerString = sss.concat("");
        }
        for (Number nnn : numbers) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/TypeOccurrencesTester.groovy`
#### Snippet
```java
        }
        for (Number nnn : numbers) {
            Number n = nnn;
        }
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/index/testGetClasses/testGetClasses.groovy`
#### Snippet
```java

    static void main(args) {
        String s = 'aaa'
        println 'Hello, world'
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/KeywordImport1.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/KeywordImport1.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString
    }
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodLocalStringConst1.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodFieldLong1.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodLocalStringConst1.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString

        " ddd ".c
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/KeywordImport2.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/KeywordImport2.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString
    }
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodFieldLong1.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString

        longField.MAX
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodFieldString1.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodFieldString1.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString

        stringField.toL
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/KeywordAboveClass2.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/KeywordAboveClass2.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString
    }
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodLocalLong1.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString

        localLong.MAX
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodLocalString1.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodLocalString2.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodLocalLong2.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString

        localLong.comp
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodFieldString2.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodFieldString2.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString

        stringField.spli
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/KeywordAboveClass1.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString
    }
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/KeywordAboveClass1.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString
    }
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/flow/reassignment/Reassignment.groovy`
#### Snippet
```java
def reassignment() {
    def varA = "ahoj"
    def sub = varA.substring(0)

    varA = ["a", "b"];
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodFieldLong2.groovy`
#### Snippet
```java

    void method1(){
        Long localLong
        String localString

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/ClassMethodFieldLong2.groovy`
#### Snippet
```java
    void method1(){
        Long localLong
        String localString

        longField.comp
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/method/methods2/Methods2.groovy`
#### Snippet
```java
class GroovyClass2 {
    def m2() {
        GroovyClass1 gc1 = new GroovyClass1()
    }
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/method/completionNoDot2/CompletionNoDot2.groovy`
#### Snippet
```java
    
    public void method2() {
        String a = meth
    }
        
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/method/completionNoDot2/CompletionNoDot2.groovy`
#### Snippet
```java
        
    private String case1() {
        String a = this.method1()
    }
    
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/method/methods5/Methods5.groovy`
#### Snippet
```java
        ProcessBuilder b = new ProcessBuilder()
        b.command("good").inheritIO().command()
        Object o = ProcessBuilder.class;
        
        b.command(Arrays.asList("good", "bad")).inheritIO().command()
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/method/methods5/Methods5.groovy`
#### Snippet
```java
        
        b.command(Arrays.asList("good", "bad")).inheritIO().command()
        o = ProcessBuilder.class;
        
        ProcessBuilder aa = new ProcessBuilder()
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/method/completionNoPrefixString2/CompletionNoPrefixString2.groovy`
#### Snippet
```java
def name='Petr'.
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/BookmarkController.groovy`
#### Snippet
```java
        def fromDelicious                         
        try {
            fromDelicious = deliciousService?.findRecent(session.user)
        }
        catch(Exception e) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/BookmarkController.groovy`
#### Snippet
```java
        def fromDelicious
        try {
            fromDelicious = deliciousService?.findAllForTag(params.q,session.user) 
        }
        catch(Exception e) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/newvars/Identifier1.groovy`
#### Snippet
```java
String str
Long lo

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/newvars/Identifier1.groovy`
#### Snippet
```java
String str
Long lo

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/closures/insideClosure1/InsideClosure1.groovy`
#### Snippet
```java
    [3,4,5].each {xu1,xu2,xu3 -> println xu}

    def t1 = {println i}

    def t2 = {test1,test2,test3 -> println test}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/closures/insideClosure1/InsideClosure1.groovy`
#### Snippet
```java
    def t1 = {println i}

    def t2 = {test1,test2,test3 -> println test}

    "TestString".eachLine {String line -> println i}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/variables/variables1/Variables1.groovy`
#### Snippet
```java

    def x = { ito ->
        def List item

        itom = "itom"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/variables/variables1/Variables1.groovy`
#### Snippet
```java

    def y(Properties esop, param) {
        def est
        try {
            String ab
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/variables/variables2/Variables2.groovy`
#### Snippet
```java

    def y(Properties param) {
        def item
        try {
            for (item2 in []) {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/namedparams/emptyConstructor/EmptyConstructor.groovy`
#### Snippet
```java
}

Bar bar = new Bar()

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/namedparams/fewParamsConstructor/FewParamsConstructor.groovy`
#### Snippet
```java
}

Bar baar = new Bar(aaa: 0, bbb: 1, )

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/constructors/constructors1/Constructors1.groovy`
#### Snippet
```java
StringBuffer sb = new StringBuffer

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/constructors/constructors2/Constructors2.groovy`
#### Snippet
```java
StringBuffer sb = new stringbuffer

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/constructors/constructors3/Constructors3.groovy`
#### Snippet
```java
FileOutputStream fos = new fileoutputstr

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/constructors/constructors8/Constructors8.groovy`
#### Snippet
```java
class Foo {
    public void method() {
        String s = new String("abc");
    }
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/completion/constructors/constructors7/Constructors7.groovy`
#### Snippet
```java
class Foo {
    public void method() {
        String s = new String
    }
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.editor/test/unit/data/testfiles/declarationfinder/Methods2.groovy`
#### Snippet
```java
x = "a"

println getName()
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyClass.groovy`
#### Snippet
```java
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyClass.groovy`
#### Snippet
```java
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyClass.groovy`
#### Snippet
```java
      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyClass.groovy`
#### Snippet
```java

-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyClass.groovy`
#### Snippet
```java
-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyClass.groovy`
#### Snippet
```java
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyClass.groovy`
#### Snippet
```java
/**
 *
 * @author ${user}
 */
class ${name} {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyScript.groovy`
#### Snippet
```java
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyScript.groovy`
#### Snippet
```java
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyScript.groovy`
#### Snippet
```java
      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyScript.groovy`
#### Snippet
```java

-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyScript.groovy`
#### Snippet
```java
-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyScript.groovy`
#### Snippet
```java
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnitTest.groovy`
#### Snippet
```java
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnitTest.groovy`
#### Snippet
```java
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnitTest.groovy`
#### Snippet
```java
      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnitTest.groovy`
#### Snippet
```java
/*  This template should not be ever used */

<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnitTest.groovy`
#### Snippet
```java

<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnitTest.groovy`
#### Snippet
```java
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit4Test.groovy`
#### Snippet
```java
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnitTest.groovy`
#### Snippet
```java
/**
 *
 * @author ${user}
 */
class ${name} {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit4Test.groovy`
#### Snippet
```java
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit4Test.groovy`
#### Snippet
```java
      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit3Test.groovy`
#### Snippet
```java
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit3Test.groovy`
#### Snippet
```java
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit3Test.groovy`
#### Snippet
```java
      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit3Test.groovy`
#### Snippet
```java

-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit3Test.groovy`
#### Snippet
```java
-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit3Test.groovy`
#### Snippet
```java
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit3Test.groovy`
#### Snippet
```java
/**
 *
 * @author ${user}
 */
class ${name} extends GroovyTestCase {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit3Test.groovy`
#### Snippet
```java
        super.tearDown();
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit4Test.groovy`
#### Snippet
```java

-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit4Test.groovy`
#### Snippet
```java
-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit4Test.groovy`
#### Snippet
```java
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyJUnit4Test.groovy`
#### Snippet
```java
/**
 *
 * @author ${user}
 */
class ${name} {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyTrait.groovy`
#### Snippet
```java
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyTrait.groovy`
#### Snippet
```java
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0
```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyTrait.groovy`
#### Snippet
```java
      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyTrait.groovy`
#### Snippet
```java

-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyTrait.groovy`
#### Snippet
```java
-->
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyTrait.groovy`
#### Snippet
```java
<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "${project.licensePath}">

```

### RuleId[ruleID=GroovyUnusedAssignment]
Variable is not used
in `groovy/groovy.support/src/org/netbeans/modules/groovy/support/resources/GroovyTrait.groovy`
#### Snippet
```java
/**
 *
 * @author ${user}
 */
trait ${name} {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/grails-app/conf/spring/resources.groovy`
#### Snippet
```java
// Place your Spring DSL code here
beans = {
    
}
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `contrib/groovy.grailsproject/test/unit/data/projects/completion/grails-app/conf/Config.groovy`
#### Snippet
```java

// log4j configuration
log4j = {
    // Example of changing the log pattern for the default console
    // appender:
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `enterprise/micronaut/test/unit/data/gradle/artifacts/multi/app/build.gradle`
#### Snippet
```java
}

version = "0.1"
group = "com.example"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `enterprise/micronaut/test/unit/data/gradle/artifacts/multi/app/build.gradle`
#### Snippet
```java

version = "0.1"
group = "com.example"

repositories {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `enterprise/micronaut/test/unit/data/gradle/artifacts/simple/build.gradle`
#### Snippet
```java
}

version = "0.1"
group = "com.example"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `enterprise/micronaut/test/unit/data/gradle/artifacts/simple/build.gradle`
#### Snippet
```java

version = "0.1"
group = "com.example"

repositories {
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `enterprise/micronaut/test/unit/data/gradle/artifacts/multi/oci/build.gradle`
#### Snippet
```java
}

version = "0.1"
group = "com.example"

```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `enterprise/micronaut/test/unit/data/gradle/artifacts/multi/oci/build.gradle`
#### Snippet
```java

version = "0.1"
group = "com.example"

repositories {
```

## RuleId[ruleID=RegExpSimplifiable]
### RuleId[ruleID=RegExpSimplifiable]
`{0,1}` can be simplified to '?'
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/OTA_TI_simple.xsd`
#### Snippet
```java
		</xs:annotation>
		<xs:restriction base="xs:string">
			<xs:pattern value="[0-9A-Z]{1,3}(\.[A-Z]{3}(\.X){0,1}){0,1}"/>
		</xs:restriction>
	</xs:simpleType>	
```

### RuleId[ruleID=RegExpSimplifiable]
`{0,1}` can be simplified to '?'
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/OTA_TI_simple.xsd`
#### Snippet
```java
		</xs:annotation>
		<xs:restriction base="xs:string">
			<xs:pattern value="[0-9A-Z]{1,3}(\.[A-Z]{3}(\.X){0,1}){0,1}"/>
		</xs:restriction>
	</xs:simpleType>	
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.catalog/src/org/netbeans/modules/xml/catalog/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.catalog/src/org/netbeans/modules/xml/catalog/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.schema.model/src/org/netbeans/modules/xml/schema/model/primitiveTypesSchema.xsd`
#### Snippet
```java
    <xsd:simpleType name="NCName" id="NCName">
        <xsd:restriction base="xsd:Name">
            <xsd:pattern value="[\i-[:]][\c-[:]]*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.schema.model/src/org/netbeans/modules/xml/schema/model/primitiveTypesSchema.xsd`
#### Snippet
```java
    <xsd:simpleType name="NCName" id="NCName">
        <xsd:restriction base="xsd:Name">
            <xsd:pattern value="[\i-[:]][\c-[:]]*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.schema.model/test/unit/src/org/netbeans/modules/xml/schema/model/resources/datatype.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.schema.model/test/unit/src/org/netbeans/modules/xml/schema/model/resources/datatype.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.schema.completion/test/unit/src/org/netbeans/modules/xml/schema/completion/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `ide/xml.schema.completion/test/unit/src/org/netbeans/modules/xml/schema/completion/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_2_0.xsd`
#### Snippet
```java

        <xsd:restriction base="xsd:string">
            <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
        </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_2_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_2_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[\p{L}]` can be simplified to '\\p{L}'
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_2_2.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="([a-z]{2})[_|\-]?([\p{L}]{2})?[_|\-]?(\w+)?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[^\s]` can be simplified to '\\S'
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[a-z0-9_.\-][a-z0-9_.\-]*` can be simplified to '\[a-z0-9_.\\-\]+'
in `enterprise/j2ee.earproject/src/org/netbeans/modules/j2ee/earproject/resources/ear-prj.xsd`
#### Snippet
```java
    <xsd:simpleType name="pathType">
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[a-z0-9_.\-][a-z0-9_.\-]*(/[a-z0-9_.\-][a-z0-9_.\-]*)*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[a-z0-9_.\-][a-z0-9_.\-]*` can be simplified to '\[a-z0-9_.\\-\]+'
in `enterprise/j2ee.earproject/src/org/netbeans/modules/j2ee/earproject/resources/ear-prj.xsd`
#### Snippet
```java
    <xsd:simpleType name="pathType">
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="[a-z0-9_.\-][a-z0-9_.\-]*(/[a-z0-9_.\-][a-z0-9_.\-]*)*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpSimplifiable]
`[:]` can be simplified to ':'
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `nb/welcome/release/docs/GUIExamplesDescription.html`
#### Snippet
```java
<body>
<br>
<h1 align="">GUI Form Example Descriptions</h1>
<p>

```

### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `nb/welcome/release/docs/SwingInteropDescription.html`
#### Snippet
```java
<body>
<br>
<h1 align="">Swing Interop Sample Description</h1>
<p>

```

### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `enterprise/web.core.syntax/test/qa-functional/data/tokens/tokensHTML.html`
#### Snippet
```java
    <center>
        <form name='questionnaire' action='save'>
            <input type='input' name='name' value='Jirka'>
            <textarea cols='10' rows='5'>
                Any text
```

### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `enterprise/web.core.syntax/test/qa-functional/data/IndentationTestProjects/IndentationTest/web/reformatTest.html`
#### Snippet
```java
<div style=" text-align: center" >
<form name='questionnaire' action='save'>
<input type='input' name='name' value='Jirka'>
<textarea cols='10' rows='5'>
Any text
```

## RuleId[ruleID=RegExpSingleCharAlternation]
### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/web.jsf/src/org/netbeans/modules/web/jsf/resources/web-facesconfig_1_2.xsd`
#### Snippet
```java

        <xsd:restriction base="xsd:string">
            <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
        </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[ruleID=RegExpRedundantNestedCharacterClass]
### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.axi/test/unit/src/org/netbeans/modules/xml/axi/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.catalog/src/org/netbeans/modules/xml/catalog/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.catalog/src/org/netbeans/modules/xml/catalog/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.schema.model/src/org/netbeans/modules/xml/schema/model/primitiveTypesSchema.xsd`
#### Snippet
```java
    <xsd:simpleType name="NCName" id="NCName">
        <xsd:restriction base="xsd:Name">
            <xsd:pattern value="[\i-[:]][\c-[:]]*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.schema.model/src/org/netbeans/modules/xml/schema/model/primitiveTypesSchema.xsd`
#### Snippet
```java
    <xsd:simpleType name="NCName" id="NCName">
        <xsd:restriction base="xsd:Name">
            <xsd:pattern value="[\i-[:]][\c-[:]]*"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.schema.model/test/unit/src/org/netbeans/modules/xml/schema/model/resources/datatype.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.schema.model/test/unit/src/org/netbeans/modules/xml/schema/model/resources/datatype.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.schema.completion/test/unit/src/org/netbeans/modules/xml/schema/completion/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `ide/xml.schema.completion/test/unit/src/org/netbeans/modules/xml/schema/completion/resources/XMLSchema.xsd`
#### Snippet
```java
    </xs:annotation>
    <xs:restriction base="xs:Name">
      <xs:pattern value="[\i-[:]][\c-[:]]*" id="NCName.pattern">
        <xs:annotation>
          <xs:documentation
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/web.core/src/org/netbeans/modules/web/taglib/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

### RuleId[ruleID=RegExpRedundantNestedCharacterClass]
Redundant nested character class
in `enterprise/j2ee.dd.webservice/src/org/netbeans/modules/j2ee/dd/impl/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java
        
        <xsd:restriction base="xsd:token">
            <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
        </xsd:restriction>
        
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\ ` in RegExp
in `ide/xml/test/qa-functional/data/people.xsd`
#### Snippet
```java
<xs:simpleType name="SPZ">
    <xs:restriction base="xs:token">
        <xs:pattern value="[a-zA-Z]{2,3}\ \d{2}\-\d{2}"/>
    </xs:restriction>
</xs:simpleType>	
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\-` in RegExp
in `ide/xml/test/qa-functional/data/people.xsd`
#### Snippet
```java
<xs:simpleType name="SPZ">
    <xs:restriction base="xs:token">
        <xs:pattern value="[a-zA-Z]{2,3}\ \d{2}\-\d{2}"/>
    </xs:restriction>
</xs:simpleType>	
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\.` in RegExp
in `nbi/engine/src/org/netbeans/installer/product/state-file.xsd`
#### Snippet
```java
        <xsd:restriction base="xsd:string">
            <xsd:pattern 
                value="([A-Za-z0-9\-\._])+"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\.` in RegExp
in `nbi/engine/src/org/netbeans/installer/product/registry.xsd`
#### Snippet
```java
        <xsd:restriction base="xsd:string">
            <xsd:pattern 
                value="([A-Za-z0-9\-\._])+"/>
        </xsd:restriction>
    </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `enterprise/j2ee.dd/src/org/netbeans/modules/j2ee/dd/impl/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\{` in RegExp
in `enterprise/javaee.wildfly/src/org/netbeans/modules/javaee/wildfly/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

