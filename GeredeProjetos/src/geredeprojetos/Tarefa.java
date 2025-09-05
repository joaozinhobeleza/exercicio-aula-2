package geredeprojetos;

public class Tarefa {
    
    private String descricao;
    private int horasEstimadas;
    private Desenvolvedor responsavel;

    public Tarefa(String descricao, int horasEstimadas) {
        this.descricao = descricao;
        this.horasEstimadas = horasEstimadas;
    }

    public void atribuirResponsavel(Desenvolvedor dev) {
        this.responsavel = dev;
        dev.adicionarTarefa(this);
    }

    // Getters
    public String getDescricao() {
        return descricao;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }
    
}
