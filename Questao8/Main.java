package Questao8;
// Ordene crescentes os elementos do vetor [3, 7, 1, 4, 9, 2], utilizando os
// seguintes algoritmos de ordenação: Bubble, selection e insertion sort. Mostrar o
// estado do vetor toda a vez que ocorrer uma troca de elementos. 
public class Main {
    public static void main(String[] args) {
        Tad_vetor vetor = new Tad_vetor();
        Tad_vetor vetor2 = new Tad_vetor();
        Tad_vetor vetor3 = new Tad_vetor();
        
        vetor.adiciona(3);
        vetor.adiciona(7);
        vetor.adiciona(1);
        vetor.adiciona(4);
        vetor.adiciona(9);
        vetor.adiciona(2);

        vetor2.adiciona(3);
        vetor2.adiciona(7);
        vetor2.adiciona(1);
        vetor2.adiciona(4);
        vetor2.adiciona(9);
        vetor2.adiciona(2);

        vetor3.adiciona(3);
        vetor3.adiciona(7);
        vetor3.adiciona(1);
        vetor3.adiciona(4);
        vetor3.adiciona(9);
        vetor3.adiciona(2);

        System.out.println("Bubble Sort");
        vetor.bubbleSort();
        System.out.println("-----------------");
        System.out.println("Selection Sort");
        vetor2.selectionSort();
        System.out.println("-----------------");
        System.out.println("Insertion Sort");
        vetor3.insertionSort();
    }
}
