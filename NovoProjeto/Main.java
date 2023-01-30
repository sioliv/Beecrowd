package NovoProjeto;

public class Main {

    public static void main(String[] args) {

        System.out.println("Maior numero entre dois números: "
                + NumeroUtil.maiorNumero(2, 20));
        System.out.println("Maior numero entre três números: "
                + NumeroUtil.maiorNumero(2, 75, 99));
        System.out.println("Maior numero  double entre dois numeros: "
        +NumeroUtil.maiorNumero(11.22, 22.11));
        System.out.println("Maior numero double entre três números: "
        +NumeroUtil.maiorNumero(44.55, 2332.23, 1.0));
    }
}
