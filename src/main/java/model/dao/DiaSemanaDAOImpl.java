package model.dao;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;
import model.entity.DiaSemana;

public class DiaSemanaDAOImpl extends GenericDAOImpl<DiaSemana, Serializable>{
    public DiaSemanaDAOImpl() {
        super(DiaSemana.class);
    }
    
    public List<DiaSemana> findByNome(DayOfWeek dia) {
        return entityManager
                .createQuery("FROM DiaSemana ds WHERE ds.nome = :nome", DiaSemana.class)
                .setParameter("nome", dia.name())
                .getResultList();
    }
}
