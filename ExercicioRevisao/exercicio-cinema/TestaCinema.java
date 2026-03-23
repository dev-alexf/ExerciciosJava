import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {

        Filme f = new Filme("Batman");

        Sessao s = new Sessao(LocalDateTime.now());

        s.vincularFilme(f);

        s.vender("A1");
        s.vender("A2");
        s.vender("A3");

        s.imprimir();
    }
}
