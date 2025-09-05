package estoque;

public class Pedido {
    
    private Produto produto;
    private int quantidade;
    private Fornecedor fornecedor;

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.fornecedor = produto.getFornecedor();
        produto.adicionarEstoque(quantidade);
    }

    
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public String toString() {
        return "Pedido de " + quantidade + " unidades de " + produto.getNome() + " ao fornecedor " + fornecedor.getNome();
    }
}
