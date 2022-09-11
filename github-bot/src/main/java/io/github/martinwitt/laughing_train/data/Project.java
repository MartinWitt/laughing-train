package io.github.martinwitt.laughing_train.data;

import com.google.common.flogger.FluentLogger;
import java.io.File;
import java.io.Serializable;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public record Project(String name, String url, File folder, String sourceFolder)
        implements Serializable, AutoCloseable {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public String getOwnerRepoName() {
        String[] split = StringUtils.split(url(), "/");
        if (split.length == 2) {
            return split[0] + "/" + split[1];
        }
        return split[split.length - 2] + "/" + split[split.length - 1];
    }

    @Override
    public void close() throws Exception {
        FileUtils.deleteDirectory(folder());
        logger.atInfo().log("Cleaned %s", folder());
    }
}
