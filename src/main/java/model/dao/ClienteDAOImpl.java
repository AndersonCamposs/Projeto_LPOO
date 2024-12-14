package model.dao;
        
import java.util.List;
import java.util.Optional;
import model.entity.Cliente;

        
public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Long>{
    public ClienteDAOImpl() {
        super(Cliente.class);
    }
    
    public List<Cliente> getByCpf(String cpf) {
         return entityManager
                 .createQuery("FROM Cliente c WHERE cpf = :cpf", Cliente.class)
                 .setParameter("cpf", cpf)
                 .getResultList();
    }
}
