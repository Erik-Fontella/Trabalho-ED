public interface Lista {
    public void adicionarInicio(int valor);

    public void insereFinal(int valor);

    public void inserePosicao(int valor, int posicao);

    public boolean remove(int valor);

    public int tamanho();

    public void imprime_rec(Noh noh);
}