package ru.job4j.generic;

/**
 * Interface for store Base type classes.
 * @author Roman Bednyashov (hipnorosva@gmail.com).
 * @since 0.1
 * @version 0.1
 */
public interface Store<T extends Base> {

    void add(T model);

    boolean replace(String id, T model);

    boolean delete(String id);

    T findById(String id);
}
