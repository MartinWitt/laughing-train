package io.github.martinwitt.laughing_train;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MarkdownPrinter {

    public String toMarkdown(String text) {
        return "`" + text + "`";
    }

    public String toJavaMarkdownBlock(String text) {
        return "```java\n" + text + "\n```\n";
    }

    public String toYamlMarkdown(String text) {
        return "```yaml\n" + text + "```";
    }
}
