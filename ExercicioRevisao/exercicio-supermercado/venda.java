import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens = new ArrayList<>();

    public Venda(Cliente c) {
        this.cliente = c;
    }

    public void adicionarItem(Produto p, int qtd) {
        itens.add(new ItemVenda(p, qtd));
    }

    public void imprimir() {
        System.out.println("Cliente: " + cliente.getNome());
        for (ItemVenda i : itens) {
            System.out.println(i.getProduto().getNome());
        }
    }
}
