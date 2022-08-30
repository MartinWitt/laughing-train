package xyz.keksdose.spoon.code_solver.history;

import java.util.HashSet;
import java.util.Set;
import spoon.reflect.declaration.CtType;

public class ChangeListener {

    private boolean changed;
    private Set<CtType<?>> changedTypes = new HashSet<>();
    private Changelog changelog = new Changelog();

    public boolean isChanged() {
        return changed;
    }

    public void reset() {
        changed = false;
    }

    public void setChanged(CtType<?> changedType, Change change) {
        changed = true;
        changedTypes.add(changedType);
        changelog.addChange(change);
    }

    public boolean isChanged(CtType<?> type) {
        return changedTypes.contains(type);
    }

    /**
     * @return the changelog
     */
    public Changelog getChangelog() {
        return changelog;
    }
}
