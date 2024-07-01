/**
 * Classe que representa um caixa de supermercado.
 */
public class Caixa {
    private int id;
    private Fila<Cliente> fila;
    private Cliente clienteAtual;
    private int tempoRestante;

    /**
     * Construtor da classe Caixa.
     *
     * @param id          O identificador do caixa.
     * @param tamanhoFila O tamanho máximo da fila do caixa.
     */
    public Caixa(int id, int tamanhoFila) {
        this.id = id;
        this.fila = new Fila<>(tamanhoFila);
    }

    /**
     * Adiciona um cliente à fila do caixa.
     *
     * @param cliente O cliente a ser adicionado à fila.
     */
    public void adicionarCliente(Cliente cliente) {
        fila.enqueue(cliente);
    }

    /**
     * Atende o próximo cliente na fila, se o caixa estiver disponível.
     */
    public void atenderCliente() {
        if (clienteAtual == null && !fila.isEmpty()) {
            clienteAtual = fila.dequeue();
            tempoRestante = clienteAtual.getTempoEspera();
        }
    }

    /**
     * Decrementa o tempo restante para atender o cliente atual.
     * Libera o caixa se o tempo de atendimento do cliente for concluído.
     */
    public void decrementarTempo() {
        if (clienteAtual != null) {
            tempoRestante--;
            if (tempoRestante == 0) {
                liberarCaixa();
            }
        }
    }

    /**
     * Libera o caixa, indicando que ele está disponível para o próximo cliente.
     */
    public void liberarCaixa() {
        clienteAtual = null;
    }

    /**
     * Retorna a fila de clientes do caixa.
     *
     * @return A fila de clientes.
     */
    public Fila<Cliente> getFila() {
        return fila;
    }

    /**
     * Retorna o cliente atualmente sendo atendido pelo caixa.
     *
     * @return O cliente atual, ou null se o caixa estiver disponível.
     */
    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    /**
     * Retorna o tempo restante para concluir o atendimento do cliente atual.
     *
     * @return O tempo restante de atendimento.
     */
    public int getTempoRestante() {
        return tempoRestante;
    }

    /**
     * Retorna o identificador do caixa.
     *
     * @return O identificador do caixa.
     */
    public int getId() {
        return id;
    }
}
