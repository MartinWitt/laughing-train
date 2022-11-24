package io.github.martinwitt.laughing_train.persistence.converter;

/**
 * This interface is used to convert between entities and DAOs. It is used to separate the entity from the DAO.
 */
interface DaoConverter<T, U> {

    U convertToDao(T entity);

    T convertToEntity(U dao);

}
