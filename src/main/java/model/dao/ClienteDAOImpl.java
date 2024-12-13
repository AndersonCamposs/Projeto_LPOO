package model.dao;
        
import model.entity.Cliente;

        
public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Long>{
    public ClienteDAOImpl() {
        super(Cliente.class);
    }
}
