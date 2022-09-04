package io.github.martinwitt.laughing_train;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UserWhitelist {

    @Inject
    Config config;

    public boolean isWhitelisted(String user) {
        return isMartin(user) && !isSelf(user);
    }

    private boolean isMartin(String user) {
        return config.getAllowedUsers().contains(user);
    }

    private boolean isSelf(String user) {
        return user.equals(Constants.BOT_NAME);
    }
}
