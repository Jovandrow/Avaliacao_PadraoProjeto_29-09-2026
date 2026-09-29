import java.util.List;

public class EmprestimoConsignado implements Emprestimo {
    public String modalidade() { return "Crédito Consignado"; }
    public double taxaPrimeiroMes() { return 0.018; }
    public List<String> documentos() {
        return List.of("contracheque ou extrato de benefício");
    }
}
