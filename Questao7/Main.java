import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LSE lista = new LSE();
        for (int i = 0; i < 10; i++) {
            lista.adicionarFim(random.nextInt(100));
        }
        lista.exibir();
        lista.ordenarBolha();
        lista.exibir();

    }
}
