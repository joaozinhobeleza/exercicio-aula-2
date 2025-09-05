package gerecarro;

public class Carro {
    
    private String modelo;
    private Marca marca;
    private int ano;
    private double preco;

    public Carro(String modelo, Marca marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public Marca getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return marca.getNome() + " " + modelo + " (" + ano + ") - R$" + preco;
    }
    
}
