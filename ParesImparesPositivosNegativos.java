import java.util.Scanner;

public class ParesImparesPositivosNegativos {

    public static void main(String[] args) {

        Scanner  entrada = new Scanner(System.in);

        int  numero;
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        int quantidadeNegativo = 0;
        int quantidadePositivo = 0;

        for (int i =0; i < 5; i ++){
            numero =  entrada.nextInt();
            if(numero %2 ==  0){
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }

            if (numero >= 1){
                quantidadePositivo++;
            } else {
                quantidadeNegativo++;

            }
        }
        System.out.println(quantidadePar + " valor(es) par(es)");
        System.out.println(quantidadeImpar + " valor(es) impar(es)");
        System.out.println(quantidadePositivo + " valor(es) positivo(s)");
        System.out.println(quantidadeNegativo + " valor(es) negativos(s)");


    }
}
