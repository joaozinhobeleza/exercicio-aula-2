package gerecarro;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    
    private String nome;
    private List<Carro> carrosVendidos;

    public Vendedor(String nome) {
        this.nome = nome;
        this.carrosVendidos = new ArrayList<>();
    }
    
    public void venderCarro(Carro carro){
        this.carrosVendidos.add(carro);
    }

    public String getNome() {
        return nome;
    }

    public List<Carro> getCarrosVendidos() {
        return carrosVendidos;
    }    
    
}
