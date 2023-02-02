import java.util.Scanner;

public class Resto2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        numero = entrada.nextInt();

        for (int i = 0; i < 10000; i ++){

            if(i % numero == 2){
                System.out.println(i);
            }
        }


    }
}
