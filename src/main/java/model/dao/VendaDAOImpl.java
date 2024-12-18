package model.dao;

import java.io.Serializable;
import model.entity.Venda;

public class VendaDAOImpl extends GenericDAOImpl<Venda, Serializable>{
    public VendaDAOImpl() {
        super(Venda.class);
    }
}
