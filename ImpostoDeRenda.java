import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double renda  = entrada.nextDouble();

        String impostoDevido;

        switch ((int) renda){

        }

        if (renda <= 2000.00){

            System.out.println("Isento");

        } else if (renda >= 2000.01 && renda <= 3000.00){

            System.out.println(String.format("R$ %.2f", (renda - 2000) * 0.08));

        } else if (renda >= 3000.01 && renda <= 4500.00 ){

            System.out.println(String.format("R$ %.2f", ((renda - 3000)  * 0.18) + 80));

        } else {

            System.out.println(String.format("R$ %.2f", ((renda - 4500) * 0.28) + 350));
        }
    }
}
