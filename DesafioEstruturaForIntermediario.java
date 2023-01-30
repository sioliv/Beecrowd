import java.util.Scanner;

public class DesafioEstruturaForIntermediario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        int quantidadeDivisiveis = 0;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        for(int i = 1; i <= numero; i++) {
            if (numero % i == 0) {

                quantidadeDivisiveis++;
            }

        }

        if (quantidadeDivisiveis == 2) {
            System.out.println("Numero Primo!!");
        } else  {
            System.out.println("Numero não é primo");
        }

        entrada.close();

    }

}
