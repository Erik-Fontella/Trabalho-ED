/**
 * Classe que representa um cliente em um supermercado.
 */
public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String carrinho;
    private int tempoEspera;

    /**
     * Construtor da classe Cliente.
     *
     * @param id          O identificador do cliente.
     * @param nome        O nome do cliente.
     * @param idade       A idade do cliente.
     * @param carrinho    A descrição do carrinho do cliente.
     * @param tempoEspera O tempo de espera do cliente no caixa.
     */
    public Cliente(int id, String nome, int idade, String carrinho, int tempoEspera) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.carrinho = carrinho;
        this.tempoEspera = tempoEspera;
    }

    /**
     * Retorna o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a idade do cliente.
     *
     * @return A idade do cliente.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Retorna o identificador do cliente.
     *
     * @return O identificador do cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna a descrição do carrinho do cliente.
     *
     * @return A descrição do carrinho do cliente.
     */
    public String getCarrinho() {
        return carrinho;
    }

    /**
     * Retorna o tempo de espera do cliente no caixa.
     *
     * @return O tempo de espera do cliente.
     */
    public int getTempoEspera() {
        return tempoEspera;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome O novo nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define a idade do cliente.
     *
     * @param idade A nova idade do cliente.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Define a descrição do carrinho do cliente.
     *
     * @param carrinho A nova descrição do carrinho do cliente.
     */
    public void setCarrinho(String carrinho) {
        this.carrinho = carrinho;
    }

    /**
     * Define o tempo de espera do cliente no caixa.
     *
     * @param tempoEspera O novo tempo de espera do cliente.
     */
    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }
}
