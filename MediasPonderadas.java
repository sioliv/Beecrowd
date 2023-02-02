import java.util.Scanner;

public class MediasPonderadas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;

        N = entrada.nextInt();

        for ( int i = 1; i <= N; i++){

            double primeiroValor = entrada.nextDouble();
            double segundoValor = entrada.nextDouble();
            double terceiroValor = entrada.nextDouble();

            double mediaPonderada = (primeiroValor * 2 + segundoValor * 3 + terceiroValor *5) / 10;

            System.out.printf("%.1f\n", mediaPonderada);

        }




    }
}
