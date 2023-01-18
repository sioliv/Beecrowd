package precificacao;

public class Produto {

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto){
        //alterando o precoCusto do parâmetro
        //this. Estou referenciando ao parâmetro da instancia do método, no objeto produto.
         this.precoCusto = precoCusto;
    }
}
