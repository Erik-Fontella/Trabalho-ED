package Questao6;
// Implemente um método que concatene duas listas duplamente
// encadeadas de números inteiros. Por exemplo, dada a LDE [1,2,3,4] e outra LDE
// [5,6,7, 8], o resultado será uma nova LDE resultante da concatenação das duas
// anteriores [1,2,3,4,5,6,7,8]. O protótipo é o seguinte:
// public void concat(LDE l);
public class Main {
    public static void main(String[] args) {
        Tad_Lde lista1 = new Tad_Lde();
        Tad_Lde lista2 = new Tad_Lde();
        
        lista1.insereInicio(1);
        lista1.insereInicio(2);
        lista1.insereInicio(3);
        lista1.insereInicio(4);
        lista1.insereFim(5);

        lista2.insereInicio(6);
        lista2.insereInicio(7);
        lista2.insereFim(8);

        lista1.concatena(lista2);

        lista1.imprimeLista();
    }
}
