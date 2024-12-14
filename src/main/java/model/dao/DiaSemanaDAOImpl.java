package model.dao;

import java.io.Serializable;
import model.entity.DiaSemana;

public class DiaSemanaDAOImpl extends GenericDAOImpl<DiaSemana, Serializable>{
    public DiaSemanaDAOImpl() {
        super(DiaSemana.class);
    }
}
