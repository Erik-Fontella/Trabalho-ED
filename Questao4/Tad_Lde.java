package Questao4;

public class Tad_Lde{
    private Noh inicio;
    private Noh fim;

    public Tad_Lde() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean addOrdenado(int valor) {
        Noh novo = new Noh(valor); 
        if (inicio == null) { 
            inicio = fim = novo; 
        } else {
            Noh atual = inicio;
            while (atual != null && (int) atual.getInfo() < valor) { 
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
}