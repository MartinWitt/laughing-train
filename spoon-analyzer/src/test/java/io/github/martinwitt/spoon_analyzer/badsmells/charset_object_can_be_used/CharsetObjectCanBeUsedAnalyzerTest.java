package io.github.martinwitt.spoon_analyzer.badsmells.charset_object_can_be_used;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class CharsetObjectCanBeUsedAnalyzerTest {

    @Test
    void testMethodCalls() {
        String code =
                """
          import java.io.ByteArrayOutputStream;
          import java.io.OutputStream;
          import java.net.URLDecoder;
          import java.net.URLEncoder;
          import java.nio.ByteBuffer;
          import java.nio.channels.Channels;
          import java.nio.channels.ReadableByteChannel;
          import java.nio.channels.WritableByteChannel;
          import java.util.Properties;

          public class CharsetExample {
              public static void main(String[] args) throws Exception {
                  // Get bytes from a string using UTF-8 encoding
                  String input = "Hello, world!";
                  byte[] bytes = input.getBytes("UTF-8");
                  System.out.println("Bytes: " + bytes);
                }
            }
                """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        CharsetObjectCanBeUsedAnalyzer analyzer = new CharsetObjectCanBeUsedAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);
        assertEquals(1, result.size());
    }

    @Test
    void testByteArrayOutputStream() {
        String code =
                """
          import java.io.ByteArrayOutputStream;
          import java.io.OutputStream;
          import java.net.URLDecoder;
          import java.net.URLEncoder;
          import java.nio.ByteBuffer;
          import java.nio.channels.Channels;
          import java.nio.channels.ReadableByteChannel;
          import java.nio.channels.WritableByteChannel;
          import java.util.Properties;

          public class CharsetExample {
              public static void main(String[] args) throws Exception {
                  // Convert bytes to a string using UTF-8 encoding
                  ByteArrayOutputStream baos = new ByteArrayOutputStream();
                  WritableByteChannel channel = Channels.newChannel(baos);
                  ByteBuffer buffer = ByteBuffer.wrap(bytes);
                  channel.write(buffer);
                  String output = baos.toString("UTF-8");
                  System.out.println("Output: " + output)
                }
            }
                """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        CharsetObjectCanBeUsedAnalyzer analyzer = new CharsetObjectCanBeUsedAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);
        assertEquals(1, result.size());
    }

    @Test
    void testURLDecoder() {
        String code =
                """
          import java.io.ByteArrayOutputStream;
          import java.io.OutputStream;
          import java.net.URLDecoder;
          import java.net.URLEncoder;
          import java.nio.ByteBuffer;
          import java.nio.channels.Channels;
          import java.nio.channels.ReadableByteChannel;
          import java.nio.channels.WritableByteChannel;
          import java.util.Properties;

          public class CharsetExample {
              public static void main(String[] args) throws Exception {
                  // Decode a URL-encoded string using UTF-8 encoding
                  String encoded = "https%3A%2F%2Fexample.com%2F";
                  String decoded = URLDecoder.decode(encoded, "UTF-8");
                  System.out.println("Decoded: " + decoded);
                }
            }
                """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        CharsetObjectCanBeUsedAnalyzer analyzer = new CharsetObjectCanBeUsedAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);
        assertEquals(1, result.size());
    }

    @Test
    void testUrlEncoder() {
        String code =
                """
          import java.io.ByteArrayOutputStream;
          import java.io.OutputStream;
          import java.net.URLDecoder;
          import java.net.URLEncoder;
          import java.nio.ByteBuffer;
          import java.nio.channels.Channels;
          import java.nio.channels.ReadableByteChannel;
          import java.nio.channels.WritableByteChannel;
          import java.util.Properties;

          public class CharsetExample {
              public static void main(String[] args) throws Exception {

                  // Encode a string using UTF-8 encoding
                  String toEncode = "https://example.com/";
                  String encoded2 = URLEncoder.encode(toEncode, "UTF-8");
                  System.out.println("Encoded: " + encoded2);
                }
            }
                """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        CharsetObjectCanBeUsedAnalyzer analyzer = new CharsetObjectCanBeUsedAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);
        assertEquals(1, result.size());
    }

    @Test
    void testNewWriter() {
        String code =
                """
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

      public class CharsetExample {
                    public static void main(String[] args) throws Exception {
        // Create a file channel for a new file
        File file = new File("output.txt");
        FileOutputStream fos = new FileOutputStream(file);
        FileChannel channel = fos.getChannel();

        // Create a writer for the file channel using UTF-8 encoding
        String charsetName = "UTF-8";
        WritableByteChannel writer = Channels.newWriter(channel, charsetName);
            }
        }
            """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        CharsetObjectCanBeUsedAnalyzer analyzer = new CharsetObjectCanBeUsedAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);
        assertEquals(1, result.size());
    }

    @Test
    void teststoreToXML() {
        String code =
                """
          import java.io.ByteArrayOutputStream;
          import java.io.OutputStream;
          import java.net.URLDecoder;
          import java.net.URLEncoder;
          import java.nio.ByteBuffer;
          import java.nio.channels.Channels;
          import java.nio.channels.ReadableByteChannel;
          import java.nio.channels.WritableByteChannel;
          import java.util.Properties;

          public class CharsetExample {
              public static void main(String[] args) throws Exception {
                  // Store properties to an output stream using UTF-8 encoding
                  Properties props = new Properties();
                  props.setProperty("foo", "bar");
                  OutputStream os = System.out;
                  String comment = "This is a comment";
                  props.storeToXML(os, comment, "UTF-8");
                }
            }
                """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        CharsetObjectCanBeUsedAnalyzer analyzer = new CharsetObjectCanBeUsedAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);
        assertEquals(1, result.size());
    }

    @Test
    void testFileWriter() {
        String code =
                """
                import java.io.File;
                import java.util.Scanner;
                class Foo {

                  public void bar() throws Exception {
                    File file = new File("output.txt");
                    Scanner scanner = new Scanner(file, "UTF-8");
                  }
                }
                """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        CharsetObjectCanBeUsedAnalyzer analyzer = new CharsetObjectCanBeUsedAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        System.out.println(simpleClass);
        var result = analyzer.analyze(simpleClass);
        assertEquals(1, result.size());
    }

    @Test
    void testRefactorFileWriter() {
        String code =
                """
          import java.io.File;
          import java.util.Scanner;
          class Foo {

            public void bar() throws Exception {
              File file = new File("output.txt");
              Scanner scanner = new Scanner(file, "UTF-8");
            }
          }
          """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        CharsetObjectCanBeUsedAnalyzer analyzer = new CharsetObjectCanBeUsedAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);
        assertEquals(1, result.size());
        result.get(0).fix();
        Assertions.assertThat(simpleClass.toString()).contains("java.nio.charset.StandardCharsets.UTF_8");
    }
}
