import java.util.Scanner;

public class MaiorEPosicao {

    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);

       int maior = 0;
       int posicao = 0;

       for(int i = 1; i <= 100; i ++){

           int valor = entrada.nextInt();

           if(maior > valor){

               maior = maior;
               posicao = posicao;

           } else {
               maior = valor;
               posicao = i;
           }

           System.out.println(maior + "\n" + posicao + "\n");

       }

    }
}
