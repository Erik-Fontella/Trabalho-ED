package Questao12;
import java.util.Date;

public class Locacao implements Comparable<Locacao> {
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private Date dataInicio;
    private Date dataFim;

    public Locacao(int id, Cliente cliente, Veiculo veiculo, Date dataInicio, Date dataFim) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

        cliente.getLocacoesAtivas().addOrdenado(this);
        veiculo.getLocacoesAtivas().addOrdenado(this);
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void encerrarLocacao() {
        cliente.getLocacoesAtivas().remove(this);
        veiculo.getLocacoesAtivas().remove(this);
    }

    @Override
    public int compareTo(Locacao other) {
        return Integer.compare(this.id, other.id);
    }
}
    