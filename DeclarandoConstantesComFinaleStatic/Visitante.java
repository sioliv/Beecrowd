package DeclarandoConstantesComFinaleStatic;

public class Visitante {

    static final int IDADE_MINIMA = 18;

    int idade;
    String nome;


    boolean verificandoPermissaoEntrada(){
       return idade >= IDADE_MINIMA ;
    }

    public void permitindoAcesso(){
        String verificando = verificandoPermissaoEntrada() ? "Entrada Permitida"
                : "Entrada Proibida";
        System.out.println("Entrada: " + verificando);
    }

}
