import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;

        N = entrada.nextInt();

        for(int i = 0; i < N; i++){
             int X = entrada.nextInt();

             if(X ==  0){
                 System.out.println("NULL");
             } else if( X % 2 != 0 && X > 0){
                 System.out.println("ODD POSITIVE");
             } else if ( X % 2 != 0 && X < 0){
                 System.out.println("ODD NEGATIVE");
             } else if (X % 2 ==  0 && X < 0){
                 System.out.println("EVEN NEGATIVE");
             } else if (X % 2 == 0 && X > 0) {
                 System.out.println("EVEN POSITIVE");
             }
        }

    }
}
