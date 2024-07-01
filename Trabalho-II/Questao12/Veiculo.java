package Questao12;
public class Veiculo implements Comparable<Veiculo> {
    private int id;
    private String modelo;
    private Tad_Lde<Locacao> locacoesAtivas;

    public Veiculo(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.locacoesAtivas = new Tad_Lde<>();
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public Tad_Lde<Locacao> getLocacoesAtivas() {
        return locacoesAtivas;
    }

    public boolean hasActiveLocacoes() {
        return locacoesAtivas.tamanho() > 0;
    }

    @Override
    public int compareTo(Veiculo other) {
        return Integer.compare(this.id, other.id);
    }
}
