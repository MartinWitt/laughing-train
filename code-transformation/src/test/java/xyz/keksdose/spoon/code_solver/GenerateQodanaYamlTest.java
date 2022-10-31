package xyz.keksdose.spoon.code_solver;

import com.contrastsecurity.sarif.SarifSchema210;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GenerateQodanaYamlTest {
    @Disabled("This test is only to generate a qodana.yaml file")
    @Test
    void generateAllRuleIdsFromResult() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append(
                """
    profile:
      name: qodana.recommended
    version: "1.0"
    linter: jetbrains/qodana-jvm-community:2022.3-eap
    include:
        """);
        Path path = Path.of("./src/test/resources/qodana.sarif.yml");
        StringReader reader = new StringReader(Files.readString(path));
        ObjectMapper mapper = new ObjectMapper();
        SarifSchema210 sarif = mapper.readValue(reader, SarifSchema210.class);
        long b = sarif.getRuns().get(0).getTool().getExtensions().stream()
                .filter(v -> v.getName().contains("java"))
                .count();
        System.out.println(b);
        var list = sarif.getRuns().get(0).getTool().getExtensions().stream()
                .filter(v -> v.getName().contains("java"))
                .map(v -> v.getRules())
                .flatMap(v -> v.stream())
                .map(v -> v.getId())
                .toList();
        builder.append(list.stream().map(v -> "  - name: " + v).collect(Collectors.joining("\n")));
        System.out.println(builder.toString());
    }
}
