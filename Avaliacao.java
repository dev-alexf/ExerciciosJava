import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso) {
        this.questoes.add(new Questao(num, texto, peso));
    }

    @Override
    public String toString() {
        return "Avaliacao: " + nome + " | Questões: " + questoes;
    }
}