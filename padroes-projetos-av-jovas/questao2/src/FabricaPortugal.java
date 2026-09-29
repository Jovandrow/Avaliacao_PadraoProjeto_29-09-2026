public class FabricaPortugal implements FabricaPais {
    public ComprovanteFiscal criarComprovante() { return new FaturaIva(); }
    public Pagamento criarPagamento()           { return new PagamentoMbWay(); }
    public Voucher criarVoucher()               { return new VoucherNif(); }
}
