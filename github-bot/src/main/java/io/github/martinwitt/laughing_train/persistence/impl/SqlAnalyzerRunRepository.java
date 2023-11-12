package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.persistence.dao.AnalyzerRunDao;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class SqlAnalyzerRunRepository implements PanacheRepository<AnalyzerRunDao> {}
