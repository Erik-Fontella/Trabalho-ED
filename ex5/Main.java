import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LSE lista = new LSE();
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            lista.insereFinal(gerador.nextInt(100));
        }
        System.out.println("Iterativo:");
        lista.imprime();
        System.out.println("\nRecursivo:");
        lista.imprime_rec(lista.getInicio());
    }
}
