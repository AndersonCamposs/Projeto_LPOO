package model.dao;

import jakarta.persistence.TypedQuery;
import java.util.List;
import model.entity.Usuario;
import model.filter.UsuarioFilter;
import org.mindrot.jbcrypt.BCrypt;
import utils.EncryptedPasswordUtils;

public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Long> {
    public UsuarioDAOImpl() {
        super(Usuario.class);
    }
    
    public Usuario verificarLogin(String login, String senha) {
        String jpql = "FROM Usuario u WHERE u.login = :login";
        List<Usuario> listaUsuarios = entityManager.createQuery(jpql, Usuario.class)
                .setParameter("login", login)
                .getResultList();
        
        if(!listaUsuarios.isEmpty()) {
            Usuario usuario = listaUsuarios.get(0);
            
            if (BCrypt.checkpw(senha, usuario.getSenha())) {
                return usuario;
            }
        }
        
        return null;
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
