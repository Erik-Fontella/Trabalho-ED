package Questao2;
// Implemente um método de ordenação Selection Sort que trabalha com
// a seleção do maior valor, colocando-o na última posição; do segundo maior valor
// colocando-o na penúltima posição e, assim, sucessivamente. Mostre o estado do
// vetor toda vez que ocorrer uma troca de elementos. Qual é o caso e a classe de
// complexidade aqui?

public class Main {
    public static void main(String[] args) {
        Tad_vetor vetor = new Tad_vetor();
        
        vetor.adiciona(2);
        vetor.adiciona(3);
        vetor.adiciona(10);
        vetor.adiciona(5);
        vetor.adiciona(4);
        vetor.adiciona(7);
        vetor.adiciona(6);
        vetor.adiciona(1);
        vetor.adiciona(8);
        vetor.adiciona(9);

        vetor.selectionSort();
    }

    


}

