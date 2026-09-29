public class PagamentoPix implements Pagamento {
    public String processar(double valor) {
        return String.format("Pix | valor: R$ %.2f", valor);
    }
}
