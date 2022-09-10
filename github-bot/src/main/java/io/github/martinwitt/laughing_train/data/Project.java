package io.github.martinwitt.laughing_train.data;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;

public record Project(String name, String url, File folder) implements Serializable {
    public String getOwnerRepoName() {
        String[] split = StringUtils.split(name(), "/");
        if (split.length == 2) {
            return split[0] + "/" + split[1];
        }
        return split[split.length - 2] + "/" + split[split.length - 1];
    }
}
