import java.util.Scanner;

public class Simulador {
    private Supermercado supermercado;

    public Simulador(int numeroDeCaixas, int tamanhoFila) {
        this.supermercado = new Supermercado(numeroDeCaixas, tamanhoFila);
    }

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
