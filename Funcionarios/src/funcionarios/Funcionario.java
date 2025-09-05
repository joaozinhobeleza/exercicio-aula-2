package funcionarios;

import java.util.ArrayList;

public class Funcionario {
    
    private String nome;
    private double salario;
    private ArrayList<String> projetos;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.projetos = new ArrayList<>();
    }

    public void adicionarProjeto(String projeto) {
        projetos.add(projeto);
    }

    public void mostrarProjetos() {
        System.out.println("Projetos de " + nome + ":");
        for (String p : projetos) {
            System.out.println("- " + p);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
}
