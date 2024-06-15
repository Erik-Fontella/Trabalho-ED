package Questao6;

public class Tad_Lde{
    private Noh inicio;
    private Noh fim;

    public Tad_Lde() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }

    public boolean remove(Object info) {
        Noh p = inicio;
        while (p != null && p.getInfo() != info) 
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
        for (Noh i = inicio; i != null; i = i.getProx())
            cont++;
        return cont;
    }

    public void imprimeLista() {
        Noh atual = inicio; 
        while (atual != null) {
            System.out.println(atual.toString()); 
            atual = atual.getProx(); 
        }
    }

    public void concatena(Tad_Lde l) {
        if (l.estahVazia()) {
            return;
        }
        if (this.estahVazia()) {
            this.inicio = l.inicio;
            this.fim = l.fim;
            return;
        }
        this.fim.setProx(l.inicio);
        l.inicio.setAnterior(this.fim);
        this.fim = l.fim;
    }
}