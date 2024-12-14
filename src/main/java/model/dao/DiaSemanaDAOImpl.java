package model.dao;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;
import model.entity.DiaSemana;

public class DiaSemanaDAOImpl extends GenericDAOImpl<DiaSemana, Serializable>{
    public DiaSemanaDAOImpl() {
        super(DiaSemana.class);
    }
    
    public List<DiaSemana> getByNome(DayOfWeek nome) {
        return entityManager
                .createQuery("FROM DiaSemana ds WHERE nome = :nome", DiaSemana.class)
                .setParameter("nome", nome)
                .getResultList();
    }
}
