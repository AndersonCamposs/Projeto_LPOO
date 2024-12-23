package model.dao;

import jakarta.persistence.TypedQuery;
import java.util.List;
import model.entity.Usuario;
import model.filter.UsuarioFilter;

public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Long> {
    public UsuarioDAOImpl() {
        super(Usuario.class);
    }
    
    public boolean verificarLogin(String login, String senha) {
        String jpql = "FROM Usuario u WHERE u.login = :login AND u.senha = :senha ";
        return !entityManager.createQuery(jpql, Usuario.class)
                .setParameter("login", login)
                .setParameter("senha", senha)
                .getResultList().isEmpty();
    }
    
    public List<Usuario> findWithFilter(UsuarioFilter clienteFilter) { 
        StringBuilder jpql = new StringBuilder(" FROM Usuario p WHERE 1=1 ");
        if(clienteFilter.getNome() != null && !clienteFilter.getNome().isEmpty()) {
            jpql.append(" AND p.nome LIKE :nome ");
        }
        
        TypedQuery<Usuario> query = entityManager.createQuery(jpql.toString(), Usuario.class);
        
        if(clienteFilter.getNome() != null && !clienteFilter.getNome().isEmpty()) {
            query.setParameter("nome", "%" + clienteFilter.getNome() + "%");
        }
        
        return query.getResultList();
    }
}
