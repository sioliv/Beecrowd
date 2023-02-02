import java.util.Scanner;

public class ParesEntrecincoNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int quantidade =0;

        for(int i = 0; i < 5; i++){

            numero  = entrada.nextInt();
             if(numero % 2 == 0){
                 quantidade++;
             }
        }
        System.out.println(quantidade + " valores pares");
    }
}
