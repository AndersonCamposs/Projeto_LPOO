package model.dao;

import java.io.Serializable;
import model.entity.Horario;


public class HorarioDAOImpl extends GenericDAOImpl<Horario, Serializable>{
    public HorarioDAOImpl() {
        super(Horario.class);
    }
}
