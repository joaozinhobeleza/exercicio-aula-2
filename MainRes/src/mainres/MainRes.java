package mainres;

import java.util.ArrayList;
import java.util.List;


public class MainRes {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Voo voo1 = new Voo("G3-1234", "São Paulo", "Rio de Janeiro", 150);
        Passageiro passageiro1 = new Passageiro("Fernanda", "111.222.333-44");
        
        List<Reserva> reservas = new ArrayList<>();

        System.out.println("--- Reservas de Passagens ---");
        if (voo1.verificarDisponibilidade()) {
            Reserva reserva = new Reserva(voo1, passageiro1);
            voo1.ocuparAssento();
            reservas.add(reserva);
            System.out.println("Reserva para " + passageiro1.getNome() + " no voo " + voo1.getNumeroVoo() + " confirmada.");
        } else {
            System.out.println("Voo lotado.");
        }
        
        // Listar reservas de um passageiro
        System.out.println("\nReservas de " + passageiro1.getNome() + ":");
        for (Reserva r : reservas) {
            if (r.getPassageiro().equals(passageiro1)) {
                System.out.println("- Voo: " + r.getVoo().getNumeroVoo());
            }
        }
        
    }
    
}
