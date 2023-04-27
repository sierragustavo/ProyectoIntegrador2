package repository;

import java.util.List;

import jakarta.persistence.*;

public class EstudianteRepository<T> implements Repository<T> {
    private final EntityManager entityManager;
    private final Class<T> entityClass;

    public EstudianteRepository(EntityManager entityManager, Class<T> entityClass) {
        this.entityManager = entityManager;
        this.entityClass = entityClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }

	public void save(T entity) {
		// TODO Auto-generated method stub
		
	}

	public T findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public T update(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

}