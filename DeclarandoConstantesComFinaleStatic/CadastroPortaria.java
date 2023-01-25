package DeclarandoConstantesComFinaleStatic;

public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante){
        //Essa instância
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }

    void cadastrar(Visitante visitante, final int tempoExpiracao){
        
        final var tempoExpiracaoEmDias = tempoExpiracao * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome,
                tempoExpiracaoEmDias);
    }
}
