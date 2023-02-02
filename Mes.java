import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o mês: ");
        int mes = entrada.nextInt();

        String mesPorExtenso =  switch(mes){
             case 1 -> "January";
            case 2 -> "February";
            case 3 ->   "March";
            case 4 ->  "April";
            case 5 ->  "May";
            case 6 ->  "June";
            case 7 ->  "July";
            case 8 ->  "Aug";
            case 9 ->  "September";
            case 10 ->  "October";
            case 11 ->  "November";
            case 12 ->  "December";

            default -> "Mês inválido";

         };

    }
}
