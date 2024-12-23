package model.dao;
        
import jakarta.persistence.TypedQuery;
import java.util.List;
import model.entity.Cliente;
import model.filter.ClienteFilter;

        
public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Long>{
    public ClienteDAOImpl() {
        super(Cliente.class);
    }
    
    public List<Cliente> findByCpf(String cpf) {
         return entityManager
                 .createQuery("FROM Cliente c WHERE cpf = :cpf", Cliente.class)
                 .setParameter("cpf", cpf)
                 .getResultList();
    }
    
    public List<Cliente> findWithFilter(ClienteFilter clienteFilter) { 
        StringBuilder jpql = new StringBuilder(" FROM Cliente p WHERE 1=1 ");
        if(clienteFilter.getNome() != null && !clienteFilter.getNome().isEmpty()) {
            jpql.append(" AND p.nome LIKE :nome ");
        }
        
        TypedQuery<Cliente> query = entityManager.createQuery(jpql.toString(), Cliente.class);
        
        if(clienteFilter.getNome() != null && !clienteFilter.getNome().isEmpty()) {
            query.setParameter("nome", "%" + clienteFilter.getNome() + "%");
        }
        
        return query.getResultList();
    }
}
