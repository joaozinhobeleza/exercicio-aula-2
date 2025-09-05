package gerederestaurantes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private Mesa mesa;
    private List<Prato> pratos;
    private boolean finalizado;

    public Pedido(Mesa mesa) {
        this.mesa = mesa;
        this.pratos = new ArrayList<>();
        this.finalizado = false;
        this.mesa.ocupar();
    }

    public void adicionarPrato(Prato prato) {
        this.pratos.add(prato);
    }
    
    public double calcularTotalConta() {
        double total = 0.0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
        return total;
    }
    
    public void finalizarPedido() {
        this.finalizado = true;
        this.mesa.desocupar();
    }

    // Getters
    public Mesa getMesa() {
        return mesa;
    }
    
}
