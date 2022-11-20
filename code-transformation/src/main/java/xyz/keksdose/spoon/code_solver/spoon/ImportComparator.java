package xyz.keksdose.spoon.code_solver.spoon;

import com.google.errorprone.annotations.Var;
import java.util.Comparator;
import spoon.experimental.CtUnresolvedImport;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtImportKind;

public class ImportComparator implements Comparator<CtImport> {

    /**
     * Defines order of imports:
     * 1) imports are ordered alphabetically
     * 2) static imports are last
     */
    @Override
    public int compare(CtImport imp1, CtImport imp2) {
        if (isStaticImport(imp1) && isStaticImport(imp2)) {
            String str1 = removeSuffixSemicolon(imp1.toString());
            String str2 = removeSuffixSemicolon(imp2.toString());
            return str1.compareTo(str2);
        }
        @Var int valueImport1 = getImportKindOrder(imp1.getImportKind());
        if (imp1.getImportKind() == CtImportKind.UNRESOLVED) {
            valueImport1 = analyseUnresolvedImport((CtUnresolvedImport) imp1);
        }
        @Var int valueImport2 = getImportKindOrder(imp2.getImportKind());
        if (imp2.getImportKind() == CtImportKind.UNRESOLVED) {
            valueImport2 = analyseUnresolvedImport((CtUnresolvedImport) imp2);
        }

        int dif = valueImport1 - valueImport2;
        if (dif != 0) {
            return dif;
        }
        String str1 = removeSuffixSemicolon(imp1.toString());
        String str2 = removeSuffixSemicolon(imp2.toString());
        return str1.compareTo(str2);
    }

    private int analyseUnresolvedImport(CtUnresolvedImport imp1) {
        if (imp1.isStatic() && imp1.getUnresolvedReference().contains("*")) {
            return 3;
        }
        if (imp1.isStatic()) {
            return 2;
        }
        return 0;
    }

    private boolean isStaticImport(CtImport imp) {
        if (imp.getImportKind() == CtImportKind.UNRESOLVED) {
            return ((CtUnresolvedImport) imp).isStatic();
        }
        return imp.getImportKind() == CtImportKind.METHOD || imp.getImportKind() == CtImportKind.FIELD;
    }

    private static String removeSuffixSemicolon(String str) {
        if (str.endsWith(";")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    private int getImportKindOrder(CtImportKind importKind) {

        switch (importKind) {
            case TYPE:
            case ALL_TYPES:
                return 0;
            default:
                return 1;
        }
    }
}
