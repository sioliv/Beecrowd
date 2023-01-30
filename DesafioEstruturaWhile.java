import java.util.Scanner;

public class DesafioEstruturaWhile {

    public static void main(String[] args) {

        /*
        Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma todos os números informados.

        O programa deve parar de solicitar mais números e imprimir a soma deles na saída apenas quando o valor total somado for igual ou superior a 100.
         */

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        while (soma < 100){
            System.out.println("Digite os números: ");
             int numero = entrada.nextInt();

             soma+= numero;
        }

        System.out.println(soma);

    }
}
