package Questao4;
// Implemente um método que insere números inteiros em uma lista
// duplamente encadeada de forma ordenada. Por exemplo, suponha que [2, 5, 7, 10]
// é uma LDE. Se o número 6 for inserido isso ocorrerá entre os elementos 5 e 7. O
// protótipo do método deve ser o seguinte:
// public int add_ordenado();
// Explique no documento de texto a ser entregue qual é a complexidade para o pior
// caso.
public class Main {
    public static void main(String[] args) {
        Tad_Lde lista = new Tad_Lde();
        
        lista.addOrdenado(2);
        lista.addOrdenado(5);
        lista.addOrdenado(7);
        lista.addOrdenado(10);
        lista.imprimeLista();
        System.out.println("----------------------------");
        System.err.println("Inserindo 6");
        System.out.println("----------------------------");
        lista.addOrdenado(6);
        lista.imprimeLista();
        System.out.println("----------------------------");
        System.err.println("Inserindo 3");
        lista.addOrdenado(3);
        System.err.println("----------------------------");
        lista.imprimeLista();
    }
}
