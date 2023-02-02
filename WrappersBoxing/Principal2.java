package WrappersBoxing;

public class Principal2 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

       cliente.idade = 20;
       Integer diasEntrega =  30;

       // Não precisa!! pois o tipo primitivo é convertido automatica
        //mente. É o autounbox
       int diasEntregaInt = diasEntrega.intValue();

       Short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());
       Long diasEntregaLong =  Long.valueOf(diasEntrega.longValue());
        System.out.printf("Idade: %d%n", cliente.idade);

        System.out.printf("Dias entrega: %d%n ", diasEntrega );

    }

}
