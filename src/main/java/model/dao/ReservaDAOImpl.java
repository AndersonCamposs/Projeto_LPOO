package model.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import model.entity.Quadra;
import model.entity.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva, Serializable>{
    public ReservaDAOImpl() {
        super(Reserva.class);
    }
    
    public List<Reserva> getByDate(LocalDate data)  {
        return entityManager
                .createQuery("FROM Reserva r WHERE r.dataReserva = :data", Reserva.class)
                .setParameter("data", data)
                .getResultList();
    }
    
    public List<Reserva> getByDataAndQuadra(LocalDate data, Quadra quadra) {
        return entityManager
                .createQuery("FROM Reserva r WHERE r.dataReserva = :data AND r.quadra.id = :quadra_id", Reserva.class)
                .setParameter("data", data)
                .setParameter("quadra_id", quadra.getId())
                .getResultList();
    }
}
