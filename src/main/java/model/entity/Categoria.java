package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Collection;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Categoria")
@Getter
@Setter
public class Categoria {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    
    private String nome;
    
    @OneToMany(mappedBy = "categoria")
    Collection<Produto> produtos;
    
    @Override
    public String toString() {
        return this.nome;
    }
}
