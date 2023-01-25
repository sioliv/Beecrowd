package DeclarandoConstantesComFinaleStatic;

public class Principal {

    public static void main(String[] args) {
        Visitante visitante = new Visitante();
        visitante.idade = 10;
        visitante.permitindoAcesso();

        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Magalhaes";
        novoVisitante.idade = 22;
        novoVisitante.permitindoAcesso();

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 2);
    }
}
