package model.dao;

import java.util.List;
import java.io.Serializable;

public interface GenericDAO<T, ID extends Serializable>{
    void save(T entity);
    
    T findById(ID id);
    
    void update(T entity);
    
    void delete(T entity);
    
    List<T> findAll();
}
