package model.dao;

import model.entity.Usuario;

public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Long> {
    public UsuarioDAOImpl() {
        super(Usuario.class);
    }
}
