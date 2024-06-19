public class LSE implements Lista {
    private Noh inicio;

    public LSE() {
        inicio = null;
    }

    public void adicionarInicio(int valor) {
        Noh novo = new Noh(valor);
        novo.proximo = inicio;
        inicio = novo;
    }

    public void insereFinal(int valor) {
        Noh novo = new Noh(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            Noh aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    public void inserePosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > tamanho()) {
            System.out.println("Posição inválida");
        } else {
            if (posicao == 0) {
                adicionarInicio(valor);
            } else {
                Noh novo = new Noh(valor);
                Noh aux = inicio;
                for (int i = 0; i < posicao - 1; i++) {
                    aux = aux.proximo;
                }
                novo.proximo = aux.proximo;
                aux.proximo = novo;
            }
        }
    }

    public boolean remove(int valor) {
        if (inicio == null) {
            return false;
        } else {
            if (inicio.valor == valor) {
                inicio = inicio.proximo;
                return true;
            } else {
                Noh aux = inicio;
                while (aux.proximo != null && aux.proximo.valor != valor) {
                    aux = aux.proximo;
                }
                if (aux.proximo == null) {
                    return false;
                } else {
                    aux.proximo = aux.proximo.proximo;
                    return true;
                }
            }
        }
    }

    public int tamanho() {
        int cont = 0;
        Noh aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.proximo;
        }
        return cont;
    }

    public void imprime() {
        imprime_rec(inicio);
    }

    public Noh getInicio() {
        return inicio;
    }

    public void imprime_rec(Noh noh) {
        if (noh != null) {
            System.out.print(noh.valor + " ");
            imprime_rec(noh.proximo);
        }
    }
}
