package model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "A data da reserva é obrigatória.")
    private LocalDate dataReserva;
    
    @Column(name = "valor", nullable = false)
    @NotNull(message = "O valor da reserva é obrigatório.")
    private float valor;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    @NotNull(message = "Informe o CPF do cliente.")
    Cliente cliente;
    
    @ManyToOne
    Quadra quadra;
    
    @ManyToOne
    Horario horario;
   
    @ManyToOne
    DiaSemana diaSemana;
}
