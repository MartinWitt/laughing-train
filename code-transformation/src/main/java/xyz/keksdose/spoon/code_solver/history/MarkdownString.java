package xyz.keksdose.spoon.code_solver.history;

/**
 * This class wrappes a string with it's markdown formatted value.
 * Use this class to create markdown formatted strings.
 * {@link asString()} returns the raw string.
 * {@link asMarkdown()} returns the markdown formatted string.
 */
public class MarkdownString {

    private String text;
    private String markdownText;

    private MarkdownString(String text) {
        this.text = text;
        this.markdownText = text;
    }

    private MarkdownString(String text, String markdownText) {
        this.text = text;
        this.markdownText = markdownText;
    }

    /**
     * Creates an instance from the given text. The markdown text is the same as the text.
     * @param value the text
     * @return  the instance
     */
    public static MarkdownString fromRaw(String value) {
        return new MarkdownString(value);
    }

    /**
     * Creates an instance from the given text and markdown text.
     * @param value  the text
     * @param markdown  the text with markdown formattings
     * @return  the instance
     */
    public static MarkdownString fromMarkdown(String value, String markdown) {
        return new MarkdownString(value, markdown);
    }

    /**
     * Creates a markdown string from the given markdown text. The text is the same as the markdown text.
     * All {@code `} are removed in the raw text.
     * @param markdown  the markdown text
     * @return  the instance
     */
    public static MarkdownString fromMarkdown(String markdown) {
        return new MarkdownString(markdown.replace("`", ""), markdown);
    }
    /**
     * Returns the text.
     * @return  the text
     */
    public String asText() {
        return text;
    }

    /**
     * Returns the markdown text.
     * @return  the markdown text
     */
    public String asMarkdown() {
        return markdownText;
    }
}
