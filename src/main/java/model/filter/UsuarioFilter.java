package model.filter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioFilter {
    private String nome;
    
    public UsuarioFilter() {}
    
    public UsuarioFilter(String nome) {
        this.nome = nome;
    }
}
