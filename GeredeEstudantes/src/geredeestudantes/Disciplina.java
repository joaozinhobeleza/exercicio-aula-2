package geredeestudantes;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    
    private String nome;
    private Professor professor;
    private List<Estudante> estudantesMatriculados;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.estudantesMatriculados = new ArrayList<>();
    }

    public void matricularEstudante(Estudante estudante) {
        this.estudantesMatriculados.add(estudante);
    }
    
    
    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Estudante> getEstudantesMatriculados() {
        return estudantesMatriculados;
    }
    
}
