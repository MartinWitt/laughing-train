# logging-log4j-tools 
 
# Bad smells
I found 31 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DynamicRegexReplaceableByCompiledPattern | 12 | false |
| SystemOutErr | 11 | false |
| BoundedWildcard | 3 | false |
| NullableProblems | 2 | false |
| ObsoleteCollection | 2 | false |
| HtmlWrongAttributeValue | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/ChangelogReleaser.java`
#### Snippet
```java
            throws IOException {
        final Path releaseXmlFile = ChangelogFiles.releaseXmlFile(releaseDirectory);
        System.out.format("writing release information to `%s`%n", releaseXmlFile);
        final ChangelogRelease changelogRelease = new ChangelogRelease(releaseVersion, releaseDate);
        Files.deleteIfExists(releaseXmlFile);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/ChangelogReleaser.java`
#### Snippet
```java
            final Path targetFile = releaseDirectory.resolve(releaseChangelogTemplateFileName);
            if (Files.exists(targetFile)) {
                System.out.format("keeping the existing changelog template file: `%s`%n", targetFile);
            } else {
                final Path sourceFile = unreleasedDirectory.resolve(releaseChangelogTemplateFileName);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/ChangelogReleaser.java`
#### Snippet
```java
            } else {
                final Path sourceFile = unreleasedDirectory.resolve(releaseChangelogTemplateFileName);
                System.out.format("moving the changelog template file `%s` to `%s`%n", sourceFile, targetFile);
                Files.move(sourceFile, targetFile);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/ChangelogReleaser.java`
#### Snippet
```java
            throw new IllegalStateException(message);
        }
        System.out.format("moving changelog directory `%s` to `%s`%n", unreleasedDirectory, releaseDirectory);
        Files.move(unreleasedDirectory, releaseDirectory);
        Files.createDirectories(unreleasedDirectory);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/ChangelogReleaser.java`
#### Snippet
```java
        final String releaseDate = ISO_DATE.format(args.releaseDate != null ? args.releaseDate : LocalDate.now());
        final int releaseVersionMajor = VersionUtils.versionMajor(args.releaseVersion);
        System.out.format("using `%s` for the release date%n", releaseDate);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/ChangelogReleaser.java`
#### Snippet
```java
            throws IOException {
        if (Files.exists(releaseDirectory)) {
            System.out.format(
                    "release directory `%s` already exists, only moving the changelog entry files from `%s`%n",
                    releaseDirectory, unreleasedDirectory);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/ChangelogReleaser.java`
#### Snippet
```java
            moveUnreleasedChangelogEntryFiles(unreleasedDirectory, releaseDirectory);
        } else {
            System.out.format(
                    "release directory `%s` doesn't exist, simply renaming the unreleased directory `%s`%n",
                    releaseDirectory, unreleasedDirectory);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/ChangelogReleaser.java`
#### Snippet
```java
                final String fileName = unreleasedChangelogEntryFile.getFileName().toString();
                final Path releasedChangelogEntryFile = releaseDirectory.resolve(fileName);
                System.out.format(
                        "moving changelog entry file `%s` to `%s`%n",
                        unreleasedChangelogEntryFile, releasedChangelogEntryFile);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/exporter/ChangelogExporter.java`
#### Snippet
```java
            // Report the operation
            if (releaseDirectoryCount == 1) {
                System.out.format("exported a single release directory: `%s`%n", releaseDirectories.get(0));
            } else {
                System.out.format(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/exporter/ChangelogExporter.java`
#### Snippet
```java
                System.out.format("exported a single release directory: `%s`%n", releaseDirectories.get(0));
            } else {
                System.out.format(
                        "exported %d release directories: ..., `%s`%n",
                        releaseDirectories.size(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/exporter/ChangelogExporter.java`
#### Snippet
```java
                            ChangelogFiles.unreleasedDirectory(args.changelogDirectory, upcomingReleaseVersionMajor);
                    final ChangelogRelease upcomingRelease = upcomingRelease(upcomingReleaseVersionMajor);
                    System.out.format("exporting upcoming release directory: `%s`%n", upcomingReleaseDirectory);
                    final int changelogEntryCount = exportRelease(
                            args.outputDirectory,
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-24-09-30-04.125.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/util/StringUtils.java`
#### Snippet
```java

    public static boolean isBlank(@Nullable final String input) {
        return input == null || input.matches("\\s*");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChangesImporter.java`
#### Snippet
```java
        // Create the `author`s
        final List<ChangelogEntry.Author> authors = new ArrayList<>(2);
        for (final String authorId : action.dev.split("\\s*,\\s*")) {
            if (!isBlank(authorId)) {
                authors.add(new ChangelogEntry.Author(authorId, null));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChangesImporter.java`
#### Snippet
```java
        final String sanitizedDescription = action
                .description
                .replaceAll("[^A-Za-z0-9]", "_")
                .replaceAll("_+", "_")
                .replaceAll("^[^A-Za-z0-9]*", "")
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChangesImporter.java`
#### Snippet
```java
                .description
                .replaceAll("[^A-Za-z0-9]", "_")
                .replaceAll("_+", "_")
                .replaceAll("^[^A-Za-z0-9]*", "")
                .replaceAll("[^A-Za-z0-9]*$", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChangesImporter.java`
#### Snippet
```java
                .replaceAll("[^A-Za-z0-9]", "_")
                .replaceAll("_+", "_")
                .replaceAll("^[^A-Za-z0-9]*", "")
                .replaceAll("[^A-Za-z0-9]*$", "");
        final String shortenedSanitizedDescription = sanitizedDescription.length() > 60
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChangesImporter.java`
#### Snippet
```java
                .replaceAll("_+", "_")
                .replaceAll("^[^A-Za-z0-9]*", "")
                .replaceAll("[^A-Za-z0-9]*$", "");
        final String shortenedSanitizedDescription = sanitizedDescription.length() > 60
                ? sanitizedDescription.substring(0, 60)
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChanges.java`
#### Snippet
```java
            if (isBlank(issue)) {
                issue = null;
            } else if (!issue.matches(issuePattern)) {
                throw XmlReader.failureAtXmlNode(element, "`issue` doesn't match with the `%s` pattern: `%s`", issuePattern, issue);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChanges.java`
#### Snippet
```java
            final String date = trimNullable(element.getAttribute("date"));
            final String datePattern = "^(TBD|[0-9]{4}-[0-9]{2}-[0-9]{2})$";
            if (!date.matches(datePattern)) {
                throw XmlReader.failureAtXmlNode(element, "`date` doesn't match with the `%s` pattern: `%s`", datePattern, date);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/releaser/VersionUtils.java`
#### Snippet
```java
    static String requireSemanticVersioning(final String version, final String fieldName) {
        Objects.requireNonNull(version, fieldName);
        if (!version.matches(VERSION_PATTERN)) {
            final String message = String.format(
                    "provided version in `%s` does not match the expected `<major>.<minor>.<patch>[-SNAPSHOT]` pattern: `%s`",
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/util/XmlWriter.java`
#### Snippet
```java
        final String padding = StringUtils.repeat(" ", rootElementName.length() + 2);
        return xml
                .replace("?><!--", "?>" + LS + "<!--")
                .replace("--><", "-->" + LS + "<")
                .replaceFirst(
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/util/XmlWriter.java`
#### Snippet
```java
        return xml
                .replace("?><!--", "?>" + LS + "<!--")
                .replace("--><", "-->" + LS + "<")
                .replaceFirst(
                        '<' + rootElementName + " (.+>" + LS + ")",
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/exporter/ChangelogExporter.java`
#### Snippet
```java
                final String changelogTemplateName = templateName(changelogDirectory, changelogTemplateSourceFile);
                final String changelogTemplateTargetFileName =
                        changelogTemplate.targetFileName.replaceAll("%v", release.version);
                final Path changelogTemplateTargetFile = outputDirectory.resolve(changelogTemplateTargetFileName);
                FreeMarkerUtils.render(
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Document`
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/util/XmlWriter.java`
#### Snippet
```java
    }

    public static String toString(final String rootElementName, final BiConsumer<Document, Element> documentConsumer) {
        try {

```

### BoundedWildcard
Can generalize to `? super Element`
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/util/XmlWriter.java`
#### Snippet
```java
    }

    public static String toString(final String rootElementName, final BiConsumer<Document, Element> documentConsumer) {
        try {

```

### BoundedWildcard
Can generalize to `? super Stream`
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/util/FileUtils.java`
#### Snippet
```java
            final Path directory,
            final boolean dotFilesSkipped,
            final Function<Stream<Path>, V> consumer) {
        try (final Stream<Path> paths = Files.walk(directory, 1)) {
            final Stream<Path> filteredPaths = paths.filter(path -> {
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@edu.umd.cs.findbugs.annotations.Nullable'
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChanges.java`
#### Snippet
```java
        final String dev;

        @Nullable
        final String dueTo;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@edu.umd.cs.findbugs.annotations.Nullable'
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChanges.java`
#### Snippet
```java
    static final class Action {

        @Nullable
        final String issue;

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/util/PositionalSaxEventHandler.java`
#### Snippet
```java
final class PositionalSaxEventHandler extends DefaultHandler {

    private final Stack<Element> elementStack = new Stack<>();

    private final StringBuilder textBuffer = new StringBuilder();
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/util/PositionalSaxEventHandler.java`
#### Snippet
```java
final class PositionalSaxEventHandler extends DefaultHandler {

    private final Stack<Element> elementStack = new Stack<>();

    private final StringBuilder textBuffer = new StringBuilder();
```

