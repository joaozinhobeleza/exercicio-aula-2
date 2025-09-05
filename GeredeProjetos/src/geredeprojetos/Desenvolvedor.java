package geredeprojetos;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {
    
    private String nome;
    private List<Tarefa> tarefasAtribuidas;

    public Desenvolvedor(String nome) {
        this.nome = nome;
        this.tarefasAtribuidas = new ArrayList<>();
    }
    
    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefasAtribuidas.add(tarefa);
    }

    
    public String getNome() {
        return nome;
    }

    public List<Tarefa> getTarefasAtribuidas() {
        return tarefasAtribuidas;
    }
    
}
