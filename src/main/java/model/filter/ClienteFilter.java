package model.filter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteFilter {
    private String nome;
    
    public ClienteFilter() {}
    
    public ClienteFilter(String nome) {
        this.nome = nome;
    }
}
