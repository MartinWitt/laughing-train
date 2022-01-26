
package xyz.keksdose.spoon.code_solver.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import com.google.common.flogger.FluentLogger;

public class ConfigStore {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();

	private static final String CONFIG_FILE_NAME = "app.properties";
	private Properties property;

	public ConfigStore() {
		property = new Properties();
		URL rootPath = Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE_NAME);
		String appConfigPath = URLDecoder.decode(rootPath.getPath(), StandardCharsets.UTF_8);
		try (FileInputStream configFile = new FileInputStream(new File(appConfigPath))) {
			property.load(configFile);
		}
		catch (IOException e) {
			logger.atSevere().withCause(e).log("Could not load app.properties");
		}
	}

	public String getGitAuthor() {
		return property.getProperty("git.author");
	}

	public String getGitEmail() {
		return property.getProperty("git.mail");
	}

	public String getGitDefaultBranchName() {
		return property.getProperty("git.default_branch");
	}

	public String getGitBranchPrefix() {
		return property.getProperty("git.branch_prefix");
	}

	public boolean getPrintMarkdown() {
		return Boolean.valueOf(property.getProperty("changelog.markdown"));
	}

	public String getMarkdownChangeLogFile() {
		return property.getProperty("changelog.markdown.file");
	}
}
