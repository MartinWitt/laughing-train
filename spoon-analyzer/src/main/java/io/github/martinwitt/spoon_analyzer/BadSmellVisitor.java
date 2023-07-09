package io.github.martinwitt.spoon_analyzer;

import io.github.martinwitt.spoon_analyzer.badsmells.Index_off_replaceable_by_contains.IndexOfReplaceableByContains;
import io.github.martinwitt.spoon_analyzer.badsmells.access_static_via_instance.AccessStaticViaInstance;
import io.github.martinwitt.spoon_analyzer.badsmells.array_can_be_replaced_with_enum_values.ArrayCanBeReplacedWithEnumValues;
import io.github.martinwitt.spoon_analyzer.badsmells.charset_object_can_be_used.CharsetObjectCanBeUsed;
import io.github.martinwitt.spoon_analyzer.badsmells.innerclass_may_be_static.InnerClassMayBeStatic;
import io.github.martinwitt.spoon_analyzer.badsmells.non_protected_constructor_In_abstract_class.NonProtectedConstructorInAbstractClass;
import io.github.martinwitt.spoon_analyzer.badsmells.private_final_method.PrivateFinalMethod;
import io.github.martinwitt.spoon_analyzer.badsmells.size_replaceable_by_is_empty.SizeReplaceableByIsEmpty;
import io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_implements.UnnecessaryImplements;
import io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_tostring.UnnecessaryTostring;

/**
 * A visitor interface for bad smells in code.
 *
 * @param <U> the return type of the visitor methods
 */
public interface BadSmellVisitor<U> extends Visitor<BadSmell, U> {

    /**
     * Visits a generic bad smell, which is not further specified. This method is called if no other method is more specific.
     * @param badSmell  the bad smell to visit
     * @return  the result of the visit
     */
    default U visit(BadSmell badSmell) {
        return emptyResult();
    }

    default U visit(IndexOfReplaceableByContains badSmell) {
        return emptyResult();
    }

    default U visit(AccessStaticViaInstance badSmell) {
        return emptyResult();
    }

    default U visit(ArrayCanBeReplacedWithEnumValues badSmell) {
        return emptyResult();
    }

    default U visit(CharsetObjectCanBeUsed badSmell) {
        return emptyResult();
    }

    default U visit(InnerClassMayBeStatic badSmell) {
        return emptyResult();
    }

    default U visit(NonProtectedConstructorInAbstractClass badSmell) {
        return emptyResult();
    }

    default U visit(PrivateFinalMethod badSmell) {
        return emptyResult();
    }

    default U visit(SizeReplaceableByIsEmpty badSmell) {
        return emptyResult();
    }

    default U visit(UnnecessaryImplements badSmell) {
        return emptyResult();
    }

    default U visit(UnnecessaryTostring badSmell) {
        return emptyResult();
    }

    default U emptyResult() {
        return null;
    }
}
