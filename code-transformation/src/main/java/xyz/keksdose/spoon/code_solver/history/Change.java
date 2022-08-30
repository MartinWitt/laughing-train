package xyz.keksdose.spoon.code_solver.history;

import java.util.Objects;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class Change {

    private MarkdownString text;
    private String issue;
    private CtType<?> affectedType;
    private BadSmell badsmell = BadSmell.emptyRule();

    public Change(String text, String issue, CtType<?> affectedType) {
        this.text = MarkdownString.fromRaw(text);
        this.issue = issue;
        this.affectedType = affectedType;
    }

    @Deprecated
    public Change(MarkdownString text, String issue, CtType<?> affectedType) {
        this.text = text;
        this.issue = issue;
        this.affectedType = affectedType;
    }

    public Change(BadSmell badSmell, MarkdownString text, CtType<?> affectedType) {
        this.text = text;
        this.issue = badSmell.getName().asText();
        this.badsmell = badSmell;
        this.affectedType = affectedType;
    }

    public MarkdownString getChangeText() {
        return text;
    }

    /**
     * @return the affectedType
     */
    public CtType<?> getAffectedType() {
        return affectedType;
    }

    public String getIssue() {
        return issue;
    }

    public BadSmell getBadSmell() {
        return badsmell;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        return Objects.hash(affectedType, badsmell, issue, text);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Change)) {
            return false;
        }
        Change other = (Change) obj;
        return Objects.equals(affectedType, other.affectedType)
                && Objects.equals(badsmell, other.badsmell)
                && Objects.equals(issue, other.issue)
                && Objects.equals(text, other.text);
    }
}
