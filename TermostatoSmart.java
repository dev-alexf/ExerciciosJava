public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {

    private boolean ligado;
    private double  temperaturaAtual;

    public TermostatoSmart(double temperaturaInicial) {
        this.ligado          = false;
        this.temperaturaAtual = temperaturaInicial;
    }

    // Contrato: DispositivoLigavel
    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Termostato LIGADO.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Termostato DESLIGADO.");
    }

    // Contrato: SensorTemperatura
    @Override
    public double lerTemperatura() {
        if (!ligado) {
            System.out.println("Termostato desligado. Temperatura indisponivel.");
            return -1;
        }
        temperaturaAtual += (Math.random() * 1.0) - 0.5;
        System.out.printf("Temperatura atual: %.1f°C%n", temperaturaAtual);
        return temperaturaAtual;
    }

    public boolean isLigado() {
        return ligado;
    }
}
