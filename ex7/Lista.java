public interface Lista {
    public void adicionarInicio(int valor);

    public void adicionarFim(int valor);

    public void adicionarPosicao(int valor, int posicao);

    public void removerInicio();

    public void removerFim();

    public boolean removerPosicao(int posicao);

    public void exibir();

    public int tamanho();

    public void ordenarBolha();

}