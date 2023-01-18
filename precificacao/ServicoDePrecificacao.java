package precificacao;

public class ServicoDePrecificacao {

    //assinatura do método
    void definirPrecoVenda (Produto produto, double percentualMargemLucro) {
        //poderia ter cálculos muito mais complexos aqui

        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVendaCalculado = precoVendaCalculado;
    }


}
