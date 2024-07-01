import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Supermercado {
    private List<Caixa> caixas;
    private int proximoIdCliente;
    private Random random;

    public Supermercado(int numeroDeCaixas, int tamanhoFila) {
        this.caixas = new ArrayList<>();
        for (int i = 0; i < numeroDeCaixas; i++) {
            caixas.add(new Caixa(i, tamanhoFila));
        }
        this.proximoIdCliente = 1;
        this.random = new Random();
    }

    public void simularChegadaCliente() {
        int chance = random.nextInt(100);
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

    public Caixa escolherCaixaComMenorFila() {
        Caixa menorFila = caixas.get(0);
        for (Caixa caixa : caixas) {
            if (caixa.getFila().getTotal() < menorFila.getFila().getTotal()) {
                menorFila = caixa;
            }
        }
        return menorFila;
    }

    public void atenderClientes() {
        for (Caixa caixa : caixas) {
            caixa.atenderCliente();
            caixa.decrementarTempo();
        }
    }

    public void exibirStatus() {
        for (Caixa caixa : caixas) {
            System.out.println("Caixa " + caixa.getId() + ":");
            System.out.println("Cliente Atual: " + (caixa.getClienteAtual() != null ? caixa.getClienteAtual().getNome() : "Nenhum"));
            System.out.println("Tempo Restante: " + caixa.getTempoRestante());
            System.out.print("Fila: ");
            for (int i = 0; i < caixa.getFila().getTotal(); i++) {
                Cliente cliente = caixa.getFila().getElementos()[(caixa.getFila().getInicio() + i) % caixa.getFila().getTamanho()];
                System.out.print(cliente.getNome() + " (" + cliente.getTempoEspera() + " minutos) ");
            }
            System.out.println("\n");
        }
    }
}
