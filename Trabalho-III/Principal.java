/*
 * Trabalho III - Simulação de um supermercado
 * Alunos: Erik Fontella, Pedro Araujo
 */
public class Principal {

    public static void main(String[] args) {
        Simulador simulador = new Simulador(3, 10); // Exemplo com 3 caixas e filas de tamanho 10
        simulador.iniciarSimulacao();
    }
}