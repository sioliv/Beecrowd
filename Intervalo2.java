import java.util.Scanner;

public class Intervalo2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int quantidade = 0;
        int quantidadeOut =  0;
        int numero = entrada.nextInt();

        for (int i = 1; i <=numero; i++){
            int valor = entrada.nextInt();

            int validacao =  valor >= 10 && valor <= 20 ? quantidade ++ : quantidadeOut ++;

        }
        System.out.println(quantidade + " in");
        System.out.println(quantidadeOut + " out");
    }
}
