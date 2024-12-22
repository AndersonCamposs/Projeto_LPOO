package model.dao;

import jakarta.persistence.ParameterMode;
import java.io.Serializable;
import model.entity.ProdutoVenda;

public class ProdutoVendaDAOImpl extends GenericDAOImpl<ProdutoVenda, Serializable>{
    public ProdutoVendaDAOImpl() {
        super(ProdutoVenda.class);
    }
    
    public void saveProdutoVendaAndDecrementStock(ProdutoVenda produtoVenda) {
        save(produtoVenda);
        callStoredProcedure(produtoVenda);
    }
    
    private void callStoredProcedure(ProdutoVenda produtoVenda) {
        try {
            beginTransaction();
            entityManager
            .createStoredProcedureQuery("AtualizarEstoque")
            .registerStoredProcedureParameter("p_id_produto", Long.class, ParameterMode.IN)
            .registerStoredProcedureParameter("p_qtd_produto", Integer.class, ParameterMode.IN)
            .setParameter("p_id_produto", produtoVenda.getProduto().getId())
            .setParameter("p_qtd_produto", produtoVenda.getQtdProduto())
            .execute();
            commitTransaction();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }
    
    private void beginTransaction() {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
    }

    private void commitTransaction() {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().commit();
        }
    }
}
