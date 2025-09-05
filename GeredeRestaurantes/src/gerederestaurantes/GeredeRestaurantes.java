package gerederestaurantes;

public class GeredeRestaurantes {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Prato prato1 = new Prato("Macarrão Carbonara", 45.50);
        Prato prato2 = new Prato("Refrigerante", 8.00);

        
        Mesa mesa5 = new Mesa(5);

        
        System.out.println("Criando pedido para a mesa " + mesa5.getNumero());
        Pedido pedido1 = new Pedido(mesa5);
        
        
        pedido1.adicionarPrato(prato1);
        pedido1.adicionarPrato(prato2);
        
        System.out.println("Mesa " + mesa5.getNumero() + " está " + (mesa5.isOcupada() ? "ocupada." : "livre."));

        
        System.out.printf("Total da conta da mesa %d: R$ %.2f\n", mesa5.getNumero(), pedido1.calcularTotalConta());
        
        
        pedido1.finalizarPedido();
        System.out.println("Pedido da mesa " + mesa5.getNumero() + " finalizado.");
        System.out.println("Mesa " + mesa5.getNumero() + " está " + (mesa5.isOcupada() ? "ocupada." : "livre."));
        
    }
    
}
