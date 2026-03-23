public class Computador {
    private String marca;
    private Processador processador;

    public Computador(String marca) {
        this.marca = marca;
        this.processador = new Processador("Intel");
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador.getMarca());
    }
}
