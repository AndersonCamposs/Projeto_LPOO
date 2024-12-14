package model.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import model.entity.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva, Serializable>{
    public ReservaDAOImpl() {
        super(Reserva.class);
    }
    
    public List<Reserva> getByDate(LocalDate data)  {
        return entityManager
                .createQuery("FROM Reserva r WHERE dataReserva = :data", Reserva.class)
                .setParameter("data", data)
                .getResultList();
    }
}
