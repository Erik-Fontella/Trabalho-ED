public class Fila<T> {
    private T[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;
    private int total;

    @SuppressWarnings("unchecked")
    public Fila(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = capacidade;
        inicio = 0;
        fim = 0;
        total = 0;
    }

    public void enqueue(T elemento) {
        if (total < tamanho) {
            elementos[fim] = elemento;
            fim = (fim + 1) % tamanho;
            total++;
        } else {
            throw new RuntimeException("Fila cheia");
        }
    }

    public T dequeue() {
        if (total > 0) {
            T elemento = elementos[inicio];
            inicio = (inicio + 1) % tamanho;
            total--;
            return elemento;
        } else {
            throw new RuntimeException("Fila vazia");
        }
    }

    public boolean isEmpty() {
        return total == 0;
    }

    @SuppressWarnings("unchecked")
    public T[] getElementos(Class<T> clazz) {
        T[] elementosEspecificos = (T[]) java.lang.reflect.Array.newInstance(clazz, total);
        for (int i = 0; i < total; i++) {
            elementosEspecificos[i] = elementos[(inicio + i) % tamanho];
        }
        return elementosEspecificos;
    }

    public int getTotal() {
        return total;
    }

    public int getInicio() {
        return inicio;
    }

    public int getTamanho() {
        return tamanho;
    }
}
