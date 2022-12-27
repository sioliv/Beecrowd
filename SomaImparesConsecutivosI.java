import java.util.Scanner;

public class SomaImparesConsecutivosI {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int X = 6;

        int Y = -5;

        int min, max;

        if( X > Y){
            min = Y;
            max = X;
        } else {
            min = X;
            max = Y;
        }
        int soma = 0;
        for(int i = min +1; i < max; i++){

            if(i %2 != 0){

                soma = soma + i;
            }
        }

        System.out.println(soma);
    }
}
