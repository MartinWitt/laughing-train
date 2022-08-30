package xyz.keksdose.spoon.code_solver.spoon;

import spoon.reflect.cu.position.NoSourcePosition;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.path.CtRole;
import spoon.support.modelobs.ChangeCollector;

public class FragmentAwareChangeCollector extends ChangeCollector {

    @Override
    protected void onChange(CtElement currentElement, CtRole role) {
        if (!currentElement.isParentInitialized() && !(currentElement instanceof CtCompilationUnit)) {
            // parent is not initialized. It is just creation of a temporary element
            // ignore such "change"
            return;
        }
        CtCompilationUnit cu = currentElement.getPosition().getCompilationUnit();
        if (!(cu instanceof NoSourcePosition.NullCompilationUnit)) {
            // getOriginalSourceFragment is not only a getter, it actually
            // builds a tree of SourceFragments of compilation unit of the modified element
            try {
                cu.getOriginalSourceFragment();
            } catch (Exception ignore) {
            }
        }

        super.onChange(currentElement, role);
    }
}
