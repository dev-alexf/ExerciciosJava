public class TestaProjeto {
    public static void main(String[] args) {

        Projeto p = new Projeto("Sistema X");

        p.adicionar(new Programador("Ana"));
        p.adicionar(new Programador("Lucas"));

        p.listar();
    }
}
