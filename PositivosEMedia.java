import java.util.Scanner;

public class PositivosEMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidade = 0;
        double media = 0;
        double numero;

        for(int i = 0; i < 6; i ++){
             numero = entrada.nextDouble();

            if(numero > 0){

                quantidade ++;
               media = media + numero;

            }



        }
        media = media / quantidade;

        System.out.println(quantidade + " valores positivos");

        System.out.println(String.format("%.1f", media));


    }
}
