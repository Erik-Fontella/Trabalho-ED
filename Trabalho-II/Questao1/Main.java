import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Vetor vetor = new Vetor(5);
        for (int i = 0; i < 5; i++) {
            vetor.insere(random.nextInt(10));
        }
        vetor.imprime();
        Vetor vetor2 = new Vetor(5);
        for (int i = 0; i < 5; i++) {
            vetor2.insere(random.nextInt(10));
        }
        vetor2.imprime();
        Vetor intersecao = vetor.getIntersecao(vetor2);
        intersecao.imprime();
    }
}
