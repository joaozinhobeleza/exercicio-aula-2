package funcionarios;

public class Funcionarios {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Departamento desenvolvimento = new Departamento("Desenvolvimento");
        Departamento marketing = new Departamento("Marketing");

        Funcionario joao = new Funcionario("João", 4000);
        Funcionario maria = new Funcionario("Maria", 5000);
        Funcionario ana = new Funcionario("Ana", 3500);

        desenvolvimento.adicionarFuncionario(joao);
        desenvolvimento.adicionarFuncionario(maria);
        marketing.adicionarFuncionario(ana);

        joao.adicionarProjeto("Sistema ERP");
        maria.adicionarProjeto("Sistema ERP");
        maria.adicionarProjeto("Site da Empresa");
        ana.adicionarProjeto("Campanha de Marketing");

        joao.mostrarProjetos();
        System.out.println();
        maria.mostrarProjetos();
        System.out.println();
        ana.mostrarProjetos();

        System.out.println("\nMédia salarial do departamento Desenvolvimento: " + desenvolvimento.mediaSalarial());
        System.out.println("Média salarial do departamento Marketing: " + marketing.mediaSalarial());
    }
}
    

