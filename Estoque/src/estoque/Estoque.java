package estoque;

import java.util.ArrayList;

public class Estoque {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Produto> estoque = new ArrayList<>();

        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "contato@fornecedorA.com");

        Produto teclado = new Produto("Teclado", 10, fornecedor1);
        Produto mouse = new Produto("Mouse", 3, fornecedor1);
        Produto monitor = new Produto("Monitor", 2, fornecedor1);

        estoque.add(teclado);
        estoque.add(mouse);
        estoque.add(monitor);

        
        Pedido pedido1 = new Pedido(mouse, 5); 
        Pedido pedido2 = new Pedido(monitor, 10);

        
        System.out.println("Produtos com estoque baixo:");
        for (Produto p : estoque) {
            if (p.getQuantidade() < 5) {
                System.out.println(p.getNome() + " - Quantidade: " + p.getQuantidade());
            }
        }
        
    }
    
}
