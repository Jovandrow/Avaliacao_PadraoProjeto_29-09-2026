public class NfsE implements ComprovanteFiscal {
    public String emitir(double valor) {
        return String.format("NFS-e | ISS 5%%: R$ %.2f", valor * 0.05);
    }
}
