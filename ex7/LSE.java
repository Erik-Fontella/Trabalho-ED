public class LSE implements Lista {
    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void adicionarInicio(int valor) {
        Noh novo = new Noh(valor);
        novo.proximo = inicio;
        inicio = novo;
    }

    public void adicionarFim(int valor) {
        Noh novo = new Noh(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            Noh atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public void adicionarPosicao(int valor, int posicao) {
        if (posicao < 0) {
            System.out.println("Posição inválida");
        } else if (posicao == 0) {
            adicionarInicio(valor);
        } else {
            Noh novo = new Noh(valor);
            Noh atual = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                if (atual == null) {
                    System.out.println("Posição inválida");
                    return;
                }
                atual = atual.proximo;
            }
            if (atual == null) {
                System.out.println("Posição inválida");
            } else {
                novo.proximo = atual.proximo;
                atual.proximo = novo;
            }
        }
    }

    public void removerInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            inicio = inicio.proximo;
        }
    }

    public void removerFim() {
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else if (inicio.proximo == null) {
            inicio = null;
        } else {
            Noh atual = inicio;
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = null;
        }
    }

    public boolean removerPosicao(int posicao) {
        if (posicao < 0) {
            System.out.println("Posição inválida");
            return false;
        } else if (posicao == 0) {
            removerInicio();
            return true;
        } else {
            Noh atual = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                if (atual == null) {
                    System.out.println("Posição inválida");
                    return false;
                }
                atual = atual.proximo;
            }
            if (atual == null || atual.proximo == null) {
                System.out.println("Posição inválida");
                return false;
            } else {
                atual.proximo = atual.proximo.proximo;
                return true;
            }
        }
    }

    public void exibir() {
        Noh atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public int tamanho() {
        int tamanho = 0;
        Noh atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public void ordenarBolha() {
        Noh atual = inicio;
        while (atual != null) {
            Noh proximo = atual.proximo;
            while (proximo != null) {
                if (atual.valor > proximo.valor) {
                    int temp = atual.valor;
                    atual.valor = proximo.valor;
                    proximo.valor = temp;
                }
                proximo = proximo.proximo;
            }
            atual = atual.proximo;
        }
    }
}
