import javax.crypto.spec.PSource;
import java.util.Scanner;

public class DesafioWhileIntermediario {

    public static void main(String[] args) {

        /*
        Escreva um programa que solicita um número inteiro para o usuário e imprime na saída o número com os dígitos invertidos.

        Por exemplo, se o número digitador for 98765, a saída deve ser 56789.

        Este é um exercício intermediário, especialmente porque precisará usar suas habilidades em lógica.

        É possível fazer isso apenas com um loop e cálculos matemáticos.
         */


        Scanner entrada = new Scanner(System.in);

        int numero;
        int resto;
        int numeroInvertido = 0;


        System.out.println("Digite o número: ");
        numero = entrada.nextInt();
        while(numero > 0){

            resto = numero %  10;

            numeroInvertido  = (numeroInvertido * 10) + resto;
            numero = numero / 10;

        }
        System.out.println("Numero Invertido " +numeroInvertido);

    }
}
