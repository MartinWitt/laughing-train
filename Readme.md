# Laughing-Train

Laughin-Train is a code refactoring tool using [Spoon](https://github.com/INRIA/spoon) and static analyzers to refactor Java code.
This includes the analysis of the code, the refactoring of the code and the generation of pull requests on GitHub.
For this, we leverage many existing tools and libraries, like quarkus, Hub4J, spoon, Qodana.

## Features:

- Code analysis with Qodana(JetBrains IntelliJ headless)
- Minimal Diffs with Spoon
- Git/GitHub integration
- easy deployment extensionable with new analyzers

## Examples:

- See [mining](https://github.com/MartinWitt/laughing-train/wiki/Mining) for bad smell examples.
- See [refactoring](https://github.com/MartinWitt/laughing-train/wiki/Created-pullrequests) for created pull requests.
- See [Qodana-Rules](https://github.com/MartinWitt/laughing-train/blob/master/code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRules.java#L22)
## GraphQL
Use `http://89.58.49.108:8080/graphql/` to get mining results by GraphQL. See http://89.58.49.108:8080/graphql/schema.graphql for the schema.
The schema is <b>not</b> final and <b>can change</b> anytime. 

## FAQ:
### Why would you ever write something already solved?
TL;DR; This project is currently a nice, refreshing side project while writing my master thesis.

I contribute to spoon on a regular schedule, and writing code for spoon helped my expanding my coding skills. In Spoon exists multiple bad smell, which are not hard to fix, but someone has to do it. If you have a Java parser at hand, it was a straightforward idea by me to fix bad smells this way. The biggest problem in spoon is/was the mix of JUnit 4 and JUnit 5. Currently, laughing-train can convert them automatically and speeds the migration process up by magnitudes.

### Why use Qodana?

I use vscode as IDE, but I'm impressed by the tooling JetBrains provides. Qodana seems way ahead of the competition and is a impressive tool to use. There exists abstraction for further analyzers, but I'm uncertain if I will ever implement them.

### Why not help an existing tool?
Existing tools have either pretty long release schedules, are not using spoon, or I see no value in the tool. Here I can merge, break and change things as I like without too much hassle.

### Can I use your tool for X?
Sure go ahead. If it helps, it's perfect. You are welcome to write an issue about it.

### More Questions?
Get in contact :)
