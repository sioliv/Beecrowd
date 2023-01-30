package precificacao;

public class Principal {

    public static void main(String[] args) {

        Produto.custoEmbalagem = 10;

        Produto novoProduto = new Produto();
        //novoProduto.precoCusto = 100;

        novoProduto.alterarPrecoCusto(100);

        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVendaCalculado);
        System.out.printf("Preço de Custo: %.2f%n", novoProduto.precoCusto);

    }


}
