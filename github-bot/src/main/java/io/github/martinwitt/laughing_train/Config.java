package io.github.martinwitt.laughing_train;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;
import com.google.common.flogger.FluentLogger;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;

@ApplicationScoped
public class Config {

    private static final ObjectMapper MAPPER =
            new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private String srcFolder = "src/main/java";
    private int maxNumberPRs = 10;
    private Map<QodanaRules, Boolean> rules = new EnumMap<>(QodanaRules.class);

    public Config() {
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
        this.rules = new EnumMap<>(config.rules);
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
        return maxNumberPRs;
    }

    @JsonIgnore
    public List<QodanaRules> getActiveRules() {
        return rules.entrySet().stream()
                .filter(Entry::getValue)
                .map(Entry::getKey)
                .collect(Collectors.toList());
    }
}
