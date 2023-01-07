import java.util.Scanner;

public class DesafioEstruturaDoWhile {

    public static void main(String[] args) {
        /*
        Escreva um programa que solicita números inteiros para o usuário de forma "infinita",
        até que o usuário escolha não digitar mais nenhum número (pergunte ao usuário após informar cada número).

        Some todos os números ímpares e todos os números pares e imprima na saída o resultado.

        Entrada: numeros inteiros de forma infinita

         */

        Scanner entrada = new Scanner(System.in);

        int somaImpar = 0;
        int somaPar = 0;
        boolean desejaDigitarNumero;
        do {

            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();
            System.out.println("Deseja digitar mais um número? ");
            desejaDigitarNumero = entrada.nextBoolean();

            if(!desejaDigitarNumero){

                break;

            } else {

                if(numero %2 != 0){
                    somaImpar += numero;
                } else {
                    somaPar += numero;
                }
            }

        } while(true);

        System.out.println("Soma dos números impares: "+somaImpar);
        System.out.println("Soma dos números pares: " +somaPar);

    }
}
