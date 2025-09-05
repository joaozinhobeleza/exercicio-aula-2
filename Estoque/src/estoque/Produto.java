package estoque;

public class Produto {
    
    private String nome;
    private int quantidade;
    private Fornecedor fornecedor;

    public Produto(String nome, int quantidade, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
        System.out.println(quantidade + " unidades de " + nome + " adicionadas ao estoque.");
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " removidas do estoque.");
        } else {
            System.out.println("Estoque insuficiente para " + nome);
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public String toString() {
        return nome + " - Quantidade: " + quantidade + " | Fornecedor: " + fornecedor.getNome();
    }

    
    
}
