import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidade = 0;

        for(int i = 1; i <= 6; i ++){

           double numero = entrada.nextDouble();

           if(numero > 0){

              quantidade ++;

           }

        }

        System.out.println(quantidade + " valores positivos");

    }
}
