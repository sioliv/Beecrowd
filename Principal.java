public class Principal {
    public static void main(String[] args) {

        //int[] notas = new int[]{8, 5, 4, 9, 10};

        int[] notas = {8,5,4,9,10};

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        System.out.println(notas[4]);

        int totalNotas = notas[0] + notas[1] + notas[3]
                + notas[4];
        System.out.println(totalNotas);

        double soma = 0;
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
            soma  = soma + notas[i];

        }


         int posicao = 2;
        System.out.println(notas[posicao-1]);

    }
}
