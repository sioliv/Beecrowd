package precificacao;

public class Produto {

    //custo de embalagem é unico (fixo). É uma variável global.
    //nao é mais uma variável de instância, quando atribuo static
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

    //bons candidatos para os tornar métodos estáticos
    //não precisa de uma instância para invocar os métodos
    //posso invocar diretamente na classe

    void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem; // referenciar a v ariavel estatica, chamo a classe depois a variável
    }

    void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem %.2f%n", custoEmbalagem);
    }
}
