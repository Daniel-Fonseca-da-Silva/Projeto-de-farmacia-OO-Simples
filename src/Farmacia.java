import java.math.BigDecimal;

public class Farmacia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fulano", 30, 12345, "xFH261", "000-000-000-00", 500.00);
        System.out.println(cliente);

        Produto produto = new Produto("Produto", "Generica", "Nacional", "PG2", 4, new BigDecimal("25.95"));

        Pix pix = new Pix();
        Frete frete = new Frete();
        Desconto desconto = new Desconto();

        Double freteProduto = frete.calculaFrete(Estados.RJ);

        Double produtoForma = pix.formaPagamanto(produto.getPreco().doubleValue(), produto.getQuantidade());
        System.out.println("Produto preço sem desconto: " + produtoForma + " R$");
        System.out.println("Frete: " + freteProduto + " R$");
        System.out.printf("Produto com frete: " + "%.2f", produtoForma + freteProduto, "R%");
        System.out.printf("\nDesconto 10 por cento aplicado ao produto: " + "%.2f", desconto.descontoAcimaDeCem(produtoForma));
    }

}
