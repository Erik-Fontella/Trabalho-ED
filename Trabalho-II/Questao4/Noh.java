package Questao4;

public class Noh {
    private Object info;
    private Noh anterior;
    private Noh prox;

    public Noh(Object info) {
        this.info = info;
        this.anterior = null;
        this.prox = null;
    }

    public Object getInfo() {
        return this.info;
    }

    public Noh getProx() {
        return this.prox;
    }

    public void setProx(Noh n) {
        this.prox = n;
    }

    public Noh getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Noh n) {
        this.anterior = n;
    }

    @Override
    public String toString() {
        return this.info.toString();
    }
}
