public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {

    private final String senhaCorreta;
    private boolean destravada;
    private boolean ligada;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
        this.destravada   = false;
        this.ligada       = false;
    }

    // Contrato: Autenticavel
    @Override
    public void validarAcesso(String senha) {
        if (!ligada) {
            System.out.println("Fechadura desligada. Ligue primeiro.");
            return;
        }
        if (senhaCorreta.equals(senha)) {
            destravada = true;
            System.out.println("Acesso concedido! Fechadura destravada.");
        } else {
            destravada = false;
            System.out.println("Senha incorreta! Acesso negado.");
        }
    }

    // Contrato: DispositivoLigavel
    @Override
    public void ligar() {
        ligada = true;
        System.out.println("Fechadura eletronica LIGADA.");
    }

    @Override
    public void desligar() {
        ligada     = false;
        destravada = false;
        System.out.println("Fechadura eletronica DESLIGADA e travada.");
    }

    public boolean isDestravada() {
        return destravada;
    }
}
