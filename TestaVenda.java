public class TestaVenda {
    public static void main(String[] args) {

        Cliente c = new Cliente("Juliana");

        Produto p1 = new Produto("Arroz");
        Produto p2 = new Produto("Feijão");

        Venda v = new Venda(c);

        v.adicionarItem(p1, 2);
        v.adicionarItem(p2, 1);

        v.imprimir();
    }
}