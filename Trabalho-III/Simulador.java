import java.util.Scanner;

/**
 * Classe responsável por simular o funcionamento de um supermercado.
 */
public class Simulador {
    private Supermercado supermercado;

    /**
     * Construtor da classe Simulador.
     *
     * @param numeroDeCaixas o número de caixas no supermercado
     * @param tamanhoFila    o tamanho máximo da fila de cada caixa
     */
    public Simulador(int numeroDeCaixas, int tamanhoFila) {
        this.supermercado = new Supermercado(numeroDeCaixas, tamanhoFila);
    }

    /**
     * Inicia a simulação do supermercado.
     * A simulação continua até que seja interrompida manualmente.
     * A cada etapa, um cliente pode chegar, os clientes são atendidos e o estado atual é exibido.
     */
    public void iniciarSimulacao() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            supermercado.simularChegadaCliente();
            supermercado.atenderClientes();
            supermercado.exibirStatus();
            System.out.println("Aperte Enter para avançar uma etapa");
            scanner.nextLine();
        }
    }
}
