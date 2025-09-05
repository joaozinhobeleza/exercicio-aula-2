package geredeestudantes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estudante {
    
    private String nome;
    private Map<Disciplina, List<Double>> notasPorDisciplina;

    public Estudante(String nome) {
        this.nome = nome;
        this.notasPorDisciplina = new HashMap<>();
    }
    
    public void adicionarNota(Disciplina disciplina, double nota) {
        
        this.notasPorDisciplina.putIfAbsent(disciplina, new ArrayList<>());
        
        this.notasPorDisciplina.get(disciplina).add(nota);
    }

    public double calcularMedia(Disciplina disciplina) {
        List<Double> notas = notasPorDisciplina.get(disciplina);
        if (notas == null || notas.isEmpty()) {
            return 0.0;
        }
        
        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    
    public String getNome() {
        return nome;
    }
    
}
