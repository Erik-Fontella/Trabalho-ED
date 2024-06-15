package Questao2;

import java.util.Arrays;

public class Tad_vetor {
    private Object[] vetor;
    private int tamanho;
    private int capacidade;

    public Tad_vetor() {
        this.capacidade = 10;
        this.vetor = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object info) {
        if (tamanho == capacidade) {
            capacidade *= 2;
            Object[] novoVetor = new Object[capacidade];
            for (int i = 0; i < tamanho; i++) {
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;
        }
        vetor[tamanho] = info;
        tamanho++;
    }

    public Object contem(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null;
        }
        return vetor[posicao];
    }
    
    public void selectionSortDescending( ) {
        for (int i = tamanho - 1; i > 0; i--) {
            int maior = i;
            for (int j = i - 1; j >= 0; j--) {
                if ((Integer) vetor[j] > (Integer) vetor[maior]) {
                    maior = j;
                }
            }
            if (maior != i) {
                Object aux = vetor[i];
                vetor[i] = vetor[maior];
                vetor[maior] = aux;
    
                System.out.println(Arrays.toString(vetor));
            }
        }
    }

}