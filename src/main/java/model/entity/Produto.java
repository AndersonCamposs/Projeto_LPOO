package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Collection;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Produto")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    
    private String nome;
    
    private float valor;
    
    private int qtd_estoque;
    
    @ManyToOne
    private Categoria categoria;
    
    @OneToMany(mappedBy = "produto")
    Collection<ProdutoVenda> produtoVendas;
    
    @Override
    public String toString() {
        return this.nome;
    }
}
