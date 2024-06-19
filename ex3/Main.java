import java.util.Random;
import java.util.random.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Lista lista = new LDE();
        for (int i = 0; i < 10; i++) {
            lista.insereFim(rand.nextInt(100));
        }
        lista.imprimeLista();
        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Nro de pares: " + lista.nroPares());
    }
}
