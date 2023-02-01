public class Calculadora {

    static double calcularMedia(int[] numeros){
        int total = 0;

        //numeros.fori
        //itero com quantidade de vezes definida
        //ou percorro um array de forma inversa
        //se eu preciso do índice
        //utilizo esse(for tradicional)
        /*for(int i = 0; i < numeros.length; i++){

            total += numeros[i];

        }*/

        //forEach é melhor para array
        //pois percorro todos os elementos de um array
        //qual variavel vou atribuir o valor do elemento : de qual array
        for (int numero : numeros) {
            total += numero;

        }

        return (double) total / numeros.length;
    }
}
