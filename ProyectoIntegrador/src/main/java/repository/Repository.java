package repository;

import java.util.List;

public interface Repository<T> {
    public void save(T entity);
    public T findById(Long id);
    public List<T> findAll();
    public T update(T entity);
    public void delete(T entity);
}