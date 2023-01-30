import java.util.Scanner;

// entrada : 10 numeros
// Caso um número ímpar seja informado, ignore e solicite um novo número ao usuário.
//Saida: soma dos números digitados

public class DesafioEstruturaFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        int soma = 0;

        for(int i = 1; i <= 10; i++){

            System.out.printf("Digite " + i + " º número" +
                    ": ");
            int numero = entrada.nextInt();

            if(numero % 2 != 0){
                System.out.println("Digite um número par");
                i--;

            } else {
                soma = soma +numero;
            }

        }
        System.out.println("A soma dos números digitados é: " +soma);

    }
}
