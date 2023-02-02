import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        int valor = entrada.nextInt();


        for(int i = 1; i <= 10; i++){

            System.out.println(i + " x " + valor + " = " + i * valor);

        }

    }
}
