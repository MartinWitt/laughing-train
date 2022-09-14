package io.github.martinwitt.laughing_train;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;
import com.google.common.flogger.FluentLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;

@ApplicationScoped
public class Config {

    private static final ObjectMapper MAPPER =
            new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private String srcFolder = "src/main/java";
    private int maximumNumberOfPrs = 10;
    private Map<QodanaRules, Boolean> rules = new EnumMap<>(QodanaRules.class);
    private List<String> allowedUsers = new ArrayList<>();
    private boolean groupyByType = true;

    @Inject
    MarkdownPrinter markdownPrinter;

    public Config() {
        allowedUsers.add("MartinWitt");
        Arrays.stream(QodanaRules.values()).forEach(v -> rules.put(v, true));
    }

    /**
     * @return the srcFolder
     */
    public String getSrcFolder() {
        return srcFolder;
    }
    /**
     * @param srcFolder the srcFolder to set
     */
    public void setSrcFolder(String srcFolder) {
        this.srcFolder = srcFolder;
    }

    public void fromConfig(Config config) {
        this.srcFolder = config.getSrcFolder();
        this.maximumNumberOfPrs = config.getMaximumNumberOfPrs();
        this.allowedUsers = config.getAllowedUsers();
        this.rules = new EnumMap<>(config.rules);
        this.groupyByType = config.groupyByType;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        try {
            return MAPPER.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            logger.atWarning().withCause(e).log("Could not serialize config");
            return "Config [rules=" + rules + ", srcFolder=" + srcFolder + "]";
        }
    }

    /**
     * @return the rules
     */
    public Map<QodanaRules, Boolean> getRules() {
        return rules;
    }

    /**
     * {@return the maxNumberPRs}
     */
    public int getMaximumNumberOfPrs() {
        return maximumNumberOfPrs;
    }

    /**
     * @return the allowedUsers
     */
    public List<String> getAllowedUsers() {
        return allowedUsers;
    }
    /**
     * @param maximumNumberOfPrs the maximumNumberOfPrs to set
     */
    public void setMaximumNumberOfPrs(int maximumNumberOfPrs) {
        this.maximumNumberOfPrs = maximumNumberOfPrs;
    }

    @JsonIgnore
    public List<QodanaRules> getActiveRules() {
        return rules.entrySet().stream()
                .filter(Entry::getValue)
                .map(Entry::getKey)
                .collect(Collectors.toList());
    }

    @JsonIgnore
    public String regenerateConfig() {
        String options = "";
        try {
            options = markdownPrinter.toYamlMarkdown(MAPPER.writeValueAsString(this));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String configString =
                """
                ## Configure your repository
                ---
                ### Config
                <!-- config-start -->
                %s
                <!-- config-end -->
                ---
                ### Action Buttons
                 - [ ] <!-- reset --> Force refresh config
                 - [ ] <!-- createPRs --> Create fixes with given config
                 - [ ] <!-- disableAllRules --> Disables all rules
                """;
        return "Hi, In this issue you can configure laughing-train. The config uses yaml syntax. \n"
                + String.format(configString, options);
    }
    /**
     * @return the groupyByType
     */
    public boolean isGroupyByType() {
        return groupyByType;
    }

    /**
     * @param groupyByType the groupyByType to set
     */
    public void setGroupyByType(boolean groupyByType) {
        this.groupyByType = groupyByType;
    }
}
