// Abstract Factory: uma fábrica por país cria a família completa
public interface FabricaPais {
    ComprovanteFiscal criarComprovante();
    Pagamento criarPagamento();
    Voucher criarVoucher();
}
