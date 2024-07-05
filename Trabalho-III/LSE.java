public class LSE<T> {// TAD Lista simplesmente encadeada
    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public void insereFim(Object info) { // info = 7
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProx())
                ultimo = i;
            ultimo.setProx(novo);
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(Object info) { // info = 10
        Noh ant = null, p;
        p = inicio;
        while (p != null && p.getInfo() != info) { // busca
            ant = p;
            p = p.getProx();
        }
        if (p == null) // não achou, então não faz nada e retorna false
            return false;
        if (ant == null) // retira info do início
            inicio = p.getProx();
        else
            ant.setProx(p.getProx());
        return true;
    }

    public int tamanho() {
        int cont = 0;
        for (Noh i = inicio; i != null; i = i.getProx())
            cont++;
        return cont;
    }

    public Noh imprimeNoh(int pos) {
        Noh p = inicio;
        for (int i = 0; i < pos; i++)
            p = p.getProx();
        return p;
    }

    @SuppressWarnings("unchecked")
    public T[] getElementos(Class<T> clazz) {
        T[] elementos = (T[]) java.lang.reflect.Array.newInstance(clazz, tamanho());
        int i = 0;
        for (Noh p = inicio; p != null; p = p.getProx())
            elementos[i++] = (T) p.getInfo();
        return elementos;
    }
}