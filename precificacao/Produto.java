package precificacao;

public class Produto {

    //custo de embalagem é unico (fixo). É uma variável global.
    // ao atribuir static, a variável pertence a classe produto.
    //O custo embalagem é da classe e não do objeto
    static double custoEmbalagem;
    double precoCusto;
    double precoVendaCalculado;

    void alterarPrecoCusto(double precoCusto){
        //alterando o precoCusto do parâmetro
        //this. Estou referenciando ao parâmetro da instancia do método, no objeto produto.
         this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem %.2f%n", custoEmbalagem);
    }
}
