package io.github.martinwitt.spoon_analyzer;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.spoon_analyzer.badsmells.Index_off_replaceable_by_contains.IndexOfReplaceableByContainsAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.access_static_via_instance.AccessStaticViaInstanceAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.array_can_be_replaced_with_enum_values.ArrayCanBeReplacedWithEnumValuesAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.charset_object_can_be_used.CharsetObjectCanBeUsedAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.innerclass_may_be_static.InnerClassMayBeStaticAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.non_protected_constructor_In_abstract_class.NonProtectedConstructorInAbstractClassAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.private_final_method.PrivateFinalMethodAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.size_replaceable_by_is_empty.SizeReplaceableByIsEmptyAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_implements.UnnecessaryImplementsAnalyzer;
import io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_tostring.UnnecessaryTostringAnalyzer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;

public class SpoonAnalyzer {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private final List<LocalAnalyzer> localAnalyzers;

    public SpoonAnalyzer() {
        this.localAnalyzers = new ArrayList<>();
        localAnalyzers.add(new AccessStaticViaInstanceAnalyzer());
        localAnalyzers.add(new ArrayCanBeReplacedWithEnumValuesAnalyzer());
        localAnalyzers.add(new CharsetObjectCanBeUsedAnalyzer());
        localAnalyzers.add(new IndexOfReplaceableByContainsAnalyzer());
        localAnalyzers.add(new InnerClassMayBeStaticAnalyzer());
        localAnalyzers.add(new NonProtectedConstructorInAbstractClassAnalyzer());
        localAnalyzers.add(new PrivateFinalMethodAnalyzer());
        localAnalyzers.add(new SizeReplaceableByIsEmptyAnalyzer());
        localAnalyzers.add(new UnnecessaryImplementsAnalyzer());
        localAnalyzers.add(new UnnecessaryTostringAnalyzer());
    }

    public List<BadSmell> analyze(String path) {

        List<BadSmell> badSmells = new ArrayList<>();
        try {
            List<Path> files = Files.walk(Path.of(path)).filter(v -> Files.isDirectory(v)).toList();
            files = PathUtils.filterResourcePaths(files);

            Launcher launcher = new Launcher();
            for (Path p : files) {
                launcher.addInputResource(p.toString());
            }
            launcher.getEnvironment().setAutoImports(true);
            launcher.getEnvironment().setIgnoreDuplicateDeclarations(true);
            launcher.getEnvironment().setNoClasspath(true);
            launcher.getEnvironment().setComplianceLevel(17);
            launcher.getEnvironment().setIgnoreSyntaxErrors(true);
            launcher.getEnvironment().setLevel("ERROR");
            var model = launcher.buildModel();
            logger.atInfo().log("Found %s types.", model.getAllTypes().size());
            for (CtType<?> type : model.getAllTypes()) {
                for (LocalAnalyzer analyzer : localAnalyzers) {
                    var badSmell = analyzer.analyze(type);
                    if (badSmell != null) {
                        badSmells.addAll(badSmell);
                    }
                }
            }
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error while analyzing.");
        }
        return badSmells;
    }

    public static void main(String[] args) {
        var analyzer = new SpoonAnalyzer();
        var badSmells = analyzer.analyze("./assertj-assertions-generator-maven-plugin");
        for (BadSmell badSmell : badSmells) {
            logger.atInfo().log(badSmell.toString());
        }
    }
}
