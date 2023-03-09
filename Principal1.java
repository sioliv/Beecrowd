import java.util.Arrays;

public class Principal1 {
    public static void main(String[] args) {

        int[] notas = {8,5,4,9,10};

        String notasEmString = Arrays.toString(notas);
        double media = Calculadora.calcularMedia(notas);
        System.out.println(media);
        System.out.println(notasEmString);

    }
}
