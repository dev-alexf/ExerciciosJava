import java.util.ArrayList;

public class Projeto {
    private String nome;
    private ArrayList<Programador> lista = new ArrayList<>();

    public Projeto(String nome) {
        this.nome = nome;
    }

    public void adicionar(Programador p) {
        lista.add(p);
    }

    public void listar() {
        for (Programador p : lista) {
            System.out.println(p.getNome());
        }
    }
}