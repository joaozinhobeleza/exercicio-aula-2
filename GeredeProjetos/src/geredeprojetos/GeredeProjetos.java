package geredeprojetos;

public class GeredeProjetos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Desenvolvedor dev1 = new Desenvolvedor("Ana");
        Desenvolvedor dev2 = new Desenvolvedor("João");

        
        Projeto projetoAPI = new Projeto("API de Pagamentos");

        
        Tarefa tarefa1 = new Tarefa("Desenvolver endpoint de autenticação", 16);
        Tarefa tarefa2 = new Tarefa("Criar modelo do banco de dados", 12);
        
        tarefa1.atribuirResponsavel(dev1);
        tarefa2.atribuirResponsavel(dev2);

        projetoAPI.adicionarTarefa(tarefa1);
        projetoAPI.adicionarTarefa(tarefa2);
        
        System.out.println("Projeto: " + projetoAPI.getNome());

        
        System.out.println("Carga de trabalho total do projeto: " + projetoAPI.calcularCargaTrabalho() + " horas.");

        
        System.out.println("\nTarefas de " + dev1.getNome() + ":");
        for (Tarefa t : dev1.getTarefasAtribuidas()) {
            System.out.println("- " + t.getDescricao());
        }
        
    }
    
}
