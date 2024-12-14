package model.dao;

import java.io.Serializable;
import model.entity.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva, Serializable>{
    public ReservaDAOImpl() {
        super(Reserva.class);
    }
    
}
