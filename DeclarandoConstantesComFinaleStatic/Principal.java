package DeclarandoConstantesComFinaleStatic;

public class Principal {

    public static void main(String[] args) {
        Visitante visitante = new Visitante();
        visitante.idade = 10;
        visitante.permitindoAcesso();

        var novoVisitante = new Visitante();
        novoVisitante.nome = "Magalhaes";
        novoVisitante.idade = 22;
        novoVisitante.permitindoAcesso();

        var cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 2);
    }
}
