package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Collection;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Venda")
@Getter
@Setter
public class Venda {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    
    private LocalDate dataVenda;
    
    private float valor;
    
    @OneToMany(mappedBy = "venda")
    Collection<ProdutoVenda> produtoVendas;
}
