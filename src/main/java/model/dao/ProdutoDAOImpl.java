package model.dao;

import jakarta.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;
import model.entity.Produto;
import model.filter.ProdutoFilter;

public class ProdutoDAOImpl extends GenericDAOImpl<Produto, Serializable>{
    public ProdutoDAOImpl() {
        super(Produto.class);
    }
    
    public List<Produto> findWithFilter(ProdutoFilter produtoFilter) { 
        StringBuilder jpql = new StringBuilder(" FROM Produto p WHERE 1=1 ");
        if(produtoFilter.getNome() != null && !produtoFilter.getNome().isEmpty()) {
            jpql.append(" AND p.nome LIKE :nome ");
        }
        
        if (produtoFilter.getValor() != null) {
            jpql.append(" AND p.valor = :valor ");
        }
        
        TypedQuery<Produto> query = entityManager.createQuery(jpql.toString(), Produto.class);
        
        if(produtoFilter.getNome() != null && !produtoFilter.getNome().isEmpty()) {
            query.setParameter("nome", "%" + produtoFilter.getNome() + "%");
        }
        
        if (produtoFilter.getValor() != null) {
            query.setParameter("valor", produtoFilter.getValor());
        }
        
        return query.getResultList();
    }
}
