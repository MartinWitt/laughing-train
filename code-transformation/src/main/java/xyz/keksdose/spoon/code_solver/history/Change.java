
package xyz.keksdose.spoon.code_solver.history;

import spoon.reflect.declaration.CtType;

public class Change {

	private MarkdownString text;
	private String issue;
	private CtType<?> affectedType;

	public Change(String text, String issue, CtType<?> affectedType) {
		this.text = MarkdownString.fromRaw(text);
		this.issue = issue;
		this.affectedType = affectedType;
	}

	public Change(MarkdownString text, String issue, CtType<?> affectedType) {
		this.text = text;
		this.issue = issue;
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

	/**
	 * @return the issue
	 */
	public String getIssue() {
		return issue;
	}
}
