// Cliente: só conhece abstrações, sem if/switch por país
public class ConfirmacaoReserva {
    private final FabricaPais fabrica;

    public ConfirmacaoReserva(FabricaPais fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(String hospede, String documento, double valor) {
        ComprovanteFiscal fiscal = fabrica.criarComprovante();
        Pagamento pagamento = fabrica.criarPagamento();
        Voucher voucher = fabrica.criarVoucher();

        System.out.println("Comprovante: " + fiscal.emitir(valor));
        System.out.println("Pagamento:   " + pagamento.processar(valor));
        System.out.println("Voucher:     " + voucher.gerar(hospede, documento));
        System.out.println();
    }
}
