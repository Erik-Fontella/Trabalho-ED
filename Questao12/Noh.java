package Questao12;
public class Noh<T> {
    private T info;
    private Noh<T> prox;
    private Noh<T> anterior;

    public Noh(T info) {
        this.info = info;
        this.prox = null;
        this.anterior = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Noh<T> getProx() {
        return prox;
    }

    public void setProx(Noh<T> prox) {
        this.prox = prox;
    }

    public Noh<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Noh<T> anterior) {
        this.anterior = anterior;
    }
}
