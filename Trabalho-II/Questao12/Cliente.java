package Questao12;
public class Cliente implements Comparable<Cliente> {
    private int id;
    private String nome;
    private Tad_Lde<Locacao> locacoesAtivas;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.locacoesAtivas = new Tad_Lde<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Tad_Lde<Locacao> getLocacoesAtivas() {
        return locacoesAtivas;
    }

    public boolean hasActiveLocacoes() {
        return locacoesAtivas.tamanho() > 0;
    }

    @Override
    public int compareTo(Cliente other) {
        return Integer.compare(this.id, other.id);
    }
}
