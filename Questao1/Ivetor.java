public interface Ivetor {
    public void insere(int valor);

    public void remove(int valor);

    public boolean contem(int valor);

    public int tamanho();

    public int capacidade();

    public int elemento(int posicao);

    public Vetor getIntersecao(Vetor vetor);

    public int altera(int posicao, int valor);

    public void imprime();
}