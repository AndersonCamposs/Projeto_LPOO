package model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    
    @Column(name = "nome", nullable = false)
    @NotBlank(message = "O nome do produto é obrigatório.")
    private String nome;
    
    @Column(name = "valor", nullable = false)
    @NotNull(message = "O valor do produto é obrigatório.")
    private float valor;
    
    @Column(name = "qtd_estoque", nullable = false)
    @Min(value = 1, message = "Informe a quantidade de produtos no estoque.")
    private int qtd_estoque;
    
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @NotNull(message = "A categoria do produto é obrigatória.")
    private Categoria categoria;
    
    @OneToMany(mappedBy = "produto")
    Collection<ProdutoVenda> produtoVendas;
    
    @Override
    public String toString() {
        return this.nome;
    }
}
