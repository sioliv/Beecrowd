import java.util.Scanner;

public class QuadradoDePares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        for(int i = 1; i <= numero; i++) {

            if(i % 2 == 0) {

                System.out.println(i + "^2 = "+  (i * i));

            }
        }
    }
}
