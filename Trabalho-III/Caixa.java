/**
 * Representa um caixa de supermercado.
 */
public class Caixa {
    private int id;
    private Fila<Cliente> fila;
    private Cliente clienteAtual;
    private int tempoRestante;

    /**
     * Construtor da classe Caixa.
     *
     * @param id         o identificador do caixa
     * @param tamanhoFila o tamanho máximo da fila de clientes
     */
    public Caixa(int id, int tamanhoFila) {
        this.id = id;
        this.fila = new Fila<>(tamanhoFila);
        this.clienteAtual = null;
        this.tempoRestante = 0;
    }

    /**
     * Obtém o identificador do caixa.
     *
     * @return o identificador do caixa
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém a fila de clientes deste caixa.
     *
     * @return a fila de clientes
     */
    public Fila<Cliente> getFila() {
        return fila;
    }

    /**
     * Obtém o cliente que está sendo atendido atualmente.
     *
     * @return o cliente atual, ou null se não houver nenhum
     */
    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    /**
     * Obtém o tempo restante para terminar de atender o cliente atual.
     *
     * @return o tempo restante em minutos
     */
    public int getTempoRestante() {
        return tempoRestante;
    }

    /**
     * Adiciona um cliente à fila deste caixa.
     *
     * @param cliente o cliente a ser adicionado
     */
    public void adicionarCliente(Cliente cliente) {
        fila.enqueue(cliente);
    }

    /**
     * Atende o próximo cliente da fila, se não houver um cliente sendo atendido atualmente.
     * Atualiza o tempo de atendimento para o tempo necessário do próximo cliente.
     */
    public void atenderCliente() {
        if (clienteAtual == null && fila.getTotal() > 0) {
            clienteAtual = fila.dequeue();
            tempoRestante = clienteAtual.getTempoEspera();
        }
    }

    /**
     * Decrementa o tempo restante de atendimento do cliente atual.
     * Se o tempo restante chegar a zero, o cliente atual é removido.
     */
    public void decrementarTempo() {
        if (tempoRestante > 0) {
            tempoRestante--;
            if (tempoRestante == 0) {
                clienteAtual = null;
            }
        }
    }
}
