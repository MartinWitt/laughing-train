
package xyz.keksdose.spoon.code_solver.history;

import java.util.ArrayList;
import java.util.List;

public class Changelog {

	private List<Change> changes = new ArrayList<>();

	public void addChange(Change change) {
		changes.add(change);
	}

	/**
	 * @return the changes
	 */
	public List<Change> getChanges() {
		return changes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("The following has changed in the code:\n");
		for (Change change : changes) {
			builder.append(change.getText() + "\n");
		}
		return builder.toString();
	}

}
