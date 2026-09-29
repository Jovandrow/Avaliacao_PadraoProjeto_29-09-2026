public class VoucherNif implements Voucher {
    public String gerar(String hospede, String documento) {
        return "Voucher | hóspede: " + hospede + " | NIF: " + documento;
    }
}
