package Questao12;

import java.util.Date;

public class SistemaLocacao {
    private Tad_Lde<Cliente> clientes;
    private Tad_Lde<Veiculo> veiculos;
    private Tad_Lde<Locacao> locacoes;

    public SistemaLocacao() {
        this.clientes = new Tad_Lde<>();
        this.veiculos = new Tad_Lde<>();
        this.locacoes = new Tad_Lde<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.addOrdenado(cliente);
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.addOrdenado(veiculo);
    }

    public void adicionarLocacao(Locacao locacao) {
        locacoes.addOrdenado(locacao);
    }

    public boolean removerCliente(Cliente cliente) {
        if (cliente.hasActiveLocacoes()) {
            return false; // Não pode remover, pois há locações ativas
        }
        return clientes.remove(cliente);
    }

    public boolean removerVeiculo(Veiculo veiculo) {
        if (veiculo.hasActiveLocacoes()) {
            return false; // Não pode remover, pois há locações ativas
        }
        return veiculos.remove(veiculo);
    }

    public void encerrarLocacao(Locacao locacao) {
        locacao.encerrarLocacao();
        locacoes.remove(locacao);
    }

    public void imprimeClientes() {
        clientes.imprimeLista();
    }

    public void imprimeVeiculos() {
        veiculos.imprimeLista();
    }

    public void imprimeLocacoes() {
        locacoes.imprimeLista();
    }
}
