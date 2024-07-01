public class Pilha {
    private int topo;
    private int[] elementos;
    private int tamanho;

    public Pilha(int tamanho) {
        this.topo = -1;
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == tamanho - 1;
    }

    public void push(int elemento) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
        } else {
            topo++;
            elementos[topo] = elemento;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            int elemento = elementos[topo];
            topo--;
            return elemento;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            return elementos[topo];
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.println(elementos[i]);
            }
        }
    }
    
}
