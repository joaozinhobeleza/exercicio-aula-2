package funcionarios;

import java.util.ArrayList;

public class Departamento {
    
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public double mediaSalarial() {
        if (funcionarios.isEmpty()) return 0;
        double soma = 0;
        for (Funcionario f : funcionarios) {
            soma += f.getSalario();
        }
        return soma / funcionarios.size();
    }
    
}
