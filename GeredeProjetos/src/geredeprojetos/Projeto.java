package geredeprojetos;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    
    private String nome;
    private List<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }
    
    public int calcularCargaTrabalho() {
        int cargaTotal = 0;
        for(Tarefa tarefa : tarefas) {
            cargaTotal += tarefa.getHorasEstimadas();
        }
        return cargaTotal;
    }

    
    public String getNome() {
        return nome;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    
}
