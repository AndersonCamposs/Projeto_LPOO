package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    
    private LocalDate dataReserva;
    
    private float valor;
    
    @ManyToOne
    Cliente cliente;
    
    @ManyToOne
    Quadra quadra;
    
    @ManyToOne
    Horario horario;
   
    @ManyToOne
    DiaSemana diaSemana;
}
