package io.github.martinwitt.spoon_analyzer.badsmells.charset_object_can_be_used;

import static java.util.Map.entry;

import io.github.martinwitt.laughing_train.spoonutils.ConstructorMatcher;
import io.github.martinwitt.laughing_train.spoonutils.InvocationMatcher;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtType;

public class CharsetObjectCanBeUsedAnalyzer
    implements LocalAnalyzer, LocalRefactor<CharsetObjectCanBeUsed> {

  private static final Map<String, String> SUPPORTED_CHARSETS =
      Map.ofEntries(
          entry("US-ASCII", "US_ASCII"),
          entry("ASCII", "US_ASCII"),
          entry("ISO646-US", "US_ASCII"),
          entry("ISO-8859-1", "ISO_8859_1"),
          entry("8859_1", "ISO_8859_1"),
          entry("UTF-8", "UTF_8"),
          entry("UTF8", "UTF_8"),
          entry("UTF-16BE", "UTF_16BE"),
          entry("UTF16BE", "UTF_16BE"),
          entry("UTF-16LE", "UTF_16LE"),
          entry("UTF16LE", "UTF_16LE"),
          entry("UTF-16", "UTF_16"),
          entry("UTF16", "UTF_16"));

  private static final List<InvocationMatcher> matcher =
      List.of(
          new InvocationMatcher("java.lang.String", "getBytes", "java.lang.String"),
          new InvocationMatcher("java.io.ByteArrayOutputStream", "toString", "java.lang.String"),
          new InvocationMatcher(
              "java.net.URLDecoder", "decode", "java.lang.String", "java.lang.String"),
          new InvocationMatcher(
              "java.net.URLEncoder", "encode", "java.lang.String", "java.lang.String"),
          new InvocationMatcher(
              "java.nio.channels.Channels",
              "newReader",
              "java.nio.channels.ReadableByteChannel",
              "java.lang.String"),
          new InvocationMatcher(
              "java.nio.channels.Channels",
              "newWriter",
              "java.nio.channels.WritableByteChannel",
              "java.lang.String"),
          new InvocationMatcher(
              "java.util.Properties",
              "storeToXML",
              "java.io.OutputStream",
              "java.lang.String",
              "java.lang.String"));
  private static final List<ConstructorMatcher> ctorMatcher =
      List.of(
          new ConstructorMatcher(
              "java.lang.InputStreamerReader", "java.io.InputStream", "java.lang.String"),
          new ConstructorMatcher(
              "java.lang.OutputStreamWriter", "java.io.OutputStream", "java.lang.String"),
          new ConstructorMatcher("java.lang.String", "byte[]", "int", "int", "java.lang.String"),
          new ConstructorMatcher("java.lang.String", "byte[]", "java.lang.String"),
          new ConstructorMatcher("java.util.Scanner", "java.io.InputStream", "java.lang.String"),
          new ConstructorMatcher("java.util.Scanner", "java.io.File", "java.lang.String"),
          new ConstructorMatcher("java.util.Scanner", "java.nio.file.Path", "java.lang.String"),
          new ConstructorMatcher(
              "java.util.Scanner", "java.nio.channels.ReadableByteChannel", "java.lang.String"),
          new ConstructorMatcher(
              "java.io.PrintStream", "java.io.OutputStream", "boolean", "java.lang.String"),
          new ConstructorMatcher("java.io.PrintStream", "java.lang.String", "java.lang.String"),
          new ConstructorMatcher("java.io.PrintStream", "java.io.File", "java.lang.String"),
          new ConstructorMatcher(
              "java.io.PrintWriter", "java.io.OutputStream", "boolean", "java.lang.String"),
          new ConstructorMatcher("java.io.PrintWriter", "java.lang.String", "java.lang.String"),
          new ConstructorMatcher("java.io.PrintWriter", "java.io.File", "java.lang.String"));

  @Override
  public List<BadSmell> analyze(CtType<?> clazz) {
    List<BadSmell> badSmells = new ArrayList<>();
    for (InvocationMatcher invocationMatcher : matcher) {
      clazz.getElements(invocationMatcher).stream()
          .map(v -> new CharsetObjectCanBeUsed(clazz, v))
          .forEach(badSmells::add);
    }
    for (ConstructorMatcher constructorMatcher : ctorMatcher) {
      clazz.getElements(constructorMatcher).stream()
          .map(v -> new CharsetObjectCanBeUsed(clazz, v))
          .forEach(badSmells::add);
    }
    return badSmells;
  }

  // https://github.com/JetBrains/intellij-community/blob/3bdfb90acd447c2c70304ab4a2d53e19204aec5a/java/java-impl-inspections/src/com/intellij/codeInspection/CharsetObjectCanBeUsedInspection.java#LL73C1-L86C33
  /*
  new CharsetConstructorMatcher("java.io.InputStreamReader", "java.io.InputStream", ""),
  new CharsetConstructorMatcher("java.io.OutputStreamWriter", "java.io.OutputStream", ""),
  new CharsetConstructorMatcher(JAVA_LANG_STRING, "byte[]", "int", "int", ""),
  new CharsetConstructorMatcher(JAVA_LANG_STRING, "byte[]", ""),
  new CharsetConstructorMatcher("java.util.Scanner", "java.io.InputStream", ""),
  new CharsetConstructorMatcher("java.util.Scanner", JAVA_IO_FILE, ""),
  new CharsetConstructorMatcher("java.util.Scanner", "java.nio.file.Path", ""),
  new CharsetConstructorMatcher("java.util.Scanner", "java.nio.channels.ReadableByteChannel", ""),
  new CharsetConstructorMatcher("java.io.PrintStream", "java.io.OutputStream", "boolean", ""),
  new CharsetConstructorMatcher("java.io.PrintStream", JAVA_LANG_STRING, ""),
  new CharsetConstructorMatcher("java.io.PrintStream", JAVA_IO_FILE, ""),
  new CharsetConstructorMatcher("java.io.PrintWriter", "java.io.OutputStream", "boolean", ""),
  new CharsetConstructorMatcher("java.io.PrintWriter", JAVA_LANG_STRING, ""),
  new CharsetConstructorMatcher("java.io.PrintWriter", JAVA_IO_FILE, ""),

  new CharsetMethodMatcher(JAVA_LANG_STRING, "getBytes", ""),
  new CharsetMethodMatcher("java.io.ByteArrayOutputStream", "toString", ""),
  new CharsetMethodMatcher("java.net.URLDecoder", "decode", JAVA_LANG_STRING, ""),
  new CharsetMethodMatcher("java.net.URLEncoder", "encode", JAVA_LANG_STRING, ""),
  new CharsetMethodMatcher("java.nio.channels.Channels", "newReader", "java.nio.channels.ReadableByteChannel", ""),
  new CharsetMethodMatcher("java.nio.channels.Channels", "newWriter", "java.nio.channels.WritableByteChannel", ""),
  new CharsetMethodMatcher(JAVA_UTIL_PROPERTIES, "storeToXML", "java.io.OutputStream", JAVA_LANG_STRING, ""),
   */

  @Override
  public void refactor(CharsetObjectCanBeUsed badSmell) {
    List<CtExpression<?>> arguments =
        Optional.ofNullable(badSmell.getInvocation())
            .map(v -> v.getArguments())
            .orElse(badSmell.getCtorCall().getArguments());
    CtExpression<?> ctExpression = arguments.get(arguments.size() - 1);
    if (ctExpression instanceof CtLiteral) {
      CtLiteral<?> ctLiteral = (CtLiteral<?>) ctExpression;
      String charset = ctLiteral.getValue().toString();
      String string = SUPPORTED_CHARSETS.get(charset);
      if (string != null) {
        ctExpression.replace(
            ctExpression
                .getFactory()
                .createCodeSnippetExpression("java.nio.charset.StandardCharsets." + string));
      }
    }
  }
}
