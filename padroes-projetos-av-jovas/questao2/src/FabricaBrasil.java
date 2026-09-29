public class FabricaBrasil implements FabricaPais {
    public ComprovanteFiscal criarComprovante() { return new NfsE(); }
    public Pagamento criarPagamento()           { return new PagamentoPix(); }
    public Voucher criarVoucher()               { return new VoucherCpf(); }
}
