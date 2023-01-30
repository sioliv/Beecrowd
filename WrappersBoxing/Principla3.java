package WrappersBoxing;

public class Principla3 {

    public static void main(String[] args) {
        // mesma coisa de fazer: Integer.valueOf();
        Integer numero1 = 128;
        Integer numero2 = 128;
        Short numero3 = 128;

        //quando faço a comparacao do valor da variável
        // não estou comparando o conteúdo do objeto
        // comparo o endereço de memória
        //integer cache armazena o menor numero -128 e o maior é 127
        // quando fazemos o autoboxing, chama o integer.valueof
        // uma unidade a mais ele não entra no cache.
        //o numero 2 referenciou outro objeto.
        // por isso retornou false.
        System.out.println(numero1.equals(numero2));
        System.out.println(numero1.equals(numero3));
    }
}
