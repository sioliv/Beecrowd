package precificacao;

public class ServicoDePrecificacao {

    //assinatura do método
    void definirPrecoVenda (Produto produto, double percentualMargemLucro) {
        //poderia ter cálculos muito mais complexos aqui

        double precoVendaCalculado = MatematicaUtil.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVendaCalculado = precoVendaCalculado;
    }


}
