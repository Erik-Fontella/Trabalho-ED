public class Fila<T> {
    private int tamanho;
    private T[] elementos;
    private int inicio;
    private int fim;
    private int total;

    @SuppressWarnings("unchecked")
    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = (T[]) new Object[tamanho];
        this.inicio = 0;
        this.fim = 0;
        this.total = 0;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public boolean isFull() {
        return total == tamanho;
    }

    public void enqueue(T elemento) {
        if (isFull()) {
            System.out.println("Fila cheia!");
        } else {
            elementos[fim] = elemento;
            fim = (fim + 1) % tamanho;
            total++;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        } else {
            T elemento = elementos[inicio];
            inicio = (inicio + 1) % tamanho;
            total--;
            return elemento;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        } else {
            return elementos[inicio];
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            for (int i = 0; i < total; i++) {
                System.out.println(elementos[(inicio + i) % tamanho]);
            }
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public T[] getElementos() {
        return elementos;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    public int getTotal() {
        return total;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
