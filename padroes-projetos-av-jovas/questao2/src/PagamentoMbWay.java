public class PagamentoMbWay implements Pagamento {
    public String processar(double valor) {
        return String.format("MB WAY | valor: € %.2f", valor);
    }
}
