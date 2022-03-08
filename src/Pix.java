public class Pix implements Pagamento{
    @Override
    public Double formaPagamanto(Double valor, int qtd) {
        return qtd * valor;
    }

}
