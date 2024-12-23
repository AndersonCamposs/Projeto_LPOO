package model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ProdutoVenda")
@NamedStoredProcedureQuery(
        name = "AtualizarEstoque",
        procedureName = "AtualizarEstoque",
        parameters = {
            @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "p_id_produto"),
            @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "p_qtd_produto")
        }
)
@Getter
@Setter
public class ProdutoVenda {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "produto_id")
    Produto produto;
    
    @Column(name = "qtdProduto")
    private Integer qtdProduto;
    
    @ManyToOne
    @JoinColumn(name = "venda_id")
    Venda venda;
}
