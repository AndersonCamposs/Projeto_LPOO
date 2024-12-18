package model.dao;

import java.io.Serializable;
import model.entity.Produto;

public class ProdutoDAOImpl extends GenericDAOImpl<Produto, Serializable>{
    public ProdutoDAOImpl() {
        super(Produto.class);
    }
}
