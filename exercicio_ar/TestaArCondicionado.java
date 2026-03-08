package exercicio_ar;

public class TestaArCondicionado {
    public static void main(String[] args) {
        // 1. Testando construtor vazio e setters com erros
        exercicio_ar.ArCondicionado ar1 = new ArCondicionado();
        System.out.println("--- Teste de Validação ---");
        ar1.setMarca("LG"); // Erro: menos de 3 caracteres
        ar1.setTemperatura(10); // Erro: fora da faixa

        // 2. Configurando corretamente
        ar1.setMarca("Samsung");
        ar1.setTemperatura(22);
        ar1.setLigado(true);
        System.out.println(ar1);

        System.out.println("\n--- Teste Modo Turbo ---");
        // 3. Ativando modo turbo (vai rodar a checagem aleatória)
        ar1.ativarModoTurbo();
        System.out.println("Estado Final: " + ar1);
    }
}