import java.util.Scanner;

public class SeisNumerosImpares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        numero = entrada.nextInt();

        int cont = 0;

        while (cont < 6) {

            if (numero % 2 != 0) {

                cont++;

                System.out.println(numero);

            }
            numero++;

        }
    }
}
