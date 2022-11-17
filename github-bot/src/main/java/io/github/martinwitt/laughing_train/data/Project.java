package io.github.martinwitt.laughing_train.data;

import com.google.common.flogger.FluentLogger;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.util.function.Supplier;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public record Project(String name, String url, File folder, String sourceFolder, String commitHash)
        implements Serializable {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public String getOwnerRepoName() {
        String[] split = StringUtils.split(url(), "/");
        if (split.length == 2) {
            return split[0] + "/" + split[1];
        }
        return split[split.length - 2] + "/" + split[split.length - 1];
    }
    /**
     * Executes the given command in the project folder and deletes the folder afterwards
     * @param runnable  the command to execute
     */
    public <T> T runInContext(Supplier<T> runnable) {
        try (Closeable closeable = () -> FileUtils.deleteQuietly(folder())) {
            return runnable.get();
        } catch (Exception logged) {
            // retry
            if (!FileUtils.deleteQuietly(folder())) {
                logger.atWarning().log("Could not delete folder %s", folder());
            }
        }
        return null;
    }
}
