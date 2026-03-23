public class ItemVenda {
    private Produto produto;
    private int qtd;

    public ItemVenda(Produto p, int qtd) {
        this.produto = p;
        this.qtd = qtd;
    }

    public Produto getProduto() { return produto; }
}