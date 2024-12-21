package model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "dataReserva", nullable = false)
    @NotBlank(message = "A data da reserva é obrigatória.")
    private LocalDate dataReserva;
    
    @Column(name = "valor", nullable = false)
    @NotBlank(message = "O valor da reserva é obrigatório.")
    private float valor;
    
    @ManyToOne
    @Column(name = "cliente_id", nullable = false)
    @NotBlank(message = "informe o CPF do cliente.")
    Cliente cliente;
    
    @ManyToOne
    Quadra quadra;
    
    @ManyToOne
    Horario horario;
   
    @ManyToOne
    DiaSemana diaSemana;
}
