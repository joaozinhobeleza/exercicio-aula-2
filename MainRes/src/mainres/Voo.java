package mainres;

public class Voo {
    
    private String numeroVoo;
    private String origem;
    private String destino;
    private int capacidade;
    private int assentosOcupados;

    public Voo(String numeroVoo, String origem, String destino, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.capacidade = capacidade;
        this.assentosOcupados = 0;
    }
    
    public boolean verificarDisponibilidade() {
        return assentosOcupados < capacidade;
    }

    public void ocuparAssento() {
        if (verificarDisponibilidade()) {
            this.assentosOcupados++;
        }
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }
    
}
