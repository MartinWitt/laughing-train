package xyz.keksdose.spoon.code_solver.spoon;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.reflect.FieldUtils;
import spoon.compiler.Environment;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.ElementPrinterHelper;
import spoon.reflect.visitor.PrinterHelper;
import spoon.reflect.visitor.PrintingContext.Writable;
import spoon.reflect.visitor.TokenWriter;
import spoon.reflect.visitor.printer.CommentOffset;
import spoon.support.reflect.CtExtendedModifier;
import spoon.support.sniper.SniperJavaPrettyPrinter;
import spoon.support.util.ModelList;

public class ImportAwareSniperPrinter extends SniperJavaPrettyPrinter {

    private ElementPrinterHelper ghostPrinterHelper;
    private TokenWriter printer;

    public ImportAwareSniperPrinter(Environment env) {
        super(env);
        this.setLineSeparator("\n");
        printer = this.getPrinterTokenWriter();
        ghostPrinterHelper = new GhostElementPrinterHelper(printer, this, env);
    }

    private PrinterHelper getPrinterHelper() {
        return this.getPrinterTokenWriter().getPrinterHelper();
    }

    @Override
    protected ModelList<CtImport> getImports(CtCompilationUnit compilationUnit) {
        return compilationUnit.getImports();
    }

    @Override
    public void visitCtImport(CtImport ctImport) {
        if (ctImport instanceof NewlineImport) {
            String s = getPrinterTokenWriter().getPrinterHelper().toString();
            if (!endsWithNewline(s)) {
                getPrinterTokenWriter().writeln();
            }
            return;
        }
        super.visitCtImport(ctImport.clone());
    }

    private boolean endsWithNewline(String s) {
        return s.endsWith("\n") || s.endsWith("\r\n");
    }

    // Fix for newline after annotation on parameters
    @Override
    public <T> void visitCtParameter(CtParameter<T> parameter) {
        getElementPrinterHelper().writeComment(parameter);
        writeAnnotations(parameter);
        getElementPrinterHelper().writeModifiers(parameter);
        if (parameter.isVarArgs()) {
            scan(((CtArrayTypeReference<T>) parameter.getType()).getComponentType());
            getPrinterTokenWriter().writeSeparator("...");
        } else if (parameter.isInferred() && this.env.getComplianceLevel() >= 11) {
            getPrinterTokenWriter().writeKeyword("var");
        } else {
            scan(parameter.getType());
        }
        // dont write spaces if the type is implicit
        if (parameter.getType() != null && !parameter.getType().isImplicit()) {
            getPrinterTokenWriter().writeSpace();
        }
        getPrinterTokenWriter().writeIdentifier(parameter.getSimpleName());
    }

    /**
     * Writes the annotations for the given element.
     */
    private void writeAnnotations(CtElement element) {
        for (CtAnnotation<?> annotation : element.getAnnotations()) {
            // if element is a type reference and the parent is a typed element
            // which contains exactly the same annotation, then we are certainly in this case:
            // @myAnnotation String myField
            // in which case the annotation is attached to the type and the variable
            // in that case, we only print the annotation once.
            if (element.isParentInitialized()
                    && element instanceof CtTypeReference
                    && (element.getParent() instanceof CtTypedElement)
                    && element.getParent().getAnnotations().contains(annotation)) {
                continue;
            }

            this.scan(annotation);
            if (element instanceof CtParameter) {
                getPrinterTokenWriter().writeSpace();
            } else {
                getPrinterTokenWriter().writeSpace();
            }
        }
    }

    @Override
    public <A extends Annotation> void visitCtAnnotation(CtAnnotation<A> annotation) {
        if (!(annotation instanceof NewLineAnnotation)) {
            super.visitCtAnnotation(annotation);
        }
    }

