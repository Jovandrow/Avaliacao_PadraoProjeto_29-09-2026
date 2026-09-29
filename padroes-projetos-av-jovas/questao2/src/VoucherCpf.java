public class VoucherCpf implements Voucher {
    public String gerar(String hospede, String documento) {
        return "Voucher | hóspede: " + hospede + " | CPF: " + documento;
    }
}
