package Questao12;

public class Tad_Lde<T> {
    private Noh<T> inicio;
    private Noh<T> fim;

    public Tad_Lde() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean addOrdenado(T valor) {
        Noh<T> novo = new Noh<>(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            Noh<T> atual = inicio;
            while (atual != null && ((Comparable<T>) atual.getInfo()).compareTo(valor) < 0) {
                atual = atual.getProx();
            }
            if (atual == inicio) {
                novo.setProx(inicio);
                inicio.setAnterior(novo);
                inicio = novo;
            } else if (atual == null) {
                fim.setProx(novo);
                novo.setAnterior(fim);
                fim = novo;
            } else {
                novo.setProx(atual);
                novo.setAnterior(atual.getAnterior());
                atual.getAnterior().setProx(novo);
                atual.setAnterior(novo);
            }
        }
        return true;
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(T info) {
        Noh<T> p = inicio;
        while (p != null && !p.getInfo().equals(info))
            p = p.getProx();
        if (p == null)
            return false;
        if (p == inicio) {
            inicio = p.getProx();
            if (inicio != null)
                inicio.setAnterior(null);
            else
                fim = null;
        } else if (p.getProx() == null) {
            p.getAnterior().setProx(null);
            fim = p.getAnterior();
        } else {
            p.getAnterior().setProx(p.getProx());
            p.getProx().setAnterior(p.getAnterior());
        }
        return true;
    }

    public int tamanho() {
        int cont = 0;
        for (Noh<T> i = inicio; i != null; i = i.getProx())
            cont++;
        return cont;
    }

    public void imprimeLista() {
        Noh<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }
}
