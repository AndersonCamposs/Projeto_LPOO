package model.dao;

import java.io.Serializable;
import model.entity.ProdutoVenda;

public class ProdutoVendaDAOImpl extends GenericDAOImpl<ProdutoVenda, Serializable>{
    public ProdutoVendaDAOImpl() {
        super(ProdutoVenda.class);
    }
}
