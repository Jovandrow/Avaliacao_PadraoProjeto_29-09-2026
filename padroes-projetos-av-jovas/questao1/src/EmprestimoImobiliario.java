import java.util.List;

public class EmprestimoImobiliario implements Emprestimo {
    public String modalidade() { return "Crédito Imobiliário"; }
    public double taxaPrimeiroMes() { return 0.008; }
    public List<String> documentos() {
        return List.of("matrícula do imóvel", "comprovante de renda");
    }
}
