package gerecarro;

import java.util.ArrayList;
import java.util.List;

public class GereCarro {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Marca marca1 = new Marca("Toyota");
        Marca marca2 = new Marca("Honda");

        List<Carro> estoque = new ArrayList<>();
        estoque.add(new Carro("Corolla", marca1, 2023, 150000.0));
        estoque.add(new Carro("Hilux", marca1, 2024, 250000.0));
        estoque.add(new Carro("Civic", marca2, 2023, 160000.0));

        Vendedor vendedor1 = new Vendedor("Pedro");
        vendedor1.venderCarro(estoque.get(0)); // Vende o Corolla

        System.out.println("--- Gerenciamento de Carros ---");

        // Calcular média de preços por marca
        double somaToyota = 0;
        int countToyota = 0;
        for (Carro c : estoque) {
            if (c.getMarca().getNome().equals("Toyota")) {
                somaToyota += c.getPreco();
                countToyota++;
            }
        }
        System.out.printf("Preço médio da Toyota: R$ %.2f\n", (somaToyota / countToyota));

        // Exibir carros vendidos por um vendedor
        System.out.println("\nCarros vendidos por " + vendedor1.getNome() + ":");
        for (Carro c : vendedor1.getCarrosVendidos()) {
            System.out.println("- " + c);
        }
        
    }
    
}