    @Override
    public <T> void visitCtMethod(CtMethod<T> m) {
        ghostPrinterHelper.writeComment(m, CommentOffset.BEFORE);
        ghostPrinterHelper.visitCtNamedElement(m, sourceCompilationUnit);
        ghostPrinterHelper.writeModifiers(m);
        ghostPrinterHelper.writeFormalTypeParameters(m);
        if (!m.getFormalCtTypeParameters().isEmpty()) {
            printer.writeSpace();
        }
        try (Writable _context = getContext().modify().ignoreGenerics(false)) {
            scan(m.getType());
        }
        printer.writeSpace();
        printer.writeIdentifier(m.getSimpleName());
        ghostPrinterHelper.writeExecutableParameters(m);
        ghostPrinterHelper.writeThrowsClause(m);
        if (m.getBody() != null) {
            printer.writeSpace();
            scan(m.getBody());
            if (m.getBody().getPosition().isValidPosition()) {
                if (m.getBody().getPosition().getCompilationUnit() == sourceCompilationUnit) {
                    if (m.getBody().getStatements().isEmpty()
                            || !(m.getBody()
                                            .getStatements()
                                            .get(m.getBody().getStatements().size() - 1)
                                    instanceof CtReturn)) {
                        getPrinterHelper()
                                .putLineNumberMapping(m.getBody().getPosition().getEndLine());
                    }
                } else {
                    getPrinterHelper().undefineLine();
                }
            } else {
                getPrinterHelper().undefineLine();
            }
        } else {
            printer.writeSeparator(";");
        }
        ghostPrinterHelper.writeComment(m, CommentOffset.AFTER);
    }

    private static class GhostElementPrinterHelper extends ElementPrinterHelper {

        private final TokenWriter printer;

        public GhostElementPrinterHelper(
                TokenWriter printerTokenWriter, DefaultJavaPrettyPrinter prettyPrinter, Environment env) {
            super(printerTokenWriter, prettyPrinter, env);
            this.printer = printerTokenWriter;
            this.printer.getPrinterHelper();
        }

        /**  writes the modifiers of this modifiable in a specific order */
        public void writeModifiers(CtModifiable modifiable) {
            // write the modifiers according to the convention on order
            List<String> firstPosition = new ArrayList<>(); // visibility: public, private, protected
            List<String> secondPosition = new ArrayList<>(); // keywords: static, abstract
            List<String> thirdPosition = new ArrayList<>(); // all other things

            for (CtExtendedModifier extendedModifier : modifiable.getExtendedModifiers()) {
                if (!extendedModifier.isImplicit()) {
                    ModifierKind modifierKind = extendedModifier.getKind();
                    if (extendedModifier instanceof EmptyModifier) {
                        printer.getPrinterHelper().setShouldWriteTabs(true);
                        printer.getPrinterHelper().writeSpace();
                        var field =
                                FieldUtils.getField(printer.getPrinterHelper().getClass(), "sbf", true);
                        try {
                            var sbf = (StringBuffer) field.get(printer.getPrinterHelper());
                            sbf.deleteCharAt(sbf.length() - 1);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        // printer.writeln().incTab().writeSpace();
                        continue;
                    }
                    if (modifierKind == ModifierKind.PUBLIC
                            || modifierKind == ModifierKind.PRIVATE
                            || modifierKind == ModifierKind.PROTECTED) {
                        firstPosition.add(modifierKind.toString());
                    } else if (modifierKind == ModifierKind.ABSTRACT || modifierKind == ModifierKind.STATIC) {
                        secondPosition.add(modifierKind.toString());
                    } else {
                        thirdPosition.add(modifierKind.toString());
                    }
                }
            }

            for (String s : firstPosition) {
                printer.writeKeyword(s).writeSpace();
            }

            for (String s : secondPosition) {
                printer.writeKeyword(s).writeSpace();
            }

            for (String s : thirdPosition) {
                printer.writeKeyword(s).writeSpace();
            }

            if (modifiable instanceof CtMethod) {
                CtMethod m = (CtMethod) modifiable;
                if (m.isDefaultMethod()) {
                    printer.writeKeyword("default").writeSpace();
                }
            }
        }
    }
}
