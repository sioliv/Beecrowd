import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = entrada.nextInt();

        for(int i =1; i <= numero;  i ++){

            if(i %2 != 0){

                System.out.println(i);
            }

        }



    }
}
