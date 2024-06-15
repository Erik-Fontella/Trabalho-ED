package Questao8;

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
    
    public void bubbleSort() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                if ((Integer) vetor[j] > (Integer) vetor[j + 1]) {
                    Object aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
            System.out.println(Arrays.toString(vetor));
        }
    }

    public void selectionSort() {
        for (int i = 0; i < tamanho - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < tamanho; j++) {
                if ((Integer) vetor[j] < (Integer) vetor[menor]) {
                    menor = j;
                }
            }
            Object aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
            System.out.println(Arrays.toString(vetor));
        }
    }

    public void insertionSort() {
        for (int i = 1; i < tamanho; i++) {
            Object aux = vetor[i];
            int j = i - 1;
            while (j >= 0 && (Integer) vetor[j] > (Integer) aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
            System.out.println(Arrays.toString(vetor));
        }
    }
}
