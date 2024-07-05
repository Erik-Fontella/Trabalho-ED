import java.util.Random;

/**
 * Classe que representa um supermercado com múltiplos caixas.
 */
public class Supermercado {
    private LSE<Caixa> caixas;
    private int proximoIdCliente;
    private Random random;

    /**
     * Construtor da classe Supermercado.
     *
     * @param numeroDeCaixas o número de caixas no supermercado
     * @param tamanhoFila    o tamanho máximo da fila de cada caixa
     */
    public Supermercado(int numeroDeCaixas, int tamanhoFila) {
        this.caixas = new LSE<Caixa>();
        for (int i = 0; i < numeroDeCaixas; i++) {
            caixas.insereInicio(new Caixa(i + 1, tamanhoFila));
        }
        this.proximoIdCliente = 1;
        this.random = new Random();
    }

    /**
     * Simula a chegada de um novo cliente ao supermercado.
     * Há uma chance de 10% de um novo cliente chegar a cada chamada deste método.
     */
    public void simularChegadaCliente() {
        int chance = random.nextInt(99);
        if (chance < 10) {
            String nome = "Cliente " + proximoIdCliente;
            int idade = 18 + random.nextInt(60);
            String carrinho = "Produtos";
            int tempoAtendimento = 5 + random.nextInt(11); // entre 5 e 15
            Cliente novoCliente = new Cliente(proximoIdCliente++, nome, idade, carrinho, tempoAtendimento);
            Caixa caixaComMenorFila = escolherCaixaComMenorFila();
            caixaComMenorFila.adicionarCliente(novoCliente);
        }
    }

    /**
     * Escolhe o caixa com a menor fila para atender o próximo cliente.
     * Prioriza caixas que estão vazios.
     *
     * @return o caixa com a menor fila
     */
    public Caixa escolherCaixaComMenorFila() {
        Caixa[] caixasAux = caixas.getElementos(Caixa.class);
        Caixa menorFila = null;
        for (Caixa caixa : caixasAux) {
            if (caixa.getFila().getTotal() == 0 && caixa.getClienteAtual() == null) {
                return caixa; // Retorna imediatamente se encontrar um caixa vazio
            }
            if (menorFila == null || caixa.getFila().getTotal() < menorFila.getFila().getTotal()) {
                menorFila = caixa;
            }
        }
        return menorFila;
    }

    /**
     * Atende os clientes nos caixas.
     * Cada caixa atende um cliente por vez e decrementa o tempo de atendimento restante.
     */
    public void atenderClientes() {
        Caixa[] caixasAux = caixas.getElementos(Caixa.class);
        for (Caixa caixa : caixasAux) {
            caixa.atenderCliente();
            caixa.decrementarTempo();
        }
    }

    /**
     * Exibe o status atual de todos os caixas no supermercado.
     * Mostra o cliente atual, o tempo restante de atendimento e a fila de espera.
     */
    public void exibirStatus() {
        Caixa[] caixasAux = caixas.getElementos(Caixa.class);
        for (Caixa caixa : caixasAux) {
            System.out.println("Caixa " + caixa.getId() + ":");
            System.out.println("Cliente Atual: " + (caixa.getClienteAtual() != null ? caixa.getClienteAtual().getNome() : "Nenhum"));
            System.out.println("Tempo Restante: " + caixa.getTempoRestante());
            System.out.print("Fila: ");
            Cliente[] clientes = caixa.getFila().getElementos(Cliente.class);
            for (int j = 0; j < clientes.length; j++) {
                Cliente cliente = clientes[j];
                System.out.print(cliente.getNome() + " (" + cliente.getTempoEspera() + " minutos) | ");
            }
            System.out.println("\n");
        }
    }
}
