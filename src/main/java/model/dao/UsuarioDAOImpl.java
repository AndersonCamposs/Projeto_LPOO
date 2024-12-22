package model.dao;

import model.entity.Usuario;

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
}
