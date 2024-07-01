public class LDE implements Lista {
    private Noh inicio;
    private Noh fim;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int valor) {
        Noh novo = new Noh(valor);
        if (this.estahVazia()) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            novo.setProximo(this.inicio);
            this.inicio.setAnterior(novo);
            this.inicio = novo;
        }
    }

    public void insereFim(int valor) {
        Noh novo = new Noh(valor);
        if (this.estahVazia()) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            novo.setAnterior(this.fim);
            this.fim.setProximo(novo);
            this.fim = novo;
        }
    }

    public boolean estahVazia() {
        return this.inicio == null;
    }

    public void imprimeLista() {
        Noh aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getProximo();
        }
    }

    public boolean remove() {
        if (this.estahVazia()) {
            return false;
        } else {
            this.inicio = this.inicio.getProximo();
            this.inicio.setAnterior(null);
            return true;
        }
    }

    public int tamanho() {
        int cont = 0;
        Noh aux = this.inicio;
        while (aux != null) {
            cont++;
            aux = aux.getProximo();
        }
        return cont;
    }

    public int nroPares() {
        int cont = 0;
        Noh aux = this.inicio;
        while (aux != null) {
            if (aux.getValor() % 2 == 0) {
                cont++;
            }
            aux = aux.getProximo();
        }
        return cont;
    }

}
