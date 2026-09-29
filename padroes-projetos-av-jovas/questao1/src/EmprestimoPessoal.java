import java.util.List;

public class EmprestimoPessoal implements Emprestimo {
    public String modalidade() { return "Crédito Pessoal"; }
    public double taxaPrimeiroMes() { return 0.035; }
    public List<String> documentos() {
        return List.of("documento de identidade", "comprovante de renda");
    }
}
