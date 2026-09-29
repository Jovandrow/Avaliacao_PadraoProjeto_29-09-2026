public class FaturaIva implements ComprovanteFiscal {
    public String emitir(double valor) {
        return String.format("Fatura | IVA 6%%: € %.2f", valor * 0.06);
    }
}
