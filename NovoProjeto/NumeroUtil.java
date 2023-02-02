package NovoProjeto;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumeroUtil {

    //Descobrir maior número, dados 2 números inteiros como parâmetros

    //Esta classe deve ter métodos estáticos para resolver as seguintes questões:cx zx
    // Entrada: 2 números inteiros
    //Saida: Descobrir qual maior numero

    //Descobrir maior número, dados 3 números inteiros como parâmetros
    //entrada: 3 numeros inteiros
    //saida: Descobrir maior numero


    //Descobrir maior número, dados 2 números decimais (double) como parâmetros

    static double maiorNumero(double n1, double n2){
        double maiorNumero = n1 > n2 ? n1 : n2;
        return maiorNumero;
    }

    static int maiorNumero(int n1, int n2){

        int MaiorNumero = n1 > n2 ? n1 : n2;

        return MaiorNumero;
    }

    static double maiorNumero(double n1, double n2, double n3){
        double maiorNumero = 0;
        if(n1 > n2 && n1 > n3 ){
            maiorNumero = n1;
        } else if (n2 > n1 && n2 > n3){
            maiorNumero = n2;
        } else {
            maiorNumero = n3;
        }

        return maiorNumero;
    }


    static int maiorNumero(int n1, int n2, int n3){

        int maiorNumero = 0;

        if(n1 > n2  && n1 > n3){
           maiorNumero = n1;
        } else if(n2 > n1 && n2 > n3){
            maiorNumero = n2;
        } else {
           maiorNumero = n3;
        }

        return maiorNumero;
    }

}
