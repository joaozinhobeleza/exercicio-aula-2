package geredeestudantes;

import java.util.ArrayList;
import java.util.List;


public class GeredeEstudantes {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Professor prof = new Professor("Dr. Alan Turing");
        Estudante aluno1 = new Estudante("Beatriz");
        Estudante aluno2 = new Estudante("Pedro");

        
        Disciplina disciplina = new Disciplina("Algoritmos Avançados", prof);
        
        
        disciplina.matricularEstudante(aluno1);
        disciplina.matricularEstudante(aluno2);
        System.out.println("Estudante " + aluno1.getNome() + " matriculado em " + disciplina.getNome());
        
        
        aluno1.adicionarNota(disciplina, 8.5);
        aluno1.adicionarNota(disciplina, 9.0);
        
       
        System.out.printf("Média de %s em %s: %.2f\n", aluno1.getNome(), disciplina.getNome(), aluno1.calcularMedia(disciplina));
        
        
        List<Disciplina> todasAsDisciplinas = new ArrayList<>();
        todasAsDisciplinas.add(disciplina);
        
        System.out.println("\nDisciplinas lecionadas por " + prof.getNome() + ":");
        for (Disciplina d : todasAsDisciplinas) {
            if (d.getProfessor().equals(prof)) {
                System.out.println("- " + d.getNome());
            }
        }
        
    }
    
}
