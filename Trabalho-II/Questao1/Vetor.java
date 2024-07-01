public class Vetor implements Ivetor {
    private int[] vetor;
    private int tamanho;
    private int capacidade;

    /*
     * Inicializa um vetor com capacidade definida
     * 
     * @param capacidade
     */
    public Vetor(int capacidade) {
        this.vetor = new int[capacidade];
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    /*
     * Insere um valor no vetor
     * 
     * @param valor
     */
    public void insere(int valor) {
        if (this.tamanho < this.capacidade) {
            this.vetor[this.tamanho] = valor;
            this.tamanho++;
        }
    }

    /*
     * Remove um valor do vetor
     * 
     * @param valor
     */
    public void remove(int valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.vetor[i] == valor) {
                for (int j = i; j < this.tamanho - 1; j++) {
                    this.vetor[j] = this.vetor[j + 1];
                }
                this.tamanho--;
                break;
            }
        }
    }

    /*
     * Verifica se o vetor contem um valor
     * 
     * @param valor
     */
    public boolean contem(int valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    /*
     * Altera um valor do vetor
     * 
     * @param posicao
     * 
     * @param valor
     */
    public int altera(int posicao, int valor) {
        if (posicao >= 0 && posicao < this.tamanho) {
            this.vetor[posicao] = valor;
            return 1;
        }
        return -1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int capacidade() {
        return this.capacidade;
    }

    public int elemento(int posicao) {
        if (posicao >= 0 && posicao < this.tamanho) {
            return this.vetor[posicao];
        }
        return -1;
    }

    /*
     * Retorna a intersecao entre dois vetores
     * 
     * @param vetor
     * 
     * @return Vetor
     */
    public Vetor getIntersecao(Vetor vetor) {
        Vetor intersecao = new Vetor(this.tamanho);
        for (int i = 0; i < this.tamanho; i++) {
            if (vetor.contem(this.vetor[i])) {
                intersecao.insere(this.vetor[i]);
            }
        }
        // int[] intersecaoReal = new int[tamanhoIntersecao];
        Vetor intersecaoReal = new Vetor(intersecao.tamanho());
        for (int i = 0; i < intersecao.tamanho; i++) {
            intersecaoReal.insere(intersecao.vetor[i]);
        }
        return intersecaoReal;
    }

    /*
     * Imprime o vetor
     */
    public void imprime() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(" - " + this.vetor[i]);
        }
        System.out.println("");
    }
}