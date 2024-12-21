package model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.util.Collection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome", nullable = false)
    @NotBlank(message = "Informe o nome do usuário.")
    private String nome;
    
    @Column(name = "cpf", nullable = false)
    @Pattern(regexp = "[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}", 
    message =  "Informe um CPF válido.")
    private String cpf;
    
    @Column(name = "telefone", nullable = true)
    private String telefone;
    
    
    @OneToMany(mappedBy = "cliente")
    Collection<Reserva> reservas;
}
