package io.github.martinwitt.laughing_train.persistence.converter;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.dao.BadSmellDao;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

public class BadSmellDaoConverter implements DaoConverter<BadSmell, BadSmellDao> {

    @Override
    public BadSmellDao convertToDao(BadSmell entity) {
        BadSmellDao dao = new BadSmellDao();
        dao.setAnalyzer(entity.getAnalyzer());
        dao.setIdentifier(entity.getIdentifier());
        dao.setRuleID(entity.ruleID().ruleID());
        dao.setFilePath(entity.filePath());
        dao.setMessage(entity.message());
        dao.setMessageMarkdown(entity.messageMarkdown());
        dao.setSnippet(entity.snippet());
        dao.setProjectName(entity.getProjectName());
        dao.setProjectUrl(entity.getProjectUrl());
        dao.setCommitHash(entity.getCommitHash());
        dao.setPosition(entity.position());
        return dao;
    }

    @Override
    public BadSmell convertToEntity(BadSmellDao dao) {
        Result result = new Result(
                dao.getAnalyzer(),
                new RuleId(dao.getRuleID()),
                dao.getFilePath(),
                dao.getPosition(),
                dao.getMessage(),
                dao.getMessageMarkdown(),
                dao.getSnippet());
        return new BadSmell(result, dao.getProjectName(), dao.getProjectUrl(), dao.getCommitHash());
    }

    private record Result(
            String analyzer,
            RuleId ruleID,
            String filePath,
            Position position,
            String message,
            String messageMarkdown,
            String snippet)
            implements AnalyzerResult {

        @Override
        public String getAnalyzer() {
            return analyzer();
        }
    }
}
