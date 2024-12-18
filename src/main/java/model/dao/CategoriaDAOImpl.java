package model.dao;

import java.io.Serializable;
import model.entity.Categoria;

public class CategoriaDAOImpl extends GenericDAOImpl<Categoria, Serializable>{
    public CategoriaDAOImpl() {
        super(Categoria.class);
    }
}
