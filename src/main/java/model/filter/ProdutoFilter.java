package model.filter;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoFilter {
    private String nome;
    private Float valor;
    
    public ProdutoFilter() {}
    
    public ProdutoFilter(String nome) {
        this.nome = nome;
    }
    
    public ProdutoFilter(Float valor) {
        this.valor = valor;
    }
    
    public ProdutoFilter(String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
