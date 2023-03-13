package Arrays;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        //Ordenando valores dentro de um array
        //Método que ajuda a fazer isto.
        int[] notas = {8, 5, 4, 10, 9};

        Arrays.sort(notas);

        System.out.println("Saida com números ordenados" + Arrays.toString(notas));
    }
}
